package com.rmn.api.p322v2.poulpeo.proxy.methods;

import com.rmn.api.p322v2.main.cache.ICacheMethodType;
import com.rmn.api.p322v2.main.general.methodparam.RMNMethodParam;
import com.rmn.api.p322v2.main.general.methodreturn.RMNMethodReturnJSON;
import com.rmn.api.p322v2.main.oauth.HttpMethod;
import com.rmn.api.p322v2.main.parser.ProxyMethodParserDefault;
import com.rmn.api.p322v2.main.proxy.BaseProxyMethodType;
import com.rmn.api.p322v2.main.proxy.IProxyMethodType;
import com.rmn.api.p322v2.poulpeo.cache.methods.CacheMethodsPLPUser;
import com.rmn.api.p322v2.poulpeo.general.PLPApiType;
import com.rmn.api.p322v2.poulpeo.general.PLPMethodNames;
import com.rmn.api.p322v2.poulpeo.general.PLPMethodParameters;
import com.rmn.api.p322v2.poulpeo.general.PLPMethodReturns;
import com.rmn.api.p322v2.poulpeo.proxy.PLPDefaultProxy;
import com.rmn.api.p322v2.poulpeo.proxy.PLPUserProxy;
import java.util.HashSet;
import java.util.Set;

/* renamed from: com.rmn.api.v2.poulpeo.proxy.methods.ProxyMethodsPLPUser */
public class ProxyMethodsPLPUser {
    public static final IProxyMethodType CHANGE_PASSWORD;
    public static final IProxyMethodType PLP_USER_CHECK_SPONSORSHIP_CODE;
    public static final IProxyMethodType PLP_USER_GET_DETAILS;
    public static final IProxyMethodType PLP_USER_GET_EARNINGS;
    public static final IProxyMethodType PLP_USER_GET_SPONSORED_USERS;
    public static final IProxyMethodType PLP_USER_LOGIN;
    public static final IProxyMethodType PLP_USER_LOGIN_VIA_APPLE;
    public static final IProxyMethodType PLP_USER_LOGIN_VIA_FACEBOOK;
    public static final IProxyMethodType PLP_USER_LOGIN_VIA_GOOGLE;
    public static final IProxyMethodType PLP_USER_LOGOUT;
    public static final IProxyMethodType PLP_USER_REGISTER_THEN_LOGIN;
    public static final IProxyMethodType PLP_USER_RESET_PASSWORD;
    public static final IProxyMethodType PLP_USER_SUGGEST;
    public static final IProxyMethodType PLP_USER_UNREGISTER;
    public static final IProxyMethodType UPDATE_LOGIN_INFO;
    public static final IProxyMethodType UPDATE_PAYMENT_INFO;

    /* renamed from: com.rmn.api.v2.poulpeo.proxy.methods.ProxyMethodsPLPUser$a */
    class C11540a extends HashSet<RMNMethodReturnJSON> {
        C11540a() {
            add(PLPMethodReturns.PLP_USER_ID);
        }
    }

    /* renamed from: com.rmn.api.v2.poulpeo.proxy.methods.ProxyMethodsPLPUser$b */
    class C11541b extends HashSet<RMNMethodParam> {
        C11541b() {
            add(PLPMethodParameters.EMAIL);
            add(PLPMethodParameters.PASSWORD);
        }
    }

    /* renamed from: com.rmn.api.v2.poulpeo.proxy.methods.ProxyMethodsPLPUser$c */
    class C11542c extends HashSet<RMNMethodParam> {
        C11542c() {
            add(PLPMethodParameters.FULL);
        }
    }

    /* renamed from: com.rmn.api.v2.poulpeo.proxy.methods.ProxyMethodsPLPUser$d */
    class C11543d extends HashSet<RMNMethodReturnJSON> {
        C11543d() {
            add(PLPMethodReturns.PLP_USER_DETAIL);
        }
    }

