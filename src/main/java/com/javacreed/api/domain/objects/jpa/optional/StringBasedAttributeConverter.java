package com.javacreed.api.domain.objects.jpa.optional;

import com.javacreed.api.domain.objects.optional.StringBasedDomainObject;

public abstract class StringBasedAttributeConverter<T extends StringBasedDomainObject>
    extends ObjectBasedAttributeConverter<T, String> {}
