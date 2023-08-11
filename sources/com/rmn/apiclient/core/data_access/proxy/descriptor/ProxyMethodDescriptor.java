package com.rmn.apiclient.core.data_access.proxy.descriptor;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.rmn.apiclient.core.data.descriptor.IDocumentDescriptor;
import com.rmn.apiclient.core.data_access.base.call.MethodVerb;
import com.rmn.apiclient.core.data_access.base.descriptor.BaseMethodDescriptor;
import com.rmn.apiclient.core.data_access.base.descriptor.BodyDescriptor;
import com.rmn.apiclient.core.data_access.base.descriptor.ParamDescriptorSet;
import com.rmn.apiclient.core.data_access.cache.access.BaseCacheAccessDescriptor;
import com.rmn.apiclient.core.data_access.cache.descriptor.CacheMethodDescriptor;
import com.rmn.apiclient.core.data_access.service.descriptor.ServiceDescriptor;
import com.rmn.apiclient.core.data_access.service.descriptor.ServiceMethodDescriptor;

public class ProxyMethodDescriptor extends BaseMethodDescriptor {
    @Nullable
    private final CacheMethodDescriptor cacheMethodDescriptor;
    @Nullable
    private final ServiceMethodDescriptor serviceMethodDescriptor;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ProxyMethodDescriptor(@NonNull MethodVerb methodVerb, @NonNull String str, @Nullable ParamDescriptorSet paramDescriptorSet, @Nullable BodyDescriptor<?> bodyDescriptor, @Nullable IDocumentDescriptor iDocumentDescriptor, @Nullable ServiceDescriptor serviceDescriptor, @Nullable BaseCacheAccessDescriptor baseCacheAccessDescriptor) {
        super(methodVerb, str, paramDescriptorSet, bodyDescriptor, iDocumentDescriptor);
        BaseCacheAccessDescriptor baseCacheAccessDescriptor2 = baseCacheAccessDescriptor;
        if (serviceDescriptor == null && baseCacheAccessDescriptor2 == null) {
            throw new IllegalStateException("The proxy is useless if it has no service and no cache");
        }
        if (serviceDescriptor == null) {
            this.serviceMethodDescriptor = null;
        } else {
            this.serviceMethodDescriptor = new ServiceMethodDescriptor(methodVerb, str, this.paramDescriptors, bodyDescriptor, iDocumentDescriptor, serviceDescriptor);
        }
        if (baseCacheAccessDescriptor2 == null) {
            this.cacheMethodDescriptor = null;
            return;
        }
        ParamDescriptorSet paramDescriptorSet2 = this.paramDescriptors;
        this.cacheMethodDescriptor = new CacheMethodDescriptor(methodVerb, str, paramDescriptorSet2, bodyDescriptor, iDocumentDescriptor, baseCacheAccessDescriptor2.copy((String[]) paramDescriptorSet2.getParamDescriptorNames().toArray(new String[0])));
    }

    @Nullable
    public CacheMethodDescriptor getCacheMethodDescriptor() {
        return this.cacheMethodDescriptor;
    }

    @Nullable
    public ServiceMethodDescriptor getServiceMethodDescriptor() {
        return this.serviceMethodDescriptor;
    }
}
