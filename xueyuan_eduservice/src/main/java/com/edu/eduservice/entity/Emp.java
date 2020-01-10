package com.edu.eduservice.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import java.util.Date;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 
 * </p>
 *
 * @author guo
 * @since 2020-01-07
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("EMP")
@ApiModel(value="Emp对象", description="")
public class Emp implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "EMPNO", type = IdType.ID_WORKER_STR)
    private Integer empno;

    @TableField("ENAME")
    private String ename;

    @TableField("JOB")
    private String job;

    @TableField("MGR")
    private Integer mgr;

    @TableField("HIREDATE")
    private Date hiredate;

    @TableField("SAL")
    private Double sal;

    @TableField("COMM")
    private Double comm;

    @TableField("DEPTNO")
    private Integer deptno;


}
