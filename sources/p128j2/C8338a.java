package p128j2;

import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: j2.a */
/* compiled from: MTensor.kt */
public final class C8338a {

    /* renamed from: d */
    public static final C8339a f11742d = new C8339a((DefaultConstructorMarker) null);

    /* renamed from: a */
    private int f11743a;

    /* renamed from: b */
    private float[] f11744b;

    /* renamed from: c */
    private int[] f11745c;

    /* renamed from: j2.a$a */
    /* compiled from: MTensor.kt */
    public static final class C8339a {
        private C8339a() {
        }

        public /* synthetic */ C8339a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* access modifiers changed from: private */
        /* renamed from: b */
        public final int m16555b(int[] iArr) {
            boolean z;
            int i = 1;
            if (iArr.length == 0) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                int i2 = iArr[0];
                int L = C12710p.m28384L(iArr);
                if (1 <= L) {
                    while (true) {
                        i2 *= iArr[i];
                        if (i == L) {
                            break;
                        }
                        i++;
                    }
                }
                return i2;
            }
            throw new UnsupportedOperationException("Empty array can't be reduced.");
        }
    }

    public C8338a(int[] iArr) {
        C12775o.m28639i(iArr, "shape");
        this.f11745c = iArr;
        int a = f11742d.m16555b(iArr);
        this.f11743a = a;
        this.f11744b = new float[a];
    }

    /* renamed from: a */
    public final float[] mo42289a() {
        return this.f11744b;
    }

    /* renamed from: b */
    public final int mo42290b(int i) {
        return this.f11745c[i];
    }

    /* renamed from: c */
    public final int mo42291c() {
        return this.f11745c.length;
    }

    /* renamed from: d */
    public final void mo42292d(int[] iArr) {
        C12775o.m28639i(iArr, "shape");
        this.f11745c = iArr;
        int a = f11742d.m16555b(iArr);
        float[] fArr = new float[a];
        System.arraycopy(this.f11744b, 0, fArr, 0, Math.min(this.f11743a, a));
        this.f11744b = fArr;
        this.f11743a = a;
    }
}
