package com.javacreed.api.domain.primitives.jpa.optional;

import java.util.UUID;

import com.javacreed.api.domain.primitives.optional.UuidBasedDomainPrimitive;

public abstract class UuidBasedAttributeStringConverter<T extends UuidBasedDomainPrimitive>
    extends MismatchedObjectBasedAttributeConverter<UUID, T, String> {

  @Override
  protected String convertNotNullToDatabaseColumn(final T attribute) {
    return attribute.toFormattedString().orElse(null);
  }

  @Override
  protected UUID convertNotNullToValue(final String dbData) {
    return UUID.fromString(dbData);
  }
}
