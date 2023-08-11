package p287y5;

import androidx.annotation.Nullable;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Enumeration;

/* renamed from: y5.b */
public final class C10688b extends InputStream {

    /* renamed from: b */
    private final Enumeration<File> f16273b;
    @Nullable

    /* renamed from: c */
    private InputStream f16274c;

    public C10688b(Enumeration<File> enumeration) {
        this.f16273b = enumeration;
        mo45612a();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo45612a() {
        FileInputStream fileInputStream;
        InputStream inputStream = this.f16274c;
        if (inputStream != null) {
            inputStream.close();
        }
        if (this.f16273b.hasMoreElements()) {
            fileInputStream = new FileInputStream(this.f16273b.nextElement());
        } else {
            fileInputStream = null;
        }
        this.f16274c = fileInputStream;
    }

    public final void close() {
        super.close();
        InputStream inputStream = this.f16274c;
        if (inputStream != null) {
            inputStream.close();
            this.f16274c = null;
        }
    }

    public final int read() {
        while (true) {
            InputStream inputStream = this.f16274c;
            if (inputStream == null) {
                return -1;
            }
            int read = inputStream.read();
            if (read != -1) {
                return read;
            }
            mo45612a();
        }
    }

    public final int read(byte[] bArr, int i, int i2) {
        if (this.f16274c == null) {
            return -1;
        }
        bArr.getClass();
        if (i < 0 || i2 < 0 || i2 > bArr.length - i) {
            throw new IndexOutOfBoundsException();
        } else if (i2 == 0) {
            return 0;
        } else {
            do {
                int read = this.f16274c.read(bArr, i, i2);
                if (read > 0) {
                    return read;
                }
                mo45612a();
            } while (this.f16274c != null);
            return -1;
        }
    }
}
