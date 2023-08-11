package com.rmn.api.p322v2.poulpeo.cache;

import com.rmn.api.p322v2.cloud.proxy.methods.ProxyMethodsCloudList;
import com.rmn.api.p322v2.common.model.BaseCoupon;
import com.rmn.api.p322v2.common.model.BaseMerchant;
import com.rmn.api.p322v2.common.model.PinnedObject;
import com.rmn.api.p322v2.main.cache.cachetable.CacheTableIdToModel;
import com.rmn.api.p322v2.poulpeo.model.Country;
import com.rmn.api.p322v2.poulpeo.model.Earning;
import com.rmn.api.p322v2.poulpeo.model.EarningAmount;
import com.rmn.api.p322v2.poulpeo.model.HomeSectionBanner;
import com.rmn.api.p322v2.poulpeo.model.HomeSectionEvent;
import com.rmn.api.p322v2.poulpeo.model.HomeSectionMerchant;
import com.rmn.api.p322v2.poulpeo.model.HomeSectionRef;
import com.rmn.api.p322v2.poulpeo.model.PLPUser;
import com.rmn.api.p322v2.poulpeo.model.ReviewMerchant;
import com.rmn.api.p322v2.poulpeo.model.ReviewMerchantStatus;
import com.rmn.api.p322v2.poulpeo.model.SponsoredUser;
import com.rmn.api.p322v2.poulpeo.model.SupportTicket;
import com.rmn.api.p322v2.poulpeo.model.SupportTicketHelp;
import com.rmn.api.p322v2.poulpeo.proxy.PLPCloudListCacheHandler;

/* renamed from: com.rmn.api.v2.poulpeo.cache.PLPModelCaches */
public class PLPModelCaches {
    public static CacheTableIdToModel CACHE_MODEL_COUNTRY;
    public static CacheTableIdToModel CACHE_MODEL_EARNING;
    public static CacheTableIdToModel CACHE_MODEL_EARNING_AMOUNT;
    public static CacheTableIdToModel CACHE_MODEL_HOME_SECTION_BANNER;
    public static CacheTableIdToModel CACHE_MODEL_HOME_SECTION_EVENT;
    public static CacheTableIdToModel CACHE_MODEL_HOME_SECTION_MERCHANT;
    public static CacheTableIdToModel CACHE_MODEL_HOME_SECTION_REF;
    public static CacheTableIdToModel CACHE_MODEL_OFFER;
    public static CacheTableIdToModel CACHE_MODEL_PLP_MERCHANT;
    public static final CacheTableIdToModel CACHE_MODEL_PLP_PINNED_OBJECT;
    public static CacheTableIdToModel CACHE_MODEL_PLP_USER;
    public static CacheTableIdToModel CACHE_MODEL_REVIEW_MERCHANT;
    public static CacheTableIdToModel CACHE_MODEL_REVIEW_MERCHANT_STATUS;
    public static CacheTableIdToModel CACHE_MODEL_SPONSORED_USER;
    public static CacheTableIdToModel CACHE_MODEL_SUPPORT_TICKET;
    public static CacheTableIdToModel CACHE_MODEL_SUPPORT_TICKET_HELP;

    static {
        ProxyMethodsCloudList.CLOUD_LIST_PROXY.setCacheHandler(new PLPCloudListCacheHandler());
        Class<String> cls = String.class;
        CACHE_MODEL_PLP_PINNED_OBJECT = new CacheTableIdToModel(Integer.MAX_VALUE, cls, PinnedObject.class);
        Class cls2 = Integer.TYPE;
        CACHE_MODEL_PLP_MERCHANT = new CacheTableIdToModel(Integer.MAX_VALUE, cls2, BaseMerchant.class);
        CACHE_MODEL_OFFER = new CacheTableIdToModel(Integer.MAX_VALUE, cls2, BaseCoupon.class);
        CACHE_MODEL_PLP_USER = new CacheTableIdToModel(Integer.MAX_VALUE, cls2, PLPUser.class);
        CACHE_MODEL_EARNING_AMOUNT = new CacheTableIdToModel(Integer.MAX_VALUE, cls, EarningAmount.class);
        CACHE_MODEL_EARNING = new CacheTableIdToModel(Integer.MAX_VALUE, cls, Earning.class);
        CACHE_MODEL_HOME_SECTION_REF = new CacheTableIdToModel(Integer.MAX_VALUE, cls, HomeSectionRef.class);
        CACHE_MODEL_HOME_SECTION_MERCHANT = new CacheTableIdToModel(Integer.MAX_VALUE, cls, HomeSectionMerchant.class);
        CACHE_MODEL_HOME_SECTION_EVENT = new CacheTableIdToModel(Integer.MAX_VALUE, cls, HomeSectionEvent.class);
        CACHE_MODEL_HOME_SECTION_BANNER = new CacheTableIdToModel(Integer.MAX_VALUE, cls, HomeSectionBanner.class);
        CACHE_MODEL_REVIEW_MERCHANT = new CacheTableIdToModel(Integer.MAX_VALUE, cls2, ReviewMerchant.class);
        CACHE_MODEL_REVIEW_MERCHANT_STATUS = new CacheTableIdToModel(Integer.MAX_VALUE, cls2, ReviewMerchantStatus.class);
        CACHE_MODEL_SPONSORED_USER = new CacheTableIdToModel(Integer.MAX_VALUE, cls2, SponsoredUser.class);
        CACHE_MODEL_SUPPORT_TICKET = new CacheTableIdToModel(Integer.MAX_VALUE, cls2, SupportTicket.class);
        CACHE_MODEL_SUPPORT_TICKET_HELP = new CacheTableIdToModel(Integer.MAX_VALUE, cls, SupportTicketHelp.class);
        CACHE_MODEL_COUNTRY = new CacheTableIdToModel(Integer.MAX_VALUE, cls, Country.class);
    }
}
