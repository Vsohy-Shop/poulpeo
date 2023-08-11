package androidx.compose.p002ui.layout;

import androidx.compose.p002ui.graphics.GraphicsLayerScope;
import androidx.compose.p002ui.unit.IntSizeKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import p336ef.C11921v;

/* renamed from: androidx.compose.ui.layout.FixedSizeIntrinsicsPlaceable */
/* compiled from: Layout.kt */
final class FixedSizeIntrinsicsPlaceable extends Placeable {
    public FixedSizeIntrinsicsPlaceable(int i, int i2) {
        m37403setMeasuredSizeozmzZPI(IntSizeKt.IntSize(i, i2));
    }

    public int get(AlignmentLine alignmentLine) {
        C12775o.m28639i(alignmentLine, "alignmentLine");
        return Integer.MIN_VALUE;
    }

    /* access modifiers changed from: protected */
    /* renamed from: placeAt-f8xVGno  reason: not valid java name */
    public void m37325placeAtf8xVGno(long j, float f, Function1<? super GraphicsLayerScope, C11921v> function1) {
    }
}
