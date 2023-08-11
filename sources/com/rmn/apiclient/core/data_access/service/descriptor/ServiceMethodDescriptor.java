package com.rmn.apiclient.core.data_access.service.descriptor;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.rmn.apiclient.core.data.descriptor.IDocumentDescriptor;
import com.rmn.apiclient.core.data_access.base.call.MethodVerb;
import com.rmn.apiclient.core.data_access.base.descriptor.BaseMethodDescriptor;
import com.rmn.apiclient.core.data_access.base.descriptor.BodyDescriptor;
import com.rmn.apiclient.core.data_access.base.descriptor.ParamDescriptorSet;
import com.rmn.apiclient.core.data_access.service.http.IHttpCallManager;

public class ServiceMethodDescriptor extends BaseMethodDescriptor {
    @NonNull
    private final IHttpCallManager httpCallManager;
    @NonNull
    private final ServiceDescriptor serviceDescriptor;

    public ServiceMethodDescriptor(@NonNull MethodVerb methodVerb, @NonNull String str, @NonNull ParamDescriptorSet paramDescriptorSet, @Nullable BodyDescriptor<?> bodyDescriptor, @Nullable IDocumentDescriptor iDocumentDescriptor, @NonNull ServiceDescriptor serviceDescriptor2) {
        super(methodVerb, str, paramDescriptorSet, bodyDescriptor, iDocumentDescriptor);
        this.serviceDescriptor = serviceDescriptor2;
        this.httpCallManager = serviceDescriptor2.getHttpCallManager();
    }

    @NonNull
    public IHttpCallManager getHttpCallManager() {
        return this.httpCallManager;
    }

    @NonNull
    public ServiceDescriptor getServiceDescriptor() {
        return this.serviceDescriptor;
    }
}
