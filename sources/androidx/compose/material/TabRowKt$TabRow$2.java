package androidx.compose.material;

import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.p002ui.Modifier;
import androidx.compose.p002ui.layout.SubcomposeLayoutKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import java.util.List;
import kotlin.jvm.internal.C12777p;
import kotlin.jvm.internal.SourceDebugExtension;
import p336ef.C11921v;
import p404of.C13088o;
import p404of.C13089p;

@SourceDebugExtension({"SMAP\nTabRow.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TabRow.kt\nandroidx/compose/material/TabRowKt$TabRow$2\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,517:1\n67#2,3:518\n66#2:521\n1114#3,6:522\n*S KotlinDebug\n*F\n+ 1 TabRow.kt\nandroidx/compose/material/TabRowKt$TabRow$2\n*L\n151#1:518,3\n151#1:521\n151#1:522,6\n*E\n"})
/* compiled from: TabRow.kt */
final class TabRowKt$TabRow$2 extends C12777p implements C13088o<Composer, Integer, C11921v> {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ C13088o<Composer, Integer, C11921v> $divider;
    final /* synthetic */ C13089p<List<TabPosition>, Composer, Integer, C11921v> $indicator;
    final /* synthetic */ C13088o<Composer, Integer, C11921v> $tabs;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    TabRowKt$TabRow$2(C13088o<? super Composer, ? super Integer, C11921v> oVar, C13088o<? super Composer, ? super Integer, C11921v> oVar2, C13089p<? super List<TabPosition>, ? super Composer, ? super Integer, C11921v> pVar, int i) {
        super(2);
        this.$tabs = oVar;
        this.$divider = oVar2;
        this.$indicator = pVar;
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
                ComposerKt.traceEventStart(-1961746365, i, -1, "androidx.compose.material.TabRow.<anonymous> (TabRow.kt:149)");
            }
            Modifier fillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, (Object) null);
            C13088o<Composer, Integer, C11921v> oVar = this.$tabs;
            C13088o<Composer, Integer, C11921v> oVar2 = this.$divider;
            C13089p<List<TabPosition>, Composer, Integer, C11921v> pVar = this.$indicator;
            int i2 = this.$$dirty;
            composer.startReplaceableGroup(1618982084);
            boolean changed = composer.changed((Object) oVar) | composer.changed((Object) oVar2) | composer.changed((Object) pVar);
            Object rememberedValue = composer.rememberedValue();
            if (changed || rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = new TabRowKt$TabRow$2$1$1(oVar, oVar2, pVar, i2);
                composer.updateRememberedValue(rememberedValue);
            }
            composer.endReplaceableGroup();
            SubcomposeLayoutKt.SubcomposeLayout(fillMaxWidth$default, (C13088o) rememberedValue, composer, 6, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
                return;
            }
            return;
        }
        composer.skipToGroupEnd();
    }
}
