package com.javacreed.api.domain.primitives.jpa.lang;

import javax.persistence.AttributeConverter;

import com.javacreed.api.domain.primitives.lang.BooleanBasedDomainPrimitive;

public abstract class BooleanBasedAttributeConverter<T extends BooleanBasedDomainPrimitive>
    implements AttributeConverter<T, Boolean> {

  @Override
  public Boolean convertToDatabaseColumn(final T attribute) {
    return attribute == null ? null : attribute.get();
  }

  @Override
  public T convertToEntityAttribute(final Boolean dbData) {
    return dbData == null ? null : createDomainPrimitive(dbData);
  }

  protected abstract T createDomainPrimitive(boolean dbData);
}
