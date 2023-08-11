package androidx.compose.runtime;

import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import p336ef.C11906l;
import p336ef.C11921v;
import p404of.C13089p;
import p404of.C13090q;

/* compiled from: MovableContent.kt */
final class MovableContentKt$movableContentOf$movableContent$2 extends C12777p implements C13089p<C11906l<? extends P1, ? extends P2>, Composer, Integer, C11921v> {
    final /* synthetic */ C13090q<P1, P2, Composer, Integer, C11921v> $content;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    MovableContentKt$movableContentOf$movableContent$2(C13090q<? super P1, ? super P2, ? super Composer, ? super Integer, C11921v> qVar) {
        super(3);
        this.$content = qVar;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        invoke((C11906l) obj, (Composer) obj2, ((Number) obj3).intValue());
        return C11921v.f18618a;
    }

    @Composable
    public final void invoke(C11906l<? extends P1, ? extends P2> lVar, Composer composer, int i) {
        int i2;
        C12775o.m28639i(lVar, "it");
        if ((i & 14) == 0) {
            i2 = (composer.changed((Object) lVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 91) != 18 || !composer.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1849814513, i, -1, "androidx.compose.runtime.movableContentOf.<anonymous> (MovableContent.kt:87)");
            }
            this.$content.invoke(lVar.mo49111c(), lVar.mo49112d(), composer, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
                return;
            }
            return;
        }
        composer.skipToGroupEnd();
    }
}
