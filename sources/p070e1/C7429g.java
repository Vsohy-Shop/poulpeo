package p070e1;

import androidx.annotation.NonNull;
import java.io.FilterInputStream;
import java.io.InputStream;

/* renamed from: e1.g */
/* compiled from: ExifOrientationStream */
public final class C7429g extends FilterInputStream {

    /* renamed from: d */
    private static final byte[] f10270d;

    /* renamed from: e */
    private static final int f10271e;

    /* renamed from: f */
    private static final int f10272f;

    /* renamed from: b */
    private final byte f10273b;

    /* renamed from: c */
    private int f10274c;

    static {
        byte[] bArr = {-1, -31, 0, 28, 69, 120, 105, 102, 0, 0, 77, 77, 0, 0, 0, 0, 0, 8, 0, 1, 1, 18, 0, 2, 0, 0, 0, 1, 0};
        f10270d = bArr;
        int length = bArr.length;
        f10271e = length;
        f10272f = length + 2;
    }

    public C7429g(InputStream inputStream, int i) {
        super(inputStream);
        if (i < -1 || i > 8) {
            throw new IllegalArgumentException("Cannot add invalid orientation: " + i);
        }
        this.f10273b = (byte) i;
    }

    public void mark(int i) {
        throw new UnsupportedOperationException();
    }

    public boolean markSupported() {
        return false;
    }

    public int read() {
        int i;
        int i2;
        int i3 = this.f10274c;
        if (i3 < 2 || i3 > (i2 = f10272f)) {
            i = super.read();
        } else if (i3 == i2) {
            i = this.f10273b;
        } else {
            i = f10270d[i3 - 2] & 255;
        }
        if (i != -1) {
            this.f10274c++;
        }
        return i;
    }

    public void reset() {
        throw new UnsupportedOperationException();
    }

    public long skip(long j) {
        long skip = super.skip(j);
        if (skip > 0) {
            this.f10274c = (int) (((long) this.f10274c) + skip);
        }
        return skip;
    }

    public int read(@NonNull byte[] bArr, int i, int i2) {
        int i3;
        int i4 = this.f10274c;
        int i5 = f10272f;
        if (i4 > i5) {
            i3 = super.read(bArr, i, i2);
        } else if (i4 == i5) {
            bArr[i] = this.f10273b;
            i3 = 1;
        } else if (i4 < 2) {
            i3 = super.read(bArr, i, 2 - i4);
        } else {
            int min = Math.min(i5 - i4, i2);
            System.arraycopy(f10270d, this.f10274c - 2, bArr, i, min);
            i3 = min;
        }
        if (i3 > 0) {
            this.f10274c += i3;
        }
        return i3;
    }
}
