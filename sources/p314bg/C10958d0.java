package p314bg;

import androidx.core.location.LocationRequestCompat;

/* renamed from: bg.d0 */
/* compiled from: SharingStarted.kt */
public interface C10958d0 {

    /* renamed from: a */
    public static final C10959a f16915a = C10959a.f16916a;

    /* renamed from: bg.d0$a */
    /* compiled from: SharingStarted.kt */
    public static final class C10959a {

        /* renamed from: a */
        static final /* synthetic */ C10959a f16916a = new C10959a();

        /* renamed from: b */
        private static final C10958d0 f16917b = new C10961e0();

        /* renamed from: c */
        private static final C10958d0 f16918c = new C10963f0();

        private C10959a() {
        }

        /* renamed from: b */
        public static /* synthetic */ C10958d0 m23582b(C10959a aVar, long j, long j2, int i, Object obj) {
            if ((i & 1) != 0) {
                j = 0;
            }
            if ((i & 2) != 0) {
                j2 = LocationRequestCompat.PASSIVE_INTERVAL;
            }
            return aVar.mo46025a(j, j2);
        }

        /* renamed from: a */
        public final C10958d0 mo46025a(long j, long j2) {
            return new C10968g0(j, j2);
        }

        /* renamed from: c */
        public final C10958d0 mo46026c() {
            return f16917b;
        }

        /* renamed from: d */
        public final C10958d0 mo46027d() {
            return f16918c;
        }
    }

    /* renamed from: a */
    C10962f<C10952b0> mo46024a(C10972h0<Integer> h0Var);
}
