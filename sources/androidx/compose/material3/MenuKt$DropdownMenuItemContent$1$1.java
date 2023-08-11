package androidx.compose.material3;

import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.tokens.MenuTokens;
import androidx.compose.p002ui.Alignment;
import androidx.compose.p002ui.Modifier;
import androidx.compose.p002ui.graphics.Color;
import androidx.compose.p002ui.layout.LayoutKt;
import androidx.compose.p002ui.layout.MeasurePolicy;
import androidx.compose.p002ui.node.ComposeUiNode;
import androidx.compose.p002ui.platform.CompositionLocalsKt;
import androidx.compose.p002ui.platform.ViewConfiguration;
import androidx.compose.p002ui.unit.C1232Dp;
import androidx.compose.p002ui.unit.Density;
import androidx.compose.p002ui.unit.LayoutDirection;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import kotlin.jvm.internal.C12777p;
import p336ef.C11921v;
import p404of.C13074a;
import p404of.C13088o;
import p404of.C13089p;

/* compiled from: Menu.kt */
final class MenuKt$DropdownMenuItemContent$1$1 extends C12777p implements C13088o<Composer, Integer, C11921v> {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ MenuItemColors $colors;
    final /* synthetic */ boolean $enabled;
    final /* synthetic */ C13088o<Composer, Integer, C11921v> $leadingIcon;
    final /* synthetic */ C13088o<Composer, Integer, C11921v> $text;
    final /* synthetic */ RowScope $this_Row;
    final /* synthetic */ C13088o<Composer, Integer, C11921v> $trailingIcon;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    MenuKt$DropdownMenuItemContent$1$1(C13088o<? super Composer, ? super Integer, C11921v> oVar, MenuItemColors menuItemColors, boolean z, int i, C13088o<? super Composer, ? super Integer, C11921v> oVar2, RowScope rowScope, C13088o<? super Composer, ? super Integer, C11921v> oVar3) {
        super(2);
        this.$leadingIcon = oVar;
        this.$colors = menuItemColors;
        this.$enabled = z;
        this.$$dirty = i;
        this.$trailingIcon = oVar2;
        this.$this_Row = rowScope;
        this.$text = oVar3;
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
                ComposerKt.traceEventStart(1065051884, i, -1, "androidx.compose.material3.DropdownMenuItemContent.<anonymous>.<anonymous> (Menu.kt:171)");
            }
            composer.startReplaceableGroup(1426254055);
            if (this.$leadingIcon != null) {
                ProvidableCompositionLocal<Color> localContentColor = ContentColorKt.getLocalContentColor();
                MenuItemColors menuItemColors = this.$colors;
                boolean z = this.$enabled;
                int i2 = this.$$dirty;
                ProvidedValue[] providedValueArr = {localContentColor.provides(menuItemColors.leadingIconColor$material3_release(z, composer, ((i2 >> 15) & 112) | ((i2 >> 15) & 14)).getValue())};
                final C13088o<Composer, Integer, C11921v> oVar = this.$leadingIcon;
                final int i3 = this.$$dirty;
                CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) providedValueArr, (C13088o<? super Composer, ? super Integer, C11921v>) ComposableLambdaKt.composableLambda(composer, 2035552199, true, new C13088o<Composer, Integer, C11921v>() {
                    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                        invoke((Composer) obj, ((Number) obj2).intValue());
                        return C11921v.f18618a;
                    }

                    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                    @Composable
                    public final void invoke(Composer composer, int i) {
                        if ((i & 11) != 2 || !composer.getSkipping()) {
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(2035552199, i, -1, "androidx.compose.material3.DropdownMenuItemContent.<anonymous>.<anonymous>.<anonymous> (Menu.kt:175)");
                            }
                            Modifier r12 = SizeKt.m33323defaultMinSizeVpY3zN4$default(Modifier.Companion, MenuTokens.INSTANCE.m35021getListItemLeadingIconSizeD9Ej5fM(), 0.0f, 2, (Object) null);
                            C13088o<Composer, Integer, C11921v> oVar = oVar;
                            int i2 = i3;
                            composer.startReplaceableGroup(733328855);
                            MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(Alignment.Companion.getTopStart(), false, composer, 0);
                            composer.startReplaceableGroup(-1323940314);
                            Density density = (Density) composer.consume(CompositionLocalsKt.getLocalDensity());
                            LayoutDirection layoutDirection = (LayoutDirection) composer.consume(CompositionLocalsKt.getLocalLayoutDirection());
                            ViewConfiguration viewConfiguration = (ViewConfiguration) composer.consume(CompositionLocalsKt.getLocalViewConfiguration());
                            ComposeUiNode.Companion companion = ComposeUiNode.Companion;
                            C13074a<ComposeUiNode> constructor = companion.getConstructor();
                            C13089p<SkippableUpdater<ComposeUiNode>, Composer, Integer, C11921v> materializerOf = LayoutKt.materializerOf(r12);
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
                            Updater.m35299setimpl(r8, rememberBoxMeasurePolicy, companion.getSetMeasurePolicy());
                            Updater.m35299setimpl(r8, density, companion.getSetDensity());
                            Updater.m35299setimpl(r8, layoutDirection, companion.getSetLayoutDirection());
                            Updater.m35299setimpl(r8, viewConfiguration, companion.getSetViewConfiguration());
                            composer.enableReusing();
                            materializerOf.invoke(SkippableUpdater.m35283boximpl(SkippableUpdater.m35284constructorimpl(composer)), composer, 0);
                            composer.startReplaceableGroup(2058660585);
                            composer.startReplaceableGroup(-2137368960);
                            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                            composer.startReplaceableGroup(1667854413);
                            oVar.invoke(composer, Integer.valueOf((i2 >> 9) & 14));
                            composer.endReplaceableGroup();
                            composer.endReplaceableGroup();
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
                }), composer, 56);
            }
            composer.endReplaceableGroup();
            ProvidableCompositionLocal<Color> localContentColor2 = ContentColorKt.getLocalContentColor();
            MenuItemColors menuItemColors2 = this.$colors;
            boolean z2 = this.$enabled;
            int i4 = this.$$dirty;
            ProvidedValue[] providedValueArr2 = {localContentColor2.provides(menuItemColors2.textColor$material3_release(z2, composer, ((i4 >> 15) & 112) | ((i4 >> 15) & 14)).getValue())};
            final RowScope rowScope = this.$this_Row;
            final C13088o<Composer, Integer, C11921v> oVar2 = this.$leadingIcon;
            final C13088o<Composer, Integer, C11921v> oVar3 = this.$trailingIcon;
            final C13088o<Composer, Integer, C11921v> oVar4 = this.$text;
            final int i5 = this.$$dirty;
            CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) providedValueArr2, (C13088o<? super Composer, ? super Integer, C11921v>) ComposableLambdaKt.composableLambda(composer, -1728894036, true, new C13088o<Composer, Integer, C11921v>() {
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((Composer) obj, ((Number) obj2).intValue());
                    return C11921v.f18618a;
                }

                @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                @Composable
                public final void invoke(Composer composer, int i) {
                    float f;
                    float f2;
                    Composer composer2 = composer;
                    int i2 = i;
                    if ((i2 & 11) != 2 || !composer.getSkipping()) {
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1728894036, i2, -1, "androidx.compose.material3.DropdownMenuItemContent.<anonymous>.<anonymous>.<anonymous> (Menu.kt:181)");
                        }
                        Modifier weight$default = RowScope.weight$default(rowScope, Modifier.Companion, 1.0f, false, 2, (Object) null);
                        if (oVar2 != null) {
                            f = MenuKt.DropdownMenuItemHorizontalPadding;
                        } else {
                            f = C1232Dp.m38468constructorimpl((float) 0);
                        }
                        float f3 = f;
                        if (oVar3 != null) {
                            f2 = MenuKt.DropdownMenuItemHorizontalPadding;
                        } else {
                            f2 = C1232Dp.m38468constructorimpl((float) 0);
                        }
                        Modifier r2 = PaddingKt.m33272paddingqDBjuR0$default(weight$default, f3, 0.0f, f2, 0.0f, 10, (Object) null);
                        C13088o<Composer, Integer, C11921v> oVar = oVar4;
                        int i3 = i5;
                        composer2.startReplaceableGroup(733328855);
                        MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(Alignment.Companion.getTopStart(), false, composer2, 0);
                        composer2.startReplaceableGroup(-1323940314);
                        Density density = (Density) composer2.consume(CompositionLocalsKt.getLocalDensity());
                        LayoutDirection layoutDirection = (LayoutDirection) composer2.consume(CompositionLocalsKt.getLocalLayoutDirection());
                        ViewConfiguration viewConfiguration = (ViewConfiguration) composer2.consume(CompositionLocalsKt.getLocalViewConfiguration());
                        ComposeUiNode.Companion companion = ComposeUiNode.Companion;
                        C13074a<ComposeUiNode> constructor = companion.getConstructor();
                        C13089p<SkippableUpdater<ComposeUiNode>, Composer, Integer, C11921v> materializerOf = LayoutKt.materializerOf(r2);
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
                        Updater.m35299setimpl(r11, rememberBoxMeasurePolicy, companion.getSetMeasurePolicy());
                        Updater.m35299setimpl(r11, density, companion.getSetDensity());
                        Updater.m35299setimpl(r11, layoutDirection, companion.getSetLayoutDirection());
                        Updater.m35299setimpl(r11, viewConfiguration, companion.getSetViewConfiguration());
                        composer.enableReusing();
                        materializerOf.invoke(SkippableUpdater.m35283boximpl(SkippableUpdater.m35284constructorimpl(composer)), composer2, 0);
                        composer2.startReplaceableGroup(2058660585);
                        composer2.startReplaceableGroup(-2137368960);
                        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                        composer2.startReplaceableGroup(-1301783630);
                        oVar.invoke(composer2, Integer.valueOf(i3 & 14));
                        composer.endReplaceableGroup();
                        composer.endReplaceableGroup();
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
            }), composer, 56);
            if (this.$trailingIcon != null) {
                ProvidableCompositionLocal<Color> localContentColor3 = ContentColorKt.getLocalContentColor();
                MenuItemColors menuItemColors3 = this.$colors;
                boolean z3 = this.$enabled;
                int i6 = this.$$dirty;
                ProvidedValue[] providedValueArr3 = {localContentColor3.provides(menuItemColors3.trailingIconColor$material3_release(z3, composer, ((i6 >> 15) & 112) | ((i6 >> 15) & 14)).getValue())};
                final C13088o<Composer, Integer, C11921v> oVar5 = this.$trailingIcon;
                final int i7 = this.$$dirty;
                CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) providedValueArr3, (C13088o<? super Composer, ? super Integer, C11921v>) ComposableLambdaKt.composableLambda(composer, 580312062, true, new C13088o<Composer, Integer, C11921v>() {
                    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                        invoke((Composer) obj, ((Number) obj2).intValue());
                        return C11921v.f18618a;
                    }

                    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                    @Composable
                    public final void invoke(Composer composer, int i) {
                        if ((i & 11) != 2 || !composer.getSkipping()) {
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(580312062, i, -1, "androidx.compose.material3.DropdownMenuItemContent.<anonymous>.<anonymous>.<anonymous> (Menu.kt:204)");
                            }
                            Modifier r12 = SizeKt.m33323defaultMinSizeVpY3zN4$default(Modifier.Companion, MenuTokens.INSTANCE.m35022getListItemTrailingIconSizeD9Ej5fM(), 0.0f, 2, (Object) null);
                            C13088o<Composer, Integer, C11921v> oVar = oVar5;
                            int i2 = i7;
                            composer.startReplaceableGroup(733328855);
                            MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(Alignment.Companion.getTopStart(), false, composer, 0);
                            composer.startReplaceableGroup(-1323940314);
                            Density density = (Density) composer.consume(CompositionLocalsKt.getLocalDensity());
                            LayoutDirection layoutDirection = (LayoutDirection) composer.consume(CompositionLocalsKt.getLocalLayoutDirection());
                            ViewConfiguration viewConfiguration = (ViewConfiguration) composer.consume(CompositionLocalsKt.getLocalViewConfiguration());
                            ComposeUiNode.Companion companion = ComposeUiNode.Companion;
                            C13074a<ComposeUiNode> constructor = companion.getConstructor();
                            C13089p<SkippableUpdater<ComposeUiNode>, Composer, Integer, C11921v> materializerOf = LayoutKt.materializerOf(r12);
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
                            Updater.m35299setimpl(r8, rememberBoxMeasurePolicy, companion.getSetMeasurePolicy());
                            Updater.m35299setimpl(r8, density, companion.getSetDensity());
                            Updater.m35299setimpl(r8, layoutDirection, companion.getSetLayoutDirection());
                            Updater.m35299setimpl(r8, viewConfiguration, companion.getSetViewConfiguration());
                            composer.enableReusing();
                            materializerOf.invoke(SkippableUpdater.m35283boximpl(SkippableUpdater.m35284constructorimpl(composer)), composer, 0);
                            composer.startReplaceableGroup(2058660585);
                            composer.startReplaceableGroup(-2137368960);
                            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                            composer.startReplaceableGroup(-589942012);
                            oVar.invoke(composer, Integer.valueOf((i2 >> 12) & 14));
                            composer.endReplaceableGroup();
                            composer.endReplaceableGroup();
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
                }), composer, 56);
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
