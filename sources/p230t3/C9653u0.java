package p230t3;

import android.content.Context;
import p169n3.C8901b;
import p330df.C11814a;

/* renamed from: t3.u0 */
/* compiled from: SchemaManager_Factory */
public final class C9653u0 implements C8901b<C9650t0> {

    /* renamed from: a */
    private final C11814a<Context> f14364a;

    /* renamed from: b */
    private final C11814a<String> f14365b;

    /* renamed from: c */
    private final C11814a<Integer> f14366c;

    public C9653u0(C11814a<Context> aVar, C11814a<String> aVar2, C11814a<Integer> aVar3) {
        this.f14364a = aVar;
        this.f14365b = aVar2;
        this.f14366c = aVar3;
    }

    /* renamed from: a */
    public static C9653u0 m20095a(C11814a<Context> aVar, C11814a<String> aVar2, C11814a<Integer> aVar3) {
        return new C9653u0(aVar, aVar2, aVar3);
    }

    /* renamed from: c */
    public static C9650t0 m20096c(Context context, String str, int i) {
        return new C9650t0(context, str, i);
    }

    /* renamed from: b */
    public C9650t0 get() {
        return m20096c(this.f14364a.get(), this.f14365b.get(), this.f14366c.get().intValue());
    }
}
