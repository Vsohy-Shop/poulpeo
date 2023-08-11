package p167n1;

import androidx.annotation.NonNull;
import java.nio.ByteBuffer;
import p070e1.C7424e;

/* renamed from: n1.a */
/* compiled from: ByteBufferRewinder */
public class C8876a implements C7424e<ByteBuffer> {

    /* renamed from: a */
    private final ByteBuffer f12855a;

    /* renamed from: n1.a$a */
    /* compiled from: ByteBufferRewinder */
    public static class C8877a implements C7424e.C7425a<ByteBuffer> {
        @NonNull
        /* renamed from: a */
        public Class<ByteBuffer> mo41087a() {
            return ByteBuffer.class;
        }

        @NonNull
        /* renamed from: c */
        public C7424e<ByteBuffer> mo41088b(ByteBuffer byteBuffer) {
            return new C8876a(byteBuffer);
        }
    }

    public C8876a(ByteBuffer byteBuffer) {
        this.f12855a = byteBuffer;
    }

    @NonNull
    /* renamed from: c */
    public ByteBuffer mo41085a() {
        this.f12855a.position(0);
        return this.f12855a;
    }

    /* renamed from: b */
    public void mo41086b() {
    }
}
