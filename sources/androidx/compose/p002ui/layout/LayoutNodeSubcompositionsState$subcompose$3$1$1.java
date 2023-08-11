package androidx.compose.p002ui.layout;

import androidx.compose.p002ui.layout.LayoutNodeSubcompositionsState;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import kotlin.jvm.internal.C12777p;
import kotlin.jvm.internal.SourceDebugExtension;
import p336ef.C11921v;
import p404of.C13088o;

@SourceDebugExtension({"SMAP\nSubcomposeLayout.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SubcomposeLayout.kt\nandroidx/compose/ui/layout/LayoutNodeSubcompositionsState$subcompose$3$1$1\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n*L\n1#1,774:1\n169#2,9:775\n*S KotlinDebug\n*F\n+ 1 SubcomposeLayout.kt\nandroidx/compose/ui/layout/LayoutNodeSubcompositionsState$subcompose$3$1$1\n*L\n447#1:775,9\n*E\n"})
/* renamed from: androidx.compose.ui.layout.LayoutNodeSubcompositionsState$subcompose$3$1$1 */
/* compiled from: SubcomposeLayout.kt */
final class LayoutNodeSubcompositionsState$subcompose$3$1$1 extends C12777p implements C13088o<Composer, Integer, C11921v> {
    final /* synthetic */ C13088o<Composer, Integer, C11921v> $content;
    final /* synthetic */ LayoutNodeSubcompositionsState.NodeState $nodeState;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    LayoutNodeSubcompositionsState$subcompose$3$1$1(LayoutNodeSubcompositionsState.NodeState nodeState, C13088o<? super Composer, ? super Integer, C11921v> oVar) {
        super(2);
        this.$nodeState = nodeState;
        this.$content = oVar;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((Composer) obj, ((Number) obj2).intValue());
        return C11921v.f18618a;
    }

    @Composable
    public final void invoke(Composer composer, int i) {
        if ((i & 11) != 2 || !composer.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-34810602, i, -1, "androidx.compose.ui.layout.LayoutNodeSubcompositionsState.subcompose.<anonymous>.<anonymous>.<anonymous> (SubcomposeLayout.kt:445)");
            }
            boolean active = this.$nodeState.getActive();
            C13088o<Composer, Integer, C11921v> oVar = this.$content;
            composer.startReusableGroup(ComposerKt.reuseKey, Boolean.valueOf(active));
            boolean changed = composer.changed(active);
            if (active) {
                oVar.invoke(composer, 0);
            } else {
                composer.deactivateToEndGroup(changed);
            }
            composer.endReusableGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
                return;
            }
            return;
        }
        composer.skipToGroupEnd();
    }
}
