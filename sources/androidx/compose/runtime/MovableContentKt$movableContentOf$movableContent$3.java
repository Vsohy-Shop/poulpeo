package androidx.compose.runtime;

import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import p336ef.C11906l;
import p336ef.C11921v;
import p404of.C13089p;
import p404of.C13091r;

/* compiled from: MovableContent.kt */
final class MovableContentKt$movableContentOf$movableContent$3 extends C12777p implements C13089p<C11906l<? extends C11906l<? extends P1, ? extends P2>, ? extends P3>, Composer, Integer, C11921v> {
    final /* synthetic */ C13091r<P1, P2, P3, Composer, Integer, C11921v> $content;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    MovableContentKt$movableContentOf$movableContent$3(C13091r<? super P1, ? super P2, ? super P3, ? super Composer, ? super Integer, C11921v> rVar) {
        super(3);
        this.$content = rVar;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        invoke((C11906l) obj, (Composer) obj2, ((Number) obj3).intValue());
        return C11921v.f18618a;
    }

    @Composable
    public final void invoke(C11906l<? extends C11906l<? extends P1, ? extends P2>, ? extends P3> lVar, Composer composer, int i) {
        C12775o.m28639i(lVar, "it");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-284417101, i, -1, "androidx.compose.runtime.movableContentOf.<anonymous> (MovableContent.kt:114)");
        }
        this.$content.invoke(((C11906l) lVar.mo49111c()).mo49111c(), ((C11906l) lVar.mo49111c()).mo49112d(), lVar.mo49112d(), composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}
