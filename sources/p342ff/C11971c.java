package p342ff;

import java.util.Arrays;
import java.util.List;
import kotlin.jvm.internal.C12775o;

/* renamed from: ff.c */
/* compiled from: ListBuilder.kt */
public final class C11971c {
    /* renamed from: d */
    public static final <E> E[] m25955d(int i) {
        boolean z;
        if (i >= 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return new Object[i];
        }
        throw new IllegalArgumentException("capacity must be non-negative.".toString());
    }

    /* renamed from: e */
    public static final <T> T[] m25956e(T[] tArr, int i) {
        C12775o.m28639i(tArr, "<this>");
        T[] copyOf = Arrays.copyOf(tArr, i);
        C12775o.m28638h(copyOf, "copyOf(this, newSize)");
        C12775o.m28637g(copyOf, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.builders.ListBuilderKt.copyOfUninitializedElements>");
        return copyOf;
    }

    /* renamed from: f */
    public static final <E> void m25957f(E[] eArr, int i) {
        C12775o.m28639i(eArr, "<this>");
        eArr[i] = null;
    }

    /* renamed from: g */
    public static final <E> void m25958g(E[] eArr, int i, int i2) {
        C12775o.m28639i(eArr, "<this>");
        while (i < i2) {
            m25957f(eArr, i);
            i++;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: h */
    public static final <T> boolean m25959h(T[] tArr, int i, int i2, List<?> list) {
        if (i2 != list.size()) {
            return false;
        }
        for (int i3 = 0; i3 < i2; i3++) {
            if (!C12775o.m28634d(tArr[i + i3], list.get(i3))) {
                return false;
            }
        }
        return true;
    }

    /* access modifiers changed from: private */
    /* renamed from: i */
    public static final <T> int m25960i(T[] tArr, int i, int i2) {
        int i3;
        int i4 = 1;
        for (int i5 = 0; i5 < i2; i5++) {
            T t = tArr[i + i5];
            int i6 = i4 * 31;
            if (t != null) {
                i3 = t.hashCode();
            } else {
                i3 = 0;
            }
            i4 = i6 + i3;
        }
        return i4;
    }

    /* access modifiers changed from: private */
    /* renamed from: j */
    public static final <T> String m25961j(T[] tArr, int i, int i2) {
        StringBuilder sb = new StringBuilder((i2 * 3) + 2);
        sb.append("[");
        for (int i3 = 0; i3 < i2; i3++) {
            if (i3 > 0) {
                sb.append(", ");
            }
            sb.append(tArr[i + i3]);
        }
        sb.append("]");
        String sb2 = sb.toString();
        C12775o.m28638h(sb2, "sb.toString()");
        return sb2;
    }
}
