package androidx.compose.runtime.collection;

import androidx.compose.runtime.ActualJvm_jvmKt;
import com.rmn.api.p322v2.cloud.general.CloudMethodReturns;
import java.util.Arrays;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.SourceDebugExtension;
import p336ef.C11921v;

@SourceDebugExtension({"SMAP\nIdentityScopeMap.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IdentityScopeMap.kt\nandroidx/compose/runtime/collection/IdentityScopeMap\n+ 2 IdentityArraySet.kt\nandroidx/compose/runtime/collection/IdentityArraySet\n*L\n1#1,315:1\n236#1,5:321\n241#1,17:342\n236#1,22:359\n61#1:381\n61#1:382\n61#1:383\n105#2,5:316\n146#2,16:326\n*S KotlinDebug\n*F\n+ 1 IdentityScopeMap.kt\nandroidx/compose/runtime/collection/IdentityScopeMap\n*L\n220#1:321,5\n220#1:342,17\n230#1:359,22\n270#1:381\n292#1:382\n302#1:383\n91#1:316,5\n221#1:326,16\n*E\n"})
/* compiled from: IdentityScopeMap.kt */
public final class IdentityScopeMap<T> {
    private IdentityArraySet<T>[] scopeSets;
    private int size;
    private int[] valueOrder;
    private Object[] values;

    public IdentityScopeMap() {
        int[] iArr = new int[50];
        for (int i = 0; i < 50; i++) {
            iArr[i] = i;
        }
        this.valueOrder = iArr;
        this.values = new Object[50];
        this.scopeSets = new IdentityArraySet[50];
    }

