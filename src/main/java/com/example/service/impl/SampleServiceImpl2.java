package com.example.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dao.Sample2DAO;
import com.example.service.SampleService2;
import com.example.vo.SampleVO;

@Service
public class SampleServiceImpl2 implements SampleService2 {
	
	@Autowired
	Sample2DAO sample2DAO;
	
	@Override
	public List<SampleVO> selectList() {
		List<SampleVO> result = sample2DAO.selectList();
		
		for(int i=0;i<result.size();i++) {
			System.out.println(result.get(i).getUserName());
		}
		
		return result;
	}

}
