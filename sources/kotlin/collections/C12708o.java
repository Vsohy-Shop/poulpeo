package kotlin.collections;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import kotlin.jvm.internal.C12775o;

/* renamed from: kotlin.collections.o */
/* compiled from: _ArraysJvm.kt */
class C12708o extends C12706n {
    /* renamed from: A */
    public static final <T> void m28334A(T[] tArr, Comparator<? super T> comparator) {
        C12775o.m28639i(tArr, "<this>");
        C12775o.m28639i(comparator, "comparator");
        if (tArr.length > 1) {
            Arrays.sort(tArr, comparator);
        }
    }

    /* renamed from: B */
    public static <T> void m28335B(T[] tArr, Comparator<? super T> comparator, int i, int i2) {
        C12775o.m28639i(tArr, "<this>");
        C12775o.m28639i(comparator, "comparator");
        Arrays.sort(tArr, i, i2, comparator);
    }

    /* renamed from: c */
    public static <T> List<T> m28336c(T[] tArr) {
        C12775o.m28639i(tArr, "<this>");
        List<T> a = C12713q.m28410a(tArr);
        C12775o.m28638h(a, "asList(this)");
        return a;
    }

    /* renamed from: d */
    public static byte[] m28337d(byte[] bArr, byte[] bArr2, int i, int i2, int i3) {
        C12775o.m28639i(bArr, "<this>");
        C12775o.m28639i(bArr2, "destination");
        System.arraycopy(bArr, i2, bArr2, i, i3 - i2);
        return bArr2;
    }

    /* renamed from: e */
    public static char[] m28338e(char[] cArr, char[] cArr2, int i, int i2, int i3) {
        C12775o.m28639i(cArr, "<this>");
        C12775o.m28639i(cArr2, "destination");
        System.arraycopy(cArr, i2, cArr2, i, i3 - i2);
        return cArr2;
    }

    /* renamed from: f */
    public static float[] m28339f(float[] fArr, float[] fArr2, int i, int i2, int i3) {
        C12775o.m28639i(fArr, "<this>");
        C12775o.m28639i(fArr2, "destination");
        System.arraycopy(fArr, i2, fArr2, i, i3 - i2);
        return fArr2;
    }

    /* renamed from: g */
    public static int[] m28340g(int[] iArr, int[] iArr2, int i, int i2, int i3) {
        C12775o.m28639i(iArr, "<this>");
        C12775o.m28639i(iArr2, "destination");
        System.arraycopy(iArr, i2, iArr2, i, i3 - i2);
        return iArr2;
    }

    /* renamed from: h */
    public static long[] m28341h(long[] jArr, long[] jArr2, int i, int i2, int i3) {
        C12775o.m28639i(jArr, "<this>");
        C12775o.m28639i(jArr2, "destination");
        System.arraycopy(jArr, i2, jArr2, i, i3 - i2);
        return jArr2;
    }

    /* renamed from: i */
    public static <T> T[] m28342i(T[] tArr, T[] tArr2, int i, int i2, int i3) {
        C12775o.m28639i(tArr, "<this>");
        C12775o.m28639i(tArr2, "destination");
        System.arraycopy(tArr, i2, tArr2, i, i3 - i2);
        return tArr2;
    }

