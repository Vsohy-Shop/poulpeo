package com.google.android.gms.internal.cast;

import com.google.android.gms.cast.framework.media.MediaIntentReceiver;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* renamed from: com.google.android.gms.internal.cast.z0 */
/* compiled from: com.google.android.gms:play-services-cast@@21.2.0 */
public abstract class C5240z0 extends C5172v0 implements List, RandomAccess {

    /* renamed from: c */
    private static final C5105r1 f5614c = new C5206x0(C4918g1.f5227f, 0);

    C5240z0() {
    }

    /* renamed from: s */
    public static C5189w0 m7710s() {
        return new C5189w0(4);
    }

    /* renamed from: t */
    static C5240z0 m7711t(Object[] objArr) {
        return m7712u(objArr, objArr.length);
    }

    /* renamed from: u */
    static C5240z0 m7712u(Object[] objArr, int i) {
        if (i == 0) {
            return C4918g1.f5227f;
        }
        return new C4918g1(objArr, i);
    }

    /* renamed from: v */
    public static C5240z0 m7713v(Object obj) {
        Object[] objArr = {obj};
        C4901f1.m6969b(objArr, 1);
        return m7712u(objArr, 1);
    }

    /* renamed from: z */
    public static C5240z0 m7714z(Object obj, Object obj2) {
        Object[] objArr = {MediaIntentReceiver.ACTION_TOGGLE_PLAYBACK, MediaIntentReceiver.ACTION_STOP_CASTING};
        C4901f1.m6969b(objArr, 2);
        return m7712u(objArr, 2);
    }

    /* renamed from: A */
    public final C5105r1 listIterator(int i) {
        C5053o0.m7295b(i, size(), "index");
        if (isEmpty()) {
            return f5614c;
        }
        return new C5206x0(this, i);
    }

    @Deprecated
    public final void add(int i, Object obj) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final boolean addAll(int i, Collection collection) {
        throw new UnsupportedOperationException();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public int mo32793b(Object[] objArr, int i) {
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            objArr[i2] = get(i2);
        }
        return size;
    }

    public final boolean contains(Object obj) {
        if (indexOf(obj) >= 0) {
            return true;
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof List) {
            List list = (List) obj;
            int size = size();
            if (size == list.size()) {
                if (list instanceof RandomAccess) {
                    int i = 0;
                    while (i < size) {
                        if (C5036n0.m7245a(get(i), list.get(i))) {
                            i++;
                        }
                    }
                    return true;
                }
                Iterator it = iterator();
                Iterator it2 = list.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (it2.hasNext()) {
                            if (!C5036n0.m7245a(it.next(), it2.next())) {
                                break;
                            }
                        } else {
                            break;
                        }
                    } else if (!it2.hasNext()) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int size = size();
        int i = 1;
        for (int i2 = 0; i2 < size; i2++) {
            i = (i * 31) + get(i2).hashCode();
        }
        return i;
    }

    public final int indexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        int size = size();
        for (int i = 0; i < size; i++) {
            if (obj.equals(get(i))) {
                return i;
            }
        }
        return -1;
    }

    public final /* synthetic */ Iterator iterator() {
        return listIterator(0);
    }

    public final int lastIndexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        for (int size = size() - 1; size >= 0; size--) {
            if (obj.equals(get(size))) {
                return size;
            }
        }
        return -1;
    }

    public final /* synthetic */ ListIterator listIterator() {
        return listIterator(0);
    }

    /* renamed from: r */
    public C5240z0 subList(int i, int i2) {
        C5053o0.m7296c(i, i2, size());
        int i3 = i2 - i;
        if (i3 == size()) {
            return this;
        }
        if (i3 == 0) {
            return C4918g1.f5227f;
        }
        return new C5223y0(this, i, i3);
    }

    @Deprecated
    public final Object remove(int i) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final Object set(int i, Object obj) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    /* renamed from: k */
    public final C5240z0 mo32723k() {
        return this;
    }
}
