package com.rmn.api.p322v2.poulpeo.proxy;

import com.rmn.api.p322v2.common.model.BaseMerchant;
import com.rmn.api.p322v2.common.model.PinnedObject;
import com.rmn.api.p322v2.common.pinned_object.PinnedObjectModel;
import com.rmn.api.p322v2.main.cache.ICacheListenerAdd;
import com.rmn.api.p322v2.main.cache.cachebundleinput.CacheBundleInputAdd;
import com.rmn.api.p322v2.main.general.ListenerSecurity;
import com.rmn.api.p322v2.main.general.RequestCounter;
import com.rmn.api.p322v2.main.model.AbstractModel;
import com.rmn.api.p322v2.main.proxy.IProxyListener;
import com.rmn.api.p322v2.main.proxy.ProxyBundleInput;
import com.rmn.api.p322v2.main.proxy.ProxyBundleOutput;
import com.rmn.api.p322v2.poulpeo.cache.methods.CacheMethodsPLPMerchant;
import com.rmn.api.p322v2.poulpeo.general.PLPMethodParameters;
import com.rmn.api.p322v2.poulpeo.general.PLPMethodReturns;
import com.rmn.api.p322v2.poulpeo.proxy.methods.ProxyMethodsPLPMerchant;
import com.rmn.iosadapters.android.content.ContextContainer;
import java.util.HashSet;
import java.util.Set;

/* renamed from: com.rmn.api.v2.poulpeo.proxy.PLPPinnedObjectProxy */
public class PLPPinnedObjectProxy extends PLPDefaultProxy {

    /* renamed from: com.rmn.api.v2.poulpeo.proxy.PLPPinnedObjectProxy$a */
    class C11511a implements IProxyListener {

        /* renamed from: b */
        final /* synthetic */ PinnedObject f17990b;

        /* renamed from: c */
        final /* synthetic */ RequestCounter f17991c;

        /* renamed from: d */
        final /* synthetic */ IProxyListener f17992d;

        /* renamed from: e */
        final /* synthetic */ ProxyBundleInput f17993e;

        /* renamed from: f */
        final /* synthetic */ ProxyBundleOutput f17994f;

        /* renamed from: g */
        final /* synthetic */ ListenerSecurity f17995g;

        C11511a(PinnedObject pinnedObject, RequestCounter requestCounter, IProxyListener iProxyListener, ProxyBundleInput proxyBundleInput, ProxyBundleOutput proxyBundleOutput, ListenerSecurity listenerSecurity) {
            this.f17990b = pinnedObject;
            this.f17991c = requestCounter;
            this.f17992d = iProxyListener;
            this.f17993e = proxyBundleInput;
            this.f17994f = proxyBundleOutput;
            this.f17995g = listenerSecurity;
        }

        public void onProxyActionExecuted(ProxyBundleInput proxyBundleInput, ProxyBundleOutput proxyBundleOutput) {
            BaseMerchant baseMerchant = (BaseMerchant) proxyBundleOutput.getResponseObject(PLPMethodReturns.PLP_MERCHANT_DETAIL);
            if (baseMerchant != null) {
                this.f17990b.setPinnedModelRef(baseMerchant.getModelRef());
            }
            PLPPinnedObjectProxy.this.registerHandledElement(this.f17991c, this.f17992d, this.f17993e, this.f17994f, this.f17995g);
        }
    }

    private Set<PinnedObject> extractPinnedObjects(ProxyBundleOutput proxyBundleOutput) {
        HashSet hashSet = new HashSet();
        PinnedObject[] pinnedObjectArr = (PinnedObject[]) proxyBundleOutput.getResponseObject(PLPMethodReturns.PLP_PINNED_OBJECT_ARRAY);
        if (pinnedObjectArr == null) {
            return hashSet;
        }
        for (PinnedObject pinnedObject : pinnedObjectArr) {
            if (pinnedObject != null) {
                hashSet.add(pinnedObject);
            }
        }
        return hashSet;
    }

    private void fetchMerchant(ContextContainer contextContainer, RequestCounter requestCounter, IProxyListener iProxyListener, ProxyBundleInput.ProxySourcesOption proxySourcesOption, ProxyBundleInput proxyBundleInput, ProxyBundleOutput proxyBundleOutput, ListenerSecurity listenerSecurity, PinnedObject pinnedObject) {
        if (pinnedObject.getModel() == PinnedObjectModel.MERCHANT) {
            ProxyBundleInput proxyBundleInput2 = new ProxyBundleInput(contextContainer, ProxyMethodsPLPMerchant.GET_DETAILS, proxySourcesOption, proxyBundleInput.getNetworkOption(), proxyBundleInput.getLogoutListener());
            proxyBundleInput2.addParamValue(PLPMethodParameters.ID_PLP_MERCHANT_REQUIRED, Integer.valueOf(pinnedObject.getModelId()));
            proxyBundleInput2.executeProxyAction(new C11511a(pinnedObject, requestCounter, iProxyListener, proxyBundleInput, proxyBundleOutput, listenerSecurity));
            return;
        }
        registerHandledElement(requestCounter, iProxyListener, proxyBundleInput, proxyBundleOutput, listenerSecurity);
    }

