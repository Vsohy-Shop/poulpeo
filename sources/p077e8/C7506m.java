package p077e8;

import p193p7.C9074d;
import p245u7.C9896b;
import p245u7.C9898d;

/* renamed from: e8.m */
/* compiled from: AppMeasurementModule_ProvidesSubsriberFactory */
public final class C7506m implements C9896b<C9074d> {

    /* renamed from: a */
    private final C7502k f10398a;

    public C7506m(C7502k kVar) {
        this.f10398a = kVar;
    }

    /* renamed from: a */
    public static C7506m m14736a(C7502k kVar) {
        return new C7506m(kVar);
    }

    /* renamed from: c */
    public static C9074d m14737c(C7502k kVar) {
        return (C9074d) C9898d.m20567c(kVar.mo41223b(), "Cannot return null from a non-@Nullable @Provides method");
    }

    /* renamed from: b */
    public C9074d get() {
        return m14737c(this.f10398a);
    }
}
