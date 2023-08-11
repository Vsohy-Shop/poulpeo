package com.rmn.api.p322v2.poulpeo.proxy.methods;

import com.rmn.api.p322v2.main.cache.ICacheMethodType;
import com.rmn.api.p322v2.main.general.methodparam.RMNMethodParam;
import com.rmn.api.p322v2.main.general.methodreturn.RMNMethodReturnJSON;
import com.rmn.api.p322v2.main.oauth.HttpMethod;
import com.rmn.api.p322v2.main.parser.ProxyMethodParserDefault;
import com.rmn.api.p322v2.main.proxy.BaseProxyMethodType;
import com.rmn.api.p322v2.main.proxy.IProxyMethodType;
import com.rmn.api.p322v2.poulpeo.general.PLPApiType;
import com.rmn.api.p322v2.poulpeo.general.PLPMethodNames;
import com.rmn.api.p322v2.poulpeo.general.PLPMethodParameters;
import com.rmn.api.p322v2.poulpeo.general.PLPMethodReturns;
import com.rmn.api.p322v2.poulpeo.proxy.PLPDefaultProxy;
import java.util.HashSet;

/* renamed from: com.rmn.api.v2.poulpeo.proxy.methods.ProxyMethodsPLPMailNotification */
public class ProxyMethodsPLPMailNotification {
    public static final IProxyMethodType CONFIGURE = new BaseProxyMethodType(PLPMethodNames.PLP_MAIL_NOTIFICATION_CONFIGURE, PLPApiType.PLP, new PLPDefaultProxy(), new ProxyMethodParserDefault(), new C11524a(), new C11525b(), HttpMethod.GET, true, (ICacheMethodType) null);

    /* renamed from: com.rmn.api.v2.poulpeo.proxy.methods.ProxyMethodsPLPMailNotification$a */
    class C11524a extends HashSet<RMNMethodParam> {
        C11524a() {
            add(PLPMethodParameters.PLP_MAIL_NOTIFICATION_CASHBACK_PENDING);
            add(PLPMethodParameters.PLP_MAIL_NOTIFICATION_CASHBACK_ACCEPTED);
            add(PLPMethodParameters.PLP_MAIL_NOTIFICATION_SPONSORSHIP);
            add(PLPMethodParameters.PLP_MAIL_NOTIFICATION_REVIEW);
            add(PLPMethodParameters.PLP_MAIL_NOTIFICATION_MONTHLY);
            add(PLPMethodParameters.PLP_MAIL_NOTIFICATION_NEWSLETTER_CASHBACK_INCREASE);
            add(PLPMethodParameters.PLP_MAIL_NOTIFICATION_NEWSLETTER_BEST_OF);
            add(PLPMethodParameters.PLP_MAIL_NOTIFICATION_NEWSLETTER_PARTNERS);
            add(PLPMethodParameters.PLP_MAIL_NOTIFICATION_NEWSLETTER_RELATIONAL);
        }
    }

    /* renamed from: com.rmn.api.v2.poulpeo.proxy.methods.ProxyMethodsPLPMailNotification$b */
    class C11525b extends HashSet<RMNMethodReturnJSON> {
        C11525b() {
            add(PLPMethodReturns.PLP_MAIL_NOTIFICATION_CASHBACK_PENDING);
            add(PLPMethodReturns.PLP_MAIL_NOTIFICATION_CASHBACK_ACCEPTED);
            add(PLPMethodReturns.PLP_MAIL_NOTIFICATION_SPONSORSHIP);
            add(PLPMethodReturns.PLP_MAIL_NOTIFICATION_REVIEW);
            add(PLPMethodReturns.PLP_MAIL_NOTIFICATION_MONTHLY);
            add(PLPMethodReturns.PLP_MAIL_NOTIFICATION_NEWSLETTER_CASHBACK_INCREASE);
            add(PLPMethodReturns.PLP_MAIL_NOTIFICATION_NEWSLETTER_BEST_OF);
            add(PLPMethodReturns.PLP_MAIL_NOTIFICATION_NEWSLETTER_PARTNERS);
            add(PLPMethodReturns.PLP_MAIL_NOTIFICATION_NEWSLETTER_RELATIONAL);
        }
    }
}
