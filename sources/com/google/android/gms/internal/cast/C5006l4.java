package com.google.android.gms.internal.cast;

import com.rmn.api.p322v2.main.oauth.OAuthErrorCodes;
import p120i4.C8125d;
import p120i4.C8156o;
import p120i4.C8160q;
import p231t4.C9713p;

/* renamed from: com.google.android.gms.internal.cast.l4 */
/* compiled from: com.google.android.gms:play-services-cast-framework@@21.2.0 */
public final class C5006l4 implements C8160q {

    /* renamed from: a */
    final /* synthetic */ C5042n6 f5285a;

    public C5006l4(C5042n6 n6Var) {
        this.f5285a = n6Var;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo32868a(C8156o oVar, int i) {
        this.f5285a.f5403h = (C8125d) oVar;
        C5042n6.m7266n(this.f5285a, i);
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ void mo32869b(C8156o oVar, String str) {
        C5042n6.f5395k.mo42754a("onSessionResuming with sessionId = %s", str);
        this.f5285a.f5403h = (C8125d) oVar;
        C5042n6 n6Var = this.f5285a;
        C5042n6.m7267o(n6Var, n6Var.f5401f, str);
        C9713p.m20275j(this.f5285a.f5402g);
        C5042n6 n6Var2 = this.f5285a;
        this.f5285a.f5396a.mo32841d(n6Var2.f5397b.mo32951c(n6Var2.f5402g), OAuthErrorCodes.ERR_OAUTH_MISSING_TIMESTAMP);
    }

    /* renamed from: c */
    public final /* bridge */ /* synthetic */ void mo32870c(C8156o oVar, String str) {
        C5042n6.f5395k.mo42754a("onSessionStarted with sessionId = %s", str);
        this.f5285a.f5403h = (C8125d) oVar;
        this.f5285a.m7273u();
        C5042n6 n6Var = this.f5285a;
        n6Var.f5402g.f5439e = str;
        this.f5285a.f5396a.mo32841d(n6Var.f5397b.mo32949a(n6Var.f5402g), OAuthErrorCodes.ERR_OAUTH_TIMESTAMP);
        this.f5285a.f5402g.mo32914c(this.f5285a.f5401f);
        this.f5285a.m7275w();
    }

    /* renamed from: d */
    public final /* bridge */ /* synthetic */ void mo32871d(C8156o oVar, boolean z) {
        C5042n6.f5395k.mo42754a("onSessionResumed with wasSuspended = %b", Boolean.valueOf(z));
        this.f5285a.f5403h = (C8125d) oVar;
        this.f5285a.m7273u();
        C9713p.m20275j(this.f5285a.f5402g);
        C5042n6 n6Var = this.f5285a;
        this.f5285a.f5396a.mo32841d(n6Var.f5397b.mo32950b(n6Var.f5402g, z), OAuthErrorCodes.ERR_OAUTH_MISSING_SIG_METHOD);
        this.f5285a.f5402g.mo32914c(this.f5285a.f5401f);
        this.f5285a.m7275w();
    }

    /* renamed from: e */
    public final /* bridge */ /* synthetic */ void mo32872e(C8156o oVar, int i) {
        C5042n6.f5395k.mo42754a("onSessionSuspended with reason = %d", Integer.valueOf(i));
        this.f5285a.f5403h = (C8125d) oVar;
        this.f5285a.m7273u();
        C9713p.m20275j(this.f5285a.f5402g);
        C5042n6 n6Var = this.f5285a;
        this.f5285a.f5396a.mo32841d(n6Var.f5397b.mo32953e(n6Var.f5402g, i), OAuthErrorCodes.ERR_OAUTH_MISSING_CONSUMER);
        this.f5285a.f5402g.mo32914c(this.f5285a.f5401f);
        this.f5285a.m7272t();
    }

    /* renamed from: f */
    public final /* bridge */ /* synthetic */ void mo32873f(C8156o oVar, int i) {
        this.f5285a.f5403h = (C8125d) oVar;
        C5042n6.m7266n(this.f5285a, i);
    }

    /* renamed from: g */
    public final /* bridge */ /* synthetic */ void mo32874g(C8156o oVar) {
        C5042n6.f5395k.mo42754a("onSessionStarting", new Object[0]);
        this.f5285a.f5403h = (C8125d) oVar;
        if (this.f5285a.f5402g != null) {
            C5042n6.f5395k.mo42759f("Start a session while there's already an active session. Create a new one.", new Object[0]);
        }
        this.f5285a.m7274v();
        C5042n6 n6Var = this.f5285a;
        this.f5285a.f5396a.mo32841d(n6Var.f5397b.mo32952d(n6Var.f5402g), OAuthErrorCodes.ERR_OAUTH_SIG_METHOD);
    }

    /* renamed from: h */
    public final /* synthetic */ void mo32875h(C8156o oVar) {
        this.f5285a.f5403h = (C8125d) oVar;
    }

    /* renamed from: i */
    public final /* bridge */ /* synthetic */ void mo32876i(C8156o oVar, int i) {
        this.f5285a.f5403h = (C8125d) oVar;
        C5042n6.m7266n(this.f5285a, i);
    }
}
