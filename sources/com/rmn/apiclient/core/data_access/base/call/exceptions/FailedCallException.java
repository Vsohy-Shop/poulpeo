package com.rmn.apiclient.core.data_access.base.call.exceptions;

import androidx.annotation.Nullable;
import com.rmn.apiclient.core.data_access.base.call.CallException;
import java.net.SocketTimeoutException;

public class FailedCallException extends CallException {
    public final boolean hasTimedOut;

    public FailedCallException(@Nullable Throwable th) {
        super(th);
        this.hasTimedOut = th instanceof SocketTimeoutException;
    }
}
