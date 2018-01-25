package com.javacreed.api.domain.primitives.jpa.optional;

import com.javacreed.api.domain.primitives.optional.LongBasedDomainPrimitive;

public abstract class LongBasedAttributeConverter<T extends LongBasedDomainPrimitive>
    extends ObjectBasedAttributeConverter<T, Long> {}
