package androidx.compose.p002ui.window;

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
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import kotlin.jvm.internal.SourceDebugExtension;
import p336ef.C11921v;
import p404of.C13074a;
import p404of.C13088o;
import p404of.C13089p;

@SourceDebugExtension({"SMAP\nAndroidDialog.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidDialog.android.kt\nandroidx/compose/ui/window/AndroidDialog_androidKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 5 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 6 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,456:1\n76#2:457\n76#2:458\n76#2:459\n76#2:469\n50#3:460\n49#3:461\n456#3,14:481\n1114#4,6:462\n74#5:468\n75#5,11:470\n88#5:495\n76#6:496\n*S KotlinDebug\n*F\n+ 1 AndroidDialog.android.kt\nandroidx/compose/ui/window/AndroidDialog_androidKt\n*L\n156#1:457\n157#1:458\n158#1:459\n444#1:469\n162#1:460\n162#1:461\n444#1:481,14\n162#1:462,6\n444#1:468\n444#1:470,11\n444#1:495\n160#1:496\n*E\n"})
/* renamed from: androidx.compose.ui.window.AndroidDialog_androidKt */
/* compiled from: AndroidDialog.android.kt */
public final class AndroidDialog_androidKt {
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v2, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v5, resolved type: androidx.compose.ui.window.DialogWrapper} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v17, resolved type: androidx.compose.ui.window.DialogWrapper} */
    /* JADX WARNING: type inference failed for: r12v3 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0050  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0053  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0070  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0077  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x014f  */
    /* JADX WARNING: Removed duplicated region for block: B:57:? A[RETURN, SYNTHETIC] */
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    @androidx.compose.runtime.Composable
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void Dialog(p404of.C13074a<p336ef.C11921v> r19, androidx.compose.p002ui.window.DialogProperties r20, p404of.C13088o<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, p336ef.C11921v> r21, androidx.compose.runtime.Composer r22, int r23, int r24) {
        /*
            r7 = r19
            r8 = r21
            r9 = r23
            java.lang.String r0 = "onDismissRequest"
            kotlin.jvm.internal.C12775o.m28639i(r7, r0)
            java.lang.String r0 = "content"
            kotlin.jvm.internal.C12775o.m28639i(r8, r0)
            r0 = -2032877254(0xffffffff86d4c13a, float:-8.002946E-35)
            r1 = r22
            androidx.compose.runtime.Composer r6 = r1.startRestartGroup(r0)
            r1 = r24 & 1
            if (r1 == 0) goto L_0x0020
            r1 = r9 | 6
            goto L_0x0030
        L_0x0020:
            r1 = r9 & 14
            if (r1 != 0) goto L_0x002f
            boolean r1 = r6.changedInstance(r7)
            if (r1 == 0) goto L_0x002c
            r1 = 4
            goto L_0x002d
        L_0x002c:
            r1 = 2
        L_0x002d:
            r1 = r1 | r9
            goto L_0x0030
        L_0x002f:
            r1 = r9
        L_0x0030:
            r2 = r24 & 2
            if (r2 == 0) goto L_0x0037
            r1 = r1 | 48
            goto L_0x004a
        L_0x0037:
            r3 = r9 & 112(0x70, float:1.57E-43)
            if (r3 != 0) goto L_0x004a
            r3 = r20
            boolean r4 = r6.changed((java.lang.Object) r3)
            if (r4 == 0) goto L_0x0046
            r4 = 32
            goto L_0x0048
        L_0x0046:
            r4 = 16
        L_0x0048:
            r1 = r1 | r4
            goto L_0x004c
        L_0x004a:
            r3 = r20
        L_0x004c:
            r4 = r24 & 4
            if (r4 == 0) goto L_0x0053
            r1 = r1 | 384(0x180, float:5.38E-43)
            goto L_0x0063
        L_0x0053:
            r4 = r9 & 896(0x380, float:1.256E-42)
            if (r4 != 0) goto L_0x0063
            boolean r4 = r6.changedInstance(r8)
            if (r4 == 0) goto L_0x0060
            r4 = 256(0x100, float:3.59E-43)
            goto L_0x0062
        L_0x0060:
            r4 = 128(0x80, float:1.794E-43)
        L_0x0062:
            r1 = r1 | r4
        L_0x0063:
            r4 = r1 & 731(0x2db, float:1.024E-42)
            r5 = 146(0x92, float:2.05E-43)
            if (r4 != r5) goto L_0x0077
            boolean r4 = r6.getSkipping()
            if (r4 != 0) goto L_0x0070
            goto L_0x0077
        L_0x0070:
            r6.skipToGroupEnd()
            r2 = r3
            r15 = r6
            goto L_0x0148
        L_0x0077:
            if (r2 == 0) goto L_0x0086
            androidx.compose.ui.window.DialogProperties r2 = new androidx.compose.ui.window.DialogProperties
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 7
            r15 = 0
            r10 = r2
            r10.<init>((boolean) r11, (boolean) r12, (androidx.compose.p002ui.window.SecureFlagPolicy) r13, (int) r14, (kotlin.jvm.internal.DefaultConstructorMarker) r15)
            r5 = r2
            goto L_0x0087
        L_0x0086:
            r5 = r3
        L_0x0087:
            boolean r2 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r2 == 0) goto L_0x0093
            r2 = -1
            java.lang.String r3 = "androidx.compose.ui.window.Dialog (AndroidDialog.android.kt:150)"
            androidx.compose.runtime.ComposerKt.traceEventStart(r0, r1, r2, r3)
        L_0x0093:
            androidx.compose.runtime.ProvidableCompositionLocal r0 = androidx.compose.p002ui.platform.AndroidCompositionLocals_androidKt.getLocalView()
            java.lang.Object r0 = r6.consume(r0)
            r3 = r0
            android.view.View r3 = (android.view.View) r3
            androidx.compose.runtime.ProvidableCompositionLocal r0 = androidx.compose.p002ui.platform.CompositionLocalsKt.getLocalDensity()
            java.lang.Object r0 = r6.consume(r0)
            r4 = r0
            androidx.compose.ui.unit.Density r4 = (androidx.compose.p002ui.unit.Density) r4
            androidx.compose.runtime.ProvidableCompositionLocal r0 = androidx.compose.p002ui.platform.CompositionLocalsKt.getLocalLayoutDirection()
            java.lang.Object r0 = r6.consume(r0)
            r2 = r0
            androidx.compose.ui.unit.LayoutDirection r2 = (androidx.compose.p002ui.unit.LayoutDirection) r2
            r0 = 0
            androidx.compose.runtime.CompositionContext r15 = androidx.compose.runtime.ComposablesKt.rememberCompositionContext(r6, r0)
            int r1 = r1 >> 6
            r1 = r1 & 14
            androidx.compose.runtime.State r1 = androidx.compose.runtime.SnapshotStateKt.rememberUpdatedState(r8, r6, r1)
            java.lang.Object[] r10 = new java.lang.Object[r0]
            r11 = 0
            r12 = 0
            androidx.compose.ui.window.AndroidDialog_androidKt$Dialog$dialogId$1 r13 = androidx.compose.p002ui.window.AndroidDialog_androidKt$Dialog$dialogId$1.INSTANCE
            r16 = 3080(0xc08, float:4.316E-42)
            r17 = 6
            r14 = r6
            r18 = r15
            r15 = r16
            r16 = r17
            java.lang.Object r10 = androidx.compose.runtime.saveable.RememberSaveableKt.rememberSaveable((java.lang.Object[]) r10, r11, (java.lang.String) r12, r13, (androidx.compose.runtime.Composer) r14, (int) r15, (int) r16)
            java.util.UUID r10 = (java.util.UUID) r10
            r11 = 511388516(0x1e7b2b64, float:1.3296802E-20)
            r6.startReplaceableGroup(r11)
            boolean r11 = r6.changed((java.lang.Object) r3)
            boolean r12 = r6.changed((java.lang.Object) r4)
            r11 = r11 | r12
            java.lang.Object r12 = r6.rememberedValue()
            if (r11 != 0) goto L_0x00fa
            androidx.compose.runtime.Composer$Companion r11 = androidx.compose.runtime.Composer.Companion
            java.lang.Object r11 = r11.getEmpty()
            if (r12 != r11) goto L_0x00f6
            goto L_0x00fa
        L_0x00f6:
            r14 = r2
            r11 = r5
            r15 = r6
            goto L_0x0126
        L_0x00fa:
            androidx.compose.ui.window.DialogWrapper r12 = new androidx.compose.ui.window.DialogWrapper
            java.lang.String r11 = "dialogId"
            kotlin.jvm.internal.C12775o.m28638h(r10, r11)
            r11 = r0
            r0 = r12
            r13 = r1
            r1 = r19
            r14 = r2
            r2 = r5
            r15 = r4
            r4 = r14
            r11 = r5
            r5 = r15
            r15 = r6
            r6 = r10
            r0.<init>(r1, r2, r3, r4, r5, r6)
            androidx.compose.ui.window.AndroidDialog_androidKt$Dialog$dialog$1$1$1 r0 = new androidx.compose.ui.window.AndroidDialog_androidKt$Dialog$dialog$1$1$1
            r0.<init>(r13)
            r1 = 488261145(0x1d1a4619, float:2.041797E-21)
            r2 = 1
            androidx.compose.runtime.internal.ComposableLambda r0 = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(r1, r2, r0)
            r1 = r18
            r12.setContent(r1, r0)
            r15.updateRememberedValue(r12)
        L_0x0126:
            r15.endReplaceableGroup()
            androidx.compose.ui.window.DialogWrapper r12 = (androidx.compose.p002ui.window.DialogWrapper) r12
            androidx.compose.ui.window.AndroidDialog_androidKt$Dialog$1 r0 = new androidx.compose.ui.window.AndroidDialog_androidKt$Dialog$1
            r0.<init>(r12)
            r1 = 8
            androidx.compose.runtime.EffectsKt.DisposableEffect((java.lang.Object) r12, (kotlin.jvm.functions.Function1<? super androidx.compose.runtime.DisposableEffectScope, ? extends androidx.compose.runtime.DisposableEffectResult>) r0, (androidx.compose.runtime.Composer) r15, (int) r1)
            androidx.compose.ui.window.AndroidDialog_androidKt$Dialog$2 r0 = new androidx.compose.ui.window.AndroidDialog_androidKt$Dialog$2
            r0.<init>(r12, r7, r11, r14)
            r1 = 0
            androidx.compose.runtime.EffectsKt.SideEffect(r0, r15, r1)
            boolean r0 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r0 == 0) goto L_0x0147
            androidx.compose.runtime.ComposerKt.traceEventEnd()
        L_0x0147:
            r2 = r11
        L_0x0148:
            androidx.compose.runtime.ScopeUpdateScope r6 = r15.endRestartGroup()
            if (r6 != 0) goto L_0x014f
            goto L_0x0160
        L_0x014f:
            androidx.compose.ui.window.AndroidDialog_androidKt$Dialog$3 r10 = new androidx.compose.ui.window.AndroidDialog_androidKt$Dialog$3
            r0 = r10
            r1 = r19
            r3 = r21
            r4 = r23
            r5 = r24
            r0.<init>(r1, r2, r3, r4, r5)
            r6.updateScope(r10)
        L_0x0160:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p002ui.window.AndroidDialog_androidKt.Dialog(of.a, androidx.compose.ui.window.DialogProperties, of.o, androidx.compose.runtime.Composer, int, int):void");
    }

    /* access modifiers changed from: private */
    public static final C13088o<Composer, Integer, C11921v> Dialog$lambda$0(State<? extends C13088o<? super Composer, ? super Integer, C11921v>> state) {
        return (C13088o) state.getValue();
    }

    /* access modifiers changed from: private */
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    @Composable
    public static final void DialogLayout(Modifier modifier, C13088o<? super Composer, ? super Integer, C11921v> oVar, Composer composer, int i, int i2) {
        int i3;
        int i4;
        int i5;
        Composer startRestartGroup = composer.startRestartGroup(-1177876616);
        int i6 = i2 & 1;
        if (i6 != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            if (startRestartGroup.changed((Object) modifier)) {
                i5 = 4;
            } else {
                i5 = 2;
            }
            i3 = i5 | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            if (startRestartGroup.changedInstance(oVar)) {
                i4 = 32;
            } else {
                i4 = 16;
            }
            i3 |= i4;
        }
        if ((i3 & 91) != 18 || !startRestartGroup.getSkipping()) {
            if (i6 != 0) {
                modifier = Modifier.Companion;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1177876616, i3, -1, "androidx.compose.ui.window.DialogLayout (AndroidDialog.android.kt:439)");
            }
            AndroidDialog_androidKt$DialogLayout$1 androidDialog_androidKt$DialogLayout$1 = AndroidDialog_androidKt$DialogLayout$1.INSTANCE;
            int i7 = ((i3 >> 3) & 14) | ((i3 << 3) & 112);
            startRestartGroup.startReplaceableGroup(-1323940314);
            Density density = (Density) startRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
            LayoutDirection layoutDirection = (LayoutDirection) startRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
            ViewConfiguration viewConfiguration = (ViewConfiguration) startRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
            ComposeUiNode.Companion companion = ComposeUiNode.Companion;
            C13074a<ComposeUiNode> constructor = companion.getConstructor();
            C13089p<SkippableUpdater<ComposeUiNode>, Composer, Integer, C11921v> materializerOf = LayoutKt.materializerOf(modifier);
            int i8 = ((i7 << 9) & 7168) | 6;
            if (!(startRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
                startRestartGroup.createNode(constructor);
            } else {
                startRestartGroup.useNode();
            }
            Composer r6 = Updater.m35292constructorimpl(startRestartGroup);
            Updater.m35299setimpl(r6, androidDialog_androidKt$DialogLayout$1, companion.getSetMeasurePolicy());
            Updater.m35299setimpl(r6, density, companion.getSetDensity());
            Updater.m35299setimpl(r6, layoutDirection, companion.getSetLayoutDirection());
            Updater.m35299setimpl(r6, viewConfiguration, companion.getSetViewConfiguration());
            materializerOf.invoke(SkippableUpdater.m35283boximpl(SkippableUpdater.m35284constructorimpl(startRestartGroup)), startRestartGroup, Integer.valueOf((i8 >> 3) & 112));
            startRestartGroup.startReplaceableGroup(2058660585);
            oVar.invoke(startRestartGroup, Integer.valueOf((i8 >> 9) & 14));
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
            endRestartGroup.updateScope(new AndroidDialog_androidKt$DialogLayout$2(modifier, oVar, i, i2));
        }
    }
}
