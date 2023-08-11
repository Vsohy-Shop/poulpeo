package p137k1;

import android.net.Uri;
import androidx.annotation.NonNull;
import androidx.webkit.ProxyConfig;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import p058d1.C7222g;
import p137k1.C8476n;

/* renamed from: k1.x */
/* compiled from: UrlUriLoader */
public class C8506x<Data> implements C8476n<Uri, Data> {

    /* renamed from: b */
    private static final Set<String> f12112b = Collections.unmodifiableSet(new HashSet(Arrays.asList(new String[]{ProxyConfig.MATCH_HTTP, "https"})));

    /* renamed from: a */
    private final C8476n<C8462g, Data> f12113a;

    /* renamed from: k1.x$a */
    /* compiled from: UrlUriLoader */
    public static class C8507a implements C8478o<Uri, InputStream> {
        @NonNull
        /* renamed from: b */
        public C8476n<Uri, InputStream> mo42462b(C8484r rVar) {
            return new C8506x(rVar.mo42520d(C8462g.class, InputStream.class));
        }
    }

    public C8506x(C8476n<C8462g, Data> nVar) {
        this.f12113a = nVar;
    }

    /* renamed from: c */
    public C8476n.C8477a<Data> mo42458b(@NonNull Uri uri, int i, int i2, @NonNull C7222g gVar) {
        return this.f12113a.mo42458b(new C8462g(uri.toString()), i, i2, gVar);
    }

    /* renamed from: d */
    public boolean mo42457a(@NonNull Uri uri) {
        return f12112b.contains(uri.getScheme());
    }
}
