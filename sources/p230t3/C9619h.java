package p230t3;

import android.content.Context;
import p169n3.C8901b;
import p169n3.C8903d;
import p330df.C11814a;

/* renamed from: t3.h */
/* compiled from: EventStoreModule_PackageNameFactory */
public final class C9619h implements C8901b<String> {

    /* renamed from: a */
    private final C11814a<Context> f14314a;

    public C9619h(C11814a<Context> aVar) {
        this.f14314a = aVar;
    }

    /* renamed from: a */
    public static C9619h m19972a(C11814a<Context> aVar) {
        return new C9619h(aVar);
    }

    /* renamed from: c */
    public static String m19973c(Context context) {
        return (String) C8903d.m18035c(C9614f.m19964b(context), "Cannot return null from a non-@Nullable @Provides method");
    }

    /* renamed from: b */
    public String get() {
        return m19973c(this.f14314a.get());
    }
}
