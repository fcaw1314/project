package com.sky.service;

import com.sky.dto.EmployeeDTO;
import com.sky.dto.EmployeeLoginDTO;
import com.sky.dto.EmployeePageQueryDTO;
import com.sky.entity.Employee;
import com.sky.result.PageResult;

public interface EmployeeService {

    /**
     * 员工登录
     * @param employeeLoginDTO
     * @return
     */
    Employee login(EmployeeLoginDTO employeeLoginDTO);
/**
 * 新增员工
 * @param employeeDTO:
 * @return void
 * @author 23774
 * @description TODO
 * @date 2024/4/29 20:42
 */
    void save(EmployeeDTO employeeDTO);

    /**
     * 分页查询
     * @param employeePageQueryDTO:
     * @return PageResultA
     * @date 2024/5/4 22:55
     */
    PageResult pageQuery(EmployeePageQueryDTO employeePageQueryDTO);

    /**
     * @param status:
     * @param id:
     * @return void
     * @author yxb
     * @description 启用禁用员工账号
     * @date 2024/5/15 14:57
     */
    void startOrStop(Integer status, Long id);

    /**
     * @param id:
     * @return Employee
     * @author yxb
     * @description 根据id查询员工
     * @date 2024/6/8 16:45
     */
    Employee getById(Long id);

    /**
     * @param employeeDTO:
     * @return void
     * @author yxb
     * @description编辑员工信息
     * @date 2024/6/8 17:05
     */
    void update(EmployeeDTO employeeDTO);
}
