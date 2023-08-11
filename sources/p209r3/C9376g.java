package p209r3;

import p169n3.C8901b;
import p169n3.C8903d;
import p219s3.C9470f;
import p252v3.C9927a;
import p330df.C11814a;

/* renamed from: r3.g */
/* compiled from: SchedulingConfigModule_ConfigFactory */
public final class C9376g implements C8901b<C9470f> {

    /* renamed from: a */
    private final C11814a<C9927a> f13950a;

    public C9376g(C11814a<C9927a> aVar) {
        this.f13950a = aVar;
    }

    /* renamed from: a */
    public static C9470f m19398a(C9927a aVar) {
        return (C9470f) C8903d.m18035c(C9375f.m19397a(aVar), "Cannot return null from a non-@Nullable @Provides method");
    }

    /* renamed from: b */
    public static C9376g m19399b(C11814a<C9927a> aVar) {
        return new C9376g(aVar);
    }

    /* renamed from: c */
    public C9470f get() {
        return m19398a(this.f13950a.get());
    }
}
