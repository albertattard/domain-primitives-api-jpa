package com.javacreed.api.domain.primitives.jpa.optional;

import com.javacreed.api.domain.primitives.optional.LongBasedDomainObject;

public abstract class LongBasedAttributeConverter<T extends LongBasedDomainObject>
    extends ObjectBasedAttributeConverter<T, Long> {}
