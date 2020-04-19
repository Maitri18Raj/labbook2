package com.mycompany.app;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.*;

@Configuration
@ComponentScan("com.mycompany.app")//indicates the path of component class
@PropertySource("classpath:values.properties")//indicates the path of the values.properties

public class JavaConfig {

@Bean
//this shows that the class has been created by someone else.
public Employee employee() {
	Employee employee=new Employee();
	return employee;
}


}
