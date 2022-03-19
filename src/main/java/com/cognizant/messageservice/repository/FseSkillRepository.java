package com.cognizant.messageservice.repository;

import com.cognizant.messageservice.data.SkillDocument;
import org.springframework.data.repository.CrudRepository;

public interface FseSkillRepository extends CrudRepository<SkillDocument,String> {
}