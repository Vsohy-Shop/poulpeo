package androidx.compose.material;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import kotlin.jvm.internal.C12777p;
import p336ef.C11921v;
import p404of.C13088o;

/* compiled from: ListItem.kt */
final class ThreeLine$ListItem$1$2 extends C12777p implements C13088o<Composer, Integer, C11921v> {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ C13088o<Composer, Integer, C11921v> $overlineText;
    final /* synthetic */ C13088o<Composer, Integer, C11921v> $secondaryText;
    final /* synthetic */ C13088o<Composer, Integer, C11921v> $text;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    ThreeLine$ListItem$1$2(C13088o<? super Composer, ? super Integer, C11921v> oVar, int i, C13088o<? super Composer, ? super Integer, C11921v> oVar2, C13088o<? super Composer, ? super Integer, C11921v> oVar3) {
        super(2);
        this.$overlineText = oVar;
        this.$$dirty = i;
        this.$text = oVar2;
        this.$secondaryText = oVar3;
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
                ComposerKt.traceEventStart(-318094245, i, -1, "androidx.compose.material.ThreeLine.ListItem.<anonymous>.<anonymous> (ListItem.kt:324)");
            }
            composer.startReplaceableGroup(-755940677);
            C13088o<Composer, Integer, C11921v> oVar = this.$overlineText;
            if (oVar != null) {
                oVar.invoke(composer, Integer.valueOf((this.$$dirty >> 12) & 14));
            }
            composer.endReplaceableGroup();
            this.$text.invoke(composer, Integer.valueOf((this.$$dirty >> 6) & 14));
            this.$secondaryText.invoke(composer, Integer.valueOf((this.$$dirty >> 9) & 14));
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
                return;
            }
            return;
        }
        composer.skipToGroupEnd();
    }
}
