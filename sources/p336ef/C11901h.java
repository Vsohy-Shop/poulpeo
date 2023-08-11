package p336ef;

import kotlin.Lazy;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p404of.C13074a;

/* renamed from: ef.h */
/* compiled from: LazyJVM.kt */
class C11901h {

    /* renamed from: ef.h$a */
    /* compiled from: LazyJVM.kt */
    public /* synthetic */ class C11902a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f18593a;

        /* JADX WARNING: Can't wrap try/catch for region: R(9:0|1|2|3|4|5|6|7|9) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
        static {
            /*
                ef.j[] r0 = p336ef.C11904j.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                ef.j r1 = p336ef.C11904j.SYNCHRONIZED     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                ef.j r1 = p336ef.C11904j.PUBLICATION     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                ef.j r1 = p336ef.C11904j.NONE     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                f18593a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p336ef.C11901h.C11902a.<clinit>():void");
        }
    }

    /* renamed from: a */
    public static <T> Lazy<T> m25689a(C11904j jVar, C13074a<? extends T> aVar) {
        C12775o.m28639i(jVar, "mode");
        C12775o.m28639i(aVar, "initializer");
        int i = C11902a.f18593a[jVar.ordinal()];
        if (i == 1) {
            return new C11913p(aVar, (Object) null, 2, (DefaultConstructorMarker) null);
        }
        if (i == 2) {
            return new C11911o(aVar);
        }
        if (i == 3) {
            return new C11922w(aVar);
        }
        throw new NoWhenBranchMatchedException();
    }

    /* renamed from: b */
    public static <T> Lazy<T> m25690b(C13074a<? extends T> aVar) {
        C12775o.m28639i(aVar, "initializer");
        return new C11913p(aVar, (Object) null, 2, (DefaultConstructorMarker) null);
    }
}
