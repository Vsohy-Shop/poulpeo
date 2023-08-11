package androidx.compose.foundation.layout;

import androidx.compose.p002ui.unit.Density;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import p404of.C13088o;

/* compiled from: WindowInsetsSize.kt */
final class WindowInsetsSizeKt$windowInsetsBottomHeight$2 extends C12777p implements C13088o<WindowInsets, Density, Integer> {
    public static final WindowInsetsSizeKt$windowInsetsBottomHeight$2 INSTANCE = new WindowInsetsSizeKt$windowInsetsBottomHeight$2();

    WindowInsetsSizeKt$windowInsetsBottomHeight$2() {
        super(2);
    }

    public final Integer invoke(WindowInsets windowInsets, Density density) {
        C12775o.m28639i(windowInsets, "$this$$receiver");
        C12775o.m28639i(density, "it");
        return Integer.valueOf(windowInsets.getBottom(density));
    }
}
