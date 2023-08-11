package p466yf;

import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function1;
import p337eg.C11924a;
import p337eg.C11925b;
import p355hf.C12074d;
import p355hf.C12078f;
import p404of.C13088o;

/* renamed from: yf.n0 */
/* compiled from: CoroutineStart.kt */
public enum C14004n0 {
    DEFAULT,
    LAZY,
    ATOMIC,
    UNDISPATCHED;

    /* renamed from: yf.n0$a */
    /* compiled from: CoroutineStart.kt */
    public /* synthetic */ class C14005a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f22931a = null;

        /* JADX WARNING: Can't wrap try/catch for region: R(11:0|1|2|3|4|5|6|7|8|9|11) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0022 */
        static {
            /*
                yf.n0[] r0 = p466yf.C14004n0.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                yf.n0 r1 = p466yf.C14004n0.DEFAULT     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                yf.n0 r1 = p466yf.C14004n0.ATOMIC     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                yf.n0 r1 = p466yf.C14004n0.UNDISPATCHED     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                yf.n0 r1 = p466yf.C14004n0.LAZY     // Catch:{ NoSuchFieldError -> 0x002b }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002b }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002b }
            L_0x002b:
                f22931a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p466yf.C14004n0.C14005a.<clinit>():void");
        }
    }

    /* renamed from: b */
    public final <R, T> void mo53783b(C13088o<? super R, ? super C12074d<? super T>, ? extends Object> oVar, R r, C12074d<? super T> dVar) {
        int i = C14005a.f22931a[ordinal()];
        if (i == 1) {
            C11924a.m25728d(oVar, r, dVar, (Function1) null, 4, (Object) null);
        } else if (i == 2) {
            C12078f.m26259b(oVar, r, dVar);
        } else if (i == 3) {
            C11925b.m25729a(oVar, r, dVar);
        } else if (i != 4) {
            throw new NoWhenBranchMatchedException();
        }
    }

    /* renamed from: c */
    public final boolean mo53784c() {
        if (this == LAZY) {
            return true;
        }
        return false;
    }
}
