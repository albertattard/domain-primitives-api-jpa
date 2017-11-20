package com.javacreed.api.domain.objects.jpa;

import com.javacreed.api.domain.objects.UuidBasedDomainObject;
import com.javacreed.api.domain.objects.utils.UuidUtils;

public abstract class UuidBasedAttributeBytesConverter<T extends UuidBasedDomainObject>
    extends ObjectBasedAttributeConverter<T, byte[]> {

  @Override
  public byte[] convertToDatabaseColumn(final T attribute) {
    return attribute == null ? null : attribute.map(UuidUtils::toBytes).orElse(null);
  }

  @Override
  public T convertToEntityAttribute(final byte[] dbData) {
    return dbData == null ? null : convertNotNullToEntityAttribute(dbData);
  }
}
