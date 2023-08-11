package com.rmn.apiclient.impl.api.methods;

import androidx.annotation.NonNull;
import com.rmn.apiclient.core.data.descriptor.ResourceDescriptorSet;
import com.rmn.apiclient.core.data_access.base.call.MethodVerb;
import com.rmn.apiclient.core.data_access.base.descriptor.BodyDescriptor;
import com.rmn.apiclient.core.data_access.base.descriptor.ParamDescriptor;
import com.rmn.apiclient.core.data_access.base.descriptor.ParamDescriptorSet;
import com.rmn.apiclient.core.data_access.base.methods.BaseApiMethod;
import com.rmn.apiclient.core.data_access.base.methods.IHasFieldsCashbackParam;
import com.rmn.apiclient.core.data_access.base.methods.IHasFieldsMerchantInfoParam;
import com.rmn.apiclient.core.data_access.base.methods.IHasFieldsMerchantParam;
import com.rmn.apiclient.core.data_access.base.methods.IHasFieldsOfferParam;
import com.rmn.apiclient.core.data_access.base.methods.IHasFilterContainerParam;
import com.rmn.apiclient.core.data_access.base.methods.IHasIncludeWithMerchantParam;
import com.rmn.apiclient.core.data_access.base.methods.IHasIncludeWithOfferParam;
import com.rmn.apiclient.core.data_access.base.methods.IHasLimitParam;
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

public final class ContainerApi {
    @NonNull
    public static final JSONAPIDocumentDescriptor DOCUMENT_DESCRIPTOR = new JSONAPIDocumentDescriptor((JSONAPIMetaDescriptor<?>) null, new ResourceDescriptorSet(APIResourceDescriptors.MERCHANT, APIResourceDescriptors.OFFER, APIResourceDescriptors.MERCHANT_INFO, APIResourceDescriptors.CASHBACK_OBJECT));

    public static final class GetContainerContent extends BaseApiMethod implements IHasLimitParam<GetContainerContent>, IHasIncludeWithMerchantParam<GetContainerContent>, IHasIncludeWithOfferParam<GetContainerContent>, IHasFilterContainerParam<GetContainerContent>, IHasFieldsMerchantParam<GetContainerContent>, IHasFieldsOfferParam<GetContainerContent>, IHasFieldsCashbackParam<GetContainerContent>, IHasFieldsMerchantInfoParam<GetContainerContent> {
        @NonNull
        public static final ProxyMethodDescriptor DESCRIPTOR;

        static {
            Class<Integer> cls = Integer.class;
            Class<Collection> cls2 = Collection.class;
            Class<Boolean> cls3 = Boolean.class;
            DESCRIPTOR = new ProxyMethodDescriptor(MethodVerb.GET, "containers/{technicalName}/content", new ParamDescriptorSet(ParamDescriptor.newPathParam(APIParams.TECHNICAL_NAME), new ParamDescriptor("offset", cls), new ParamDescriptor(APIParams.LIMIT, cls), new ParamDescriptor(APIParams.INCLUDE_WITH_MERCHANT, cls2), new ParamDescriptor(APIParams.INCLUDE_WITH_OFFER, cls2), new ParamDescriptor(APIParams.FILTER_HAS_CASHBACK, cls3), new ParamDescriptor(APIParams.FILTER_OFFER_TYPE_ID, cls), new ParamDescriptor(APIParams.FILTER_CAN_COMBINE_CASHBACK_AND_OFFERS_CODES, cls3), new ParamDescriptor(APIParams.FIELDS_MERCHANT, cls2), new ParamDescriptor(APIParams.FIELDS_OFFER, cls2), new ParamDescriptor(APIParams.FIELDS_CASHBACK, cls2), new ParamDescriptor(APIParams.FIELDS_MERCHANT_INFO, cls2)), (BodyDescriptor<?>) null, ContainerApi.DOCUMENT_DESCRIPTOR, APIServiceDescriptors.SERVICE_DESCRIPTOR, CacheAccessStrategy.accessDocumentTable(APICacheDescriptors.CACHE_DESCRIPTOR, new CacheTTL(1, TimeUnit.HOURS)));
        }

        public GetContainerContent(@NonNull String str, @NonNull StrategyChain<ProxyInput, ProxyOutput> strategyChain) {
            super(DESCRIPTOR, strategyChain);
            getProxyInputBuilder().addParam(APIParams.TECHNICAL_NAME, str);
        }
    }
}
