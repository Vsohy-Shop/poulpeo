package androidx.compose.p002ui.graphics;

import androidx.compose.p002ui.geometry.OffsetKt;
import androidx.compose.runtime.Stable;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: androidx.compose.ui.graphics.RenderEffectKt */
/* compiled from: RenderEffect.kt */
public final class RenderEffectKt {
    @Stable
    /* renamed from: BlurEffect-3YTHUZs  reason: not valid java name */
    public static final BlurEffect m35995BlurEffect3YTHUZs(float f, float f2, int i) {
        return new BlurEffect((RenderEffect) null, f, f2, i, (DefaultConstructorMarker) null);
    }

    /* renamed from: BlurEffect-3YTHUZs$default  reason: not valid java name */
    public static /* synthetic */ BlurEffect m35996BlurEffect3YTHUZs$default(float f, float f2, int i, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            i = TileMode.Companion.m36075getClamp3opZhB0();
        }
        return m35995BlurEffect3YTHUZs(f, f2, i);
    }

    @Stable
    public static final OffsetEffect OffsetEffect(float f, float f2) {
        return new OffsetEffect((RenderEffect) null, OffsetKt.Offset(f, f2), (DefaultConstructorMarker) null);
    }
}
