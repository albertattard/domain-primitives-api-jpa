package com.javacreed.api.domain.objects.jpa;

import javax.persistence.AttributeConverter;

import com.javacreed.api.domain.objects.UuidBasedDomainObject;

public abstract class UuidBasedAttributeStringConverter<T extends UuidBasedDomainObject>
    implements AttributeConverter<T, String> {

  protected abstract T convertNotNullToEntityAttribute(String dbData);

  @Override
  public String convertToDatabaseColumn(final T attribute) {
    return attribute == null ? null : attribute.map(u -> u.toString()).orElse(null);
  }

  @Override
  public T convertToEntityAttribute(final String dbData) {
    return dbData == null ? null : convertNotNullToEntityAttribute(dbData);
  }
}
