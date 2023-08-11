package androidx.compose.runtime.collection;

import androidx.compose.runtime.ActualJvm_jvmKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import p336ef.C11921v;
import p404of.C13088o;

@SourceDebugExtension({"SMAP\nIdentityArrayMap.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IdentityArrayMap.kt\nandroidx/compose/runtime/collection/IdentityArrayMap\n*L\n1#1,208:1\n118#1,22:209\n*S KotlinDebug\n*F\n+ 1 IdentityArrayMap.kt\nandroidx/compose/runtime/collection/IdentityArrayMap\n*L\n142#1:209,22\n*E\n"})
/* compiled from: IdentityArrayMap.kt */
public final class IdentityArrayMap<Key, Value> {
    private Object[] keys;
    private int size;
    private Object[] values;

    public IdentityArrayMap() {
        this(0, 1, (DefaultConstructorMarker) null);
    }

    private final int find(Object obj) {
        int identityHashCode = ActualJvm_jvmKt.identityHashCode(obj);
        int i = this.size - 1;
        int i2 = 0;
        while (i2 <= i) {
            int i3 = (i2 + i) >>> 1;
            Object obj2 = this.keys[i3];
            int identityHashCode2 = ActualJvm_jvmKt.identityHashCode(obj2);
            if (identityHashCode2 < identityHashCode) {
                i2 = i3 + 1;
            } else if (identityHashCode2 > identityHashCode) {
                i = i3 - 1;
            } else if (obj == obj2) {
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

    public final void clear() {
        this.size = 0;
        C12708o.m28355v(this.keys, (Object) null, 0, 0, 6, (Object) null);
        C12708o.m28355v(this.values, (Object) null, 0, 0, 6, (Object) null);
    }

    public final boolean contains(Key key) {
        C12775o.m28639i(key, "key");
        if (find(key) >= 0) {
            return true;
        }
        return false;
    }

    public final void forEach(C13088o<? super Key, ? super Value, C11921v> oVar) {
        C12775o.m28639i(oVar, "block");
        int size$runtime_release = getSize$runtime_release();
        for (int i = 0; i < size$runtime_release; i++) {
            Object obj = getKeys$runtime_release()[i];
            C12775o.m28637g(obj, "null cannot be cast to non-null type Key of androidx.compose.runtime.collection.IdentityArrayMap");
            oVar.invoke(obj, getValues$runtime_release()[i]);
        }
    }

    public final Value get(Key key) {
        C12775o.m28639i(key, "key");
        int find = find(key);
        if (find >= 0) {
            return this.values[find];
        }
        return null;
    }

    public final Object[] getKeys$runtime_release() {
        return this.keys;
    }

    public final int getSize$runtime_release() {
        return this.size;
    }

    public final Object[] getValues$runtime_release() {
        return this.values;
    }

    public final boolean isEmpty() {
        if (this.size == 0) {
            return true;
        }
        return false;
    }

    public final boolean isNotEmpty() {
        if (this.size > 0) {
            return true;
        }
        return false;
    }

    public final Value remove(Key key) {
        C12775o.m28639i(key, "key");
        int find = find(key);
        if (find < 0) {
            return null;
        }
        Value[] valueArr = this.values;
        Value value = valueArr[find];
        int i = this.size;
        Object[] objArr = this.keys;
        int i2 = find + 1;
        Object[] unused = C12708o.m28342i(objArr, objArr, find, i2, i);
        Object[] unused2 = C12708o.m28342i(valueArr, valueArr, find, i2, i);
        int i3 = i - 1;
        objArr[i3] = null;
        valueArr[i3] = null;
        this.size = i3;
        return value;
    }

    public final void removeIf(C13088o<? super Key, ? super Value, Boolean> oVar) {
        C12775o.m28639i(oVar, "block");
        int size$runtime_release = getSize$runtime_release();
        int i = 0;
        for (int i2 = 0; i2 < size$runtime_release; i2++) {
            Object obj = getKeys$runtime_release()[i2];
            C12775o.m28637g(obj, "null cannot be cast to non-null type Key of androidx.compose.runtime.collection.IdentityArrayMap");
            if (!oVar.invoke(obj, getValues$runtime_release()[i2]).booleanValue()) {
                if (i != i2) {
                    getKeys$runtime_release()[i] = obj;
                    getValues$runtime_release()[i] = getValues$runtime_release()[i2];
                }
                i++;
            }
        }
        if (getSize$runtime_release() > i) {
            int size$runtime_release2 = getSize$runtime_release();
            for (int i3 = i; i3 < size$runtime_release2; i3++) {
                getKeys$runtime_release()[i3] = null;
                getValues$runtime_release()[i3] = null;
            }
            setSize$runtime_release(i);
        }
    }

    public final void removeValueIf(Function1<? super Value, Boolean> function1) {
        C12775o.m28639i(function1, "block");
        int size$runtime_release = getSize$runtime_release();
        int i = 0;
        for (int i2 = 0; i2 < size$runtime_release; i2++) {
            Object obj = getKeys$runtime_release()[i2];
            C12775o.m28637g(obj, "null cannot be cast to non-null type Key of androidx.compose.runtime.collection.IdentityArrayMap");
            if (!function1.invoke(getValues$runtime_release()[i2]).booleanValue()) {
                if (i != i2) {
                    getKeys$runtime_release()[i] = obj;
                    getValues$runtime_release()[i] = getValues$runtime_release()[i2];
                }
                i++;
            }
        }
        if (getSize$runtime_release() > i) {
            int size$runtime_release2 = getSize$runtime_release();
            for (int i3 = i; i3 < size$runtime_release2; i3++) {
                getKeys$runtime_release()[i3] = null;
                getValues$runtime_release()[i3] = null;
            }
            setSize$runtime_release(i);
        }
    }

    public final void set(Key key, Value value) {
        boolean z;
        Object[] objArr;
        Object[] objArr2;
        C12775o.m28639i(key, "key");
        int find = find(key);
        if (find >= 0) {
            this.values[find] = value;
            return;
        }
        int i = -(find + 1);
        int i2 = this.size;
        Object[] objArr3 = this.keys;
        if (i2 == objArr3.length) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            objArr = new Object[(i2 * 2)];
        } else {
            objArr = objArr3;
        }
        int i3 = i + 1;
        Object[] unused = C12708o.m28342i(objArr3, objArr, i3, i, i2);
        if (z) {
            Object[] unused2 = C12708o.m28346m(this.keys, objArr, 0, 0, i, 6, (Object) null);
        }
        objArr[i] = key;
        this.keys = objArr;
        if (z) {
            objArr2 = new Object[(this.size * 2)];
        } else {
            objArr2 = this.values;
        }
        Object[] unused3 = C12708o.m28342i(this.values, objArr2, i3, i, this.size);
        if (z) {
            Object[] unused4 = C12708o.m28346m(this.values, objArr2, 0, 0, i, 6, (Object) null);
        }
        objArr2[i] = value;
        this.values = objArr2;
        this.size++;
    }

    public final void setKeys$runtime_release(Object[] objArr) {
        C12775o.m28639i(objArr, "<set-?>");
        this.keys = objArr;
    }

    public final void setSize$runtime_release(int i) {
        this.size = i;
    }

    public final void setValues$runtime_release(Object[] objArr) {
        C12775o.m28639i(objArr, "<set-?>");
        this.values = objArr;
    }

    public IdentityArrayMap(int i) {
        this.keys = new Object[i];
        this.values = new Object[i];
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ IdentityArrayMap(int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 16 : i);
    }
}
