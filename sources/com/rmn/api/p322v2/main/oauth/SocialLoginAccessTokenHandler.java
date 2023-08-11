package com.rmn.api.p322v2.main.oauth;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.rmn.iosadapters.android.content.ContextContainer;
import p446vd.C13635p;

/* renamed from: com.rmn.api.v2.main.oauth.SocialLoginAccessTokenHandler */
public class SocialLoginAccessTokenHandler {
    @Nullable
    private String accessToken;
    @NonNull
    public final String storageKeyString;

    public SocialLoginAccessTokenHandler(@NonNull String str) {
        this.storageKeyString = str;
    }

    @Nullable
    public String getAccessToken() {
        return this.accessToken;
    }

    public boolean hasAccessToken(@Nullable ContextContainer contextContainer) {
        String retrieveAccessToken = retrieveAccessToken(contextContainer);
        if (retrieveAccessToken == null || retrieveAccessToken.equals("")) {
            return false;
        }
        return true;
    }

    public void invalidateAccessToken(ContextContainer contextContainer) {
        if (contextContainer != null) {
            C13635p g = C13635p.m31176g(contextContainer);
            synchronized (OAuthAccountManager.class) {
                this.accessToken = null;
                g.mo53289i(this.storageKeyString);
            }
            return;
        }
        throw new IllegalArgumentException();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x002f, code lost:
        return null;
     */
    @androidx.annotation.Nullable
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String retrieveAccessToken(com.rmn.iosadapters.android.content.ContextContainer r4) {
        /*
            r3 = this;
            if (r4 == 0) goto L_0x0034
            java.lang.Class<com.rmn.api.v2.main.oauth.OAuthAccountManager> r0 = com.rmn.api.p322v2.main.oauth.OAuthAccountManager.class
            monitor-enter(r0)
            java.lang.String r1 = r3.accessToken     // Catch:{ all -> 0x0031 }
            if (r1 == 0) goto L_0x0015
            java.lang.String r2 = ""
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x0031 }
            if (r1 != 0) goto L_0x0015
            java.lang.String r4 = r3.accessToken     // Catch:{ all -> 0x0031 }
            monitor-exit(r0)     // Catch:{ all -> 0x0031 }
            return r4
        L_0x0015:
            vd.p r4 = p446vd.C13635p.m31176g(r4)     // Catch:{ all -> 0x0031 }
            java.lang.String r1 = r3.storageKeyString     // Catch:{ all -> 0x0031 }
            java.lang.String r4 = r4.mo53290j(r1)     // Catch:{ all -> 0x0031 }
            if (r4 == 0) goto L_0x002e
            java.lang.String r1 = ""
            boolean r1 = r4.equals(r1)     // Catch:{ all -> 0x0031 }
            if (r1 == 0) goto L_0x002a
            goto L_0x002e
        L_0x002a:
            r3.accessToken = r4     // Catch:{ all -> 0x0031 }
            monitor-exit(r0)     // Catch:{ all -> 0x0031 }
            return r4
        L_0x002e:
            monitor-exit(r0)     // Catch:{ all -> 0x0031 }
            r4 = 0
            return r4
        L_0x0031:
            r4 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0031 }
            throw r4
        L_0x0034:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            r4.<init>()
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.rmn.api.p322v2.main.oauth.SocialLoginAccessTokenHandler.retrieveAccessToken(com.rmn.iosadapters.android.content.ContextContainer):java.lang.String");
    }

    public void saveAccessToken(ContextContainer contextContainer, String str) {
        if (contextContainer == null) {
            throw new IllegalArgumentException();
        } else if (str != null && !str.equals("")) {
            C13635p g = C13635p.m31176g(contextContainer);
            synchronized (OAuthAccountManager.class) {
                this.accessToken = str;
                g.mo53291k(this.storageKeyString, str);
            }
        }
    }
}
