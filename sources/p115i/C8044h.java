package p115i;

import androidx.annotation.C0127Px;
import kotlin.NoWhenBranchMatchedException;
import p215s.C9413h;

/* renamed from: i.h */
/* compiled from: DecodeUtils.kt */
public final class C8044h {

    /* renamed from: a */
    public static final C8044h f11288a = new C8044h();

    /* renamed from: i.h$a */
    /* compiled from: DecodeUtils.kt */
    public /* synthetic */ class C8045a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f11289a;

        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        static {
            /*
                s.h[] r0 = p215s.C9413h.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                s.h r1 = p215s.C9413h.FILL     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                s.h r1 = p215s.C9413h.FIT     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                f11289a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p115i.C8044h.C8045a.<clinit>():void");
        }
    }

    private C8044h() {
    }

    /* renamed from: a */
    public static final int m15817a(@C0127Px int i, @C0127Px int i2, @C0127Px int i3, @C0127Px int i4, C9413h hVar) {
        int i5;
        int highestOneBit = Integer.highestOneBit(i / i3);
        int highestOneBit2 = Integer.highestOneBit(i2 / i4);
        int i6 = C8045a.f11289a[hVar.ordinal()];
        if (i6 == 1) {
            i5 = Math.min(highestOneBit, highestOneBit2);
        } else if (i6 == 2) {
            i5 = Math.max(highestOneBit, highestOneBit2);
        } else {
            throw new NoWhenBranchMatchedException();
        }
        return C13537l.m30877d(i5, 1);
    }

    /* renamed from: b */
    public static final double m15818b(@C0127Px double d, @C0127Px double d2, @C0127Px double d3, @C0127Px double d4, C9413h hVar) {
        double d5 = d3 / d;
        double d6 = d4 / d2;
        int i = C8045a.f11289a[hVar.ordinal()];
        if (i == 1) {
            return Math.max(d5, d6);
        }
        if (i == 2) {
            return Math.min(d5, d6);
        }
        throw new NoWhenBranchMatchedException();
    }

    /* renamed from: c */
    public static final double m15819c(@C0127Px int i, @C0127Px int i2, @C0127Px int i3, @C0127Px int i4, C9413h hVar) {
        double d = ((double) i3) / ((double) i);
        double d2 = ((double) i4) / ((double) i2);
        int i5 = C8045a.f11289a[hVar.ordinal()];
        if (i5 == 1) {
            return Math.max(d, d2);
        }
        if (i5 == 2) {
            return Math.min(d, d2);
        }
        throw new NoWhenBranchMatchedException();
    }
}
