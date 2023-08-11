package androidx.compose.runtime.snapshots;

import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.runtime.snapshots.SnapshotStateObserver;
import kotlin.jvm.internal.C12777p;
import kotlin.jvm.internal.SourceDebugExtension;
import p336ef.C11921v;
import p404of.C13074a;

@SourceDebugExtension({"SMAP\nSnapshotStateObserver.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SnapshotStateObserver.kt\nandroidx/compose/runtime/snapshots/SnapshotStateObserver$sendNotifications$1\n+ 2 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n*L\n1#1,549:1\n460#2,11:550\n*S KotlinDebug\n*F\n+ 1 SnapshotStateObserver.kt\nandroidx/compose/runtime/snapshots/SnapshotStateObserver$sendNotifications$1\n*L\n84#1:550,11\n*E\n"})
/* compiled from: SnapshotStateObserver.kt */
final class SnapshotStateObserver$sendNotifications$1 extends C12777p implements C13074a<C11921v> {
    final /* synthetic */ SnapshotStateObserver this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    SnapshotStateObserver$sendNotifications$1(SnapshotStateObserver snapshotStateObserver) {
        super(0);
        this.this$0 = snapshotStateObserver;
    }

    /* JADX INFO: finally extract failed */
    public final void invoke() {
        do {
            MutableVector access$getObservedScopeMaps$p = this.this$0.observedScopeMaps;
            SnapshotStateObserver snapshotStateObserver = this.this$0;
            synchronized (access$getObservedScopeMaps$p) {
                if (!snapshotStateObserver.sendingNotifications) {
                    snapshotStateObserver.sendingNotifications = true;
                    try {
                        MutableVector access$getObservedScopeMaps$p2 = snapshotStateObserver.observedScopeMaps;
                        int size = access$getObservedScopeMaps$p2.getSize();
                        if (size > 0) {
                            Object[] content = access$getObservedScopeMaps$p2.getContent();
                            int i = 0;
                            do {
                                ((SnapshotStateObserver.ObservedScopeMap) content[i]).notifyInvalidatedScopes();
                                i++;
                            } while (i < size);
                        }
                        snapshotStateObserver.sendingNotifications = false;
                    } catch (Throwable th) {
                        snapshotStateObserver.sendingNotifications = false;
                        throw th;
                    }
                }
                C11921v vVar = C11921v.f18618a;
            }
        } while (this.this$0.drainChanges());
    }
}
