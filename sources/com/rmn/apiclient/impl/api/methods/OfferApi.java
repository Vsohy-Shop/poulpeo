package com.rmn.apiclient.impl.api.methods;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.rmn.apiclient.core.data.descriptor.ResourceDescriptorSet;
import com.rmn.apiclient.core.data_access.base.call.MethodVerb;
import com.rmn.apiclient.core.data_access.base.descriptor.BodyDescriptor;
import com.rmn.apiclient.core.data_access.base.descriptor.ParamDescriptor;
import com.rmn.apiclient.core.data_access.base.descriptor.ParamDescriptorSet;
import com.rmn.apiclient.core.data_access.base.methods.BaseApiMethod;
import com.rmn.apiclient.core.data_access.base.methods.IHasFieldsCashbackParam;
import com.rmn.apiclient.core.data_access.base.methods.IHasFieldsMerchantParam;
import com.rmn.apiclient.core.data_access.base.methods.IHasFieldsOfferParam;
import com.rmn.apiclient.core.data_access.base.methods.IHasIncludeWithOfferParam;
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
import com.rmn.apiclient.impl.api.models.SingleUseOffer;
import com.rmn.apiclient.impl.jsonapi.descriptor.JSONAPIDocumentDescriptor;
import com.rmn.apiclient.impl.jsonapi.descriptor.JSONAPIMetaDescriptor;
import java.util.Collection;
import java.util.concurrent.TimeUnit;
import p316cc.C11035a;

public final class OfferApi {
    @NonNull
    public static final JSONAPIDocumentDescriptor DOCUMENT_DESCRIPTOR = new JSONAPIDocumentDescriptor((JSONAPIMetaDescriptor<?>) null, new ResourceDescriptorSet(APIResourceDescriptors.OFFER, APIResourceDescriptors.MERCHANT, APIResourceDescriptors.CASHBACK_OBJECT));

    public static final class GetMerchantOffers extends BaseApiMethod implements IHasLimitParam<GetMerchantOffers>, IHasSortParam<GetMerchantOffers>, IHasIncludeWithOfferParam<GetMerchantOffers>, IHasFieldsOfferParam<GetMerchantOffers>, IHasFieldsMerchantParam<GetMerchantOffers>, IHasFieldsCashbackParam<GetMerchantOffers> {
        @NonNull
        public static final ProxyMethodDescriptor DESCRIPTOR;

        static {
            Class<Integer> cls = Integer.class;
            Class<Collection> cls2 = Collection.class;
            DESCRIPTOR = new ProxyMethodDescriptor(MethodVerb.GET, "merchants/{id}/offers", new ParamDescriptorSet(ParamDescriptor.newPathParam("id"), new ParamDescriptor("offset", cls), new ParamDescriptor(APIParams.LIMIT, cls), new ParamDescriptor(APIParams.SORT, cls2), new ParamDescriptor(APIParams.INCLUDE_WITH_OFFER, cls2), new ParamDescriptor(APIParams.FIELDS_OFFER, cls2), new ParamDescriptor(APIParams.FIELDS_MERCHANT, cls2), new ParamDescriptor(APIParams.FIELDS_CASHBACK, cls2)), (BodyDescriptor<?>) null, OfferApi.DOCUMENT_DESCRIPTOR, APIServiceDescriptors.SERVICE_DESCRIPTOR, CacheAccessStrategy.accessDocumentTable(APICacheDescriptors.CACHE_DESCRIPTOR, new CacheTTL(1, TimeUnit.HOURS)));
        }

        public GetMerchantOffers(@NonNull String str, @NonNull StrategyChain<ProxyInput, ProxyOutput> strategyChain) {
            super(DESCRIPTOR, strategyChain);
            getProxyInputBuilder().addParam(APIParams.m25010id(str));
        }
    }

    public static final class GetOffer extends BaseApiMethod implements IHasIncludeWithOfferParam<GetOffer>, IHasFieldsOfferParam<GetOffer>, IHasFieldsMerchantParam<GetOffer>, IHasFieldsCashbackParam<GetOffer> {
        @NonNull
        public static final ProxyMethodDescriptor DESCRIPTOR;

        static {
            Class<Collection> cls = Collection.class;
            DESCRIPTOR = new ProxyMethodDescriptor(MethodVerb.GET, "offers/{id}", new ParamDescriptorSet(ParamDescriptor.newPathParam("id"), new ParamDescriptor(APIParams.INCLUDE_WITH_OFFER, cls), new ParamDescriptor(APIParams.FIELDS_OFFER, cls), new ParamDescriptor(APIParams.FIELDS_MERCHANT, cls), new ParamDescriptor(APIParams.FIELDS_CASHBACK, cls)), (BodyDescriptor<?>) null, OfferApi.DOCUMENT_DESCRIPTOR, APIServiceDescriptors.SERVICE_DESCRIPTOR, CacheAccessStrategy.linkResourceTable(APICacheDescriptors.CACHE_DESCRIPTOR, APIResourceDescriptors.OFFER, "id"));
        }

