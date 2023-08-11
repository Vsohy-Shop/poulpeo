package com.rmn.apiclient.impl.api.methods;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.rmn.apiclient.core.data.descriptor.ResourceDescriptorSet;
import com.rmn.apiclient.core.data_access.base.call.MethodVerb;
import com.rmn.apiclient.core.data_access.base.descriptor.BodyDescriptor;
import com.rmn.apiclient.core.data_access.base.descriptor.ParamDescriptor;
import com.rmn.apiclient.core.data_access.base.descriptor.ParamDescriptorSet;
import com.rmn.apiclient.core.data_access.base.methods.BaseApiMethod;
import com.rmn.apiclient.core.data_access.base.methods.IHasFieldsCashbackParam;
import com.rmn.apiclient.core.data_access.base.methods.IHasFieldsMerchantInfoParam;
import com.rmn.apiclient.core.data_access.base.methods.IHasFieldsMerchantParam;
import com.rmn.apiclient.core.data_access.base.methods.IHasFilterMerchantParam;
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
import java.util.Set;
import java.util.concurrent.TimeUnit;

public final class MerchantLightApi {
    @NonNull
    public static final JSONAPIDocumentDescriptor DOCUMENT_DESCRIPTOR = new JSONAPIDocumentDescriptor((JSONAPIMetaDescriptor<?>) null, new ResourceDescriptorSet(APIResourceDescriptors.MERCHANT_LIGHT));

    public static final class GetAllMerchants extends BaseApiMethod implements IHasFieldsMerchantParam<GetAllMerchants>, IHasFilterMerchantParam<GetAllMerchants> {
        @NonNull
        public static final ProxyMethodDescriptor DESCRIPTOR;

        static {
            Class<Boolean> cls = Boolean.class;
            DESCRIPTOR = new ProxyMethodDescriptor(MethodVerb.GET, "merchants/all", new ParamDescriptorSet(new ParamDescriptor(APIParams.FILTER_HAS_CASHBACK, cls), new ParamDescriptor(APIParams.FILTER_EXTENSION_FLAG_STATUS, cls), new ParamDescriptor(APIParams.FIELDS_MERCHANT, Collection.class)), (BodyDescriptor<?>) null, MerchantLightApi.DOCUMENT_DESCRIPTOR, APIServiceDescriptors.SERVICE_DESCRIPTOR, CacheAccessStrategy.accessDocumentTable(APICacheDescriptors.CACHE_DESCRIPTOR, new CacheTTL(3, TimeUnit.DAYS)));
        }

        public GetAllMerchants(@NonNull StrategyChain<ProxyInput, ProxyOutput> strategyChain) {
            super(DESCRIPTOR, strategyChain);
        }
    }

    public static final class GetSimilarMerchants extends BaseApiMethod implements IHasLimitParam<GetSimilarMerchants>, IHasSortParam<GetSimilarMerchants>, IHasFilterMerchantParam<GetAllMerchants>, IHasFieldsCashbackParam<GetSimilarMerchants>, IHasFieldsMerchantInfoParam<GetSimilarMerchants> {
        @NonNull
        public static final ProxyMethodDescriptor DESCRIPTOR;

        static {
            Class<Integer> cls = Integer.class;
            Class<Collection> cls2 = Collection.class;
            Class<Boolean> cls3 = Boolean.class;
            DESCRIPTOR = new ProxyMethodDescriptor(MethodVerb.GET, "merchants/{id}/similarMerchants", new ParamDescriptorSet(ParamDescriptor.newPathParam("id"), new ParamDescriptor("offset", cls), new ParamDescriptor(APIParams.LIMIT, cls), new ParamDescriptor(APIParams.SORT, cls2), new ParamDescriptor(APIParams.FILTER_HAS_CASHBACK, cls3), new ParamDescriptor(APIParams.FILTER_EXTENSION_FLAG_STATUS, cls3), new ParamDescriptor(APIParams.FIELDS_MERCHANT, cls2), new ParamDescriptor(APIParams.FIELDS_CASHBACK, cls2), new ParamDescriptor(APIParams.FIELDS_MERCHANT_INFO, cls2)), (BodyDescriptor<?>) null, MerchantLightApi.DOCUMENT_DESCRIPTOR, APIServiceDescriptors.SERVICE_DESCRIPTOR, CacheAccessStrategy.accessDocumentTable(APICacheDescriptors.CACHE_DESCRIPTOR, new CacheTTL(3, TimeUnit.DAYS)));
        }

        public GetSimilarMerchants(@NonNull String str, @Nullable Set<String> set, @NonNull StrategyChain<ProxyInput, ProxyOutput> strategyChain) {
            super(DESCRIPTOR, strategyChain);
            getProxyInputBuilder().addParam(APIParams.m25010id(str));
            if (set != null) {
                getProxyInputBuilder().addParam(APIParams.FIELDS_MERCHANT, set);
            }
        }
    }
}
