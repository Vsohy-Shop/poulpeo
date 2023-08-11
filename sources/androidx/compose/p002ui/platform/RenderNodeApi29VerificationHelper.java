package androidx.compose.p002ui.platform;

import android.graphics.RenderNode;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import androidx.compose.p002ui.graphics.RenderEffect;
import kotlin.jvm.internal.C12775o;

@RequiresApi(31)
/* renamed from: androidx.compose.ui.platform.RenderNodeApi29VerificationHelper */
/* compiled from: RenderNodeApi29.android.kt */
final class RenderNodeApi29VerificationHelper {
    public static final RenderNodeApi29VerificationHelper INSTANCE = new RenderNodeApi29VerificationHelper();

    private RenderNodeApi29VerificationHelper() {
    }

    @DoNotInline
    public final void setRenderEffect(RenderNode renderNode, RenderEffect renderEffect) {
        android.graphics.RenderEffect renderEffect2;
        C12775o.m28639i(renderNode, "renderNode");
        if (renderEffect != null) {
            renderEffect2 = renderEffect.asAndroidRenderEffect();
        } else {
            renderEffect2 = null;
        }
        boolean unused = renderNode.setRenderEffect(renderEffect2);
    }
}
