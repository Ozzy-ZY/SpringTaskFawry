package org.product.springtaskfawry;

import org.product.springtaskfawry.repository.EmployeeRepo;
import org.product.springtaskfawry.repository.impl.EmployeeRepoImpl;
import org.product.springtaskfawry.service.EmployeeService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class SpringTaskFawryApplication {

    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(AppConfig.class);
        var bean = context.getBean(EmployeeService.class);
        bean.saveEmployee("Zyad","Zyad@gmail.com","232","IT");
        System.out.println(bean.findEmployeeByDepartment("IT"));
    }

}
