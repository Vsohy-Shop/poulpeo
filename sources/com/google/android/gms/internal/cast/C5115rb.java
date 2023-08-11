package com.google.android.gms.internal.cast;

import androidx.annotation.MainThread;
import androidx.annotation.Nullable;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import p150l4.C8675b;
import p286y4.C10671e;
import p286y4.C10674h;

@MainThread
/* renamed from: com.google.android.gms.internal.cast.rb */
/* compiled from: com.google.android.gms:play-services-cast-framework@@21.2.0 */
public final class C5115rb {

    /* renamed from: m */
    private static final C8675b f5498m = new C8675b("DialogDiscovery");

    /* renamed from: n */
    private static final String f5499n = "21.2.0";
    @Nullable

    /* renamed from: o */
    private static C5115rb f5500o;

    /* renamed from: a */
    private final C4952i1 f5501a;

    /* renamed from: b */
    private final String f5502b;

    /* renamed from: c */
    private final C5096q9 f5503c;

    /* renamed from: d */
    private final Map f5504d = Collections.synchronizedMap(new HashMap());

    /* renamed from: e */
    private final C10671e f5505e;

    /* renamed from: f */
    private long f5506f = 1;

    /* renamed from: g */
    private long f5507g = 1;

    /* renamed from: h */
    private long f5508h = -1;

    /* renamed from: i */
    private int f5509i = -1;

    /* renamed from: j */
    private int f5510j = 0;

    /* renamed from: k */
    private int f5511k = 0;

    /* renamed from: l */
    private int f5512l = 1;

    private C5115rb(C4952i1 i1Var, String str) {
        this.f5501a = i1Var;
        this.f5502b = str;
        this.f5503c = new C5096q9(this);
        this.f5505e = C10674h.m22680c();
    }

    /* renamed from: a */
    public static void m7432a(C4952i1 i1Var, String str) {
        if (f5500o == null) {
            f5500o = new C5115rb(i1Var, str);
        }
    }
}
