package p149l3;

import android.content.Context;
import p169n3.C8901b;
import p252v3.C9927a;
import p330df.C11814a;

/* renamed from: l3.j */
/* compiled from: CreationContextFactory_Factory */
public final class C8668j implements C8901b<C8667i> {

    /* renamed from: a */
    private final C11814a<Context> f12394a;

    /* renamed from: b */
    private final C11814a<C9927a> f12395b;

    /* renamed from: c */
    private final C11814a<C9927a> f12396c;

    public C8668j(C11814a<Context> aVar, C11814a<C9927a> aVar2, C11814a<C9927a> aVar3) {
        this.f12394a = aVar;
        this.f12395b = aVar2;
        this.f12396c = aVar3;
    }

    /* renamed from: a */
    public static C8668j m17430a(C11814a<Context> aVar, C11814a<C9927a> aVar2, C11814a<C9927a> aVar3) {
        return new C8668j(aVar, aVar2, aVar3);
    }

    /* renamed from: c */
    public static C8667i m17431c(Context context, C9927a aVar, C9927a aVar2) {
        return new C8667i(context, aVar, aVar2);
    }

    /* renamed from: b */
    public C8667i get() {
        return m17431c(this.f12394a.get(), this.f12395b.get(), this.f12396c.get());
    }
}
