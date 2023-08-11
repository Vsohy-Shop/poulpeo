package p137k1;

import android.util.Log;
import androidx.annotation.NonNull;
import com.bumptech.glide.C4368f;
import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;
import p058d1.C7214a;
import p058d1.C7222g;
import p070e1.C7422d;
import p137k1.C8476n;
import p283y1.C10652b;
import p294z1.C10778a;

/* renamed from: k1.d */
/* compiled from: ByteBufferFileLoader */
public class C8446d implements C8476n<File, ByteBuffer> {

    /* renamed from: k1.d$b */
    /* compiled from: ByteBufferFileLoader */
    public static class C8448b implements C8478o<File, ByteBuffer> {
        @NonNull
        /* renamed from: b */
        public C8476n<File, ByteBuffer> mo42462b(@NonNull C8484r rVar) {
            return new C8446d();
        }
    }

    /* renamed from: c */
    public C8476n.C8477a<ByteBuffer> mo42458b(@NonNull File file, int i, int i2, @NonNull C7222g gVar) {
        return new C8476n.C8477a<>(new C10652b(file), new C8447a(file));
    }

    /* renamed from: d */
    public boolean mo42457a(@NonNull File file) {
        return true;
    }

    /* renamed from: k1.d$a */
    /* compiled from: ByteBufferFileLoader */
    private static final class C8447a implements C7422d<ByteBuffer> {

        /* renamed from: b */
        private final File f12031b;

        C8447a(File file) {
            this.f12031b = file;
        }

        @NonNull
        /* renamed from: a */
        public Class<ByteBuffer> mo41069a() {
            return ByteBuffer.class;
        }

        @NonNull
        /* renamed from: d */
        public C7214a mo41077d() {
            return C7214a.LOCAL;
        }

        /* renamed from: e */
        public void mo41078e(@NonNull C4368f fVar, @NonNull C7422d.C7423a<? super ByteBuffer> aVar) {
            try {
                aVar.mo31271f(C10778a.m22917a(this.f12031b));
            } catch (IOException e) {
                if (Log.isLoggable("ByteBufferFileLoader", 3)) {
                    Log.d("ByteBufferFileLoader", "Failed to obtain ByteBuffer for file", e);
                }
                aVar.mo31269c(e);
            }
        }

        /* renamed from: b */
        public void mo41074b() {
        }

        public void cancel() {
        }
    }
}
