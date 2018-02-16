package com.javacreed.api.domain.primitives.jpa.mandatory;

import java.util.UUID;

import com.javacreed.api.domain.primitives.mandatory.UuidBasedDomainPrimitive;

public abstract class UuidBasedAttributeStringConverter<T extends UuidBasedDomainPrimitive>
    extends MismatchedObjectBasedAttributeConverter<UUID, T, String> {

  @Override
  protected String convertNotNullToDatabaseColumn(final T attribute) {
    return attribute.toString();
  }

  @Override
  protected UUID convertNotNullToValue(final String dbData) {
    return UUID.fromString(dbData);
  }
}
