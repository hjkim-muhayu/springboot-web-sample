package com.example.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dao.SampleDAO;
import com.example.service.SampleService;
import com.example.vo.SampleVO;

@Service
public class SampleServiceImpl implements SampleService {
	
	@Autowired
	SampleDAO sampleDAO;
	
	@Override
	public List<SampleVO> selectBoardList() {
		List<SampleVO> result = sampleDAO.selectBoardList();
		
		for(int i=0;i<result.size();i++) {
			System.out.println(result.get(i).getUserSeq());
		}
		
		return result;
	}

}
