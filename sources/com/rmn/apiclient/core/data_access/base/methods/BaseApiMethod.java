package com.rmn.apiclient.core.data_access.base.methods;

import androidx.annotation.NonNull;
import com.rmn.apiclient.core.data_access.base.call.CallManager;
import com.rmn.apiclient.core.data_access.base.strategy.StrategyChain;
import com.rmn.apiclient.core.data_access.proxy.call.ProxyCall;
import com.rmn.apiclient.core.data_access.proxy.call.ProxyInput;
import com.rmn.apiclient.core.data_access.proxy.call.ProxyOutput;
import com.rmn.apiclient.core.data_access.proxy.descriptor.ProxyMethodDescriptor;
import com.rmn.iosadapters.android.content.ContextContainer;
import java.util.Map;

public abstract class BaseApiMethod implements IApiMethod {
    @NonNull
    private final ProxyMethodDescriptor methodDescriptor;
    @NonNull
    private final ProxyInput.Builder proxyInputBuilder;

    protected BaseApiMethod(@NonNull ProxyMethodDescriptor proxyMethodDescriptor, @NonNull StrategyChain<ProxyInput, ProxyOutput> strategyChain) {
        this.methodDescriptor = proxyMethodDescriptor;
        this.proxyInputBuilder = new ProxyInput.Builder(proxyMethodDescriptor, strategyChain);
    }

    @NonNull
    public final ProxyCall call(@NonNull ContextContainer contextContainer) {
        return call(CallManager.getDefaultCallManager(contextContainer));
    }

    @NonNull
    public ProxyMethodDescriptor getMethodDescriptor() {
        return this.methodDescriptor;
    }

    @NonNull
    public ProxyInput.Builder getProxyInputBuilder() {
        return this.proxyInputBuilder;
    }

    /* access modifiers changed from: protected */
    public final void setHeaders(@NonNull Map<String, String> map) {
        this.proxyInputBuilder.setHeaders(map);
    }

    @NonNull
    public final ProxyCall call(@NonNull CallManager callManager) {
        return this.proxyInputBuilder.build().call(callManager);
    }
}
