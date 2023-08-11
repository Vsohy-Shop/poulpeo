package com.rmn.api.p322v2.poulpeo.proxy;

import com.rmn.api.p322v2.common.model.BaseMerchant;
import com.rmn.api.p322v2.common.user.LogoutListener;
import com.rmn.api.p322v2.main.cache.ICacheListenerAdd;
import com.rmn.api.p322v2.main.cache.cachebundleinput.CacheBundleInputAdd;
import com.rmn.api.p322v2.main.general.methodparam.RMNMethodParam;
import com.rmn.api.p322v2.main.general.methodreturn.RMNMethodReturnJSON;
import com.rmn.api.p322v2.main.proxy.IProxyListener;
import com.rmn.api.p322v2.main.proxy.ProxyBundleInput;
import com.rmn.api.p322v2.main.proxy.ProxyBundleOutput;
import com.rmn.api.p322v2.poulpeo.cache.methods.CacheMethodsPLPMerchant;
import com.rmn.api.p322v2.poulpeo.general.PLPMethodParameters;
import com.rmn.api.p322v2.poulpeo.general.PLPMethodReturns;
import com.rmn.api.p322v2.poulpeo.model.ReviewMerchantStatus;
import com.rmn.api.p322v2.poulpeo.proxy.methods.ProxyMethodsPLPMerchant;
import com.rmn.iosadapters.android.content.ContextContainer;
import java.math.BigDecimal;

/* renamed from: com.rmn.api.v2.poulpeo.proxy.ReviewMerchantProxy */
public class ReviewMerchantProxy extends PLPDefaultProxy {

    /* renamed from: com.rmn.api.v2.poulpeo.proxy.ReviewMerchantProxy$a */
    class C11513a implements IProxyListener {

        /* renamed from: b */
        final /* synthetic */ ReviewMerchantStatus f18003b;

        /* renamed from: c */
        final /* synthetic */ ContextContainer f18004c;

        C11513a(ReviewMerchantStatus reviewMerchantStatus, ContextContainer contextContainer) {
            this.f18003b = reviewMerchantStatus;
            this.f18004c = contextContainer;
        }

        public void onProxyActionExecuted(ProxyBundleInput proxyBundleInput, ProxyBundleOutput proxyBundleOutput) {
            if (proxyBundleOutput.getStatus() == ProxyBundleOutput.ProxyOutputStatus.OK) {
                RMNMethodReturnJSON rMNMethodReturnJSON = PLPMethodReturns.PLP_MERCHANT_DETAIL;
                BaseMerchant baseMerchant = (BaseMerchant) proxyBundleOutput.getResponseObject(rMNMethodReturnJSON);
                if (baseMerchant != null) {
                    baseMerchant.updateReviewInfo(new BigDecimal(this.f18003b.getScoreReview()).doubleValue(), this.f18003b.getNumberReviews());
                    CacheBundleInputAdd cacheBundleInputAdd = new CacheBundleInputAdd(this.f18004c, CacheMethodsPLPMerchant.GET_DETAILS, CacheBundleInputAdd.AddOption.REPLACE_IF_EXISTING);
                    cacheBundleInputAdd.addObjectToStore(rMNMethodReturnJSON, baseMerchant);
                    cacheBundleInputAdd.getMethodType().getCache(this.f18004c).executeCacheActionAdd((ICacheListenerAdd) null, cacheBundleInputAdd);
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    public void doAdditionalOperationsAfterRetrievingData(ContextContainer contextContainer, ProxyBundleInput proxyBundleInput, ProxyBundleOutput proxyBundleOutput, boolean z) {
        if (!z && proxyBundleOutput.getStatus() == ProxyBundleOutput.ProxyOutputStatus.OK) {
            ReviewMerchantStatus reviewMerchantStatus = (ReviewMerchantStatus) proxyBundleOutput.getResponseObject(PLPMethodReturns.REVIEW_MERCHANT_STATUS_DETAIL);
            RMNMethodParam rMNMethodParam = PLPMethodParameters.ID_PLP_MERCHANT_REQUIRED;
            int intValue = ((Integer) proxyBundleInput.getParamValue(rMNMethodParam)).intValue();
            if (reviewMerchantStatus != null) {
                reviewMerchantStatus.setIdMerchant(intValue);
                ProxyBundleInput proxyBundleInput2 = new ProxyBundleInput(contextContainer, ProxyMethodsPLPMerchant.GET_DETAILS, ProxyBundleInput.ProxySourcesOption.GET_FROM_CACHE_ONLY, ProxyBundleInput.ProxyNetworkOption.NO_CACHE, (LogoutListener) null);
                proxyBundleInput2.addParamValue(rMNMethodParam, Integer.valueOf(intValue));
                proxyBundleInput2.executeProxyAction(new C11513a(reviewMerchantStatus, contextContainer));
            }
        }
    }
}
