package p115i;

import java.util.Set;
import kotlin.NoWhenBranchMatchedException;

/* renamed from: i.n */
/* compiled from: ExifUtils.kt */
public final class C8053n {

    /* renamed from: a */
    private static final Set<String> f11302a = C12731y0.m28555i("image/jpeg", "image/webp", "image/heic", "image/heif");

    /* renamed from: i.n$a */
    /* compiled from: ExifUtils.kt */
    public /* synthetic */ class C8054a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f11303a;

        /* JADX WARNING: Can't wrap try/catch for region: R(9:0|1|2|3|4|5|6|7|9) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
        static {
            /*
                i.l[] r0 = p115i.C8051l.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                i.l r1 = p115i.C8051l.RESPECT_PERFORMANCE     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                i.l r1 = p115i.C8051l.IGNORE     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                i.l r1 = p115i.C8051l.RESPECT_ALL     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                f11303a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p115i.C8053n.C8054a.<clinit>():void");
        }
    }

    /* renamed from: a */
    public static final boolean m15828a(C8048j jVar) {
        if (jVar.mo41873a() > 0) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public static final boolean m15829b(C8048j jVar) {
        if (jVar.mo41873a() == 90 || jVar.mo41873a() == 270) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public static final boolean m15830c(C8051l lVar, String str) {
        int i = C8054a.f11303a[lVar.ordinal()];
        if (i != 1) {
            if (i == 2) {
                return false;
            }
            if (i != 3) {
                throw new NoWhenBranchMatchedException();
            }
        } else if (str == null || !f11302a.contains(str)) {
            return false;
        }
        return true;
    }
}
