package androidx.compose.foundation.layout;

import androidx.compose.p002ui.Alignment;
import androidx.compose.p002ui.Modifier;
import androidx.compose.p002ui.layout.LayoutKt;
import androidx.compose.p002ui.layout.Measurable;
import androidx.compose.p002ui.layout.MeasurePolicy;
import androidx.compose.p002ui.layout.Placeable;
import androidx.compose.p002ui.node.ComposeUiNode;
import androidx.compose.p002ui.platform.CompositionLocalsKt;
import androidx.compose.p002ui.platform.ViewConfiguration;
import androidx.compose.p002ui.unit.Density;
import androidx.compose.p002ui.unit.IntSizeKt;
import androidx.compose.p002ui.unit.LayoutDirection;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.Updater;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.SourceDebugExtension;
import p336ef.C11921v;
import p404of.C13074a;
import p404of.C13089p;

@SourceDebugExtension({"SMAP\nBox.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 2 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 3 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,287:1\n75#2:288\n76#2,11:290\n89#2:317\n75#2:326\n76#2,11:328\n89#2:355\n76#3:289\n76#3:327\n460#4,16:301\n50#4:318\n49#4:319\n460#4,16:339\n1057#5,6:320\n*S KotlinDebug\n*F\n+ 1 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n*L\n72#1:288\n72#1:290,11\n72#1:317\n201#1:326\n201#1:328,11\n201#1:355\n72#1:289\n201#1:327\n72#1:301,16\n87#1:318\n87#1:319\n201#1:339,16\n87#1:320,6\n*E\n"})
/* compiled from: Box.kt */
public final class BoxKt {
    private static final MeasurePolicy DefaultBoxMeasurePolicy = boxMeasurePolicy(Alignment.Companion.getTopStart(), false);
    private static final MeasurePolicy EmptyBoxMeasurePolicy = BoxKt$EmptyBoxMeasurePolicy$1.INSTANCE;

    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    @Composable
    public static final void Box(Modifier modifier, Alignment alignment, boolean z, C13089p<? super BoxScope, ? super Composer, ? super Integer, C11921v> pVar, Composer composer, int i, int i2) {
        C12775o.m28639i(pVar, "content");
        composer.startReplaceableGroup(733328855);
        if ((i2 & 1) != 0) {
            modifier = Modifier.Companion;
        }
        if ((i2 & 2) != 0) {
            alignment = Alignment.Companion.getTopStart();
        }
        if ((i2 & 4) != 0) {
            z = false;
        }
        int i3 = i >> 3;
        MeasurePolicy rememberBoxMeasurePolicy = rememberBoxMeasurePolicy(alignment, z, composer, (i3 & 112) | (i3 & 14));
        composer.startReplaceableGroup(-1323940314);
        Density density = (Density) composer.consume(CompositionLocalsKt.getLocalDensity());
        LayoutDirection layoutDirection = (LayoutDirection) composer.consume(CompositionLocalsKt.getLocalLayoutDirection());
        ViewConfiguration viewConfiguration = (ViewConfiguration) composer.consume(CompositionLocalsKt.getLocalViewConfiguration());
        ComposeUiNode.Companion companion = ComposeUiNode.Companion;
        C13074a<ComposeUiNode> constructor = companion.getConstructor();
        C13089p<SkippableUpdater<ComposeUiNode>, Composer, Integer, C11921v> materializerOf = LayoutKt.materializerOf(modifier);
        int i4 = ((((i << 3) & 112) << 9) & 7168) | 6;
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
        Composer r3 = Updater.m35292constructorimpl(composer);
        Updater.m35299setimpl(r3, rememberBoxMeasurePolicy, companion.getSetMeasurePolicy());
        Updater.m35299setimpl(r3, density, companion.getSetDensity());
        Updater.m35299setimpl(r3, layoutDirection, companion.getSetLayoutDirection());
        Updater.m35299setimpl(r3, viewConfiguration, companion.getSetViewConfiguration());
        composer.enableReusing();
        materializerOf.invoke(SkippableUpdater.m35283boximpl(SkippableUpdater.m35284constructorimpl(composer)), composer, Integer.valueOf((i4 >> 3) & 112));
        composer.startReplaceableGroup(2058660585);
        pVar.invoke(BoxScopeInstance.INSTANCE, composer, Integer.valueOf(((i >> 6) & 112) | 6));
        composer.endReplaceableGroup();
        composer.endNode();
        composer.endReplaceableGroup();
        composer.endReplaceableGroup();
    }

    public static final MeasurePolicy boxMeasurePolicy(Alignment alignment, boolean z) {
        C12775o.m28639i(alignment, "alignment");
        return new BoxKt$boxMeasurePolicy$1(z, alignment);
    }

    private static final BoxChildData getBoxChildData(Measurable measurable) {
        Object parentData = measurable.getParentData();
        if (parentData instanceof BoxChildData) {
            return (BoxChildData) parentData;
        }
        return null;
    }

    public static final MeasurePolicy getDefaultBoxMeasurePolicy() {
        return DefaultBoxMeasurePolicy;
    }

    public static final MeasurePolicy getEmptyBoxMeasurePolicy() {
        return EmptyBoxMeasurePolicy;
    }

    /* access modifiers changed from: private */
    public static final boolean getMatchesParentSize(Measurable measurable) {
        BoxChildData boxChildData = getBoxChildData(measurable);
        if (boxChildData != null) {
            return boxChildData.getMatchParentSize();
        }
        return false;
    }

