package androidx.compose.runtime;

import kotlin.jvm.internal.C12777p;
import p336ef.C11921v;
import p404of.C13089p;

/* compiled from: MovableContent.kt */
final class MovableContentKt$movableContentWithReceiverOf$movableContent$1 extends C12777p implements C13089p<R, Composer, Integer, C11921v> {
    final /* synthetic */ C13089p<R, Composer, Integer, C11921v> $content;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    MovableContentKt$movableContentWithReceiverOf$movableContent$1(C13089p<? super R, ? super Composer, ? super Integer, C11921v> pVar) {
        super(3);
        this.$content = pVar;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        invoke(obj, (Composer) obj2, ((Number) obj3).intValue());
        return C11921v.f18618a;
    }

    @Composable
    public final void invoke(R r, Composer composer, int i) {
        if ((i & 14) == 0) {
            i |= composer.changed((Object) r) ? 4 : 2;
        }
        if ((i & 91) != 18 || !composer.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(250838178, i, -1, "androidx.compose.runtime.movableContentWithReceiverOf.<anonymous> (MovableContent.kt:170)");
            }
            this.$content.invoke(r, composer, Integer.valueOf(i & 14));
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
                return;
            }
            return;
        }
        composer.skipToGroupEnd();
    }
}
