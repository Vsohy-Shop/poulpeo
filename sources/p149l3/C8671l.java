package p149l3;

import android.content.Context;
import p169n3.C8901b;
import p330df.C11814a;

/* renamed from: l3.l */
/* compiled from: MetadataBackendRegistry_Factory */
public final class C8671l implements C8901b<C8669k> {

    /* renamed from: a */
    private final C11814a<Context> f12402a;

    /* renamed from: b */
    private final C11814a<C8667i> f12403b;

    public C8671l(C11814a<Context> aVar, C11814a<C8667i> aVar2) {
        this.f12402a = aVar;
        this.f12403b = aVar2;
    }

    /* renamed from: a */
    public static C8671l m17437a(C11814a<Context> aVar, C11814a<C8667i> aVar2) {
        return new C8671l(aVar, aVar2);
    }

    /* renamed from: c */
    public static C8669k m17438c(Context context, Object obj) {
        return new C8669k(context, (C8667i) obj);
    }

    /* renamed from: b */
    public C8669k get() {
        return m17438c(this.f12402a.get(), this.f12403b.get());
    }
}
