package com.eatsgood.controller;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.eatsgood.service.MainService;

@CrossOrigin(origins="*", allowedHeaders = "*")
@RestController
public class MainController {

	@Autowired
	MainService mainService;

	@RequestMapping(value = "/getUserData.do", method = RequestMethod.POST)
	public HashMap<String, Object> searchUserData( @RequestBody HashMap<String, Object> paramMap ) throws Exception {
		List<HashMap<String, String>> returnMap = mainService.getUserData();
		
		HashMap<String, Object> map = new HashMap<>();
		for (int i = 0; returnMap.size() > i; i++) {
			map.put("returnedData", returnMap);
		}
		return map;
	}
}
