package com.google.android.gms.cast.framework.media;

import androidx.annotation.Nullable;
import java.util.concurrent.atomic.AtomicLong;
import okhttp3.internal.p406ws.WebSocketProtocol;
import p109h4.C7930f1;
import p150l4.C8673a;
import p150l4.C8711t;

/* renamed from: com.google.android.gms.cast.framework.media.w */
/* compiled from: com.google.android.gms:play-services-cast-framework@@21.2.0 */
final class C4683w implements C8711t {
    @Nullable

    /* renamed from: a */
    private C7930f1 f4778a;

    /* renamed from: b */
    private final AtomicLong f4779b = new AtomicLong((C8673a.m17449h() & WebSocketProtocol.PAYLOAD_SHORT_MAX) * 10000);

    /* renamed from: c */
    final /* synthetic */ C4648h f4780c;

    public C4683w(C4648h hVar) {
        this.f4780c = hVar;
    }

    /* renamed from: a */
    public final void mo32224a(String str, String str2, long j, @Nullable String str3) {
        C7930f1 f1Var = this.f4778a;
        if (f1Var != null) {
            f1Var.mo41702b(str, str2).mo35454e(new C4681v(this, j));
            return;
        }
        throw new IllegalStateException("Device is not connected");
    }

    /* renamed from: b */
    public final void mo32225b(@Nullable C7930f1 f1Var) {
        this.f4778a = f1Var;
    }

    public final long zza() {
        return this.f4779b.getAndIncrement();
    }
}
