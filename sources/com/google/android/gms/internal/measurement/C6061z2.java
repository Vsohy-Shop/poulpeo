package com.google.android.gms.internal.measurement;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.BadParcelableException;
import android.os.Bundle;
import android.os.NetworkOnMainThreadException;
import android.os.RemoteException;
import android.util.Log;
import android.util.Pair;
import androidx.annotation.GuardedBy;
import androidx.annotation.NonNull;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.ExecutorService;
import p191p5.C9061a;
import p201q5.C9264k;
import p201q5.C9270q;
import p201q5.C9271r;
import p201q5.C9274u;
import p231t4.C9713p;
import p286y4.C10671e;
import p286y4.C10674h;

/* renamed from: com.google.android.gms.internal.measurement.z2 */
/* compiled from: com.google.android.gms:play-services-measurement-sdk-api@@20.0.0 */
public final class C6061z2 {

    /* renamed from: j */
    private static volatile C6061z2 f7504j;
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final String f7505a;

    /* renamed from: b */
    protected final C10671e f7506b;

    /* renamed from: c */
    protected final ExecutorService f7507c;

    /* renamed from: d */
    private final C9061a f7508d;
    @GuardedBy("listenerList")

    /* renamed from: e */
    private final List<Pair<C9271r, C5901p2>> f7509e;

    /* renamed from: f */
    private int f7510f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public boolean f7511g;

    /* renamed from: h */
    private final String f7512h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public volatile C5734f1 f7513i;

    protected C6061z2(Context context, String str, String str2, String str3, Bundle bundle) {
        boolean z;
        if (str == null || !m10344p(str2, str3)) {
            this.f7505a = "FA";
        } else {
            this.f7505a = str;
        }
        this.f7506b = C10674h.m22680c();
        boolean z2 = true;
        this.f7507c = C6059z0.m10332a().mo34564a(new C5752g2(this), 1);
        this.f7508d = new C9061a(this);
        this.f7509e = new ArrayList();
        try {
            if (C9274u.m19050c(context, "google_app_id", C9264k.m19025a(context)) != null && !m10340l()) {
                this.f7512h = null;
                this.f7511g = true;
                Log.w(this.f7505a, "Disabling data collection. Found google_app_id in strings.xml but Google Analytics for Firebase is missing. Remove this value or add Google Analytics for Firebase to resume data collection.");
                return;
            }
        } catch (IllegalStateException unused) {
        }
        if (!m10344p(str2, str3)) {
            this.f7512h = "fa";
            if (str2 == null || str3 == null) {
                if (str2 == null) {
                    z = true;
                } else {
                    z = false;
                }
                if (z ^ (str3 != null ? false : z2)) {
                    Log.w(this.f7505a, "Specified origin or custom app id is null. Both parameters will be ignored.");
                }
            } else {
                Log.v(this.f7505a, "Deferring to Google Analytics for Firebase for event data collection. https://goo.gl/J1sWQy");
            }
        } else {
            this.f7512h = str2;
        }
        m10343o(new C6012w1(this, str2, str3, context, bundle));
        Application application = (Application) context.getApplicationContext();
        if (application == null) {
            Log.w(this.f7505a, "Unable to register lifecycle notifications. Application null.");
        } else {
            application.registerActivityLifecycleCallbacks(new C6045y2(this));
        }
    }

    /* renamed from: l */
    protected static final boolean m10340l() {
        return true;
    }

    /* access modifiers changed from: private */
    /* renamed from: m */
    public final void m10341m(Exception exc, boolean z, boolean z2) {
        this.f7511g |= z;
        if (z) {
            Log.w(this.f7505a, "Data collection startup failed. No data will be collected.", exc);
            return;
        }
        if (z2) {
            mo34659a(5, "Error with data collection. Data lost.", exc, (Object) null, (Object) null);
        }
        Log.w(this.f7505a, "Error with data collection. Data lost.", exc);
    }

    /* renamed from: n */
    private final void m10342n(String str, String str2, Bundle bundle, boolean z, boolean z2, Long l) {
        m10343o(new C5837l2(this, l, str, str2, bundle, z, z2));
    }

    /* access modifiers changed from: private */
    /* renamed from: o */
    public final void m10343o(C5869n2 n2Var) {
        this.f7507c.execute(n2Var);
    }

    /* access modifiers changed from: private */
    /* renamed from: p */
    public static final boolean m10344p(String str, String str2) {
        if (str2 == null || str == null || m10340l()) {
            return false;
        }
        return true;
    }

    /* renamed from: v */
    public static C6061z2 m10346v(Context context, String str, String str2, String str3, Bundle bundle) {
        C9713p.m20275j(context);
        if (f7504j == null) {
            synchronized (C6061z2.class) {
                if (f7504j == null) {
                    f7504j = new C6061z2(context, str, str2, str3, bundle);
                }
            }
        }
        return f7504j;
    }

    /* renamed from: A */
    public final String mo34650A() {
        C5666b1 b1Var = new C5666b1();
        m10343o(new C6060z1(this, b1Var));
        return b1Var.mo33690J(500);
    }

