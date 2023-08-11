package com.google.android.gms.internal.cast;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import androidx.annotation.MainThread;
import androidx.annotation.Nullable;
import com.google.android.gms.cast.CastDevice;
import com.rmn.api.p322v2.main.oauth.OAuthErrorCodes;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;
import org.checkerframework.dataflow.qual.Pure;
import p120i4.C8116a;
import p120i4.C8125d;
import p150l4.C8675b;
import p231t4.C9713p;

@MainThread
/* renamed from: com.google.android.gms.internal.cast.n6 */
/* compiled from: com.google.android.gms:play-services-cast-framework@@21.2.0 */
public final class C5042n6 {
    /* access modifiers changed from: private */

    /* renamed from: k */
    public static final C8675b f5395k = new C8675b("ApplicationAnalytics");
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final C4952i1 f5396a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final C5078p8 f5397b;

    /* renamed from: c */
    private final C4988k3 f5398c = new C4988k3(this);

    /* renamed from: d */
    private final Runnable f5399d = new C4970j2(this);

    /* renamed from: e */
    private final Handler f5400e = new C4968j0(Looper.getMainLooper());
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final SharedPreferences f5401f;
    /* access modifiers changed from: private */
    @Nullable

    /* renamed from: g */
    public C5060o7 f5402g;
    /* access modifiers changed from: private */
    @Nullable

    /* renamed from: h */
    public C8125d f5403h;

    /* renamed from: i */
    private boolean f5404i;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public boolean f5405j;

    public C5042n6(SharedPreferences sharedPreferences, C4952i1 i1Var, Bundle bundle, String str) {
        this.f5401f = sharedPreferences;
        this.f5396a = i1Var;
        this.f5397b = new C5078p8(bundle, str);
    }

    /* renamed from: g */
    public static /* synthetic */ void m7259g(C5042n6 n6Var) {
        C5060o7 o7Var = n6Var.f5402g;
        if (o7Var != null) {
            n6Var.f5396a.mo32841d(n6Var.f5397b.mo32949a(o7Var), OAuthErrorCodes.ERR_OAUTH_VERSION);
        }
        n6Var.m7275w();
    }

    /* renamed from: n */
    static /* bridge */ /* synthetic */ void m7266n(C5042n6 n6Var, int i) {
        f5395k.mo42754a("log session ended with error = %d", Integer.valueOf(i));
        n6Var.m7273u();
        n6Var.f5396a.mo32841d(n6Var.f5397b.mo32953e(n6Var.f5402g, i), 228);
        n6Var.m7272t();
        if (!n6Var.f5405j) {
            n6Var.f5402g = null;
        }
    }

    /* renamed from: o */
    static /* bridge */ /* synthetic */ void m7267o(C5042n6 n6Var, SharedPreferences sharedPreferences, String str) {
        if (n6Var.m7278z(str)) {
            f5395k.mo42754a("Use the existing ApplicationAnalyticsSession if it is available and valid.", new Object[0]);
            C9713p.m20275j(n6Var.f5402g);
            return;
        }
        n6Var.f5402g = C5060o7.m7302b(sharedPreferences);
        if (n6Var.m7278z(str)) {
            f5395k.mo42754a("Use the restored ApplicationAnalyticsSession if it is valid.", new Object[0]);
            C9713p.m20275j(n6Var.f5402g);
            C5060o7.f5434k = n6Var.f5402g.f5437c + 1;
            return;
        }
        f5395k.mo42754a("The restored ApplicationAnalyticsSession is not valid, create a new one.", new Object[0]);
        C5060o7 a = C5060o7.m7301a(n6Var.f5404i);
        n6Var.f5402g = a;
        a.f5435a = m7271s();
        n6Var.f5402g.f5439e = str;
    }

    /* renamed from: r */
    static /* bridge */ /* synthetic */ void m7270r(C5042n6 n6Var, boolean z) {
        String str;
        C8675b bVar = f5395k;
        Object[] objArr = new Object[1];
        if (true != z) {
            str = "foreground";
        } else {
            str = "background";
        }
        objArr[0] = str;
        bVar.mo42754a("update app visibility to %s", objArr);
        n6Var.f5404i = z;
        C5060o7 o7Var = n6Var.f5402g;
        if (o7Var != null) {
            o7Var.f5442h = z;
        }
    }

