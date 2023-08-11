package com.rmn.apiclient.impl.api.models.submodels.campaign;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.rmn.apiclient.core.data_access.base.methods.BaseApiMethod;
import com.rmn.apiclient.core.data_access.proxy.strategy.ProxyStrategyChain;
import com.rmn.apiclient.core.json.ISerializableEnumString;
import com.rmn.apiclient.core.model.ModelRelationship;
import com.rmn.apiclient.impl.api.call.APIIncludes;
import com.rmn.apiclient.impl.api.descriptors.APIResourceDescriptors;
import com.rmn.apiclient.impl.api.methods.ContainerApi;
import com.rmn.apiclient.impl.api.methods.MerchantApi;
import com.rmn.apiclient.impl.api.methods.OfferApi;
import com.rmn.apiclient.impl.api.methods.PageApi;

public enum CampaignTarget implements ISerializableEnumString {
    MERCHANT("merchant") {
        @NonNull
        public <T extends BaseApiMethod> T getTargetApiMethod(@NonNull ProxyStrategyChain proxyStrategyChain, @NonNull ModelRelationship<?> modelRelationship) {
            return (BaseApiMethod) new MerchantApi.GetMerchant(modelRelationship.f18064id, proxyStrategyChain).setIncludeWithMerchantParam(APIIncludes.CURRENT_CASHBACK_OBJECT);
        }
    },
    OFFER("coupon") {
        @NonNull
        public <T extends BaseApiMethod> T getTargetApiMethod(@NonNull ProxyStrategyChain proxyStrategyChain, @NonNull ModelRelationship<?> modelRelationship) {
            return (BaseApiMethod) new OfferApi.GetOffer(modelRelationship.f18064id, proxyStrategyChain).setIncludeWithOfferParam("merchant", APIIncludes.CURRENT_CASHBACK_OBJECT);
        }
    },
    MERCHANTS_LIST("merchants_list") {
        @NonNull
        public <T extends BaseApiMethod> T getTargetApiMethod(@NonNull ProxyStrategyChain proxyStrategyChain, @NonNull ModelRelationship<?> modelRelationship) {
            return (BaseApiMethod) new ContainerApi.GetContainerContent(modelRelationship.f18064id, proxyStrategyChain).setIncludeWithOfferParam(APIIncludes.CURRENT_CASHBACK_OBJECT);
        }
    },
    PAGE(APIResourceDescriptors.RESOURCE_TYPE_PAGE) {
        @NonNull
        public <T extends BaseApiMethod> T getTargetApiMethod(@NonNull ProxyStrategyChain proxyStrategyChain, @NonNull ModelRelationship<?> modelRelationship) {
            return new PageApi.GetPage(modelRelationship.f18064id, proxyStrategyChain);
        }
    },
    URL("url"),
    OTHER("other");
    
    @NonNull
    public final String tag;

    @NonNull
    public String getSerializedValue() {
        return this.tag;
    }

    @Nullable
    public <T extends BaseApiMethod> T getTargetApiMethod(@NonNull ProxyStrategyChain proxyStrategyChain, @NonNull ModelRelationship<?> modelRelationship) {
        return null;
    }

    private CampaignTarget(@NonNull String str) {
        this.tag = str;
    }
}
