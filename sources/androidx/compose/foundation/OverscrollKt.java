package androidx.compose.foundation;

import androidx.compose.p002ui.Modifier;
import kotlin.jvm.internal.C12775o;

/* compiled from: Overscroll.kt */
public final class OverscrollKt {
    @ExperimentalFoundationApi
    public static final Modifier overscroll(Modifier modifier, OverscrollEffect overscrollEffect) {
        C12775o.m28639i(modifier, "<this>");
        C12775o.m28639i(overscrollEffect, "overscrollEffect");
        return modifier.then(overscrollEffect.getEffectModifier());
    }
}
