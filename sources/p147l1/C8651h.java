package p147l1;

import androidx.annotation.NonNull;
import java.io.InputStream;
import java.net.URL;
import p058d1.C7222g;
import p137k1.C8462g;
import p137k1.C8476n;
import p137k1.C8478o;
import p137k1.C8484r;

/* renamed from: l1.h */
/* compiled from: UrlLoader */
public class C8651h implements C8476n<URL, InputStream> {

    /* renamed from: a */
    private final C8476n<C8462g, InputStream> f12368a;

    /* renamed from: l1.h$a */
    /* compiled from: UrlLoader */
    public static class C8652a implements C8478o<URL, InputStream> {
        @NonNull
        /* renamed from: b */
        public C8476n<URL, InputStream> mo42462b(C8484r rVar) {
            return new C8651h(rVar.mo42520d(C8462g.class, InputStream.class));
        }
    }

    public C8651h(C8476n<C8462g, InputStream> nVar) {
        this.f12368a = nVar;
    }

    /* renamed from: c */
    public C8476n.C8477a<InputStream> mo42458b(@NonNull URL url, int i, int i2, @NonNull C7222g gVar) {
        return this.f12368a.mo42458b(new C8462g(url), i, i2, gVar);
    }

    /* renamed from: d */
    public boolean mo42457a(@NonNull URL url) {
        return true;
    }
}
