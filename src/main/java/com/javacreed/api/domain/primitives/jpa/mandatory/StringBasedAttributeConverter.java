package com.javacreed.api.domain.primitives.jpa.mandatory;

import com.javacreed.api.domain.primitives.mandatory.StringBasedDomainObject;

public abstract class StringBasedAttributeConverter<T extends StringBasedDomainObject>
    extends ObjectBasedAttributeConverter<T, String> {}
