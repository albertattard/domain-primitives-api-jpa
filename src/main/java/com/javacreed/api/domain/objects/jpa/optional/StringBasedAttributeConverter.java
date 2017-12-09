package com.javacreed.api.domain.objects.jpa.optional;

import com.javacreed.api.domain.objects.jpa.ObjectBasedAttributeConverter;
import com.javacreed.api.domain.objects.optional.StringBasedDomainObject;

public abstract class StringBasedAttributeConverter<T extends StringBasedDomainObject>
    extends ObjectBasedAttributeConverter<T, String> {

  protected T convertNullToEntityAttribute() {
    return null;
  }

  @Override
  public String convertToDatabaseColumn(final T attribute) {
    return attribute == null ? null : attribute.getNullable();
  }

  @Override
  public T convertToEntityAttribute(final String dbData) {
    return dbData == null ? convertNullToEntityAttribute() : convertNotNullToEntityAttribute(dbData);
  }
}
