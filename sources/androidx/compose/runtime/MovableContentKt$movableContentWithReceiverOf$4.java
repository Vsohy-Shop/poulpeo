package androidx.compose.runtime;

import kotlin.jvm.internal.C12777p;
import p336ef.C11906l;
import p336ef.C11915r;
import p336ef.C11921v;
import p404of.C13092s;

/* compiled from: MovableContent.kt */
final class MovableContentKt$movableContentWithReceiverOf$4 extends C12777p implements C13092s<R, P1, P2, P3, Composer, Integer, C11921v> {
    final /* synthetic */ MovableContent<C11906l<C11906l<R, P1>, C11906l<P2, P3>>> $movableContent;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    MovableContentKt$movableContentWithReceiverOf$4(MovableContent<C11906l<C11906l<R, P1>, C11906l<P2, P3>>> movableContent) {
        super(6);
        this.$movableContent = movableContent;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        invoke(obj, obj2, obj3, obj4, (Composer) obj5, ((Number) obj6).intValue());
        return C11921v.f18618a;
    }

    @Composable
    public final void invoke(R r, P1 p1, P2 p2, P3 p3, Composer composer, int i) {
        int i2;
        if ((i & 14) == 0) {
            i2 = (composer.changed((Object) r) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            i2 |= composer.changed((Object) p1) ? 32 : 16;
        }
        if ((i & MediaRouterJellybean.DEVICE_OUT_BLUETOOTH) == 0) {
            i2 |= composer.changed((Object) p2) ? 256 : 128;
        }
        if ((i & 7168) == 0) {
            i2 |= composer.changed((Object) p3) ? 2048 : 1024;
        }
        if ((i2 & 46811) != 9362 || !composer.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1468683306, i, -1, "androidx.compose.runtime.movableContentWithReceiverOf.<anonymous> (MovableContent.kt:256)");
            }
            composer.insertMovableContent(this.$movableContent, C11915r.m25707a(C11915r.m25707a(r, p1), C11915r.m25707a(p2, p3)));
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
                return;
            }
            return;
        }
        composer.skipToGroupEnd();
    }
}
