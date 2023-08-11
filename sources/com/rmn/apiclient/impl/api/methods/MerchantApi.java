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
import com.rmn.apiclient.core.data_access.base.methods.IHasFilterMerchantParam;
import com.rmn.apiclient.core.data_access.base.methods.IHasIncludeWithMerchantParam;
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

public final class MerchantApi {
    @NonNull
    public static final JSONAPIDocumentDescriptor DOCUMENT_DESCRIPTOR = new JSONAPIDocumentDescriptor((JSONAPIMetaDescriptor<?>) null, new ResourceDescriptorSet(APIResourceDescriptors.MERCHANT, APIResourceDescriptors.MERCHANT_INFO, APIResourceDescriptors.CASHBACK_OBJECT));

    public static final class GetMerchant extends BaseApiMethod implements IHasIncludeWithMerchantParam<GetMerchant>, IHasFieldsMerchantParam<GetMerchant>, IHasFieldsCashbackParam<GetMerchant>, IHasFieldsMerchantInfoParam<GetMerchant> {
        @NonNull
        public static final ProxyMethodDescriptor DESCRIPTOR;

        static {
            Class<Collection> cls = Collection.class;
            DESCRIPTOR = new ProxyMethodDescriptor(MethodVerb.GET, "merchants/{id}", new ParamDescriptorSet(ParamDescriptor.newPathParam("id"), new ParamDescriptor(APIParams.INCLUDE_WITH_MERCHANT, cls), new ParamDescriptor(APIParams.FIELDS_MERCHANT, cls), new ParamDescriptor(APIParams.FIELDS_CASHBACK, cls), new ParamDescriptor(APIParams.FIELDS_MERCHANT_INFO, cls)), (BodyDescriptor<?>) null, MerchantApi.DOCUMENT_DESCRIPTOR, APIServiceDescriptors.SERVICE_DESCRIPTOR, CacheAccessStrategy.linkResourceTable(APICacheDescriptors.CACHE_DESCRIPTOR, APIResourceDescriptors.MERCHANT, "id"));
        }

        public GetMerchant(@NonNull String str, @NonNull StrategyChain<ProxyInput, ProxyOutput> strategyChain) {
            super(DESCRIPTOR, strategyChain);
            getProxyInputBuilder().addParam(APIParams.m25010id(str));
        }
    }

    public static final class GetMerchants extends BaseApiMethod implements IHasLimitParam<GetMerchants>, IHasIncludeWithMerchantParam<GetMerchants>, IHasFieldsMerchantParam<GetMerchants>, IHasFieldsCashbackParam<GetMerchants>, IHasFieldsMerchantInfoParam<GetMerchants> {
        @NonNull
        public static final ProxyMethodDescriptor DESCRIPTOR;

        static {
            Class<Collection> cls = Collection.class;
            DESCRIPTOR = new ProxyMethodDescriptor(MethodVerb.GET, "merchants/find", new ParamDescriptorSet(new ParamDescriptor(APIParams.FILTER_MERCHANT_IDS, cls), new ParamDescriptor(APIParams.INCLUDE_WITH_MERCHANT, cls), new ParamDescriptor(APIParams.FIELDS_MERCHANT, cls), new ParamDescriptor(APIParams.FIELDS_CASHBACK, cls), new ParamDescriptor(APIParams.FIELDS_MERCHANT_INFO, cls)), (BodyDescriptor<?>) null, MerchantApi.DOCUMENT_DESCRIPTOR, APIServiceDescriptors.SERVICE_DESCRIPTOR, CacheAccessStrategy.accessDocumentTable(APICacheDescriptors.CACHE_DESCRIPTOR, new CacheTTL(1, TimeUnit.DAYS)));
        }

        public GetMerchants(@NonNull Collection<String> collection, @NonNull StrategyChain<ProxyInput, ProxyOutput> strategyChain) {
            super(DESCRIPTOR, strategyChain);
            getProxyInputBuilder().addParam(APIParams.FILTER_MERCHANT_IDS, collection);
        }
    }

