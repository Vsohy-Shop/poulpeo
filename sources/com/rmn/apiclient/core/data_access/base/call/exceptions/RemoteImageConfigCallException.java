package com.rmn.apiclient.core.data_access.base.call.exceptions;

import androidx.annotation.NonNull;
import com.rmn.apiclient.core.data_access.base.call.CallException;
import com.rmn.apiclient.core.data_access.proxy.call.ProxyOutput;

public class RemoteImageConfigCallException extends CallException {
    @NonNull
    public final ProxyOutput remoteImageConfigCallOutput;

    public RemoteImageConfigCallException(@NonNull ProxyOutput proxyOutput) {
        super((Throwable) proxyOutput.getException());
        this.remoteImageConfigCallOutput = proxyOutput;
    }

    public int getHttpCodeIfAny() {
        Integer num = this.remoteImageConfigCallOutput.httpCode;
        if (num != null) {
            return num.intValue();
        }
        return super.getHttpCodeIfAny();
    }
}
