package com.javacreed.api.domain.objects.jpa;

import javax.persistence.AttributeConverter;

/**
 *
 * @author Albert Attard
 *
 * @param <T>
 *          the type of the entity attribute
 * @param <D>
 *          the type of the database column
 */
public abstract class ObjectBasedAttributeConverter<T, D> implements AttributeConverter<T, D> {

  protected abstract D convertNotNullToDatabaseColumn(final T attribute);

  protected abstract T convertNotNullToEntityAttribute(D dbData);

  protected D convertNullToDatabaseColumn() {
    return null;
  }

  protected T convertNullToEntityAttribute() {
    return null;
  }

  @Override
  public D convertToDatabaseColumn(final T attribute) {
    return attribute == null ? convertNullToDatabaseColumn() : convertNotNullToDatabaseColumn(attribute);
  }

  @Override
  public T convertToEntityAttribute(final D dbData) {
    return dbData == null ? convertNullToEntityAttribute() : convertNotNullToEntityAttribute(dbData);
  }
}
