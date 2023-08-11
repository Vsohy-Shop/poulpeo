package com.rmn.api.p322v2.poulpeo.proxy;

import com.rmn.api.p322v2.common.model.BaseMerchant;
import com.rmn.api.p322v2.main.cache.CacheBundleOutput;
import com.rmn.api.p322v2.main.cache.ICacheListenerAdd;
import com.rmn.api.p322v2.main.cache.ICacheListenerClear;
import com.rmn.api.p322v2.main.cache.ICacheListenerGet;
import com.rmn.api.p322v2.main.cache.ICacheMethodType;
import com.rmn.api.p322v2.main.cache.cacheaccess.AbstractCache;
import com.rmn.api.p322v2.main.cache.cachebundleinput.CacheBundleInputAdd;
import com.rmn.api.p322v2.main.cache.cachebundleinput.CacheBundleInputClear;
import com.rmn.api.p322v2.main.cache.cachebundleinput.CacheBundleInputGet;
import com.rmn.api.p322v2.main.general.ListenerSecurity;
import com.rmn.api.p322v2.main.general.RequestCounter;
import com.rmn.api.p322v2.main.general.methodparam.RMNMethodParam;
import com.rmn.api.p322v2.main.general.responseobject.RMNResponseObjectImmutable;
import com.rmn.api.p322v2.main.proxy.IProxyListener;
import com.rmn.api.p322v2.main.proxy.ProxyBundleInput;
import com.rmn.api.p322v2.main.proxy.ProxyBundleOutput;
import com.rmn.api.p322v2.poulpeo.cache.methods.CacheMethodsPLPHome;
import com.rmn.api.p322v2.poulpeo.general.PLPMethodParameters;
import com.rmn.api.p322v2.poulpeo.general.PLPMethodReturns;
import com.rmn.api.p322v2.poulpeo.model.BaseHomeSection;
import com.rmn.api.p322v2.poulpeo.model.HomeSectionMerchant;
import com.rmn.api.p322v2.poulpeo.model.HomeSectionRef;
import com.rmn.api.p322v2.poulpeo.model.HomeSectionType;
import com.rmn.api.p322v2.poulpeo.model.PLPUser;
import com.rmn.api.p322v2.poulpeo.proxy.methods.ProxyMethodsHome;
import com.rmn.iosadapters.android.content.ContextContainer;
import java.util.Arrays;
import p446vd.C13633n;

/* renamed from: com.rmn.api.v2.poulpeo.proxy.PLPHomeProxy */
public class PLPHomeProxy extends PLPDefaultProxy {

    /* renamed from: com.rmn.api.v2.poulpeo.proxy.PLPHomeProxy$a */
    class C11508a implements ICacheListenerClear {

        /* renamed from: a */
        final /* synthetic */ ContextContainer f17971a;

        /* renamed from: b */
        final /* synthetic */ ProxyBundleInput f17972b;

        /* renamed from: c */
        final /* synthetic */ ProxyBundleOutput f17973c;

        C11508a(ContextContainer contextContainer, ProxyBundleInput proxyBundleInput, ProxyBundleOutput proxyBundleOutput) {
            this.f17971a = contextContainer;
            this.f17972b = proxyBundleInput;
            this.f17973c = proxyBundleOutput;
        }

        public void onCacheActionClearExecuted(CacheBundleInputClear cacheBundleInputClear, CacheBundleOutput.CacheOutputStatus cacheOutputStatus) {
            PLPHomeProxy.this.saveNewSectionsToCache(this.f17971a, this.f17972b, this.f17973c);
        }
    }

    /* renamed from: com.rmn.api.v2.poulpeo.proxy.PLPHomeProxy$b */
    class C11509b implements ICacheListenerGet {

        /* renamed from: a */
        final /* synthetic */ HomeSectionRef f17975a;

        /* renamed from: b */
        final /* synthetic */ RequestCounter f17976b;

        /* renamed from: c */
        final /* synthetic */ IProxyListener f17977c;

