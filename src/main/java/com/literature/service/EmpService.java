package com.literature.service;

import java.util.List;

import com.literature.po.Emp;

public interface EmpService {

	void save(Emp emp);

	Emp get(Long id);

	List<Emp> getAll();
	
	Emp getWithDept(Long id);
	List<Emp> getByDeptIdWithDept(Long deptId);
}