package androidx.compose.material;

import androidx.compose.p002ui.Modifier;
import androidx.compose.p002ui.graphics.Shape;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import p336ef.C11921v;
import p404of.C13089p;

/* renamed from: androidx.compose.material.ComposableSingletons$SnackbarHostKt$lambda-1$1  reason: invalid class name */
/* compiled from: SnackbarHost.kt */
final class ComposableSingletons$SnackbarHostKt$lambda1$1 extends C12777p implements C13089p<SnackbarData, Composer, Integer, C11921v> {
    public static final ComposableSingletons$SnackbarHostKt$lambda1$1 INSTANCE = new ComposableSingletons$SnackbarHostKt$lambda1$1();

    ComposableSingletons$SnackbarHostKt$lambda1$1() {
        super(3);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        invoke((SnackbarData) obj, (Composer) obj2, ((Number) obj3).intValue());
        return C11921v.f18618a;
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void invoke(SnackbarData snackbarData, Composer composer, int i) {
        int i2;
        SnackbarData snackbarData2 = snackbarData;
        C12775o.m28639i(snackbarData2, "it");
        Composer composer2 = composer;
        if ((i & 14) == 0) {
            i2 = i | (composer2.changed((Object) snackbarData2) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i2 & 91) != 18 || !composer.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(996639038, i2, -1, "androidx.compose.material.ComposableSingletons$SnackbarHostKt.lambda-1.<anonymous> (SnackbarHost.kt:153)");
            }
            SnackbarKt.m34108SnackbarsPrSdHI(snackbarData, (Modifier) null, false, (Shape) null, 0, 0, 0, 0.0f, composer, i2 & 14, 254);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
                return;
            }
            return;
        }
        composer.skipToGroupEnd();
    }
}