        /* renamed from: d */
        final /* synthetic */ ProxyBundleInput f17978d;

        /* renamed from: e */
        final /* synthetic */ ProxyBundleOutput f17979e;

        /* renamed from: f */
        final /* synthetic */ ListenerSecurity f17980f;

        /* renamed from: g */
        final /* synthetic */ ContextContainer f17981g;

        C11509b(HomeSectionRef homeSectionRef, RequestCounter requestCounter, IProxyListener iProxyListener, ProxyBundleInput proxyBundleInput, ProxyBundleOutput proxyBundleOutput, ListenerSecurity listenerSecurity, ContextContainer contextContainer) {
            this.f17975a = homeSectionRef;
            this.f17976b = requestCounter;
            this.f17977c = iProxyListener;
            this.f17978d = proxyBundleInput;
            this.f17979e = proxyBundleOutput;
            this.f17980f = listenerSecurity;
            this.f17981g = contextContainer;
        }

        public void onCacheActionGetExecuted(CacheBundleInputGet cacheBundleInputGet, CacheBundleOutput cacheBundleOutput) {
            RMNResponseObjectImmutable retrievedCachedObject = cacheBundleOutput.getRetrievedCachedObject(this.f17975a.getType().getReturnType());
            if (retrievedCachedObject == null) {
                C13633n.m31145a(PLPHomeProxy.class, "No HomeSection found in cache for ID : " + this.f17975a.getHomeSectionId());
                PLPHomeProxy.this.registerHandledElement(this.f17976b, this.f17977c, this.f17978d, this.f17979e, this.f17980f);
                PLPHomeProxy.this.registerHandledElement(this.f17976b, this.f17977c, this.f17978d, this.f17979e, this.f17980f);
                return;
            }
            BaseHomeSection baseHomeSection = (BaseHomeSection) retrievedCachedObject.getRetrievedObject();
            if (baseHomeSection != null) {
                this.f17975a.setSection(baseHomeSection);
                PLPHomeProxy.this.fetchMerchants(this.f17981g, this.f17976b, this.f17977c, this.f17978d, this.f17979e, this.f17980f, baseHomeSection);
            } else {
                PLPHomeProxy.this.registerHandledElement(this.f17976b, this.f17977c, this.f17978d, this.f17979e, this.f17980f);
            }
            PLPHomeProxy.this.registerHandledElement(this.f17976b, this.f17977c, this.f17978d, this.f17979e, this.f17980f);
        }
    }

    /* renamed from: com.rmn.api.v2.poulpeo.proxy.PLPHomeProxy$c */
    class C11510c implements IProxyListener {

        /* renamed from: b */
        final /* synthetic */ RequestCounter f17983b;

        /* renamed from: c */
        final /* synthetic */ IProxyListener f17984c;

        /* renamed from: d */
        final /* synthetic */ ProxyBundleInput f17985d;

        /* renamed from: e */
        final /* synthetic */ ProxyBundleOutput f17986e;

        /* renamed from: f */
        final /* synthetic */ ListenerSecurity f17987f;

        /* renamed from: g */
        final /* synthetic */ BaseHomeSection f17988g;

        C11510c(RequestCounter requestCounter, IProxyListener iProxyListener, ProxyBundleInput proxyBundleInput, ProxyBundleOutput proxyBundleOutput, ListenerSecurity listenerSecurity, BaseHomeSection baseHomeSection) {
            this.f17983b = requestCounter;
            this.f17984c = iProxyListener;
            this.f17985d = proxyBundleInput;
            this.f17986e = proxyBundleOutput;
            this.f17987f = listenerSecurity;
            this.f17988g = baseHomeSection;
        }

