package com.cssl.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cssl.dao.DeptDao;
import com.cssl.pojo.Dept;
import com.cssl.service.DeptService;

@Service
@Transactional
public class DeptServiceImpl implements DeptService {
	
	public DeptServiceImpl() {
		System.out.println("DeptServiceImpl:"+this);
	}
	
	@Autowired
	private DeptDao ddao;

	@Override
	public int addDept(Dept dept) {
		System.out.println("DeptServiceImpl addDept");
		return ddao.add(dept);
	}

	@Override
	public int delDept(int id) {
		System.out.println("DeptServiceImpl delDept");
		return ddao.del(id);
	}

}
