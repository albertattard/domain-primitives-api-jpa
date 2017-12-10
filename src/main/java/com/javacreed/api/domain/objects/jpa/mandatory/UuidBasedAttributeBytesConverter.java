package com.javacreed.api.domain.objects.jpa.mandatory;

import com.javacreed.api.domain.objects.jpa.ObjectBasedAttributeConverter;
import com.javacreed.api.domain.objects.mandatory.UuidBasedDomainObject;

public abstract class UuidBasedAttributeBytesConverter<T extends UuidBasedDomainObject>
    extends ObjectBasedAttributeConverter<T, byte[]> {

  @Override
  protected byte[] convertNotNullToDatabaseColumn(final T attribute) {
    return attribute.toBytes();
  }
}