        public void onProxyActionExecuted(ProxyBundleInput proxyBundleInput, ProxyBundleOutput proxyBundleOutput) {
            if (proxyBundleOutput.getStatus() != ProxyBundleOutput.ProxyOutputStatus.OK) {
                PLPHomeProxy.this.registerHandledElement(this.f17983b, this.f17984c, this.f17985d, this.f17986e, this.f17987f);
                return;
            }
            BaseMerchant[] baseMerchantArr = (BaseMerchant[]) proxyBundleOutput.getResponseObject(PLPMethodReturns.PLP_MERCHANT_ARRAY);
            if (baseMerchantArr != null && baseMerchantArr.length > 0) {
                ((HomeSectionMerchant) this.f17988g).setMerchants(Arrays.asList(baseMerchantArr));
            }
            PLPHomeProxy.this.registerHandledElement(this.f17983b, this.f17984c, this.f17985d, this.f17986e, this.f17987f);
        }
    }

    private HomeSectionRef[] extractHomeSectionRefArray(ContextContainer contextContainer, ProxyBundleInput proxyBundleInput, ProxyBundleOutput proxyBundleOutput) {
        if (proxyBundleInput.getProxyMethod() == ProxyMethodsHome.APP_HOME) {
            return (HomeSectionRef[]) proxyBundleOutput.getResponseObject(PLPMethodReturns.HOME_SECTION_REF_ARRAY);
        }
        return null;
    }

    /* access modifiers changed from: private */
    public void fetchMerchants(ContextContainer contextContainer, RequestCounter requestCounter, IProxyListener iProxyListener, ProxyBundleInput proxyBundleInput, ProxyBundleOutput proxyBundleOutput, ListenerSecurity listenerSecurity, BaseHomeSection baseHomeSection) {
        ProxyBundleInput.ProxySourcesOption sourcesOption = proxyBundleInput.getSourcesOption();
        if (sourcesOption == ProxyBundleInput.ProxySourcesOption.CLEAR_CACHE_THEN_GET_FROM_NETWORK) {
            sourcesOption = ProxyBundleInput.ProxySourcesOption.GET_FROM_CACHE_THEN_NETWORK;
        }
        fetchMerchants(contextContainer, requestCounter, iProxyListener, sourcesOption, proxyBundleInput, proxyBundleOutput, listenerSecurity, baseHomeSection);
    }

    /* access modifiers changed from: private */
    public void registerHandledElement(RequestCounter requestCounter, IProxyListener iProxyListener, ProxyBundleInput proxyBundleInput, ProxyBundleOutput proxyBundleOutput, ListenerSecurity listenerSecurity) {
        if (requestCounter.decrementCounter()) {
            notifyListener(iProxyListener, proxyBundleInput, proxyBundleOutput, listenerSecurity);
        }
    }

