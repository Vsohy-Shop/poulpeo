package com.rmn.api.p322v2.poulpeo.notifications;

import com.rmn.api.p322v2.cloud.notifications.BasePushNotificationManager;
import com.rmn.api.p322v2.common.user.LogoutListener;
import com.rmn.api.p322v2.main.proxy.IProxyListener;
import com.rmn.api.p322v2.main.proxy.ProxyBundleInput;
import com.rmn.api.p322v2.main.proxy.ProxyBundleOutput;
import com.rmn.api.p322v2.poulpeo.general.PLPMethodReturns;
import com.rmn.api.p322v2.poulpeo.model.PLPUser;
import com.rmn.api.p322v2.poulpeo.proxy.methods.ProxyMethodsPLPUser;
import com.rmn.iosadapters.android.content.ContextContainer;
import p446vd.C13633n;

/* renamed from: com.rmn.api.v2.poulpeo.notifications.PLPPushNotificationManager */
public class PLPPushNotificationManager extends BasePushNotificationManager {
    private static volatile PLPPushNotificationManager instance;

    /* renamed from: com.rmn.api.v2.poulpeo.notifications.PLPPushNotificationManager$a */
    class C11505a implements IProxyListener {
        C11505a() {
        }

        public void onProxyActionExecuted(ProxyBundleInput proxyBundleInput, ProxyBundleOutput proxyBundleOutput) {
            PLPUser pLPUser = (PLPUser) proxyBundleOutput.getResponseObject(PLPMethodReturns.PLP_USER_DETAIL);
            if (pLPUser != null) {
                PLPPushNotificationManager pLPPushNotificationManager = PLPPushNotificationManager.this;
                pLPPushNotificationManager.registerDevice("" + pLPUser.getUserId());
            }
        }
    }

    /* renamed from: com.rmn.api.v2.poulpeo.notifications.PLPPushNotificationManager$b */
    class C11506b implements IProxyListener {
        C11506b() {
        }

        public void onProxyActionExecuted(ProxyBundleInput proxyBundleInput, ProxyBundleOutput proxyBundleOutput) {
            PLPUser pLPUser = (PLPUser) proxyBundleOutput.getResponseObject(PLPMethodReturns.PLP_USER_DETAIL);
            if (pLPUser == null) {
                PLPPushNotificationManager.this.unregisterDevice((String) null);
                return;
            }
            PLPPushNotificationManager pLPPushNotificationManager = PLPPushNotificationManager.this;
            pLPPushNotificationManager.unregisterDevice("" + pLPUser.getUserId());
        }
    }

    protected PLPPushNotificationManager(ContextContainer contextContainer) {
        super(contextContainer);
    }

    public static PLPPushNotificationManager getInstance(ContextContainer contextContainer) {
        if (instance == null) {
            synchronized (PLPPushNotificationManager.class) {
                if (instance == null) {
                    instance = new PLPPushNotificationManager(contextContainer);
                }
            }
        } else if (contextContainer != null) {
            instance.contextContainer = contextContainer;
        } else {
            throw new IllegalArgumentException();
        }
        return instance;
    }

    public void retrieveUserThenRegisterDevice() {
        if (!hasAcceptedPushNotifications()) {
            C13633n.m31158n("Device won't register as it is disabled in user settings");
        } else {
            new ProxyBundleInput(this.contextContainer, ProxyMethodsPLPUser.PLP_USER_GET_DETAILS, ProxyBundleInput.ProxySourcesOption.GET_FROM_CACHE_ONLY, ProxyBundleInput.ProxyNetworkOption.NO_CACHE, (LogoutListener) null).executeProxyAction(new C11505a());
        }
    }

    public void retrieveUserThenUnregisterDevice() {
        new ProxyBundleInput(this.contextContainer, ProxyMethodsPLPUser.PLP_USER_GET_DETAILS, ProxyBundleInput.ProxySourcesOption.GET_FROM_CACHE_ONLY, ProxyBundleInput.ProxyNetworkOption.NO_CACHE, (LogoutListener) null).executeProxyAction(new C11506b());
    }
}
