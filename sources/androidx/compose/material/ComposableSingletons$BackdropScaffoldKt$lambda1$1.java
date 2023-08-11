package androidx.compose.material;

import androidx.compose.p002ui.Modifier;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import p336ef.C11921v;
import p404of.C13089p;

/* renamed from: androidx.compose.material.ComposableSingletons$BackdropScaffoldKt$lambda-1$1  reason: invalid class name */
/* compiled from: BackdropScaffold.kt */
final class ComposableSingletons$BackdropScaffoldKt$lambda1$1 extends C12777p implements C13089p<SnackbarHostState, Composer, Integer, C11921v> {
    public static final ComposableSingletons$BackdropScaffoldKt$lambda1$1 INSTANCE = new ComposableSingletons$BackdropScaffoldKt$lambda1$1();

    ComposableSingletons$BackdropScaffoldKt$lambda1$1() {
        super(3);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        invoke((SnackbarHostState) obj, (Composer) obj2, ((Number) obj3).intValue());
        return C11921v.f18618a;
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void invoke(SnackbarHostState snackbarHostState, Composer composer, int i) {
        C12775o.m28639i(snackbarHostState, "it");
        if ((i & 14) == 0) {
            i |= composer.changed((Object) snackbarHostState) ? 4 : 2;
        }
        if ((i & 91) != 18 || !composer.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(229445492, i, -1, "androidx.compose.material.ComposableSingletons$BackdropScaffoldKt.lambda-1.<anonymous> (BackdropScaffold.kt:273)");
            }
            SnackbarHostKt.SnackbarHost(snackbarHostState, (Modifier) null, (C13089p<? super SnackbarData, ? super Composer, ? super Integer, C11921v>) null, composer, i & 14, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
                return;
            }
            return;
        }
        composer.skipToGroupEnd();
    }
}
