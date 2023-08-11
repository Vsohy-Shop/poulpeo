package androidx.compose.p002ui.platform;

import android.view.View;
import androidx.compose.runtime.CompositionContext;
import androidx.compose.runtime.Recomposer;
import kotlin.coroutines.jvm.internal.C12739f;
import kotlin.coroutines.jvm.internal.C12746l;
import p336ef.C11910n;
import p336ef.C11921v;
import p355hf.C12074d;
import p404of.C13088o;
import p466yf.C13995l0;

@C12739f(mo50609c = "androidx.compose.ui.platform.WindowRecomposerPolicy$createAndInstallWindowRecomposer$unsetJob$1", mo50610f = "WindowRecomposer.android.kt", mo50611l = {233}, mo50612m = "invokeSuspend")
/* renamed from: androidx.compose.ui.platform.WindowRecomposerPolicy$createAndInstallWindowRecomposer$unsetJob$1 */
/* compiled from: WindowRecomposer.android.kt */
final class C1105xbfd085b3 extends C12746l implements C13088o<C13995l0, C12074d<? super C11921v>, Object> {
    final /* synthetic */ Recomposer $newRecomposer;
    final /* synthetic */ View $rootView;
    int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C1105xbfd085b3(Recomposer recomposer, View view, C12074d<? super C1105xbfd085b3> dVar) {
        super(2, dVar);
        this.$newRecomposer = recomposer;
        this.$rootView = view;
    }

    public final C12074d<C11921v> create(Object obj, C12074d<?> dVar) {
        return new C1105xbfd085b3(this.$newRecomposer, this.$rootView, dVar);
    }

    public final Object invokeSuspend(Object obj) {
        Object c = C12150d.m26492c();
        int i = this.label;
        if (i == 0) {
            C11910n.m25701b(obj);
            Recomposer recomposer = this.$newRecomposer;
            this.label = 1;
            if (recomposer.join(this) == c) {
                return c;
            }
        } else if (i == 1) {
            try {
                C11910n.m25701b(obj);
            } catch (Throwable th) {
                if (WindowRecomposer_androidKt.getCompositionContext(this.$rootView) == this.$newRecomposer) {
                    WindowRecomposer_androidKt.setCompositionContext(this.$rootView, (CompositionContext) null);
                }
                throw th;
            }
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        if (WindowRecomposer_androidKt.getCompositionContext(this.$rootView) == this.$newRecomposer) {
            WindowRecomposer_androidKt.setCompositionContext(this.$rootView, (CompositionContext) null);
        }
        return C11921v.f18618a;
    }

    public final Object invoke(C13995l0 l0Var, C12074d<? super C11921v> dVar) {
        return ((C1105xbfd085b3) create(l0Var, dVar)).invokeSuspend(C11921v.f18618a);
    }
}
