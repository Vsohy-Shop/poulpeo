package androidx.compose.p002ui.node;

import androidx.compose.runtime.collection.MutableVector;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.SourceDebugExtension;
import p336ef.C11921v;
import p404of.C13074a;

@SourceDebugExtension({"SMAP\nMutableVectorWithMutationTracking.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MutableVectorWithMutationTracking.kt\nandroidx/compose/ui/node/MutableVectorWithMutationTracking\n+ 2 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n*L\n1#1,53:1\n460#2,11:54\n523#2:65\n*S KotlinDebug\n*F\n+ 1 MutableVectorWithMutationTracking.kt\nandroidx/compose/ui/node/MutableVectorWithMutationTracking\n*L\n48#1:54,11\n52#1:65\n*E\n"})
/* renamed from: androidx.compose.ui.node.MutableVectorWithMutationTracking */
/* compiled from: MutableVectorWithMutationTracking.kt */
public final class MutableVectorWithMutationTracking<T> {
    private final C13074a<C11921v> onVectorMutated;
    private final MutableVector<T> vector;

    public MutableVectorWithMutationTracking(MutableVector<T> mutableVector, C13074a<C11921v> aVar) {
        C12775o.m28639i(mutableVector, "vector");
        C12775o.m28639i(aVar, "onVectorMutated");
        this.vector = mutableVector;
        this.onVectorMutated = aVar;
    }

    public final void add(int i, T t) {
        this.vector.add(i, t);
        this.onVectorMutated.invoke();
    }

    public final List<T> asList() {
        return this.vector.asMutableList();
    }

    public final void clear() {
        this.vector.clear();
        this.onVectorMutated.invoke();
    }

    public final void forEach(Function1<? super T, C11921v> function1) {
        C12775o.m28639i(function1, "block");
        MutableVector vector2 = getVector();
        int size = vector2.getSize();
        if (size > 0) {
            Object[] content = vector2.getContent();
            int i = 0;
            do {
                function1.invoke(content[i]);
                i++;
            } while (i < size);
        }
    }

    public final T get(int i) {
        return this.vector.getContent()[i];
    }

    public final C13074a<C11921v> getOnVectorMutated() {
        return this.onVectorMutated;
    }

    public final int getSize() {
        return this.vector.getSize();
    }

    public final MutableVector<T> getVector() {
        return this.vector;
    }

    public final T removeAt(int i) {
        T removeAt = this.vector.removeAt(i);
        this.onVectorMutated.invoke();
        return removeAt;
    }
}
