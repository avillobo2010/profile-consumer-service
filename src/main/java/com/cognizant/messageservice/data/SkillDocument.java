package com.cognizant.messageservice.data;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBAttribute;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBAutoGeneratedKey;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBHashKey;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBTable;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@DynamoDBTable(tableName  = "FseSkill")
@Builder
public class SkillDocument {

	@DynamoDBHashKey(attributeName="skillId")
	@DynamoDBAutoGeneratedKey
	private String skillId;

	@DynamoDBAttribute
	private String userid;

	@DynamoDBAttribute
	private String skillName;

	@DynamoDBAttribute
	private Integer expertise;

	@DynamoDBAttribute
	private String skillType;

}
