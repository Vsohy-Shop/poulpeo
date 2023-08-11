package com.rmn.api.p322v2.main.oauth;

import androidx.annotation.NonNull;
import com.rmn.api.p322v2.main.general.IApiType;
import com.rmn.iosadapters.android.content.ContextContainer;
import java.net.MalformedURLException;
import java.util.HashMap;
import java.util.Map;
import p446vd.C13630k;
import p446vd.C13633n;
import p446vd.C13635p;

/* renamed from: com.rmn.api.v2.main.oauth.OAuthAccountManager */
public class OAuthAccountManager {
    private static final String STORE_FIELD_ACCESS_TOKEN = "access_token_";
    private static final String STORE_FIELD_ACCESS_TOKEN_SECRET = "access_token_secret_";
    private static volatile OAuthAccountManager instance;
    @NonNull
    public final SocialLoginAccessTokenHandler appleTokenHandler = new SocialLoginAccessTokenHandler("access_token_apple");
    @NonNull
    public final SocialLoginAccessTokenHandler facebookTokenHandler = new SocialLoginAccessTokenHandler("access_token_facebook");
    @NonNull
    public final SocialLoginAccessTokenHandler googleTokenHandler = new SocialLoginAccessTokenHandler("access_token_google");
    private Map<IApiType, LoginRequest> loginRequests = new HashMap();

    /* renamed from: com.rmn.api.v2.main.oauth.OAuthAccountManager$a */
    class C11362a implements IAsyncTaskRequestsListener {

        /* renamed from: a */
        private String f17873a;

        /* renamed from: b */
        final /* synthetic */ IApiType f17874b;

        C11362a(IApiType iApiType) {
            this.f17874b = iApiType;
        }

        public void onRequestCancelled(BundleRequest bundleRequest) {
            C13633n.m31149e(OAuthAccountManager.this, "Oauth 3 legged token cancelled");
        }

        public void onRequestFailed(BundleRequest bundleRequest, boolean z, int i) {
            OAuthAccountManager.this.requestTokenFailed(this.f17874b);
        }

        public void onRequestSucceededInsideUIThread(BundleRequest bundleRequest, boolean z) {
            if (!z) {
                C13633n.m31149e(OAuthAccountManager.this, "Oauth 3 legged problem");
                OAuthAccountManager.this.requestTokenFailed(this.f17874b);
                return;
            }
            String str = this.f17873a;
            if (str == null || str.equals("")) {
                C13633n.m31149e(OAuthAccountManager.this, "Oauth 3 legged token empty");
                OAuthAccountManager.this.requestTokenFailed(this.f17874b);
                return;
            }
            OAuthAccountManager.this.requestTokenSucceeded(this.f17874b, this.f17873a);
        }

        public boolean onRequestSucceededOutsideUIThread(BundleRequest bundleRequest, String str) {
            OAuthAPIObject oAuthAPIObject = OAuthAccountManager.this.getLoginRequest(this.f17874b).getOAuthAPIObject();
            if (oAuthAPIObject == null) {
                return false;
            }
            oAuthAPIObject.mo47059l(str);
            if (!oAuthAPIObject.mo47056i()) {
                return false;
            }
            String c = oAuthAPIObject.mo47050c();
            OAuthAccountManager.this.getLoginRequest(this.f17874b).setRequestToken(new TokensBundle(c, oAuthAPIObject.mo47051d()));
            HashMap hashMap = new HashMap();
            hashMap.put("oauth_token", c);
            hashMap.put("oauth_callback", "");
            this.f17873a = C13630k.m31136a(oAuthAPIObject.mo47053f(), hashMap);
            return true;
        }
    }

    /* renamed from: com.rmn.api.v2.main.oauth.OAuthAccountManager$b */
    class C11363b implements IAsyncTaskRequestsListener {

        /* renamed from: a */
        final /* synthetic */ IApiType f17876a;

        /* renamed from: b */
        final /* synthetic */ ContextContainer f17877b;

        C11363b(IApiType iApiType, ContextContainer contextContainer) {
            this.f17876a = iApiType;
            this.f17877b = contextContainer;
        }

        public void onRequestCancelled(BundleRequest bundleRequest) {
            C13633n.m31149e(OAuthAccountManager.this, "Oauth 3 legged token cancelled");
        }

        public void onRequestFailed(BundleRequest bundleRequest, boolean z, int i) {
            OAuthAccountManager.this.accessTokenFailed(this.f17876a);
        }

