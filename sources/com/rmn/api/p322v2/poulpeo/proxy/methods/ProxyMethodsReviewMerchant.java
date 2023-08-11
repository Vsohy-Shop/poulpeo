package com.rmn.api.p322v2.poulpeo.proxy.methods;

import com.rmn.api.p322v2.main.cache.ICacheMethodType;
import com.rmn.api.p322v2.main.general.methodparam.RMNMethodParam;
import com.rmn.api.p322v2.main.general.methodreturn.RMNMethodReturnJSON;
import com.rmn.api.p322v2.main.oauth.HttpMethod;
import com.rmn.api.p322v2.main.parser.ProxyMethodParserDefault;
import com.rmn.api.p322v2.main.proxy.BaseProxyMethodType;
import com.rmn.api.p322v2.main.proxy.IProxyMethodType;
import com.rmn.api.p322v2.poulpeo.cache.methods.CacheMethodsReviewMerchant;
import com.rmn.api.p322v2.poulpeo.general.PLPApiType;
import com.rmn.api.p322v2.poulpeo.general.PLPMethodNames;
import com.rmn.api.p322v2.poulpeo.general.PLPMethodParameters;
import com.rmn.api.p322v2.poulpeo.general.PLPMethodReturns;
import com.rmn.api.p322v2.poulpeo.proxy.ReviewMerchantProxy;
import java.util.HashSet;

/* renamed from: com.rmn.api.v2.poulpeo.proxy.methods.ProxyMethodsReviewMerchant */
public class ProxyMethodsReviewMerchant {
    public static final IProxyMethodType REVIEW_MERCHANT_ADD;
    public static final IProxyMethodType REVIEW_MERCHANT_GET_LIST;

    /* renamed from: com.rmn.api.v2.poulpeo.proxy.methods.ProxyMethodsReviewMerchant$a */
    class C11567a extends HashSet<RMNMethodParam> {
        C11567a() {
            add(PLPMethodParameters.ID_PLP_MERCHANT_REQUIRED);
            add(PLPMethodParameters.OFFSET);
            add(PLPMethodParameters.LIMIT);
        }
    }

    /* renamed from: com.rmn.api.v2.poulpeo.proxy.methods.ProxyMethodsReviewMerchant$b */
    class C11568b extends HashSet<RMNMethodReturnJSON> {
        C11568b() {
            add(PLPMethodReturns.REVIEW_MERCHANT_ARRAY);
            add(PLPMethodReturns.TOTAL_COUNT);
            add(PLPMethodReturns.REVIEW_MERCHANT_STATUS_DETAIL);
        }
    }

    /* renamed from: com.rmn.api.v2.poulpeo.proxy.methods.ProxyMethodsReviewMerchant$c */
    class C11569c extends HashSet<RMNMethodParam> {
        C11569c() {
            add(PLPMethodParameters.ID_PLP_MERCHANT_REQUIRED);
            add(PLPMethodParameters.REVIEW_MERCHANT_SCORE);
            add(PLPMethodParameters.REVIEW_MERCHANT_CONTENT);
            add(PLPMethodParameters.REVIEW_MERCHANT_DATE_ORDER);
        }
    }

    /* renamed from: com.rmn.api.v2.poulpeo.proxy.methods.ProxyMethodsReviewMerchant$d */
    class C11570d extends HashSet<RMNMethodReturnJSON> {
        C11570d() {
            add(PLPMethodReturns.REVIEW_MERCHANT_ID);
            add(PLPMethodReturns.REVIEW_MERCHANT_STATUS_DETAIL);
        }
    }

    static {
        PLPApiType pLPApiType = PLPApiType.PLP;
        REVIEW_MERCHANT_GET_LIST = new BaseProxyMethodType(PLPMethodNames.REVIEW_MERCHANT_GET_LIST, pLPApiType, new ReviewMerchantProxy(), new ProxyMethodParserDefault(), new C11567a(), new C11568b(), HttpMethod.GET, true, CacheMethodsReviewMerchant.GET_LIST);
        REVIEW_MERCHANT_ADD = new BaseProxyMethodType(PLPMethodNames.REVIEW_MERCHANT_ADD, pLPApiType, new ReviewMerchantProxy(), new ProxyMethodParserDefault(), new C11569c(), new C11570d(), HttpMethod.POST, true, (ICacheMethodType) null);
    }
}
