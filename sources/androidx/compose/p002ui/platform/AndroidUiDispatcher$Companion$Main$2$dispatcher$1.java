package androidx.compose.p002ui.platform;

import android.view.Choreographer;
import kotlin.coroutines.jvm.internal.C12739f;
import kotlin.coroutines.jvm.internal.C12746l;
import p336ef.C11910n;
import p336ef.C11921v;
import p355hf.C12074d;
import p404of.C13088o;
import p466yf.C13995l0;

@C12739f(mo50609c = "androidx.compose.ui.platform.AndroidUiDispatcher$Companion$Main$2$dispatcher$1", mo50610f = "AndroidUiDispatcher.android.kt", mo50611l = {}, mo50612m = "invokeSuspend")
/* renamed from: androidx.compose.ui.platform.AndroidUiDispatcher$Companion$Main$2$dispatcher$1 */
/* compiled from: AndroidUiDispatcher.android.kt */
final class AndroidUiDispatcher$Companion$Main$2$dispatcher$1 extends C12746l implements C13088o<C13995l0, C12074d<? super Choreographer>, Object> {
    int label;

    AndroidUiDispatcher$Companion$Main$2$dispatcher$1(C12074d<? super AndroidUiDispatcher$Companion$Main$2$dispatcher$1> dVar) {
        super(2, dVar);
    }

    public final C12074d<C11921v> create(Object obj, C12074d<?> dVar) {
        return new AndroidUiDispatcher$Companion$Main$2$dispatcher$1(dVar);
    }

    public final Object invokeSuspend(Object obj) {
        Object unused = C12150d.m26492c();
        if (this.label == 0) {
            C11910n.m25701b(obj);
            return Choreographer.getInstance();
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }

    public final Object invoke(C13995l0 l0Var, C12074d<? super Choreographer> dVar) {
        return ((AndroidUiDispatcher$Companion$Main$2$dispatcher$1) create(l0Var, dVar)).invokeSuspend(C11921v.f18618a);
    }
}
