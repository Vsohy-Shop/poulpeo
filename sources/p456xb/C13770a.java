package p456xb;

import androidx.annotation.NonNull;
import com.rmn.api.p322v2.common.user.LogoutListener;
import com.rmn.api.p322v2.main.cache.ICacheListenerClear;
import com.rmn.api.p322v2.main.cache.cachebundleinput.CacheBundleInputClear;
import com.rmn.api.p322v2.main.oauth.OAuthAccountManager;
import com.rmn.api.p322v2.poulpeo.cache.methods.CacheMethodsPLPHome;
import com.rmn.api.p322v2.poulpeo.cache.methods.CacheMethodsPLPUser;
import com.rmn.api.p322v2.poulpeo.cache.methods.CacheMethodsSupportTicket;
import com.rmn.api.p322v2.poulpeo.general.PLPApiType;
import com.rmn.api.p322v2.poulpeo.notifications.PLPPushNotificationManager;
import com.rmn.api.p322v2.poulpeo.user.PLPPinnedObjectsManager;
import com.rmn.iosadapters.android.content.ContextContainer;

/* renamed from: xb.a */
/* compiled from: BasePLPLogoutListener */
public abstract class C13770a implements LogoutListener {
    @NonNull

    /* renamed from: a */
    protected final ContextContainer f22202a;

    public C13770a(@NonNull ContextContainer contextContainer) {
        this.f22202a = contextContainer;
    }

    public void onLogout(boolean z) {
        OAuthAccountManager instance = OAuthAccountManager.getInstance();
        ContextContainer contextContainer = this.f22202a;
        PLPApiType pLPApiType = PLPApiType.PLP;
        instance.invalidateAccessTokensLocally(contextContainer, pLPApiType);
        OAuthAccountManager.getInstance().invalidateRequestTokensLocally(this.f22202a, pLPApiType);
        OAuthAccountManager.getInstance().facebookTokenHandler.invalidateAccessToken(this.f22202a);
        OAuthAccountManager.getInstance().googleTokenHandler.invalidateAccessToken(this.f22202a);
        OAuthAccountManager.getInstance().appleTokenHandler.invalidateAccessToken(this.f22202a);
        PLPPushNotificationManager.getInstance(this.f22202a).retrieveUserThenUnregisterDevice();
        PLPPushNotificationManager.getInstance(this.f22202a).removeAcceptedPushNotifications();
        CacheBundleInputClear cacheBundleInputClear = new CacheBundleInputClear(this.f22202a, CacheMethodsPLPUser.GET_DETAILS);
        cacheBundleInputClear.getMethodType().getCache(this.f22202a).executeCacheActionClear((ICacheListenerClear) null, cacheBundleInputClear);
        CacheBundleInputClear cacheBundleInputClear2 = new CacheBundleInputClear(this.f22202a, CacheMethodsPLPHome.APP_HOME);
        cacheBundleInputClear2.getMethodType().getCache(this.f22202a).executeCacheActionClear((ICacheListenerClear) null, cacheBundleInputClear2);
        CacheBundleInputClear cacheBundleInputClear3 = new CacheBundleInputClear(this.f22202a, CacheMethodsPLPUser.GET_EARNINGS);
        cacheBundleInputClear3.getMethodType().getCache(this.f22202a).executeCacheActionClear((ICacheListenerClear) null, cacheBundleInputClear3);
        CacheBundleInputClear cacheBundleInputClear4 = new CacheBundleInputClear(this.f22202a, CacheMethodsPLPUser.GET_SPONSORED_USERS);
        cacheBundleInputClear4.getMethodType().getCache(this.f22202a).executeCacheActionClear((ICacheListenerClear) null, cacheBundleInputClear4);
        CacheBundleInputClear cacheBundleInputClear5 = new CacheBundleInputClear(this.f22202a, CacheMethodsSupportTicket.GET_LIST);
        cacheBundleInputClear5.getMethodType().getCache(this.f22202a).executeCacheActionClear((ICacheListenerClear) null, cacheBundleInputClear5);
        PLPPinnedObjectsManager.getInstance(this.f22202a).onLogOut();
    }
}
