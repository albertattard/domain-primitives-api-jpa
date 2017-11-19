package com.javacreed.api.domain.objects.jpa;

import javax.persistence.AttributeConverter;

import com.javacreed.api.domain.objects.StringBasedDomainObject;

public abstract class StringBasedAttributeConverter<T extends StringBasedDomainObject>
    implements AttributeConverter<T, String> {

  protected abstract T convertNotNullToEntityAttribute(String dbData);

  @Override
  public String convertToDatabaseColumn(final T attribute) {
    return attribute == null ? null : attribute.getNullable();
  }

  @Override
  public T convertToEntityAttribute(final String dbData) {
    return dbData == null ? null : convertNotNullToEntityAttribute(dbData);
  }
}
