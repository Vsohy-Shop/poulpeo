package com.rmn.api.p322v2.poulpeo.proxy;

import androidx.annotation.NonNull;
import com.rmn.api.p322v2.cloud.proxy.ICloudListCacheHandler;
import com.rmn.api.p322v2.common.model.BaseCoupon;
import com.rmn.api.p322v2.common.model.BaseMerchant;
import com.rmn.api.p322v2.common.user.LogoutListener;
import com.rmn.api.p322v2.main.cache.cachebundleinput.CacheBundleInputAdd;
import com.rmn.api.p322v2.main.general.methodreturn.RMNMethodReturnType;
import com.rmn.api.p322v2.main.proxy.ProxyBundleInput;
import com.rmn.api.p322v2.poulpeo.cache.methods.CacheMethodsOffer;
import com.rmn.api.p322v2.poulpeo.cache.methods.CacheMethodsPLPMerchant;
import com.rmn.api.p322v2.poulpeo.general.PLPMethodParameters;
import com.rmn.api.p322v2.poulpeo.general.PLPMethodReturns;
import com.rmn.api.p322v2.poulpeo.proxy.methods.ProxyMethodsOffer;
import com.rmn.api.p322v2.poulpeo.proxy.methods.ProxyMethodsPLPMerchant;
import com.rmn.iosadapters.android.content.ContextContainer;

/* renamed from: com.rmn.api.v2.poulpeo.proxy.PLPCloudListCacheHandler */
public class PLPCloudListCacheHandler implements ICloudListCacheHandler {
    @NonNull
    public RMNMethodReturnType getMethodReturnMerchant() {
        return PLPMethodReturns.PLP_MERCHANT_DETAIL;
    }

    @NonNull
    public RMNMethodReturnType getMethodReturnOffer() {
        return PLPMethodReturns.OFFER_DETAIL;
    }

    @NonNull
    public CacheBundleInputAdd newCacheInputAddMerchant(@NonNull ContextContainer contextContainer, @NonNull BaseMerchant baseMerchant) {
        CacheBundleInputAdd cacheBundleInputAdd = new CacheBundleInputAdd(contextContainer, CacheMethodsPLPMerchant.GET_DETAILS, CacheBundleInputAdd.AddOption.REPLACE_IF_EXISTING);
        cacheBundleInputAdd.addParamValue(PLPMethodParameters.ID_PLP_MERCHANT_REQUIRED, Integer.valueOf(baseMerchant.getMerchantId()));
        cacheBundleInputAdd.addObjectToStore(PLPMethodReturns.PLP_MERCHANT_DETAIL, baseMerchant);
        return cacheBundleInputAdd;
    }

    @NonNull
    public CacheBundleInputAdd newCacheInputAddOffer(@NonNull ContextContainer contextContainer, @NonNull BaseCoupon baseCoupon) {
        CacheBundleInputAdd cacheBundleInputAdd = new CacheBundleInputAdd(contextContainer, CacheMethodsOffer.GET_DETAILS, CacheBundleInputAdd.AddOption.REPLACE_IF_EXISTING);
        cacheBundleInputAdd.addParamValue(PLPMethodParameters.ID_COUPON_REQUIRED, Integer.valueOf(baseCoupon.getCouponId()));
        cacheBundleInputAdd.addObjectToStore(PLPMethodReturns.OFFER_DETAIL, baseCoupon);
        return cacheBundleInputAdd;
    }

    @NonNull
    public ProxyBundleInput newProxyInputMerchantGet(@NonNull ContextContainer contextContainer, int i, @NonNull ProxyBundleInput.ProxySourcesOption proxySourcesOption, @NonNull ProxyBundleInput.ProxyNetworkOption proxyNetworkOption) {
        ProxyBundleInput proxyBundleInput = new ProxyBundleInput(contextContainer, ProxyMethodsPLPMerchant.GET_DETAILS, proxySourcesOption, proxyNetworkOption, (LogoutListener) null);
        proxyBundleInput.addParamValue(PLPMethodParameters.ID_PLP_MERCHANT_REQUIRED, Integer.valueOf(i));
        return proxyBundleInput;
    }

    @NonNull
    public ProxyBundleInput newProxyInputOfferGet(@NonNull ContextContainer contextContainer, int i, @NonNull ProxyBundleInput.ProxySourcesOption proxySourcesOption, @NonNull ProxyBundleInput.ProxyNetworkOption proxyNetworkOption) {
        ProxyBundleInput proxyBundleInput = new ProxyBundleInput(contextContainer, ProxyMethodsOffer.GET_DETAILS, proxySourcesOption, proxyNetworkOption, (LogoutListener) null);
        proxyBundleInput.addParamValue(PLPMethodParameters.ID_COUPON_REQUIRED, Integer.valueOf(i));
        return proxyBundleInput;
    }
}
