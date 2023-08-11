package androidx.compose.foundation;

import androidx.compose.p002ui.geometry.Offset;
import androidx.compose.p002ui.geometry.OffsetKt;
import androidx.compose.runtime.State;
import kotlin.jvm.internal.C12777p;
import p404of.C13074a;

/* compiled from: Magnifier.kt */
final class MagnifierKt$magnifier$4$isMagnifierShown$2$1 extends C12777p implements C13074a<Boolean> {
    final /* synthetic */ State<Offset> $sourceCenterInRoot$delegate;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    MagnifierKt$magnifier$4$isMagnifierShown$2$1(State<Offset> state) {
        super(0);
        this.$sourceCenterInRoot$delegate = state;
    }

    public final Boolean invoke() {
        return Boolean.valueOf(OffsetKt.m35441isSpecifiedk4lQ0M(MagnifierKt$magnifier$4.invoke$lambda$8(this.$sourceCenterInRoot$delegate)));
    }
}
