package androidx.compose.foundation.text;

import androidx.compose.p002ui.Modifier;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import kotlin.jvm.internal.C12777p;
import p336ef.C11921v;
import p404of.C13088o;

/* compiled from: AndroidCursorHandle.android.kt */
final class AndroidCursorHandle_androidKt$CursorHandle$1 extends C12777p implements C13088o<Composer, Integer, C11921v> {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ C13088o<Composer, Integer, C11921v> $content;
    final /* synthetic */ Modifier $modifier;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    AndroidCursorHandle_androidKt$CursorHandle$1(C13088o<? super Composer, ? super Integer, C11921v> oVar, Modifier modifier, int i) {
        super(2);
        this.$content = oVar;
        this.$modifier = modifier;
        this.$$dirty = i;
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
                ComposerKt.traceEventStart(-1458480226, i, -1, "androidx.compose.foundation.text.CursorHandle.<anonymous> (AndroidCursorHandle.android.kt:46)");
            }
            if (this.$content == null) {
                composer.startReplaceableGroup(1275643833);
                AndroidCursorHandle_androidKt.DefaultCursorHandle(this.$modifier, composer, (this.$$dirty >> 3) & 14);
                composer.endReplaceableGroup();
            } else {
                composer.startReplaceableGroup(1275643903);
                this.$content.invoke(composer, Integer.valueOf((this.$$dirty >> 6) & 14));
                composer.endReplaceableGroup();
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
