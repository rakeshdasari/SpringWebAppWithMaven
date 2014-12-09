package com.itcorner4u.service;

import javax.annotation.Resource;

import org.hibernate.SessionFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.itcorner4u.databean.Employee;

@Service
@Transactional
public class HelloService {

	@Resource(name = "sessionFactory")
	private SessionFactory sessionFactory;
	
	public Employee getEmployee(){
		Employee emp = (Employee)sessionFactory.getCurrentSession().get(Employee.class, 1);
		return emp;
	}

	
}