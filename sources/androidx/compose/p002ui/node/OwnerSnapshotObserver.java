package androidx.compose.p002ui.node;

import androidx.compose.runtime.snapshots.SnapshotStateObserver;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import p336ef.C11921v;
import p404of.C13074a;

/* renamed from: androidx.compose.ui.node.OwnerSnapshotObserver */
/* compiled from: OwnerSnapshotObserver.kt */
public final class OwnerSnapshotObserver {
    private final SnapshotStateObserver observer;
    private final Function1<LayoutNode, C11921v> onCommitAffectingLayout = OwnerSnapshotObserver$onCommitAffectingLayout$1.INSTANCE;
    private final Function1<LayoutNode, C11921v> onCommitAffectingLayoutModifier = OwnerSnapshotObserver$onCommitAffectingLayoutModifier$1.INSTANCE;
    private final Function1<LayoutNode, C11921v> onCommitAffectingLayoutModifierInLookahead = C1061x82674389.INSTANCE;
    private final Function1<LayoutNode, C11921v> onCommitAffectingLookaheadLayout = OwnerSnapshotObserver$onCommitAffectingLookaheadLayout$1.INSTANCE;
    private final Function1<LayoutNode, C11921v> onCommitAffectingLookaheadMeasure = OwnerSnapshotObserver$onCommitAffectingLookaheadMeasure$1.INSTANCE;
    private final Function1<LayoutNode, C11921v> onCommitAffectingMeasure = OwnerSnapshotObserver$onCommitAffectingMeasure$1.INSTANCE;

    public OwnerSnapshotObserver(Function1<? super C13074a<C11921v>, C11921v> function1) {
        C12775o.m28639i(function1, "onChangedExecutor");
        this.observer = new SnapshotStateObserver(function1);
    }

    public static /* synthetic */ void observeLayoutModifierSnapshotReads$ui_release$default(OwnerSnapshotObserver ownerSnapshotObserver, LayoutNode layoutNode, boolean z, C13074a aVar, int i, Object obj) {
        if ((i & 2) != 0) {
            z = true;
        }
        ownerSnapshotObserver.observeLayoutModifierSnapshotReads$ui_release(layoutNode, z, aVar);
    }

    public static /* synthetic */ void observeLayoutSnapshotReads$ui_release$default(OwnerSnapshotObserver ownerSnapshotObserver, LayoutNode layoutNode, boolean z, C13074a aVar, int i, Object obj) {
        if ((i & 2) != 0) {
            z = true;
        }
        ownerSnapshotObserver.observeLayoutSnapshotReads$ui_release(layoutNode, z, aVar);
    }

    public static /* synthetic */ void observeMeasureSnapshotReads$ui_release$default(OwnerSnapshotObserver ownerSnapshotObserver, LayoutNode layoutNode, boolean z, C13074a aVar, int i, Object obj) {
        if ((i & 2) != 0) {
            z = true;
        }
        ownerSnapshotObserver.observeMeasureSnapshotReads$ui_release(layoutNode, z, aVar);
    }

    public final void clear$ui_release(Object obj) {
        C12775o.m28639i(obj, TypedValues.AttributesType.S_TARGET);
        this.observer.clear(obj);
    }

    public final void clearInvalidObservations$ui_release() {
        this.observer.clearIf(OwnerSnapshotObserver$clearInvalidObservations$1.INSTANCE);
    }

    public final void observeLayoutModifierSnapshotReads$ui_release(LayoutNode layoutNode, boolean z, C13074a<C11921v> aVar) {
        C12775o.m28639i(layoutNode, "node");
        C12775o.m28639i(aVar, "block");
        if (!z || layoutNode.getMLookaheadScope$ui_release() == null) {
            observeReads$ui_release(layoutNode, this.onCommitAffectingLayoutModifier, aVar);
        } else {
            observeReads$ui_release(layoutNode, this.onCommitAffectingLayoutModifierInLookahead, aVar);
        }
    }

    public final void observeLayoutSnapshotReads$ui_release(LayoutNode layoutNode, boolean z, C13074a<C11921v> aVar) {
        C12775o.m28639i(layoutNode, "node");
        C12775o.m28639i(aVar, "block");
        if (!z || layoutNode.getMLookaheadScope$ui_release() == null) {
            observeReads$ui_release(layoutNode, this.onCommitAffectingLayout, aVar);
        } else {
            observeReads$ui_release(layoutNode, this.onCommitAffectingLookaheadLayout, aVar);
        }
    }

    public final void observeMeasureSnapshotReads$ui_release(LayoutNode layoutNode, boolean z, C13074a<C11921v> aVar) {
        C12775o.m28639i(layoutNode, "node");
        C12775o.m28639i(aVar, "block");
        if (!z || layoutNode.getMLookaheadScope$ui_release() == null) {
            observeReads$ui_release(layoutNode, this.onCommitAffectingMeasure, aVar);
        } else {
            observeReads$ui_release(layoutNode, this.onCommitAffectingLookaheadMeasure, aVar);
        }
    }

    public final <T extends OwnerScope> void observeReads$ui_release(T t, Function1<? super T, C11921v> function1, C13074a<C11921v> aVar) {
        C12775o.m28639i(t, TypedValues.AttributesType.S_TARGET);
        C12775o.m28639i(function1, "onChanged");
        C12775o.m28639i(aVar, "block");
        this.observer.observeReads(t, function1, aVar);
    }

    public final void startObserving$ui_release() {
        this.observer.start();
    }

    public final void stopObserving$ui_release() {
        this.observer.stop();
        this.observer.clear();
    }
}
