package com.sushil.batchprocessing.config;

import com.sushil.batchprocessing.employee.Employee;
import org.springframework.batch.item.ItemProcessor;
import org.springframework.context.annotation.Configuration;

//@Configuration
public class EmployeeProcessor implements ItemProcessor<Employee,Employee> {
    @Override
    public Employee process(Employee employee) throws Exception {
        return employee;
    }
}
