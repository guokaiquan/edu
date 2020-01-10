package com.edu.eduservice.service.impl;

import com.edu.eduservice.entity.Emp;
import com.edu.eduservice.mapper.EmpMapper;
import com.edu.eduservice.service.EmpService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author guo
 * @since 2020-01-07
 */
@Service
public class EmpServiceImpl extends ServiceImpl<EmpMapper, Emp> implements EmpService {

}
