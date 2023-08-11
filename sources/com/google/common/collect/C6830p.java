package com.google.common.collect;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import p111h6.C8007k;
import p111h6.C8012n;

/* renamed from: com.google.common.collect.p */
/* compiled from: Lists */
public final class C6830p {
    /* renamed from: a */
    static boolean m11682a(List<?> list, Object obj) {
        if (obj == C8012n.m15755n(list)) {
            return true;
        }
        if (!(obj instanceof List)) {
            return false;
        }
        List list2 = (List) obj;
        int size = list.size();
        if (size != list2.size()) {
            return false;
        }
        if (!(list instanceof RandomAccess) || !(list2 instanceof RandomAccess)) {
            return C6828o.m11680b(list.iterator(), list2.iterator());
        }
        for (int i = 0; i < size; i++) {
            if (!C8007k.m15735a(list.get(i), list2.get(i))) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: b */
    static int m11683b(List<?> list, Object obj) {
        if (list instanceof RandomAccess) {
            return m11684c(list, obj);
        }
        ListIterator<?> listIterator = list.listIterator();
        while (listIterator.hasNext()) {
            if (C8007k.m15735a(obj, listIterator.next())) {
                return listIterator.previousIndex();
            }
        }
        return -1;
    }

    /* renamed from: c */
    private static int m11684c(List<?> list, Object obj) {
        int size = list.size();
        int i = 0;
        if (obj == null) {
            while (i < size) {
                if (list.get(i) == null) {
                    return i;
                }
                i++;
            }
            return -1;
        }
        while (i < size) {
            if (obj.equals(list.get(i))) {
                return i;
            }
            i++;
        }
        return -1;
    }

    /* renamed from: d */
    static int m11685d(List<?> list, Object obj) {
        if (list instanceof RandomAccess) {
            return m11686e(list, obj);
        }
        ListIterator<?> listIterator = list.listIterator(list.size());
        while (listIterator.hasPrevious()) {
            if (C8007k.m15735a(obj, listIterator.previous())) {
                return listIterator.nextIndex();
            }
        }
        return -1;
    }

    /* renamed from: e */
    private static int m11686e(List<?> list, Object obj) {
        if (obj == null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                if (list.get(size) == null) {
                    return size;
                }
            }
            return -1;
        }
        for (int size2 = list.size() - 1; size2 >= 0; size2--) {
            if (obj.equals(list.get(size2))) {
                return size2;
            }
        }
        return -1;
    }

    /* renamed from: f */
    public static <E> ArrayList<E> m11687f(int i) {
        C6808d.m11617b(i, "initialArraySize");
        return new ArrayList<>(i);
    }
}