    /* access modifiers changed from: private */
    public void registerHandledElement(RequestCounter requestCounter, IProxyListener iProxyListener, ProxyBundleInput proxyBundleInput, ProxyBundleOutput proxyBundleOutput, ListenerSecurity listenerSecurity) {
        if (requestCounter.decrementCounter()) {
            notifyListener(iProxyListener, proxyBundleInput, proxyBundleOutput, listenerSecurity);
        }
    }

    /* access modifiers changed from: protected */
    public void doAdditionalOperationsAfterRetrievingData(ContextContainer contextContainer, ProxyBundleInput proxyBundleInput, ProxyBundleOutput proxyBundleOutput, boolean z) {
        if (!z && proxyBundleOutput.getStatus() == ProxyBundleOutput.ProxyOutputStatus.OK) {
            Set<PinnedObject> extractPinnedObjects = extractPinnedObjects(proxyBundleOutput);
            if (!extractPinnedObjects.isEmpty()) {
                HashSet<AbstractModel> hashSet = new HashSet<>();
                for (PinnedObject pinnedModel : extractPinnedObjects) {
                    AbstractModel pinnedModel2 = pinnedModel.getPinnedModel();
                    if (pinnedModel2 != null) {
                        hashSet.add(pinnedModel2);
                    }
                }
                for (AbstractModel abstractModel : hashSet) {
                    if (abstractModel instanceof BaseMerchant) {
                        BaseMerchant baseMerchant = (BaseMerchant) abstractModel;
                        CacheBundleInputAdd cacheBundleInputAdd = new CacheBundleInputAdd(contextContainer, CacheMethodsPLPMerchant.GET_DETAILS, CacheBundleInputAdd.AddOption.REPLACE_IF_EXISTING);
                        cacheBundleInputAdd.addParamValue(PLPMethodParameters.ID_PLP_MERCHANT_REQUIRED, Integer.valueOf(baseMerchant.getMerchantId()));
                        cacheBundleInputAdd.addObjectToStore(PLPMethodReturns.PLP_MERCHANT_DETAIL, baseMerchant);
                        cacheBundleInputAdd.getMethodType().getCache(contextContainer).executeCacheActionAdd((ICacheListenerAdd) null, cacheBundleInputAdd);
                    }
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    public boolean doAdditionalOperationsBeforeNotifyingListener(ContextContainer contextContainer, IProxyListener iProxyListener, ProxyBundleInput proxyBundleInput, ProxyBundleOutput proxyBundleOutput, ListenerSecurity listenerSecurity, boolean z) {
        if (proxyBundleOutput.getStatus() != ProxyBundleOutput.ProxyOutputStatus.OK) {
            return false;
        }
        Set<PinnedObject> extractPinnedObjects = extractPinnedObjects(proxyBundleOutput);
        if (extractPinnedObjects.isEmpty()) {
            return false;
        }
        ProxyBundleInput.ProxySourcesOption sourcesOption = proxyBundleInput.getSourcesOption();
        if (sourcesOption == ProxyBundleInput.ProxySourcesOption.CLEAR_CACHE_THEN_GET_FROM_NETWORK) {
            sourcesOption = ProxyBundleInput.ProxySourcesOption.GET_FROM_CACHE_THEN_NETWORK;
        }
        RequestCounter requestCounter = new RequestCounter(extractPinnedObjects.size());
        for (PinnedObject next : extractPinnedObjects) {
            if (next.getPinnedModel() == null) {
                fetchMerchant(contextContainer, requestCounter, iProxyListener, sourcesOption, proxyBundleInput, proxyBundleOutput, listenerSecurity, next);
            } else if (z) {
                fetchMerchant(contextContainer, requestCounter, iProxyListener, ProxyBundleInput.ProxySourcesOption.GET_FROM_CACHE_ONLY, proxyBundleInput, proxyBundleOutput, listenerSecurity, next);
            } else {
                registerHandledElement(requestCounter, iProxyListener, proxyBundleInput, proxyBundleOutput, listenerSecurity);
            }
        }
        return true;
    }
}
