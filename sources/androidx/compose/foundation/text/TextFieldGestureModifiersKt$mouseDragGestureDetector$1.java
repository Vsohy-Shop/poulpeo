package androidx.compose.foundation.text;

import androidx.compose.foundation.text.selection.MouseSelectionObserver;
import androidx.compose.foundation.text.selection.TextSelectionMouseDetectorKt;
import androidx.compose.p002ui.input.pointer.PointerInputScope;
import kotlin.coroutines.jvm.internal.C12739f;
import kotlin.coroutines.jvm.internal.C12746l;
import p336ef.C11910n;
import p336ef.C11921v;
import p355hf.C12074d;
import p404of.C13088o;

@C12739f(mo50609c = "androidx.compose.foundation.text.TextFieldGestureModifiersKt$mouseDragGestureDetector$1", mo50610f = "TextFieldGestureModifiers.kt", mo50611l = {56}, mo50612m = "invokeSuspend")
/* compiled from: TextFieldGestureModifiers.kt */
final class TextFieldGestureModifiersKt$mouseDragGestureDetector$1 extends C12746l implements C13088o<PointerInputScope, C12074d<? super C11921v>, Object> {
    final /* synthetic */ MouseSelectionObserver $observer;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    TextFieldGestureModifiersKt$mouseDragGestureDetector$1(MouseSelectionObserver mouseSelectionObserver, C12074d<? super TextFieldGestureModifiersKt$mouseDragGestureDetector$1> dVar) {
        super(2, dVar);
        this.$observer = mouseSelectionObserver;
    }

    public final C12074d<C11921v> create(Object obj, C12074d<?> dVar) {
        TextFieldGestureModifiersKt$mouseDragGestureDetector$1 textFieldGestureModifiersKt$mouseDragGestureDetector$1 = new TextFieldGestureModifiersKt$mouseDragGestureDetector$1(this.$observer, dVar);
        textFieldGestureModifiersKt$mouseDragGestureDetector$1.L$0 = obj;
        return textFieldGestureModifiersKt$mouseDragGestureDetector$1;
    }

    public final Object invoke(PointerInputScope pointerInputScope, C12074d<? super C11921v> dVar) {
        return ((TextFieldGestureModifiersKt$mouseDragGestureDetector$1) create(pointerInputScope, dVar)).invokeSuspend(C11921v.f18618a);
    }

    public final Object invokeSuspend(Object obj) {
        Object c = C12150d.m26492c();
        int i = this.label;
        if (i == 0) {
            C11910n.m25701b(obj);
            MouseSelectionObserver mouseSelectionObserver = this.$observer;
            this.label = 1;
            if (TextSelectionMouseDetectorKt.mouseSelectionDetector((PointerInputScope) this.L$0, mouseSelectionObserver, this) == c) {
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
