package p151l5;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.firebase.encoders.EncodingException;
import p153l7.C8746b;
import p153l7.C8752f;

/* renamed from: l5.y */
/* compiled from: com.google.firebase:firebase-messaging@@23.0.0 */
final class C8742y implements C8752f {

    /* renamed from: a */
    private boolean f12589a = false;

    /* renamed from: b */
    private boolean f12590b = false;

    /* renamed from: c */
    private C8746b f12591c;

    /* renamed from: d */
    private final C8738u f12592d;

    C8742y(C8738u uVar) {
        this.f12592d = uVar;
    }

    /* renamed from: b */
    private final void m17685b() {
        if (!this.f12589a) {
            this.f12589a = true;
            return;
        }
        throw new EncodingException("Cannot encode a second value in the ValueEncoderContext");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo42881a(C8746b bVar, boolean z) {
        this.f12589a = false;
        this.f12591c = bVar;
        this.f12590b = z;
    }

    @NonNull
    /* renamed from: d */
    public final C8752f mo42882d(@Nullable String str) {
        m17685b();
        this.f12592d.mo42874g(this.f12591c, str, this.f12590b);
        return this;
    }

    @NonNull
    /* renamed from: e */
    public final C8752f mo42883e(boolean z) {
        m17685b();
        this.f12592d.mo42875h(this.f12591c, z ? 1 : 0, this.f12590b);
        return this;
    }
}
