package com.sample.springboot.mybatis;

import org.apache.ibatis.annotations.Mapper;

import com.sample.springboot.Employee;

@Mapper
public interface EmployeeMapper {

	public Employee findOne(Long id);
}
