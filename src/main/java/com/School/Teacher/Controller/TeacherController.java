package com.School.Teacher.Controller;
import com.School.Teacher.Model.Teacher;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.concurrent.CopyOnWriteArrayList;

@RestController
@RequestMapping(value = "api/t1/Teacher")
public class TeacherController {



CopyOnWriteArrayList<Teacher> listOfTeacher = new CopyOnWriteArrayList<>(); //



    @PostMapping //create
    Teacher createTeacher(@RequestBody Teacher addTeacher){
        listOfTeacher.add(addTeacher);
        return new Teacher();
    }

    @GetMapping //GetAll
    List<Teacher> getEveryTeacherInfo(){
        return listOfTeacher;
    }


   @GetMapping(path = "{id}")
   Teacher getTeacherInfo(@PathVariable(name="id") String incomingId){ //
     Teacher currentTeacher = listOfTeacher.stream().filter((currTeacher)->{
            return currTeacher.id.equals(incomingId);
       }).findAny().get();
        return currentTeacher;

}


    @PutMapping(path = "{id}")
    Teacher updateTeacherInfo(@PathVariable(name="id") String incomingId, @RequestBody Teacher incomingupdateTeacher){
       Teacher currentTeacher =getTeacherInfo(incomingId);
        currentTeacher.name = incomingupdateTeacher.name;
       return new Teacher();
    }

    @DeleteMapping(path = "{id}")
    Teacher deleteTeacher(@PathVariable(name = "id")String id){
        Teacher currentTeacher = getTeacherInfo(id);
        listOfTeacher.remove(currentTeacher);
        return currentTeacher;

    }

}
