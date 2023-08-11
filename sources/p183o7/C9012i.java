package p183o7;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.firebase.encoders.EncodingException;
import p153l7.C8746b;
import p153l7.C8752f;

/* renamed from: o7.i */
/* compiled from: ProtobufValueEncoderContext */
class C9012i implements C8752f {

    /* renamed from: a */
    private boolean f13122a = false;

    /* renamed from: b */
    private boolean f13123b = false;

    /* renamed from: c */
    private C8746b f13124c;

    /* renamed from: d */
    private final C9007f f13125d;

    C9012i(C9007f fVar) {
        this.f13125d = fVar;
    }

    /* renamed from: a */
    private void m18290a() {
        if (!this.f13122a) {
            this.f13122a = true;
            return;
        }
        throw new EncodingException("Cannot encode a second value in the ValueEncoderContext");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo43202b(C8746b bVar, boolean z) {
        this.f13122a = false;
        this.f13124c = bVar;
        this.f13123b = z;
    }

    @NonNull
    /* renamed from: d */
    public C8752f mo42882d(@Nullable String str) {
        m18290a();
        this.f13125d.mo43189h(this.f13124c, str, this.f13123b);
        return this;
    }

    @NonNull
    /* renamed from: e */
    public C8752f mo42883e(boolean z) {
        m18290a();
        this.f13125d.mo43195n(this.f13124c, z, this.f13123b);
        return this;
    }
}
