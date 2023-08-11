package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList;

import androidx.compose.runtime.external.kotlinx.collections.immutable.ImmutableList;
import androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentList;
import androidx.compose.runtime.external.kotlinx.collections.immutable.internal.CommonFunctionsKt;
import androidx.compose.runtime.external.kotlinx.collections.immutable.internal.ListImplementation;
import java.util.Arrays;
import java.util.Collection;
import java.util.ListIterator;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;

@SourceDebugExtension({"SMAP\nSmallPersistentVector.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SmallPersistentVector.kt\nandroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableList/SmallPersistentVector\n+ 2 extensions.kt\nandroidx/compose/runtime/external/kotlinx/collections/immutable/ExtensionsKt\n+ 3 ArrayIntrinsics.kt\nkotlin/ArrayIntrinsicsKt\n*L\n1#1,161:1\n41#2:162\n41#2:163\n26#3:164\n*S KotlinDebug\n*F\n+ 1 SmallPersistentVector.kt\nandroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableList/SmallPersistentVector\n*L\n48#1:162\n91#1:163\n159#1:164\n*E\n"})
/* compiled from: SmallPersistentVector.kt */
public final class SmallPersistentVector<E> extends AbstractPersistentList<E> implements ImmutableList<E> {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */
    public static final SmallPersistentVector EMPTY = new SmallPersistentVector(new Object[0]);
    private final Object[] buffer;

    /* compiled from: SmallPersistentVector.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final SmallPersistentVector getEMPTY() {
            return SmallPersistentVector.EMPTY;
        }
    }

    public SmallPersistentVector(Object[] objArr) {
        boolean z;
        C12775o.m28639i(objArr, "buffer");
        this.buffer = objArr;
        if (objArr.length <= 32) {
            z = true;
        } else {
            z = false;
        }
        CommonFunctionsKt.m35307assert(z);
    }

    private final Object[] bufferOfSize(int i) {
        return new Object[i];
    }

    public E get(int i) {
        ListImplementation.checkElementIndex$runtime_release(i, size());
        return this.buffer[i];
    }

    public int getSize() {
        return this.buffer.length;
    }

    public int indexOf(Object obj) {
        return C12710p.m28389Q(this.buffer, obj);
    }

    public int lastIndexOf(Object obj) {
        return C12710p.m28394V(this.buffer, obj);
    }

    public ListIterator<E> listIterator(int i) {
        ListImplementation.checkPositionIndex$runtime_release(i, size());
        return new BufferIterator(this.buffer, i, size());
    }

    public PersistentList<E> removeAt(int i) {
        ListImplementation.checkElementIndex$runtime_release(i, size());
        if (size() == 1) {
            return EMPTY;
        }
        Object[] copyOf = Arrays.copyOf(this.buffer, size() - 1);
        C12775o.m28638h(copyOf, "copyOf(this, newSize)");
        Object[] unused = C12708o.m28342i(this.buffer, copyOf, i, i + 1, size());
        return new SmallPersistentVector(copyOf);
    }

    public PersistentList<E> set(int i, E e) {
        ListImplementation.checkElementIndex$runtime_release(i, size());
        Object[] objArr = this.buffer;
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
        C12775o.m28638h(copyOf, "copyOf(this, size)");
        copyOf[i] = e;
        return new SmallPersistentVector(copyOf);
    }

    public PersistentList<E> add(E e) {
        if (size() < 32) {
            Object[] copyOf = Arrays.copyOf(this.buffer, size() + 1);
            C12775o.m28638h(copyOf, "copyOf(this, newSize)");
            copyOf[size()] = e;
            return new SmallPersistentVector(copyOf);
        }
        return new PersistentVector(this.buffer, UtilsKt.presizedBufferWith(e), size() + 1, 0);
    }

    public PersistentList<E> addAll(Collection<? extends E> collection) {
        C12775o.m28639i(collection, "elements");
        if (size() + collection.size() <= 32) {
            Object[] copyOf = Arrays.copyOf(this.buffer, size() + collection.size());
            C12775o.m28638h(copyOf, "copyOf(this, newSize)");
            int size = size();
            for (Object obj : collection) {
                copyOf[size] = obj;
                size++;
            }
            return new SmallPersistentVector(copyOf);
        }
        PersistentList.Builder builder = builder();
        builder.addAll(collection);
        return builder.build();
    }

    public PersistentList.Builder<E> builder() {
        return new PersistentVectorBuilder(this, (Object[]) null, this.buffer, 0);
    }

    public PersistentList<E> removeAll(Function1<? super E, Boolean> function1) {
        C12775o.m28639i(function1, "predicate");
        Object[] objArr = this.buffer;
        int size = size();
        int size2 = size();
        boolean z = false;
        for (int i = 0; i < size2; i++) {
            Object obj = this.buffer[i];
            if (function1.invoke(obj).booleanValue()) {
                if (!z) {
                    Object[] objArr2 = this.buffer;
                    objArr = Arrays.copyOf(objArr2, objArr2.length);
                    C12775o.m28638h(objArr, "copyOf(this, size)");
                    z = true;
                    size = i;
                }
            } else if (z) {
                objArr[size] = obj;
                size++;
            }
        }
        if (size == size()) {
            return this;
        }
        if (size == 0) {
            return EMPTY;
        }
        return new SmallPersistentVector(C12708o.m28349p(objArr, 0, size));
    }

    public PersistentList<E> add(int i, E e) {
        ListImplementation.checkPositionIndex$runtime_release(i, size());
        if (i == size()) {
            return add((Object) e);
        }
        if (size() < 32) {
            Object[] bufferOfSize = bufferOfSize(size() + 1);
            Object[] unused = C12708o.m28346m(this.buffer, bufferOfSize, 0, 0, i, 6, (Object) null);
            Object[] unused2 = C12708o.m28342i(this.buffer, bufferOfSize, i + 1, i, size());
            bufferOfSize[i] = e;
            return new SmallPersistentVector(bufferOfSize);
        }
        Object[] objArr = this.buffer;
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
        C12775o.m28638h(copyOf, "copyOf(this, size)");
        Object[] unused3 = C12708o.m28342i(this.buffer, copyOf, i + 1, i, size() - 1);
        copyOf[i] = e;
        return new PersistentVector(copyOf, UtilsKt.presizedBufferWith(this.buffer[31]), size() + 1, 0);
    }

    public PersistentList<E> addAll(int i, Collection<? extends E> collection) {
        C12775o.m28639i(collection, "c");
        ListImplementation.checkPositionIndex$runtime_release(i, size());
        if (size() + collection.size() <= 32) {
            Object[] bufferOfSize = bufferOfSize(size() + collection.size());
            Object[] unused = C12708o.m28346m(this.buffer, bufferOfSize, 0, 0, i, 6, (Object) null);
            Object[] unused2 = C12708o.m28342i(this.buffer, bufferOfSize, collection.size() + i, i, size());
            for (Object obj : collection) {
                bufferOfSize[i] = obj;
                i++;
            }
            return new SmallPersistentVector(bufferOfSize);
        }
        PersistentList.Builder builder = builder();
        builder.addAll(i, collection);
        return builder.build();
    }
}
