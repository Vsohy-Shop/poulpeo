package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet;

import androidx.compose.runtime.external.kotlinx.collections.immutable.internal.CommonFunctionsKt;
import kotlin.jvm.functions.Function1;

/* compiled from: TrieNode.kt */
public final class TrieNodeKt {
    public static final int LOG_MAX_BRANCHING_FACTOR = 5;
    public static final int MAX_BRANCHING_FACTOR = 32;
    public static final int MAX_BRANCHING_FACTOR_MINUS_ONE = 31;
    public static final int MAX_SHIFT = 30;

    /* access modifiers changed from: private */
    public static final <E> Object[] addElementAtIndex(Object[] objArr, int i, E e) {
        Object[] objArr2 = new Object[(objArr.length + 1)];
        Object[] unused = C12708o.m28346m(objArr, objArr2, 0, 0, i, 6, (Object) null);
        Object[] unused2 = C12708o.m28342i(objArr, objArr2, i + 1, i, objArr.length);
        objArr2[i] = e;
        return objArr2;
    }

    private static final int filterTo(Object[] objArr, Object[] objArr2, int i, Function1<Object, Boolean> function1) {
        boolean z;
        int i2 = 0;
        for (int i3 = 0; i3 < objArr.length; i3++) {
            boolean z2 = true;
            if (i2 <= i3) {
                z = true;
            } else {
                z = false;
            }
            CommonFunctionsKt.m35307assert(z);
            if (function1.invoke(objArr[i3]).booleanValue()) {
                objArr2[i + i2] = objArr[i3];
                i2++;
                if (i + i2 > objArr2.length) {
                    z2 = false;
                }
                CommonFunctionsKt.m35307assert(z2);
            }
        }
        return i2;
    }

    static /* synthetic */ int filterTo$default(Object[] objArr, Object[] objArr2, int i, Function1 function1, int i2, Object obj) {
        boolean z;
        if ((i2 & 2) != 0) {
            i = 0;
        }
        if ((i2 & 4) != 0) {
            function1 = TrieNodeKt$filterTo$1.INSTANCE;
        }
        int i3 = 0;
        for (int i4 = 0; i4 < objArr.length; i4++) {
            boolean z2 = true;
            if (i3 <= i4) {
                z = true;
            } else {
                z = false;
            }
            CommonFunctionsKt.m35307assert(z);
            if (((Boolean) function1.invoke(objArr[i4])).booleanValue()) {
                objArr2[i + i3] = objArr[i4];
                i3++;
                if (i + i3 > objArr2.length) {
                    z2 = false;
                }
                CommonFunctionsKt.m35307assert(z2);
            }
        }
        return i3;
    }

    public static final int indexSegment(int i, int i2) {
        return (i >> i2) & 31;
    }

    /* access modifiers changed from: private */
    public static final Object[] removeCellAtIndex(Object[] objArr, int i) {
        Object[] objArr2 = new Object[(objArr.length - 1)];
        Object[] unused = C12708o.m28346m(objArr, objArr2, 0, 0, i, 6, (Object) null);
        Object[] unused2 = C12708o.m28342i(objArr, objArr2, i, i + 1, objArr.length);
        return objArr2;
    }
}
