package p167n1;

import androidx.annotation.NonNull;
import p094g1.C7744c;
import p294z1.C10791j;

/* renamed from: n1.b */
/* compiled from: BytesResource */
public class C8878b implements C7744c<byte[]> {

    /* renamed from: b */
    private final byte[] f12856b;

    public C8878b(byte[] bArr) {
        this.f12856b = (byte[]) C10791j.m22948d(bArr);
    }

    @NonNull
    /* renamed from: a */
    public Class<byte[]> mo31365a() {
        return byte[].class;
    }

    @NonNull
    /* renamed from: b */
    public byte[] get() {
        return this.f12856b;
    }

    public int getSize() {
        return this.f12856b.length;
    }

    public void recycle() {
    }
}
