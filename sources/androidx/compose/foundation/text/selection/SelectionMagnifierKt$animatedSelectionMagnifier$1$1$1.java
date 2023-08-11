package androidx.compose.foundation.text.selection;

import androidx.compose.p002ui.geometry.Offset;
import androidx.compose.runtime.State;
import kotlin.jvm.internal.C12777p;
import p404of.C13074a;

/* compiled from: SelectionMagnifier.kt */
final class SelectionMagnifierKt$animatedSelectionMagnifier$1$1$1 extends C12777p implements C13074a<Offset> {
    final /* synthetic */ State<Offset> $animatedCenter$delegate;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    SelectionMagnifierKt$animatedSelectionMagnifier$1$1$1(State<Offset> state) {
        super(0);
        this.$animatedCenter$delegate = state;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        return Offset.m35411boximpl(m33789invokeF1C5BW0());
    }

    /* renamed from: invoke-F1C5BW0  reason: not valid java name */
    public final long m33789invokeF1C5BW0() {
        return SelectionMagnifierKt$animatedSelectionMagnifier$1.invoke$lambda$0(this.$animatedCenter$delegate);
    }
}
