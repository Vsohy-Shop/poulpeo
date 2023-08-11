package com.rmn.apiclient.impl.api.methods;

import androidx.annotation.NonNull;
import com.rmn.apiclient.core.data.descriptor.ResourceDescriptorSet;
import com.rmn.apiclient.core.data_access.base.call.MethodVerb;
import com.rmn.apiclient.core.data_access.base.descriptor.BodyDescriptor;
import com.rmn.apiclient.core.data_access.base.descriptor.ParamDescriptor;
import com.rmn.apiclient.core.data_access.base.descriptor.ParamDescriptorSet;
import com.rmn.apiclient.core.data_access.base.methods.BaseApiMethod;
import com.rmn.apiclient.core.data_access.base.methods.IHasLimitParam;
import com.rmn.apiclient.core.data_access.base.methods.IHasSortParam;
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

public final class CampaignApi {
    @NonNull
    public static final JSONAPIDocumentDescriptor DOCUMENT_DESCRIPTOR = new JSONAPIDocumentDescriptor((JSONAPIMetaDescriptor<?>) null, new ResourceDescriptorSet(APIResourceDescriptors.CAMPAIGN));

    public static final class GetCampaign extends BaseApiMethod {
        @NonNull
        public static final ProxyMethodDescriptor DESCRIPTOR = new ProxyMethodDescriptor(MethodVerb.GET, "campaigns/{id}", new ParamDescriptorSet(ParamDescriptor.newPathParam("id")), (BodyDescriptor<?>) null, CampaignApi.DOCUMENT_DESCRIPTOR, APIServiceDescriptors.SERVICE_DESCRIPTOR, CacheAccessStrategy.linkResourceTable(APICacheDescriptors.CACHE_DESCRIPTOR, APIResourceDescriptors.CAMPAIGN, "id"));

        public GetCampaign(@NonNull String str, @NonNull StrategyChain<ProxyInput, ProxyOutput> strategyChain) {
            super(DESCRIPTOR, strategyChain);
            getProxyInputBuilder().addParam(APIParams.m25010id(str));
        }
    }

    public static final class GetCampaignsOfType extends BaseApiMethod implements IHasLimitParam<GetCampaignsOfType>, IHasSortParam<GetCampaignsOfType> {
        @NonNull
        public static final ProxyMethodDescriptor DESCRIPTOR;

        static {
            Class<Integer> cls = Integer.class;
            DESCRIPTOR = new ProxyMethodDescriptor(MethodVerb.GET, "campaignTypes/{technicalName}/campaigns", new ParamDescriptorSet(ParamDescriptor.newPathParam(APIParams.TECHNICAL_NAME), new ParamDescriptor("offset", cls), new ParamDescriptor(APIParams.LIMIT, cls), new ParamDescriptor(APIParams.SORT, Collection.class)), (BodyDescriptor<?>) null, CampaignApi.DOCUMENT_DESCRIPTOR, APIServiceDescriptors.SERVICE_DESCRIPTOR, CacheAccessStrategy.accessDocumentTable(APICacheDescriptors.CACHE_DESCRIPTOR, new CacheTTL(12, TimeUnit.HOURS)));
        }

        public GetCampaignsOfType(@NonNull String str, @NonNull StrategyChain<ProxyInput, ProxyOutput> strategyChain) {
            super(DESCRIPTOR, strategyChain);
            getProxyInputBuilder().addParam(APIParams.TECHNICAL_NAME, str);
        }
    }
}