    /* renamed from: com.rmn.api.v2.poulpeo.proxy.methods.ProxyMethodsPLPUser$e */
    class C11544e extends HashSet<RMNMethodParam> {
        C11544e() {
            add(PLPMethodParameters.LOGIN_OPTIONAL);
            add(PLPMethodParameters.EMAIL_OPTIONAL);
            add(PLPMethodParameters.PASSWORD);
        }
    }

    /* renamed from: com.rmn.api.v2.poulpeo.proxy.methods.ProxyMethodsPLPUser$f */
    class C11545f extends HashSet<RMNMethodParam> {
        C11545f() {
            add(PLPMethodParameters.OLD_PASSWORD);
            add(PLPMethodParameters.NEW_PASSWORD);
        }
    }

    /* renamed from: com.rmn.api.v2.poulpeo.proxy.methods.ProxyMethodsPLPUser$g */
    class C11546g extends HashSet<RMNMethodParam> {
        C11546g() {
            add(PLPMethodParameters.CIVILITY);
            add(PLPMethodParameters.LAST_NAME);
            add(PLPMethodParameters.FIRST_NAME);
            add(PLPMethodParameters.COUNTRY_CODE);
            add(PLPMethodParameters.IBAN);
            add(PLPMethodParameters.BIC);
            add(PLPMethodParameters.EMAIL_PAYPAL);
            add(PLPMethodParameters.ADDRESS);
            add(PLPMethodParameters.ZIP);
            add(PLPMethodParameters.CITY);
            add(PLPMethodParameters.PHONE);
            add(PLPMethodParameters.MOBILE);
            add(PLPMethodParameters.PASSWORD);
        }
    }

    /* renamed from: com.rmn.api.v2.poulpeo.proxy.methods.ProxyMethodsPLPUser$h */
    class C11547h extends HashSet<RMNMethodReturnJSON> {
        C11547h() {
            add(PLPMethodReturns.PLP_USER_SHOULD_UPDATE_PAYMENT_INFO);
        }
    }

    /* renamed from: com.rmn.api.v2.poulpeo.proxy.methods.ProxyMethodsPLPUser$i */
    class C11548i extends HashSet<RMNMethodParam> {
        C11548i() {
            add(PLPMethodParameters.OFFSET);
            add(PLPMethodParameters.LIMIT);
            add(PLPMethodParameters.EARNING_TYPE_FILTER);
            add(PLPMethodParameters.EARNING_STATUS_FILTER);
            add(PLPMethodParameters.SORT_PROPERTY);
            add(PLPMethodParameters.SORT_ORDER);
        }
    }

    /* renamed from: com.rmn.api.v2.poulpeo.proxy.methods.ProxyMethodsPLPUser$j */
    class C11549j extends HashSet<RMNMethodReturnJSON> {
        C11549j() {
            add(PLPMethodReturns.EARNING_AMOUNT_DETAIL);
            add(PLPMethodReturns.EARNING_ARRAY);
            add(PLPMethodReturns.TOTAL_COUNT);
        }
    }

    /* renamed from: com.rmn.api.v2.poulpeo.proxy.methods.ProxyMethodsPLPUser$k */
    class C11550k extends HashSet<RMNMethodParam> {
        C11550k() {
            add(PLPMethodParameters.EMAIL);
            add(PLPMethodParameters.PASSWORD);
            add(PLPMethodParameters.OPEN_DATA);
        }
    }

    /* renamed from: com.rmn.api.v2.poulpeo.proxy.methods.ProxyMethodsPLPUser$l */
    class C11551l extends HashSet<RMNMethodParam> {
        C11551l() {
            add(PLPMethodParameters.SUGGESTION);
            add(PLPMethodParameters.OPEN_DATA);
            add(PLPMethodParameters.USER_SUGGEST_SOURCE);
        }
    }

    /* renamed from: com.rmn.api.v2.poulpeo.proxy.methods.ProxyMethodsPLPUser$m */
    class C11552m extends HashSet<RMNMethodParam> {
        C11552m() {
            add(PLPMethodParameters.SPONSORSHIP_CODE);
        }
    }

