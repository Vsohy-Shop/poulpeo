package androidx.compose.p002ui.layout;

import androidx.compose.p002ui.node.LayoutNode;
import androidx.compose.p002ui.unit.Constraints;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.CompositionContext;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.C12775o;
import p336ef.C11921v;
import p404of.C13088o;

@StabilityInferred(parameters = 0)
/* renamed from: androidx.compose.ui.layout.SubcomposeLayoutState */
/* compiled from: SubcomposeLayout.kt */
public final class SubcomposeLayoutState {
    public static final int $stable = 8;
    /* access modifiers changed from: private */
    public LayoutNodeSubcompositionsState _state;
    private final C13088o<LayoutNode, CompositionContext, C11921v> setCompositionContext;
    private final C13088o<LayoutNode, C13088o<? super SubcomposeMeasureScope, ? super Constraints, ? extends MeasureResult>, C11921v> setMeasurePolicy;
    private final C13088o<LayoutNode, SubcomposeLayoutState, C11921v> setRoot;
    /* access modifiers changed from: private */
    public final SubcomposeSlotReusePolicy slotReusePolicy;

    public SubcomposeLayoutState(SubcomposeSlotReusePolicy subcomposeSlotReusePolicy) {
        C12775o.m28639i(subcomposeSlotReusePolicy, "slotReusePolicy");
        this.slotReusePolicy = subcomposeSlotReusePolicy;
        this.setRoot = new SubcomposeLayoutState$setRoot$1(this);
        this.setCompositionContext = new SubcomposeLayoutState$setCompositionContext$1(this);
        this.setMeasurePolicy = new SubcomposeLayoutState$setMeasurePolicy$1(this);
    }

    /* access modifiers changed from: private */
    public final LayoutNodeSubcompositionsState getState() {
        LayoutNodeSubcompositionsState layoutNodeSubcompositionsState = this._state;
        if (layoutNodeSubcompositionsState != null) {
            return layoutNodeSubcompositionsState;
        }
        throw new IllegalArgumentException("SubcomposeLayoutState is not attached to SubcomposeLayout".toString());
    }

    public final void disposeCurrentNodes$ui_release() {
        getState().disposeCurrentNodes();
    }

    public final void forceRecomposeChildren$ui_release() {
        getState().forceRecomposeChildren();
    }

    public final C13088o<LayoutNode, CompositionContext, C11921v> getSetCompositionContext$ui_release() {
        return this.setCompositionContext;
    }

    public final C13088o<LayoutNode, C13088o<? super SubcomposeMeasureScope, ? super Constraints, ? extends MeasureResult>, C11921v> getSetMeasurePolicy$ui_release() {
        return this.setMeasurePolicy;
    }

    public final C13088o<LayoutNode, SubcomposeLayoutState, C11921v> getSetRoot$ui_release() {
        return this.setRoot;
    }

    public final PrecomposedSlotHandle precompose(Object obj, C13088o<? super Composer, ? super Integer, C11921v> oVar) {
        C12775o.m28639i(oVar, "content");
        return getState().precompose(obj, oVar);
    }

    public SubcomposeLayoutState() {
        this((SubcomposeSlotReusePolicy) NoOpSubcomposeSlotReusePolicy.INSTANCE);
    }

    public SubcomposeLayoutState(int i) {
        this(SubcomposeLayoutKt.SubcomposeSlotReusePolicy(i));
    }

    /* renamed from: androidx.compose.ui.layout.SubcomposeLayoutState$PrecomposedSlotHandle */
    /* compiled from: SubcomposeLayout.kt */
    public interface PrecomposedSlotHandle {
        void dispose();

        int getPlaceablesCount() {
            return 0;
        }

        /* renamed from: premeasure-0kLqBqw  reason: not valid java name */
        void m37442premeasure0kLqBqw(int i, long j) {
        }
    }
}