    /* renamed from: B */
    public final List<Bundle> mo34651B(String str, String str2) {
        C5666b1 b1Var = new C5666b1();
        m10343o(new C5948s1(this, str, str2, b1Var));
        List<Bundle> list = (List) C5666b1.m8783b3(b1Var.mo33689G(5000), List.class);
        if (list == null) {
            return Collections.emptyList();
        }
        return list;
    }

    /* renamed from: C */
    public final Map<String, Object> mo34652C(String str, String str2, boolean z) {
        C5666b1 b1Var = new C5666b1();
        m10343o(new C5718e2(this, str, str2, z, b1Var));
        Bundle G = b1Var.mo33689G(5000);
        if (G == null || G.size() == 0) {
            return Collections.emptyMap();
        }
        HashMap hashMap = new HashMap(G.size());
        for (String next : G.keySet()) {
            Object obj = G.get(next);
            if ((obj instanceof Double) || (obj instanceof Long) || (obj instanceof String)) {
                hashMap.put(next, obj);
            }
        }
        return hashMap;
    }

    /* renamed from: G */
    public final void mo34653G(String str) {
        m10343o(new C6028x1(this, str));
    }

    /* renamed from: H */
    public final void mo34654H(String str, String str2, Bundle bundle) {
        m10343o(new C5932r1(this, str, str2, bundle));
    }

    /* renamed from: I */
    public final void mo34655I(String str) {
        m10343o(new C6044y1(this, str));
    }

    /* renamed from: J */
    public final void mo34656J(@NonNull String str, Bundle bundle) {
        m10342n((String) null, str, bundle, false, true, (Long) null);
    }

    /* renamed from: K */
    public final void mo34657K(String str, String str2, Bundle bundle) {
        m10342n(str, str2, bundle, true, true, (Long) null);
    }

    /* renamed from: L */
    public final void mo34658L(String str, String str2, Bundle bundle, long j) {
        m10342n(str, str2, bundle, true, false, Long.valueOf(j));
    }

