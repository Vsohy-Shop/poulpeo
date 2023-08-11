package androidx.compose.runtime;

import kotlin.jvm.internal.C12772l0;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import p336ef.C11921v;
import p404of.C13074a;
import p404of.C13088o;

/* compiled from: Composer.kt */
final class ComposerImpl$doCompose$2$5 extends C12777p implements C13074a<C11921v> {
    final /* synthetic */ C13088o<Composer, Integer, C11921v> $content;
    final /* synthetic */ Object $savedContent;
    final /* synthetic */ ComposerImpl this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    ComposerImpl$doCompose$2$5(C13088o<? super Composer, ? super Integer, C11921v> oVar, ComposerImpl composerImpl, Object obj) {
        super(0);
        this.$content = oVar;
        this.this$0 = composerImpl;
        this.$savedContent = obj;
    }

    public final void invoke() {
        Object obj;
        if (this.$content != null) {
            this.this$0.startGroup(200, ComposerKt.getInvocation());
            ActualJvm_jvmKt.invokeComposable(this.this$0, this.$content);
            this.this$0.endGroup();
        } else if ((this.this$0.forciblyRecompose || this.this$0.providersInvalid) && (obj = this.$savedContent) != null && !C12775o.m28634d(obj, Composer.Companion.getEmpty())) {
            this.this$0.startGroup(200, ComposerKt.getInvocation());
            ComposerImpl composerImpl = this.this$0;
            Object obj2 = this.$savedContent;
            C12775o.m28637g(obj2, "null cannot be cast to non-null type kotlin.Function2<androidx.compose.runtime.Composer, kotlin.Int, kotlin.Unit>");
            ActualJvm_jvmKt.invokeComposable(composerImpl, (C13088o) C12772l0.m28614f(obj2, 2));
            this.this$0.endGroup();
        } else {
            this.this$0.skipCurrentGroup();
        }
    }
}
