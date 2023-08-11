package com.google.android.gms.internal.gtm;

import android.content.Context;
import androidx.annotation.Nullable;
import androidx.browser.trusted.sharing.ShareTarget;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* renamed from: com.google.android.gms.internal.gtm.s2 */
public final class C5533s2 implements C5622y2 {

    /* renamed from: c */
    private static C5533s2 f6301c;

    /* renamed from: d */
    private static final Object f6302d = new Object();

    /* renamed from: e */
    private static final Set<String> f6303e = new HashSet(Arrays.asList(new String[]{ShareTarget.METHOD_GET, "HEAD", ShareTarget.METHOD_POST, "PUT"}));

    /* renamed from: a */
    private C5565u3 f6304a;

    /* renamed from: b */
    private C5636z2 f6305b;

    private C5533s2(Context context) {
        this(C5260a3.m7737f(context), new C5291c4());
    }

    /* renamed from: a */
    public static C5622y2 m8487a(Context context) {
        C5533s2 s2Var;
        synchronized (f6302d) {
            if (f6301c == null) {
                f6301c = new C5533s2(context);
            }
            s2Var = f6301c;
        }
        return s2Var;
    }

    /* renamed from: k */
    public final void mo33510k() {
        C5321e4.m7887n().mo33186c();
    }

    /* renamed from: l */
    public final boolean mo33511l(String str, String str2) {
        return mo33513n(str, (String) null, str2, (Map<String, String>) null, (String) null);
    }

    /* renamed from: m */
    public final boolean mo33512m(String str) {
        return mo33513n(str, (String) null, (String) null, (Map<String, String>) null, (String) null);
    }

    /* renamed from: n */
    public final boolean mo33513n(String str, @Nullable String str2, @Nullable String str3, @Nullable Map<String, String> map, @Nullable String str4) {
        if (str2 != null && !f6303e.contains(str2)) {
            C5426l3.m8134d(String.format("Unsupport http method %s. Drop the hit.", new Object[]{str2}));
            return false;
        } else if (C5549t3.m8514e().mo33532b() || this.f6304a.mo33157a()) {
            this.f6305b.mo33095b(str, str2, str3, map, str4);
            return true;
        } else {
            C5426l3.m8134d("Too many hits sent too quickly (rate throttled).");
            return false;
        }
    }

    private C5533s2(C5636z2 z2Var, C5565u3 u3Var) {
        this.f6305b = z2Var;
        this.f6304a = u3Var;
    }
}
