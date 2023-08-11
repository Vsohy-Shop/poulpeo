package p458xd;

import java.io.InputStream;
import java.io.OutputStream;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;

/* renamed from: xd.i */
/* compiled from: Codec */
public interface C13799i extends C13809k, C13823q {

    /* renamed from: xd.i$a */
    /* compiled from: Codec */
    public static final class C13800a implements C13799i {
        /* renamed from: a */
        public String mo53452a() {
            return "gzip";
        }

        /* renamed from: b */
        public InputStream mo53453b(InputStream inputStream) {
            return new GZIPInputStream(inputStream);
        }

        /* renamed from: c */
        public OutputStream mo53454c(OutputStream outputStream) {
            return new GZIPOutputStream(outputStream);
        }
    }

    /* renamed from: xd.i$b */
    /* compiled from: Codec */
    public static final class C13801b implements C13799i {

        /* renamed from: a */
        public static final C13799i f22244a = new C13801b();

        private C13801b() {
        }

        /* renamed from: a */
        public String mo53452a() {
            return "identity";
        }

        /* renamed from: b */
        public InputStream mo53453b(InputStream inputStream) {
            return inputStream;
        }

        /* renamed from: c */
        public OutputStream mo53454c(OutputStream outputStream) {
            return outputStream;
        }
    }
}
