package com.rmn.apiclient.core.data.validator;

public interface IMetaValidator<T> {
    boolean isValid(T t);
}
