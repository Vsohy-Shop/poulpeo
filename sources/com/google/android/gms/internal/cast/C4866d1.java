package com.google.android.gms.internal.cast;

import androidx.constraintlayout.core.widgets.analyzer.BasicMeasure;
import java.util.Arrays;
import java.util.Collection;
import java.util.Set;

/* renamed from: com.google.android.gms.internal.cast.d1 */
/* compiled from: com.google.android.gms:play-services-cast@@21.2.0 */
public abstract class C4866d1 extends C5172v0 implements Set {

    /* renamed from: c */
    private transient C5240z0 f5186c;

    C4866d1() {
    }

    /* renamed from: A */
    private static C4866d1 m6887A(int i, Object... objArr) {
        if (i == 0) {
            return C5037n1.f5386j;
        }
        if (i != 1) {
            int s = m6888s(i);
            Object[] objArr2 = new Object[s];
            int i2 = s - 1;
            int i3 = 0;
            int i4 = 0;
            for (int i5 = 0; i5 < i; i5++) {
                Object obj = objArr[i5];
                C4901f1.m6968a(obj, i5);
                int hashCode = obj.hashCode();
                int a = C5121s0.m7441a(hashCode);
                while (true) {
                    int i6 = a & i2;
                    Object obj2 = objArr2[i6];
                    if (obj2 == null) {
                        objArr[i4] = obj;
                        objArr2[i6] = obj;
                        i3 += hashCode;
                        i4++;
                        break;
                    } else if (obj2.equals(obj)) {
                        break;
                    } else {
                        a++;
                    }
                }
            }
            Arrays.fill(objArr, i4, i, (Object) null);
            if (i4 == 1) {
                Object obj3 = objArr[0];
                obj3.getClass();
                return new C5071p1(obj3);
            } else if (m6888s(i4) < s / 2) {
                return m6887A(i4, objArr);
            } else {
                int length = objArr.length;
                if (i4 < (length >> 1) + (length >> 2)) {
                    objArr = Arrays.copyOf(objArr, i4);
                }
                return new C5037n1(objArr, i3, objArr2, i2, i4);
            }
        } else {
            Object obj4 = objArr[0];
            obj4.getClass();
            return new C5071p1(obj4);
        }
    }

    /* renamed from: s */
    static int m6888s(int i) {
        int max = Math.max(i, 2);
        if (max < 751619276) {
            int highestOneBit = Integer.highestOneBit(max - 1);
            do {
                highestOneBit += highestOneBit;
            } while (((double) highestOneBit) * 0.7d < ((double) max));
            return highestOneBit;
        } else if (max < 1073741824) {
            return BasicMeasure.EXACTLY;
        } else {
            throw new IllegalArgumentException("collection too large");
        }
    }

    /* renamed from: u */
    public static C4866d1 m6889u(Collection collection) {
        Object[] array = collection.toArray();
        return m6887A(array.length, array);
    }

    /* renamed from: v */
    public static C4866d1 m6890v() {
        return C5037n1.f5386j;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof C4866d1) && mo32726z() && ((C4866d1) obj).mo32726z() && hashCode() != obj.hashCode()) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (obj instanceof Set) {
            Set set = (Set) obj;
            try {
                if (size() == set.size() && containsAll(set)) {
                    return true;
                }
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    public int hashCode() {
        return C5054o1.m7298a(this);
    }

    /* renamed from: k */
    public C5240z0 mo32723k() {
        C5240z0 z0Var = this.f5186c;
        if (z0Var != null) {
            return z0Var;
        }
        C5240z0 t = mo32725t();
        this.f5186c = t;
        return t;
    }

    /* renamed from: r */
    public abstract C5088q1 iterator();

    /* access modifiers changed from: package-private */
    /* renamed from: t */
    public C5240z0 mo32725t() {
        return C5240z0.m7711t(toArray());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: z */
    public boolean mo32726z() {
        return false;
    }
}
