package androidx.compose.p002ui.platform;

import android.view.RenderNode;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import kotlin.jvm.internal.C12775o;

@RequiresApi(24)
/* renamed from: androidx.compose.ui.platform.RenderNodeVerificationHelper24 */
/* compiled from: RenderNodeApi23.android.kt */
final class RenderNodeVerificationHelper24 {
    public static final RenderNodeVerificationHelper24 INSTANCE = new RenderNodeVerificationHelper24();

    private RenderNodeVerificationHelper24() {
    }

    @DoNotInline
    public final void discardDisplayList(RenderNode renderNode) {
        C12775o.m28639i(renderNode, "renderNode");
        renderNode.discardDisplayList();
    }
}