    /* access modifiers changed from: private */
    public static final void placeInBox(Placeable.PlacementScope placementScope, Placeable placeable, Measurable measurable, LayoutDirection layoutDirection, int i, int i2, Alignment alignment) {
        Alignment alignment2;
        Alignment alignment3;
        BoxChildData boxChildData = getBoxChildData(measurable);
        if (boxChildData == null || (alignment3 = boxChildData.getAlignment()) == null) {
            alignment2 = alignment;
        } else {
            alignment2 = alignment3;
        }
        Placeable.PlacementScope.m37405place70tqf50$default(placementScope, placeable, alignment2.m35310alignKFBX0sM(IntSizeKt.IntSize(placeable.getWidth(), placeable.getHeight()), IntSizeKt.IntSize(i, i2), layoutDirection), 0.0f, 2, (Object) null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v2, resolved type: androidx.compose.ui.layout.MeasurePolicy} */
    /* JADX WARNING: Multi-variable type inference failed */
    @androidx.compose.runtime.Composable
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final androidx.compose.p002ui.layout.MeasurePolicy rememberBoxMeasurePolicy(androidx.compose.p002ui.Alignment r3, boolean r4, androidx.compose.runtime.Composer r5, int r6) {
        /*
            java.lang.String r0 = "alignment"
            kotlin.jvm.internal.C12775o.m28639i(r3, r0)
            r0 = 56522820(0x35e7844, float:6.5377995E-37)
            r5.startReplaceableGroup(r0)
            boolean r1 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r1 == 0) goto L_0x0017
            r1 = -1
            java.lang.String r2 = "androidx.compose.foundation.layout.rememberBoxMeasurePolicy (Box.kt:80)"
            androidx.compose.runtime.ComposerKt.traceEventStart(r0, r6, r1, r2)
        L_0x0017:
            androidx.compose.ui.Alignment$Companion r6 = androidx.compose.p002ui.Alignment.Companion
            androidx.compose.ui.Alignment r6 = r6.getTopStart()
            boolean r6 = kotlin.jvm.internal.C12775o.m28634d(r3, r6)
            if (r6 == 0) goto L_0x0028
            if (r4 != 0) goto L_0x0028
            androidx.compose.ui.layout.MeasurePolicy r3 = DefaultBoxMeasurePolicy
            goto L_0x0056
        L_0x0028:
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r4)
            r0 = 511388516(0x1e7b2b64, float:1.3296802E-20)
            r5.startReplaceableGroup(r0)
            boolean r0 = r5.changed((java.lang.Object) r3)
            boolean r6 = r5.changed((java.lang.Object) r6)
            r6 = r6 | r0
            java.lang.Object r0 = r5.rememberedValue()
            if (r6 != 0) goto L_0x0049
            androidx.compose.runtime.Composer$Companion r6 = androidx.compose.runtime.Composer.Companion
            java.lang.Object r6 = r6.getEmpty()
            if (r0 != r6) goto L_0x0050
        L_0x0049:
            androidx.compose.ui.layout.MeasurePolicy r0 = boxMeasurePolicy(r3, r4)
            r5.updateRememberedValue(r0)
        L_0x0050:
            r5.endReplaceableGroup()
            r3 = r0
            androidx.compose.ui.layout.MeasurePolicy r3 = (androidx.compose.p002ui.layout.MeasurePolicy) r3
        L_0x0056:
            boolean r4 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r4 == 0) goto L_0x005f
            androidx.compose.runtime.ComposerKt.traceEventEnd()
        L_0x005f:
            r5.endReplaceableGroup()
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.layout.BoxKt.rememberBoxMeasurePolicy(androidx.compose.ui.Alignment, boolean, androidx.compose.runtime.Composer, int):androidx.compose.ui.layout.MeasurePolicy");
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void Box(Modifier modifier, Composer composer, int i) {
        int i2;
        C12775o.m28639i(modifier, "modifier");
        Composer startRestartGroup = composer.startRestartGroup(-211209833);
        if ((i & 14) == 0) {
            i2 = (startRestartGroup.changed((Object) modifier) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 11) != 2 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-211209833, i2, -1, "androidx.compose.foundation.layout.Box (Box.kt:199)");
            }
            MeasurePolicy measurePolicy = EmptyBoxMeasurePolicy;
            startRestartGroup.startReplaceableGroup(-1323940314);
            Density density = (Density) startRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
            LayoutDirection layoutDirection = (LayoutDirection) startRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
            ViewConfiguration viewConfiguration = (ViewConfiguration) startRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
            ComposeUiNode.Companion companion = ComposeUiNode.Companion;
            C13074a<ComposeUiNode> constructor = companion.getConstructor();
            C13089p<SkippableUpdater<ComposeUiNode>, Composer, Integer, C11921v> materializerOf = LayoutKt.materializerOf(modifier);
            int i3 = (((((i2 << 3) & 112) | 384) << 9) & 7168) | 6;
            if (!(startRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
                startRestartGroup.createNode(constructor);
            } else {
                startRestartGroup.useNode();
            }
            startRestartGroup.disableReusing();
            Composer r6 = Updater.m35292constructorimpl(startRestartGroup);
            Updater.m35299setimpl(r6, measurePolicy, companion.getSetMeasurePolicy());
            Updater.m35299setimpl(r6, density, companion.getSetDensity());
            Updater.m35299setimpl(r6, layoutDirection, companion.getSetLayoutDirection());
            Updater.m35299setimpl(r6, viewConfiguration, companion.getSetViewConfiguration());
            startRestartGroup.enableReusing();
            materializerOf.invoke(SkippableUpdater.m35283boximpl(SkippableUpdater.m35284constructorimpl(startRestartGroup)), startRestartGroup, Integer.valueOf((i3 >> 3) & 112));
            startRestartGroup.startReplaceableGroup(2058660585);
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endNode();
            startRestartGroup.endReplaceableGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new BoxKt$Box$3(modifier, i));
        }
    }
}
