package com.rmn.api.p322v2.poulpeo.proxy;

import com.rmn.api.p322v2.main.cache.CacheBundleOutput;
import com.rmn.api.p322v2.main.cache.ICacheListenerAdd;
import com.rmn.api.p322v2.main.cache.ICacheListenerGet;
import com.rmn.api.p322v2.main.cache.cachebundleinput.CacheBundleInputAdd;
import com.rmn.api.p322v2.main.cache.cachebundleinput.CacheBundleInputGet;
import com.rmn.api.p322v2.main.general.ListenerSecurity;
import com.rmn.api.p322v2.main.general.responseobject.RMNResponseObjectImmutable;
import com.rmn.api.p322v2.main.proxy.IProxyListener;
import com.rmn.api.p322v2.main.proxy.ProxyBundleInput;
import com.rmn.api.p322v2.main.proxy.ProxyBundleOutput;
import com.rmn.api.p322v2.poulpeo.cache.methods.CacheMethodsPLPUser;
import com.rmn.api.p322v2.poulpeo.general.PLPMethodReturns;
import com.rmn.api.p322v2.poulpeo.model.EarningAmount;
import com.rmn.api.p322v2.poulpeo.model.PLPUser;
import com.rmn.api.p322v2.poulpeo.proxy.methods.ProxyMethodsPLPUser;
import com.rmn.iosadapters.android.content.ContextContainer;
import p446vd.C13633n;

/* renamed from: com.rmn.api.v2.poulpeo.proxy.PLPUserProxy */
public class PLPUserProxy extends PLPDefaultProxy {

    /* renamed from: com.rmn.api.v2.poulpeo.proxy.PLPUserProxy$a */
    class C11512a implements ICacheListenerGet {

        /* renamed from: a */
        final /* synthetic */ IProxyListener f17997a;

        /* renamed from: b */
        final /* synthetic */ ProxyBundleInput f17998b;

        /* renamed from: c */
        final /* synthetic */ ProxyBundleOutput f17999c;

        /* renamed from: d */
        final /* synthetic */ ListenerSecurity f18000d;

        /* renamed from: e */
        final /* synthetic */ PLPUser f18001e;

        C11512a(IProxyListener iProxyListener, ProxyBundleInput proxyBundleInput, ProxyBundleOutput proxyBundleOutput, ListenerSecurity listenerSecurity, PLPUser pLPUser) {
            this.f17997a = iProxyListener;
            this.f17998b = proxyBundleInput;
            this.f17999c = proxyBundleOutput;
            this.f18000d = listenerSecurity;
            this.f18001e = pLPUser;
        }

        public void onCacheActionGetExecuted(CacheBundleInputGet cacheBundleInputGet, CacheBundleOutput cacheBundleOutput) {
            RMNResponseObjectImmutable retrievedCachedObject = cacheBundleOutput.getRetrievedCachedObject(PLPMethodReturns.EARNING_AMOUNT_DETAIL);
            if (retrievedCachedObject == null) {
                C13633n.m31145a(PLPUserProxy.class, "No EarningAmount found in cache");
                PLPUserProxy.this.notifyListener(this.f17997a, this.f17998b, this.f17999c, this.f18000d);
                return;
            }
            EarningAmount earningAmount = (EarningAmount) retrievedCachedObject.getRetrievedObject();
            if (earningAmount != null) {
                this.f18001e.setEarningAmount(earningAmount);
            }
            PLPUserProxy.this.notifyListener(this.f17997a, this.f17998b, this.f17999c, this.f18000d);
        }
    }

    private PLPUser extractUser(ProxyBundleInput proxyBundleInput, ProxyBundleOutput proxyBundleOutput) {
        if (proxyBundleInput.getProxyMethod() == ProxyMethodsPLPUser.PLP_USER_GET_DETAILS) {
            return (PLPUser) proxyBundleOutput.getResponseObject(PLPMethodReturns.PLP_USER_DETAIL);
        }
        return null;
    }

    /* access modifiers changed from: protected */
    public void doAdditionalOperationsAfterRetrievingData(ContextContainer contextContainer, ProxyBundleInput proxyBundleInput, ProxyBundleOutput proxyBundleOutput, boolean z) {
        PLPUser extractUser;
        EarningAmount earningAmount;
        if (proxyBundleOutput.getStatus() == ProxyBundleOutput.ProxyOutputStatus.OK && (extractUser = extractUser(proxyBundleInput, proxyBundleOutput)) != null) {
            notifyUserUpdate(extractUser);
            if (!z && (earningAmount = extractUser.getEarningAmount()) != null) {
                CacheBundleInputAdd cacheBundleInputAdd = new CacheBundleInputAdd(contextContainer, CacheMethodsPLPUser.EARNING_AMOUNT_DETAILS, CacheBundleInputAdd.AddOption.REPLACE_IF_EXISTING);
                cacheBundleInputAdd.addObjectToStore(PLPMethodReturns.EARNING_AMOUNT_DETAIL, earningAmount);
                cacheBundleInputAdd.getMethodType().getCache(contextContainer).executeCacheActionAdd((ICacheListenerAdd) null, cacheBundleInputAdd);
            }
        }
    }

    /* access modifiers changed from: protected */
    public boolean doAdditionalOperationsBeforeNotifyingListener(ContextContainer contextContainer, IProxyListener iProxyListener, ProxyBundleInput proxyBundleInput, ProxyBundleOutput proxyBundleOutput, ListenerSecurity listenerSecurity, boolean z) {
        PLPUser extractUser;
        if (proxyBundleOutput.getStatus() != ProxyBundleOutput.ProxyOutputStatus.OK || (extractUser = extractUser(proxyBundleInput, proxyBundleOutput)) == null || extractUser.getEarningAmount() != null) {
            return false;
        }
        CacheBundleInputGet cacheBundleInputGet = new CacheBundleInputGet(contextContainer, CacheMethodsPLPUser.EARNING_AMOUNT_DETAILS);
        cacheBundleInputGet.getMethodType().getCache(contextContainer).executeCacheActionGet(new C11512a(iProxyListener, proxyBundleInput, proxyBundleOutput, listenerSecurity, extractUser), cacheBundleInputGet);
        return true;
    }
}
