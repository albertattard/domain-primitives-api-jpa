package com.javacreed.api.domain.primitives.jpa.optional;

import com.javacreed.api.domain.primitives.optional.StringBasedDomainPrimitive;

public abstract class StringBasedAttributeConverter<T extends StringBasedDomainPrimitive>
    extends ObjectBasedAttributeConverter<T, String> {}
