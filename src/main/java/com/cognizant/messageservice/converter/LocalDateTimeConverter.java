package com.cognizant.messageservice.converter;


import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBTypeConverter;

import java.time.LocalDateTime;

public class LocalDateTimeConverter implements DynamoDBTypeConverter<String, LocalDateTime> {

    @Override
    public String convert(LocalDateTime date) {
        return date.toString();
    }

    @Override
    public LocalDateTime unconvert(final String stringValue) {
        return LocalDateTime.parse(stringValue);
    }
}