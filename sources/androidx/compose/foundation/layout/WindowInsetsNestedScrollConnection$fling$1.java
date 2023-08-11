package androidx.compose.foundation.layout;

import kotlin.coroutines.jvm.internal.C12737d;
import kotlin.coroutines.jvm.internal.C12739f;
import p355hf.C12074d;

@C12739f(mo50609c = "androidx.compose.foundation.layout.WindowInsetsNestedScrollConnection", mo50610f = "WindowInsetsConnection.android.kt", mo50611l = {304, 330, 355}, mo50612m = "fling-huYlsQE")
/* compiled from: WindowInsetsConnection.android.kt */
final class WindowInsetsNestedScrollConnection$fling$1 extends C12737d {
    float F$0;
    long J$0;
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ WindowInsetsNestedScrollConnection this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    WindowInsetsNestedScrollConnection$fling$1(WindowInsetsNestedScrollConnection windowInsetsNestedScrollConnection, C12074d<? super WindowInsetsNestedScrollConnection$fling$1> dVar) {
        super(dVar);
        this.this$0 = windowInsetsNestedScrollConnection;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.m33360flinghuYlsQE(0, 0.0f, false, this);
    }
}
