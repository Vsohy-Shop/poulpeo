package com.rmn.api.p322v2.cloud.proxy;

import androidx.annotation.NonNull;
import com.rmn.api.p322v2.common.model.BaseCoupon;
import com.rmn.api.p322v2.common.model.BaseMerchant;
import com.rmn.api.p322v2.main.cache.cachebundleinput.CacheBundleInputAdd;
import com.rmn.api.p322v2.main.general.methodreturn.RMNMethodReturnType;
import com.rmn.api.p322v2.main.proxy.ProxyBundleInput;
import com.rmn.iosadapters.android.content.ContextContainer;

/* renamed from: com.rmn.api.v2.cloud.proxy.ICloudListCacheHandler */
public interface ICloudListCacheHandler {
    @NonNull
    RMNMethodReturnType getMethodReturnMerchant();

    @NonNull
    RMNMethodReturnType getMethodReturnOffer();

    @NonNull
    CacheBundleInputAdd newCacheInputAddMerchant(@NonNull ContextContainer contextContainer, @NonNull BaseMerchant baseMerchant);

    @NonNull
    CacheBundleInputAdd newCacheInputAddOffer(@NonNull ContextContainer contextContainer, @NonNull BaseCoupon baseCoupon);

    @NonNull
    ProxyBundleInput newProxyInputMerchantGet(@NonNull ContextContainer contextContainer, int i, @NonNull ProxyBundleInput.ProxySourcesOption proxySourcesOption, @NonNull ProxyBundleInput.ProxyNetworkOption proxyNetworkOption);

    @NonNull
    ProxyBundleInput newProxyInputOfferGet(@NonNull ContextContainer contextContainer, int i, @NonNull ProxyBundleInput.ProxySourcesOption proxySourcesOption, @NonNull ProxyBundleInput.ProxyNetworkOption proxyNetworkOption);
}
