package androidx.compose.runtime;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import p336ef.C11921v;

/* compiled from: Composer.kt */
final class ComposerImpl$doCompose$2$3 extends C12777p implements Function1<State<?>, C11921v> {
    final /* synthetic */ ComposerImpl this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    ComposerImpl$doCompose$2$3(ComposerImpl composerImpl) {
        super(1);
        this.this$0 = composerImpl;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((State<?>) (State) obj);
        return C11921v.f18618a;
    }

    public final void invoke(State<?> state) {
        C12775o.m28639i(state, "it");
        ComposerImpl composerImpl = this.this$0;
        composerImpl.childrenComposing = composerImpl.childrenComposing + 1;
    }
}
