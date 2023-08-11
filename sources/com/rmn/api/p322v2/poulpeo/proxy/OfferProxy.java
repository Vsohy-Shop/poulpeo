package com.rmn.api.p322v2.poulpeo.proxy;

import com.rmn.api.p322v2.common.model.BaseCoupon;
import com.rmn.api.p322v2.common.model.BaseMerchant;
import com.rmn.api.p322v2.common.user.LogoutListener;
import com.rmn.api.p322v2.main.cache.ICacheListenerAdd;
import com.rmn.api.p322v2.main.cache.cachebundleinput.CacheBundleInputAdd;
import com.rmn.api.p322v2.main.general.ListenerSecurity;
import com.rmn.api.p322v2.main.general.RequestCounter;
import com.rmn.api.p322v2.main.general.methodreturn.RMNMethodReturnJSON;
import com.rmn.api.p322v2.main.model.AbstractModel;
import com.rmn.api.p322v2.main.proxy.IProxyListener;
import com.rmn.api.p322v2.main.proxy.IProxyMethodType;
import com.rmn.api.p322v2.main.proxy.ProxyBundleInput;
import com.rmn.api.p322v2.main.proxy.ProxyBundleOutput;
import com.rmn.api.p322v2.poulpeo.cache.methods.CacheMethodsPLPMerchant;
import com.rmn.api.p322v2.poulpeo.general.PLPMethodParameters;
import com.rmn.api.p322v2.poulpeo.general.PLPMethodReturns;
import com.rmn.api.p322v2.poulpeo.proxy.methods.ProxyMethodsPLPMerchant;
import com.rmn.iosadapters.android.content.ContextContainer;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* renamed from: com.rmn.api.v2.poulpeo.proxy.OfferProxy */
public class OfferProxy extends PLPDefaultProxy {

    /* renamed from: com.rmn.api.v2.poulpeo.proxy.OfferProxy$a */
    class C11507a implements IProxyListener {

        /* renamed from: b */
        final /* synthetic */ BaseCoupon f17964b;

        /* renamed from: c */
        final /* synthetic */ RequestCounter f17965c;

        /* renamed from: d */
        final /* synthetic */ IProxyListener f17966d;

        /* renamed from: e */
        final /* synthetic */ ProxyBundleInput f17967e;

        /* renamed from: f */
        final /* synthetic */ ProxyBundleOutput f17968f;

        /* renamed from: g */
        final /* synthetic */ ListenerSecurity f17969g;

        C11507a(BaseCoupon baseCoupon, RequestCounter requestCounter, IProxyListener iProxyListener, ProxyBundleInput proxyBundleInput, ProxyBundleOutput proxyBundleOutput, ListenerSecurity listenerSecurity) {
            this.f17964b = baseCoupon;
            this.f17965c = requestCounter;
            this.f17966d = iProxyListener;
            this.f17967e = proxyBundleInput;
            this.f17968f = proxyBundleOutput;
            this.f17969g = listenerSecurity;
        }

        public void onProxyActionExecuted(ProxyBundleInput proxyBundleInput, ProxyBundleOutput proxyBundleOutput) {
            BaseMerchant baseMerchant = (BaseMerchant) proxyBundleOutput.getResponseObject(PLPMethodReturns.PLP_MERCHANT_DETAIL);
            if (baseMerchant != null) {
                this.f17964b.setMerchantRef(baseMerchant.getMerchantModelReference());
            }
            OfferProxy.this.registerHandledElement(this.f17965c, this.f17966d, this.f17967e, this.f17968f, this.f17969g);
        }
    }

    private void addRetrievedMerchantsToCache(ContextContainer contextContainer, Set<BaseMerchant> set) {
        for (BaseMerchant next : set) {
            CacheBundleInputAdd cacheBundleInputAdd = new CacheBundleInputAdd(contextContainer, CacheMethodsPLPMerchant.GET_DETAILS, CacheBundleInputAdd.AddOption.REPLACE_IF_EXISTING);
            cacheBundleInputAdd.addParamValue(PLPMethodParameters.ID_PLP_MERCHANT_REQUIRED, Integer.valueOf(next.getMerchantId()));
            cacheBundleInputAdd.addObjectToStore(PLPMethodReturns.PLP_MERCHANT_DETAIL, next);
            cacheBundleInputAdd.getMethodType().getCache(contextContainer).executeCacheActionAdd((ICacheListenerAdd) null, cacheBundleInputAdd);
        }
    }

