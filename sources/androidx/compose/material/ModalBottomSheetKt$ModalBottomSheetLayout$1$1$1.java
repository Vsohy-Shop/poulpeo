package androidx.compose.material;

import kotlin.coroutines.jvm.internal.C12739f;
import kotlin.coroutines.jvm.internal.C12746l;
import kotlin.jvm.internal.C12777p;
import p336ef.C11910n;
import p336ef.C11921v;
import p355hf.C12074d;
import p355hf.C12079g;
import p404of.C13074a;
import p404of.C13088o;
import p466yf.C13995l0;
import p466yf.C14004n0;
import p466yf.C14054y1;

/* compiled from: ModalBottomSheet.kt */
final class ModalBottomSheetKt$ModalBottomSheetLayout$1$1$1 extends C12777p implements C13074a<C11921v> {
    final /* synthetic */ C13995l0 $scope;
    final /* synthetic */ ModalBottomSheetState $sheetState;

    @C12739f(mo50609c = "androidx.compose.material.ModalBottomSheetKt$ModalBottomSheetLayout$1$1$1$1", mo50610f = "ModalBottomSheet.kt", mo50611l = {462}, mo50612m = "invokeSuspend")
    /* renamed from: androidx.compose.material.ModalBottomSheetKt$ModalBottomSheetLayout$1$1$1$1 */
    /* compiled from: ModalBottomSheet.kt */
    static final class C07561 extends C12746l implements C13088o<C13995l0, C12074d<? super C11921v>, Object> {
        int label;

        public final C12074d<C11921v> create(Object obj, C12074d<?> dVar) {
            return new C07561(modalBottomSheetState, dVar);
        }

        public final Object invokeSuspend(Object obj) {
            Object c = C12150d.m26492c();
            int i = this.label;
            if (i == 0) {
                C11910n.m25701b(obj);
                ModalBottomSheetState modalBottomSheetState = modalBottomSheetState;
                this.label = 1;
                if (modalBottomSheetState.hide(this) == c) {
                    return c;
                }
            } else if (i == 1) {
                C11910n.m25701b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return C11921v.f18618a;
        }

        public final Object invoke(C13995l0 l0Var, C12074d<? super C11921v> dVar) {
            return ((C07561) create(l0Var, dVar)).invokeSuspend(C11921v.f18618a);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    ModalBottomSheetKt$ModalBottomSheetLayout$1$1$1(ModalBottomSheetState modalBottomSheetState, C13995l0 l0Var) {
        super(0);
        this.$sheetState = modalBottomSheetState;
        this.$scope = l0Var;
    }

    public final void invoke() {
        if (this.$sheetState.getSwipeableState$material_release().getConfirmValueChange$material_release().invoke(ModalBottomSheetValue.Hidden).booleanValue()) {
            C13995l0 l0Var = this.$scope;
            final ModalBottomSheetState modalBottomSheetState = this.$sheetState;
            C14054y1 unused = C13985j.m32422d(l0Var, (C12079g) null, (C14004n0) null, new C07561((C12074d<? super C07561>) null), 3, (Object) null);
        }
    }
}
