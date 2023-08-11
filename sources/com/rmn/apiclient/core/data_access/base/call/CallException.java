package com.rmn.apiclient.core.data_access.base.call;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class CallException extends Exception {
    public CallException() {
    }

    @Nullable
    public String getCloudflareDebugCode() {
        Throwable cause = getCause();
        if (cause instanceof CallException) {
            return ((CallException) cause).getCloudflareDebugCode();
        }
        return null;
    }

    public int getHttpCodeIfAny() {
        Throwable cause = getCause();
        if (cause instanceof CallException) {
            return ((CallException) cause).getHttpCodeIfAny();
        }
        return -1;
    }

    public CallException(@NonNull String str) {
        super(str);
    }

    public CallException(@Nullable Throwable th) {
        super(th);
    }
}
