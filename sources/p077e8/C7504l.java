package p077e8;

import p192p6.C9063a;
import p245u7.C9896b;
import p245u7.C9898d;

/* renamed from: e8.l */
/* compiled from: AppMeasurementModule_ProvidesAnalyticsConnectorFactory */
public final class C7504l implements C9896b<C9063a> {

    /* renamed from: a */
    private final C7502k f10396a;

    public C7504l(C7502k kVar) {
        this.f10396a = kVar;
    }

    /* renamed from: a */
    public static C7504l m14730a(C7502k kVar) {
        return new C7504l(kVar);
    }

    /* renamed from: c */
    public static C9063a m14731c(C7502k kVar) {
        return (C9063a) C9898d.m20567c(kVar.mo41222a(), "Cannot return null from a non-@Nullable @Provides method");
    }

    /* renamed from: b */
    public C9063a get() {
        return m14731c(this.f10396a);
    }
}
