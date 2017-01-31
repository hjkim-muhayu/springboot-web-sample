package com.example.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.example.vo.SampleVO;

@Mapper
public interface SampleMapper2 {
	List<SampleVO> selectList();
}
