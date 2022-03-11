package com.cognizant.messageservice.service;

import java.util.Optional;

import com.cognizant.messageservice.repository.FseProfileRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.cognizant.messageservice.data.FseDocument;



import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class FseProfileService {

	@Autowired
	FseProfileRepository profileRepository;

	public Optional<FseDocument> getProfile(String userId) {
		return profileRepository.findById(userId);

	}

	public String updateProfile(FseDocument document) {
		profileRepository.save(document);
		return document.getUserid();
	}

	
}
