package com.literature.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.literature.mapper.DeptMapper;
import com.literature.po.Dept;
import com.literature.service.DeptService;

@Service
@Transactional
public class DeptServiceImpl implements DeptService {

	@Autowired
	private DeptMapper deptMapper;
	
	@Override
	public void save(Dept dept) {
		deptMapper.insert(dept);
	}

}
