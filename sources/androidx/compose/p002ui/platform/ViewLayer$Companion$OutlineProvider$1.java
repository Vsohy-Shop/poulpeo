package androidx.compose.p002ui.platform;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
import kotlin.jvm.internal.C12775o;

/* renamed from: androidx.compose.ui.platform.ViewLayer$Companion$OutlineProvider$1 */
/* compiled from: ViewLayer.android.kt */
public final class ViewLayer$Companion$OutlineProvider$1 extends ViewOutlineProvider {
    ViewLayer$Companion$OutlineProvider$1() {
    }

    public void getOutline(View view, Outline outline) {
        C12775o.m28639i(view, "view");
        C12775o.m28639i(outline, "outline");
        Outline outline2 = ((ViewLayer) view).outlineResolver.getOutline();
        C12775o.m28636f(outline2);
        outline.set(outline2);
    }
}
