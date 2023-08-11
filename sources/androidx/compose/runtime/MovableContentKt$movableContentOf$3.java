package androidx.compose.runtime;

import kotlin.jvm.internal.C12777p;
import p336ef.C11906l;
import p336ef.C11915r;
import p336ef.C11921v;
import p404of.C13090q;

/* compiled from: MovableContent.kt */
final class MovableContentKt$movableContentOf$3 extends C12777p implements C13090q<P1, P2, Composer, Integer, C11921v> {
    final /* synthetic */ MovableContent<C11906l<P1, P2>> $movableContent;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    MovableContentKt$movableContentOf$3(MovableContent<C11906l<P1, P2>> movableContent) {
        super(4);
        this.$movableContent = movableContent;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        invoke(obj, obj2, (Composer) obj3, ((Number) obj4).intValue());
        return C11921v.f18618a;
    }

    @Composable
    public final void invoke(P1 p1, P2 p2, Composer composer, int i) {
        int i2;
        if ((i & 14) == 0) {
            i2 = (composer.changed((Object) p1) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            i2 |= composer.changed((Object) p2) ? 32 : 16;
        }
        if ((i2 & 731) != 146 || !composer.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1200019734, i, -1, "androidx.compose.runtime.movableContentOf.<anonymous> (MovableContent.kt:88)");
            }
            composer.insertMovableContent(this.$movableContent, C11915r.m25707a(p1, p2));
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
                return;
            }
            return;
        }
        composer.skipToGroupEnd();
    }
}
