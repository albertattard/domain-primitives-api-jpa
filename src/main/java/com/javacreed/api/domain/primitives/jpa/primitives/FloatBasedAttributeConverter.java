package com.javacreed.api.domain.primitives.jpa.primitives;

import javax.persistence.AttributeConverter;

import com.javacreed.api.domain.primitives.lang.FloatBasedDomainPrimitive;

public abstract class FloatBasedAttributeConverter<T extends FloatBasedDomainPrimitive>
    implements AttributeConverter<T, Float> {

  protected abstract T convertNotNullToEntityAttribute(float dbData);

  @Override
  public Float convertToDatabaseColumn(final T attribute) {
    return attribute == null ? null : attribute.getValue();
  }

  @Override
  public T convertToEntityAttribute(final Float dbData) {
    return dbData == null ? null : convertNotNullToEntityAttribute(dbData);
  }
}
