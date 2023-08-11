package p147l1;

import android.net.Uri;
import androidx.annotation.NonNull;
import androidx.webkit.ProxyConfig;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import p058d1.C7222g;
import p137k1.C8462g;
import p137k1.C8476n;
import p137k1.C8478o;
import p137k1.C8484r;

/* renamed from: l1.b */
/* compiled from: HttpUriLoader */
public class C8638b implements C8476n<Uri, InputStream> {

    /* renamed from: b */
    private static final Set<String> f12345b = Collections.unmodifiableSet(new HashSet(Arrays.asList(new String[]{ProxyConfig.MATCH_HTTP, "https"})));

    /* renamed from: a */
    private final C8476n<C8462g, InputStream> f12346a;

    /* renamed from: l1.b$a */
    /* compiled from: HttpUriLoader */
    public static class C8639a implements C8478o<Uri, InputStream> {
        @NonNull
        /* renamed from: b */
        public C8476n<Uri, InputStream> mo42462b(C8484r rVar) {
            return new C8638b(rVar.mo42520d(C8462g.class, InputStream.class));
        }
    }

    public C8638b(C8476n<C8462g, InputStream> nVar) {
        this.f12346a = nVar;
    }

    /* renamed from: c */
    public C8476n.C8477a<InputStream> mo42458b(@NonNull Uri uri, int i, int i2, @NonNull C7222g gVar) {
        return this.f12346a.mo42458b(new C8462g(uri.toString()), i, i2, gVar);
    }

    /* renamed from: d */
    public boolean mo42457a(@NonNull Uri uri) {
        return f12345b.contains(uri.getScheme());
    }
}
