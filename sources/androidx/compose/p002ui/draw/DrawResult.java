package androidx.compose.p002ui.draw;

import androidx.compose.p002ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import p336ef.C11921v;

@StabilityInferred(parameters = 0)
/* renamed from: androidx.compose.ui.draw.DrawResult */
/* compiled from: DrawModifier.kt */
public final class DrawResult {
    public static final int $stable = 8;
    private Function1<? super ContentDrawScope, C11921v> block;

    public DrawResult(Function1<? super ContentDrawScope, C11921v> function1) {
        C12775o.m28639i(function1, "block");
        this.block = function1;
    }

    public final Function1<ContentDrawScope, C11921v> getBlock$ui_release() {
        return this.block;
    }

    public final void setBlock$ui_release(Function1<? super ContentDrawScope, C11921v> function1) {
        C12775o.m28639i(function1, "<set-?>");
        this.block = function1;
    }
}
