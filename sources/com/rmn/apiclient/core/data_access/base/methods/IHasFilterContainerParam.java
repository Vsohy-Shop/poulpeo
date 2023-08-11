package com.rmn.apiclient.core.data_access.base.methods;

import androidx.annotation.NonNull;
import com.rmn.apiclient.impl.api.call.APIParams;
import com.rmn.apiclient.impl.api.models.submodels.offer.OfferType;

public interface IHasFilterContainerParam<T> extends IApiMethod {
    @NonNull
    T setFilterCanCombineCashbackAndOffersCodes(boolean z) {
        getProxyInputBuilder().addParam(APIParams.FILTER_CAN_COMBINE_CASHBACK_AND_OFFERS_CODES, Boolean.valueOf(z));
        return this;
    }

    @NonNull
    T setFilterHasCashbackParam(boolean z) {
        getProxyInputBuilder().addParam(APIParams.FILTER_HAS_CASHBACK, Boolean.valueOf(z));
        return this;
    }

    @NonNull
    T setFilterOfferType(@NonNull OfferType offerType) {
        getProxyInputBuilder().addParam(APIParams.FILTER_OFFER_TYPE_ID, Integer.valueOf(offerType.getSerializedValue()));
        return this;
    }
}
