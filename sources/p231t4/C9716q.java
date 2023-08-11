package p231t4;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* renamed from: t4.q */
/* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
public final class C9716q {
    @Nullable

    /* renamed from: b */
    private static C9716q f14522b;

    /* renamed from: c */
    private static final C9719r f14523c = new C9719r(0, false, false, 0, 0);
    @Nullable

    /* renamed from: a */
    private C9719r f14524a;

    private C9716q() {
    }

    @NonNull
    /* renamed from: b */
    public static synchronized C9716q m20289b() {
        C9716q qVar;
        synchronized (C9716q.class) {
            if (f14522b == null) {
                f14522b = new C9716q();
            }
            qVar = f14522b;
        }
        return qVar;
    }

    @Nullable
    /* renamed from: a */
    public C9719r mo44238a() {
        return this.f14524a;
    }

    /* renamed from: c */
    public final synchronized void mo44239c(@Nullable C9719r rVar) {
        if (rVar == null) {
            this.f14524a = f14523c;
            return;
        }
        C9719r rVar2 = this.f14524a;
        if (rVar2 == null || rVar2.mo44246I() < rVar.mo44246I()) {
            this.f14524a = rVar;
        }
    }
}
