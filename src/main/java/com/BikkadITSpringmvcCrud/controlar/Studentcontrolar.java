package com.BikkadITSpringmvcCrud.controlar;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import com.BikkadITSpringmvcCrud.model.Student;
import com.BikkadITSpringmvcCrud.service.StudentserviceI;

@Controller
public class Studentcontrolar {
	@Autowired
	private StudentserviceI studentServiceI;

	@GetMapping("/welcomeStudent")
	public String loadForm() {
		return "welcome1";

	}

	@GetMapping("/saveStudent")
	public ModelAndView saveStudent(Student stu) {

		boolean saveStudent = studentServiceI.saveStudent(stu);
		if(saveStudent) {
			ModelAndView mav = new ModelAndView();
			mav.addObject("STUSUCC", "Student saved Successfully");
			mav.setViewName("regSucc");
			return mav;
		}else {
		ModelAndView mav = new ModelAndView();
		mav.addObject("STUFAIL", "Student Not Saved");
		mav.setViewName("regFail");
		return mav;
		}
	}

}
