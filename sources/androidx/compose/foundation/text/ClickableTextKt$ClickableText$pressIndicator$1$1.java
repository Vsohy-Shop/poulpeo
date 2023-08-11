package androidx.compose.foundation.text;

import androidx.compose.foundation.gestures.TapGestureDetectorKt;
import androidx.compose.p002ui.geometry.Offset;
import androidx.compose.p002ui.input.pointer.PointerInputScope;
import androidx.compose.p002ui.text.TextLayoutResult;
import androidx.compose.runtime.MutableState;
import kotlin.coroutines.jvm.internal.C12739f;
import kotlin.coroutines.jvm.internal.C12746l;
import kotlin.jvm.functions.Function1;
import p336ef.C11910n;
import p336ef.C11921v;
import p355hf.C12074d;
import p404of.C13088o;
import p404of.C13089p;

@C12739f(mo50609c = "androidx.compose.foundation.text.ClickableTextKt$ClickableText$pressIndicator$1$1", mo50610f = "ClickableText.kt", mo50611l = {82}, mo50612m = "invokeSuspend")
/* compiled from: ClickableText.kt */
final class ClickableTextKt$ClickableText$pressIndicator$1$1 extends C12746l implements C13088o<PointerInputScope, C12074d<? super C11921v>, Object> {
    final /* synthetic */ MutableState<TextLayoutResult> $layoutResult;
    final /* synthetic */ Function1<Integer, C11921v> $onClick;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    ClickableTextKt$ClickableText$pressIndicator$1$1(MutableState<TextLayoutResult> mutableState, Function1<? super Integer, C11921v> function1, C12074d<? super ClickableTextKt$ClickableText$pressIndicator$1$1> dVar) {
        super(2, dVar);
        this.$layoutResult = mutableState;
        this.$onClick = function1;
    }

    public final C12074d<C11921v> create(Object obj, C12074d<?> dVar) {
        ClickableTextKt$ClickableText$pressIndicator$1$1 clickableTextKt$ClickableText$pressIndicator$1$1 = new ClickableTextKt$ClickableText$pressIndicator$1$1(this.$layoutResult, this.$onClick, dVar);
        clickableTextKt$ClickableText$pressIndicator$1$1.L$0 = obj;
        return clickableTextKt$ClickableText$pressIndicator$1$1;
    }

    public final Object invoke(PointerInputScope pointerInputScope, C12074d<? super C11921v> dVar) {
        return ((ClickableTextKt$ClickableText$pressIndicator$1$1) create(pointerInputScope, dVar)).invokeSuspend(C11921v.f18618a);
    }

    public final Object invokeSuspend(Object obj) {
        Object c = C12150d.m26492c();
        int i = this.label;
        if (i == 0) {
            C11910n.m25701b(obj);
            final MutableState<TextLayoutResult> mutableState = this.$layoutResult;
            final Function1<Integer, C11921v> function1 = this.$onClick;
            C06041 r7 = new Function1<Offset, C11921v>() {
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    m33639invokek4lQ0M(((Offset) obj).m35432unboximpl());
                    return C11921v.f18618a;
                }

                /* renamed from: invoke-k-4lQ0M  reason: not valid java name */
                public final void m33639invokek4lQ0M(long j) {
                    TextLayoutResult value = mutableState.getValue();
                    if (value != null) {
                        function1.invoke(Integer.valueOf(value.m37947getOffsetForPositionk4lQ0M(j)));
                    }
                }
            };
            this.label = 1;
            if (TapGestureDetectorKt.detectTapGestures$default((PointerInputScope) this.L$0, (Function1) null, (Function1) null, (C13089p) null, r7, this, 7, (Object) null) == c) {
                return c;
            }
        } else if (i == 1) {
            C11910n.m25701b(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return C11921v.f18618a;
    }
}
