package p137k1;

import androidx.annotation.NonNull;
import com.bumptech.glide.C4368f;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.nio.ByteBuffer;
import p058d1.C7214a;
import p058d1.C7222g;
import p070e1.C7422d;
import p137k1.C8476n;
import p283y1.C10652b;

/* renamed from: k1.b */
/* compiled from: ByteArrayLoader */
public class C8438b<Data> implements C8476n<byte[], Data> {

    /* renamed from: a */
    private final C8441b<Data> f12026a;

    /* renamed from: k1.b$a */
    /* compiled from: ByteArrayLoader */
    public static class C8439a implements C8478o<byte[], ByteBuffer> {

        /* renamed from: k1.b$a$a */
        /* compiled from: ByteArrayLoader */
        class C8440a implements C8441b<ByteBuffer> {
            C8440a() {
            }

            /* renamed from: a */
            public Class<ByteBuffer> mo42465a() {
                return ByteBuffer.class;
            }

            /* renamed from: c */
            public ByteBuffer mo42466b(byte[] bArr) {
                return ByteBuffer.wrap(bArr);
            }
        }

        @NonNull
        /* renamed from: b */
        public C8476n<byte[], ByteBuffer> mo42462b(@NonNull C8484r rVar) {
            return new C8438b(new C8440a());
        }
    }

    /* renamed from: k1.b$b */
    /* compiled from: ByteArrayLoader */
    public interface C8441b<Data> {
        /* renamed from: a */
        Class<Data> mo42465a();

        /* renamed from: b */
        Data mo42466b(byte[] bArr);
    }

    /* renamed from: k1.b$d */
    /* compiled from: ByteArrayLoader */
    public static class C8443d implements C8478o<byte[], InputStream> {

        /* renamed from: k1.b$d$a */
        /* compiled from: ByteArrayLoader */
        class C8444a implements C8441b<InputStream> {
            C8444a() {
            }

            /* renamed from: a */
            public Class<InputStream> mo42465a() {
                return InputStream.class;
            }

            /* renamed from: c */
            public InputStream mo42466b(byte[] bArr) {
                return new ByteArrayInputStream(bArr);
            }
        }

        @NonNull
        /* renamed from: b */
        public C8476n<byte[], InputStream> mo42462b(@NonNull C8484r rVar) {
            return new C8438b(new C8444a());
        }
    }

    public C8438b(C8441b<Data> bVar) {
        this.f12026a = bVar;
    }

    /* renamed from: c */
    public C8476n.C8477a<Data> mo42458b(@NonNull byte[] bArr, int i, int i2, @NonNull C7222g gVar) {
        return new C8476n.C8477a<>(new C10652b(bArr), new C8442c(bArr, this.f12026a));
    }

    /* renamed from: d */
    public boolean mo42457a(@NonNull byte[] bArr) {
        return true;
    }

    /* renamed from: k1.b$c */
    /* compiled from: ByteArrayLoader */
    private static class C8442c<Data> implements C7422d<Data> {

        /* renamed from: b */
        private final byte[] f12028b;

        /* renamed from: c */
        private final C8441b<Data> f12029c;

        C8442c(byte[] bArr, C8441b<Data> bVar) {
            this.f12028b = bArr;
            this.f12029c = bVar;
        }

        @NonNull
        /* renamed from: a */
        public Class<Data> mo41069a() {
            return this.f12029c.mo42465a();
        }

        @NonNull
        /* renamed from: d */
        public C7214a mo41077d() {
            return C7214a.LOCAL;
        }

        /* renamed from: e */
        public void mo41078e(@NonNull C4368f fVar, @NonNull C7422d.C7423a<? super Data> aVar) {
            aVar.mo31271f(this.f12029c.mo42466b(this.f12028b));
        }

        /* renamed from: b */
        public void mo41074b() {
        }

        public void cancel() {
        }
    }
}
