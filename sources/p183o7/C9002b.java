package p183o7;

import androidx.annotation.NonNull;
import java.io.OutputStream;

/* renamed from: o7.b */
/* compiled from: LengthCountingOutputStream */
final class C9002b extends OutputStream {

    /* renamed from: b */
    private long f13100b = 0;

    C9002b() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public long mo43183a() {
        return this.f13100b;
    }

    public void write(int i) {
        this.f13100b++;
    }

    public void write(byte[] bArr) {
        this.f13100b += (long) bArr.length;
    }

    public void write(@NonNull byte[] bArr, int i, int i2) {
        int i3;
        if (i < 0 || i > bArr.length || i2 < 0 || (i3 = i + i2) > bArr.length || i3 < 0) {
            throw new IndexOutOfBoundsException();
        }
        this.f13100b += (long) i2;
    }
}
