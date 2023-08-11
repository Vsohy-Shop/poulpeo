package androidx.compose.material;

import kotlin.coroutines.jvm.internal.C12737d;
import kotlin.coroutines.jvm.internal.C12739f;
import p355hf.C12074d;

@C12739f(mo50609c = "androidx.compose.material.ModalBottomSheetKt$ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection$1", mo50610f = "ModalBottomSheet.kt", mo50611l = {628}, mo50612m = "onPreFling-QWom1Mo")
/* renamed from: androidx.compose.material.ModalBottomSheetKt$ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection$1$onPreFling$1 */
/* compiled from: ModalBottomSheet.kt */
final class C0745x8819a6ee extends C12737d {
    long J$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ C0743x58e3e91b this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C0745x8819a6ee(C0743x58e3e91b modalBottomSheetKt$ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection$1, C12074d<? super C0745x8819a6ee> dVar) {
        super(dVar);
        this.this$0 = modalBottomSheetKt$ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection$1;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.m34054onPreFlingQWom1Mo(0, this);
    }
}
