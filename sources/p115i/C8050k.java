package p115i;

import androidx.constraintlayout.core.widgets.analyzer.BasicMeasure;
import java.io.InputStream;

/* renamed from: i.k */
/* compiled from: ExifUtils.kt */
final class C8050k extends InputStream {

    /* renamed from: b */
    private final InputStream f11294b;

    /* renamed from: c */
    private int f11295c = BasicMeasure.EXACTLY;

    public C8050k(InputStream inputStream) {
        this.f11294b = inputStream;
    }

    /* renamed from: a */
    private final int m15824a(int i) {
        if (i == -1) {
            this.f11295c = 0;
        }
        return i;
    }

    public int available() {
        return this.f11295c;
    }

    public void close() {
        this.f11294b.close();
    }

    public int read() {
        return m15824a(this.f11294b.read());
    }

    public long skip(long j) {
        return this.f11294b.skip(j);
    }

    public int read(byte[] bArr) {
        return m15824a(this.f11294b.read(bArr));
    }

    public int read(byte[] bArr, int i, int i2) {
        return m15824a(this.f11294b.read(bArr, i, i2));
    }
}
