package p117i1;

import androidx.annotation.NonNull;
import androidx.core.util.Pools;
import com.adjust.sdk.Constants;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import p020a2.C2125a;
import p020a2.C2134c;
import p058d1.C7218e;
import p294z1.C10788g;
import p294z1.C10791j;
import p294z1.C10792k;

/* renamed from: i1.j */
/* compiled from: SafeKeyGenerator */
public class C8083j {

    /* renamed from: a */
    private final C10788g<C7218e, String> f11350a = new C10788g<>(1000);

    /* renamed from: b */
    private final Pools.Pool<C8085b> f11351b = C2125a.m1478d(10, new C8084a());

    /* renamed from: i1.j$a */
    /* compiled from: SafeKeyGenerator */
    class C8084a implements C2125a.C2129d<C8085b> {
        C8084a() {
        }

        /* renamed from: b */
        public C8085b mo23268a() {
            try {
                return new C8085b(MessageDigest.getInstance(Constants.SHA256));
            } catch (NoSuchAlgorithmException e) {
                throw new RuntimeException(e);
            }
        }
    }

    /* renamed from: i1.j$b */
    /* compiled from: SafeKeyGenerator */
    private static final class C8085b implements C2125a.C2131f {

        /* renamed from: b */
        final MessageDigest f11353b;

        /* renamed from: c */
        private final C2134c f11354c = C2134c.m1493a();

        C8085b(MessageDigest messageDigest) {
            this.f11353b = messageDigest;
        }

        @NonNull
        /* renamed from: d */
        public C2134c mo23271d() {
            return this.f11354c;
        }
    }

    /* renamed from: a */
    private String m15889a(C7218e eVar) {
        C8085b bVar = (C8085b) C10791j.m22948d(this.f11351b.acquire());
        try {
            eVar.mo31272a(bVar.f11353b);
            return C10792k.m22968s(bVar.f11353b.digest());
        } finally {
            this.f11351b.release(bVar);
        }
    }

    /* renamed from: b */
    public String mo41916b(C7218e eVar) {
        String g;
        synchronized (this.f11350a) {
            g = this.f11350a.mo45698g(eVar);
        }
        if (g == null) {
            g = m15889a(eVar);
        }
        synchronized (this.f11350a) {
            this.f11350a.mo45700k(eVar, g);
        }
        return g;
    }
}
