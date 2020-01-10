package com.edu.eduservice.entity;

import com.baomidou.mybatisplus.annotation.*;

import java.util.Date;
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
@TableName("TBL_EMPLOYEE")
@ApiModel(value="TblEmployee对象", description="")
public class TblEmployee implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "ID", type = IdType.ID_WORKER)
    private Double id;

    @TableField("LAST_NAME")
    private String lastName;

    @TableField("EMAIL")
    private String email;

    @TableField("GENDER")
    private String gender;

    @TableField("AGE")
    private Double age;

    @TableField("CREATE_DATE")
    private Date createDate;

    @TableField("UPDATE_DATE")
    private Date updateDate;

    @TableField("VERSION")
    private Double version;

    @TableField("DELETED")
    @TableLogic
    private Double deleted;


}
