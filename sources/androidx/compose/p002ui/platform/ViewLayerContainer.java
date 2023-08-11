package androidx.compose.p002ui.platform;

import android.content.Context;
import android.graphics.Canvas;
import kotlin.jvm.internal.C12775o;

/* renamed from: androidx.compose.ui.platform.ViewLayerContainer */
/* compiled from: ViewLayerContainer.android.kt */
public final class ViewLayerContainer extends DrawChildContainer {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ViewLayerContainer(Context context) {
        super(context);
        C12775o.m28639i(context, "context");
    }

    /* access modifiers changed from: protected */
    public void dispatchDraw(Canvas canvas) {
        C12775o.m28639i(canvas, "canvas");
    }

    /* access modifiers changed from: protected */
    public final void dispatchGetDisplayList() {
    }
}
