package kotlin.collections;

import java.lang.reflect.Array;
import kotlin.jvm.internal.C12775o;

/* renamed from: kotlin.collections.m */
/* compiled from: ArraysJVM.kt */
class C12704m {
    /* renamed from: a */
    public static final <T> T[] m28331a(T[] tArr, int i) {
        C12775o.m28639i(tArr, "reference");
        Object newInstance = Array.newInstance(tArr.getClass().getComponentType(), i);
        C12775o.m28637g(newInstance, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.arrayOfNulls>");
        return (Object[]) newInstance;
    }

    /* renamed from: b */
    public static final void m28332b(int i, int i2) {
        if (i > i2) {
            throw new IndexOutOfBoundsException("toIndex (" + i + ") is greater than size (" + i2 + ").");
        }
    }
}
