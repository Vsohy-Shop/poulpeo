package androidx.compose.p002ui.viewinterop;

import android.view.View;
import androidx.compose.p002ui.geometry.Offset;
import androidx.compose.p002ui.input.nestedscroll.NestedScrollSource;
import androidx.compose.p002ui.layout.LayoutCoordinatesKt;
import androidx.compose.p002ui.node.LayoutNode;

/* renamed from: androidx.compose.ui.viewinterop.AndroidViewHolder_androidKt */
/* compiled from: AndroidViewHolder.android.kt */
public final class AndroidViewHolder_androidKt {
    private static final int Unmeasured = Integer.MIN_VALUE;

    /* access modifiers changed from: private */
    public static final void layoutAccordingTo(View view, LayoutNode layoutNode) {
        long positionInRoot = LayoutCoordinatesKt.positionInRoot(layoutNode.getCoordinates());
        int c = C13265c.m30134c(Offset.m35422getXimpl(positionInRoot));
        int c2 = C13265c.m30134c(Offset.m35423getYimpl(positionInRoot));
        view.layout(c, c2, view.getMeasuredWidth() + c, view.getMeasuredHeight() + c2);
    }

    /* access modifiers changed from: private */
    public static final float toComposeOffset(int i) {
        return ((float) i) * ((float) -1);
    }

    /* access modifiers changed from: private */
    public static final float toComposeVelocity(float f) {
        return f * -1.0f;
    }

    /* access modifiers changed from: private */
    public static final int toNestedScrollSource(int i) {
        if (i == 0) {
            return NestedScrollSource.Companion.m37068getDragWNlRxjI();
        }
        return NestedScrollSource.Companion.m37069getFlingWNlRxjI();
    }
}
