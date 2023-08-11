package androidx.compose.p002ui.platform;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.p002ui.C0954R;
import androidx.compose.p002ui.graphics.AndroidCanvas_androidKt;
import kotlin.jvm.internal.C12775o;

/* renamed from: androidx.compose.ui.platform.DrawChildContainer */
/* compiled from: ViewLayerContainer.android.kt */
public class DrawChildContainer extends ViewGroup {
    private boolean isDrawing;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DrawChildContainer(Context context) {
        super(context);
        C12775o.m28639i(context, "context");
        setClipChildren(false);
        setTag(C0954R.C0956id.hide_in_inspector_tag, Boolean.TRUE);
    }

    /* access modifiers changed from: protected */
    public void dispatchDraw(Canvas canvas) {
        boolean z;
        C12775o.m28639i(canvas, "canvas");
        int childCount = super.getChildCount();
        int i = 0;
        while (true) {
            if (i >= childCount) {
                z = false;
                break;
            }
            View childAt = getChildAt(i);
            C12775o.m28637g(childAt, "null cannot be cast to non-null type androidx.compose.ui.platform.ViewLayer");
            if (((ViewLayer) childAt).isInvalidated()) {
                z = true;
                break;
            }
            i++;
        }
        if (z) {
            this.isDrawing = true;
            try {
                super.dispatchDraw(canvas);
            } finally {
                this.isDrawing = false;
            }
        }
    }

    public final void drawChild$ui_release(androidx.compose.p002ui.graphics.Canvas canvas, View view, long j) {
        C12775o.m28639i(canvas, "canvas");
        C12775o.m28639i(view, "view");
        super.drawChild(AndroidCanvas_androidKt.getNativeCanvas(canvas), view, j);
    }

    public int getChildCount() {
        if (this.isDrawing) {
            return super.getChildCount();
        }
        return 0;
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        setMeasuredDimension(0, 0);
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
    }
}
