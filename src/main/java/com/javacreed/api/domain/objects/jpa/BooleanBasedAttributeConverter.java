package com.javacreed.api.domain.objects.jpa;

import javax.persistence.AttributeConverter;

import com.javacreed.api.domain.objects.BooleanBasedDomainObject;

public abstract class BooleanBasedAttributeConverter<T extends BooleanBasedDomainObject>
    implements AttributeConverter<T, Boolean> {

  protected abstract T convertNotNullToEntityAttribute(boolean dbData);

  @Override
  public Boolean convertToDatabaseColumn(final T attribute) {
    return attribute == null ? null : attribute.getValue();
  }

  @Override
  public T convertToEntityAttribute(final Boolean dbData) {
    return dbData == null ? null : convertNotNullToEntityAttribute(dbData);
  }
}
