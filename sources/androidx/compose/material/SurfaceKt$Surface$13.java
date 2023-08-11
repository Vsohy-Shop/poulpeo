package androidx.compose.material;

import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.Indication;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.p002ui.Alignment;
import androidx.compose.p002ui.Modifier;
import androidx.compose.p002ui.graphics.Shape;
import androidx.compose.p002ui.layout.LayoutKt;
import androidx.compose.p002ui.layout.MeasurePolicy;
import androidx.compose.p002ui.node.ComposeUiNode;
import androidx.compose.p002ui.platform.CompositionLocalsKt;
import androidx.compose.p002ui.platform.ViewConfiguration;
import androidx.compose.p002ui.semantics.Role;
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

@SourceDebugExtension({"SMAP\nSurface.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Surface.kt\nandroidx/compose/material/SurfaceKt$Surface$13\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n*L\n1#1,641:1\n76#2:642\n76#2:650\n67#3,6:643\n73#3:675\n77#3:680\n75#4:649\n76#4,11:651\n89#4:679\n460#5,13:662\n473#5,3:676\n*S KotlinDebug\n*F\n+ 1 Surface.kt\nandroidx/compose/material/SurfaceKt$Surface$13\n*L\n596#1:642\n589#1:650\n589#1:643,6\n589#1:675\n589#1:680\n589#1:649\n589#1:651,11\n589#1:679\n589#1:662,13\n589#1:676,3\n*E\n"})
/* compiled from: Surface.kt */
final class SurfaceKt$Surface$13 extends C12777p implements C13088o<Composer, Integer, C11921v> {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ int $$dirty1;
    final /* synthetic */ float $absoluteElevation;
    final /* synthetic */ BorderStroke $border;
    final /* synthetic */ long $color;
    final /* synthetic */ C13088o<Composer, Integer, C11921v> $content;
    final /* synthetic */ float $elevation;
    final /* synthetic */ boolean $enabled;
    final /* synthetic */ Indication $indication;
    final /* synthetic */ MutableInteractionSource $interactionSource;
    final /* synthetic */ Modifier $modifier;
    final /* synthetic */ C13074a<C11921v> $onClick;
    final /* synthetic */ String $onClickLabel;
    final /* synthetic */ Role $role;
    final /* synthetic */ Shape $shape;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    SurfaceKt$Surface$13(Modifier modifier, Shape shape, long j, float f, int i, BorderStroke borderStroke, float f2, MutableInteractionSource mutableInteractionSource, Indication indication, boolean z, String str, Role role, C13074a<C11921v> aVar, C13088o<? super Composer, ? super Integer, C11921v> oVar, int i2) {
        super(2);
        this.$modifier = modifier;
        this.$shape = shape;
        this.$color = j;
        this.$absoluteElevation = f;
        this.$$dirty = i;
        this.$border = borderStroke;
        this.$elevation = f2;
        this.$interactionSource = mutableInteractionSource;
        this.$indication = indication;
        this.$enabled = z;
        this.$onClickLabel = str;
        this.$role = role;
        this.$onClick = aVar;
        this.$content = oVar;
        this.$$dirty1 = i2;
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
                ComposerKt.traceEventStart(149594672, i, -1, "androidx.compose.material.Surface.<anonymous> (Surface.kt:587)");
            }
            Modifier then = SurfaceKt.m34133surface8ww4TTg(InteractiveComponentSizeKt.minimumInteractiveComponentSize(this.$modifier), this.$shape, SurfaceKt.m34134surfaceColorAtElevationcq6XJ1M(this.$color, (ElevationOverlay) composer.consume(ElevationOverlayKt.getLocalElevationOverlay()), this.$absoluteElevation, composer, (this.$$dirty >> 9) & 14), this.$border, this.$elevation).then(ClickableKt.m32978clickableO2vRcR0(Modifier.Companion, this.$interactionSource, this.$indication, this.$enabled, this.$onClickLabel, this.$role, this.$onClick));
            C13088o<Composer, Integer, C11921v> oVar = this.$content;
            int i2 = this.$$dirty1;
            composer.startReplaceableGroup(733328855);
            MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(Alignment.Companion.getTopStart(), true, composer, 48);
            composer.startReplaceableGroup(-1323940314);
            Density density = (Density) composer.consume(CompositionLocalsKt.getLocalDensity());
            LayoutDirection layoutDirection = (LayoutDirection) composer.consume(CompositionLocalsKt.getLocalLayoutDirection());
            ViewConfiguration viewConfiguration = (ViewConfiguration) composer.consume(CompositionLocalsKt.getLocalViewConfiguration());
            ComposeUiNode.Companion companion = ComposeUiNode.Companion;
            C13074a<ComposeUiNode> constructor = companion.getConstructor();
            C13089p<SkippableUpdater<ComposeUiNode>, Composer, Integer, C11921v> materializerOf = LayoutKt.materializerOf(then);
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
            Composer r7 = Updater.m35292constructorimpl(composer);
            Updater.m35299setimpl(r7, rememberBoxMeasurePolicy, companion.getSetMeasurePolicy());
            Updater.m35299setimpl(r7, density, companion.getSetDensity());
            Updater.m35299setimpl(r7, layoutDirection, companion.getSetLayoutDirection());
            Updater.m35299setimpl(r7, viewConfiguration, companion.getSetViewConfiguration());
            composer.enableReusing();
            materializerOf.invoke(SkippableUpdater.m35283boximpl(SkippableUpdater.m35284constructorimpl(composer)), composer, 0);
            composer.startReplaceableGroup(2058660585);
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            oVar.invoke(composer, Integer.valueOf((i2 >> 6) & 14));
            composer.endReplaceableGroup();
            composer.endNode();
            composer.endReplaceableGroup();
            composer.endReplaceableGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
                return;
            }
            return;
        }
        composer.skipToGroupEnd();
    }
}
