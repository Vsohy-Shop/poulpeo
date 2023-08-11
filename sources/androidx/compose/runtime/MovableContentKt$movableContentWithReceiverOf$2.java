package androidx.compose.runtime;

import kotlin.jvm.internal.C12777p;
import p336ef.C11906l;
import p336ef.C11915r;
import p336ef.C11921v;
import p404of.C13090q;

/* compiled from: MovableContent.kt */
final class MovableContentKt$movableContentWithReceiverOf$2 extends C12777p implements C13090q<R, P, Composer, Integer, C11921v> {
    final /* synthetic */ MovableContent<C11906l<R, P>> $movableContent;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    MovableContentKt$movableContentWithReceiverOf$2(MovableContent<C11906l<R, P>> movableContent) {
        super(4);
        this.$movableContent = movableContent;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        invoke(obj, obj2, (Composer) obj3, ((Number) obj4).intValue());
        return C11921v.f18618a;
    }

    @Composable
    public final void invoke(R r, P p, Composer composer, int i) {
        int i2;
        if ((i & 14) == 0) {
            i2 = (composer.changed((Object) r) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            i2 |= composer.changed((Object) p) ? 32 : 16;
        }
        if ((i2 & 731) != 146 || !composer.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(627354118, i, -1, "androidx.compose.runtime.movableContentWithReceiverOf.<anonymous> (MovableContent.kt:198)");
            }
            composer.insertMovableContent(this.$movableContent, C11915r.m25707a(r, p));
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
                return;
            }
            return;
        }
        composer.skipToGroupEnd();
    }
}
