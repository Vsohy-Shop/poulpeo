package p151l5;

import androidx.annotation.NonNull;
import java.io.OutputStream;

/* renamed from: l5.p */
/* compiled from: com.google.firebase:firebase-messaging@@23.0.0 */
final class C8733p extends OutputStream {

    /* renamed from: b */
    private long f12565b = 0;

    C8733p() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final long mo42863a() {
        return this.f12565b;
    }

    public final void write(int i) {
        this.f12565b++;
    }

    public final void write(byte[] bArr) {
        this.f12565b += (long) bArr.length;
    }

    public final void write(@NonNull byte[] bArr, int i, int i2) {
        int length;
        int i3;
        if (i < 0 || i > (length = bArr.length) || i2 < 0 || (i3 = i + i2) > length || i3 < 0) {
            throw new IndexOutOfBoundsException();
        }
        this.f12565b += (long) i2;
    }
}
