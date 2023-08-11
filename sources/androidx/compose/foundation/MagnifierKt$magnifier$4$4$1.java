package androidx.compose.foundation;

import androidx.compose.p002ui.geometry.Offset;
import androidx.compose.p002ui.semantics.SemanticsPropertyKey;
import androidx.compose.p002ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.runtime.State;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import p336ef.C11921v;
import p404of.C13074a;

/* compiled from: Magnifier.kt */
final class MagnifierKt$magnifier$4$4$1 extends C12777p implements Function1<SemanticsPropertyReceiver, C11921v> {
    final /* synthetic */ State<Offset> $sourceCenterInRoot$delegate;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    MagnifierKt$magnifier$4$4$1(State<Offset> state) {
        super(1);
        this.$sourceCenterInRoot$delegate = state;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((SemanticsPropertyReceiver) obj);
        return C11921v.f18618a;
    }

    public final void invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
        C12775o.m28639i(semanticsPropertyReceiver, "$this$semantics");
        SemanticsPropertyKey<C13074a<Offset>> magnifierPositionInRoot = MagnifierKt.getMagnifierPositionInRoot();
        final State<Offset> state = this.$sourceCenterInRoot$delegate;
        semanticsPropertyReceiver.set(magnifierPositionInRoot, new C13074a<Offset>() {
            public /* bridge */ /* synthetic */ Object invoke() {
                return Offset.m35411boximpl(m33004invokeF1C5BW0());
            }

            /* renamed from: invoke-F1C5BW0  reason: not valid java name */
            public final long m33004invokeF1C5BW0() {
                return MagnifierKt$magnifier$4.invoke$lambda$8(state);
            }
        });
    }
}
