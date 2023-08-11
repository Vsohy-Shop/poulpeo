package com.rmn.api.p322v2.cloud.proxy;

import androidx.annotation.NonNull;
import com.rmn.api.p322v2.cloud.general.CloudMethodParameters;
import com.rmn.api.p322v2.cloud.general.CloudMethodReturns;
import com.rmn.api.p322v2.common.model.BaseCoupon;
import com.rmn.api.p322v2.common.model.BaseMerchant;
import com.rmn.api.p322v2.common.model.CloudList;
import com.rmn.api.p322v2.common.model.submodel.CloudListType;
import com.rmn.api.p322v2.main.cache.ICacheListenerAdd;
import com.rmn.api.p322v2.main.cache.cachebundleinput.CacheBundleInputAdd;
import com.rmn.api.p322v2.main.general.ListenerSecurity;
import com.rmn.api.p322v2.main.general.RequestCounter;
import com.rmn.api.p322v2.main.model.AbstractModel;
import com.rmn.api.p322v2.main.proxy.IProxyListener;
import com.rmn.api.p322v2.main.proxy.ProxyBundleInput;
import com.rmn.api.p322v2.main.proxy.ProxyBundleOutput;
import com.rmn.iosadapters.android.content.ContextContainer;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* renamed from: com.rmn.api.v2.cloud.proxy.CloudListProxy */
public class CloudListProxy extends CloudDefaultProxy {
    /* access modifiers changed from: private */
    public ICloudListCacheHandler cacheHandler;

    /* renamed from: com.rmn.api.v2.cloud.proxy.CloudListProxy$a */
    class C11236a implements IProxyListener {

        /* renamed from: b */
        final /* synthetic */ Set f17791b;

        /* renamed from: c */
        final /* synthetic */ RequestCounter f17792c;

        /* renamed from: d */
        final /* synthetic */ CloudList f17793d;

        /* renamed from: e */
        final /* synthetic */ IProxyListener f17794e;

        /* renamed from: f */
        final /* synthetic */ ProxyBundleInput f17795f;

        /* renamed from: g */
        final /* synthetic */ ProxyBundleOutput f17796g;

        /* renamed from: h */
        final /* synthetic */ ListenerSecurity f17797h;

        C11236a(Set set, RequestCounter requestCounter, CloudList cloudList, IProxyListener iProxyListener, ProxyBundleInput proxyBundleInput, ProxyBundleOutput proxyBundleOutput, ListenerSecurity listenerSecurity) {
            this.f17791b = set;
            this.f17792c = requestCounter;
            this.f17793d = cloudList;
            this.f17794e = iProxyListener;
            this.f17795f = proxyBundleInput;
            this.f17796g = proxyBundleOutput;
            this.f17797h = listenerSecurity;
        }

        public void onProxyActionExecuted(ProxyBundleInput proxyBundleInput, ProxyBundleOutput proxyBundleOutput) {
            BaseMerchant baseMerchant = (BaseMerchant) proxyBundleOutput.getResponseObject(CloudListProxy.this.cacheHandler.getMethodReturnMerchant());
            if (baseMerchant != null) {
                this.f17791b.add(baseMerchant);
            }
            CloudListProxy.this.registerHandledElement(this.f17792c, this.f17793d, this.f17791b, this.f17794e, this.f17795f, this.f17796g, this.f17797h);
        }
    }

    /* renamed from: com.rmn.api.v2.cloud.proxy.CloudListProxy$b */
    class C11237b implements IProxyListener {

        /* renamed from: b */
        final /* synthetic */ Set f17799b;

        /* renamed from: c */
        final /* synthetic */ RequestCounter f17800c;

        /* renamed from: d */
        final /* synthetic */ CloudList f17801d;

        /* renamed from: e */
        final /* synthetic */ IProxyListener f17802e;

        /* renamed from: f */
        final /* synthetic */ ProxyBundleInput f17803f;

        /* renamed from: g */
        final /* synthetic */ ProxyBundleOutput f17804g;

        /* renamed from: h */
        final /* synthetic */ ListenerSecurity f17805h;

        C11237b(Set set, RequestCounter requestCounter, CloudList cloudList, IProxyListener iProxyListener, ProxyBundleInput proxyBundleInput, ProxyBundleOutput proxyBundleOutput, ListenerSecurity listenerSecurity) {
            this.f17799b = set;
            this.f17800c = requestCounter;
            this.f17801d = cloudList;
            this.f17802e = iProxyListener;
            this.f17803f = proxyBundleInput;
            this.f17804g = proxyBundleOutput;
            this.f17805h = listenerSecurity;
        }

