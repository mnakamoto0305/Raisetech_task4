package com.sample.springboot.mybatis;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.sample.springboot.Employee;

@Mapper
public interface EmployeeMapper {

	//1件検索用メソッド
	public Employee findOne(Long id);

	//全件検索メソッド
	public List<Employee> findAll();
}
