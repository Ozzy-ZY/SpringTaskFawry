package org.product.springtaskfawry.service;

import org.product.springtaskfawry.model.Employee;
import org.product.springtaskfawry.repository.EmployeeRepo;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class EmployeeService {
    private final EmployeeRepo employeeRepo;
    public EmployeeService(EmployeeRepo employeeRepo) {
        this.employeeRepo = employeeRepo;
    }
    public boolean saveEmployee(String name, String email, String phone, String department) {
        var employee = new org.product.springtaskfawry.model.Employee();
        employee.setName(name);
        employee.setEmail(email);
        employee.setPhone(phone);
        employee.setDepartment(department);
        return employeeRepo.saveEmployee(employee);
    }
    public boolean updateEmployee(String name, String email, String phone, String department) {
        var employee = new org.product.springtaskfawry.model.Employee();
        employee.setName(name);
        employee.setEmail(email);
        employee.setPhone(phone);
        employee.setDepartment(department);
        return employeeRepo.updateEmployee(employee);
    }
    public void deleteEmployee(String email) {
        employeeRepo.deleteEmployee(email);
    }
    public Employee findEmployee(String email) {
        return employeeRepo.findEmployee(email);
    }
    public Collection<Employee> findAllEmployee() {
        return employeeRepo.findAllEmployee();
    }
    public Collection<Employee> findEmployeeByDepartment(String department) {
        return employeeRepo
                .findAllEmployee()
                .stream()
                .filter(e -> e
                        .getDepartment()
                        .equals(department))
                .toList();
    }
}