    /* renamed from: a */
    public final void mo34659a(int i, String str, Object obj, Object obj2, Object obj3) {
        m10343o(new C5735f2(this, false, 5, str, obj, (Object) null, (Object) null));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x003d, code lost:
        if (r4.f7513i == null) goto L_0x004c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:?, code lost:
        r4.f7513i.registerOnMeasurementEventListener(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0044, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0045, code lost:
        android.util.Log.w(r4.f7505a, "Failed to register event listener on calling thread. Trying again on the dynamite thread.");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x004c, code lost:
        m10343o(new com.google.android.gms.internal.measurement.C5820k2(r4, r1));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0054, code lost:
        return;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo34660b(p201q5.C9271r r5) {
        /*
            r4 = this;
            p231t4.C9713p.m20275j(r5)
            java.util.List<android.util.Pair<q5.r, com.google.android.gms.internal.measurement.p2>> r0 = r4.f7509e
            monitor-enter(r0)
            r1 = 0
        L_0x0007:
            java.util.List<android.util.Pair<q5.r, com.google.android.gms.internal.measurement.p2>> r2 = r4.f7509e     // Catch:{ all -> 0x0055 }
            int r2 = r2.size()     // Catch:{ all -> 0x0055 }
            if (r1 >= r2) goto L_0x002b
            java.util.List<android.util.Pair<q5.r, com.google.android.gms.internal.measurement.p2>> r2 = r4.f7509e     // Catch:{ all -> 0x0055 }
            java.lang.Object r2 = r2.get(r1)     // Catch:{ all -> 0x0055 }
            android.util.Pair r2 = (android.util.Pair) r2     // Catch:{ all -> 0x0055 }
            java.lang.Object r2 = r2.first     // Catch:{ all -> 0x0055 }
            boolean r2 = r5.equals(r2)     // Catch:{ all -> 0x0055 }
            if (r2 == 0) goto L_0x0028
            java.lang.String r5 = r4.f7505a     // Catch:{ all -> 0x0055 }
            java.lang.String r1 = "OnEventListener already registered."
            android.util.Log.w(r5, r1)     // Catch:{ all -> 0x0055 }
            monitor-exit(r0)     // Catch:{ all -> 0x0055 }
            return
        L_0x0028:
            int r1 = r1 + 1
            goto L_0x0007
        L_0x002b:
            com.google.android.gms.internal.measurement.p2 r1 = new com.google.android.gms.internal.measurement.p2     // Catch:{ all -> 0x0055 }
            r1.<init>(r5)     // Catch:{ all -> 0x0055 }
            java.util.List<android.util.Pair<q5.r, com.google.android.gms.internal.measurement.p2>> r2 = r4.f7509e     // Catch:{ all -> 0x0055 }
            android.util.Pair r3 = new android.util.Pair     // Catch:{ all -> 0x0055 }
            r3.<init>(r5, r1)     // Catch:{ all -> 0x0055 }
            r2.add(r3)     // Catch:{ all -> 0x0055 }
            monitor-exit(r0)     // Catch:{ all -> 0x0055 }
            com.google.android.gms.internal.measurement.f1 r5 = r4.f7513i
            if (r5 == 0) goto L_0x004c
            com.google.android.gms.internal.measurement.f1 r5 = r4.f7513i     // Catch:{ BadParcelableException | NetworkOnMainThreadException | RemoteException | IllegalArgumentException | IllegalStateException | NullPointerException | SecurityException | UnsupportedOperationException -> 0x0045 }
            r5.registerOnMeasurementEventListener(r1)     // Catch:{ BadParcelableException | NetworkOnMainThreadException | RemoteException | IllegalArgumentException | IllegalStateException | NullPointerException | SecurityException | UnsupportedOperationException -> 0x0045 }
            return
        L_0x0045:
            java.lang.String r5 = r4.f7505a
            java.lang.String r0 = "Failed to register event listener on calling thread. Trying again on the dynamite thread."
            android.util.Log.w(r5, r0)
        L_0x004c:
            com.google.android.gms.internal.measurement.k2 r5 = new com.google.android.gms.internal.measurement.k2
            r5.<init>(r4, r1)
            r4.m10343o(r5)
            return
        L_0x0055:
            r5 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0055 }
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.C6061z2.mo34660b(q5.r):void");
    }

    /* renamed from: c */
    public final void mo34661c(Bundle bundle) {
        m10343o(new C5916q1(this, bundle));
    }

    /* renamed from: d */
    public final void mo34662d(Activity activity, String str, String str2) {
        m10343o(new C5980u1(this, activity, str, str2));
    }

    /* renamed from: e */
    public final void mo34663e(boolean z) {
        m10343o(new C5786i2(this, z));
    }

    /* renamed from: f */
    public final void mo34664f(C9270q qVar) {
        C5885o2 o2Var = new C5885o2(qVar);
        if (this.f7513i != null) {
            try {
                this.f7513i.setEventInterceptor(o2Var);
                return;
            } catch (BadParcelableException | NetworkOnMainThreadException | RemoteException | IllegalArgumentException | IllegalStateException | NullPointerException | SecurityException | UnsupportedOperationException unused) {
                Log.w(this.f7505a, "Failed to set event interceptor on calling thread. Trying again on the dynamite thread.");
            }
        }
        m10343o(new C5803j2(this, o2Var));
    }

    /* renamed from: g */
    public final void mo34665g(Boolean bool) {
        m10343o(new C5996v1(this, bool));
    }

    /* renamed from: h */
    public final void mo34666h(String str) {
        m10343o(new C5964t1(this, str));
    }

    /* renamed from: i */
    public final void mo34667i(String str, String str2, Object obj, boolean z) {
        m10343o(new C5853m2(this, str, str2, obj, z));
    }

    /* renamed from: q */
    public final int mo34668q(String str) {
        C5666b1 b1Var = new C5666b1();
        m10343o(new C5769h2(this, str, b1Var));
        Integer num = (Integer) C5666b1.m8783b3(b1Var.mo33689G(10000), Integer.class);
        if (num == null) {
            return 25;
        }
        return num.intValue();
    }

    /* renamed from: r */
    public final long mo34669r() {
        C5666b1 b1Var = new C5666b1();
        m10343o(new C5667b2(this, b1Var));
        Long l = (Long) C5666b1.m8783b3(b1Var.mo33689G(500), Long.class);
        if (l != null) {
            return l.longValue();
        }
        long nextLong = new Random(System.nanoTime() ^ this.f7506b.mo33547a()).nextLong();
        int i = this.f7510f + 1;
        this.f7510f = i;
        return nextLong + ((long) i);
    }

    /* renamed from: s */
    public final C9061a mo34670s() {
        return this.f7508d;
    }

    /* access modifiers changed from: protected */
    /* renamed from: u */
    public final C5734f1 mo34671u(Context context, boolean z) {
        try {
            return C5717e1.asInterface(DynamiteModule.m6738e(context, DynamiteModule.f5074e, ModuleDescriptor.MODULE_ID).mo32582d("com.google.android.gms.measurement.internal.AppMeasurementDynamiteService"));
        } catch (DynamiteModule.LoadingException e) {
            m10341m(e, true, false);
            return null;
        }
    }

    /* renamed from: x */
    public final String mo34672x() {
        C5666b1 b1Var = new C5666b1();
        m10343o(new C5650a2(this, b1Var));
        return b1Var.mo33690J(50);
    }

    /* renamed from: y */
    public final String mo34673y() {
        C5666b1 b1Var = new C5666b1();
        m10343o(new C5701d2(this, b1Var));
        return b1Var.mo33690J(500);
    }

    /* renamed from: z */
    public final String mo34674z() {
        C5666b1 b1Var = new C5666b1();
        m10343o(new C5684c2(this, b1Var));
        return b1Var.mo33690J(500);
    }
}
