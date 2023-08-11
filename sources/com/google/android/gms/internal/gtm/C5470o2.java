package com.google.android.gms.internal.gtm;

import android.content.Context;
import androidx.annotation.Nullable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;
import p231t4.C9713p;
import p254v5.C9942c;
import p254v5.C9951l;
import p286y4.C10674h;

/* renamed from: com.google.android.gms.internal.gtm.o2 */
public final class C5470o2 {

    /* renamed from: a */
    private final Context f6174a;

    /* renamed from: b */
    private final C5328eb f6175b;

    /* renamed from: c */
    private final ExecutorService f6176c;

    /* renamed from: d */
    private final ScheduledExecutorService f6177d;

    /* renamed from: e */
    private final C9951l f6178e;

    /* renamed from: f */
    private final C9942c f6179f;

    public C5470o2(Context context, C9951l lVar, C9942c cVar) {
        this(context, lVar, cVar, new C5328eb(context), C5337f5.m7930a(context), C5368h5.f6028a);
    }

    /* renamed from: a */
    public final C5349g2 mo33419a(String str, @Nullable String str2, @Nullable String str3) {
        C5261a4 a4Var = new C5261a4(this.f6174a, this.f6178e, this.f6179f, str);
        C5488p2 p2Var = new C5488p2(this.f6174a, str);
        return new C5349g2(this.f6174a, str, str2, str3, a4Var, this.f6175b, this.f6176c, this.f6177d, this.f6178e, C10674h.m22680c(), p2Var);
    }

    private C5470o2(Context context, C9951l lVar, C9942c cVar, C5328eb ebVar, ExecutorService executorService, ScheduledExecutorService scheduledExecutorService) {
        this.f6174a = ((Context) C9713p.m20275j(context)).getApplicationContext();
        this.f6178e = (C9951l) C9713p.m20275j(lVar);
        this.f6179f = (C9942c) C9713p.m20275j(cVar);
        this.f6175b = (C5328eb) C9713p.m20275j(ebVar);
        this.f6176c = (ExecutorService) C9713p.m20275j(executorService);
        this.f6177d = (ScheduledExecutorService) C9713p.m20275j(scheduledExecutorService);
    }
}