        public void onProxyActionExecuted(ProxyBundleInput proxyBundleInput, ProxyBundleOutput proxyBundleOutput) {
            BaseCoupon baseCoupon = (BaseCoupon) proxyBundleOutput.getResponseObject(CloudListProxy.this.cacheHandler.getMethodReturnOffer());
            if (baseCoupon != null) {
                this.f17799b.add(baseCoupon);
            }
            CloudListProxy.this.registerHandledElement(this.f17800c, this.f17801d, this.f17799b, this.f17802e, this.f17803f, this.f17804g, this.f17805h);
        }
    }

    private void detectCacheHandler() {
        if (this.cacheHandler == null) {
            throw new IllegalStateException("You must init the cache handler for the CloudListProxy or it won't be able to cache merchant and offers in DB");
        }
    }

    private CloudList extractCloudList(ProxyBundleOutput proxyBundleOutput) {
        return (CloudList) proxyBundleOutput.getResponseObject(CloudMethodReturns.CLOUD_LIST_DETAIL);
    }

    /* access modifiers changed from: private */
    public void registerHandledElement(RequestCounter requestCounter, CloudList cloudList, Set<AbstractModel> set, IProxyListener iProxyListener, ProxyBundleInput proxyBundleInput, ProxyBundleOutput proxyBundleOutput, ListenerSecurity listenerSecurity) {
        if (requestCounter.decrementCounter()) {
            cloudList.setData(set);
            notifyListener(iProxyListener, proxyBundleInput, proxyBundleOutput, listenerSecurity);
        }
    }

    private void requestForCoupons(ContextContainer contextContainer, IProxyListener iProxyListener, ProxyBundleInput proxyBundleInput, ProxyBundleOutput proxyBundleOutput, ListenerSecurity listenerSecurity, CloudList cloudList) {
        CloudListType cloudListType;
        CloudListType type = cloudList.getType();
        List<String> ids = cloudList.getIds();
        int size = ids.size();
        HashSet hashSet = new HashSet(size);
        ProxyBundleInput.ProxySourcesOption noClearOption = ProxyBundleInput.ProxySourcesOption.getNoClearOption(proxyBundleInput.getSourcesOption());
        RequestCounter requestCounter = new RequestCounter(size);
        for (String next : ids) {
            Class<? extends AbstractModel> elemClass = type.getElemClass(next);
            if (elemClass == null) {
                registerHandledElement(requestCounter, cloudList, hashSet, iProxyListener, proxyBundleInput, proxyBundleOutput, listenerSecurity);
            } else {
                Object parseId = type.parseId(next);
                if (parseId == null || parseId.equals("")) {
                    cloudListType = type;
                    registerHandledElement(requestCounter, cloudList, hashSet, iProxyListener, proxyBundleInput, proxyBundleOutput, listenerSecurity);
                } else if (elemClass.equals(BaseCoupon.class)) {
                    if (!Integer.class.isAssignableFrom(parseId.getClass())) {
                        registerHandledElement(requestCounter, cloudList, hashSet, iProxyListener, proxyBundleInput, proxyBundleOutput, listenerSecurity);
                    } else {
                        ProxyBundleInput newProxyInputOfferGet = this.cacheHandler.newProxyInputOfferGet(contextContainer, ((Integer) parseId).intValue(), noClearOption, proxyBundleInput.getNetworkOption());
                        cloudListType = type;
                        C11237b bVar = r3;
                        C11237b bVar2 = new C11237b(hashSet, requestCounter, cloudList, iProxyListener, proxyBundleInput, proxyBundleOutput, listenerSecurity);
                        newProxyInputOfferGet.executeProxyAction(bVar);
                    }
                } else {
                    cloudListType = type;
                    registerHandledElement(requestCounter, cloudList, hashSet, iProxyListener, proxyBundleInput, proxyBundleOutput, listenerSecurity);
                }
                type = cloudListType;
            }
        }
    }

    private void requestForMerchants(ContextContainer contextContainer, IProxyListener iProxyListener, ProxyBundleInput proxyBundleInput, ProxyBundleOutput proxyBundleOutput, ListenerSecurity listenerSecurity, CloudList cloudList) {
        CloudListType cloudListType;
        CloudListType type = cloudList.getType();
        List<String> ids = cloudList.getIds();
        int size = ids.size();
        HashSet hashSet = new HashSet(size);
        ProxyBundleInput.ProxySourcesOption noClearOption = ProxyBundleInput.ProxySourcesOption.getNoClearOption(proxyBundleInput.getSourcesOption());
        RequestCounter requestCounter = new RequestCounter(size);
        for (String next : ids) {
            Class<? extends AbstractModel> elemClass = type.getElemClass(next);
            if (elemClass == null) {
                registerHandledElement(requestCounter, cloudList, hashSet, iProxyListener, proxyBundleInput, proxyBundleOutput, listenerSecurity);
            } else if (!elemClass.equals(BaseMerchant.class)) {
                registerHandledElement(requestCounter, cloudList, hashSet, iProxyListener, proxyBundleInput, proxyBundleOutput, listenerSecurity);
            } else {
                Object parseId = type.parseId(next);
                if (parseId != null) {
                    if (Integer.class.isAssignableFrom(parseId.getClass())) {
                        ProxyBundleInput newProxyInputMerchantGet = this.cacheHandler.newProxyInputMerchantGet(contextContainer, ((Integer) parseId).intValue(), noClearOption, proxyBundleInput.getNetworkOption());
                        cloudListType = type;
                        C11236a aVar = r3;
                        C11236a aVar2 = new C11236a(hashSet, requestCounter, cloudList, iProxyListener, proxyBundleInput, proxyBundleOutput, listenerSecurity);
                        newProxyInputMerchantGet.executeProxyAction(aVar);
                        type = cloudListType;
                    }
                }
                cloudListType = type;
                registerHandledElement(requestCounter, cloudList, hashSet, iProxyListener, proxyBundleInput, proxyBundleOutput, listenerSecurity);
                type = cloudListType;
            }
        }
    }