        public void onRequestSucceededInsideUIThread(BundleRequest bundleRequest, boolean z) {
            if (!z) {
                C13633n.m31149e(OAuthAccountManager.this, "Oauth 3 legged problem");
                OAuthAccountManager.this.accessTokenFailed(this.f17876a);
                return;
            }
            OAuthAccountManager.this.saveTokensLocally(this.f17877b, this.f17876a);
            if (!OAuthAccountManager.this.isConnectedToAccount(this.f17876a)) {
                OAuthAccountManager.this.accessTokenFailed(this.f17876a);
                C13633n.m31149e(OAuthAccountManager.this, "Oauth 3 legged not connected");
                return;
            }
            OAuthAccountManager.this.accessTokenSucceeded(this.f17876a);
        }

        public boolean onRequestSucceededOutsideUIThread(BundleRequest bundleRequest, String str) {
            OAuthAPIObject oAuthAPIObject = OAuthAccountManager.this.getLoginRequest(this.f17876a).getOAuthAPIObject();
            if (oAuthAPIObject == null) {
                return false;
            }
            oAuthAPIObject.mo47057j(str);
            return oAuthAPIObject.mo47055h();
        }
    }

    private OAuthAccountManager() {
    }

    private String getAccessKeyFromLibrary(IApiType iApiType) {
        TokensBundle a = getLoginRequest(iApiType).getOAuthAPIObject().mo47048a();
        if (a == null) {
            return null;
        }
        return a.key;
    }

    private String getAccessSecretFromLibrary(IApiType iApiType) {
        TokensBundle a = getLoginRequest(iApiType).getOAuthAPIObject().mo47048a();
        if (a == null) {
            return null;
        }
        return a.secret;
    }

    public static OAuthAccountManager getInstance() {
        if (instance == null) {
            synchronized (OAuthAccountManager.class) {
                if (instance == null) {
                    instance = new OAuthAccountManager();
                }
            }
        }
        return instance;
    }

    private void retrieveAccessToken(ContextContainer contextContainer, IApiType iApiType) {
        invalidateAccessTokensLocally(contextContainer, iApiType);
        String e = getLoginRequest(iApiType).getOAuthAPIObject().mo47052e();
        HashMap hashMap = new HashMap();
        String oAuthPinCode = getOAuthPinCode(iApiType);
        if (oAuthPinCode != null && !oAuthPinCode.equals("")) {
            hashMap.put("oauth_verifier", "" + oAuthPinCode);
        }
        try {
            AsyncTaskRequestsManager.getInstance(contextContainer).sendRequest(new BundleRequest(iApiType, e, (Map<String, String>) hashMap, true), new C11363b(iApiType, contextContainer), HttpMethod.POST, true);
        } catch (MalformedURLException unused) {
        }
    }

    private void retrieveRequestToken(ContextContainer contextContainer, IApiType iApiType) {
        invalidateAccessTokensLocally(contextContainer, iApiType);
        invalidateRequestTokensLocally(contextContainer, iApiType);
        try {
            AsyncTaskRequestsManager.getInstance(contextContainer).sendRequest(new BundleRequest(iApiType, getLoginRequest(iApiType).getOAuthAPIObject().mo47054g(), (Map<String, String>) new HashMap(), false), new C11362a(iApiType), HttpMethod.POST, true);
        } catch (MalformedURLException unused) {
        }
    }

