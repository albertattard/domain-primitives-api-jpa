package com.javacreed.api.domain.primitives.jpa.optional;

import com.javacreed.api.domain.primitives.optional.BooleanBasedDomainPrimitive;

public abstract class BooleanBasedAttributeConverter<T extends BooleanBasedDomainPrimitive>
    extends ObjectBasedAttributeConverter<T, Boolean> {}