    /* renamed from: com.rmn.api.v2.poulpeo.proxy.methods.ProxyMethodsPLPUser$n */
    class C11553n extends HashSet<RMNMethodReturnJSON> {
        C11553n() {
            add(PLPMethodReturns.PLP_USER_SPONSOR_LOGIN);
        }
    }

    /* renamed from: com.rmn.api.v2.poulpeo.proxy.methods.ProxyMethodsPLPUser$o */
    class C11554o extends HashSet<RMNMethodParam> {
        C11554o() {
            add(PLPMethodParameters.OFFSET);
            add(PLPMethodParameters.LIMIT);
        }
    }

    /* renamed from: com.rmn.api.v2.poulpeo.proxy.methods.ProxyMethodsPLPUser$p */
    class C11555p extends HashSet<RMNMethodReturnJSON> {
        C11555p() {
            add(PLPMethodReturns.SPONSORED_USER_ARRAY);
            add(PLPMethodReturns.TOTAL_COUNT);
        }
    }

    /* renamed from: com.rmn.api.v2.poulpeo.proxy.methods.ProxyMethodsPLPUser$q */
    class C11556q extends HashSet<RMNMethodParam> {
        C11556q() {
            add(PLPMethodParameters.MOTIVE);
            add(PLPMethodParameters.SUGGESTION_OPTIONAL);
            add(PLPMethodParameters.PASSWORD);
        }
    }

    /* renamed from: com.rmn.api.v2.poulpeo.proxy.methods.ProxyMethodsPLPUser$r */
    class C11557r extends HashSet<RMNMethodReturnJSON> {
        C11557r() {
            add(PLPMethodReturns.PLP_USER_ID);
        }
    }

    /* renamed from: com.rmn.api.v2.poulpeo.proxy.methods.ProxyMethodsPLPUser$s */
    class C11558s extends HashSet<RMNMethodParam> {
        C11558s() {
            add(PLPMethodParameters.ACCESS_TOKEN);
            add(PLPMethodParameters.SPONSORSHIP_CODE);
            add(PLPMethodParameters.TERMS_ACCEPTED);
            add(PLPMethodParameters.NEWSLETTER);
            add(PLPMethodParameters.OPEN_DATA);
        }
    }

    /* renamed from: com.rmn.api.v2.poulpeo.proxy.methods.ProxyMethodsPLPUser$t */
    class C11559t extends HashSet<RMNMethodReturnJSON> {
        C11559t() {
            add(PLPMethodReturns.PLP_USER_ID);
        }
    }

    /* renamed from: com.rmn.api.v2.poulpeo.proxy.methods.ProxyMethodsPLPUser$u */
    class C11560u extends HashSet<RMNMethodParam> {
        C11560u() {
            add(PLPMethodParameters.AUTH_CODE);
            add(PLPMethodParameters.SPONSORSHIP_CODE);
            add(PLPMethodParameters.TERMS_ACCEPTED);
            add(PLPMethodParameters.NEWSLETTER);
            add(PLPMethodParameters.OPEN_DATA);
        }
    }

    /* renamed from: com.rmn.api.v2.poulpeo.proxy.methods.ProxyMethodsPLPUser$v */
    class C11561v extends HashSet<RMNMethodReturnJSON> {
        C11561v() {
            add(PLPMethodReturns.PLP_USER_ID);
        }
    }

    /* renamed from: com.rmn.api.v2.poulpeo.proxy.methods.ProxyMethodsPLPUser$w */
    class C11562w extends HashSet<RMNMethodParam> {
        C11562w() {
            add(PLPMethodParameters.ACCESS_TOKEN);
            add(PLPMethodParameters.SPONSORSHIP_CODE);
            add(PLPMethodParameters.TERMS_ACCEPTED);
            add(PLPMethodParameters.NEWSLETTER);
            add(PLPMethodParameters.OPEN_DATA);
        }
    }

