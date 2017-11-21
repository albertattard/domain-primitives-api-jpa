package com.javacreed.api.domain.objects.jpa.optional;

import java.sql.Timestamp;

import javax.persistence.Converter;

import com.javacreed.api.domain.objects.jpa.ObjectBasedAttributeConverter;
import com.javacreed.api.domain.objects.optional.LocalDateTimeBasedDomainObject;

@Converter(autoApply = true)
public abstract class LocalDateTimeBasedAttributeConverter<T extends LocalDateTimeBasedDomainObject>
        extends ObjectBasedAttributeConverter<T, Timestamp> {

    @Override
    public Timestamp convertToDatabaseColumn(final T locDateTime) {
        return locDateTime == null ? null : locDateTime.map(Timestamp::valueOf).get();
    }

    @Override
    public T convertToEntityAttribute(final Timestamp sqlTimestamp) {
        return sqlTimestamp == null ? null : convertNotNullToEntityAttribute(sqlTimestamp);
    }
}
