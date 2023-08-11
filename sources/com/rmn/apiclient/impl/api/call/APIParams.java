package com.rmn.apiclient.impl.api.call;

import androidx.annotation.NonNull;
import com.rmn.apiclient.core.data_access.base.call.APIParam;

public final class APIParams {
    @NonNull
    private static final String ARRAY_AFFILIATE_NETWORK = "[affiliateNetwork]";
    @NonNull
    private static final String ARRAY_CASHBACK = "[cashback]";
    @NonNull
    private static final String ARRAY_MERCHANT = "[merchant]";
    @NonNull
    private static final String ARRAY_MERCHANT_INFO = "[merchantInfo]";
    @NonNull
    private static final String ARRAY_OFFER = "[offer]";
    @NonNull
    private static final String FIELDS = "fields";
    @NonNull
    public static final String FIELDS_AFFILIATE_NETWORK = "fields[affiliateNetwork]";
    @NonNull
    public static final String FIELDS_CASHBACK = "fields[cashback]";
    @NonNull
    public static final String FIELDS_MERCHANT = "fields[merchant]";
    @NonNull
    public static final String FIELDS_MERCHANT_INFO = "fields[merchantInfo]";
    @NonNull
    public static final String FIELDS_OFFER = "fields[offer]";
    @NonNull
    private static final String FILTER = "filter";
    @NonNull
    private static final String FILTER_BITS = "filterBits";
    @NonNull
    public static final String FILTER_CAN_COMBINE_CASHBACK_AND_OFFERS_CODES = "filter[canCombineCashbackAndOffersCodes]";
    @NonNull
    public static final String FILTER_EXTENSION_FLAG_STATUS = "filter[extensionFlagStatus]";
    @NonNull
    private static final String FILTER_GREATER = "filterGreater";
    @NonNull
    public static final String FILTER_HAS_CASHBACK = "filter[hasCashback]";
    @NonNull
    public static final String FILTER_HAS_DOMAINS = "filter[hasDomains]";
    @NonNull
    private static final String FILTER_LOWER = "filterLower";
    @NonNull
    public static final String FILTER_MERCHANT_IDS = "filter[merchantIdList]";
    @NonNull
    public static final String FILTER_OFFER_IDS = "filter[offerIdList]";
    @NonNull
    public static final String FILTER_OFFER_TYPE_ID = "filter[offerTypeId]";
    @NonNull
    public static final String FINGERPRINT = "fingerprint";
    @NonNull

    /* renamed from: ID */
    public static final String f18065ID = "id";
    @NonNull
    private static final String INCLUDE = "include";
    @NonNull
    public static final String INCLUDE_WITH_MERCHANT = "include[merchant]";
    @NonNull
    public static final String INCLUDE_WITH_OFFER = "include[offer]";
    @NonNull
    public static final String LIMIT = "limit";
    @NonNull
    public static final String OFFSET = "offset";
    @NonNull
    public static final String SEARCH_TERM = "searchTerm";
    @NonNull
    public static final String SORT = "sort";
    @NonNull
    public static final String SOURCE = "source";
    @NonNull
    public static final String TECHNICAL_NAME = "technicalName";
    @NonNull
    public static final String TEST_MODE = "testMode";

    @NonNull
    /* renamed from: id */
    public static APIParam<String> m25009id(int i) {
        return new APIParam<>("id", String.valueOf(i));
    }

    @NonNull
    /* renamed from: id */
    public static APIParam<String> m25010id(@NonNull String str) {
        return new APIParam<>("id", str);
    }
}
