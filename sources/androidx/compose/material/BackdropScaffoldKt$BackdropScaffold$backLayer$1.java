package androidx.compose.material;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
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
import kotlin.jvm.internal.C12777p;
import kotlin.jvm.internal.SourceDebugExtension;
import p336ef.C11921v;
import p404of.C13074a;
import p404of.C13088o;
import p404of.C13089p;

@SourceDebugExtension({"SMAP\nBackdropScaffold.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BackdropScaffold.kt\nandroidx/compose/material/BackdropScaffoldKt$BackdropScaffold$backLayer$1\n+ 2 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n*L\n1#1,522:1\n73#2,7:523\n80#2:556\n84#2:561\n75#3:530\n76#3,11:532\n89#3:560\n76#4:531\n460#5,13:543\n473#5,3:557\n*S KotlinDebug\n*F\n+ 1 BackdropScaffold.kt\nandroidx/compose/material/BackdropScaffoldKt$BackdropScaffold$backLayer$1\n*L\n281#1:523,7\n281#1:556\n281#1:561\n281#1:530\n281#1:532,11\n281#1:560\n281#1:531\n281#1:543,13\n281#1:557,3\n*E\n"})
/* compiled from: BackdropScaffold.kt */
final class BackdropScaffoldKt$BackdropScaffold$backLayer$1 extends C12777p implements C13088o<Composer, Integer, C11921v> {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ C13088o<Composer, Integer, C11921v> $appBar;
    final /* synthetic */ C13088o<Composer, Integer, C11921v> $backLayerContent;
    final /* synthetic */ boolean $persistentAppBar;
    final /* synthetic */ BackdropScaffoldState $scaffoldState;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    BackdropScaffoldKt$BackdropScaffold$backLayer$1(boolean z, BackdropScaffoldState backdropScaffoldState, C13088o<? super Composer, ? super Integer, C11921v> oVar, C13088o<? super Composer, ? super Integer, C11921v> oVar2, int i) {
        super(2);
        this.$persistentAppBar = z;
        this.$scaffoldState = backdropScaffoldState;
        this.$appBar = oVar;
        this.$backLayerContent = oVar2;
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
                ComposerKt.traceEventStart(1744778315, i, -1, "androidx.compose.material.BackdropScaffold.<anonymous> (BackdropScaffold.kt:278)");
            }
            if (this.$persistentAppBar) {
                composer.startReplaceableGroup(-1017265331);
                C13088o<Composer, Integer, C11921v> oVar = this.$appBar;
                int i2 = this.$$dirty;
                C13088o<Composer, Integer, C11921v> oVar2 = this.$backLayerContent;
                composer.startReplaceableGroup(-483455358);
                Modifier.Companion companion = Modifier.Companion;
                MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.Companion.getStart(), composer, 0);
                composer.startReplaceableGroup(-1323940314);
                Density density = (Density) composer.consume(CompositionLocalsKt.getLocalDensity());
                LayoutDirection layoutDirection = (LayoutDirection) composer.consume(CompositionLocalsKt.getLocalLayoutDirection());
                ViewConfiguration viewConfiguration = (ViewConfiguration) composer.consume(CompositionLocalsKt.getLocalViewConfiguration());
                ComposeUiNode.Companion companion2 = ComposeUiNode.Companion;
                C13074a<ComposeUiNode> constructor = companion2.getConstructor();
                C13089p<SkippableUpdater<ComposeUiNode>, Composer, Integer, C11921v> materializerOf = LayoutKt.materializerOf(companion);
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
                Composer r9 = Updater.m35292constructorimpl(composer);
                Updater.m35299setimpl(r9, columnMeasurePolicy, companion2.getSetMeasurePolicy());
                Updater.m35299setimpl(r9, density, companion2.getSetDensity());
                Updater.m35299setimpl(r9, layoutDirection, companion2.getSetLayoutDirection());
                Updater.m35299setimpl(r9, viewConfiguration, companion2.getSetViewConfiguration());
                composer.enableReusing();
                materializerOf.invoke(SkippableUpdater.m35283boximpl(SkippableUpdater.m35284constructorimpl(composer)), composer, 0);
                composer.startReplaceableGroup(2058660585);
                ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                oVar.invoke(composer, Integer.valueOf(i2 & 14));
                oVar2.invoke(composer, Integer.valueOf((i2 >> 3) & 14));
                composer.endReplaceableGroup();
                composer.endNode();
                composer.endReplaceableGroup();
                composer.endReplaceableGroup();
                composer.endReplaceableGroup();
            } else {
                composer.startReplaceableGroup(-1017265219);
                C13088o<Composer, Integer, C11921v> oVar3 = this.$appBar;
                C13088o<Composer, Integer, C11921v> oVar4 = this.$backLayerContent;
                int i3 = this.$$dirty;
                BackdropScaffoldKt.BackLayerTransition((BackdropValue) this.$scaffoldState.getTargetValue(), oVar3, oVar4, composer, ((i3 << 3) & MediaRouterJellybean.DEVICE_OUT_BLUETOOTH) | ((i3 << 3) & 112));
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
