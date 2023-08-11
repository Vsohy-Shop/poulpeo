package com.rmn.apiclient.impl.api.methods;

import androidx.annotation.NonNull;
import com.rmn.apiclient.core.data.descriptor.ResourceDescriptorSet;
import com.rmn.apiclient.core.data_access.base.call.MethodVerb;
import com.rmn.apiclient.core.data_access.base.descriptor.BodyDescriptor;
import com.rmn.apiclient.core.data_access.base.descriptor.ParamDescriptor;
import com.rmn.apiclient.core.data_access.base.descriptor.ParamDescriptorSet;
import com.rmn.apiclient.core.data_access.base.methods.BaseApiMethod;
import com.rmn.apiclient.core.data_access.base.methods.IHasFieldsWithAffiliateNetworkParam;
import com.rmn.apiclient.core.data_access.base.strategy.StrategyChain;
import com.rmn.apiclient.core.data_access.cache.strategy.CacheAccessStrategy;
import com.rmn.apiclient.core.data_access.cache.utils.CacheTTL;
import com.rmn.apiclient.core.data_access.proxy.call.ProxyInput;
import com.rmn.apiclient.core.data_access.proxy.call.ProxyOutput;
import com.rmn.apiclient.core.data_access.proxy.descriptor.ProxyMethodDescriptor;
import com.rmn.apiclient.impl.api.call.APIParams;
import com.rmn.apiclient.impl.api.descriptors.APICacheDescriptors;
import com.rmn.apiclient.impl.api.descriptors.APIResourceDescriptors;
import com.rmn.apiclient.impl.api.descriptors.APIServiceDescriptors;
import com.rmn.apiclient.impl.jsonapi.descriptor.JSONAPIDocumentDescriptor;
import com.rmn.apiclient.impl.jsonapi.descriptor.JSONAPIMetaDescriptor;
import java.util.Collection;
import java.util.concurrent.TimeUnit;

public final class AffiliateNetworkApi {
    @NonNull
    public static final JSONAPIDocumentDescriptor DOCUMENT_DESCRIPTOR = new JSONAPIDocumentDescriptor((JSONAPIMetaDescriptor<?>) null, new ResourceDescriptorSet(APIResourceDescriptors.AFFILIATE_NETWORK));

    public static final class GetAllAffiliateNetworks extends BaseApiMethod implements IHasFieldsWithAffiliateNetworkParam<GetAllAffiliateNetworks> {
        @NonNull
        public static final ProxyMethodDescriptor DESCRIPTOR = new ProxyMethodDescriptor(MethodVerb.GET, "affiliateNetworks/all", new ParamDescriptorSet(new ParamDescriptor(APIParams.FILTER_HAS_DOMAINS, Boolean.class), new ParamDescriptor(APIParams.FIELDS_AFFILIATE_NETWORK, Collection.class)), (BodyDescriptor<?>) null, AffiliateNetworkApi.DOCUMENT_DESCRIPTOR, APIServiceDescriptors.SERVICE_DESCRIPTOR, CacheAccessStrategy.accessDocumentTable(APICacheDescriptors.CACHE_DESCRIPTOR, new CacheTTL(3, TimeUnit.DAYS)));

        public GetAllAffiliateNetworks(@NonNull StrategyChain<ProxyInput, ProxyOutput> strategyChain) {
            super(DESCRIPTOR, strategyChain);
        }

        @NonNull
        public GetAllAffiliateNetworks setFilterHasDomainsParam(boolean z) {
            getProxyInputBuilder().addParam(APIParams.FILTER_HAS_DOMAINS, Boolean.valueOf(z));
            return this;
        }
    }
}
