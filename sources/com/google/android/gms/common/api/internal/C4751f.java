package com.google.android.gms.common.api.internal;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.api.C4719a;
import com.google.android.gms.common.api.C4719a.C4721b;
import com.google.android.gms.common.api.internal.C4746d;
import p180o4.C8974c;
import p276x5.C10406g;

/* renamed from: com.google.android.gms.common.api.internal.f */
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
public abstract class C4751f<A extends C4719a.C4721b, L> {

    /* renamed from: a */
    private final C4746d<L> f4974a;
    @Nullable

    /* renamed from: b */
    private final C8974c[] f4975b;

    /* renamed from: c */
    private final boolean f4976c;

    /* renamed from: d */
    private final int f4977d;

    protected C4751f(@NonNull C4746d<L> dVar, @Nullable C8974c[] cVarArr, boolean z, int i) {
        this.f4974a = dVar;
        this.f4975b = cVarArr;
        this.f4976c = z;
        this.f4977d = i;
    }

    /* renamed from: a */
    public void mo32500a() {
        this.f4974a.mo32495a();
    }

    @Nullable
    /* renamed from: b */
    public C4746d.C4747a<L> mo32501b() {
        return this.f4974a.mo32496b();
    }

    @Nullable
    /* renamed from: c */
    public C8974c[] mo32502c() {
        return this.f4975b;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public abstract void mo32503d(@NonNull A a, @NonNull C10406g<Void> gVar);

    /* renamed from: e */
    public final int mo32504e() {
        return this.f4977d;
    }

    /* renamed from: f */
    public final boolean mo32505f() {
        return this.f4976c;
    }
}
