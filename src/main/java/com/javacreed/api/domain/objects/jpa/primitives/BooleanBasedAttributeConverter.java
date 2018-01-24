package com.javacreed.api.domain.objects.jpa.primitives;

import javax.persistence.AttributeConverter;

import com.javacreed.api.domain.objects.primitives.BooleanBasedDomainObject;

public abstract class BooleanBasedAttributeConverter<T extends BooleanBasedDomainObject>
    implements AttributeConverter<T, Boolean> {

  @Override
  public Boolean convertToDatabaseColumn(final T attribute) {
    return attribute == null ? null : attribute.getValue();
  }

  @Override
  public T convertToEntityAttribute(final Boolean dbData) {
    return dbData == null ? null : createDomainObject(dbData);
  }

  protected abstract T createDomainObject(boolean dbData);
}
