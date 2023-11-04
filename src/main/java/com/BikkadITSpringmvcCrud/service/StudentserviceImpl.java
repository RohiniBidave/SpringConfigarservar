package com.BikkadITSpringmvcCrud.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.BikkadITSpringmvcCrud.model.Student;
import com.BikkadITSpringmvcCrud.repository.StudentRepository;

@Service
public class StudentserviceImpl implements StudentserviceI {
	
	@Autowired
	private StudentRepository studentRepository;

	@Override
	public boolean saveStudent(Student stu) {
		Student save = studentRepository.save(stu);
		if (save != null) {
			return true;
		} else {

			return false;
		}
	}
}




