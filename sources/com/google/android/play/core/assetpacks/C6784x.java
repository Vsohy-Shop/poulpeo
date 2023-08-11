package com.google.android.play.core.assetpacks;

import android.content.Context;
import android.os.Binder;
import android.os.Bundle;
import java.util.Arrays;
import p037b6.C2900e;
import p037b6.C2921o0;
import p037b6.C2926r;
import p037b6.C2927r0;

/* renamed from: com.google.android.play.core.assetpacks.x */
final class C6784x extends C2921o0 {

    /* renamed from: a */
    private final C2900e f8896a = new C2900e("AssetPackExtractionService");

    /* renamed from: b */
    private final Context f8897b;

    /* renamed from: c */
    private final AssetPackExtractionService f8898c;

    /* renamed from: d */
    private final C6792z f8899d;

    C6784x(Context context, AssetPackExtractionService assetPackExtractionService, C6792z zVar) {
        this.f8897b = context;
        this.f8898c = assetPackExtractionService;
        this.f8899d = zVar;
    }

    /* renamed from: V1 */
    public final void mo28463V1(Bundle bundle, C2927r0 r0Var) {
        String[] packagesForUid;
        this.f8896a.mo28421c("updateServiceState AIDL call", new Object[0]);
        if (!C2926r.m2396a(this.f8897b) || (packagesForUid = this.f8897b.getPackageManager().getPackagesForUid(Binder.getCallingUid())) == null || !Arrays.asList(packagesForUid).contains("com.android.vending")) {
            r0Var.mo28465b(new Bundle());
            this.f8898c.mo39249b();
            return;
        }
        r0Var.mo28466p(this.f8898c.mo39248a(bundle), new Bundle());
    }

    /* renamed from: W1 */
    public final void mo28464W1(C2927r0 r0Var) {
        this.f8899d.mo39402z();
        r0Var.mo28467v(new Bundle());
    }
}
