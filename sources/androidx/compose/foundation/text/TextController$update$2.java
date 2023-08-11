package androidx.compose.foundation.text;

import androidx.compose.p002ui.input.pointer.PointerInputScope;
import kotlin.coroutines.jvm.internal.C12739f;
import kotlin.coroutines.jvm.internal.C12746l;
import p336ef.C11910n;
import p336ef.C11921v;
import p355hf.C12074d;
import p404of.C13088o;

@C12739f(mo50609c = "androidx.compose.foundation.text.TextController$update$2", mo50610f = "CoreText.kt", mo50611l = {192}, mo50612m = "invokeSuspend")
/* compiled from: CoreText.kt */
final class TextController$update$2 extends C12746l implements C13088o<PointerInputScope, C12074d<? super C11921v>, Object> {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ TextController this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    TextController$update$2(TextController textController, C12074d<? super TextController$update$2> dVar) {
        super(2, dVar);
        this.this$0 = textController;
    }

    public final C12074d<C11921v> create(Object obj, C12074d<?> dVar) {
        TextController$update$2 textController$update$2 = new TextController$update$2(this.this$0, dVar);
        textController$update$2.L$0 = obj;
        return textController$update$2;
    }

    public final Object invoke(PointerInputScope pointerInputScope, C12074d<? super C11921v> dVar) {
        return ((TextController$update$2) create(pointerInputScope, dVar)).invokeSuspend(C11921v.f18618a);
    }

    public final Object invokeSuspend(Object obj) {
        Object c = C12150d.m26492c();
        int i = this.label;
        if (i == 0) {
            C11910n.m25701b(obj);
            TextDragObserver longPressDragObserver = this.this$0.getLongPressDragObserver();
            this.label = 1;
            if (LongPressTextDragObserverKt.detectDragGesturesAfterLongPressWithObserver((PointerInputScope) this.L$0, longPressDragObserver, this) == c) {
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
