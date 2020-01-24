package com.example.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.example.dao.studentdao;
import com.example.dao.usersdao;
import com.example.model.student;
import com.example.model.users;

@RestController
public class EmployeeController {
	@Autowired
	private studentdao dao;
	@Autowired
	private usersdao userlist;

	@RequestMapping("/logout")
	public String logoutemp(Map<String, Object> model) {
		model.put("message", "ganesh");
		return "login";
	}

	@GetMapping("/users")
	public static String log() {
		return "index";
	}

	// display all users
	@PostMapping("/show")
	public List<student> showstudents() {
		return (List<student>) dao.findAll();
	}

	// display users by id
	@PostMapping("/show/{id}")
	public Optional<student> showstudentsbyid(@PathVariable Integer id) {
		return dao.findById(id);

	}

	// insert new student records
	@GetMapping("/addstudent")
	public Iterable<student> addstudent() {
		student s = new student();
		s.setAge(20);
		s.setId(7);
		s.setFirst("czsd");
		dao.save(s);
		return dao.findAll();
	}

//update students
	@PostMapping("/update/{id}")
	public List<student> updatestudentinfo(@PathVariable Integer id) {
		List<student> LL = updates();
		return LL;
	}

	// delete student records
	@PostMapping("/delete/{id}")
	public List<student> deletestudent(@PathVariable Integer id) {
		// display all users
		dao.deleteById(id);
		return (List<student>) dao.findAll();

	}

	public List<student> updates() {
		List<student> list = (List<student>) dao.findAll();
		for (student student : list) {
			if (student.getId() == 121) {
				student s = new student();
				s.setAge(24);
				s.setFirst("bbb");
			}
		}
		return list;
	}

	// users login

	// welcome page

	@GetMapping("/home")
	public ModelAndView loginsuccess() {

		return new ModelAndView("index");
	}

	@GetMapping("/home/{id}")
	public ModelAndView loginsuccess(Map<String, Object> model, @PathVariable Integer id) {
		List<student> list;
		Optional<student> s = dao.findById(id);
		model.put("message", s.get().getFirst());
		return new ModelAndView("login");
	}

	@GetMapping("/register")
	public String registerNewuser() {
		List<student> list = new ArrayList<student>();
		student e = new student();
		e.setFirst("ganesh");
		e.setId(1);
		e.setAge(24);
		list.add(e);
		return "welcome " + e.getFirst();
	}

	@GetMapping("/home/a")
	public ModelAndView logs() {

		return new ModelAndView("index");
	}

	@RequestMapping("/form")
	public String register(@RequestParam String user, String pass) {
		users s = new users();
		s.setId(2);
		s.setUsername("admin");
		s.setPassword("123");
		userlist.save(s);
		return "home";
	}
}
