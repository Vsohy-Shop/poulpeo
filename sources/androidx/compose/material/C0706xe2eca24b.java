package androidx.compose.material;

import kotlin.coroutines.jvm.internal.C12737d;
import kotlin.coroutines.jvm.internal.C12739f;
import p355hf.C12074d;

@C12739f(mo50609c = "androidx.compose.material.BottomSheetScaffoldKt$ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection$1", mo50610f = "BottomSheetScaffold.kt", mo50611l = {566}, mo50612m = "onPreFling-QWom1Mo")
/* renamed from: androidx.compose.material.BottomSheetScaffoldKt$ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection$1$onPreFling$1 */
/* compiled from: BottomSheetScaffold.kt */
final class C0706xe2eca24b extends C12737d {
    long J$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ C0704x7deaba9e this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C0706xe2eca24b(C0704x7deaba9e bottomSheetScaffoldKt$ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection$1, C12074d<? super C0706xe2eca24b> dVar) {
        super(dVar);
        this.this$0 = bottomSheetScaffoldKt$ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection$1;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.m33915onPreFlingQWom1Mo(0, this);
    }
}
