package com.my.first_springboot;

import com.my.first_springboot.modal.Employee;
import com.my.first_springboot.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FirstSpringbootApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(FirstSpringbootApplication.class, args);
	}

    //
    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
    public void run(String... args) throws Exception {
        Employee employee = new Employee();
        employee.setFirstName("Ramesh");
        employee.setLastName("Man");
        employee.setEmailId("ramesh@mail.com");
        employeeRepository.save(employee);

        Employee employee1 = new Employee();
        employee1.setFirstName("Mala");
        employee1.setLastName("Woman");
        employee1.setEmailId("mala@mail.com");
        employeeRepository.save(employee1);
    }
}
