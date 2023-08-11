package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap;

import java.util.Arrays;
import kotlin.jvm.internal.C12775o;

/* compiled from: TrieNode.kt */
public final class TrieNodeKt {
    public static final int ENTRY_SIZE = 2;
    public static final int LOG_MAX_BRANCHING_FACTOR = 5;
    public static final int MAX_BRANCHING_FACTOR = 32;
    public static final int MAX_BRANCHING_FACTOR_MINUS_ONE = 31;
    public static final int MAX_SHIFT = 30;

    public static final int indexSegment(int i, int i2) {
        return (i >> i2) & 31;
    }

    /* access modifiers changed from: private */
    public static final <K, V> Object[] insertEntryAtIndex(Object[] objArr, int i, K k, V v) {
        Object[] objArr2 = new Object[(objArr.length + 2)];
        Object[] unused = C12708o.m28346m(objArr, objArr2, 0, 0, i, 6, (Object) null);
        Object[] unused2 = C12708o.m28342i(objArr, objArr2, i + 2, i, objArr.length);
        objArr2[i] = k;
        objArr2[i + 1] = v;
        return objArr2;
    }

    /* access modifiers changed from: private */
    public static final Object[] removeEntryAtIndex(Object[] objArr, int i) {
        Object[] objArr2 = new Object[(objArr.length - 2)];
        Object[] unused = C12708o.m28346m(objArr, objArr2, 0, 0, i, 6, (Object) null);
        Object[] unused2 = C12708o.m28342i(objArr, objArr2, i, i + 2, objArr.length);
        return objArr2;
    }

    /* access modifiers changed from: private */
    public static final Object[] removeNodeAtIndex(Object[] objArr, int i) {
        Object[] objArr2 = new Object[(objArr.length - 1)];
        Object[] unused = C12708o.m28346m(objArr, objArr2, 0, 0, i, 6, (Object) null);
        Object[] unused2 = C12708o.m28342i(objArr, objArr2, i, i + 1, objArr.length);
        return objArr2;
    }

    /* access modifiers changed from: private */
    public static final Object[] replaceEntryWithNode(Object[] objArr, int i, int i2, TrieNode<?, ?> trieNode) {
        int i3 = i2 - 2;
        Object[] objArr2 = new Object[((objArr.length - 2) + 1)];
        Object[] unused = C12708o.m28346m(objArr, objArr2, 0, 0, i, 6, (Object) null);
        Object[] unused2 = C12708o.m28342i(objArr, objArr2, i, i + 2, i2);
        objArr2[i3] = trieNode;
        Object[] unused3 = C12708o.m28342i(objArr, objArr2, i3 + 1, i2, objArr.length);
        return objArr2;
    }

    /* access modifiers changed from: private */
    public static final <K, V> Object[] replaceNodeWithEntry(Object[] objArr, int i, int i2, K k, V v) {
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length + 1);
        C12775o.m28638h(copyOf, "copyOf(this, newSize)");
        Object[] unused = C12708o.m28342i(copyOf, copyOf, i + 2, i + 1, objArr.length);
        Object[] unused2 = C12708o.m28342i(copyOf, copyOf, i2 + 2, i2, i);
        copyOf[i2] = k;
        copyOf[i2 + 1] = v;
        return copyOf;
    }
}
