package com.edu.eduservice.controller;


import com.edu.eduservice.service.TblEmployeeService;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author guo
 * @since 2020-01-07
 */
@RestController
@RequestMapping("/eduservice/employee")
public class TblEmployeeController {
    @Resource
    public TblEmployeeService tblEmployeeService;
    @DeleteMapping("{id}")//spring4.1新增注解
    public boolean removeById(@PathVariable Double id){
        return tblEmployeeService.removeById(id);
    }
}

