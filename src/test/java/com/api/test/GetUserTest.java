package com.api.test;

import org.testng.annotations.Test;

import com.api.models.response.Student;
import com.api.resources.StudentService;

import io.restassured.response.Response;

public class GetUserTest {

	@Test
	public void getUserTest() {
		StudentService service = new StudentService();
		Response response = service.getStudent("9d68");
		Student student = response.as(Student.class);
		System.out.println(student.getId());
		System.out.println(student.getName());
		System.out.println(student.getLocation());
		System.out.println(student.getPhone());
		System.out.println(student.getCourses());
	}
}