    /* access modifiers changed from: private */
    public void saveNewSectionsToCache(ContextContainer contextContainer, ProxyBundleInput proxyBundleInput, ProxyBundleOutput proxyBundleOutput) {
        for (HomeSectionRef homeSectionRef : extractHomeSectionRefArray(contextContainer, proxyBundleInput, proxyBundleOutput)) {
            BaseHomeSection section = homeSectionRef.getSection();
            if (section == null) {
                C13633n.m31145a(this, "Section null in HomeSectionRef");
            } else {
                HomeSectionType type = homeSectionRef.getType();
                ICacheMethodType cacheMethod = type.getCacheMethod();
                CacheBundleInputAdd.AddOption addOption = CacheBundleInputAdd.AddOption.REPLACE_IF_EXISTING;
                CacheBundleInputAdd cacheBundleInputAdd = new CacheBundleInputAdd(contextContainer, cacheMethod, addOption);
                cacheBundleInputAdd.addParamValue(PLPMethodParameters.SECTION_IDENTIFIER, section.getIdentifier());
                cacheBundleInputAdd.addObjectToStore(type.getReturnType(), section);
                cacheBundleInputAdd.getMethodType().getCache(contextContainer).executeCacheActionAdd((ICacheListenerAdd) null, cacheBundleInputAdd);
                if (type != HomeSectionType.BANNER) {
                    CacheBundleInputAdd cacheBundleInputAdd2 = new CacheBundleInputAdd(contextContainer, CacheMethodsPLPHome.APP_GET_MERCHANTS_BY_TAG, addOption);
                    cacheBundleInputAdd2.addParamValue(PLPMethodParameters.SECTION_TAG, section.getTag());
                    RMNMethodParam rMNMethodParam = PLPMethodParameters.LIMIT;
                    int intValue = ((Integer) proxyBundleInput.getParamValue(rMNMethodParam)).intValue();
                    if (intValue > 0) {
                        cacheBundleInputAdd2.addParamValue(PLPMethodParameters.OFFSET, 0);
                        cacheBundleInputAdd2.addParamValue(rMNMethodParam, Integer.valueOf(intValue));
                    }
                    HomeSectionMerchant homeSectionMerchant = (HomeSectionMerchant) section;
                    cacheBundleInputAdd2.addObjectToStore(PLPMethodReturns.PLP_MERCHANT_ARRAY, (BaseMerchant[]) homeSectionMerchant.getMerchants().toArray(new BaseMerchant[homeSectionMerchant.getMerchants().size()]));
                    cacheBundleInputAdd2.getMethodType().getCache(contextContainer).executeCacheActionAdd((ICacheListenerAdd) null, cacheBundleInputAdd2);
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    public void doAdditionalOperationsAfterRetrievingData(ContextContainer contextContainer, ProxyBundleInput proxyBundleInput, ProxyBundleOutput proxyBundleOutput, boolean z) {
        super.doAdditionalOperationsAfterRetrievingData(contextContainer, proxyBundleInput, proxyBundleOutput, z);
        if (proxyBundleOutput.getStatus() == ProxyBundleOutput.ProxyOutputStatus.OK) {
            notifyUserUpdate((PLPUser) proxyBundleOutput.getResponseObject(PLPMethodReturns.PLP_USER_DETAIL_NAMED));
            if (!z) {
                if (proxyBundleInput.getSourcesOption() == ProxyBundleInput.ProxySourcesOption.GET_FROM_NETWORK_THEN_CLEAR_CACHE) {
                    CacheBundleInputClear cacheBundleInputClear = new CacheBundleInputClear(contextContainer, CacheMethodsPLPHome.APP_GET_MERCHANTS_BY_TAG);
                    cacheBundleInputClear.getMethodType().getCache(contextContainer).executeCacheActionClear(new C11508a(contextContainer, proxyBundleInput, proxyBundleOutput), cacheBundleInputClear);
                    return;
                }
                saveNewSectionsToCache(contextContainer, proxyBundleInput, proxyBundleOutput);
            }
        }
    }

    /* access modifiers changed from: protected */
    public boolean doAdditionalOperationsBeforeNotifyingListener(ContextContainer contextContainer, IProxyListener iProxyListener, ProxyBundleInput proxyBundleInput, ProxyBundleOutput proxyBundleOutput, ListenerSecurity listenerSecurity, boolean z) {
        HomeSectionRef[] extractHomeSectionRefArray;
        int i;
        ContextContainer contextContainer2 = contextContainer;
        int i2 = 0;
        if (proxyBundleOutput.getStatus() != ProxyBundleOutput.ProxyOutputStatus.OK || (extractHomeSectionRefArray = extractHomeSectionRefArray(contextContainer2, proxyBundleInput, proxyBundleOutput)) == null) {
            return false;
        }
        RequestCounter requestCounter = new RequestCounter(extractHomeSectionRefArray.length * 2);
        int length = extractHomeSectionRefArray.length;
        while (i2 < length) {
            HomeSectionRef homeSectionRef = extractHomeSectionRefArray[i2];
            if (homeSectionRef.getSection() != null) {
                registerHandledElement(requestCounter, iProxyListener, proxyBundleInput, proxyBundleOutput, listenerSecurity);
                if (homeSectionRef.getType() != HomeSectionType.BANNER) {
                    HomeSectionMerchant homeSectionMerchant = (HomeSectionMerchant) homeSectionRef.getSection();
                    if (homeSectionMerchant.getMerchants() == null) {
                        i = i2;
                        fetchMerchants(contextContainer, requestCounter, iProxyListener, proxyBundleInput, proxyBundleOutput, listenerSecurity, homeSectionMerchant);
                    } else {
                        i = i2;
                        if (z) {
                            fetchMerchants(contextContainer, requestCounter, iProxyListener, ProxyBundleInput.ProxySourcesOption.GET_FROM_CACHE_ONLY, proxyBundleInput, proxyBundleOutput, listenerSecurity, homeSectionMerchant);
                        } else {
                            registerHandledElement(requestCounter, iProxyListener, proxyBundleInput, proxyBundleOutput, listenerSecurity);
                        }
                    }
                } else {
                    i = i2;
                    registerHandledElement(requestCounter, iProxyListener, proxyBundleInput, proxyBundleOutput, listenerSecurity);
                }
            } else {
                i = i2;
                CacheBundleInputGet cacheBundleInputGet = new CacheBundleInputGet(contextContainer2, homeSectionRef.getType().getCacheMethod());
                cacheBundleInputGet.addParamValue(PLPMethodParameters.SECTION_IDENTIFIER, homeSectionRef.getHomeSectionId());
                AbstractCache cache = cacheBundleInputGet.getMethodType().getCache(contextContainer2);
                AbstractCache abstractCache = cache;
                C11509b bVar = new C11509b(homeSectionRef, requestCounter, iProxyListener, proxyBundleInput, proxyBundleOutput, listenerSecurity, contextContainer);
                abstractCache.executeCacheActionGet(bVar, cacheBundleInputGet);
            }
            i2 = i + 1;
            contextContainer2 = contextContainer;
            ProxyBundleInput proxyBundleInput2 = proxyBundleInput;
        }
        return true;
    }

    private void fetchMerchants(ContextContainer contextContainer, RequestCounter requestCounter, IProxyListener iProxyListener, ProxyBundleInput.ProxySourcesOption proxySourcesOption, ProxyBundleInput proxyBundleInput, ProxyBundleOutput proxyBundleOutput, ListenerSecurity listenerSecurity, BaseHomeSection baseHomeSection) {
        ProxyBundleInput proxyBundleInput2 = proxyBundleInput;
        if (baseHomeSection.getType() == HomeSectionType.BANNER) {
            registerHandledElement(requestCounter, iProxyListener, proxyBundleInput, proxyBundleOutput, listenerSecurity);
            return;
        }
        ProxyBundleInput proxyBundleInput3 = new ProxyBundleInput(contextContainer, ProxyMethodsHome.APP_GET_MERCHANTS_BY_TAG, proxySourcesOption, proxyBundleInput.getNetworkOption(), proxyBundleInput.getLogoutListener());
        proxyBundleInput3.addParamValue(PLPMethodParameters.SECTION_TAG, baseHomeSection.getTag());
        RMNMethodParam rMNMethodParam = PLPMethodParameters.LIMIT;
        Integer num = (Integer) proxyBundleInput2.getParamValue(rMNMethodParam);
        RMNMethodParam rMNMethodParam2 = PLPMethodParameters.TIMESTAMP;
        Long l = (Long) proxyBundleInput2.getParamValue(rMNMethodParam2);
        if (num.intValue() > 0) {
            proxyBundleInput3.addParamValue(PLPMethodParameters.OFFSET, 0);
            proxyBundleInput3.addParamValue(rMNMethodParam, num);
        }
        if (l != null) {
            proxyBundleInput3.addParamValue(rMNMethodParam2, l);
        }
        proxyBundleInput3.executeProxyAction(new C11510c(requestCounter, iProxyListener, proxyBundleInput, proxyBundleOutput, listenerSecurity, baseHomeSection));
    }
}
