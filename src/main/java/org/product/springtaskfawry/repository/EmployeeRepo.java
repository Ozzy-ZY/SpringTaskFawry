package org.product.springtaskfawry.repository;

import org.product.springtaskfawry.model.Employee;

import java.util.Collection;

public interface EmployeeRepo {
    public boolean saveEmployee(Employee employee);
    public boolean updateEmployee(Employee employee);
    public void deleteEmployee(String Email);
    public Employee findEmployee(String Email);
    public Collection<Employee> findAllEmployee();
}