    @Pure
    /* renamed from: s */
    private static String m7271s() {
        return ((C8116a) C9713p.m20275j(C8116a.m15985c())).mo41971a().mo41986H();
    }

    /* access modifiers changed from: private */
    /* renamed from: t */
    public final void m7272t() {
        this.f5400e.removeCallbacks(this.f5399d);
    }

    /* access modifiers changed from: private */
    @EnsuresNonNull({"analyticsSession"})
    /* renamed from: u */
    public final void m7273u() {
        CastDevice castDevice;
        if (m7277y()) {
            C8125d dVar = this.f5403h;
            if (dVar != null) {
                castDevice = dVar.mo42004o();
            } else {
                castDevice = null;
            }
            if (castDevice != null && !TextUtils.equals(this.f5402g.f5436b, castDevice.mo31906P())) {
                m7276x(castDevice);
            }
            C9713p.m20275j(this.f5402g);
            return;
        }
        f5395k.mo42759f("The analyticsSession should not be null for logging. Create a dummy one.", new Object[0]);
        m7274v();
    }

    /* access modifiers changed from: private */
    @EnsuresNonNull({"analyticsSession"})
    /* renamed from: v */
    public final void m7274v() {
        CastDevice castDevice;
        int i = 0;
        f5395k.mo42754a("Create a new ApplicationAnalyticsSession based on CastSession", new Object[0]);
        C5060o7 a = C5060o7.m7301a(this.f5404i);
        this.f5402g = a;
        a.f5435a = m7271s();
        C8125d dVar = this.f5403h;
        if (dVar == null) {
            castDevice = null;
        } else {
            castDevice = dVar.mo42004o();
        }
        if (castDevice != null) {
            m7276x(castDevice);
        }
        C9713p.m20275j(this.f5402g);
        C5060o7 o7Var = this.f5402g;
        C8125d dVar2 = this.f5403h;
        if (dVar2 != null) {
            i = dVar2.mo42053m();
        }
        o7Var.f5443i = i;
        C9713p.m20275j(this.f5402g);
    }

    /* access modifiers changed from: private */
    /* renamed from: w */
    public final void m7275w() {
        ((Handler) C9713p.m20275j(this.f5400e)).postDelayed((Runnable) C9713p.m20275j(this.f5399d), 300000);
    }

    /* renamed from: x */
    private final void m7276x(CastDevice castDevice) {
        C5060o7 o7Var = this.f5402g;
        if (o7Var != null) {
            o7Var.f5436b = castDevice.mo31906P();
            o7Var.f5440f = castDevice.mo31904N();
            o7Var.f5441g = castDevice.mo31900J();
        }
    }

    @EnsuresNonNullIf(expression = {"analyticsSession"}, result = true)
    /* renamed from: y */
    private final boolean m7277y() {
        String str;
        if (this.f5402g == null) {
            f5395k.mo42754a("The analytics session is null when matching with application ID.", new Object[0]);
            return false;
        }
        String s = m7271s();
        if (s == null || (str = this.f5402g.f5435a) == null || !TextUtils.equals(str, s)) {
            f5395k.mo42754a("The analytics session doesn't match the application ID %s", s);
            return false;
        }
        C9713p.m20275j(this.f5402g);
        return true;
    }

    /* renamed from: z */
    private final boolean m7278z(String str) {
        String str2;
        if (!m7277y()) {
            return false;
        }
        C9713p.m20275j(this.f5402g);
        if (str != null && (str2 = this.f5402g.f5439e) != null && TextUtils.equals(str2, str)) {
            return true;
        }
        f5395k.mo42754a("The analytics session doesn't match the receiver session ID %s.", str);
        return false;
    }

    /* renamed from: c */
    public final C4988k3 mo32902c() {
        return this.f5398c;
    }
}
