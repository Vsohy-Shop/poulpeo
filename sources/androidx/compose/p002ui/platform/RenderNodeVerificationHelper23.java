package androidx.compose.p002ui.platform;

import android.view.RenderNode;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import kotlin.jvm.internal.C12775o;

@RequiresApi(23)
/* renamed from: androidx.compose.ui.platform.RenderNodeVerificationHelper23 */
/* compiled from: RenderNodeApi23.android.kt */
final class RenderNodeVerificationHelper23 {
    public static final RenderNodeVerificationHelper23 INSTANCE = new RenderNodeVerificationHelper23();

    private RenderNodeVerificationHelper23() {
    }

    @DoNotInline
    public final void destroyDisplayListData(RenderNode renderNode) {
        C12775o.m28639i(renderNode, "renderNode");
        renderNode.destroyDisplayListData();
    }
}
