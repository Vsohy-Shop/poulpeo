package androidx.compose.material3;

import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.DecayAnimationSpec;
import kotlin.coroutines.jvm.internal.C12739f;
import kotlin.coroutines.jvm.internal.C12746l;
import p336ef.C11910n;
import p336ef.C11921v;
import p355hf.C12074d;
import p404of.C13089p;
import p466yf.C13995l0;

@C12739f(mo50609c = "androidx.compose.material3.AppBarKt$TwoRowsTopAppBar$appBarDragModifier$2$1", mo50610f = "AppBar.kt", mo50611l = {1152}, mo50612m = "invokeSuspend")
/* compiled from: AppBar.kt */
final class AppBarKt$TwoRowsTopAppBar$appBarDragModifier$2$1 extends C12746l implements C13089p<C13995l0, Float, C12074d<? super C11921v>, Object> {
    final /* synthetic */ TopAppBarScrollBehavior $scrollBehavior;
    /* synthetic */ float F$0;
    int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    AppBarKt$TwoRowsTopAppBar$appBarDragModifier$2$1(TopAppBarScrollBehavior topAppBarScrollBehavior, C12074d<? super AppBarKt$TwoRowsTopAppBar$appBarDragModifier$2$1> dVar) {
        super(3, dVar);
        this.$scrollBehavior = topAppBarScrollBehavior;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return invoke((C13995l0) obj, ((Number) obj2).floatValue(), (C12074d<? super C11921v>) (C12074d) obj3);
    }

    public final Object invokeSuspend(Object obj) {
        Object c = C12150d.m26492c();
        int i = this.label;
        if (i == 0) {
            C11910n.m25701b(obj);
            float f = this.F$0;
            TopAppBarState state = this.$scrollBehavior.getState();
            DecayAnimationSpec<Float> flingAnimationSpec = this.$scrollBehavior.getFlingAnimationSpec();
            AnimationSpec<Float> snapAnimationSpec = this.$scrollBehavior.getSnapAnimationSpec();
            this.label = 1;
            if (AppBarKt.settleAppBar(state, f, flingAnimationSpec, snapAnimationSpec, this) == c) {
                return c;
            }
        } else if (i == 1) {
            C11910n.m25701b(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return C11921v.f18618a;
    }

    public final Object invoke(C13995l0 l0Var, float f, C12074d<? super C11921v> dVar) {
        AppBarKt$TwoRowsTopAppBar$appBarDragModifier$2$1 appBarKt$TwoRowsTopAppBar$appBarDragModifier$2$1 = new AppBarKt$TwoRowsTopAppBar$appBarDragModifier$2$1(this.$scrollBehavior, dVar);
        appBarKt$TwoRowsTopAppBar$appBarDragModifier$2$1.F$0 = f;
        return appBarKt$TwoRowsTopAppBar$appBarDragModifier$2$1.invokeSuspend(C11921v.f18618a);
    }
}
