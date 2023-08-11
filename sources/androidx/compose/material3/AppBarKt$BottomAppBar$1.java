package androidx.compose.material3;

import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.p002ui.Alignment;
import androidx.compose.p002ui.Modifier;
import androidx.compose.p002ui.layout.LayoutKt;
import androidx.compose.p002ui.layout.MeasurePolicy;
import androidx.compose.p002ui.node.ComposeUiNode;
import androidx.compose.p002ui.platform.CompositionLocalsKt;
import androidx.compose.p002ui.platform.ViewConfiguration;
import androidx.compose.p002ui.unit.Density;
import androidx.compose.p002ui.unit.LayoutDirection;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.Updater;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import p336ef.C11921v;
import p404of.C13074a;
import p404of.C13088o;
import p404of.C13089p;

/* compiled from: AppBar.kt */
final class AppBarKt$BottomAppBar$1 extends C12777p implements C13089p<RowScope, Composer, Integer, C11921v> {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ C13089p<RowScope, Composer, Integer, C11921v> $actions;
    final /* synthetic */ C13088o<Composer, Integer, C11921v> $floatingActionButton;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    AppBarKt$BottomAppBar$1(C13089p<? super RowScope, ? super Composer, ? super Integer, C11921v> pVar, int i, C13088o<? super Composer, ? super Integer, C11921v> oVar) {
        super(3);
        this.$actions = pVar;
        this.$$dirty = i;
        this.$floatingActionButton = oVar;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        invoke((RowScope) obj, (Composer) obj2, ((Number) obj3).intValue());
        return C11921v.f18618a;
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void invoke(RowScope rowScope, Composer composer, int i) {
        C12775o.m28639i(rowScope, "$this$BottomAppBar");
        if ((i & 14) == 0) {
            i |= composer.changed((Object) rowScope) ? 4 : 2;
        }
        if ((i & 91) != 18 || !composer.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1974005449, i, -1, "androidx.compose.material3.BottomAppBar.<anonymous> (AppBar.kt:409)");
            }
            this.$actions.invoke(rowScope, composer, Integer.valueOf((i & 14) | ((this.$$dirty << 3) & 112)));
            if (this.$floatingActionButton != null) {
                Modifier.Companion companion = Modifier.Companion;
                SpacerKt.Spacer(rowScope.weight(companion, 1.0f, true), composer, 0);
                Modifier r11 = PaddingKt.m33272paddingqDBjuR0$default(SizeKt.fillMaxHeight$default(companion, 0.0f, 1, (Object) null), 0.0f, AppBarKt.FABVerticalPadding, AppBarKt.FABHorizontalPadding, 0.0f, 9, (Object) null);
                Alignment topStart = Alignment.Companion.getTopStart();
                C13088o<Composer, Integer, C11921v> oVar = this.$floatingActionButton;
                int i2 = this.$$dirty;
                composer.startReplaceableGroup(733328855);
                MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(topStart, false, composer, 6);
                composer.startReplaceableGroup(-1323940314);
                Density density = (Density) composer.consume(CompositionLocalsKt.getLocalDensity());
                LayoutDirection layoutDirection = (LayoutDirection) composer.consume(CompositionLocalsKt.getLocalLayoutDirection());
                ViewConfiguration viewConfiguration = (ViewConfiguration) composer.consume(CompositionLocalsKt.getLocalViewConfiguration());
                ComposeUiNode.Companion companion2 = ComposeUiNode.Companion;
                C13074a<ComposeUiNode> constructor = companion2.getConstructor();
                C13089p<SkippableUpdater<ComposeUiNode>, Composer, Integer, C11921v> materializerOf = LayoutKt.materializerOf(r11);
                if (!(composer.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composer.startReusableNode();
                if (composer.getInserting()) {
                    composer.createNode(constructor);
                } else {
                    composer.useNode();
                }
                composer.disableReusing();
                Composer r8 = Updater.m35292constructorimpl(composer);
                Updater.m35299setimpl(r8, rememberBoxMeasurePolicy, companion2.getSetMeasurePolicy());
                Updater.m35299setimpl(r8, density, companion2.getSetDensity());
                Updater.m35299setimpl(r8, layoutDirection, companion2.getSetLayoutDirection());
                Updater.m35299setimpl(r8, viewConfiguration, companion2.getSetViewConfiguration());
                composer.enableReusing();
                materializerOf.invoke(SkippableUpdater.m35283boximpl(SkippableUpdater.m35284constructorimpl(composer)), composer, 0);
                composer.startReplaceableGroup(2058660585);
                composer.startReplaceableGroup(-2137368960);
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                composer.startReplaceableGroup(1812284970);
                oVar.invoke(composer, Integer.valueOf((i2 >> 6) & 14));
                composer.endReplaceableGroup();
                composer.endReplaceableGroup();
                composer.endReplaceableGroup();
                composer.endNode();
                composer.endReplaceableGroup();
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
