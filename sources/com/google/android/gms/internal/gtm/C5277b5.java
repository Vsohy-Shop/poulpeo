package com.google.android.gms.internal.gtm;

import android.content.Context;
import android.os.Bundle;
import androidx.annotation.Nullable;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import p231t4.C9713p;
import p254v5.C9942c;
import p254v5.C9951l;

/* renamed from: com.google.android.gms.internal.gtm.b5 */
public final class C5277b5 extends C5381i3 {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final Map<String, C5349g2> f5873a;

    /* renamed from: b */
    private final ExecutorService f5874b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final C5470o2 f5875c;

    /* renamed from: d */
    private final C9951l f5876d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final Context f5877e;

    public C5277b5(Context context, C9951l lVar, C9942c cVar) {
        this(context, lVar, new C5470o2(context, lVar, cVar), C5337f5.m7930a(context));
    }

    /* renamed from: H2 */
    public final void mo33127H2(String str, Bundle bundle, String str2, long j, boolean z) {
        this.f5874b.execute(new C5307d5(this, new C5564u2(str, bundle, str2, new Date(j), z, this.f5876d)));
    }

    /* renamed from: O */
    public final void mo33128O() {
        this.f5873a.clear();
    }

    /* renamed from: R2 */
    public final void mo33129R2(String str, @Nullable String str2, @Nullable String str3, @Nullable C5320e3 e3Var) {
        this.f5874b.execute(new C5292c5(this, str, str2, str3, e3Var));
    }

    /* renamed from: Z1 */
    public final void mo33130Z1(String str, @Nullable String str2, @Nullable String str3) {
        mo33129R2(str, str2, str3, (C5320e3) null);
    }

    /* renamed from: k */
    public final void mo33131k() {
        this.f5874b.execute(new C5322e5(this));
    }

    private C5277b5(Context context, C9951l lVar, C5470o2 o2Var, ExecutorService executorService) {
        this.f5873a = new HashMap(1);
        C9713p.m20275j(lVar);
        this.f5876d = lVar;
        this.f5875c = o2Var;
        this.f5874b = executorService;
        this.f5877e = context;
    }
}