    /* renamed from: com.rmn.api.v2.poulpeo.proxy.methods.ProxyMethodsPLPUser$x */
    class C11563x extends HashSet<RMNMethodReturnJSON> {
        C11563x() {
            add(PLPMethodReturns.PLP_USER_ID);
        }
    }

    /* renamed from: com.rmn.api.v2.poulpeo.proxy.methods.ProxyMethodsPLPUser$y */
    class C11564y extends HashSet<RMNMethodParam> {
        C11564y() {
            add(PLPMethodParameters.EMAIL);
            add(PLPMethodParameters.PASSWORD);
            add(PLPMethodParameters.SPONSORSHIP_CODE);
            add(PLPMethodParameters.TERMS_ACCEPTED);
            add(PLPMethodParameters.NEWSLETTER);
            add(PLPMethodParameters.OPEN_DATA);
        }
    }

    static {
        PLPApiType pLPApiType = PLPApiType.PLP;
        PLPDefaultProxy pLPDefaultProxy = new PLPDefaultProxy();
        ProxyMethodParserDefault proxyMethodParserDefault = new ProxyMethodParserDefault();
        C11550k kVar = new C11550k();
        C11557r rVar = new C11557r();
        HttpMethod httpMethod = HttpMethod.POST;
        PLP_USER_LOGIN = new BaseProxyMethodType(PLPMethodNames.PLP_USER_LOGIN, pLPApiType, pLPDefaultProxy, proxyMethodParserDefault, kVar, rVar, httpMethod, true, (ICacheMethodType) null);
        PLPApiType pLPApiType2 = pLPApiType;
        HttpMethod httpMethod2 = httpMethod;
        PLP_USER_LOGIN_VIA_FACEBOOK = new BaseProxyMethodType(PLPMethodNames.PLP_USER_LOGIN_VIA_FACEBOOK, pLPApiType2, new PLPDefaultProxy(), new ProxyMethodParserDefault(), new C11558s(), new C11559t(), httpMethod2, true, (ICacheMethodType) null);
        PLP_USER_LOGIN_VIA_GOOGLE = new BaseProxyMethodType(PLPMethodNames.PLP_USER_LOGIN_VIA_GOOGLE, pLPApiType2, new PLPDefaultProxy(), new ProxyMethodParserDefault(), new C11560u(), new C11561v(), httpMethod2, true, (ICacheMethodType) null);
        PLP_USER_LOGIN_VIA_APPLE = new BaseProxyMethodType(PLPMethodNames.PLP_USER_LOGIN_VIA_APPLE, pLPApiType2, new PLPDefaultProxy(), new ProxyMethodParserDefault(), new C11562w(), new C11563x(), httpMethod2, true, (ICacheMethodType) null);
        PLP_USER_REGISTER_THEN_LOGIN = new BaseProxyMethodType(PLPMethodNames.PLP_USER_REGISTER_THEN_LOGIN, pLPApiType2, new PLPDefaultProxy(), new ProxyMethodParserDefault(), new C11564y(), new C11540a(), httpMethod2, true, (ICacheMethodType) null);
        PLP_USER_RESET_PASSWORD = new BaseProxyMethodType(PLPMethodNames.PLP_USER_RESET_PASSWORD, pLPApiType2, new PLPDefaultProxy(), new ProxyMethodParserDefault(), new C11541b(), (Set<RMNMethodReturnJSON>) null, httpMethod2, true, (ICacheMethodType) null);
        PLPDefaultProxy pLPDefaultProxy2 = new PLPDefaultProxy();
        ProxyMethodParserDefault proxyMethodParserDefault2 = new ProxyMethodParserDefault();
        HttpMethod httpMethod3 = HttpMethod.GET;
        HttpMethod httpMethod4 = httpMethod3;
        PLP_USER_LOGOUT = new BaseProxyMethodType(PLPMethodNames.PLP_USER_LOGOUT, pLPApiType2, pLPDefaultProxy2, proxyMethodParserDefault2, (Set<RMNMethodParam>) null, (Set<RMNMethodReturnJSON>) null, httpMethod4, true, (ICacheMethodType) null);
        PLP_USER_GET_DETAILS = new BaseProxyMethodType(PLPMethodNames.PLP_USER_GET_DETAILS, pLPApiType2, new PLPUserProxy(), new ProxyMethodParserDefault(), new C11542c(), new C11543d(), httpMethod4, true, CacheMethodsPLPUser.GET_DETAILS);
        HttpMethod httpMethod5 = httpMethod;
        UPDATE_LOGIN_INFO = new BaseProxyMethodType(PLPMethodNames.PLP_USER_UPDATE_LOGIN_INFO, pLPApiType2, new PLPDefaultProxy(), new ProxyMethodParserDefault(), new C11544e(), (Set<RMNMethodReturnJSON>) null, httpMethod5, true, (ICacheMethodType) null);
        CHANGE_PASSWORD = new BaseProxyMethodType(PLPMethodNames.PLP_USER_CHANGE_PASSWORD, pLPApiType2, new PLPDefaultProxy(), new ProxyMethodParserDefault(), new C11545f(), (Set<RMNMethodReturnJSON>) null, httpMethod5, true, (ICacheMethodType) null);
        UPDATE_PAYMENT_INFO = new BaseProxyMethodType(PLPMethodNames.PLP_USER_UPDATE_PAYMENT_INFO, pLPApiType2, new PLPDefaultProxy(), new ProxyMethodParserDefault(), new C11546g(), new C11547h(), httpMethod5, true, (ICacheMethodType) null);
        PLP_USER_GET_EARNINGS = new BaseProxyMethodType(PLPMethodNames.PLP_USER_GET_EARNINGS, pLPApiType2, new PLPDefaultProxy(), new ProxyMethodParserDefault(), new C11548i(), new C11549j(), httpMethod3, true, CacheMethodsPLPUser.GET_EARNINGS);
        HttpMethod httpMethod6 = httpMethod;
        PLP_USER_SUGGEST = new BaseProxyMethodType(PLPMethodNames.PLP_USER_SUGGEST, pLPApiType2, new PLPDefaultProxy(), new ProxyMethodParserDefault(), new C11551l(), (Set<RMNMethodReturnJSON>) null, httpMethod6, true, (ICacheMethodType) null);
        PLP_USER_CHECK_SPONSORSHIP_CODE = new BaseProxyMethodType(PLPMethodNames.PLP_USER_CHECK_SPONSORSHIP_CODE, pLPApiType2, new PLPDefaultProxy(), new ProxyMethodParserDefault(), new C11552m(), new C11553n(), httpMethod6, true, (ICacheMethodType) null);
        PLPDefaultProxy pLPDefaultProxy3 = new PLPDefaultProxy();
        ProxyMethodParserDefault proxyMethodParserDefault3 = new ProxyMethodParserDefault();
        C11554o oVar = new C11554o();
        C11555p pVar = new C11555p();
        ICacheMethodType iCacheMethodType = CacheMethodsPLPUser.GET_SPONSORED_USERS;
        PLP_USER_GET_SPONSORED_USERS = new BaseProxyMethodType(PLPMethodNames.PLP_USER_GET_SPONSORED_USERS, pLPApiType2, pLPDefaultProxy3, proxyMethodParserDefault3, oVar, pVar, httpMethod3, true, iCacheMethodType);
        PLP_USER_UNREGISTER = new BaseProxyMethodType(PLPMethodNames.PLP_USER_UNREGISTER, pLPApiType2, new PLPDefaultProxy(), new ProxyMethodParserDefault(), new C11556q(), (Set<RMNMethodReturnJSON>) null, httpMethod, true, iCacheMethodType);
    }
}
