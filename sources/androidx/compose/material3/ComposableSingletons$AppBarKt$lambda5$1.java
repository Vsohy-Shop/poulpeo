package androidx.compose.material3;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import kotlin.jvm.internal.C12777p;
import p336ef.C11921v;
import p404of.C13088o;

/* renamed from: androidx.compose.material3.ComposableSingletons$AppBarKt$lambda-5$1  reason: invalid class name */
/* compiled from: AppBar.kt */
final class ComposableSingletons$AppBarKt$lambda5$1 extends C12777p implements C13088o<Composer, Integer, C11921v> {
    public static final ComposableSingletons$AppBarKt$lambda5$1 INSTANCE = new ComposableSingletons$AppBarKt$lambda5$1();

    ComposableSingletons$AppBarKt$lambda5$1() {
        super(2);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((Composer) obj, ((Number) obj2).intValue());
        return C11921v.f18618a;
    }

    @Composable
    public final void invoke(Composer composer, int i) {
        if ((i & 11) != 2 || !composer.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1103559359, i, -1, "androidx.compose.material3.ComposableSingletons$AppBarKt.lambda-5.<anonymous> (AppBar.kt:226)");
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
                return;
            }
            return;
        }
        composer.skipToGroupEnd();
    }
}
