package p266w6;

import androidx.annotation.Nullable;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicMarkableReference;
import java.util.concurrent.atomic.AtomicReference;
import p025a7.C2217f;
import p255v6.C9975h;

/* renamed from: w6.g */
/* compiled from: UserMetadata */
public class C10128g {

    /* renamed from: a */
    private final C10119d f15314a;

    /* renamed from: b */
    private final C9975h f15315b;

    /* renamed from: c */
    private final String f15316c;

    /* renamed from: d */
    private final C10129a f15317d = new C10129a(false);

    /* renamed from: e */
    private final C10129a f15318e = new C10129a(true);

    /* renamed from: f */
    private final AtomicMarkableReference<String> f15319f = new AtomicMarkableReference<>((Object) null, false);

    /* renamed from: w6.g$a */
    /* compiled from: UserMetadata */
    private class C10129a {

        /* renamed from: a */
        final AtomicMarkableReference<C10115b> f15320a;

        /* renamed from: b */
        private final AtomicReference<Callable<Void>> f15321b = new AtomicReference<>((Object) null);

        /* renamed from: c */
        private final boolean f15322c;

        public C10129a(boolean z) {
            int i;
            this.f15322c = z;
            if (z) {
                i = 8192;
            } else {
                i = 1024;
            }
            this.f15320a = new AtomicMarkableReference<>(new C10115b(64, i), false);
        }

        /* renamed from: a */
        public Map<String, String> mo44727a() {
            return this.f15320a.getReference().mo44699a();
        }
    }

    public C10128g(String str, C2217f fVar, C9975h hVar) {
        this.f15316c = str;
        this.f15314a = new C10119d(fVar);
        this.f15315b = hVar;
    }

    /* renamed from: c */
    public static C10128g m21312c(String str, C2217f fVar, C9975h hVar) {
        C10119d dVar = new C10119d(fVar);
        C10128g gVar = new C10128g(str, fVar, hVar);
        gVar.f15317d.f15320a.getReference().mo44700d(dVar.mo44710f(str, false));
        gVar.f15318e.f15320a.getReference().mo44700d(dVar.mo44710f(str, true));
        gVar.f15319f.set(dVar.mo44711g(str), false);
        return gVar;
    }

    @Nullable
    /* renamed from: d */
    public static String m21313d(String str, C2217f fVar) {
        return new C10119d(fVar).mo44711g(str);
    }

    /* renamed from: a */
    public Map<String, String> mo44725a() {
        return this.f15317d.mo44727a();
    }

    /* renamed from: b */
    public Map<String, String> mo44726b() {
        return this.f15318e.mo44727a();
    }
}
