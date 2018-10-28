package com.literature.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.literature.mapper.EmpMapper;
import com.literature.po.Emp;
import com.literature.po.EmpExample;
import com.literature.service.EmpService;

@Service
@Transactional
public class EmpServiceImpl implements EmpService {

	@Autowired
	private EmpMapper empMapper;
	
	public void save(Emp emp) {
		empMapper.insert(emp);
	}

	@Override
	public Emp get(Long id) {
		return empMapper.selectByPrimaryKey(id);
	}

	@Override
	public List<Emp> getAll() {
		return empMapper.selectByExample(null);
	}

	@Override
	public Emp getWithDept(Long id) {
		return empMapper.selectByPrimaryKeyWithDept(id);
	}

	@Override
	public List<Emp> getByDeptIdWithDept(Long deptId) {
		EmpExample empExample=new EmpExample();
		empExample.createCriteria().andDeptIdEqualTo(deptId);
		return empMapper.selectByExampleWithDept(empExample);
	}

}
