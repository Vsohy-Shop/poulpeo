package androidx.compose.foundation.text.selection;

import androidx.compose.p002ui.input.pointer.AwaitPointerEventScope;
import kotlin.coroutines.jvm.internal.C12737d;
import kotlin.coroutines.jvm.internal.C12739f;
import p355hf.C12074d;

@C12739f(mo50609c = "androidx.compose.foundation.text.selection.TextSelectionMouseDetectorKt", mo50610f = "TextSelectionMouseDetector.kt", mo50611l = {125}, mo50612m = "awaitMouseEventDown")
/* compiled from: TextSelectionMouseDetector.kt */
final class TextSelectionMouseDetectorKt$awaitMouseEventDown$1 extends C12737d {
    Object L$0;
    int label;
    /* synthetic */ Object result;

    TextSelectionMouseDetectorKt$awaitMouseEventDown$1(C12074d<? super TextSelectionMouseDetectorKt$awaitMouseEventDown$1> dVar) {
        super(dVar);
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return TextSelectionMouseDetectorKt.awaitMouseEventDown((AwaitPointerEventScope) null, this);
    }
}
