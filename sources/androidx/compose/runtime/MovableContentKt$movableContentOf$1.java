package androidx.compose.runtime;

import kotlin.jvm.internal.C12777p;
import p336ef.C11921v;
import p404of.C13088o;

/* compiled from: MovableContent.kt */
final class MovableContentKt$movableContentOf$1 extends C12777p implements C13088o<Composer, Integer, C11921v> {
    final /* synthetic */ MovableContent<C11921v> $movableContent;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    MovableContentKt$movableContentOf$1(MovableContent<C11921v> movableContent) {
        super(2);
        this.$movableContent = movableContent;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((Composer) obj, ((Number) obj2).intValue());
        return C11921v.f18618a;
    }

    @Composable
    public final void invoke(Composer composer, int i) {
        if ((i & 11) != 2 || !composer.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-642339857, i, -1, "androidx.compose.runtime.movableContentOf.<anonymous> (MovableContent.kt:38)");
            }
            composer.insertMovableContent(this.$movableContent, C11921v.f18618a);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
                return;
            }
            return;
        }
        composer.skipToGroupEnd();
    }
}
