package p139k3;

import androidx.annotation.NonNull;
import java.util.Arrays;
import p119i3.C8109b;

/* renamed from: k3.h */
/* compiled from: EncodedPayload */
public final class C8538h {

    /* renamed from: a */
    private final C8109b f12200a;

    /* renamed from: b */
    private final byte[] f12201b;

    public C8538h(@NonNull C8109b bVar, @NonNull byte[] bArr) {
        if (bVar == null) {
            throw new NullPointerException("encoding is null");
        } else if (bArr != null) {
            this.f12200a = bVar;
            this.f12201b = bArr;
        } else {
            throw new NullPointerException("bytes is null");
        }
    }

    /* renamed from: a */
    public byte[] mo42594a() {
        return this.f12201b;
    }

    /* renamed from: b */
    public C8109b mo42595b() {
        return this.f12200a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C8538h)) {
            return false;
        }
        C8538h hVar = (C8538h) obj;
        if (!this.f12200a.equals(hVar.f12200a)) {
            return false;
        }
        return Arrays.equals(this.f12201b, hVar.f12201b);
    }

    public int hashCode() {
        return ((this.f12200a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f12201b);
    }

    public String toString() {
        return "EncodedPayload{encoding=" + this.f12200a + ", bytes=[...]}";
    }
}
