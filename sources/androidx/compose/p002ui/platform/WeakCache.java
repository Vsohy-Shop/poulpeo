package androidx.compose.p002ui.platform;

import androidx.compose.runtime.collection.MutableVector;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.SourceDebugExtension;

@SourceDebugExtension({"SMAP\nWeakCache.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WeakCache.kt\nandroidx/compose/ui/platform/WeakCache\n+ 2 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n+ 3 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n*L\n1#1,76:1\n1182#2:77\n1161#2,2:78\n728#3,2:80\n48#3:82\n*S KotlinDebug\n*F\n+ 1 WeakCache.kt\nandroidx/compose/ui/platform/WeakCache\n*L\n29#1:77\n29#1:78,2\n38#1:80,2\n49#1:82\n*E\n"})
/* renamed from: androidx.compose.ui.platform.WeakCache */
/* compiled from: WeakCache.kt */
public final class WeakCache<T> {
    private final ReferenceQueue<T> referenceQueue = new ReferenceQueue<>();
    private final MutableVector<Reference<T>> values = new MutableVector<>(new Reference[16], 0);

    private final void clearWeakReferences() {
        Reference<? extends T> poll;
        do {
            poll = this.referenceQueue.poll();
            if (poll != null) {
                this.values.remove(poll);
                continue;
            }
        } while (poll != null);
    }

    public final int getSize() {
        clearWeakReferences();
        return this.values.getSize();
    }

    public final T pop() {
        clearWeakReferences();
        while (this.values.isNotEmpty()) {
            MutableVector<Reference<T>> mutableVector = this.values;
            T t = mutableVector.removeAt(mutableVector.getSize() - 1).get();
            if (t != null) {
                return t;
            }
        }
        return null;
    }

    public final void push(T t) {
        clearWeakReferences();
        this.values.add(new WeakReference(t, this.referenceQueue));
    }
}