    /* access modifiers changed from: protected */
    public void addRetrievedMerchantsToCache(ContextContainer contextContainer, Set<BaseMerchant> set) {
        for (BaseMerchant newCacheInputAddMerchant : set) {
            CacheBundleInputAdd newCacheInputAddMerchant2 = this.cacheHandler.newCacheInputAddMerchant(contextContainer, newCacheInputAddMerchant);
            newCacheInputAddMerchant2.getMethodType().getCache(contextContainer).executeCacheActionAdd((ICacheListenerAdd) null, newCacheInputAddMerchant2);
        }
    }

    /* access modifiers changed from: protected */
    public void addRetrievedOffersAndMerchantsToCache(ContextContainer contextContainer, Set<AbstractModel> set) {
        if (!set.isEmpty()) {
            HashSet hashSet = new HashSet();
            for (AbstractModel next : set) {
                if (next instanceof BaseCoupon) {
                    BaseCoupon baseCoupon = (BaseCoupon) next;
                    BaseMerchant merchant = baseCoupon.getMerchant();
                    if (merchant != null) {
                        hashSet.add(merchant);
                    }
                    CacheBundleInputAdd newCacheInputAddOffer = this.cacheHandler.newCacheInputAddOffer(contextContainer, baseCoupon);
                    newCacheInputAddOffer.getMethodType().getCache(contextContainer).executeCacheActionAdd((ICacheListenerAdd) null, newCacheInputAddOffer);
                } else if (next instanceof BaseMerchant) {
                    hashSet.add((BaseMerchant) next);
                }
            }
            addRetrievedMerchantsToCache(contextContainer, hashSet);
        }
    }

    /* access modifiers changed from: protected */
    public void doAdditionalOperationsAfterRetrievingData(ContextContainer contextContainer, ProxyBundleInput proxyBundleInput, ProxyBundleOutput proxyBundleOutput, boolean z) {
        List<AbstractModel> data;
        detectCacheHandler();
        CloudList extractCloudList = extractCloudList(proxyBundleOutput);
        if (extractCloudList != null) {
            extractCloudList.setListId((String) proxyBundleInput.getParamValue(CloudMethodParameters.ID_LIST));
            if (!z && extractCloudList.getType() != null && (data = extractCloudList.getData()) != null) {
                addRetrievedOffersAndMerchantsToCache(contextContainer, new HashSet(data));
            }
        }
    }

    /* access modifiers changed from: protected */
    public boolean doAdditionalOperationsBeforeNotifyingListener(ContextContainer contextContainer, IProxyListener iProxyListener, ProxyBundleInput proxyBundleInput, ProxyBundleOutput proxyBundleOutput, ListenerSecurity listenerSecurity, boolean z) {
        CloudList extractCloudList;
        CloudListType type;
        detectCacheHandler();
        if (proxyBundleOutput.getStatus() != ProxyBundleOutput.ProxyOutputStatus.OK || (extractCloudList = extractCloudList(proxyBundleOutput)) == null || (type = extractCloudList.getType()) == null || extractCloudList.getData() != null) {
            return false;
        }
        List<String> ids = extractCloudList.getIds();
        if (ids == null || ids.isEmpty()) {
            extractCloudList.setData(new HashSet());
            notifyListener(iProxyListener, proxyBundleInput, proxyBundleOutput, listenerSecurity);
            return true;
        }
        if (type == CloudListType.MERCHANT) {
            requestForMerchants(contextContainer, iProxyListener, proxyBundleInput, proxyBundleOutput, listenerSecurity, extractCloudList);
        } else {
            requestForCoupons(contextContainer, iProxyListener, proxyBundleInput, proxyBundleOutput, listenerSecurity, extractCloudList);
        }
        return true;
    }

    public void setCacheHandler(@NonNull ICloudListCacheHandler iCloudListCacheHandler) {
        this.cacheHandler = iCloudListCacheHandler;
    }
}
