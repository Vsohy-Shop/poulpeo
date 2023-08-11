package androidx.compose.material3;

import androidx.compose.p002ui.geometry.Offset;
import androidx.compose.p002ui.input.pointer.PointerEventKt;
import androidx.compose.p002ui.input.pointer.PointerInputChange;
import androidx.compose.runtime.State;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12755d0;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import p336ef.C11921v;
import p404of.C13088o;

/* renamed from: androidx.compose.material3.SliderKt$rangeSliderPressDragModifier$1$1$1$1$finishInteraction$success$1 */
/* compiled from: Slider.kt */
final class C0901xaefe3945 extends C12777p implements Function1<PointerInputChange, C11921v> {
    final /* synthetic */ C12755d0 $draggingStart;
    final /* synthetic */ boolean $isRtl;
    final /* synthetic */ State<C13088o<Boolean, Float, C11921v>> $onDrag;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C0901xaefe3945(State<? extends C13088o<? super Boolean, ? super Float, C11921v>> state, C12755d0 d0Var, boolean z) {
        super(1);
        this.$onDrag = state;
        this.$draggingStart = d0Var;
        this.$isRtl = z;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((PointerInputChange) obj);
        return C11921v.f18618a;
    }

    public final void invoke(PointerInputChange pointerInputChange) {
        C12775o.m28639i(pointerInputChange, "it");
        float r4 = Offset.m35422getXimpl(PointerEventKt.positionChange(pointerInputChange));
        C13088o value = this.$onDrag.getValue();
        Boolean valueOf = Boolean.valueOf(this.$draggingStart.f20407b);
        if (this.$isRtl) {
            r4 = -r4;
        }
        value.invoke(valueOf, Float.valueOf(r4));
    }
}
