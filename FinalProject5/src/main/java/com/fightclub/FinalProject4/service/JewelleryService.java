package com.fightclub.FinalProject4.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.fightclub.FinalProject4.entity.Jewellery;
import com.fightclub.FinalProject4.repository.JewelleryRepository;


@Service
public class JewelleryService {
	
	@Autowired
	private JewelleryRepository jewelleryRepository;
	

	public Jewellery saveJewellery(Jewellery jewellery) {
		return jewelleryRepository.save(jewellery);
	}
	
	public Jewellery updateJewellery(Jewellery jewellery) {
		return jewelleryRepository.save(jewellery);
	}
	
	public void deleteJewellery(int jId) {
		jewelleryRepository.deleteById(jId);
	}
	
	public Optional<Jewellery> getJewelleryById(int jId) {
		return	jewelleryRepository.findById(jId);
		}
//	public Optional<List<Jewellery>> getJewelleryByName(String name) {
//		return jewelleryRepository.findByName(name);
//	}

	public List<Jewellery> getAllJewellery() {
		return jewelleryRepository.findAll();

	}
	
}