    /* access modifiers changed from: package-private */
    public void accessTokenFailed(IApiType iApiType) {
        synchronized (OAuthAccountManager.class) {
            LoginRequest loginRequest = getLoginRequest(iApiType);
            IOAuthAccountListener b = loginRequest.getOAuthAPIObject().mo47049b();
            if (b != null) {
                b.onAccessTokenFail(loginRequest.getErrorResponseResult());
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void accessTokenSucceeded(IApiType iApiType) {
        synchronized (OAuthAccountManager.class) {
            IOAuthAccountListener b = getLoginRequest(iApiType).getOAuthAPIObject().mo47049b();
            if (b != null) {
                b.onAccessTokenSuccess();
            }
        }
    }

    /* access modifiers changed from: package-private */
    public String getAccessKey(IApiType iApiType) {
        TokensBundle accessToken = getLoginRequest(iApiType).getAccessToken();
        if (accessToken == null) {
            return null;
        }
        return accessToken.key;
    }

    /* access modifiers changed from: package-private */
    public String getAccessSecret(IApiType iApiType) {
        TokensBundle accessToken = getLoginRequest(iApiType).getAccessToken();
        if (accessToken == null) {
            return null;
        }
        return accessToken.secret;
    }

    public LoginRequest getLoginRequest(IApiType iApiType) {
        if (iApiType != null) {
            LoginRequest loginRequest = this.loginRequests.get(iApiType);
            if (loginRequest != null) {
                return loginRequest;
            }
            LoginRequest loginRequest2 = new LoginRequest();
            this.loginRequests.put(iApiType, loginRequest2);
            return loginRequest2;
        }
        throw new IllegalArgumentException();
    }

    /* access modifiers changed from: package-private */
    public String getOAuthPinCode(IApiType iApiType) {
        return getLoginRequest(iApiType).getPinCode();
    }

    /* access modifiers changed from: package-private */
    public String getRequestKey(IApiType iApiType) {
        TokensBundle requestToken = getLoginRequest(iApiType).getRequestToken();
        if (requestToken == null) {
            return null;
        }
        return requestToken.key;
    }

    /* access modifiers changed from: package-private */
    public String getRequestSecret(IApiType iApiType) {
        TokensBundle requestToken = getLoginRequest(iApiType).getRequestToken();
        if (requestToken == null) {
            return null;
        }
        return requestToken.secret;
    }

    public void invalidateAccessTokensLocally(ContextContainer contextContainer, IApiType iApiType) {
        if (contextContainer == null) {
            throw new IllegalArgumentException();
        } else if (iApiType != null) {
            String tag = iApiType.getTag();
            C13635p g = C13635p.m31176g(contextContainer);
            synchronized (OAuthAccountManager.class) {
                g.mo53289i(STORE_FIELD_ACCESS_TOKEN + tag);
                g.mo53289i(STORE_FIELD_ACCESS_TOKEN_SECRET + tag);
                getLoginRequest(iApiType).setAccessToken((TokensBundle) null);
            }
        } else {
            throw new IllegalArgumentException();
        }
    }

    public void invalidateRequestTokensLocally(ContextContainer contextContainer, IApiType iApiType) {
        if (contextContainer == null) {
            throw new IllegalArgumentException();
        } else if (iApiType != null) {
            getLoginRequest(iApiType).setRequestToken((TokensBundle) null);
        } else {
            throw new IllegalArgumentException();
        }
    }

    public boolean isConnectedToAccount(IApiType iApiType) {
        String accessKey = getAccessKey(iApiType);
        String accessSecret = getAccessSecret(iApiType);
        if (accessKey == null || accessKey.equals("") || accessSecret == null || accessSecret.equals("")) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    public void requestTokenFailed(IApiType iApiType) {
        synchronized (OAuthAccountManager.class) {
            LoginRequest loginRequest = getLoginRequest(iApiType);
            IOAuthAccountListener b = loginRequest.getOAuthAPIObject().mo47049b();
            if (b != null) {
                b.onRequestTokenFail(loginRequest.getErrorResponseResult());
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void requestTokenSucceeded(IApiType iApiType, String str) {
        synchronized (OAuthAccountManager.class) {
            IOAuthAccountListener b = getLoginRequest(iApiType).getOAuthAPIObject().mo47049b();
            if (b != null) {
                b.onRequestTokenSuccess(str);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x005e, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0060, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void retrieveAccessTokenLocally(com.rmn.iosadapters.android.content.ContextContainer r6, com.rmn.api.p322v2.main.general.IApiType r7) {
        /*
            r5 = this;
            if (r6 == 0) goto L_0x006a
            if (r7 == 0) goto L_0x0064
            java.lang.String r0 = r7.getTag()
            vd.p r6 = p446vd.C13635p.m31176g(r6)
            java.lang.Class<com.rmn.api.v2.main.oauth.OAuthAccountManager> r1 = com.rmn.api.p322v2.main.oauth.OAuthAccountManager.class
            monitor-enter(r1)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x0061 }
            r2.<init>()     // Catch:{ all -> 0x0061 }
            java.lang.String r3 = "access_token_"
            r2.append(r3)     // Catch:{ all -> 0x0061 }
            r2.append(r0)     // Catch:{ all -> 0x0061 }
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x0061 }
            java.lang.String r2 = r6.mo53290j(r2)     // Catch:{ all -> 0x0061 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x0061 }
            r3.<init>()     // Catch:{ all -> 0x0061 }
            java.lang.String r4 = "access_token_secret_"
            r3.append(r4)     // Catch:{ all -> 0x0061 }
            r3.append(r0)     // Catch:{ all -> 0x0061 }
            java.lang.String r0 = r3.toString()     // Catch:{ all -> 0x0061 }
            java.lang.String r6 = r6.mo53290j(r0)     // Catch:{ all -> 0x0061 }
            if (r2 == 0) goto L_0x005f
            java.lang.String r0 = ""
            boolean r0 = r2.equals(r0)     // Catch:{ all -> 0x0061 }
            if (r0 == 0) goto L_0x0044
            goto L_0x005f
        L_0x0044:
            if (r6 == 0) goto L_0x005d
            java.lang.String r0 = ""
            boolean r0 = r6.equals(r0)     // Catch:{ all -> 0x0061 }
            if (r0 == 0) goto L_0x004f
            goto L_0x005d
        L_0x004f:
            com.rmn.api.v2.main.oauth.LoginRequest r7 = r5.getLoginRequest(r7)     // Catch:{ all -> 0x0061 }
            com.rmn.api.v2.main.oauth.TokensBundle r0 = new com.rmn.api.v2.main.oauth.TokensBundle     // Catch:{ all -> 0x0061 }
            r0.<init>(r2, r6)     // Catch:{ all -> 0x0061 }
            r7.setAccessToken(r0)     // Catch:{ all -> 0x0061 }
            monitor-exit(r1)     // Catch:{ all -> 0x0061 }
            return
        L_0x005d:
            monitor-exit(r1)     // Catch:{ all -> 0x0061 }
            return
        L_0x005f:
            monitor-exit(r1)     // Catch:{ all -> 0x0061 }
            return
        L_0x0061:
            r6 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0061 }
            throw r6
        L_0x0064:
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            r6.<init>()
            throw r6
        L_0x006a:
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            r6.<init>()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.rmn.api.p322v2.main.oauth.OAuthAccountManager.retrieveAccessTokenLocally(com.rmn.iosadapters.android.content.ContextContainer, com.rmn.api.v2.main.general.IApiType):void");
    }

    /* access modifiers changed from: package-private */
    public void saveTokensLocally(ContextContainer contextContainer, IApiType iApiType) {
        if (contextContainer == null) {
            throw new IllegalArgumentException();
        } else if (iApiType != null) {
            synchronized (OAuthAccountManager.class) {
                String accessKeyFromLibrary = getAccessKeyFromLibrary(iApiType);
                String accessSecretFromLibrary = getAccessSecretFromLibrary(iApiType);
                if (accessKeyFromLibrary == null || accessKeyFromLibrary.equals("")) {
                    throw new IllegalStateException("Access key is null or empty");
                } else if (accessSecretFromLibrary == null || accessSecretFromLibrary.equals("")) {
                    throw new IllegalStateException("Access secret is null or empty");
                } else {
                    String tag = iApiType.getTag();
                    C13635p g = C13635p.m31176g(contextContainer);
                    g.mo53291k(STORE_FIELD_ACCESS_TOKEN + tag, accessKeyFromLibrary);
                    g.mo53291k(STORE_FIELD_ACCESS_TOKEN_SECRET + tag, accessSecretFromLibrary);
                    getLoginRequest(iApiType).setAccessToken(new TokensBundle(accessKeyFromLibrary, accessSecretFromLibrary));
                }
            }
        } else {
            throw new IllegalArgumentException();
        }
    }

    public void sendConnectionConfirmRequest(ContextContainer contextContainer, IOAuthAccountListener iOAuthAccountListener, IApiType iApiType, String str) {
        if (contextContainer == null) {
            throw new IllegalArgumentException();
        } else if (iApiType != null) {
            synchronized (OAuthAccountManager.class) {
                OAuthAPIObject oAuthAPIObject = getLoginRequest(iApiType).getOAuthAPIObject();
                if (iOAuthAccountListener != null) {
                    oAuthAPIObject.mo47058k(iOAuthAccountListener);
                }
                if (str != null && !str.equals("")) {
                    getLoginRequest(iApiType).setPinCode(str);
                }
            }
            retrieveAccessToken(contextContainer, iApiType);
        } else {
            throw new IllegalArgumentException();
        }
    }

    public void sendConnectionRequest(ContextContainer contextContainer, IOAuthAccountListener iOAuthAccountListener, IApiType iApiType, String str, String str2, String str3) {
        if (contextContainer == null) {
            throw new IllegalArgumentException();
        } else if (iApiType == null) {
            throw new IllegalArgumentException();
        } else if (str == null || str.equals("")) {
            throw new IllegalArgumentException();
        } else if (str2 == null || str2.equals("")) {
            throw new IllegalArgumentException();
        } else if (str3 == null || str3.equals("")) {
            throw new IllegalArgumentException();
        } else {
            OAuthAPIObject oAuthAPIObject = new OAuthAPIObject(iOAuthAccountListener, str, str2, str3);
            synchronized (OAuthAccountManager.class) {
                getLoginRequest(iApiType).setOAuthAPIObject(oAuthAPIObject);
            }
            retrieveRequestToken(contextContainer, iApiType);
        }
    }
}
