package androidx.compose.p002ui.window;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import androidx.compose.p002ui.Modifier;
import androidx.compose.p002ui.layout.LayoutKt;
import androidx.compose.p002ui.node.ComposeUiNode;
import androidx.compose.p002ui.platform.CompositionLocalsKt;
import androidx.compose.p002ui.platform.ViewConfiguration;
import androidx.compose.p002ui.unit.Density;
import androidx.compose.p002ui.unit.IntRect;
import androidx.compose.p002ui.unit.LayoutDirection;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.SnapshotMutationPolicy;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import com.rmn.apiclient.impl.api.descriptors.APIResourceDescriptors;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.SourceDebugExtension;
import p336ef.C11921v;
import p404of.C13074a;
import p404of.C13088o;
import p404of.C13089p;

@SourceDebugExtension({"SMAP\nAndroidPopup.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidPopup.android.kt\nandroidx/compose/ui/window/AndroidPopup_androidKt\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 5 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 6 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,824:1\n50#2:825\n49#2:826\n25#2:837\n456#2,14:857\n456#2,14:885\n1114#3,6:827\n1114#3,6:838\n76#4:833\n76#4:834\n76#4:835\n76#4:836\n76#4:845\n76#4:873\n74#5:844\n75#5,11:846\n88#5:871\n74#5:872\n75#5,11:874\n88#5:899\n76#6:900\n*S KotlinDebug\n*F\n+ 1 AndroidPopup.android.kt\nandroidx/compose/ui/window/AndroidPopup_androidKt\n*L\n194#1:825\n194#1:826\n235#1:837\n309#1:857,14\n341#1:885,14\n194#1:827,6\n235#1:838,6\n228#1:833\n229#1:834\n230#1:835\n231#1:836\n309#1:845\n341#1:873\n309#1:844\n309#1:846,11\n309#1:871\n341#1:872\n341#1:874,11\n341#1:899\n233#1:900\n*E\n"})
/* renamed from: androidx.compose.ui.window.AndroidPopup_androidKt */
/* compiled from: AndroidPopup.android.kt */
public final class AndroidPopup_androidKt {
    private static final ProvidableCompositionLocal<String> LocalPopupTestTag = CompositionLocalKt.compositionLocalOf$default((SnapshotMutationPolicy) null, AndroidPopup_androidKt$LocalPopupTestTag$1.INSTANCE, 1, (Object) null);

