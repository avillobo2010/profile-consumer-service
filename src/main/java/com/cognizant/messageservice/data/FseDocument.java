package com.cognizant.messageservice.data;

import com.amazonaws.services.dynamodbv2.datamodeling.*;
import com.cognizant.messageservice.converter.LocalDateTimeConverter;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.datatype.jsr310.deser.LocalDateTimeDeserializer;
import com.fasterxml.jackson.datatype.jsr310.ser.LocalDateTimeSerializer;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@DynamoDBTable(tableName  = "FseProfile")
@Builder
public class FseDocument implements Serializable {

	@DynamoDBHashKey(attributeName="userId")
	@DynamoDBAutoGeneratedKey
	private String userid;

	@DynamoDBAttribute
	private String name;

	@DynamoDBAttribute
	private String id;

	@DynamoDBAttribute
	private String mobile;

	@DynamoDBAttribute
	private String email;


	@DynamoDBAttribute
	@DynamoDBTypeConverted(converter = LocalDateTimeConverter.class)
	@JsonSerialize(using = LocalDateTimeSerializer.class)
	@JsonDeserialize(using = LocalDateTimeDeserializer.class)
	private LocalDateTime createdDateTime;

	@DynamoDBAttribute
	@DynamoDBTypeConverted(converter = LocalDateTimeConverter.class)
	@JsonSerialize(using = LocalDateTimeSerializer.class)
	@JsonDeserialize(using = LocalDateTimeDeserializer.class)
	private LocalDateTime lastUpdatedDateTime;

	@DynamoDBAttribute
	private List<SkillDocument> skills;

}