package com.telusko.SpringJDBCDemo;

import com.telusko.SpringJDBCDemo.model.Student;
import com.telusko.SpringJDBCDemo.service.StudentService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringJdbcDemoApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringJdbcDemoApplication.class, args);

		Student obj = context.getBean(Student.class);
		obj.setMarks(100);
		obj.setName("Basanta Sapkota");
		obj.setRollNo(2);

		StudentService service = context.getBean(StudentService.class);
		service.save(obj);
		System.out.println("Students: "+service.getStudents());
	}

}
