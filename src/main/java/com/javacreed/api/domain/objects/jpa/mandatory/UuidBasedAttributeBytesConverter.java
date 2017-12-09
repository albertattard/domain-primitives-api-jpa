package com.javacreed.api.domain.objects.jpa.mandatory;

import com.javacreed.api.domain.objects.jpa.ObjectBasedAttributeConverter;
import com.javacreed.api.domain.objects.mandatory.UuidBasedDomainObject;

public abstract class UuidBasedAttributeBytesConverter<T extends UuidBasedDomainObject>
    extends ObjectBasedAttributeConverter<T, byte[]> {

  @Override
  public byte[] convertToDatabaseColumn(final T attribute) {
    return attribute == null ? null : attribute.toBytes();
  }

  @Override
  public T convertToEntityAttribute(final byte[] dbData) {
    return dbData == null ? null : convertNotNullToEntityAttribute(dbData);
  }
}
