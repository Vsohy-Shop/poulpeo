package androidx.compose.material.internal;

import androidx.compose.p002ui.Modifier;
import androidx.compose.p002ui.layout.LayoutKt;
import androidx.compose.p002ui.node.ComposeUiNode;
import androidx.compose.p002ui.platform.CompositionLocalsKt;
import androidx.compose.p002ui.platform.ViewConfiguration;
import androidx.compose.p002ui.unit.Density;
import androidx.compose.p002ui.unit.LayoutDirection;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.SnapshotMutationPolicy;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import kotlin.jvm.internal.SourceDebugExtension;
import p336ef.C11921v;
import p404of.C13074a;
import p404of.C13088o;
import p404of.C13089p;

@SourceDebugExtension({"SMAP\nExposedDropdownMenuPopup.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ExposedDropdownMenuPopup.kt\nandroidx/compose/material/internal/ExposedDropdownMenuPopupKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 5 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 6 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,475:1\n76#2:476\n76#2:477\n76#2:478\n76#2:479\n76#2:488\n76#2:516\n25#3:480\n456#3,14:500\n456#3,14:528\n1114#4,6:481\n74#5:487\n75#5,11:489\n88#5:514\n74#5:515\n75#5,11:517\n88#5:542\n76#6:543\n*S KotlinDebug\n*F\n+ 1 ExposedDropdownMenuPopup.kt\nandroidx/compose/material/internal/ExposedDropdownMenuPopupKt\n*L\n85#1:476\n86#1:477\n87#1:478\n88#1:479\n150#1:488\n179#1:516\n92#1:480\n150#1:500,14\n179#1:528,14\n92#1:481,6\n150#1:487\n150#1:489,11\n150#1:514\n179#1:515\n179#1:517,11\n179#1:542\n90#1:543\n*E\n"})
/* compiled from: ExposedDropdownMenuPopup.kt */
public final class ExposedDropdownMenuPopupKt {
    private static final ProvidableCompositionLocal<String> LocalPopupTestTag = CompositionLocalKt.compositionLocalOf$default((SnapshotMutationPolicy) null, ExposedDropdownMenuPopupKt$LocalPopupTestTag$1.INSTANCE, 1, (Object) null);

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v2, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v5, resolved type: androidx.compose.material.internal.PopupLayout} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v24, resolved type: androidx.compose.material.internal.PopupLayout} */
    /* JADX WARNING: type inference failed for: r11v3 */
    /* JADX WARNING: Multi-variable type inference failed */
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    @androidx.compose.runtime.Composable
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void ExposedDropdownMenuPopup(p404of.C13074a<p336ef.C11921v> r21, androidx.compose.p002ui.window.PopupPositionProvider r22, p404of.C13088o<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, p336ef.C11921v> r23, androidx.compose.runtime.Composer r24, int r25, int r26) {
        /*
            r7 = r22
            r8 = r23
            r9 = r25
            java.lang.String r0 = "popupPositionProvider"
            kotlin.jvm.internal.C12775o.m28639i(r7, r0)
            java.lang.String r0 = "content"
            kotlin.jvm.internal.C12775o.m28639i(r8, r0)
            r0 = -841446797(0xffffffffcdd88a73, float:-4.54119008E8)
            r1 = r24
            androidx.compose.runtime.Composer r6 = r1.startRestartGroup(r0)
            r1 = r26 & 1
            if (r1 == 0) goto L_0x0023
            r2 = r9 | 6
            r3 = r2
            r2 = r21
            goto L_0x0037
        L_0x0023:
            r2 = r9 & 14
            if (r2 != 0) goto L_0x0034
            r2 = r21
            boolean r3 = r6.changedInstance(r2)
            if (r3 == 0) goto L_0x0031
            r3 = 4
            goto L_0x0032
        L_0x0031:
            r3 = 2
        L_0x0032:
            r3 = r3 | r9
            goto L_0x0037
        L_0x0034:
            r2 = r21
            r3 = r9
        L_0x0037:
            r4 = r26 & 2
            if (r4 == 0) goto L_0x003e
            r3 = r3 | 48
            goto L_0x004e
        L_0x003e:
            r4 = r9 & 112(0x70, float:1.57E-43)
            if (r4 != 0) goto L_0x004e
            boolean r4 = r6.changed((java.lang.Object) r7)
            if (r4 == 0) goto L_0x004b
            r4 = 32
            goto L_0x004d
        L_0x004b:
            r4 = 16
        L_0x004d:
            r3 = r3 | r4
        L_0x004e:
            r4 = r26 & 4
            if (r4 == 0) goto L_0x0055
            r3 = r3 | 384(0x180, float:5.38E-43)
            goto L_0x0065
        L_0x0055:
            r4 = r9 & 896(0x380, float:1.256E-42)
            if (r4 != 0) goto L_0x0065
            boolean r4 = r6.changedInstance(r8)
            if (r4 == 0) goto L_0x0062
            r4 = 256(0x100, float:3.59E-43)
            goto L_0x0064
        L_0x0062:
            r4 = 128(0x80, float:1.794E-43)
        L_0x0064:
            r3 = r3 | r4
        L_0x0065:
            r5 = r3
            r3 = r5 & 731(0x2db, float:1.024E-42)
            r4 = 146(0x92, float:2.05E-43)
            if (r3 != r4) goto L_0x007a
            boolean r3 = r6.getSkipping()
            if (r3 != 0) goto L_0x0073
            goto L_0x007a
        L_0x0073:
            r6.skipToGroupEnd()
            r1 = r2
            r12 = r6
            goto L_0x01eb
        L_0x007a:
            if (r1 == 0) goto L_0x007f
            r1 = 0
            r4 = r1
            goto L_0x0080
        L_0x007f:
            r4 = r2
        L_0x0080:
            boolean r1 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r1 == 0) goto L_0x008c
            r1 = -1
            java.lang.String r2 = "androidx.compose.material.internal.ExposedDropdownMenuPopup (ExposedDropdownMenuPopup.kt:79)"
            androidx.compose.runtime.ComposerKt.traceEventStart(r0, r5, r1, r2)
        L_0x008c:
            androidx.compose.runtime.ProvidableCompositionLocal r0 = androidx.compose.p002ui.platform.AndroidCompositionLocals_androidKt.getLocalView()
            java.lang.Object r0 = r6.consume(r0)
            r3 = r0
            android.view.View r3 = (android.view.View) r3
            androidx.compose.runtime.ProvidableCompositionLocal r0 = androidx.compose.p002ui.platform.CompositionLocalsKt.getLocalDensity()
            java.lang.Object r0 = r6.consume(r0)
            r17 = r0
            androidx.compose.ui.unit.Density r17 = (androidx.compose.p002ui.unit.Density) r17
            androidx.compose.runtime.ProvidableCompositionLocal<java.lang.String> r0 = LocalPopupTestTag
            java.lang.Object r0 = r6.consume(r0)
            r2 = r0
            java.lang.String r2 = (java.lang.String) r2
            androidx.compose.runtime.ProvidableCompositionLocal r0 = androidx.compose.p002ui.platform.CompositionLocalsKt.getLocalLayoutDirection()
            java.lang.Object r0 = r6.consume(r0)
            r1 = r0
            androidx.compose.ui.unit.LayoutDirection r1 = (androidx.compose.p002ui.unit.LayoutDirection) r1
            r0 = 0
            androidx.compose.runtime.CompositionContext r15 = androidx.compose.runtime.ComposablesKt.rememberCompositionContext(r6, r0)
            int r10 = r5 >> 6
            r10 = r10 & 14
            androidx.compose.runtime.State r14 = androidx.compose.runtime.SnapshotStateKt.rememberUpdatedState(r8, r6, r10)
            java.lang.Object[] r10 = new java.lang.Object[r0]
            r11 = 0
            r12 = 0
            androidx.compose.material.internal.ExposedDropdownMenuPopupKt$ExposedDropdownMenuPopup$popupId$1 r13 = androidx.compose.material.internal.ExposedDropdownMenuPopupKt$ExposedDropdownMenuPopup$popupId$1.INSTANCE
            r16 = 3080(0xc08, float:4.316E-42)
            r18 = 6
            r19 = r14
            r14 = r6
            r20 = r15
            r15 = r16
            r16 = r18
            java.lang.Object r10 = androidx.compose.runtime.saveable.RememberSaveableKt.rememberSaveable((java.lang.Object[]) r10, r11, (java.lang.String) r12, r13, (androidx.compose.runtime.Composer) r14, (int) r15, (int) r16)
            java.util.UUID r10 = (java.util.UUID) r10
            r11 = -492369756(0xffffffffe2a708a4, float:-1.5406144E21)
            r6.startReplaceableGroup(r11)
            java.lang.Object r11 = r6.rememberedValue()
            androidx.compose.runtime.Composer$Companion r12 = androidx.compose.runtime.Composer.Companion
            java.lang.Object r12 = r12.getEmpty()
            if (r11 != r12) goto L_0x011f
            androidx.compose.material.internal.PopupLayout r11 = new androidx.compose.material.internal.PopupLayout
            java.lang.String r12 = "popupId"
            kotlin.jvm.internal.C12775o.m28638h(r10, r12)
            r12 = r0
            r0 = r11
            r13 = r1
            r1 = r4
            r14 = r2
            r15 = r4
            r4 = r17
            r16 = r5
            r5 = r22
            r12 = r6
            r6 = r10
            r0.<init>(r1, r2, r3, r4, r5, r6)
            androidx.compose.material.internal.ExposedDropdownMenuPopupKt$ExposedDropdownMenuPopup$popupLayout$1$1$1 r0 = new androidx.compose.material.internal.ExposedDropdownMenuPopupKt$ExposedDropdownMenuPopup$popupLayout$1$1$1
            r1 = r19
            r0.<init>(r11, r1)
            r1 = 144472904(0x89c7b48, float:9.417892E-34)
            r2 = 1
            androidx.compose.runtime.internal.ComposableLambda r0 = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(r1, r2, r0)
            r1 = r20
            r11.setContent(r1, r0)
            r12.updateRememberedValue(r11)
            goto L_0x0125
        L_0x011f:
            r13 = r1
            r14 = r2
            r15 = r4
            r16 = r5
            r12 = r6
        L_0x0125:
            r12.endReplaceableGroup()
            androidx.compose.material.internal.PopupLayout r11 = (androidx.compose.material.internal.PopupLayout) r11
            androidx.compose.material.internal.ExposedDropdownMenuPopupKt$ExposedDropdownMenuPopup$1 r0 = new androidx.compose.material.internal.ExposedDropdownMenuPopupKt$ExposedDropdownMenuPopup$1
            r0.<init>(r11, r15, r14, r13)
            r1 = 8
            androidx.compose.runtime.EffectsKt.DisposableEffect((java.lang.Object) r11, (kotlin.jvm.functions.Function1<? super androidx.compose.runtime.DisposableEffectScope, ? extends androidx.compose.runtime.DisposableEffectResult>) r0, (androidx.compose.runtime.Composer) r12, (int) r1)
            androidx.compose.material.internal.ExposedDropdownMenuPopupKt$ExposedDropdownMenuPopup$2 r0 = new androidx.compose.material.internal.ExposedDropdownMenuPopupKt$ExposedDropdownMenuPopup$2
            r0.<init>(r11, r15, r14, r13)
            r1 = 0
            androidx.compose.runtime.EffectsKt.SideEffect(r0, r12, r1)
            androidx.compose.material.internal.ExposedDropdownMenuPopupKt$ExposedDropdownMenuPopup$3 r0 = new androidx.compose.material.internal.ExposedDropdownMenuPopupKt$ExposedDropdownMenuPopup$3
            r0.<init>(r11, r7)
            int r1 = r16 >> 3
            r1 = r1 & 14
            androidx.compose.runtime.EffectsKt.DisposableEffect((java.lang.Object) r7, (kotlin.jvm.functions.Function1<? super androidx.compose.runtime.DisposableEffectScope, ? extends androidx.compose.runtime.DisposableEffectResult>) r0, (androidx.compose.runtime.Composer) r12, (int) r1)
            androidx.compose.ui.Modifier$Companion r0 = androidx.compose.p002ui.Modifier.Companion
            androidx.compose.material.internal.ExposedDropdownMenuPopupKt$ExposedDropdownMenuPopup$5 r1 = new androidx.compose.material.internal.ExposedDropdownMenuPopupKt$ExposedDropdownMenuPopup$5
            r1.<init>(r11)
            androidx.compose.ui.Modifier r0 = androidx.compose.p002ui.layout.OnGloballyPositionedModifierKt.onGloballyPositioned(r0, r1)
            androidx.compose.material.internal.ExposedDropdownMenuPopupKt$ExposedDropdownMenuPopup$6 r1 = new androidx.compose.material.internal.ExposedDropdownMenuPopupKt$ExposedDropdownMenuPopup$6
            r1.<init>(r11, r13)
            r2 = -1323940314(0xffffffffb1164626, float:-2.1867748E-9)
            r12.startReplaceableGroup(r2)
            androidx.compose.runtime.ProvidableCompositionLocal r2 = androidx.compose.p002ui.platform.CompositionLocalsKt.getLocalDensity()
            java.lang.Object r2 = r12.consume(r2)
            androidx.compose.ui.unit.Density r2 = (androidx.compose.p002ui.unit.Density) r2
            androidx.compose.runtime.ProvidableCompositionLocal r3 = androidx.compose.p002ui.platform.CompositionLocalsKt.getLocalLayoutDirection()
            java.lang.Object r3 = r12.consume(r3)
            androidx.compose.ui.unit.LayoutDirection r3 = (androidx.compose.p002ui.unit.LayoutDirection) r3
            androidx.compose.runtime.ProvidableCompositionLocal r4 = androidx.compose.p002ui.platform.CompositionLocalsKt.getLocalViewConfiguration()
            java.lang.Object r4 = r12.consume(r4)
            androidx.compose.ui.platform.ViewConfiguration r4 = (androidx.compose.p002ui.platform.ViewConfiguration) r4
            androidx.compose.ui.node.ComposeUiNode$Companion r5 = androidx.compose.p002ui.node.ComposeUiNode.Companion
            of.a r6 = r5.getConstructor()
            of.p r0 = androidx.compose.p002ui.layout.LayoutKt.materializerOf(r0)
            androidx.compose.runtime.Applier r10 = r12.getApplier()
            boolean r10 = r10 instanceof androidx.compose.runtime.Applier
            if (r10 != 0) goto L_0x0192
            androidx.compose.runtime.ComposablesKt.invalidApplier()
        L_0x0192:
            r12.startReusableNode()
            boolean r10 = r12.getInserting()
            if (r10 == 0) goto L_0x019f
            r12.createNode(r6)
            goto L_0x01a2
        L_0x019f:
            r12.useNode()
        L_0x01a2:
            androidx.compose.runtime.Composer r6 = androidx.compose.runtime.Updater.m35292constructorimpl(r12)
            of.o r10 = r5.getSetMeasurePolicy()
            androidx.compose.runtime.Updater.m35299setimpl((androidx.compose.runtime.Composer) r6, r1, r10)
            of.o r1 = r5.getSetDensity()
            androidx.compose.runtime.Updater.m35299setimpl((androidx.compose.runtime.Composer) r6, r2, r1)
            of.o r1 = r5.getSetLayoutDirection()
            androidx.compose.runtime.Updater.m35299setimpl((androidx.compose.runtime.Composer) r6, r3, r1)
            of.o r1 = r5.getSetViewConfiguration()
            androidx.compose.runtime.Updater.m35299setimpl((androidx.compose.runtime.Composer) r6, r4, r1)
            androidx.compose.runtime.Composer r1 = androidx.compose.runtime.SkippableUpdater.m35284constructorimpl(r12)
            androidx.compose.runtime.SkippableUpdater r1 = androidx.compose.runtime.SkippableUpdater.m35283boximpl(r1)
            r2 = 0
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r0.invoke(r1, r12, r2)
            r0 = 2058660585(0x7ab4aae9, float:4.6903995E35)
            r12.startReplaceableGroup(r0)
            r12.endReplaceableGroup()
            r12.endNode()
            r12.endReplaceableGroup()
            boolean r0 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r0 == 0) goto L_0x01ea
            androidx.compose.runtime.ComposerKt.traceEventEnd()
        L_0x01ea:
            r1 = r15
        L_0x01eb:
            androidx.compose.runtime.ScopeUpdateScope r6 = r12.endRestartGroup()
            if (r6 != 0) goto L_0x01f2
            goto L_0x0203
        L_0x01f2:
            androidx.compose.material.internal.ExposedDropdownMenuPopupKt$ExposedDropdownMenuPopup$7 r10 = new androidx.compose.material.internal.ExposedDropdownMenuPopupKt$ExposedDropdownMenuPopup$7
            r0 = r10
            r2 = r22
            r3 = r23
            r4 = r25
            r5 = r26
            r0.<init>(r1, r2, r3, r4, r5)
            r6.updateScope(r10)
        L_0x0203:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.internal.ExposedDropdownMenuPopupKt.ExposedDropdownMenuPopup(of.a, androidx.compose.ui.window.PopupPositionProvider, of.o, androidx.compose.runtime.Composer, int, int):void");
    }

    /* access modifiers changed from: private */
    public static final C13088o<Composer, Integer, C11921v> ExposedDropdownMenuPopup$lambda$0(State<? extends C13088o<? super Composer, ? super Integer, C11921v>> state) {
        return (C13088o) state.getValue();
    }

    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    @Composable
    private static final void SimpleStack(Modifier modifier, C13088o<? super Composer, ? super Integer, C11921v> oVar, Composer composer, int i) {
        composer.startReplaceableGroup(1769324208);
        ExposedDropdownMenuPopupKt$SimpleStack$1 exposedDropdownMenuPopupKt$SimpleStack$1 = ExposedDropdownMenuPopupKt$SimpleStack$1.INSTANCE;
        composer.startReplaceableGroup(-1323940314);
        Density density = (Density) composer.consume(CompositionLocalsKt.getLocalDensity());
        LayoutDirection layoutDirection = (LayoutDirection) composer.consume(CompositionLocalsKt.getLocalLayoutDirection());
        ViewConfiguration viewConfiguration = (ViewConfiguration) composer.consume(CompositionLocalsKt.getLocalViewConfiguration());
        ComposeUiNode.Companion companion = ComposeUiNode.Companion;
        C13074a<ComposeUiNode> constructor = companion.getConstructor();
        C13089p<SkippableUpdater<ComposeUiNode>, Composer, Integer, C11921v> materializerOf = LayoutKt.materializerOf(modifier);
        int i2 = (((((i << 3) & 112) | ((i >> 3) & 14)) << 9) & 7168) | 6;
        if (!(composer.getApplier() instanceof Applier)) {
            ComposablesKt.invalidApplier();
        }
        composer.startReusableNode();
        if (composer.getInserting()) {
            composer.createNode(constructor);
        } else {
            composer.useNode();
        }
        Composer r5 = Updater.m35292constructorimpl(composer);
        Updater.m35299setimpl(r5, exposedDropdownMenuPopupKt$SimpleStack$1, companion.getSetMeasurePolicy());
        Updater.m35299setimpl(r5, density, companion.getSetDensity());
        Updater.m35299setimpl(r5, layoutDirection, companion.getSetLayoutDirection());
        Updater.m35299setimpl(r5, viewConfiguration, companion.getSetViewConfiguration());
        materializerOf.invoke(SkippableUpdater.m35283boximpl(SkippableUpdater.m35284constructorimpl(composer)), composer, Integer.valueOf((i2 >> 3) & 112));
        composer.startReplaceableGroup(2058660585);
        oVar.invoke(composer, Integer.valueOf((i2 >> 9) & 14));
        composer.endReplaceableGroup();
        composer.endNode();
        composer.endReplaceableGroup();
        composer.endReplaceableGroup();
    }

    public static final ProvidableCompositionLocal<String> getLocalPopupTestTag() {
        return LocalPopupTestTag;
    }
}
