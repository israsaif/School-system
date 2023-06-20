package com.School.Teacher.Controller;

import com.School.Teacher.Model.Teacher;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "api/t1/Teacher")
public class TeacherController {
    @PostMapping
    Teacher createTeacher(@RequestBody Teacher createTeacher){
        return new Teacher();
    }

}
