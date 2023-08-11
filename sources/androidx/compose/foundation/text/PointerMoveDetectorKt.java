package androidx.compose.foundation.text;

import androidx.compose.p002ui.geometry.Offset;
import androidx.compose.p002ui.input.pointer.PointerEventPass;
import androidx.compose.p002ui.input.pointer.PointerInputScope;
import kotlin.jvm.functions.Function1;
import p336ef.C11921v;
import p355hf.C12074d;
import p466yf.C13999m0;

/* compiled from: PointerMoveDetector.kt */
public final class PointerMoveDetectorKt {
    public static final Object detectMoves(PointerInputScope pointerInputScope, PointerEventPass pointerEventPass, Function1<? super Offset, C11921v> function1, C12074d<? super C11921v> dVar) {
        Object e = C13999m0.m32451e(new PointerMoveDetectorKt$detectMoves$2(pointerInputScope, pointerEventPass, function1, (C12074d<? super PointerMoveDetectorKt$detectMoves$2>) null), dVar);
        if (e == C12150d.m26492c()) {
            return e;
        }
        return C11921v.f18618a;
    }

    public static /* synthetic */ Object detectMoves$default(PointerInputScope pointerInputScope, PointerEventPass pointerEventPass, Function1 function1, C12074d dVar, int i, Object obj) {
        if ((i & 1) != 0) {
            pointerEventPass = PointerEventPass.Initial;
        }
        return detectMoves(pointerInputScope, pointerEventPass, function1, dVar);
    }
}
