package androidx.compose.p002ui.platform;

import android.view.View;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import kotlin.jvm.internal.C12775o;

@RequiresApi(28)
/* renamed from: androidx.compose.ui.platform.ViewLayerVerificationHelper28 */
/* compiled from: ViewLayer.android.kt */
final class ViewLayerVerificationHelper28 {
    public static final ViewLayerVerificationHelper28 INSTANCE = new ViewLayerVerificationHelper28();

    private ViewLayerVerificationHelper28() {
    }

    @DoNotInline
    public final void setOutlineAmbientShadowColor(View view, int i) {
        C12775o.m28639i(view, "view");
        view.setOutlineAmbientShadowColor(i);
    }

    @DoNotInline
    public final void setOutlineSpotShadowColor(View view, int i) {
        C12775o.m28639i(view, "view");
        view.setOutlineSpotShadowColor(i);
    }
}
