package p209r3;

import android.content.Context;
import p169n3.C8901b;
import p169n3.C8903d;
import p219s3.C9470f;
import p219s3.C9492x;
import p230t3.C9609d;
import p252v3.C9927a;
import p330df.C11814a;

/* renamed from: r3.i */
/* compiled from: SchedulingModule_WorkSchedulerFactory */
public final class C9378i implements C8901b<C9492x> {

    /* renamed from: a */
    private final C11814a<Context> f13951a;

    /* renamed from: b */
    private final C11814a<C9609d> f13952b;

    /* renamed from: c */
    private final C11814a<C9470f> f13953c;

    /* renamed from: d */
    private final C11814a<C9927a> f13954d;

    public C9378i(C11814a<Context> aVar, C11814a<C9609d> aVar2, C11814a<C9470f> aVar3, C11814a<C9927a> aVar4) {
        this.f13951a = aVar;
        this.f13952b = aVar2;
        this.f13953c = aVar3;
        this.f13954d = aVar4;
    }

    /* renamed from: a */
    public static C9378i m19402a(C11814a<Context> aVar, C11814a<C9609d> aVar2, C11814a<C9470f> aVar3, C11814a<C9927a> aVar4) {
        return new C9378i(aVar, aVar2, aVar3, aVar4);
    }

    /* renamed from: c */
    public static C9492x m19403c(Context context, C9609d dVar, C9470f fVar, C9927a aVar) {
        return (C9492x) C8903d.m18035c(C9377h.m19401a(context, dVar, fVar, aVar), "Cannot return null from a non-@Nullable @Provides method");
    }

    /* renamed from: b */
    public C9492x get() {
        return m19403c(this.f13951a.get(), this.f13952b.get(), this.f13953c.get(), this.f13954d.get());
    }
}
