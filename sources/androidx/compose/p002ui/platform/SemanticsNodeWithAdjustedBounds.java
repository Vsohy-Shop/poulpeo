package androidx.compose.p002ui.platform;

import android.graphics.Rect;
import androidx.compose.p002ui.semantics.SemanticsNode;
import kotlin.jvm.internal.C12775o;

/* renamed from: androidx.compose.ui.platform.SemanticsNodeWithAdjustedBounds */
/* compiled from: AndroidComposeViewAccessibilityDelegateCompat.android.kt */
public final class SemanticsNodeWithAdjustedBounds {
    private final Rect adjustedBounds;
    private final SemanticsNode semanticsNode;

    public SemanticsNodeWithAdjustedBounds(SemanticsNode semanticsNode2, Rect rect) {
        C12775o.m28639i(semanticsNode2, "semanticsNode");
        C12775o.m28639i(rect, "adjustedBounds");
        this.semanticsNode = semanticsNode2;
        this.adjustedBounds = rect;
    }

    public final Rect getAdjustedBounds() {
        return this.adjustedBounds;
    }

    public final SemanticsNode getSemanticsNode() {
        return this.semanticsNode;
    }
}
