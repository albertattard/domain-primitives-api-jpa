package com.javacreed.api.domain.primitives.jpa.optional;

import com.javacreed.api.domain.primitives.optional.StringBasedDomainObject;

public abstract class StringBasedAttributeConverter<T extends StringBasedDomainObject>
    extends ObjectBasedAttributeConverter<T, String> {}
