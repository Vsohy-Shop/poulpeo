package androidx.compose.p002ui.platform;

import android.view.View;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import androidx.compose.p002ui.graphics.RenderEffect;
import kotlin.jvm.internal.C12775o;

@RequiresApi(31)
/* renamed from: androidx.compose.ui.platform.ViewLayerVerificationHelper31 */
/* compiled from: ViewLayer.android.kt */
final class ViewLayerVerificationHelper31 {
    public static final ViewLayerVerificationHelper31 INSTANCE = new ViewLayerVerificationHelper31();

    private ViewLayerVerificationHelper31() {
    }

    @DoNotInline
    public final void setRenderEffect(View view, RenderEffect renderEffect) {
        android.graphics.RenderEffect renderEffect2;
        C12775o.m28639i(view, "view");
        if (renderEffect != null) {
            renderEffect2 = renderEffect.asAndroidRenderEffect();
        } else {
            renderEffect2 = null;
        }
        view.setRenderEffect(renderEffect2);
    }
}
