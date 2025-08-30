package org.product.springtaskfawry.model;

public class Employee {
    private String name;
    private String email;
    private String phone;
    private String department;
    public Employee(String name, String email, String phone, String department){
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.department = department;
    }
    public Employee(){
        
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return "Employee [name=" + name + ", email=" + email + ", phone=" + phone + ", department=" + department + "]";
    }
}
