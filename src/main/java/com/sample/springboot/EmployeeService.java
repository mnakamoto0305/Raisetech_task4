package com.sample.springboot;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sample.springboot.mybatis.EmployeeMapper;

@Service
public class EmployeeService {

	@Autowired
	private EmployeeMapper employeeMapper;

	@Transactional
	public Employee findOne(Long id) {
		return employeeMapper.findOne(id);
	}

	@Transactional
	public List<Employee> findAll() {
		return employeeMapper.findAll();
	};
}
