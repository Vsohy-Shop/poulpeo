package androidx.compose.material3;

import androidx.compose.foundation.layout.RowScope;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import p336ef.C11921v;
import p404of.C13089p;

/* renamed from: androidx.compose.material3.ComposableSingletons$AppBarKt$lambda-8$1  reason: invalid class name */
/* compiled from: AppBar.kt */
final class ComposableSingletons$AppBarKt$lambda8$1 extends C12777p implements C13089p<RowScope, Composer, Integer, C11921v> {
    public static final ComposableSingletons$AppBarKt$lambda8$1 INSTANCE = new ComposableSingletons$AppBarKt$lambda8$1();

    ComposableSingletons$AppBarKt$lambda8$1() {
        super(3);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        invoke((RowScope) obj, (Composer) obj2, ((Number) obj3).intValue());
        return C11921v.f18618a;
    }

    @Composable
    public final void invoke(RowScope rowScope, Composer composer, int i) {
        C12775o.m28639i(rowScope, "$this$null");
        if ((i & 81) != 16 || !composer.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-994959539, i, -1, "androidx.compose.material3.ComposableSingletons$AppBarKt.lambda-8.<anonymous> (AppBar.kt:282)");
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
