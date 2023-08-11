package androidx.compose.foundation;

import androidx.compose.p002ui.geometry.Offset;
import androidx.compose.p002ui.geometry.OffsetKt;
import androidx.compose.p002ui.unit.Density;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.State;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12777p;
import p404of.C13074a;

/* compiled from: Magnifier.kt */
final class MagnifierKt$magnifier$4$sourceCenterInRoot$2$1 extends C12777p implements C13074a<Offset> {
    final /* synthetic */ MutableState<Offset> $anchorPositionInRoot$delegate;
    final /* synthetic */ Density $density;
    final /* synthetic */ State<Function1<Density, Offset>> $updatedSourceCenter$delegate;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    MagnifierKt$magnifier$4$sourceCenterInRoot$2$1(Density density, State<? extends Function1<? super Density, Offset>> state, MutableState<Offset> mutableState) {
        super(0);
        this.$density = density;
        this.$updatedSourceCenter$delegate = state;
        this.$anchorPositionInRoot$delegate = mutableState;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        return Offset.m35411boximpl(m33005invokeF1C5BW0());
    }

    /* renamed from: invoke-F1C5BW0  reason: not valid java name */
    public final long m33005invokeF1C5BW0() {
        long r0 = ((Offset) MagnifierKt$magnifier$4.invoke$lambda$3(this.$updatedSourceCenter$delegate).invoke(this.$density)).m35432unboximpl();
        if (!OffsetKt.m35441isSpecifiedk4lQ0M(MagnifierKt$magnifier$4.invoke$lambda$1(this.$anchorPositionInRoot$delegate)) || !OffsetKt.m35441isSpecifiedk4lQ0M(r0)) {
            return Offset.Companion.m35437getUnspecifiedF1C5BW0();
        }
        return Offset.m35427plusMKHz9U(MagnifierKt$magnifier$4.invoke$lambda$1(this.$anchorPositionInRoot$delegate), r0);
    }
}
