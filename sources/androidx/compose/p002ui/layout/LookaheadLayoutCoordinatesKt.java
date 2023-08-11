package androidx.compose.p002ui.layout;

import androidx.compose.p002ui.node.LookaheadDelegate;
import kotlin.jvm.internal.C12775o;

/* renamed from: androidx.compose.ui.layout.LookaheadLayoutCoordinatesKt */
/* compiled from: LookaheadLayoutCoordinates.kt */
public final class LookaheadLayoutCoordinatesKt {
    /* access modifiers changed from: private */
    public static final LookaheadDelegate getRootLookaheadDelegate(LookaheadDelegate lookaheadDelegate) {
        LookaheadDelegate lookaheadDelegate$ui_release = lookaheadDelegate.getLookaheadScope().getRoot().getOuterCoordinator$ui_release().getLookaheadDelegate$ui_release();
        C12775o.m28636f(lookaheadDelegate$ui_release);
        return lookaheadDelegate$ui_release;
    }
}
