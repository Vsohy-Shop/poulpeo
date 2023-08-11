package androidx.compose.material;

import androidx.compose.foundation.Indication;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.selection.SelectableKt;
import androidx.compose.p002ui.Alignment;
import androidx.compose.p002ui.Modifier;
import androidx.compose.p002ui.graphics.Shadow;
import androidx.compose.p002ui.layout.LayoutKt;
import androidx.compose.p002ui.layout.MeasurePolicy;
import androidx.compose.p002ui.node.ComposeUiNode;
import androidx.compose.p002ui.platform.CompositionLocalsKt;
import androidx.compose.p002ui.platform.ViewConfiguration;
import androidx.compose.p002ui.semantics.Role;
import androidx.compose.p002ui.text.PlatformTextStyle;
import androidx.compose.p002ui.text.TextStyle;
import androidx.compose.p002ui.text.font.FontFamily;
import androidx.compose.p002ui.text.font.FontStyle;
import androidx.compose.p002ui.text.font.FontSynthesis;
import androidx.compose.p002ui.text.font.FontWeight;
import androidx.compose.p002ui.text.intl.LocaleList;
import androidx.compose.p002ui.text.style.BaselineShift;
import androidx.compose.p002ui.text.style.Hyphens;
import androidx.compose.p002ui.text.style.LineBreak;
import androidx.compose.p002ui.text.style.LineHeightStyle;
import androidx.compose.p002ui.text.style.TextAlign;
import androidx.compose.p002ui.text.style.TextDecoration;
import androidx.compose.p002ui.text.style.TextDirection;
import androidx.compose.p002ui.text.style.TextGeometricTransform;
import androidx.compose.p002ui.text.style.TextIndent;
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

@SourceDebugExtension({"SMAP\nTab.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Tab.kt\nandroidx/compose/material/TabKt$LeadingIconTab$2\n+ 2 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n*L\n1#1,434:1\n79#2,2:435\n81#2:463\n85#2:468\n75#3:437\n76#3,11:439\n89#3:467\n76#4:438\n460#5,13:450\n473#5,3:464\n*S KotlinDebug\n*F\n+ 1 Tab.kt\nandroidx/compose/material/TabKt$LeadingIconTab$2\n*L\n169#1:435,2\n169#1:463\n169#1:468\n169#1:437\n169#1:439,11\n169#1:467\n169#1:438\n169#1:450,13\n169#1:464,3\n*E\n"})
/* compiled from: Tab.kt */
final class TabKt$LeadingIconTab$2 extends C12777p implements C13088o<Composer, Integer, C11921v> {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ boolean $enabled;
    final /* synthetic */ C13088o<Composer, Integer, C11921v> $icon;
    final /* synthetic */ MutableInteractionSource $interactionSource;
    final /* synthetic */ Modifier $modifier;
    final /* synthetic */ C13074a<C11921v> $onClick;
    final /* synthetic */ Indication $ripple;
    final /* synthetic */ boolean $selected;
    final /* synthetic */ C13088o<Composer, Integer, C11921v> $text;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    TabKt$LeadingIconTab$2(Modifier modifier, boolean z, MutableInteractionSource mutableInteractionSource, Indication indication, boolean z2, C13074a<C11921v> aVar, C13088o<? super Composer, ? super Integer, C11921v> oVar, int i, C13088o<? super Composer, ? super Integer, C11921v> oVar2) {
        super(2);
        this.$modifier = modifier;
        this.$selected = z;
        this.$interactionSource = mutableInteractionSource;
        this.$ripple = indication;
        this.$enabled = z2;
        this.$onClick = aVar;
        this.$icon = oVar;
        this.$$dirty = i;
        this.$text = oVar2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((Composer) obj, ((Number) obj2).intValue());
        return C11921v.f18618a;
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void invoke(Composer composer, int i) {
        Composer composer2 = composer;
        int i2 = i;
        if ((i2 & 11) != 2 || !composer.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(866677691, i2, -1, "androidx.compose.material.LeadingIconTab.<anonymous> (Tab.kt:167)");
            }
            Modifier fillMaxWidth$default = SizeKt.fillMaxWidth$default(PaddingKt.m33270paddingVpY3zN4$default(SelectableKt.m33587selectableO2vRcR0(SizeKt.m33324height3ABfNKs(this.$modifier, TabKt.SmallTabHeight), this.$selected, this.$interactionSource, this.$ripple, this.$enabled, Role.m37807boximpl(Role.Companion.m37820getTabo7Vup1c()), this.$onClick), TabKt.HorizontalTextPadding, 0.0f, 2, (Object) null), 0.0f, 1, (Object) null);
            Arrangement.HorizontalOrVertical center = Arrangement.INSTANCE.getCenter();
            Alignment.Vertical centerVertically = Alignment.Companion.getCenterVertically();
            C13088o<Composer, Integer, C11921v> oVar = this.$icon;
            int i3 = this.$$dirty;
            C13088o<Composer, Integer, C11921v> oVar2 = this.$text;
            composer2.startReplaceableGroup(693286680);
            MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(center, centerVertically, composer2, 54);
            composer2.startReplaceableGroup(-1323940314);
            Density density = (Density) composer2.consume(CompositionLocalsKt.getLocalDensity());
            LayoutDirection layoutDirection = (LayoutDirection) composer2.consume(CompositionLocalsKt.getLocalLayoutDirection());
            ViewConfiguration viewConfiguration = (ViewConfiguration) composer2.consume(CompositionLocalsKt.getLocalViewConfiguration());
            ComposeUiNode.Companion companion = ComposeUiNode.Companion;
            C13074a<ComposeUiNode> constructor = companion.getConstructor();
            C13089p<SkippableUpdater<ComposeUiNode>, Composer, Integer, C11921v> materializerOf = LayoutKt.materializerOf(fillMaxWidth$default);
            if (!(composer.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composer.startReusableNode();
            if (composer.getInserting()) {
                composer2.createNode(constructor);
            } else {
                composer.useNode();
            }
            composer.disableReusing();
            Composer r11 = Updater.m35292constructorimpl(composer);
            Updater.m35299setimpl(r11, rowMeasurePolicy, companion.getSetMeasurePolicy());
            Updater.m35299setimpl(r11, density, companion.getSetDensity());
            Updater.m35299setimpl(r11, layoutDirection, companion.getSetLayoutDirection());
            Updater.m35299setimpl(r11, viewConfiguration, companion.getSetViewConfiguration());
            composer.enableReusing();
            materializerOf.invoke(SkippableUpdater.m35283boximpl(SkippableUpdater.m35284constructorimpl(composer)), composer2, 0);
            composer2.startReplaceableGroup(2058660585);
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            oVar.invoke(composer2, Integer.valueOf((i3 >> 9) & 14));
            SpacerKt.Spacer(SizeKt.m33335requiredWidth3ABfNKs(Modifier.Companion, TabKt.TextDistanceFromLeadingIcon), composer2, 6);
            TextKt.ProvideTextStyle(TextStyle.m37983copyCXVQc50$default(MaterialTheme.INSTANCE.getTypography(composer2, 6).getButton(), 0, 0, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0, (TextDecoration) null, (Shadow) null, TextAlign.m38341boximpl(TextAlign.Companion.m38348getCentere0LSkKk()), (TextDirection) null, 0, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, (LineBreak) null, (Hyphens) null, 4177919, (Object) null), oVar2, composer2, (i3 >> 3) & 112);
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
