package com.javacreed.api.domain.primitives.jpa.mandatory;

import javax.persistence.AttributeConverter;

import com.javacreed.api.domain.primitives.mandatory.ObjectBasedDomainPrimitive;

/**
 *
 * @author Albert Attard
 *
 * @param <T>
 *          the type of the entity attribute
 * @param <D>
 *          the type of the database column
 */
public abstract class ObjectBasedAttributeConverter<T extends ObjectBasedDomainPrimitive<D>, D>
    implements AttributeConverter<T, D> {

  protected D convertNotNullToDatabaseColumn(final T attribute) {
    return attribute.getValue();
  }

  protected D convertNullToDatabaseColumn() {
    return null;
  }

  @Override
  public D convertToDatabaseColumn(final T attribute) {
    return attribute == null ? convertNullToDatabaseColumn() : convertNotNullToDatabaseColumn(attribute);
  }

  @Override
  public T convertToEntityAttribute(final D dbData) {
    return dbData == null ? createNullEquivalentDomainObject() : createDomainObject(dbData);
  }

  protected abstract T createDomainObject(D dbData);

  protected T createNullEquivalentDomainObject() {
    return null;
  }
}
