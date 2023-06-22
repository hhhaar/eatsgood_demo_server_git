package com.eatsgood.service;

import java.util.HashMap;
import java.util.List;

import org.springframework.stereotype.Service;

@Service("mainservice")
public interface MainService {
	public List<HashMap<String, String>> getUserData();
}
