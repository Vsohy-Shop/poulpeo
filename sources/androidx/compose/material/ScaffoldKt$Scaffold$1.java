package androidx.compose.material;

import androidx.compose.p002ui.Modifier;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import kotlin.jvm.internal.C12777p;
import p336ef.C11921v;
import p404of.C13088o;
import p404of.C13089p;

/* compiled from: Scaffold.kt */
final class ScaffoldKt$Scaffold$1 extends C12777p implements C13088o<Composer, Integer, C11921v> {
    final /* synthetic */ C13089p<Modifier, Composer, Integer, C11921v> $child;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    ScaffoldKt$Scaffold$1(C13089p<? super Modifier, ? super Composer, ? super Integer, C11921v> pVar) {
        super(2);
        this.$child = pVar;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((Composer) obj, ((Number) obj2).intValue());
        return C11921v.f18618a;
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void invoke(Composer composer, int i) {
        if ((i & 11) != 2 || !composer.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(100842932, i, -1, "androidx.compose.material.Scaffold.<anonymous> (Scaffold.kt:205)");
            }
            this.$child.invoke(Modifier.Companion, composer, 54);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
                return;
            }
            return;
        }
        composer.skipToGroupEnd();
    }
}
