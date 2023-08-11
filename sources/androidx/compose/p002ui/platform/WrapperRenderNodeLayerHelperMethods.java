package androidx.compose.p002ui.platform;

import android.view.ViewParent;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import kotlin.jvm.internal.C12775o;

@RequiresApi(26)
/* renamed from: androidx.compose.ui.platform.WrapperRenderNodeLayerHelperMethods */
/* compiled from: RenderNodeLayer.android.kt */
public final class WrapperRenderNodeLayerHelperMethods {
    public static final WrapperRenderNodeLayerHelperMethods INSTANCE = new WrapperRenderNodeLayerHelperMethods();

    private WrapperRenderNodeLayerHelperMethods() {
    }

    @DoNotInline
    public final void onDescendantInvalidated(AndroidComposeView androidComposeView) {
        C12775o.m28639i(androidComposeView, "ownerView");
        ViewParent parent = androidComposeView.getParent();
        if (parent != null) {
            parent.onDescendantInvalidated(androidComposeView, androidComposeView);
        }
    }
}
