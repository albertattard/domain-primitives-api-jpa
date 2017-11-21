package com.javacreed.api.domain.objects.jpa.primitives;

import javax.persistence.AttributeConverter;

import com.javacreed.api.domain.objects.primitives.ShortBasedDomainObject;

public abstract class ShortBasedAttributeConverter<T extends ShortBasedDomainObject>
        implements AttributeConverter<T, Short> {

    protected abstract T convertNotNullToEntityAttribute(short dbData);

    @Override
    public Short convertToDatabaseColumn(final T attribute) {
        return attribute == null ? null : attribute.getValue();
    }

    @Override
    public T convertToEntityAttribute(final Short dbData) {
        return dbData == null ? null : convertNotNullToEntityAttribute(dbData);
    }
}
