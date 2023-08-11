package androidx.compose.p002ui.platform;

import android.view.RenderNode;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import kotlin.jvm.internal.C12775o;

@RequiresApi(28)
/* renamed from: androidx.compose.ui.platform.RenderNodeVerificationHelper28 */
/* compiled from: RenderNodeApi23.android.kt */
final class RenderNodeVerificationHelper28 {
    public static final RenderNodeVerificationHelper28 INSTANCE = new RenderNodeVerificationHelper28();

    private RenderNodeVerificationHelper28() {
    }

    @DoNotInline
    public final int getAmbientShadowColor(RenderNode renderNode) {
        C12775o.m28639i(renderNode, "renderNode");
        return renderNode.getAmbientShadowColor();
    }

    @DoNotInline
    public final int getSpotShadowColor(RenderNode renderNode) {
        C12775o.m28639i(renderNode, "renderNode");
        return renderNode.getSpotShadowColor();
    }

    @DoNotInline
    public final void setAmbientShadowColor(RenderNode renderNode, int i) {
        C12775o.m28639i(renderNode, "renderNode");
        renderNode.setAmbientShadowColor(i);
    }

    @DoNotInline
    public final void setSpotShadowColor(RenderNode renderNode, int i) {
        C12775o.m28639i(renderNode, "renderNode");
        renderNode.setSpotShadowColor(i);
    }
}
