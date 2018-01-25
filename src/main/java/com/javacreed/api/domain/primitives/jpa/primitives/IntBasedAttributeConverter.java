package com.javacreed.api.domain.primitives.jpa.primitives;

import javax.persistence.AttributeConverter;

import com.javacreed.api.domain.primitives.lang.IntBasedDomainPrimitive;

public abstract class IntBasedAttributeConverter<T extends IntBasedDomainPrimitive>
    implements AttributeConverter<T, Integer> {

  @Override
  public Integer convertToDatabaseColumn(final T attribute) {
    return attribute == null ? null : attribute.getValue();
  }

  @Override
  public T convertToEntityAttribute(final Integer dbData) {
    return dbData == null ? null : createDomainObject(dbData);
  }

  protected abstract T createDomainObject(int dbData);
}
