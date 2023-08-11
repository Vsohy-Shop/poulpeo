package androidx.compose.runtime;

import kotlin.jvm.internal.C12777p;
import p336ef.C11921v;
import p404of.C13088o;

/* compiled from: Composer.kt */
final class ComposerImpl$invokeMovableContentLambda$1 extends C12777p implements C13088o<Composer, Integer, C11921v> {
    final /* synthetic */ MovableContent<Object> $content;
    final /* synthetic */ Object $parameter;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    ComposerImpl$invokeMovableContentLambda$1(MovableContent<Object> movableContent, Object obj) {
        super(2);
        this.$content = movableContent;
        this.$parameter = obj;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((Composer) obj, ((Number) obj2).intValue());
        return C11921v.f18618a;
    }

    @Composable
    public final void invoke(Composer composer, int i) {
        if ((i & 11) != 2 || !composer.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(694380496, i, -1, "androidx.compose.runtime.ComposerImpl.invokeMovableContentLambda.<anonymous> (Composer.kt:2967)");
            }
            this.$content.getContent().invoke(this.$parameter, composer, 8);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
                return;
            }
            return;
        }
        composer.skipToGroupEnd();
    }
}
