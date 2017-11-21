package com.javacreed.api.domain.objects.jpa.primitives;

import javax.persistence.AttributeConverter;

import com.javacreed.api.domain.objects.primitives.LongBasedDomainObject;

public abstract class LongBasedAttributeConverter<T extends LongBasedDomainObject>
    implements AttributeConverter<T, Long> {

  protected abstract T convertNotNullToEntityAttribute(long dbData);

  @Override
  public Long convertToDatabaseColumn(final T attribute) {
    return attribute == null ? null : attribute.getValue();
  }

  @Override
  public T convertToEntityAttribute(final Long dbData) {
    return dbData == null ? null : convertNotNullToEntityAttribute(dbData);
  }
}
