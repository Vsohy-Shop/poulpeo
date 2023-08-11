package com.facebook;

/* renamed from: com.facebook.e */
/* compiled from: AccessTokenSource.kt */
public enum C4537e {
    NONE(false),
    FACEBOOK_APPLICATION_WEB(true),
    FACEBOOK_APPLICATION_NATIVE(true),
    FACEBOOK_APPLICATION_SERVICE(true),
    WEB_VIEW(true),
    CHROME_CUSTOM_TAB(true),
    TEST_USER(true),
    CLIENT_TOKEN(true),
    DEVICE_AUTH(true),
    INSTAGRAM_APPLICATION_WEB(true),
    INSTAGRAM_CUSTOM_CHROME_TAB(true),
    INSTAGRAM_WEB_VIEW(true);
    

    /* renamed from: b */
    private final boolean f4180b;

    private C4537e(boolean z) {
        this.f4180b = z;
    }

    /* renamed from: a */
    public final boolean mo31558a() {
        return this.f4180b;
    }
}
