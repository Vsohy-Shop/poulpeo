package androidx.compose.runtime;

import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import p336ef.C11921v;
import p404of.C13088o;
import p404of.C13089p;

/* compiled from: MovableContent.kt */
final class MovableContentKt$movableContentOf$movableContent$1 extends C12777p implements C13089p<C11921v, Composer, Integer, C11921v> {
    final /* synthetic */ C13088o<Composer, Integer, C11921v> $content;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    MovableContentKt$movableContentOf$movableContent$1(C13088o<? super Composer, ? super Integer, C11921v> oVar) {
        super(3);
        this.$content = oVar;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        invoke((C11921v) obj, (Composer) obj2, ((Number) obj3).intValue());
        return C11921v.f18618a;
    }

    @Composable
    public final void invoke(C11921v vVar, Composer composer, int i) {
        C12775o.m28639i(vVar, "it");
        if ((i & 81) != 16 || !composer.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1079330685, i, -1, "androidx.compose.runtime.movableContentOf.<anonymous> (MovableContent.kt:37)");
            }
            this.$content.invoke(composer, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
                return;
            }
            return;
        }
        composer.skipToGroupEnd();
    }
}
