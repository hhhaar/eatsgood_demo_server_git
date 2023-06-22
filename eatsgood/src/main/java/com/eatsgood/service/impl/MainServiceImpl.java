package com.eatsgood.service.impl;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.eatsgood.dao.MainMapper;
import com.eatsgood.service.MainService;

@Service("mainservice")
public class MainServiceImpl implements MainService{

	@Autowired
	MainMapper mainMapper;
	
	@Override
	public List<HashMap<String, String>> getUserData() {
		return mainMapper.getUserData();
	}

}
