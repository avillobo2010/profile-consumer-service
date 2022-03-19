package com.cognizant.messageservice.service;

import java.util.List;
import java.util.Optional;
import com.cognizant.messageservice.data.SkillDocument;
import com.cognizant.messageservice.repository.FseProfileRepository;
import com.cognizant.messageservice.repository.FseSkillRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.cognizant.messageservice.data.FseDocument;



import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class FseProfileService {

	@Autowired
	FseProfileRepository profileRepository;

	@Autowired
	FseSkillRepository profileSkillRepository;

	public Optional<FseDocument> getProfile(String userId) {
		return profileRepository.findById(userId);

	}

	public String updateProfile(FseDocument fseDocument) {
		profileRepository.save(fseDocument);
		return fseDocument.getUserid();
	}

	public void updateProfileSkills(List<SkillDocument> skillDocumentList) {
		 profileSkillRepository.saveAll(skillDocumentList);
	}
}
