package com.example.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Component;

import com.example.vo.SampleVO;

@Component
public class SampleDAO {
	private final SqlSession sqlSession;
	
	public SampleDAO(SqlSession sqlSession) {
		this.sqlSession = sqlSession;
	}
	
	public List<SampleVO> selectBoardList() {
		return this.sqlSession.selectList("sample.selectBoardList");
	}
	
}
