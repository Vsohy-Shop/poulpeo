package androidx.compose.material3;

import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.DecayAnimationSpec;
import kotlin.coroutines.jvm.internal.C12737d;
import kotlin.coroutines.jvm.internal.C12739f;
import p355hf.C12074d;

@C12739f(mo50609c = "androidx.compose.material3.AppBarKt", mo50610f = "AppBar.kt", mo50611l = {1577, 1593}, mo50612m = "settleAppBar")
/* compiled from: AppBar.kt */
final class AppBarKt$settleAppBar$1 extends C12737d {
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;

    AppBarKt$settleAppBar$1(C12074d<? super AppBarKt$settleAppBar$1> dVar) {
        super(dVar);
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return AppBarKt.settleAppBar((TopAppBarState) null, 0.0f, (DecayAnimationSpec<Float>) null, (AnimationSpec<Float>) null, this);
    }
}
