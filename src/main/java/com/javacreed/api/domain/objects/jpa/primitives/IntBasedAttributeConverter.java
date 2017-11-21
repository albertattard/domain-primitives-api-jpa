package com.javacreed.api.domain.objects.jpa.primitives;

import javax.persistence.AttributeConverter;

import com.javacreed.api.domain.objects.primitives.IntBasedDomainObject;

public abstract class IntBasedAttributeConverter<T extends IntBasedDomainObject>
        implements AttributeConverter<T, Integer> {

    protected abstract T convertNotNullToEntityAttribute(int dbData);

    @Override
    public Integer convertToDatabaseColumn(final T attribute) {
        return attribute == null ? null : attribute.getValue();
    }

    @Override
    public T convertToEntityAttribute(final Integer dbData) {
        return dbData == null ? null : convertNotNullToEntityAttribute(dbData);
    }
}
