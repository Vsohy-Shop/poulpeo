package com.rmn.apiclient.core.data_access.base.call.exceptions;

import androidx.annotation.NonNull;
import com.rmn.apiclient.core.data_access.base.call.CallException;

public class ParsingCallException extends CallException {
    public final int httpCode;
    @NonNull
    public final String rawResponse;

    public ParsingCallException(int i, @NonNull String str) {
        this.httpCode = i;
        this.rawResponse = str;
    }

    public int getHttpCodeIfAny() {
        return this.httpCode;
    }
}
