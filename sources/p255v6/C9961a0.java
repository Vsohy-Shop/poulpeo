package p255v6;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.zip.GZIPOutputStream;

/* renamed from: v6.a0 */
/* compiled from: NativeSessionFileGzipper */
class C9961a0 {
    /* renamed from: a */
    private static void m20784a(@Nullable InputStream inputStream, @NonNull File file) {
        if (inputStream != null) {
            byte[] bArr = new byte[8192];
            GZIPOutputStream gZIPOutputStream = null;
            try {
                GZIPOutputStream gZIPOutputStream2 = new GZIPOutputStream(new FileOutputStream(file));
                while (true) {
                    try {
                        int read = inputStream.read(bArr);
                        if (read > 0) {
                            gZIPOutputStream2.write(bArr, 0, read);
                        } else {
                            gZIPOutputStream2.finish();
                            C9972g.m20816f(gZIPOutputStream2);
                            return;
                        }
                    } catch (Throwable th) {
                        th = th;
                        gZIPOutputStream = gZIPOutputStream2;
                        C9972g.m20816f(gZIPOutputStream);
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                C9972g.m20816f(gZIPOutputStream);
                throw th;
            }
        }
    }

    /* renamed from: b */
    static void m20785b(File file, List<C10029z> list) {
        for (C10029z next : list) {
            InputStream inputStream = null;
            try {
                inputStream = next.mo44521b();
                if (inputStream != null) {
                    m20784a(inputStream, new File(file, next.mo44520a()));
                }
            } catch (IOException unused) {
            } catch (Throwable th) {
                C9972g.m20816f(inputStream);
                throw th;
            }
            C9972g.m20816f(inputStream);
        }
    }
}
