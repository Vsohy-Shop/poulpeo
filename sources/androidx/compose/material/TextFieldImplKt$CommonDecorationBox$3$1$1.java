package androidx.compose.material;

import androidx.compose.p002ui.geometry.Size;
import androidx.compose.p002ui.geometry.SizeKt;
import androidx.compose.runtime.MutableState;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12777p;
import p336ef.C11921v;

/* compiled from: TextFieldImpl.kt */
final class TextFieldImplKt$CommonDecorationBox$3$1$1 extends C12777p implements Function1<Size, C11921v> {
    final /* synthetic */ float $labelProgress;
    final /* synthetic */ MutableState<Size> $labelSize;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    TextFieldImplKt$CommonDecorationBox$3$1$1(float f, MutableState<Size> mutableState) {
        super(1);
        this.$labelProgress = f;
        this.$labelSize = mutableState;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        m34192invokeuvyYCjk(((Size) obj).m35496unboximpl());
        return C11921v.f18618a;
    }

    /* renamed from: invoke-uvyYCjk  reason: not valid java name */
    public final void m34192invokeuvyYCjk(long j) {
        boolean z;
        float r0 = Size.m35491getWidthimpl(j) * this.$labelProgress;
        float r6 = Size.m35488getHeightimpl(j) * this.$labelProgress;
        boolean z2 = true;
        if (Size.m35491getWidthimpl(this.$labelSize.getValue().m35496unboximpl()) == r0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            if (Size.m35488getHeightimpl(this.$labelSize.getValue().m35496unboximpl()) != r6) {
                z2 = false;
            }
            if (z2) {
                return;
            }
        }
        this.$labelSize.setValue(Size.m35479boximpl(SizeKt.Size(r0, r6)));
    }
}
