package com.javacreed.api.domain.objects.jpa.optional;

import com.javacreed.api.domain.objects.jpa.ObjectBasedAttributeConverter;
import com.javacreed.api.domain.objects.optional.UuidBasedDomainObject;

public abstract class UuidBasedAttributeBytesConverter<T extends UuidBasedDomainObject>
    extends ObjectBasedAttributeConverter<T, byte[]> {

  @Override
  protected byte[] convertNotNullToDatabaseColumn(final T attribute) {
    return attribute.getBytes().orElse(null);
  }
}
