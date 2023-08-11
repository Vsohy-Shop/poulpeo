package p042bo.app;

import com.adjust.sdk.Constants;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;

/* renamed from: bo.app.v6 */
final class C3757v6 {

    /* renamed from: a */
    static final Charset f2716a = Charset.forName("US-ASCII");

    /* renamed from: b */
    static final Charset f2717b = Charset.forName(Constants.ENCODING);

    /* renamed from: a */
    static void m4027a(File file) {
        File[] listFiles = file.listFiles();
        if (listFiles != null) {
            int length = listFiles.length;
            int i = 0;
            while (i < length) {
                File file2 = listFiles[i];
                if (file2.isDirectory()) {
                    m4027a(file2);
                }
                if (file2.delete()) {
                    i++;
                } else {
                    throw new IOException("failed to delete file: " + file2);
                }
            }
            return;
        }
        throw new IOException("not a readable directory: " + file);
    }

    /* renamed from: a */
    static void m4026a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (RuntimeException e) {
                throw e;
            } catch (Exception unused) {
            }
        }
    }
}
