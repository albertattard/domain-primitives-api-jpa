package com.javacreed.api.domain.primitives.jpa.primitives;

import javax.persistence.AttributeConverter;

import com.javacreed.api.domain.primitives.lang.LongBasedDomainPrimitive;

public abstract class LongBasedAttributeConverter<T extends LongBasedDomainPrimitive>
    implements AttributeConverter<T, Long> {

  @Override
  public Long convertToDatabaseColumn(final T attribute) {
    return attribute == null ? null : attribute.getValue();
  }

  @Override
  public T convertToEntityAttribute(final Long dbData) {
    return dbData == null ? null : createDomainObject(dbData);
  }

  protected abstract T createDomainObject(long dbData);
}
