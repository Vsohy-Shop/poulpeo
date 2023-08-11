package androidx.compose.runtime.collection;

import androidx.compose.runtime.ActualJvm_jvmKt;
import com.rmn.api.p322v2.cloud.general.CloudMethodReturns;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12761g;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.SourceDebugExtension;
import p336ef.C11921v;
import p412pf.C13212a;

@SourceDebugExtension({"SMAP\nIdentityArraySet.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IdentityArraySet.kt\nandroidx/compose/runtime/collection/IdentityArraySet\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,244:1\n1726#2,3:245\n*S KotlinDebug\n*F\n+ 1 IdentityArraySet.kt\nandroidx/compose/runtime/collection/IdentityArraySet\n*L\n232#1:245,3\n*E\n"})
/* compiled from: IdentityArraySet.kt */
public final class IdentityArraySet<T> implements Set<T>, C13212a {
    private int size;
    private Object[] values = new Object[16];

    private final void checkIndexBounds(int i) {
        boolean z = false;
        if (i >= 0 && i < size()) {
            z = true;
        }
        if (!z) {
            throw new IndexOutOfBoundsException("Index " + i + ", size " + size());
        }
    }

    private final int find(Object obj) {
        int size2 = size() - 1;
        int identityHashCode = ActualJvm_jvmKt.identityHashCode(obj);
        int i = 0;
        while (i <= size2) {
            int i2 = (i + size2) >>> 1;
            Object obj2 = get(i2);
            int identityHashCode2 = ActualJvm_jvmKt.identityHashCode(obj2);
            if (identityHashCode2 < identityHashCode) {
                i = i2 + 1;
            } else if (identityHashCode2 > identityHashCode) {
                size2 = i2 - 1;
            } else if (obj2 == obj) {
                return i2;
            } else {
                return findExactIndex(i2, obj, identityHashCode);
            }
        }
        return -(i + 1);
    }

    private final int findExactIndex(int i, Object obj, int i2) {
        for (int i3 = i - 1; -1 < i3; i3--) {
            Object obj2 = this.values[i3];
            if (obj2 == obj) {
                return i3;
            }
            if (ActualJvm_jvmKt.identityHashCode(obj2) != i2) {
                break;
            }
        }
        int i4 = i + 1;
        int size2 = size();
        while (true) {
            if (i4 >= size2) {
                i4 = size();
                break;
            }
            Object obj3 = this.values[i4];
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

    public final boolean add(T t) {
        int i;
        C12775o.m28639i(t, "value");
        if (size() > 0) {
            i = find(t);
            if (i >= 0) {
                return false;
            }
        } else {
            i = -1;
        }
        int i2 = -(i + 1);
        int size2 = size();
        Object[] objArr = this.values;
        if (size2 == objArr.length) {
            Object[] objArr2 = new Object[(objArr.length * 2)];
            Object[] unused = C12708o.m28342i(objArr, objArr2, i2 + 1, i2, size());
            Object[] unused2 = C12708o.m28346m(this.values, objArr2, 0, 0, i2, 6, (Object) null);
            this.values = objArr2;
        } else {
            Object[] unused3 = C12708o.m28342i(objArr, objArr, i2 + 1, i2, size());
        }
        this.values[i2] = t;
        setSize(size() + 1);
        return true;
    }

    public boolean addAll(Collection<? extends T> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final void clear() {
        C12708o.m28355v(this.values, (Object) null, 0, 0, 6, (Object) null);
        setSize(0);
    }

    public boolean contains(Object obj) {
        if (obj != null && find(obj) >= 0) {
            return true;
        }
        return false;
    }

    public boolean containsAll(Collection<? extends Object> collection) {
        C12775o.m28639i(collection, "elements");
        Iterable<Object> iterable = collection;
        if (((Collection) iterable).isEmpty()) {
            return true;
        }
        for (Object contains : iterable) {
            if (!contains(contains)) {
                return false;
            }
        }
        return true;
    }

    public final void fastForEach(Function1<? super T, C11921v> function1) {
        C12775o.m28639i(function1, "block");
        int size2 = size();
        for (int i = 0; i < size2; i++) {
            function1.invoke(get(i));
        }
    }

    public final T get(int i) {
        checkIndexBounds(i);
        T t = this.values[i];
        C12775o.m28637g(t, "null cannot be cast to non-null type T of androidx.compose.runtime.collection.IdentityArraySet");
        return t;
    }

    public int getSize() {
        return this.size;
    }

    public final Object[] getValues() {
        return this.values;
    }

    public boolean isEmpty() {
        if (size() == 0) {
            return true;
        }
        return false;
    }

    public final boolean isNotEmpty() {
        if (size() > 0) {
            return true;
        }
        return false;
    }

    public Iterator<T> iterator() {
        return new IdentityArraySet$iterator$1(this);
    }

    public final boolean remove(T t) {
        int find;
        if (t == null || (find = find(t)) < 0) {
            return false;
        }
        if (find < size() - 1) {
            Object[] objArr = this.values;
            Object[] unused = C12708o.m28342i(objArr, objArr, find, find + 1, size());
        }
        setSize(size() - 1);
        this.values[size()] = null;
        return true;
    }

    public boolean removeAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final void removeValueIf(Function1<? super T, Boolean> function1) {
        C12775o.m28639i(function1, "predicate");
        int size2 = size();
        int i = 0;
        for (int i2 = 0; i2 < size2; i2++) {
            Object obj = getValues()[i2];
            C12775o.m28637g(obj, "null cannot be cast to non-null type T of androidx.compose.runtime.collection.IdentityArraySet");
            if (!function1.invoke(obj).booleanValue()) {
                if (i != i2) {
                    getValues()[i] = obj;
                }
                i++;
            }
        }
        int size3 = size();
        for (int i3 = i; i3 < size3; i3++) {
            getValues()[i3] = null;
        }
        setSize(i);
    }

    public boolean retainAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public void setSize(int i) {
        this.size = i;
    }

    public final void setValues(Object[] objArr) {
        C12775o.m28639i(objArr, "<set-?>");
        this.values = objArr;
    }

    public final /* bridge */ int size() {
        return getSize();
    }

    public Object[] toArray() {
        return C12761g.m28583a(this);
    }

    public <T> T[] toArray(T[] tArr) {
        C12775o.m28639i(tArr, CloudMethodReturns.RETURN_KEYNAME_ARRAY);
        return C12761g.m28584b(this, tArr);
    }

    public static /* synthetic */ void getValues$annotations() {
    }
}
