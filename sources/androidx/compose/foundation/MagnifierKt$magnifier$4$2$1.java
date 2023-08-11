package androidx.compose.foundation;

import androidx.compose.p002ui.geometry.Offset;
import androidx.compose.p002ui.layout.LayoutCoordinates;
import androidx.compose.p002ui.layout.LayoutCoordinatesKt;
import androidx.compose.runtime.MutableState;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import p336ef.C11921v;

/* compiled from: Magnifier.kt */
final class MagnifierKt$magnifier$4$2$1 extends C12777p implements Function1<LayoutCoordinates, C11921v> {
    final /* synthetic */ MutableState<Offset> $anchorPositionInRoot$delegate;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    MagnifierKt$magnifier$4$2$1(MutableState<Offset> mutableState) {
        super(1);
        this.$anchorPositionInRoot$delegate = mutableState;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((LayoutCoordinates) obj);
        return C11921v.f18618a;
    }

    public final void invoke(LayoutCoordinates layoutCoordinates) {
        C12775o.m28639i(layoutCoordinates, "it");
        MagnifierKt$magnifier$4.invoke$lambda$2(this.$anchorPositionInRoot$delegate, LayoutCoordinatesKt.positionInRoot(layoutCoordinates));
    }
}
