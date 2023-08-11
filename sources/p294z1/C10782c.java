package p294z1;

import androidx.annotation.NonNull;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: z1.c */
/* compiled from: ContentLengthInputStream */
public final class C10782c extends FilterInputStream {

    /* renamed from: b */
    private final long f16493b;

    /* renamed from: c */
    private int f16494c;

    private C10782c(@NonNull InputStream inputStream, long j) {
        super(inputStream);
        this.f16493b = j;
    }

    /* renamed from: a */
    private int m22923a(int i) {
        if (i >= 0) {
            this.f16494c += i;
        } else if (this.f16493b - ((long) this.f16494c) > 0) {
            throw new IOException("Failed to read all expected data, expected: " + this.f16493b + ", but read: " + this.f16494c);
        }
        return i;
    }

    @NonNull
    /* renamed from: b */
    public static InputStream m22924b(@NonNull InputStream inputStream, long j) {
        return new C10782c(inputStream, j);
    }

    public synchronized int available() {
        return (int) Math.max(this.f16493b - ((long) this.f16494c), (long) this.in.available());
    }

    public synchronized int read() {
        int read;
        read = super.read();
        m22923a(read >= 0 ? 1 : -1);
        return read;
    }

    public int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    public synchronized int read(byte[] bArr, int i, int i2) {
        return m22923a(super.read(bArr, i, i2));
    }
}
