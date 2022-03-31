package com.fightclub.FinalProject5.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fightclub.FinalProject5.entity.Jewellery;
import com.fightclub.FinalProject5.service.JewelleryService;

//@CrossOrigin(origins = "http://127.0.0.1:5500")


//@CrossOrigin(origins = "http://127.0.0.1:5500", allowedHeaders="*", allowedMethods("GET","POST","PUT","DELETE"))
@CrossOrigin(origins = "http://127.0.0.1:5500", allowedHeaders="*")
@RequestMapping("/api")
@RestController
public class JewelleryController {
	
	@Autowired
	private JewelleryService jewelleryService;
	
	@PostMapping("/jewellery")
	public Jewellery saveJewellery(@RequestBody Jewellery jewellery) {
		return jewelleryService.saveJewellery(jewellery);

	}

	@PutMapping("/jewellery/{jId}")
	public Jewellery updateJewellery(@RequestBody Jewellery jewellery, @PathVariable int jId) {
		return jewelleryService.updateJewellery(jewellery,jId);

	}

	@DeleteMapping("/jewellery/{jId}")
	public void deleteJewellery(@PathVariable int jId) {
		jewelleryService.deleteJewellery(jId);

	}

	@GetMapping("/jewellery/{jId}")
	public Optional<Jewellery> getJewelleryById(@PathVariable int jId) {
		return jewelleryService.getJewelleryById(jId);

	}
	
//	@GetMapping("/jewellery/find/{name}")
//	public Optional<List<Jewellery>> findJewelleryByName(@PathVariable String name) {
//
//		Optional<List<Jewellery>> optional = jewelleryService.getJewelleryByName(name);
//
//		if (optional.isEmpty()) {
//			return null;
//		} else {
//
//			return optional;
//		}
//	}

	@GetMapping("/jewelleryall")
	public List<Jewellery> getAllJewellery() {
		return jewelleryService.getAllJewellery();
	}

}