    /* renamed from: j */
    public static /* synthetic */ byte[] m28343j(byte[] bArr, byte[] bArr2, int i, int i2, int i3, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            i = 0;
        }
        if ((i4 & 4) != 0) {
            i2 = 0;
        }
        if ((i4 & 8) != 0) {
            i3 = bArr.length;
        }
        return m28337d(bArr, bArr2, i, i2, i3);
    }

    /* renamed from: k */
    public static /* synthetic */ float[] m28344k(float[] fArr, float[] fArr2, int i, int i2, int i3, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            i = 0;
        }
        if ((i4 & 4) != 0) {
            i2 = 0;
        }
        if ((i4 & 8) != 0) {
            i3 = fArr.length;
        }
        return m28339f(fArr, fArr2, i, i2, i3);
    }

    /* renamed from: l */
    public static /* synthetic */ int[] m28345l(int[] iArr, int[] iArr2, int i, int i2, int i3, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            i = 0;
        }
        if ((i4 & 4) != 0) {
            i2 = 0;
        }
        if ((i4 & 8) != 0) {
            i3 = iArr.length;
        }
        return m28340g(iArr, iArr2, i, i2, i3);
    }

    /* renamed from: m */
    public static /* synthetic */ Object[] m28346m(Object[] objArr, Object[] objArr2, int i, int i2, int i3, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            i = 0;
        }
        if ((i4 & 4) != 0) {
            i2 = 0;
        }
        if ((i4 & 8) != 0) {
            i3 = objArr.length;
        }
        return m28342i(objArr, objArr2, i, i2, i3);
    }

    /* renamed from: n */
    public static byte[] m28347n(byte[] bArr, int i, int i2) {
        C12775o.m28639i(bArr, "<this>");
        C12704m.m28332b(i2, bArr.length);
        byte[] copyOfRange = Arrays.copyOfRange(bArr, i, i2);
        C12775o.m28638h(copyOfRange, "copyOfRange(this, fromIndex, toIndex)");
        return copyOfRange;
    }

    /* renamed from: o */
    public static float[] m28348o(float[] fArr, int i, int i2) {
        C12775o.m28639i(fArr, "<this>");
        C12704m.m28332b(i2, fArr.length);
        float[] copyOfRange = Arrays.copyOfRange(fArr, i, i2);
        C12775o.m28638h(copyOfRange, "copyOfRange(this, fromIndex, toIndex)");
        return copyOfRange;
    }

    /* renamed from: p */
    public static <T> T[] m28349p(T[] tArr, int i, int i2) {
        C12775o.m28639i(tArr, "<this>");
        C12704m.m28332b(i2, tArr.length);
        T[] copyOfRange = Arrays.copyOfRange(tArr, i, i2);
        C12775o.m28638h(copyOfRange, "copyOfRange(this, fromIndex, toIndex)");
        return copyOfRange;
    }

    /* renamed from: q */
    public static final void m28350q(float[] fArr, float f, int i, int i2) {
        C12775o.m28639i(fArr, "<this>");
        Arrays.fill(fArr, i, i2, f);
    }

    /* renamed from: r */
    public static void m28351r(int[] iArr, int i, int i2, int i3) {
        C12775o.m28639i(iArr, "<this>");
        Arrays.fill(iArr, i2, i3, i);
    }

    /* renamed from: s */
    public static <T> void m28352s(T[] tArr, T t, int i, int i2) {
        C12775o.m28639i(tArr, "<this>");
        Arrays.fill(tArr, i, i2, t);
    }

    /* renamed from: t */
    public static /* synthetic */ void m28353t(float[] fArr, float f, int i, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = fArr.length;
        }
        m28350q(fArr, f, i, i2);
    }

    /* renamed from: u */
    public static /* synthetic */ void m28354u(int[] iArr, int i, int i2, int i3, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            i2 = 0;
        }
        if ((i4 & 4) != 0) {
            i3 = iArr.length;
        }
        m28351r(iArr, i, i2, i3);
    }

    /* renamed from: v */
    public static /* synthetic */ void m28355v(Object[] objArr, Object obj, int i, int i2, int i3, Object obj2) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = objArr.length;
        }
        m28352s(objArr, obj, i, i2);
    }

    /* renamed from: w */
    public static int[] m28356w(int[] iArr, int i) {
        C12775o.m28639i(iArr, "<this>");
        int length = iArr.length;
        int[] copyOf = Arrays.copyOf(iArr, length + 1);
        copyOf[length] = i;
        C12775o.m28638h(copyOf, "result");
        return copyOf;
    }

    /* renamed from: x */
    public static int[] m28357x(int[] iArr, int[] iArr2) {
        C12775o.m28639i(iArr, "<this>");
        C12775o.m28639i(iArr2, "elements");
        int length = iArr.length;
        int length2 = iArr2.length;
        int[] copyOf = Arrays.copyOf(iArr, length + length2);
        System.arraycopy(iArr2, 0, copyOf, length, length2);
        C12775o.m28638h(copyOf, "result");
        return copyOf;
    }

    /* renamed from: y */
    public static <T> T[] m28358y(T[] tArr, T t) {
        C12775o.m28639i(tArr, "<this>");
        int length = tArr.length;
        T[] copyOf = Arrays.copyOf(tArr, length + 1);
        copyOf[length] = t;
        C12775o.m28638h(copyOf, "result");
        return copyOf;
    }

    /* renamed from: z */
    public static <T> void m28359z(T[] tArr) {
        C12775o.m28639i(tArr, "<this>");
        if (tArr.length > 1) {
            Arrays.sort(tArr);
        }
    }
}
