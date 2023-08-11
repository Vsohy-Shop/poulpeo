package com.google.android.gms.measurement.internal;

import androidx.collection.LruCache;
import com.google.android.gms.internal.measurement.C5683c1;
import p231t4.C9713p;

/* renamed from: com.google.android.gms.measurement.internal.g4 */
/* compiled from: com.google.android.gms:play-services-measurement@@20.0.0 */
final class C6152g4 extends LruCache<String, C5683c1> {

    /* renamed from: a */
    final /* synthetic */ C6185j4 f7792a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C6152g4(C6185j4 j4Var, int i) {
        super(20);
        this.f7792a = j4Var;
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ Object create(Object obj) {
        String str = (String) obj;
        C9713p.m20271f(str);
        return C6185j4.m10821n(this.f7792a, str);
    }
}
