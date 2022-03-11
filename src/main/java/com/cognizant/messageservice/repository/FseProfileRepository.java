package com.cognizant.messageservice.repository;

import com.cognizant.messageservice.data.FseDocument;
import org.socialsignin.spring.data.dynamodb.repository.EnableScan;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
@EnableScan
public interface FseProfileRepository extends CrudRepository<FseDocument,String> {


//	Optional<FseDocument> findByUserId(String userId);
}