    private Set<AbstractModel> extractCoupons(ContextContainer contextContainer, ProxyBundleInput proxyBundleInput, ProxyBundleOutput proxyBundleOutput) {
        BaseCoupon[] baseCouponArr;
        HashSet hashSet = new HashSet();
        IProxyMethodType proxyMethod = proxyBundleInput.getProxyMethod();
        RMNMethodReturnJSON rMNMethodReturnJSON = PLPMethodReturns.OFFER_DETAIL;
        if (proxyMethod.hasReturn(contextContainer, rMNMethodReturnJSON)) {
            BaseCoupon baseCoupon = (BaseCoupon) proxyBundleOutput.getResponseObject(rMNMethodReturnJSON);
            if (baseCoupon != null) {
                hashSet.add(baseCoupon);
            }
        } else {
            IProxyMethodType proxyMethod2 = proxyBundleInput.getProxyMethod();
            RMNMethodReturnJSON rMNMethodReturnJSON2 = PLPMethodReturns.OFFERS_ARRAY;
            if (proxyMethod2.hasReturn(contextContainer, rMNMethodReturnJSON2) && (baseCouponArr = (BaseCoupon[]) proxyBundleOutput.getResponseObject(rMNMethodReturnJSON2)) != null) {
                for (BaseCoupon baseCoupon2 : baseCouponArr) {
                    if (baseCoupon2 != null) {
                        hashSet.add(baseCoupon2);
                    }
                }
            }
        }
        return hashSet;
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
            Set<AbstractModel> extractCoupons = extractCoupons(contextContainer, proxyBundleInput, proxyBundleOutput);
            if (!extractCoupons.isEmpty()) {
                HashSet hashSet = new HashSet();
                Iterator<AbstractModel> it = extractCoupons.iterator();
                while (it.hasNext()) {
                    BaseMerchant merchant = ((BaseCoupon) it.next()).getMerchant();
                    if (merchant != null) {
                        hashSet.add(merchant);
                    }
                }
                addRetrievedMerchantsToCache(contextContainer, hashSet);
            }
        }
    }

    /* access modifiers changed from: protected */
    public boolean doAdditionalOperationsBeforeNotifyingListener(ContextContainer contextContainer, IProxyListener iProxyListener, ProxyBundleInput proxyBundleInput, ProxyBundleOutput proxyBundleOutput, ListenerSecurity listenerSecurity, boolean z) {
        if (proxyBundleOutput.getStatus() != ProxyBundleOutput.ProxyOutputStatus.OK) {
            return false;
        }
        Set<AbstractModel> extractCoupons = extractCoupons(contextContainer, proxyBundleInput, proxyBundleOutput);
        if (extractCoupons.isEmpty()) {
            return false;
        }
        ProxyBundleInput.ProxySourcesOption noClearOption = ProxyBundleInput.ProxySourcesOption.getNoClearOption(proxyBundleInput.getSourcesOption());
        RequestCounter requestCounter = new RequestCounter(extractCoupons.size());
        Iterator<AbstractModel> it = extractCoupons.iterator();
        while (it.hasNext()) {
            BaseCoupon baseCoupon = (BaseCoupon) it.next();
            if (baseCoupon.getMerchant() != null) {
                registerHandledElement(requestCounter, iProxyListener, proxyBundleInput, proxyBundleOutput, listenerSecurity);
            } else {
                ProxyBundleInput proxyBundleInput2 = new ProxyBundleInput(contextContainer, ProxyMethodsPLPMerchant.GET_DETAILS, noClearOption, proxyBundleInput.getNetworkOption(), (LogoutListener) null);
                proxyBundleInput2.addParamValue(PLPMethodParameters.ID_PLP_MERCHANT_REQUIRED, Integer.valueOf(baseCoupon.getMerchantId()));
                C11507a aVar = r3;
                C11507a aVar2 = new C11507a(baseCoupon, requestCounter, iProxyListener, proxyBundleInput, proxyBundleOutput, listenerSecurity);
                proxyBundleInput2.executeProxyAction(aVar);
            }
        }
        return true;
    }
}
