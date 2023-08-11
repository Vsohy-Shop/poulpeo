package com.rmn.api.p322v2.main.oauth;

import android.text.TextUtils;

/* renamed from: com.rmn.api.v2.main.oauth.OAuthAPIObject */
class OAuthAPIObject {

    /* renamed from: a */
    private IOAuthAccountListener f17867a;

    /* renamed from: b */
    private String f17868b;

    /* renamed from: c */
    private String f17869c;

    /* renamed from: d */
    private String f17870d;

    /* renamed from: e */
    private TokensBundle f17871e;

    /* renamed from: f */
    private TokensBundle f17872f;

    public OAuthAPIObject(IOAuthAccountListener iOAuthAccountListener, String str, String str2, String str3) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || TextUtils.isEmpty(str3)) {
            throw new IllegalArgumentException();
        }
        this.f17867a = iOAuthAccountListener;
        this.f17868b = str;
        this.f17869c = str2;
        this.f17870d = str3;
        this.f17871e = null;
        this.f17872f = null;
    }

    /* renamed from: a */
    public TokensBundle mo47048a() {
        return this.f17872f;
    }

    /* renamed from: b */
    public IOAuthAccountListener mo47049b() {
        return this.f17867a;
    }

    /* renamed from: c */
    public String mo47050c() {
        TokensBundle tokensBundle = this.f17871e;
        if (tokensBundle == null) {
            return null;
        }
        return tokensBundle.key;
    }

    /* renamed from: d */
    public String mo47051d() {
        TokensBundle tokensBundle = this.f17871e;
        if (tokensBundle == null) {
            return null;
        }
        return tokensBundle.secret;
    }

    /* renamed from: e */
    public String mo47052e() {
        return this.f17869c;
    }

    /* renamed from: f */
    public String mo47053f() {
        return this.f17870d;
    }

    /* renamed from: g */
    public String mo47054g() {
        return this.f17868b;
    }

    /* renamed from: h */
    public boolean mo47055h() {
        TokensBundle tokensBundle = this.f17872f;
        if (tokensBundle != null && !TextUtils.isEmpty(tokensBundle.key) && !TextUtils.isEmpty(this.f17872f.secret)) {
            return true;
        }
        return false;
    }

    /* renamed from: i */
    public boolean mo47056i() {
        TokensBundle tokensBundle = this.f17871e;
        if (tokensBundle != null && !TextUtils.isEmpty(tokensBundle.key) && !TextUtils.isEmpty(this.f17871e.secret)) {
            return true;
        }
        return false;
    }

    /* renamed from: j */
    public void mo47057j(String str) {
        this.f17872f = new TokensBundle(str);
    }

    /* renamed from: k */
    public void mo47058k(IOAuthAccountListener iOAuthAccountListener) {
        if (iOAuthAccountListener != null) {
            this.f17867a = iOAuthAccountListener;
            return;
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: l */
    public void mo47059l(String str) {
        this.f17871e = new TokensBundle(str);
    }
}
