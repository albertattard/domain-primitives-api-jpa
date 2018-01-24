package com.javacreed.api.domain.objects.jpa.optional;

import com.javacreed.api.domain.objects.optional.LongBasedDomainObject;

public abstract class LongBasedAttributeConverter<T extends LongBasedDomainObject>
    extends ObjectBasedAttributeConverter<T, Long> {}
