package com.rmn.apiclient.impl.api.methods;

import androidx.annotation.NonNull;
import com.rmn.apiclient.core.data.descriptor.ResourceDescriptorSet;
import com.rmn.apiclient.core.data_access.base.call.MethodVerb;
import com.rmn.apiclient.core.data_access.base.descriptor.BodyDescriptor;
import com.rmn.apiclient.core.data_access.base.descriptor.ParamDescriptor;
import com.rmn.apiclient.core.data_access.base.descriptor.ParamDescriptorSet;
import com.rmn.apiclient.core.data_access.base.methods.BaseApiMethod;
import com.rmn.apiclient.core.data_access.base.strategy.StrategyChain;
import com.rmn.apiclient.core.data_access.cache.strategy.CacheAccessStrategy;
import com.rmn.apiclient.core.data_access.proxy.call.ProxyInput;
import com.rmn.apiclient.core.data_access.proxy.call.ProxyOutput;
import com.rmn.apiclient.core.data_access.proxy.descriptor.ProxyMethodDescriptor;
import com.rmn.apiclient.impl.api.call.APIParams;
import com.rmn.apiclient.impl.api.descriptors.APICacheDescriptors;
import com.rmn.apiclient.impl.api.descriptors.APIResourceDescriptors;
import com.rmn.apiclient.impl.api.descriptors.APIServiceDescriptors;
import com.rmn.apiclient.impl.jsonapi.descriptor.JSONAPIDocumentDescriptor;
import com.rmn.apiclient.impl.jsonapi.descriptor.JSONAPIMetaDescriptor;

public final class PageApi {
    @NonNull
    public static final JSONAPIDocumentDescriptor DOCUMENT_DESCRIPTOR = new JSONAPIDocumentDescriptor((JSONAPIMetaDescriptor<?>) null, new ResourceDescriptorSet(APIResourceDescriptors.PAGE));

    public static final class GetPage extends BaseApiMethod {
        @NonNull
        public static final ProxyMethodDescriptor DESCRIPTOR = new ProxyMethodDescriptor(MethodVerb.GET, "pages/{id}", new ParamDescriptorSet(ParamDescriptor.newPathParam("id")), (BodyDescriptor<?>) null, PageApi.DOCUMENT_DESCRIPTOR, APIServiceDescriptors.SERVICE_DESCRIPTOR, CacheAccessStrategy.linkResourceTable(APICacheDescriptors.CACHE_DESCRIPTOR, APIResourceDescriptors.PAGE, "id"));

        public GetPage(@NonNull String str, @NonNull StrategyChain<ProxyInput, ProxyOutput> strategyChain) {
            super(DESCRIPTOR, strategyChain);
            getProxyInputBuilder().addParam(APIParams.m25010id(str));
        }
    }
}
