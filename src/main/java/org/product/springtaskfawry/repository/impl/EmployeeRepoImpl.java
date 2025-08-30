package org.product.springtaskfawry.repository.impl;

import org.product.springtaskfawry.model.Employee;
import org.product.springtaskfawry.repository.EmployeeRepo;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
@Repository
public class EmployeeRepoImpl implements EmployeeRepo {
    private HashMap<String, Employee> employeeMap = new HashMap<>();
    @Override
    public boolean saveEmployee(Employee employee) {
        var result = employeeMap.putIfAbsent(employee.getEmail(), employee);
        return result == null;
    }

    @Override
    public boolean updateEmployee(Employee employee) {
        employeeMap.put(employee.getEmail(), employee);
        return true;
    }

    @Override
    public void deleteEmployee(String Email) {
        employeeMap.remove(Email);
    }

    @Override
    public Employee findEmployee(String Email) {
        return employeeMap.get(Email);
    }

    @Override
    public Collection<Employee> findAllEmployee() {
        return employeeMap.values();
    }
}
