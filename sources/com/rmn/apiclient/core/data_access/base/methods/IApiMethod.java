package com.rmn.apiclient.core.data_access.base.methods;

import androidx.annotation.NonNull;
import com.rmn.apiclient.core.data_access.proxy.call.ProxyInput;

public interface IApiMethod {
    @NonNull
    ProxyInput.Builder getProxyInputBuilder();
}
