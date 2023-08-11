package androidx.compose.foundation.layout;

import androidx.compose.p002ui.unit.Density;
import androidx.compose.p002ui.unit.LayoutDirection;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import p404of.C13089p;

/* compiled from: WindowInsetsSize.kt */
final class WindowInsetsSizeKt$windowInsetsStartWidth$2 extends C12777p implements C13089p<WindowInsets, LayoutDirection, Density, Integer> {
    public static final WindowInsetsSizeKt$windowInsetsStartWidth$2 INSTANCE = new WindowInsetsSizeKt$windowInsetsStartWidth$2();

    WindowInsetsSizeKt$windowInsetsStartWidth$2() {
        super(3);
    }

    public final Integer invoke(WindowInsets windowInsets, LayoutDirection layoutDirection, Density density) {
        int i;
        C12775o.m28639i(windowInsets, "$this$$receiver");
        C12775o.m28639i(layoutDirection, "layoutDirection");
        C12775o.m28639i(density, "density");
        if (layoutDirection == LayoutDirection.Ltr) {
            i = windowInsets.getLeft(density, layoutDirection);
        } else {
            i = windowInsets.getRight(density, layoutDirection);
        }
        return Integer.valueOf(i);
    }
}
