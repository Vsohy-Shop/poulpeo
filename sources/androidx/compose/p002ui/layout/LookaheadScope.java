package androidx.compose.p002ui.layout;

import androidx.compose.p002ui.node.LayoutNode;
import androidx.compose.runtime.snapshots.MutableSnapshot;
import androidx.compose.runtime.snapshots.Snapshot;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.SourceDebugExtension;
import p404of.C13074a;

@SourceDebugExtension({"SMAP\nLookaheadScope.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LookaheadScope.kt\nandroidx/compose/ui/layout/LookaheadScope\n+ 2 Snapshot.kt\nandroidx/compose/runtime/snapshots/Snapshot\n*L\n1#1,52:1\n122#2,5:53\n*S KotlinDebug\n*F\n+ 1 LookaheadScope.kt\nandroidx/compose/ui/layout/LookaheadScope\n*L\n44#1:53,5\n*E\n"})
/* renamed from: androidx.compose.ui.layout.LookaheadScope */
/* compiled from: LookaheadScope.kt */
public final class LookaheadScope {
    private MutableSnapshot disposableSnapshot;
    private final LayoutNode root;

    public LookaheadScope(LayoutNode layoutNode) {
        C12775o.m28639i(layoutNode, "root");
        this.root = layoutNode;
    }

    public final LayoutNode getRoot() {
        return this.root;
    }

    public final <T> T withDisposableSnapshot(C13074a<? extends T> aVar) {
        boolean z;
        Snapshot makeCurrent;
        C12775o.m28639i(aVar, "block");
        if (this.disposableSnapshot == null) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            MutableSnapshot takeMutableSnapshot$default = Snapshot.Companion.takeMutableSnapshot$default(Snapshot.Companion, (Function1) null, (Function1) null, 3, (Object) null);
            this.disposableSnapshot = takeMutableSnapshot$default;
            try {
                makeCurrent = takeMutableSnapshot$default.makeCurrent();
                T invoke = aVar.invoke();
                takeMutableSnapshot$default.restoreCurrent(makeCurrent);
                takeMutableSnapshot$default.dispose();
                this.disposableSnapshot = null;
                return invoke;
            } catch (Throwable th) {
                takeMutableSnapshot$default.dispose();
                this.disposableSnapshot = null;
                throw th;
            }
        } else {
            throw new IllegalStateException("Disposable snapshot is already active".toString());
        }
    }
}