    /* JADX WARNING: Removed duplicated region for block: B:24:0x0050  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0053  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x006c  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x006f  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x008d  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0094  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x0255  */
    /* JADX WARNING: Removed duplicated region for block: B:77:? A[RETURN, SYNTHETIC] */
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    @androidx.compose.runtime.Composable
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void Popup(androidx.compose.p002ui.window.PopupPositionProvider r35, p404of.C13074a<p336ef.C11921v> r36, androidx.compose.p002ui.window.PopupProperties r37, p404of.C13088o<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, p336ef.C11921v> r38, androidx.compose.runtime.Composer r39, int r40, int r41) {
        /*
            r11 = r35
            r12 = r38
            r13 = r40
            java.lang.String r0 = "popupPositionProvider"
            kotlin.jvm.internal.C12775o.m28639i(r11, r0)
            java.lang.String r0 = "content"
            kotlin.jvm.internal.C12775o.m28639i(r12, r0)
            r0 = -830247068(0xffffffffce836f64, float:-1.1025577E9)
            r1 = r39
            androidx.compose.runtime.Composer r14 = r1.startRestartGroup(r0)
            r1 = r41 & 1
            if (r1 == 0) goto L_0x0020
            r1 = r13 | 6
            goto L_0x0030
        L_0x0020:
            r1 = r13 & 14
            if (r1 != 0) goto L_0x002f
            boolean r1 = r14.changed((java.lang.Object) r11)
            if (r1 == 0) goto L_0x002c
            r1 = 4
            goto L_0x002d
        L_0x002c:
            r1 = 2
        L_0x002d:
            r1 = r1 | r13
            goto L_0x0030
        L_0x002f:
            r1 = r13
        L_0x0030:
            r2 = r41 & 2
            if (r2 == 0) goto L_0x0037
            r1 = r1 | 48
            goto L_0x004a
        L_0x0037:
            r3 = r13 & 112(0x70, float:1.57E-43)
            if (r3 != 0) goto L_0x004a
            r3 = r36
            boolean r4 = r14.changedInstance(r3)
            if (r4 == 0) goto L_0x0046
            r4 = 32
            goto L_0x0048
        L_0x0046:
            r4 = 16
        L_0x0048:
            r1 = r1 | r4
            goto L_0x004c
        L_0x004a:
            r3 = r36
        L_0x004c:
            r4 = r41 & 4
            if (r4 == 0) goto L_0x0053
            r1 = r1 | 384(0x180, float:5.38E-43)
            goto L_0x0066
        L_0x0053:
            r5 = r13 & 896(0x380, float:1.256E-42)
            if (r5 != 0) goto L_0x0066
            r5 = r37
            boolean r6 = r14.changed((java.lang.Object) r5)
            if (r6 == 0) goto L_0x0062
            r6 = 256(0x100, float:3.59E-43)
            goto L_0x0064
        L_0x0062:
            r6 = 128(0x80, float:1.794E-43)
        L_0x0064:
            r1 = r1 | r6
            goto L_0x0068
        L_0x0066:
            r5 = r37
        L_0x0068:
            r6 = r41 & 8
            if (r6 == 0) goto L_0x006f
            r1 = r1 | 3072(0xc00, float:4.305E-42)
            goto L_0x007f
        L_0x006f:
            r6 = r13 & 7168(0x1c00, float:1.0045E-41)
            if (r6 != 0) goto L_0x007f
            boolean r6 = r14.changedInstance(r12)
            if (r6 == 0) goto L_0x007c
            r6 = 2048(0x800, float:2.87E-42)
            goto L_0x007e
        L_0x007c:
            r6 = 1024(0x400, float:1.435E-42)
        L_0x007e:
            r1 = r1 | r6
        L_0x007f:
            r15 = r1
            r1 = r15 & 5851(0x16db, float:8.199E-42)
            r6 = 1170(0x492, float:1.64E-42)
            if (r1 != r6) goto L_0x0094
            boolean r1 = r14.getSkipping()
            if (r1 != 0) goto L_0x008d
            goto L_0x0094
        L_0x008d:
            r14.skipToGroupEnd()
            r2 = r3
            r3 = r5
            goto L_0x024e
        L_0x0094:
            r10 = 0
            if (r2 == 0) goto L_0x009a
            r22 = r10
            goto L_0x009c
        L_0x009a:
            r22 = r3
        L_0x009c:
            if (r4 == 0) goto L_0x00b6
            androidx.compose.ui.window.PopupProperties r1 = new androidx.compose.ui.window.PopupProperties
            r24 = 0
            r25 = 0
            r26 = 0
            r27 = 0
            r28 = 0
            r29 = 0
            r30 = 63
            r31 = 0
            r23 = r1
            r23.<init>(r24, r25, r26, r27, r28, r29, r30, r31)
            goto L_0x00b8
        L_0x00b6:
            r23 = r5
        L_0x00b8:
            boolean r1 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r1 == 0) goto L_0x00c4
            r1 = -1
            java.lang.String r2 = "androidx.compose.ui.window.Popup (AndroidPopup.android.kt:221)"
            androidx.compose.runtime.ComposerKt.traceEventStart(r0, r15, r1, r2)
        L_0x00c4:
            androidx.compose.runtime.ProvidableCompositionLocal r0 = androidx.compose.p002ui.platform.AndroidCompositionLocals_androidKt.getLocalView()
            java.lang.Object r0 = r14.consume(r0)
            r8 = r0
            android.view.View r8 = (android.view.View) r8
            androidx.compose.runtime.ProvidableCompositionLocal r0 = androidx.compose.p002ui.platform.CompositionLocalsKt.getLocalDensity()
            java.lang.Object r0 = r14.consume(r0)
            r9 = r0
            androidx.compose.ui.unit.Density r9 = (androidx.compose.p002ui.unit.Density) r9
            androidx.compose.runtime.ProvidableCompositionLocal<java.lang.String> r0 = LocalPopupTestTag
            java.lang.Object r0 = r14.consume(r0)
            r24 = r0
            java.lang.String r24 = (java.lang.String) r24
            androidx.compose.runtime.ProvidableCompositionLocal r0 = androidx.compose.p002ui.platform.CompositionLocalsKt.getLocalLayoutDirection()
            java.lang.Object r0 = r14.consume(r0)
            androidx.compose.ui.unit.LayoutDirection r0 = (androidx.compose.p002ui.unit.LayoutDirection) r0
            r7 = 0
            androidx.compose.runtime.CompositionContext r6 = androidx.compose.runtime.ComposablesKt.rememberCompositionContext(r14, r7)
            int r1 = r15 >> 9
            r1 = r1 & 14
            androidx.compose.runtime.State r5 = androidx.compose.runtime.SnapshotStateKt.rememberUpdatedState(r12, r14, r1)
            java.lang.Object[] r1 = new java.lang.Object[r7]
            r2 = 0
            r3 = 0
            androidx.compose.ui.window.AndroidPopup_androidKt$Popup$popupId$1 r4 = androidx.compose.p002ui.window.AndroidPopup_androidKt$Popup$popupId$1.INSTANCE
            r16 = 3080(0xc08, float:4.316E-42)
            r17 = 6
            r32 = r5
            r5 = r14
            r33 = r6
            r6 = r16
            r7 = r17
            java.lang.Object r1 = androidx.compose.runtime.saveable.RememberSaveableKt.rememberSaveable((java.lang.Object[]) r1, r2, (java.lang.String) r3, r4, (androidx.compose.runtime.Composer) r5, (int) r6, (int) r7)
            r7 = r1
            java.util.UUID r7 = (java.util.UUID) r7
            r1 = -492369756(0xffffffffe2a708a4, float:-1.5406144E21)
            r14.startReplaceableGroup(r1)
            java.lang.Object r1 = r14.rememberedValue()
            androidx.compose.runtime.Composer$Companion r2 = androidx.compose.runtime.Composer.Companion
            java.lang.Object r2 = r2.getEmpty()
            if (r1 != r2) goto L_0x016b
            androidx.compose.ui.window.PopupLayout r6 = new androidx.compose.ui.window.PopupLayout
            java.lang.String r1 = "popupId"
            kotlin.jvm.internal.C12775o.m28638h(r7, r1)
            r16 = 0
            r17 = 128(0x80, float:1.794E-43)
            r18 = 0
            r5 = r0
            r0 = r6
            r1 = r22
            r2 = r23
            r3 = r24
            r4 = r8
            r8 = r5
            r5 = r9
            r9 = r6
            r6 = r35
            r36 = r8
            r8 = r16
            r34 = r9
            r9 = r17
            r12 = r10
            r10 = r18
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            androidx.compose.ui.window.AndroidPopup_androidKt$Popup$popupLayout$1$1$1 r0 = new androidx.compose.ui.window.AndroidPopup_androidKt$Popup$popupLayout$1$1$1
            r1 = r32
            r2 = r34
            r0.<init>(r2, r1)
            r1 = 1302892335(0x4da88f2f, float:3.53494496E8)
            r3 = 1
            androidx.compose.runtime.internal.ComposableLambda r0 = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(r1, r3, r0)
            r1 = r33
            r2.setContent(r1, r0)
            r14.updateRememberedValue(r2)
            r1 = r2
            goto L_0x016e
        L_0x016b:
            r36 = r0
            r12 = r10
        L_0x016e:
            r14.endReplaceableGroup()
            androidx.compose.ui.window.PopupLayout r1 = (androidx.compose.p002ui.window.PopupLayout) r1
            androidx.compose.ui.window.AndroidPopup_androidKt$Popup$2 r0 = new androidx.compose.ui.window.AndroidPopup_androidKt$Popup$2
            r16 = r0
            r17 = r1
            r18 = r22
            r19 = r23
            r20 = r24
            r21 = r36
            r16.<init>(r17, r18, r19, r20, r21)
            r2 = 8
            androidx.compose.runtime.EffectsKt.DisposableEffect((java.lang.Object) r1, (kotlin.jvm.functions.Function1<? super androidx.compose.runtime.DisposableEffectScope, ? extends androidx.compose.runtime.DisposableEffectResult>) r0, (androidx.compose.runtime.Composer) r14, (int) r2)
            androidx.compose.ui.window.AndroidPopup_androidKt$Popup$3 r0 = new androidx.compose.ui.window.AndroidPopup_androidKt$Popup$3
            r16 = r0
            r16.<init>(r17, r18, r19, r20, r21)
            r2 = 0
            androidx.compose.runtime.EffectsKt.SideEffect(r0, r14, r2)
            androidx.compose.ui.window.AndroidPopup_androidKt$Popup$4 r0 = new androidx.compose.ui.window.AndroidPopup_androidKt$Popup$4
            r0.<init>(r1, r11)
            r3 = r15 & 14
            androidx.compose.runtime.EffectsKt.DisposableEffect((java.lang.Object) r11, (kotlin.jvm.functions.Function1<? super androidx.compose.runtime.DisposableEffectScope, ? extends androidx.compose.runtime.DisposableEffectResult>) r0, (androidx.compose.runtime.Composer) r14, (int) r3)
            androidx.compose.ui.window.AndroidPopup_androidKt$Popup$5 r0 = new androidx.compose.ui.window.AndroidPopup_androidKt$Popup$5
            r0.<init>(r1, r12)
            r3 = 72
            androidx.compose.runtime.EffectsKt.LaunchedEffect((java.lang.Object) r1, (p404of.C13088o<? super p466yf.C13995l0, ? super p355hf.C12074d<? super p336ef.C11921v>, ? extends java.lang.Object>) r0, (androidx.compose.runtime.Composer) r14, (int) r3)
            androidx.compose.ui.Modifier$Companion r0 = androidx.compose.p002ui.Modifier.Companion
            androidx.compose.ui.window.AndroidPopup_androidKt$Popup$7 r3 = new androidx.compose.ui.window.AndroidPopup_androidKt$Popup$7
            r3.<init>(r1)
            androidx.compose.ui.Modifier r0 = androidx.compose.p002ui.layout.OnGloballyPositionedModifierKt.onGloballyPositioned(r0, r3)
            androidx.compose.ui.window.AndroidPopup_androidKt$Popup$8 r3 = new androidx.compose.ui.window.AndroidPopup_androidKt$Popup$8
            r4 = r36
            r3.<init>(r1, r4)
            r1 = -1323940314(0xffffffffb1164626, float:-2.1867748E-9)
            r14.startReplaceableGroup(r1)
            androidx.compose.runtime.ProvidableCompositionLocal r1 = androidx.compose.p002ui.platform.CompositionLocalsKt.getLocalDensity()
            java.lang.Object r1 = r14.consume(r1)
            androidx.compose.ui.unit.Density r1 = (androidx.compose.p002ui.unit.Density) r1
            androidx.compose.runtime.ProvidableCompositionLocal r4 = androidx.compose.p002ui.platform.CompositionLocalsKt.getLocalLayoutDirection()
            java.lang.Object r4 = r14.consume(r4)
            androidx.compose.ui.unit.LayoutDirection r4 = (androidx.compose.p002ui.unit.LayoutDirection) r4
            androidx.compose.runtime.ProvidableCompositionLocal r5 = androidx.compose.p002ui.platform.CompositionLocalsKt.getLocalViewConfiguration()
            java.lang.Object r5 = r14.consume(r5)
            androidx.compose.ui.platform.ViewConfiguration r5 = (androidx.compose.p002ui.platform.ViewConfiguration) r5
            androidx.compose.ui.node.ComposeUiNode$Companion r6 = androidx.compose.p002ui.node.ComposeUiNode.Companion
            of.a r7 = r6.getConstructor()
            of.p r0 = androidx.compose.p002ui.layout.LayoutKt.materializerOf(r0)
            androidx.compose.runtime.Applier r8 = r14.getApplier()
            boolean r8 = r8 instanceof androidx.compose.runtime.Applier
            if (r8 != 0) goto L_0x01f3
            androidx.compose.runtime.ComposablesKt.invalidApplier()
        L_0x01f3:
            r14.startReusableNode()
            boolean r8 = r14.getInserting()
            if (r8 == 0) goto L_0x0200
            r14.createNode(r7)
            goto L_0x0203
        L_0x0200:
            r14.useNode()
        L_0x0203:
            androidx.compose.runtime.Composer r7 = androidx.compose.runtime.Updater.m35292constructorimpl(r14)
            of.o r8 = r6.getSetMeasurePolicy()
            androidx.compose.runtime.Updater.m35299setimpl((androidx.compose.runtime.Composer) r7, r3, r8)
            of.o r3 = r6.getSetDensity()
            androidx.compose.runtime.Updater.m35299setimpl((androidx.compose.runtime.Composer) r7, r1, r3)
            of.o r1 = r6.getSetLayoutDirection()
            androidx.compose.runtime.Updater.m35299setimpl((androidx.compose.runtime.Composer) r7, r4, r1)
            of.o r1 = r6.getSetViewConfiguration()
            androidx.compose.runtime.Updater.m35299setimpl((androidx.compose.runtime.Composer) r7, r5, r1)
            androidx.compose.runtime.Composer r1 = androidx.compose.runtime.SkippableUpdater.m35284constructorimpl(r14)
            androidx.compose.runtime.SkippableUpdater r1 = androidx.compose.runtime.SkippableUpdater.m35283boximpl(r1)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r0.invoke(r1, r14, r2)
            r0 = 2058660585(0x7ab4aae9, float:4.6903995E35)
            r14.startReplaceableGroup(r0)
            r14.endReplaceableGroup()
            r14.endNode()
            r14.endReplaceableGroup()
            boolean r0 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r0 == 0) goto L_0x024a
            androidx.compose.runtime.ComposerKt.traceEventEnd()
        L_0x024a:
            r2 = r22
            r3 = r23
        L_0x024e:
            androidx.compose.runtime.ScopeUpdateScope r7 = r14.endRestartGroup()
            if (r7 != 0) goto L_0x0255
            goto L_0x0266
        L_0x0255:
            androidx.compose.ui.window.AndroidPopup_androidKt$Popup$9 r8 = new androidx.compose.ui.window.AndroidPopup_androidKt$Popup$9
            r0 = r8
            r1 = r35
            r4 = r38
            r5 = r40
            r6 = r41
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r7.updateScope(r8)
        L_0x0266:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p002ui.window.AndroidPopup_androidKt.Popup(androidx.compose.ui.window.PopupPositionProvider, of.a, androidx.compose.ui.window.PopupProperties, of.o, androidx.compose.runtime.Composer, int, int):void");
    }

    /* access modifiers changed from: private */
    public static final C13088o<Composer, Integer, C11921v> Popup$lambda$1(State<? extends C13088o<? super Composer, ? super Integer, C11921v>> state) {
        return (C13088o) state.getValue();
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v6, resolved type: androidx.compose.ui.window.AlignmentOffsetPositionProvider} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0050  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0053  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x006c  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x006f  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0088  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x008b  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x00ac  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x00b5  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x014b  */
    /* JADX WARNING: Removed duplicated region for block: B:85:? A[RETURN, SYNTHETIC] */
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    @androidx.compose.runtime.Composable
    /* renamed from: Popup-K5zGePQ  reason: not valid java name */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m38710PopupK5zGePQ(androidx.compose.p002ui.Alignment r24, long r25, p404of.C13074a<p336ef.C11921v> r27, androidx.compose.p002ui.window.PopupProperties r28, p404of.C13088o<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, p336ef.C11921v> r29, androidx.compose.runtime.Composer r30, int r31, int r32) {
        /*
            r7 = r29
            r8 = r31
            java.lang.String r0 = "content"
            kotlin.jvm.internal.C12775o.m28639i(r7, r0)
            r0 = 295309329(0x119a1011, float:2.4306818E-28)
            r1 = r30
            androidx.compose.runtime.Composer r9 = r1.startRestartGroup(r0)
            r1 = r32 & 1
            if (r1 == 0) goto L_0x001c
            r2 = r8 | 6
            r3 = r2
            r2 = r24
            goto L_0x0030
        L_0x001c:
            r2 = r8 & 14
            if (r2 != 0) goto L_0x002d
            r2 = r24
            boolean r3 = r9.changed((java.lang.Object) r2)
            if (r3 == 0) goto L_0x002a
            r3 = 4
            goto L_0x002b
        L_0x002a:
            r3 = 2
        L_0x002b:
            r3 = r3 | r8
            goto L_0x0030
        L_0x002d:
            r2 = r24
            r3 = r8
        L_0x0030:
            r4 = r32 & 2
            if (r4 == 0) goto L_0x0037
            r3 = r3 | 48
            goto L_0x004a
        L_0x0037:
            r5 = r8 & 112(0x70, float:1.57E-43)
            if (r5 != 0) goto L_0x004a
            r5 = r25
            boolean r10 = r9.changed((long) r5)
            if (r10 == 0) goto L_0x0046
            r10 = 32
            goto L_0x0048
        L_0x0046:
            r10 = 16
        L_0x0048:
            r3 = r3 | r10
            goto L_0x004c
        L_0x004a:
            r5 = r25
        L_0x004c:
            r10 = r32 & 4
            if (r10 == 0) goto L_0x0053
            r3 = r3 | 384(0x180, float:5.38E-43)
            goto L_0x0066
        L_0x0053:
            r11 = r8 & 896(0x380, float:1.256E-42)
            if (r11 != 0) goto L_0x0066
            r11 = r27
            boolean r12 = r9.changedInstance(r11)
            if (r12 == 0) goto L_0x0062
            r12 = 256(0x100, float:3.59E-43)
            goto L_0x0064
        L_0x0062:
            r12 = 128(0x80, float:1.794E-43)
        L_0x0064:
            r3 = r3 | r12
            goto L_0x0068
        L_0x0066:
            r11 = r27
        L_0x0068:
            r12 = r32 & 8
            if (r12 == 0) goto L_0x006f
            r3 = r3 | 3072(0xc00, float:4.305E-42)
            goto L_0x0082
        L_0x006f:
            r13 = r8 & 7168(0x1c00, float:1.0045E-41)
            if (r13 != 0) goto L_0x0082
            r13 = r28
            boolean r14 = r9.changed((java.lang.Object) r13)
            if (r14 == 0) goto L_0x007e
            r14 = 2048(0x800, float:2.87E-42)
            goto L_0x0080
        L_0x007e:
            r14 = 1024(0x400, float:1.435E-42)
        L_0x0080:
            r3 = r3 | r14
            goto L_0x0084
        L_0x0082:
            r13 = r28
        L_0x0084:
            r14 = r32 & 16
            if (r14 == 0) goto L_0x008b
            r3 = r3 | 24576(0x6000, float:3.4438E-41)
            goto L_0x009d
        L_0x008b:
            r14 = 57344(0xe000, float:8.0356E-41)
            r14 = r14 & r8
            if (r14 != 0) goto L_0x009d
            boolean r14 = r9.changedInstance(r7)
            if (r14 == 0) goto L_0x009a
            r14 = 16384(0x4000, float:2.2959E-41)
            goto L_0x009c
        L_0x009a:
            r14 = 8192(0x2000, float:1.14794E-41)
        L_0x009c:
            r3 = r3 | r14
        L_0x009d:
            r14 = 46811(0xb6db, float:6.5596E-41)
            r14 = r14 & r3
            r15 = 9362(0x2492, float:1.3119E-41)
            if (r14 != r15) goto L_0x00b5
            boolean r14 = r9.getSkipping()
            if (r14 != 0) goto L_0x00ac
            goto L_0x00b5
        L_0x00ac:
            r9.skipToGroupEnd()
            r1 = r2
            r2 = r5
            r4 = r11
            r5 = r13
            goto L_0x0144
        L_0x00b5:
            if (r1 == 0) goto L_0x00bf
            androidx.compose.ui.Alignment$Companion r1 = androidx.compose.p002ui.Alignment.Companion
            androidx.compose.ui.Alignment r1 = r1.getTopStart()
            r14 = r1
            goto L_0x00c0
        L_0x00bf:
            r14 = r2
        L_0x00c0:
            if (r4 == 0) goto L_0x00c8
            r1 = 0
            long r1 = androidx.compose.p002ui.unit.IntOffsetKt.IntOffset(r1, r1)
            r5 = r1
        L_0x00c8:
            r1 = 0
            if (r10 == 0) goto L_0x00cc
            r11 = r1
        L_0x00cc:
            if (r12 == 0) goto L_0x00e5
            androidx.compose.ui.window.PopupProperties r2 = new androidx.compose.ui.window.PopupProperties
            r16 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r22 = 63
            r23 = 0
            r15 = r2
            r15.<init>(r16, r17, r18, r19, r20, r21, r22, r23)
            r13 = r2
        L_0x00e5:
            boolean r2 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r2 == 0) goto L_0x00f1
            r2 = -1
            java.lang.String r4 = "androidx.compose.ui.window.Popup (AndroidPopup.android.kt:186)"
            androidx.compose.runtime.ComposerKt.traceEventStart(r0, r3, r2, r4)
        L_0x00f1:
            androidx.compose.ui.unit.IntOffset r0 = androidx.compose.p002ui.unit.IntOffset.m38577boximpl(r5)
            r2 = 511388516(0x1e7b2b64, float:1.3296802E-20)
            r9.startReplaceableGroup(r2)
            boolean r2 = r9.changed((java.lang.Object) r14)
            boolean r0 = r9.changed((java.lang.Object) r0)
            r0 = r0 | r2
            java.lang.Object r2 = r9.rememberedValue()
            if (r0 != 0) goto L_0x0112
            androidx.compose.runtime.Composer$Companion r0 = androidx.compose.runtime.Composer.Companion
            java.lang.Object r0 = r0.getEmpty()
            if (r2 != r0) goto L_0x011a
        L_0x0112:
            androidx.compose.ui.window.AlignmentOffsetPositionProvider r2 = new androidx.compose.ui.window.AlignmentOffsetPositionProvider
            r2.<init>(r14, r5, r1)
            r9.updateRememberedValue(r2)
        L_0x011a:
            r9.endReplaceableGroup()
            r0 = r2
            androidx.compose.ui.window.AlignmentOffsetPositionProvider r0 = (androidx.compose.p002ui.window.AlignmentOffsetPositionProvider) r0
            int r1 = r3 >> 3
            r2 = r1 & 112(0x70, float:1.57E-43)
            r3 = r1 & 896(0x380, float:1.256E-42)
            r2 = r2 | r3
            r1 = r1 & 7168(0x1c00, float:1.0045E-41)
            r10 = r2 | r1
            r12 = 0
            r1 = r11
            r2 = r13
            r3 = r29
            r4 = r9
            r15 = r5
            r5 = r10
            r6 = r12
            Popup(r0, r1, r2, r3, r4, r5, r6)
            boolean r0 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r0 == 0) goto L_0x0140
            androidx.compose.runtime.ComposerKt.traceEventEnd()
        L_0x0140:
            r4 = r11
            r5 = r13
            r1 = r14
            r2 = r15
        L_0x0144:
            androidx.compose.runtime.ScopeUpdateScope r9 = r9.endRestartGroup()
            if (r9 != 0) goto L_0x014b
            goto L_0x015a
        L_0x014b:
            androidx.compose.ui.window.AndroidPopup_androidKt$Popup$1 r10 = new androidx.compose.ui.window.AndroidPopup_androidKt$Popup$1
            r0 = r10
            r6 = r29
            r7 = r31
            r8 = r32
            r0.<init>(r1, r2, r4, r5, r6, r7, r8)
            r9.updateScope(r10)
        L_0x015a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p002ui.window.AndroidPopup_androidKt.m38710PopupK5zGePQ(androidx.compose.ui.Alignment, long, of.a, androidx.compose.ui.window.PopupProperties, of.o, androidx.compose.runtime.Composer, int, int):void");
    }

    @ComposableInferredTarget(scheme = "[0[0]]")
    @Composable
    public static final void PopupTestTag(String str, C13088o<? super Composer, ? super Integer, C11921v> oVar, Composer composer, int i) {
        int i2;
        int i3;
        int i4;
        C12775o.m28639i(str, APIResourceDescriptors.RESOURCE_TYPE_TAG);
        C12775o.m28639i(oVar, "content");
        Composer startRestartGroup = composer.startRestartGroup(-498879600);
        if ((i & 14) == 0) {
            if (startRestartGroup.changed((Object) str)) {
                i4 = 4;
            } else {
                i4 = 2;
            }
            i2 = i4 | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            if (startRestartGroup.changedInstance(oVar)) {
                i3 = 32;
            } else {
                i3 = 16;
            }
            i2 |= i3;
        }
        if ((i2 & 91) != 18 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-498879600, i2, -1, "androidx.compose.ui.window.PopupTestTag (AndroidPopup.android.kt:331)");
            }
            CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{LocalPopupTestTag.provides(str)}, oVar, startRestartGroup, (i2 & 112) | 8);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new AndroidPopup_androidKt$PopupTestTag$1(str, oVar, i));
        }
    }

    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    @Composable
    private static final void SimpleStack(Modifier modifier, C13088o<? super Composer, ? super Integer, C11921v> oVar, Composer composer, int i) {
        composer.startReplaceableGroup(1406149896);
        AndroidPopup_androidKt$SimpleStack$1 androidPopup_androidKt$SimpleStack$1 = AndroidPopup_androidKt$SimpleStack$1.INSTANCE;
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
        Updater.m35299setimpl(r5, androidPopup_androidKt$SimpleStack$1, companion.getSetMeasurePolicy());
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

    public static final boolean isFlagSecureEnabled(View view) {
        WindowManager.LayoutParams layoutParams;
        C12775o.m28639i(view, "<this>");
        ViewGroup.LayoutParams layoutParams2 = view.getRootView().getLayoutParams();
        if (layoutParams2 instanceof WindowManager.LayoutParams) {
            layoutParams = (WindowManager.LayoutParams) layoutParams2;
        } else {
            layoutParams = null;
        }
        if (layoutParams == null || (layoutParams.flags & 8192) == 0) {
            return false;
        }
        return true;
    }

    public static final boolean isPopupLayout(View view, String str) {
        C12775o.m28639i(view, "view");
        if (!(view instanceof PopupLayout) || (str != null && !C12775o.m28634d(str, ((PopupLayout) view).getTestTag()))) {
            return false;
        }
        return true;
    }

    public static /* synthetic */ boolean isPopupLayout$default(View view, String str, int i, Object obj) {
        if ((i & 2) != 0) {
            str = null;
        }
        return isPopupLayout(view, str);
    }

    /* access modifiers changed from: private */
    public static final IntRect toIntBounds(Rect rect) {
        return new IntRect(rect.left, rect.top, rect.right, rect.bottom);
    }
}
