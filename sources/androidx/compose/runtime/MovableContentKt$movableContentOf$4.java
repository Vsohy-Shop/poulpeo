package androidx.compose.runtime;

import kotlin.jvm.internal.C12777p;
import p336ef.C11906l;
import p336ef.C11915r;
import p336ef.C11921v;
import p404of.C13091r;

/* compiled from: MovableContent.kt */
final class MovableContentKt$movableContentOf$4 extends C12777p implements C13091r<P1, P2, P3, Composer, Integer, C11921v> {
    final /* synthetic */ MovableContent<C11906l<C11906l<P1, P2>, P3>> $movableContent;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    MovableContentKt$movableContentOf$4(MovableContent<C11906l<C11906l<P1, P2>, P3>> movableContent) {
        super(5);
        this.$movableContent = movableContent;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        invoke(obj, obj2, obj3, (Composer) obj4, ((Number) obj5).intValue());
        return C11921v.f18618a;
    }

    @Composable
    public final void invoke(P1 p1, P2 p2, P3 p3, Composer composer, int i) {
        int i2;
        if ((i & 14) == 0) {
            i2 = (composer.changed((Object) p1) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            i2 |= composer.changed((Object) p2) ? 32 : 16;
        }
        if ((i & MediaRouterJellybean.DEVICE_OUT_BLUETOOTH) == 0) {
            i2 |= composer.changed((Object) p3) ? 256 : 128;
        }
        if ((i2 & 5851) != 1170 || !composer.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1083870185, i, -1, "androidx.compose.runtime.movableContentOf.<anonymous> (MovableContent.kt:117)");
            }
            composer.insertMovableContent(this.$movableContent, C11915r.m25707a(C11915r.m25707a(p1, p2), p3));
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
                return;
            }
            return;
        }
        composer.skipToGroupEnd();
    }
}
