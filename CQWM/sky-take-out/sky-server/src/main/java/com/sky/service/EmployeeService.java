package com.sky.service;

import com.sky.dto.EmployeeDTO;
import com.sky.dto.EmployeeLoginDTO;
import com.sky.entity.Employee;

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

}
