package com.eatsgood.dao;

import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface MainMapper {
	List<HashMap<String,String>> getUserData();
}
