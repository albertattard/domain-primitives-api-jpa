package com.javacreed.api.domain.objects.jpa;

import javax.persistence.AttributeConverter;

public abstract class ObjectBasedAttributeConverter<T, D> implements AttributeConverter<T, D> {

  protected abstract T convertNotNullToEntityAttribute(D dbData);

}
