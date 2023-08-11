package androidx.compose.runtime;

import androidx.compose.runtime.internal.ThreadMap;
import androidx.compose.runtime.internal.ThreadMapKt;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.internal.SourceDebugExtension;
import p336ef.C11921v;

@SourceDebugExtension({"SMAP\nActualJvm.jvm.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ActualJvm.jvm.kt\nandroidx/compose/runtime/SnapshotThreadLocal\n+ 2 ActualJvm.jvm.kt\nandroidx/compose/runtime/ActualJvm_jvmKt\n*L\n1#1,116:1\n70#2:117\n*S KotlinDebug\n*F\n+ 1 ActualJvm.jvm.kt\nandroidx/compose/runtime/SnapshotThreadLocal\n*L\n58#1:117\n*E\n"})
/* compiled from: ActualJvm.jvm.kt */
public final class SnapshotThreadLocal<T> {
    private final AtomicReference<ThreadMap> map = new AtomicReference<>(ThreadMapKt.getEmptyThreadMap());
    private final Object writeMutex = new Object();

    public final T get() {
        return this.map.get().get(Thread.currentThread().getId());
    }

    public final void set(T t) {
        long id = Thread.currentThread().getId();
        synchronized (this.writeMutex) {
            ThreadMap threadMap = this.map.get();
            if (!threadMap.trySet(id, t)) {
                this.map.set(threadMap.newWith(id, t));
                C11921v vVar = C11921v.f18618a;
            }
        }
    }
}
