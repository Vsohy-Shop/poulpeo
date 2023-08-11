package androidx.compose.foundation.text;

import androidx.compose.p002ui.text.AnnotatedString;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import java.util.List;
import kotlin.jvm.internal.C12777p;
import p336ef.C11921v;
import p404of.C13088o;
import p404of.C13089p;

/* compiled from: BasicText.kt */
final class BasicTextKt$BasicText$4 extends C12777p implements C13088o<Composer, Integer, C11921v> {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ List<AnnotatedString.Range<C13089p<String, Composer, Integer, C11921v>>> $inlineComposables;
    final /* synthetic */ AnnotatedString $text;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    BasicTextKt$BasicText$4(AnnotatedString annotatedString, List<AnnotatedString.Range<C13089p<String, Composer, Integer, C11921v>>> list, int i) {
        super(2);
        this.$text = annotatedString;
        this.$inlineComposables = list;
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
                ComposerKt.traceEventStart(1749415830, i, -1, "androidx.compose.foundation.text.BasicText.<anonymous> (BasicText.kt:256)");
            }
            CoreTextKt.InlineChildren(this.$text, this.$inlineComposables, composer, (this.$$dirty & 14) | 64);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
                return;
            }
            return;
        }
        composer.skipToGroupEnd();
    }
}
