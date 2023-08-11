package androidx.compose.foundation.text;

import androidx.compose.foundation.text.selection.TextSelectionMouseDetectorKt;
import androidx.compose.p002ui.input.pointer.PointerInputScope;
import kotlin.coroutines.jvm.internal.C12739f;
import kotlin.coroutines.jvm.internal.C12746l;
import p336ef.C11910n;
import p336ef.C11921v;
import p355hf.C12074d;
import p404of.C13088o;

@C12739f(mo50609c = "androidx.compose.foundation.text.TextController$update$3", mo50610f = "CoreText.kt", mo50611l = {283}, mo50612m = "invokeSuspend")
/* compiled from: CoreText.kt */
final class TextController$update$3 extends C12746l implements C13088o<PointerInputScope, C12074d<? super C11921v>, Object> {
    final /* synthetic */ TextController$update$mouseSelectionObserver$1 $mouseSelectionObserver;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    TextController$update$3(TextController$update$mouseSelectionObserver$1 textController$update$mouseSelectionObserver$1, C12074d<? super TextController$update$3> dVar) {
        super(2, dVar);
        this.$mouseSelectionObserver = textController$update$mouseSelectionObserver$1;
    }

    public final C12074d<C11921v> create(Object obj, C12074d<?> dVar) {
        TextController$update$3 textController$update$3 = new TextController$update$3(this.$mouseSelectionObserver, dVar);
        textController$update$3.L$0 = obj;
        return textController$update$3;
    }

    public final Object invoke(PointerInputScope pointerInputScope, C12074d<? super C11921v> dVar) {
        return ((TextController$update$3) create(pointerInputScope, dVar)).invokeSuspend(C11921v.f18618a);
    }

    public final Object invokeSuspend(Object obj) {
        Object c = C12150d.m26492c();
        int i = this.label;
        if (i == 0) {
            C11910n.m25701b(obj);
            TextController$update$mouseSelectionObserver$1 textController$update$mouseSelectionObserver$1 = this.$mouseSelectionObserver;
            this.label = 1;
            if (TextSelectionMouseDetectorKt.mouseSelectionDetector((PointerInputScope) this.L$0, textController$update$mouseSelectionObserver$1, this) == c) {
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
