package androidx.compose.material;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import kotlin.coroutines.jvm.internal.C12739f;
import kotlin.coroutines.jvm.internal.C12746l;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import p336ef.C11910n;
import p336ef.C11921v;
import p355hf.C12074d;
import p355hf.C12079g;
import p404of.C13088o;
import p466yf.C13995l0;
import p466yf.C14004n0;
import p466yf.C14054y1;

/* compiled from: BottomSheetScaffold.kt */
final class BottomSheetScaffoldKt$BottomSheet$anchorChangeHandler$1$2 extends C12777p implements Function1<BottomSheetValue, C11921v> {
    final /* synthetic */ C13995l0 $scope;
    final /* synthetic */ BottomSheetState $state;

    @C12739f(mo50609c = "androidx.compose.material.BottomSheetScaffoldKt$BottomSheet$anchorChangeHandler$1$2$1", mo50610f = "BottomSheetScaffold.kt", mo50611l = {416}, mo50612m = "invokeSuspend")
    /* renamed from: androidx.compose.material.BottomSheetScaffoldKt$BottomSheet$anchorChangeHandler$1$2$1 */
    /* compiled from: BottomSheetScaffold.kt */
    static final class C06971 extends C12746l implements C13088o<C13995l0, C12074d<? super C11921v>, Object> {
        int label;

        public final C12074d<C11921v> create(Object obj, C12074d<?> dVar) {
            return new C06971(bottomSheetState, bottomSheetValue, dVar);
        }

        public final Object invokeSuspend(Object obj) {
            Object c = C12150d.m26492c();
            int i = this.label;
            if (i == 0) {
                C11910n.m25701b(obj);
                BottomSheetState bottomSheetState = bottomSheetState;
                BottomSheetValue bottomSheetValue = bottomSheetValue;
                this.label = 1;
                if (bottomSheetState.snapTo$material_release(bottomSheetValue, this) == c) {
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
            return ((C06971) create(l0Var, dVar)).invokeSuspend(C11921v.f18618a);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    BottomSheetScaffoldKt$BottomSheet$anchorChangeHandler$1$2(C13995l0 l0Var, BottomSheetState bottomSheetState) {
        super(1);
        this.$scope = l0Var;
        this.$state = bottomSheetState;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((BottomSheetValue) obj);
        return C11921v.f18618a;
    }

    public final void invoke(final BottomSheetValue bottomSheetValue) {
        C12775o.m28639i(bottomSheetValue, TypedValues.AttributesType.S_TARGET);
        C13995l0 l0Var = this.$scope;
        final BottomSheetState bottomSheetState = this.$state;
        C14054y1 unused = C13985j.m32422d(l0Var, (C12079g) null, (C14004n0) null, new C06971((C12074d<? super C06971>) null), 3, (Object) null);
    }
}
