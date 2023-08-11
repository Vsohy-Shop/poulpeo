package androidx.compose.runtime;

import kotlin.jvm.internal.C12777p;
import p336ef.C11921v;
import p404of.C13074a;

/* compiled from: Composer.kt */
final class ComposerImpl$insertMovableContentGuarded$1$1$5$1$1$1 extends C12777p implements C13074a<C11921v> {
    final /* synthetic */ MovableContentStateReference $to;
    final /* synthetic */ ComposerImpl this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    ComposerImpl$insertMovableContentGuarded$1$1$5$1$1$1(ComposerImpl composerImpl, MovableContentStateReference movableContentStateReference) {
        super(0);
        this.this$0 = composerImpl;
        this.$to = movableContentStateReference;
    }

    public final void invoke() {
        this.this$0.invokeMovableContentLambda(this.$to.getContent$runtime_release(), this.$to.getLocals$runtime_release(), this.$to.getParameter$runtime_release(), true);
    }
}
