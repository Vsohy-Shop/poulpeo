package androidx.compose.material3.internal;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import kotlin.jvm.internal.C12777p;
import p336ef.C11921v;
import p404of.C13088o;

/* renamed from: androidx.compose.material3.internal.ComposableSingletons$ExposedDropdownMenuPopupKt$lambda-1$1  reason: invalid class name */
/* compiled from: ExposedDropdownMenuPopup.kt */
final class ComposableSingletons$ExposedDropdownMenuPopupKt$lambda1$1 extends C12777p implements C13088o<Composer, Integer, C11921v> {
    public static final ComposableSingletons$ExposedDropdownMenuPopupKt$lambda1$1 INSTANCE = new ComposableSingletons$ExposedDropdownMenuPopupKt$lambda1$1();

    ComposableSingletons$ExposedDropdownMenuPopupKt$lambda1$1() {
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
                ComposerKt.traceEventStart(1584933307, i, -1, "androidx.compose.material3.internal.ComposableSingletons$ExposedDropdownMenuPopupKt.lambda-1.<anonymous> (ExposedDropdownMenuPopup.kt:284)");
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
