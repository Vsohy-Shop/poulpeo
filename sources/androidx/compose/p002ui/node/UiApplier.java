package androidx.compose.p002ui.node;

import androidx.compose.runtime.AbstractApplier;
import kotlin.jvm.internal.C12775o;

/* renamed from: androidx.compose.ui.node.UiApplier */
/* compiled from: UiApplier.android.kt */
public final class UiApplier extends AbstractApplier<LayoutNode> {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public UiApplier(LayoutNode layoutNode) {
        super(layoutNode);
        C12775o.m28639i(layoutNode, "root");
    }

    public void insertTopDown(int i, LayoutNode layoutNode) {
        C12775o.m28639i(layoutNode, "instance");
    }

    public void move(int i, int i2, int i3) {
        ((LayoutNode) getCurrent()).move$ui_release(i, i2, i3);
    }

    /* access modifiers changed from: protected */
    public void onClear() {
        ((LayoutNode) getRoot()).removeAll$ui_release();
    }

    public void onEndChanges() {
        super.onEndChanges();
        Owner owner$ui_release = ((LayoutNode) getRoot()).getOwner$ui_release();
        if (owner$ui_release != null) {
            owner$ui_release.onEndApplyChanges();
        }
    }

    public void remove(int i, int i2) {
        ((LayoutNode) getCurrent()).removeAt$ui_release(i, i2);
    }

    public void insertBottomUp(int i, LayoutNode layoutNode) {
        C12775o.m28639i(layoutNode, "instance");
        ((LayoutNode) getCurrent()).insertAt$ui_release(i, layoutNode);
    }
}