        public GetOffer(@NonNull String str, @NonNull StrategyChain<ProxyInput, ProxyOutput> strategyChain) {
            super(DESCRIPTOR, strategyChain);
            getProxyInputBuilder().addParam(APIParams.m25010id(str));
        }
    }

    public static final class GetOffers extends BaseApiMethod implements IHasLimitParam<GetOffers>, IHasIncludeWithOfferParam<GetOffers>, IHasFieldsOfferParam<GetOffers>, IHasFieldsMerchantParam<GetOffers>, IHasFieldsCashbackParam<GetOffers> {
        @NonNull
        public static final ProxyMethodDescriptor DESCRIPTOR;

        static {
            Class<Collection> cls = Collection.class;
            Class<Integer> cls2 = Integer.class;
            DESCRIPTOR = new ProxyMethodDescriptor(MethodVerb.GET, "offers/find", new ParamDescriptorSet(new ParamDescriptor(APIParams.FILTER_OFFER_IDS, cls), new ParamDescriptor("offset", cls2), new ParamDescriptor(APIParams.LIMIT, cls2), new ParamDescriptor(APIParams.INCLUDE_WITH_OFFER, cls), new ParamDescriptor(APIParams.FIELDS_OFFER, cls), new ParamDescriptor(APIParams.FIELDS_MERCHANT, cls), new ParamDescriptor(APIParams.FIELDS_CASHBACK, cls)), (BodyDescriptor<?>) null, OfferApi.DOCUMENT_DESCRIPTOR, APIServiceDescriptors.SERVICE_DESCRIPTOR, CacheAccessStrategy.accessDocumentTable(APICacheDescriptors.CACHE_DESCRIPTOR, new CacheTTL(1, TimeUnit.HOURS)));
        }

        public GetOffers(@NonNull Collection<String> collection, @NonNull StrategyChain<ProxyInput, ProxyOutput> strategyChain) {
            super(DESCRIPTOR, strategyChain);
            getProxyInputBuilder().addParam(APIParams.FILTER_OFFER_IDS, collection);
        }
    }

    public static final class GetSingleUseOffer extends BaseApiMethod {
        @NonNull
        public static final ProxyMethodDescriptor DESCRIPTOR;

        static {
            Class<String> cls = String.class;
            DESCRIPTOR = new ProxyMethodDescriptor(MethodVerb.POST, "offers/{id}/fetchCode", new ParamDescriptorSet(ParamDescriptor.newPathParam("id"), new ParamDescriptor(APIParams.TEST_MODE, Boolean.class), new ParamDescriptor(APIParams.FINGERPRINT, cls), new ParamDescriptor(APIParams.SOURCE, cls)), (BodyDescriptor<?>) null, new JSONAPIDocumentDescriptor(new JSONAPIMetaDescriptor(SingleUseOffer.class, new C11035a()), (ResourceDescriptorSet) null), APIServiceDescriptors.SERVICE_DESCRIPTOR, CacheAccessStrategy.accessDocumentTable(APICacheDescriptors.CACHE_DESCRIPTOR, new CacheTTL(7, TimeUnit.DAYS)));
        }

        public GetSingleUseOffer(@NonNull String str, @NonNull StrategyChain<ProxyInput, ProxyOutput> strategyChain) {
            super(DESCRIPTOR, strategyChain);
            getProxyInputBuilder().addParam(APIParams.m25010id(str));
        }

        /* access modifiers changed from: private */
        public static /* synthetic */ boolean lambda$static$0(SingleUseOffer singleUseOffer) {
            return !TextUtils.isEmpty(singleUseOffer.code);
        }

        @NonNull
        public GetSingleUseOffer setFingerprint(@NonNull String str) {
            getProxyInputBuilder().addParam(APIParams.FINGERPRINT, str);
            return this;
        }

        @NonNull
        public GetSingleUseOffer setSource(@NonNull String str) {
            getProxyInputBuilder().addParam(APIParams.SOURCE, str);
            return this;
        }

        @NonNull
        public GetSingleUseOffer setTestMode(boolean z) {
            getProxyInputBuilder().addParam(APIParams.TEST_MODE, Boolean.valueOf(z));
            return this;
        }
    }
}
