package com.javacreed.api.domain.primitives.jpa.lang;

import javax.persistence.AttributeConverter;

import com.javacreed.api.domain.primitives.lang.ByteBasedDomainPrimitive;

public abstract class ByteBasedAttributeConverter<T extends ByteBasedDomainPrimitive>
    implements AttributeConverter<T, Byte> {

  protected abstract T convertNotNullToEntityAttribute(byte dbData);

  @Override
  public Byte convertToDatabaseColumn(final T attribute) {
    return attribute == null ? null : attribute.getValue();
  }

  @Override
  public T convertToEntityAttribute(final Byte dbData) {
    return dbData == null ? null : convertNotNullToEntityAttribute(dbData);
  }
}
