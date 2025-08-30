package org.product.springtaskfawry;

import org.product.springtaskfawry.repository.EmployeeRepo;
import org.product.springtaskfawry.repository.impl.EmployeeRepoImpl;
import org.product.springtaskfawry.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
    @Bean
    public EmployeeRepo employeeRepo(){
        return new EmployeeRepoImpl();
    }

    @Bean
    public EmployeeService employeeService(@Autowired EmployeeRepo employeeRepo) {
        return new EmployeeService(employeeRepo);
    }
}
