package p286y4;

import androidx.annotation.NonNull;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

@Deprecated
/* renamed from: y4.l */
/* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
public final class C10678l {
    /* renamed from: a */
    public static void m22693a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    @Deprecated
    /* renamed from: b */
    public static long m22694b(@NonNull InputStream inputStream, @NonNull OutputStream outputStream) {
        return m22695c(inputStream, outputStream, false, 1024);
    }

    @Deprecated
    /* renamed from: c */
    public static long m22695c(@NonNull InputStream inputStream, @NonNull OutputStream outputStream, boolean z, int i) {
        byte[] bArr = new byte[i];
        long j = 0;
        while (true) {
            try {
                int read = inputStream.read(bArr, 0, i);
                if (read == -1) {
                    break;
                }
                j += (long) read;
                outputStream.write(bArr, 0, read);
            } catch (Throwable th) {
                if (z) {
                    m22693a(inputStream);
                    m22693a(outputStream);
                }
                throw th;
            }
        }
        if (z) {
            m22693a(inputStream);
            m22693a(outputStream);
        }
        return j;
    }
}
