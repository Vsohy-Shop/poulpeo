package androidx.compose.runtime.collection;

import androidx.compose.runtime.ActualJvm_jvmKt;
import kotlin.jvm.internal.C12775o;
import p336ef.C11921v;
import p404of.C13088o;

/* compiled from: IdentityArrayIntMap.kt */
public final class IdentityArrayIntMap {
    private Object[] keys = new Object[4];
    private int size;
    private int[] values = new int[4];

    private final int find(Object obj) {
        int i = this.size - 1;
        int identityHashCode = ActualJvm_jvmKt.identityHashCode(obj);
        int i2 = 0;
        while (i2 <= i) {
            int i3 = (i2 + i) >>> 1;
            Object obj2 = this.keys[i3];
            int identityHashCode2 = ActualJvm_jvmKt.identityHashCode(obj2);
            if (identityHashCode2 < identityHashCode) {
                i2 = i3 + 1;
            } else if (identityHashCode2 > identityHashCode) {
                i = i3 - 1;
            } else if (obj2 == obj) {
                return i3;
            } else {
                return findExactIndex(i3, obj, identityHashCode);
            }
        }
        return -(i2 + 1);
    }

    private final int findExactIndex(int i, Object obj, int i2) {
        for (int i3 = i - 1; -1 < i3; i3--) {
            Object obj2 = this.keys[i3];
            if (obj2 == obj) {
                return i3;
            }
            if (ActualJvm_jvmKt.identityHashCode(obj2) != i2) {
                break;
            }
        }
        int i4 = i + 1;
        int i5 = this.size;
        while (true) {
            if (i4 >= i5) {
                i4 = this.size;
                break;
            }
            Object obj3 = this.keys[i4];
            if (obj3 == obj) {
                return i4;
            }
            if (ActualJvm_jvmKt.identityHashCode(obj3) != i2) {
                break;
            }
            i4++;
        }
        return -(i4 + 1);
    }

    public final int add(Object obj, int i) {
        int i2;
        C12775o.m28639i(obj, "key");
        if (this.size > 0) {
            i2 = find(obj);
            if (i2 >= 0) {
                int[] iArr = this.values;
                int i3 = iArr[i2];
                iArr[i2] = i;
                return i3;
            }
        } else {
            i2 = -1;
        }
        int i4 = -(i2 + 1);
        int i5 = this.size;
        Object[] objArr = this.keys;
        if (i5 == objArr.length) {
            Object[] objArr2 = new Object[(objArr.length * 2)];
            int[] iArr2 = new int[(objArr.length * 2)];
            int i6 = i4 + 1;
            Object[] unused = C12708o.m28342i(objArr, objArr2, i6, i4, i5);
            int[] unused2 = C12708o.m28340g(this.values, iArr2, i6, i4, this.size);
            int i7 = i4;
            Object[] unused3 = C12708o.m28346m(this.keys, objArr2, 0, 0, i7, 6, (Object) null);
            int[] unused4 = C12708o.m28345l(this.values, iArr2, 0, 0, i7, 6, (Object) null);
            this.keys = objArr2;
            this.values = iArr2;
        } else {
            int i8 = i4 + 1;
            Object[] unused5 = C12708o.m28342i(objArr, objArr, i8, i4, i5);
            int[] iArr3 = this.values;
            int[] unused6 = C12708o.m28340g(iArr3, iArr3, i8, i4, this.size);
        }
        this.keys[i4] = obj;
        this.values[i4] = i;
        this.size++;
        return -1;
    }

    public final boolean any(C13088o<Object, ? super Integer, Boolean> oVar) {
        C12775o.m28639i(oVar, "predicate");
        int size2 = getSize();
        for (int i = 0; i < size2; i++) {
            Object obj = getKeys()[i];
            C12775o.m28637g(obj, "null cannot be cast to non-null type kotlin.Any");
            if (oVar.invoke(obj, Integer.valueOf(getValues()[i])).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    public final void forEach(C13088o<Object, ? super Integer, C11921v> oVar) {
        C12775o.m28639i(oVar, "block");
        int size2 = getSize();
        for (int i = 0; i < size2; i++) {
            Object obj = getKeys()[i];
            C12775o.m28637g(obj, "null cannot be cast to non-null type kotlin.Any");
            oVar.invoke(obj, Integer.valueOf(getValues()[i]));
        }
    }

    public final int get(Object obj) {
        C12775o.m28639i(obj, "key");
        int find = find(obj);
        if (find >= 0) {
            return this.values[find];
        }
        throw new IllegalStateException("Key not found".toString());
    }

    public final Object[] getKeys() {
        return this.keys;
    }

    public final int getSize() {
        return this.size;
    }

    public final int[] getValues() {
        return this.values;
    }

    public final boolean remove(Object obj) {
        C12775o.m28639i(obj, "key");
        int find = find(obj);
        if (find < 0) {
            return false;
        }
        int i = this.size;
        if (find < i - 1) {
            Object[] objArr = this.keys;
            int i2 = find + 1;
            Object[] unused = C12708o.m28342i(objArr, objArr, find, i2, i);
            int[] iArr = this.values;
            int[] unused2 = C12708o.m28340g(iArr, iArr, find, i2, this.size);
        }
        int i3 = this.size - 1;
        this.size = i3;
        this.keys[i3] = null;
        return true;
    }

    public final void removeValueIf(C13088o<Object, ? super Integer, Boolean> oVar) {
        C12775o.m28639i(oVar, "predicate");
        int size2 = getSize();
        int i = 0;
        for (int i2 = 0; i2 < size2; i2++) {
            Object obj = getKeys()[i2];
            C12775o.m28637g(obj, "null cannot be cast to non-null type kotlin.Any");
            int i3 = getValues()[i2];
            if (!oVar.invoke(obj, Integer.valueOf(i3)).booleanValue()) {
                if (i != i2) {
                    getKeys()[i] = obj;
                    getValues()[i] = i3;
                }
                i++;
            }
        }
        int size3 = getSize();
        for (int i4 = i; i4 < size3; i4++) {
            getKeys()[i4] = null;
        }
        setSize(i);
    }

    public final void setKeys(Object[] objArr) {
        C12775o.m28639i(objArr, "<set-?>");
        this.keys = objArr;
    }

    public final void setSize(int i) {
        this.size = i;
    }

    public final void setValues(int[] iArr) {
        C12775o.m28639i(iArr, "<set-?>");
        this.values = iArr;
    }

    public static /* synthetic */ void getKeys$annotations() {
    }

    public static /* synthetic */ void getSize$annotations() {
    }

    public static /* synthetic */ void getValues$annotations() {
    }
}
