package androidx.compose.material3;

import kotlin.coroutines.jvm.internal.C12737d;
import kotlin.coroutines.jvm.internal.C12739f;
import p355hf.C12074d;

@C12739f(mo50609c = "androidx.compose.material3.SnackbarHostState", mo50610f = "SnackbarHost.kt", mo50611l = {464, 467}, mo50612m = "showSnackbar")
/* compiled from: SnackbarHost.kt */
final class SnackbarHostState$showSnackbar$2 extends C12737d {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ SnackbarHostState this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    SnackbarHostState$showSnackbar$2(SnackbarHostState snackbarHostState, C12074d<? super SnackbarHostState$showSnackbar$2> dVar) {
        super(dVar);
        this.this$0 = snackbarHostState;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.showSnackbar((SnackbarVisuals) null, this);
    }
}
