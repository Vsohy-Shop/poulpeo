package com.google.android.play.core.assetpacks;

import android.content.ComponentName;
import android.content.Context;
import com.google.android.play.core.common.PlayCoreDialogWrapperActivity;
import p037b6.C2901e0;
import p037b6.C2924q;

/* renamed from: com.google.android.play.core.assetpacks.w2 */
public final class C6783w2 implements C2901e0<Object> {

    /* renamed from: a */
    private final C2901e0<C6767s2> f8894a;

    /* renamed from: b */
    private final C2901e0<Context> f8895b;

    public C6783w2(C2901e0<C6767s2> e0Var, C2901e0<Context> e0Var2) {
        this.f8894a = e0Var;
        this.f8895b = e0Var2;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo23536a() {
        C6767s2 a = this.f8894a.mo23536a();
        Context b = ((C6791y2) this.f8895b).mo23536a();
        C6767s2 s2Var = a;
        C2924q.m2386a(b.getPackageManager(), new ComponentName(b.getPackageName(), "com.google.android.play.core.assetpacks.AssetPackExtractionService"), 4);
        PlayCoreDialogWrapperActivity.m11605a(b);
        C2924q.m2392g(s2Var);
        return s2Var;
    }
}
