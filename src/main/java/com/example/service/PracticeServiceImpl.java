package com.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dao.PracticeRepository;
import com.example.model.Practice;
@Service
public class PracticeServiceImpl implements PracticeService {
	@Autowired
	public PracticeRepository practiceRepository;

	@Override
	public Practice savePractice(Practice practice) {
		practiceRepository.save(practice);
		return practice;
	}

}
