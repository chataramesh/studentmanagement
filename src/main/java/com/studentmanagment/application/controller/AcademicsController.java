package com.studentmanagment.application.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.studentmanagment.application.entity.Academics;
import com.studentmanagment.application.repository.AcademicsRepo;
import com.studentmanagment.application.service.CopyPropertiesUtil;

@RestController
@RequestMapping("/api/academics")
@CrossOrigin(origins = "*")
public class AcademicsController {

	@Autowired
	private AcademicsRepo academicsRepo;

	@GetMapping("/getAll")
	public ResponseEntity<List<Academics>> getAllAcadamics() {

		return ResponseEntity.ok(academicsRepo.findAll());
	}

	@GetMapping("/getCount")
	public ResponseEntity<Integer> getAcadamicsCount() {

		return ResponseEntity.ok(academicsRepo.findAll().size());
	}

	@GetMapping("/getById/{acadamicsId}")
	public ResponseEntity<Academics> getAcadamicsById(@PathVariable("acadamicsId") Long acadamicsId) {

		return ResponseEntity.ok(academicsRepo.findById(acadamicsId).get());
		// findById-->select * from acadamics where id=acadamicsId;
	}

	@PostMapping("/create")
	public ResponseEntity<Academics> createAcadamics(@RequestBody Academics academics) {
		return ResponseEntity.ok(academicsRepo.save(academics));
		// insert into acadamics("acadamicyear","acadamicname","acdamic bock")
		// values(?==academics.getAcademicYear(),?==academics.getAcademicBlock(),?==academics.getAcademicBlockAddress());
	}

	@PutMapping("/update/{acadamicsId}")
	public ResponseEntity<?> updateAcadamics(@RequestBody Academics academics,
			@PathVariable("acadamicsId") Long acadamicsId) {
		Optional<Academics> oldAcadamics = academicsRepo.findById(acadamicsId);
		CopyPropertiesUtil.copyProperties(academics, oldAcadamics.get());
		if (oldAcadamics.isPresent()) {
			return ResponseEntity.ok(academicsRepo.save(oldAcadamics.get()));
		} else {
			return ResponseEntity.ok("innvalid ID");
		}

	}

	@DeleteMapping("/delete/{acadamicsId}")
	public void deleteAcadamics(@PathVariable("acadamicsId") Long acadamicsId) {
		//Academics academic = academicsRepo.findById(acadamicsId).get();
		academicsRepo.deleteById(acadamicsId);
		///return ResponseEntity.ok(academic);
		// delete from acadamics where acadamic id="?";
	}

}
