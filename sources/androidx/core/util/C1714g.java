package androidx.core.util;

/* renamed from: androidx.core.util.g */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C1714g implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ Predicate f520a;

    /* renamed from: b */
    public final /* synthetic */ Predicate f521b;

    public /* synthetic */ C1714g(Predicate predicate, Predicate predicate2) {
        this.f520a = predicate;
        this.f521b = predicate2;
    }

    public final boolean test(Object obj) {
        return this.f520a.lambda$and$0(this.f521b, obj);
    }
}
