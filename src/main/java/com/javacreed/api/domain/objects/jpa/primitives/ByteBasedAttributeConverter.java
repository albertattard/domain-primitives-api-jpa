package com.javacreed.api.domain.objects.jpa.primitives;

import javax.persistence.AttributeConverter;

import com.javacreed.api.domain.objects.primitives.ByteBasedDomainObject;

public abstract class ByteBasedAttributeConverter<T extends ByteBasedDomainObject>
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
