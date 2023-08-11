package com.rmn.apiclient.core.data_access.proxy.processor;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.rmn.apiclient.core.config.IAPIConfig;
import com.rmn.apiclient.core.data_access.base.processor.BaseActionProcessor;
import com.rmn.apiclient.core.data_access.cache.descriptor.CacheMethodDescriptor;
import com.rmn.apiclient.core.data_access.proxy.call.ProxyInput;
import com.rmn.apiclient.core.data_access.proxy.call.ProxyOutput;
import com.rmn.apiclient.core.data_access.service.descriptor.ServiceMethodDescriptor;

public abstract class BaseProxyActionProcessor extends BaseActionProcessor<ProxyInput, ProxyOutput> {
    /* access modifiers changed from: protected */
    @Nullable
    public IAPIConfig getAPIConfig(@NonNull ProxyInput proxyInput) {
        ServiceMethodDescriptor serviceMethodDescriptor = proxyInput.getMethodDescriptor().getServiceMethodDescriptor();
        if (serviceMethodDescriptor == null) {
            return null;
        }
        return serviceMethodDescriptor.getServiceDescriptor().getAPIConfig();
    }

    /* access modifiers changed from: protected */
    @NonNull
    public CacheMethodDescriptor getCacheMethodDescriptor(@NonNull ProxyInput proxyInput) {
        CacheMethodDescriptor cacheMethodDescriptor = proxyInput.getMethodDescriptor().getCacheMethodDescriptor();
        if (cacheMethodDescriptor != null) {
            return cacheMethodDescriptor;
        }
        throw new IllegalStateException("Can't retrieve from cache if the proxy method has no cache method");
    }

    /* access modifiers changed from: protected */
    @NonNull
    public ServiceMethodDescriptor getServiceMethodDescriptor(@NonNull ProxyInput proxyInput) {
        ServiceMethodDescriptor serviceMethodDescriptor = proxyInput.getMethodDescriptor().getServiceMethodDescriptor();
        if (serviceMethodDescriptor != null) {
            return serviceMethodDescriptor;
        }
        throw new IllegalStateException("Can't retrieve from service if the proxy method has no service method");
    }

    /* access modifiers changed from: protected */
    public abstract boolean isReadingData();

    /* access modifiers changed from: protected */
    public abstract boolean isWritingRetrievedData();

    public boolean canProcessAction(@NonNull ProxyInput proxyInput, @NonNull ProxyOutput proxyOutput) {
        if (isReadingData() && proxyOutput.hasDocument()) {
            return false;
        }
        if (!isWritingRetrievedData() || proxyOutput.hasDocument()) {
            return true;
        }
        return false;
    }
}
