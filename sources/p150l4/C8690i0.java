package p150l4;

import androidx.annotation.Nullable;

/* renamed from: l4.i0 */
/* compiled from: com.google.android.gms:play-services-cast@@21.2.0 */
public class C8690i0 {

    /* renamed from: a */
    protected final C8675b f12428a = new C8675b("MediaControlChannel", (String) null);

    /* renamed from: b */
    private final String f12429b;
    @Nullable

    /* renamed from: c */
    private C8711t f12430c;

    protected C8690i0(String str, String str2, @Nullable String str3) {
        C8673a.m17447f(str);
        this.f12429b = str;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final long mo42795a() {
        C8711t tVar = this.f12430c;
        if (tVar != null) {
            return tVar.zza();
        }
        this.f12428a.mo42756c("Attempt to generate requestId without a sink", new Object[0]);
        return 0;
    }

    /* renamed from: b */
    public final String mo42796b() {
        return this.f12429b;
    }

    /* renamed from: c */
    public void mo42797c() {
        throw null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final void mo42798d(String str, long j, @Nullable String str2) {
        C8711t tVar = this.f12430c;
        if (tVar == null) {
            this.f12428a.mo42756c("Attempt to send text message without a sink", new Object[0]);
        } else {
            tVar.mo32224a(this.f12429b, str, j, (String) null);
        }
    }

    /* renamed from: e */
    public final void mo42799e(@Nullable C8711t tVar) {
        this.f12430c = tVar;
        if (tVar == null) {
            mo42797c();
        }
    }
}
