package com.javacreed.api.domain.objects.jpa.optional;

import com.javacreed.api.domain.objects.jpa.ObjectBasedAttributeConverter;
import com.javacreed.api.domain.objects.optional.UuidBasedDomainObject;

public abstract class UuidBasedAttributeStringConverter<T extends UuidBasedDomainObject>
        extends ObjectBasedAttributeConverter<T, String> {

    @Override
    public String convertToDatabaseColumn(final T attribute) {
        return attribute == null ? null : attribute.getFormatted().orElse(null);
    }

    @Override
    public T convertToEntityAttribute(final String dbData) {
        return dbData == null ? null : convertNotNullToEntityAttribute(dbData);
    }
}