    /* access modifiers changed from: private */
    public final int find(Object obj) {
        int identityHashCode = ActualJvm_jvmKt.identityHashCode(obj);
        int i = this.size - 1;
        int i2 = 0;
        while (i2 <= i) {
            int i3 = (i2 + i) >>> 1;
            Object obj2 = this.values[this.valueOrder[i3]];
            C12775o.m28636f(obj2);
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
            Object obj2 = this.values[this.valueOrder[i3]];
            C12775o.m28636f(obj2);
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
            Object obj3 = this.values[this.valueOrder[i4]];
            C12775o.m28636f(obj3);
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

    private final IdentityArraySet<T> getOrCreateIdentitySet(Object obj) {
        int i;
        if (this.size > 0) {
            i = find(obj);
            if (i >= 0) {
                return scopeSetAt(i);
            }
        } else {
            i = -1;
        }
        int i2 = -(i + 1);
        int i3 = this.size;
        int[] iArr = this.valueOrder;
        if (i3 < iArr.length) {
            int i4 = iArr[i3];
            this.values[i4] = obj;
            IdentityArraySet<T> identityArraySet = this.scopeSets[i4];
            if (identityArraySet == null) {
                identityArraySet = new IdentityArraySet<>();
                this.scopeSets[i4] = identityArraySet;
            }
            int i5 = this.size;
            if (i2 < i5) {
                int[] iArr2 = this.valueOrder;
                int[] unused = C12708o.m28340g(iArr2, iArr2, i2 + 1, i2, i5);
            }
            this.valueOrder[i2] = i4;
            this.size++;
            return identityArraySet;
        }
        int length = iArr.length * 2;
        Object[] copyOf = Arrays.copyOf(this.scopeSets, length);
        C12775o.m28638h(copyOf, "copyOf(this, newSize)");
        this.scopeSets = (IdentityArraySet[]) copyOf;
        IdentityArraySet<T> identityArraySet2 = new IdentityArraySet<>();
        this.scopeSets[i3] = identityArraySet2;
        Object[] copyOf2 = Arrays.copyOf(this.values, length);
        C12775o.m28638h(copyOf2, "copyOf(this, newSize)");
        this.values = copyOf2;
        copyOf2[i3] = obj;
        int[] iArr3 = new int[length];
        int i6 = this.size;
        while (true) {
            i6++;
            if (i6 >= length) {
                break;
            }
            iArr3[i6] = i6;
        }
        int i7 = this.size;
        if (i2 < i7) {
            int[] unused2 = C12708o.m28340g(this.valueOrder, iArr3, i2 + 1, i2, i7);
        }
        iArr3[i2] = i3;
        if (i2 > 0) {
            int[] unused3 = C12708o.m28345l(this.valueOrder, iArr3, 0, 0, i2, 6, (Object) null);
        }
        this.valueOrder = iArr3;
        this.size++;
        return identityArraySet2;
    }

    private final void removingScopes(Function1<? super IdentityArraySet<T>, C11921v> function1) {
        int size2 = getSize();
        int i = 0;
        for (int i2 = 0; i2 < size2; i2++) {
            int i3 = getValueOrder()[i2];
            IdentityArraySet identityArraySet = getScopeSets()[i3];
            C12775o.m28636f(identityArraySet);
            function1.invoke(identityArraySet);
            if (identityArraySet.size() > 0) {
                if (i != i2) {
                    int i4 = getValueOrder()[i];
                    getValueOrder()[i] = i3;
                    getValueOrder()[i2] = i4;
                }
                i++;
            }
        }
        int size3 = getSize();
        for (int i5 = i; i5 < size3; i5++) {
            getValues()[getValueOrder()[i5]] = null;
        }
        setSize(i);
    }

    /* access modifiers changed from: private */
    public final IdentityArraySet<T> scopeSetAt(int i) {
        IdentityArraySet<T> identityArraySet = this.scopeSets[this.valueOrder[i]];
        C12775o.m28636f(identityArraySet);
        return identityArraySet;
    }

    private final Object valueAt(int i) {
        Object obj = this.values[this.valueOrder[i]];
        C12775o.m28636f(obj);
        return obj;
    }

    public final boolean add(Object obj, T t) {
        C12775o.m28639i(obj, "value");
        C12775o.m28639i(t, "scope");
        return getOrCreateIdentitySet(obj).add(t);
    }

    public final void clear() {
        int length = this.scopeSets.length;
        for (int i = 0; i < length; i++) {
            IdentityArraySet<T> identityArraySet = this.scopeSets[i];
            if (identityArraySet != null) {
                identityArraySet.clear();
            }
            this.valueOrder[i] = i;
            this.values[i] = null;
        }
        this.size = 0;
    }

    public final boolean contains(Object obj) {
        C12775o.m28639i(obj, CloudMethodReturns.RETURN_KEYNAME_ELEMENT);
        if (find(obj) >= 0) {
            return true;
        }
        return false;
    }

    public final void forEachScopeOf(Object obj, Function1<? super T, C11921v> function1) {
        C12775o.m28639i(obj, "value");
        C12775o.m28639i(function1, "block");
        int access$find = find(obj);
        if (access$find >= 0) {
            IdentityArraySet access$scopeSetAt = scopeSetAt(access$find);
            int size2 = access$scopeSetAt.size();
            for (int i = 0; i < size2; i++) {
                function1.invoke(access$scopeSetAt.get(i));
            }
        }
    }

    public final IdentityArraySet<T>[] getScopeSets() {
        return this.scopeSets;
    }

    public final int getSize() {
        return this.size;
    }

    public final int[] getValueOrder() {
        return this.valueOrder;
    }

    public final Object[] getValues() {
        return this.values;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0011, code lost:
        r1 = r4.valueOrder[r5];
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean remove(java.lang.Object r5, T r6) {
        /*
            r4 = this;
            java.lang.String r0 = "value"
            kotlin.jvm.internal.C12775o.m28639i(r5, r0)
            java.lang.String r0 = "scope"
            kotlin.jvm.internal.C12775o.m28639i(r6, r0)
            int r5 = r4.find(r5)
            r0 = 0
            if (r5 < 0) goto L_0x0043
            int[] r1 = r4.valueOrder
            r1 = r1[r5]
            androidx.compose.runtime.collection.IdentityArraySet<T>[] r2 = r4.scopeSets
            r2 = r2[r1]
            if (r2 != 0) goto L_0x001c
            return r0
        L_0x001c:
            boolean r6 = r2.remove(r6)
            int r0 = r2.size()
            if (r0 != 0) goto L_0x0042
            int r0 = r5 + 1
            int r2 = r4.size
            if (r0 >= r2) goto L_0x0031
            int[] r3 = r4.valueOrder
            int[] unused = kotlin.collections.C12708o.m28340g(r3, r3, r5, r0, r2)
        L_0x0031:
            int[] r5 = r4.valueOrder
            int r0 = r4.size
            int r2 = r0 + -1
            r5[r2] = r1
            java.lang.Object[] r5 = r4.values
            r2 = 0
            r5[r1] = r2
            int r0 = r0 + -1
            r4.size = r0
        L_0x0042:
            return r6
        L_0x0043:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.collection.IdentityScopeMap.remove(java.lang.Object, java.lang.Object):boolean");
    }

    public final void removeScope(T t) {
        C12775o.m28639i(t, "scope");
        int size2 = getSize();
        int i = 0;
        for (int i2 = 0; i2 < size2; i2++) {
            int i3 = getValueOrder()[i2];
            IdentityArraySet identityArraySet = getScopeSets()[i3];
            C12775o.m28636f(identityArraySet);
            identityArraySet.remove(t);
            if (identityArraySet.size() > 0) {
                if (i != i2) {
                    int i4 = getValueOrder()[i];
                    getValueOrder()[i] = i3;
                    getValueOrder()[i2] = i4;
                }
                i++;
            }
        }
        int size3 = getSize();
        for (int i5 = i; i5 < size3; i5++) {
            getValues()[getValueOrder()[i5]] = null;
        }
        setSize(i);
    }

    public final void removeValueIf(Function1<? super T, Boolean> function1) {
        C12775o.m28639i(function1, "predicate");
        int size2 = getSize();
        int i = 0;
        for (int i2 = 0; i2 < size2; i2++) {
            int i3 = getValueOrder()[i2];
            IdentityArraySet identityArraySet = getScopeSets()[i3];
            C12775o.m28636f(identityArraySet);
            int size3 = identityArraySet.size();
            int i4 = 0;
            for (int i5 = 0; i5 < size3; i5++) {
                Object obj = identityArraySet.getValues()[i5];
                C12775o.m28637g(obj, "null cannot be cast to non-null type T of androidx.compose.runtime.collection.IdentityArraySet");
                if (!function1.invoke(obj).booleanValue()) {
                    if (i4 != i5) {
                        identityArraySet.getValues()[i4] = obj;
                    }
                    i4++;
                }
            }
            int size4 = identityArraySet.size();
            for (int i6 = i4; i6 < size4; i6++) {
                identityArraySet.getValues()[i6] = null;
            }
            identityArraySet.setSize(i4);
            if (identityArraySet.size() > 0) {
                if (i != i2) {
                    int i7 = getValueOrder()[i];
                    getValueOrder()[i] = i3;
                    getValueOrder()[i2] = i7;
                }
                i++;
            }
        }
        int size5 = getSize();
        for (int i8 = i; i8 < size5; i8++) {
            getValues()[getValueOrder()[i8]] = null;
        }
        setSize(i);
    }

    public final void setScopeSets(IdentityArraySet<T>[] identityArraySetArr) {
        C12775o.m28639i(identityArraySetArr, "<set-?>");
        this.scopeSets = identityArraySetArr;
    }

    public final void setSize(int i) {
        this.size = i;
    }

    public final void setValueOrder(int[] iArr) {
        C12775o.m28639i(iArr, "<set-?>");
        this.valueOrder = iArr;
    }

    public final void setValues(Object[] objArr) {
        C12775o.m28639i(objArr, "<set-?>");
        this.values = objArr;
    }

    public static /* synthetic */ void getScopeSets$annotations() {
    }

    public static /* synthetic */ void getSize$annotations() {
    }

    public static /* synthetic */ void getValueOrder$annotations() {
    }

    public static /* synthetic */ void getValues$annotations() {
    }
}
