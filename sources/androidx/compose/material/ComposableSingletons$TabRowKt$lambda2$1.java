package androidx.compose.material;

import androidx.compose.p002ui.Modifier;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import kotlin.jvm.internal.C12777p;
import p336ef.C11921v;
import p404of.C13088o;

/* renamed from: androidx.compose.material.ComposableSingletons$TabRowKt$lambda-2$1  reason: invalid class name */
/* compiled from: TabRow.kt */
final class ComposableSingletons$TabRowKt$lambda2$1 extends C12777p implements C13088o<Composer, Integer, C11921v> {
    public static final ComposableSingletons$TabRowKt$lambda2$1 INSTANCE = new ComposableSingletons$TabRowKt$lambda2$1();

    ComposableSingletons$TabRowKt$lambda2$1() {
        super(2);
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
                ComposerKt.traceEventStart(-1480449365, i, -1, "androidx.compose.material.ComposableSingletons$TabRowKt.lambda-2.<anonymous> (TabRow.kt:235)");
            }
            TabRowDefaults.INSTANCE.m34164Divider9IZ8Weo((Modifier) null, 0.0f, 0, composer, 3072, 7);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
                return;
            }
            return;
        }
        composer.skipToGroupEnd();
    }
}
