package androidx.compose.foundation.text.selection;

import androidx.compose.foundation.gestures.TapGestureDetectorKt;
import androidx.compose.p002ui.geometry.Offset;
import androidx.compose.p002ui.input.pointer.AwaitPointerEventScope;
import androidx.compose.p002ui.input.pointer.PointerEventPass;
import androidx.compose.p002ui.input.pointer.PointerInputChange;
import kotlin.coroutines.jvm.internal.C12739f;
import kotlin.coroutines.jvm.internal.C12745k;
import kotlin.jvm.functions.Function1;
import p336ef.C11910n;
import p336ef.C11921v;
import p355hf.C12074d;
import p404of.C13088o;

@C12739f(mo50609c = "androidx.compose.foundation.text.selection.SelectionManager$detectNonConsumingTap$2", mo50610f = "SelectionManager.kt", mo50611l = {627}, mo50612m = "invokeSuspend")
/* compiled from: SelectionManager.kt */
final class SelectionManager$detectNonConsumingTap$2 extends C12745k implements C13088o<AwaitPointerEventScope, C12074d<? super C11921v>, Object> {
    final /* synthetic */ Function1<Offset, C11921v> $onTap;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    SelectionManager$detectNonConsumingTap$2(Function1<? super Offset, C11921v> function1, C12074d<? super SelectionManager$detectNonConsumingTap$2> dVar) {
        super(2, dVar);
        this.$onTap = function1;
    }

    public final C12074d<C11921v> create(Object obj, C12074d<?> dVar) {
        SelectionManager$detectNonConsumingTap$2 selectionManager$detectNonConsumingTap$2 = new SelectionManager$detectNonConsumingTap$2(this.$onTap, dVar);
        selectionManager$detectNonConsumingTap$2.L$0 = obj;
        return selectionManager$detectNonConsumingTap$2;
    }

    public final Object invoke(AwaitPointerEventScope awaitPointerEventScope, C12074d<? super C11921v> dVar) {
        return ((SelectionManager$detectNonConsumingTap$2) create(awaitPointerEventScope, dVar)).invokeSuspend(C11921v.f18618a);
    }

    public final Object invokeSuspend(Object obj) {
        Object c = C12150d.m26492c();
        int i = this.label;
        if (i == 0) {
            C11910n.m25701b(obj);
            this.label = 1;
            obj = TapGestureDetectorKt.waitForUpOrCancellation$default((AwaitPointerEventScope) this.L$0, (PointerEventPass) null, this, 1, (Object) null);
            if (obj == c) {
                return c;
            }
        } else if (i == 1) {
            C11910n.m25701b(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        PointerInputChange pointerInputChange = (PointerInputChange) obj;
        if (pointerInputChange != null) {
            this.$onTap.invoke(Offset.m35411boximpl(pointerInputChange.m37169getPositionF1C5BW0()));
        }
        return C11921v.f18618a;
    }
}
