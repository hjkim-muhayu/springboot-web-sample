package com.example.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Component;

import com.example.vo.SampleVO;

@Component
public class Sample2DAO {
	private final SqlSession sqlSession;
	
	public Sample2DAO(SqlSession sqlSession) {
		this.sqlSession = sqlSession;
	}
	
	public List<SampleVO> selectList() {
		return this.sqlSession.selectList("sample2.selectList");
	}
	
}