    public static final class GetSimilarMerchants extends BaseApiMethod implements IHasLimitParam<GetSimilarMerchants>, IHasSortParam<GetSimilarMerchants>, IHasIncludeWithMerchantParam<GetSimilarMerchants>, IHasFilterMerchantParam<GetSimilarMerchants>, IHasFieldsMerchantParam<GetSimilarMerchants>, IHasFieldsCashbackParam<GetSimilarMerchants>, IHasFieldsMerchantInfoParam<GetSimilarMerchants> {
        @NonNull
        public static final ProxyMethodDescriptor DESCRIPTOR;

        static {
            Class<Integer> cls = Integer.class;
            Class<Collection> cls2 = Collection.class;
            Class<Boolean> cls3 = Boolean.class;
            DESCRIPTOR = new ProxyMethodDescriptor(MethodVerb.GET, "merchants/{id}/similarMerchants", new ParamDescriptorSet(ParamDescriptor.newPathParam("id"), new ParamDescriptor("offset", cls), new ParamDescriptor(APIParams.LIMIT, cls), new ParamDescriptor(APIParams.SORT, cls2), new ParamDescriptor(APIParams.INCLUDE_WITH_MERCHANT, cls2), new ParamDescriptor(APIParams.FILTER_HAS_CASHBACK, cls3), new ParamDescriptor(APIParams.FILTER_EXTENSION_FLAG_STATUS, cls3), new ParamDescriptor(APIParams.FIELDS_MERCHANT, cls2), new ParamDescriptor(APIParams.FIELDS_CASHBACK, cls2), new ParamDescriptor(APIParams.FIELDS_MERCHANT_INFO, cls2)), (BodyDescriptor<?>) null, MerchantApi.DOCUMENT_DESCRIPTOR, APIServiceDescriptors.SERVICE_DESCRIPTOR, CacheAccessStrategy.accessDocumentTable(APICacheDescriptors.CACHE_DESCRIPTOR, new CacheTTL(3, TimeUnit.DAYS)));
        }

        public GetSimilarMerchants(@NonNull String str, @NonNull StrategyChain<ProxyInput, ProxyOutput> strategyChain) {
            super(DESCRIPTOR, strategyChain);
            getProxyInputBuilder().addParam(APIParams.m25010id(str));
        }
    }

    public static final class Search extends BaseApiMethod implements IHasLimitParam<Search>, IHasIncludeWithMerchantParam<Search>, IHasFilterMerchantParam<Search>, IHasFieldsMerchantParam<Search>, IHasFieldsCashbackParam<Search>, IHasFieldsMerchantInfoParam<Search> {
        @NonNull
        public static final ProxyMethodDescriptor DESCRIPTOR;

        static {
            Class<Integer> cls = Integer.class;
            Class<Collection> cls2 = Collection.class;
            Class<Boolean> cls3 = Boolean.class;
            DESCRIPTOR = new ProxyMethodDescriptor(MethodVerb.GET, "merchants/search", new ParamDescriptorSet(new ParamDescriptor(APIParams.SEARCH_TERM, String.class), new ParamDescriptor("offset", cls), new ParamDescriptor(APIParams.LIMIT, cls), new ParamDescriptor(APIParams.INCLUDE_WITH_MERCHANT, cls2), new ParamDescriptor(APIParams.FILTER_HAS_CASHBACK, cls3), new ParamDescriptor(APIParams.FILTER_EXTENSION_FLAG_STATUS, cls3), new ParamDescriptor(APIParams.FIELDS_MERCHANT, cls2), new ParamDescriptor(APIParams.FIELDS_CASHBACK, cls2), new ParamDescriptor(APIParams.FIELDS_MERCHANT_INFO, cls2)), (BodyDescriptor<?>) null, MerchantApi.DOCUMENT_DESCRIPTOR, APIServiceDescriptors.SERVICE_DESCRIPTOR, CacheAccessStrategy.accessDocumentTable(APICacheDescriptors.CACHE_DESCRIPTOR, new CacheTTL(3, TimeUnit.DAYS)));
        }

        public Search(@NonNull String str, @NonNull StrategyChain<ProxyInput, ProxyOutput> strategyChain) {
            super(DESCRIPTOR, strategyChain);
            getProxyInputBuilder().addParam(APIParams.SEARCH_TERM, str);
        }
    }
}
