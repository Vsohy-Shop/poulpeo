package androidx.compose.p002ui.node;

import androidx.compose.p002ui.platform.ViewConfiguration;
import androidx.compose.p002ui.unit.DpSize;

/* renamed from: androidx.compose.ui.node.LayoutNode$Companion$DummyViewConfiguration$1 */
/* compiled from: LayoutNode.kt */
public final class LayoutNode$Companion$DummyViewConfiguration$1 implements ViewConfiguration {
    LayoutNode$Companion$DummyViewConfiguration$1() {
    }

    public long getDoubleTapMinTimeMillis() {
        return 40;
    }

    public long getDoubleTapTimeoutMillis() {
        return 300;
    }

    public long getLongPressTimeoutMillis() {
        return 400;
    }

    /* renamed from: getMinimumTouchTargetSize-MYxV2XQ  reason: not valid java name */
    public long m37505getMinimumTouchTargetSizeMYxV2XQ() {
        return DpSize.Companion.m38576getZeroMYxV2XQ();
    }

    public float getTouchSlop() {
        return 16.0f;
    }
}
