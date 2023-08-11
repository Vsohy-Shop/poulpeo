package androidx.core.util;

/* renamed from: androidx.core.util.d */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C1711d implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ Predicate f517a;

    /* renamed from: b */
    public final /* synthetic */ Predicate f518b;

    public /* synthetic */ C1711d(Predicate predicate, Predicate predicate2) {
        this.f517a = predicate;
        this.f518b = predicate2;
    }

    public final boolean test(Object obj) {
        return this.f517a.lambda$or$2(this.f518b, obj);
    }
}
