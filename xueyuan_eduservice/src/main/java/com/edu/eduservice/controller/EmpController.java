package com.edu.eduservice.controller;


import com.edu.eduservice.entity.Emp;
import com.edu.eduservice.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author guo
 * @since 2020-01-07
 */
@RestController
@RequestMapping("/eduservice/emp")
public class EmpController {
    @Autowired
    EmpService empService;
    @GetMapping
    public List<Emp> getAllEmp(){
       List<Emp> empList= empService.list(null);
        return empList;
    }
}

