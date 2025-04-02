package com.gilon.basic.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMethod;

@RestController
@RequestMapping("/api/students")
public class StudentsController 
{
    @RequestMapping(value = "", method = RequestMethod.GET)
    public ResponseEntity<?> hello() 
    {
        return new ResponseEntity<>("Hello World!", HttpStatus.OK);
    }

}