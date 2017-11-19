package com.javacreed.api.domain.objects.jpa;

import javax.persistence.AttributeConverter;

import com.javacreed.api.domain.objects.CharBasedDomainObject;

public abstract class CharBasedAttributeConverter<T extends CharBasedDomainObject>
    implements AttributeConverter<T, Character> {

  protected abstract T convertNotNullToEntityAttribute(char dbData);

  @Override
  public Character convertToDatabaseColumn(final T attribute) {
    return attribute == null ? null : attribute.getValue();
  }

  @Override
  public T convertToEntityAttribute(final Character dbData) {
    return dbData == null ? null : convertNotNullToEntityAttribute(dbData);
  }
}
