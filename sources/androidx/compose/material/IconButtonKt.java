package androidx.compose.material;

import androidx.compose.p002ui.unit.C1232Dp;
import kotlin.jvm.internal.SourceDebugExtension;

@SourceDebugExtension({"SMAP\nIconButton.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IconButton.kt\nandroidx/compose/material/IconButtonKt\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 5 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 6 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 7 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,130:1\n25#2:131\n460#2,13:156\n473#2,3:171\n25#2:176\n460#2,13:201\n473#2,3:216\n1114#3,6:132\n1114#3,6:177\n68#4,5:138\n73#4:169\n77#4:175\n68#4,5:183\n73#4:214\n77#4:220\n75#5:143\n76#5,11:145\n89#5:174\n75#5:188\n76#5,11:190\n89#5:219\n76#6:144\n76#6:170\n76#6:189\n76#6:215\n154#7:221\n*S KotlinDebug\n*F\n+ 1 IconButton.kt\nandroidx/compose/material/IconButtonKt\n*L\n63#1:131\n66#1:156,13\n66#1:171,3\n107#1:176\n110#1:201,13\n110#1:216,3\n63#1:132,6\n107#1:177,6\n66#1:138,5\n66#1:169\n66#1:175\n110#1:183,5\n110#1:214\n110#1:220\n66#1:143\n66#1:145,11\n66#1:174\n110#1:188\n110#1:190,11\n110#1:219\n66#1:144\n78#1:170\n110#1:189\n123#1:215\n129#1:221\n*E\n"})
/* compiled from: IconButton.kt */
public final class IconButtonKt {
    private static final float RippleRadius = C1232Dp.m38468constructorimpl((float) 24);

    /* JADX WARNING: Removed duplicated region for block: B:24:0x0050  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0053  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x006c  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x006f  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0088  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x008b  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x00ad  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x00b5  */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x0216  */
    /* JADX WARNING: Removed duplicated region for block: B:93:? A[RETURN, SYNTHETIC] */
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    @androidx.compose.runtime.Composable
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void IconButton(p404of.C13074a<p336ef.C11921v> r18, androidx.compose.p002ui.Modifier r19, boolean r20, androidx.compose.foundation.interaction.MutableInteractionSource r21, p404of.C13088o<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, p336ef.C11921v> r22, androidx.compose.runtime.Composer r23, int r24, int r25) {
        /*
            r9 = r18
            r10 = r22
            r11 = r24
            java.lang.String r0 = "onClick"
            kotlin.jvm.internal.C12775o.m28639i(r9, r0)
            java.lang.String r0 = "content"
            kotlin.jvm.internal.C12775o.m28639i(r10, r0)
            r0 = -111063634(0xfffffffff9614dae, float:-7.3115145E34)
            r1 = r23
            androidx.compose.runtime.Composer r12 = r1.startRestartGroup(r0)
            r1 = r25 & 1
            if (r1 == 0) goto L_0x0020
            r1 = r11 | 6
            goto L_0x0030
        L_0x0020:
            r1 = r11 & 14
            if (r1 != 0) goto L_0x002f
            boolean r1 = r12.changedInstance(r9)
            if (r1 == 0) goto L_0x002c
            r1 = 4
            goto L_0x002d
        L_0x002c:
            r1 = 2
        L_0x002d:
            r1 = r1 | r11
            goto L_0x0030
        L_0x002f:
            r1 = r11
        L_0x0030:
            r2 = r25 & 2
            if (r2 == 0) goto L_0x0037
            r1 = r1 | 48
            goto L_0x004a
        L_0x0037:
            r3 = r11 & 112(0x70, float:1.57E-43)
            if (r3 != 0) goto L_0x004a
            r3 = r19
            boolean r4 = r12.changed((java.lang.Object) r3)
            if (r4 == 0) goto L_0x0046
            r4 = 32
            goto L_0x0048
        L_0x0046:
            r4 = 16
        L_0x0048:
            r1 = r1 | r4
            goto L_0x004c
        L_0x004a:
            r3 = r19
        L_0x004c:
            r4 = r25 & 4
            if (r4 == 0) goto L_0x0053
            r1 = r1 | 384(0x180, float:5.38E-43)
            goto L_0x0066
        L_0x0053:
            r5 = r11 & 896(0x380, float:1.256E-42)
            if (r5 != 0) goto L_0x0066
            r5 = r20
            boolean r6 = r12.changed((boolean) r5)
            if (r6 == 0) goto L_0x0062
            r6 = 256(0x100, float:3.59E-43)
            goto L_0x0064
        L_0x0062:
            r6 = 128(0x80, float:1.794E-43)
        L_0x0064:
            r1 = r1 | r6
            goto L_0x0068
        L_0x0066:
            r5 = r20
        L_0x0068:
            r6 = r25 & 8
            if (r6 == 0) goto L_0x006f
            r1 = r1 | 3072(0xc00, float:4.305E-42)
            goto L_0x0082
        L_0x006f:
            r7 = r11 & 7168(0x1c00, float:1.0045E-41)
            if (r7 != 0) goto L_0x0082
            r7 = r21
            boolean r8 = r12.changed((java.lang.Object) r7)
            if (r8 == 0) goto L_0x007e
            r8 = 2048(0x800, float:2.87E-42)
            goto L_0x0080
        L_0x007e:
            r8 = 1024(0x400, float:1.435E-42)
        L_0x0080:
            r1 = r1 | r8
            goto L_0x0084
        L_0x0082:
            r7 = r21
        L_0x0084:
            r8 = r25 & 16
            if (r8 == 0) goto L_0x008b
            r1 = r1 | 24576(0x6000, float:3.4438E-41)
            goto L_0x009d
        L_0x008b:
            r8 = 57344(0xe000, float:8.0356E-41)
            r8 = r8 & r11
            if (r8 != 0) goto L_0x009d
            boolean r8 = r12.changedInstance(r10)
            if (r8 == 0) goto L_0x009a
            r8 = 16384(0x4000, float:2.2959E-41)
            goto L_0x009c
        L_0x009a:
            r8 = 8192(0x2000, float:1.14794E-41)
        L_0x009c:
            r1 = r1 | r8
        L_0x009d:
            r13 = r1
            r1 = 46811(0xb6db, float:6.5596E-41)
            r1 = r1 & r13
            r8 = 9362(0x2492, float:1.3119E-41)
            if (r1 != r8) goto L_0x00b5
            boolean r1 = r12.getSkipping()
            if (r1 != 0) goto L_0x00ad
            goto L_0x00b5
        L_0x00ad:
            r12.skipToGroupEnd()
            r2 = r3
            r3 = r5
            r4 = r7
            goto L_0x020f
        L_0x00b5:
            if (r2 == 0) goto L_0x00bb
            androidx.compose.ui.Modifier$Companion r1 = androidx.compose.p002ui.Modifier.Companion
            r14 = r1
            goto L_0x00bc
        L_0x00bb:
            r14 = r3
        L_0x00bc:
            if (r4 == 0) goto L_0x00c1
            r16 = 1
            goto L_0x00c3
        L_0x00c1:
            r16 = r5
        L_0x00c3:
            if (r6 == 0) goto L_0x00e6
            r1 = -492369756(0xffffffffe2a708a4, float:-1.5406144E21)
            r12.startReplaceableGroup(r1)
            java.lang.Object r1 = r12.rememberedValue()
            androidx.compose.runtime.Composer$Companion r2 = androidx.compose.runtime.Composer.Companion
            java.lang.Object r2 = r2.getEmpty()
            if (r1 != r2) goto L_0x00de
            androidx.compose.foundation.interaction.MutableInteractionSource r1 = androidx.compose.foundation.interaction.InteractionSourceKt.MutableInteractionSource()
            r12.updateRememberedValue(r1)
        L_0x00de:
            r12.endReplaceableGroup()
            androidx.compose.foundation.interaction.MutableInteractionSource r1 = (androidx.compose.foundation.interaction.MutableInteractionSource) r1
            r17 = r1
            goto L_0x00e8
        L_0x00e6:
            r17 = r7
        L_0x00e8:
            boolean r1 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r1 == 0) goto L_0x00f4
            r1 = -1
            java.lang.String r2 = "androidx.compose.material.IconButton (IconButton.kt:58)"
            androidx.compose.runtime.ComposerKt.traceEventStart(r0, r13, r1, r2)
        L_0x00f4:
            androidx.compose.ui.Modifier r0 = androidx.compose.material.InteractiveComponentSizeKt.minimumInteractiveComponentSize(r14)
            androidx.compose.ui.semantics.Role$Companion r1 = androidx.compose.p002ui.semantics.Role.Companion
            int r8 = r1.m37814getButtono7Vup1c()
            r1 = 0
            float r2 = RippleRadius
            r3 = 0
            r6 = 54
            r7 = 4
            r5 = r12
            androidx.compose.foundation.Indication r2 = androidx.compose.material.ripple.RippleKt.m34235rememberRipple9IZ8Weo(r1, r2, r3, r5, r6, r7)
            r4 = 0
            androidx.compose.ui.semantics.Role r5 = androidx.compose.p002ui.semantics.Role.m37807boximpl(r8)
            r7 = 8
            r8 = 0
            r1 = r17
            r3 = r16
            r6 = r18
            androidx.compose.ui.Modifier r0 = androidx.compose.foundation.ClickableKt.m32979clickableO2vRcR0$default(r0, r1, r2, r3, r4, r5, r6, r7, r8)
            androidx.compose.ui.Alignment$Companion r1 = androidx.compose.p002ui.Alignment.Companion
            androidx.compose.ui.Alignment r1 = r1.getCenter()
            r2 = 733328855(0x2bb5b5d7, float:1.2911294E-12)
            r12.startReplaceableGroup(r2)
            r2 = 0
            r3 = 6
            androidx.compose.ui.layout.MeasurePolicy r1 = androidx.compose.foundation.layout.BoxKt.rememberBoxMeasurePolicy(r1, r2, r12, r3)
            r4 = -1323940314(0xffffffffb1164626, float:-2.1867748E-9)
            r12.startReplaceableGroup(r4)
            androidx.compose.runtime.ProvidableCompositionLocal r4 = androidx.compose.p002ui.platform.CompositionLocalsKt.getLocalDensity()
            java.lang.Object r4 = r12.consume(r4)
            androidx.compose.ui.unit.Density r4 = (androidx.compose.p002ui.unit.Density) r4
            androidx.compose.runtime.ProvidableCompositionLocal r5 = androidx.compose.p002ui.platform.CompositionLocalsKt.getLocalLayoutDirection()
            java.lang.Object r5 = r12.consume(r5)
            androidx.compose.ui.unit.LayoutDirection r5 = (androidx.compose.p002ui.unit.LayoutDirection) r5
            androidx.compose.runtime.ProvidableCompositionLocal r6 = androidx.compose.p002ui.platform.CompositionLocalsKt.getLocalViewConfiguration()
            java.lang.Object r6 = r12.consume(r6)
            androidx.compose.ui.platform.ViewConfiguration r6 = (androidx.compose.p002ui.platform.ViewConfiguration) r6
            androidx.compose.ui.node.ComposeUiNode$Companion r7 = androidx.compose.p002ui.node.ComposeUiNode.Companion
            of.a r8 = r7.getConstructor()
            of.p r0 = androidx.compose.p002ui.layout.LayoutKt.materializerOf(r0)
            androidx.compose.runtime.Applier r15 = r12.getApplier()
            boolean r15 = r15 instanceof androidx.compose.runtime.Applier
            if (r15 != 0) goto L_0x0168
            androidx.compose.runtime.ComposablesKt.invalidApplier()
        L_0x0168:
            r12.startReusableNode()
            boolean r15 = r12.getInserting()
            if (r15 == 0) goto L_0x0175
            r12.createNode(r8)
            goto L_0x0178
        L_0x0175:
            r12.useNode()
        L_0x0178:
            r12.disableReusing()
            androidx.compose.runtime.Composer r8 = androidx.compose.runtime.Updater.m35292constructorimpl(r12)
            of.o r15 = r7.getSetMeasurePolicy()
            androidx.compose.runtime.Updater.m35299setimpl((androidx.compose.runtime.Composer) r8, r1, r15)
            of.o r1 = r7.getSetDensity()
            androidx.compose.runtime.Updater.m35299setimpl((androidx.compose.runtime.Composer) r8, r4, r1)
            of.o r1 = r7.getSetLayoutDirection()
            androidx.compose.runtime.Updater.m35299setimpl((androidx.compose.runtime.Composer) r8, r5, r1)
            of.o r1 = r7.getSetViewConfiguration()
            androidx.compose.runtime.Updater.m35299setimpl((androidx.compose.runtime.Composer) r8, r6, r1)
            r12.enableReusing()
            androidx.compose.runtime.Composer r1 = androidx.compose.runtime.SkippableUpdater.m35284constructorimpl(r12)
            androidx.compose.runtime.SkippableUpdater r1 = androidx.compose.runtime.SkippableUpdater.m35283boximpl(r1)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r2)
            r0.invoke(r1, r12, r4)
            r0 = 2058660585(0x7ab4aae9, float:4.6903995E35)
            r12.startReplaceableGroup(r0)
            androidx.compose.foundation.layout.BoxScopeInstance r0 = androidx.compose.foundation.layout.BoxScopeInstance.INSTANCE
            if (r16 == 0) goto L_0x01cc
            r0 = 753555784(0x2cea5948, float:6.660592E-12)
            r12.startReplaceableGroup(r0)
            androidx.compose.runtime.ProvidableCompositionLocal r0 = androidx.compose.material.ContentAlphaKt.getLocalContentAlpha()
            java.lang.Object r0 = r12.consume(r0)
            java.lang.Number r0 = (java.lang.Number) r0
            float r0 = r0.floatValue()
            goto L_0x01d8
        L_0x01cc:
            r0 = 753555810(0x2cea5962, float:6.6606035E-12)
            r12.startReplaceableGroup(r0)
            androidx.compose.material.ContentAlpha r0 = androidx.compose.material.ContentAlpha.INSTANCE
            float r0 = r0.getDisabled(r12, r3)
        L_0x01d8:
            r12.endReplaceableGroup()
            r1 = 1
            androidx.compose.runtime.ProvidedValue[] r1 = new androidx.compose.runtime.ProvidedValue[r1]
            androidx.compose.runtime.ProvidableCompositionLocal r3 = androidx.compose.material.ContentAlphaKt.getLocalContentAlpha()
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
            androidx.compose.runtime.ProvidedValue r0 = r3.provides(r0)
            r1[r2] = r0
            int r0 = r13 >> 9
            r0 = r0 & 112(0x70, float:1.57E-43)
            r0 = r0 | 8
            androidx.compose.runtime.CompositionLocalKt.CompositionLocalProvider((androidx.compose.runtime.ProvidedValue<?>[]) r1, (p404of.C13088o<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, p336ef.C11921v>) r10, (androidx.compose.runtime.Composer) r12, (int) r0)
            r12.endReplaceableGroup()
            r12.endNode()
            r12.endReplaceableGroup()
            r12.endReplaceableGroup()
            boolean r0 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r0 == 0) goto L_0x020a
            androidx.compose.runtime.ComposerKt.traceEventEnd()
        L_0x020a:
            r2 = r14
            r3 = r16
            r4 = r17
        L_0x020f:
            androidx.compose.runtime.ScopeUpdateScope r8 = r12.endRestartGroup()
            if (r8 != 0) goto L_0x0216
            goto L_0x0227
        L_0x0216:
            androidx.compose.material.IconButtonKt$IconButton$3 r12 = new androidx.compose.material.IconButtonKt$IconButton$3
            r0 = r12
            r1 = r18
            r5 = r22
            r6 = r24
            r7 = r25
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            r8.updateScope(r12)
        L_0x0227:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.IconButtonKt.IconButton(of.a, androidx.compose.ui.Modifier, boolean, androidx.compose.foundation.interaction.MutableInteractionSource, of.o, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:102:0x023a  */
    /* JADX WARNING: Removed duplicated region for block: B:104:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x006b  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x006e  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0087  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x008a  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00a5  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x00a9  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x00ca  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x00d2  */
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    @androidx.compose.runtime.Composable
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void IconToggleButton(boolean r20, kotlin.jvm.functions.Function1<? super java.lang.Boolean, p336ef.C11921v> r21, androidx.compose.p002ui.Modifier r22, boolean r23, androidx.compose.foundation.interaction.MutableInteractionSource r24, p404of.C13088o<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, p336ef.C11921v> r25, androidx.compose.runtime.Composer r26, int r27, int r28) {
        /*
            r7 = r21
            r8 = r25
            r9 = r27
            java.lang.String r0 = "onCheckedChange"
            kotlin.jvm.internal.C12775o.m28639i(r7, r0)
            java.lang.String r0 = "content"
            kotlin.jvm.internal.C12775o.m28639i(r8, r0)
            r0 = -54657793(0xfffffffffcbdfcff, float:-7.891804E36)
            r1 = r26
            androidx.compose.runtime.Composer r6 = r1.startRestartGroup(r0)
            r1 = r28 & 1
            if (r1 == 0) goto L_0x0022
            r1 = r9 | 6
            r5 = r20
            goto L_0x0034
        L_0x0022:
            r1 = r9 & 14
            r5 = r20
            if (r1 != 0) goto L_0x0033
            boolean r1 = r6.changed((boolean) r5)
            if (r1 == 0) goto L_0x0030
            r1 = 4
            goto L_0x0031
        L_0x0030:
            r1 = 2
        L_0x0031:
            r1 = r1 | r9
            goto L_0x0034
        L_0x0033:
            r1 = r9
        L_0x0034:
            r2 = r28 & 2
            if (r2 == 0) goto L_0x003b
            r1 = r1 | 48
            goto L_0x004b
        L_0x003b:
            r2 = r9 & 112(0x70, float:1.57E-43)
            if (r2 != 0) goto L_0x004b
            boolean r2 = r6.changedInstance(r7)
            if (r2 == 0) goto L_0x0048
            r2 = 32
            goto L_0x004a
        L_0x0048:
            r2 = 16
        L_0x004a:
            r1 = r1 | r2
        L_0x004b:
            r2 = r28 & 4
            if (r2 == 0) goto L_0x0052
            r1 = r1 | 384(0x180, float:5.38E-43)
            goto L_0x0065
        L_0x0052:
            r3 = r9 & 896(0x380, float:1.256E-42)
            if (r3 != 0) goto L_0x0065
            r3 = r22
            boolean r4 = r6.changed((java.lang.Object) r3)
            if (r4 == 0) goto L_0x0061
            r4 = 256(0x100, float:3.59E-43)
            goto L_0x0063
        L_0x0061:
            r4 = 128(0x80, float:1.794E-43)
        L_0x0063:
            r1 = r1 | r4
            goto L_0x0067
        L_0x0065:
            r3 = r22
        L_0x0067:
            r4 = r28 & 8
            if (r4 == 0) goto L_0x006e
            r1 = r1 | 3072(0xc00, float:4.305E-42)
            goto L_0x0081
        L_0x006e:
            r10 = r9 & 7168(0x1c00, float:1.0045E-41)
            if (r10 != 0) goto L_0x0081
            r10 = r23
            boolean r11 = r6.changed((boolean) r10)
            if (r11 == 0) goto L_0x007d
            r11 = 2048(0x800, float:2.87E-42)
            goto L_0x007f
        L_0x007d:
            r11 = 1024(0x400, float:1.435E-42)
        L_0x007f:
            r1 = r1 | r11
            goto L_0x0083
        L_0x0081:
            r10 = r23
        L_0x0083:
            r11 = r28 & 16
            if (r11 == 0) goto L_0x008a
            r1 = r1 | 24576(0x6000, float:3.4438E-41)
            goto L_0x009f
        L_0x008a:
            r12 = 57344(0xe000, float:8.0356E-41)
            r12 = r12 & r9
            if (r12 != 0) goto L_0x009f
            r12 = r24
            boolean r13 = r6.changed((java.lang.Object) r12)
            if (r13 == 0) goto L_0x009b
            r13 = 16384(0x4000, float:2.2959E-41)
            goto L_0x009d
        L_0x009b:
            r13 = 8192(0x2000, float:1.14794E-41)
        L_0x009d:
            r1 = r1 | r13
            goto L_0x00a1
        L_0x009f:
            r12 = r24
        L_0x00a1:
            r13 = r28 & 32
            if (r13 == 0) goto L_0x00a9
            r13 = 196608(0x30000, float:2.75506E-40)
        L_0x00a7:
            r1 = r1 | r13
            goto L_0x00ba
        L_0x00a9:
            r13 = 458752(0x70000, float:6.42848E-40)
            r13 = r13 & r9
            if (r13 != 0) goto L_0x00ba
            boolean r13 = r6.changedInstance(r8)
            if (r13 == 0) goto L_0x00b7
            r13 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00a7
        L_0x00b7:
            r13 = 65536(0x10000, float:9.18355E-41)
            goto L_0x00a7
        L_0x00ba:
            r13 = 374491(0x5b6db, float:5.24774E-40)
            r13 = r13 & r1
            r14 = 74898(0x12492, float:1.04954E-40)
            if (r13 != r14) goto L_0x00d2
            boolean r13 = r6.getSkipping()
            if (r13 != 0) goto L_0x00ca
            goto L_0x00d2
        L_0x00ca:
            r6.skipToGroupEnd()
            r4 = r10
            r5 = r12
            r10 = r6
            goto L_0x0233
        L_0x00d2:
            if (r2 == 0) goto L_0x00d9
            androidx.compose.ui.Modifier$Companion r2 = androidx.compose.p002ui.Modifier.Companion
            r17 = r2
            goto L_0x00db
        L_0x00d9:
            r17 = r3
        L_0x00db:
            r3 = 1
            if (r4 == 0) goto L_0x00e1
            r18 = r3
            goto L_0x00e3
        L_0x00e1:
            r18 = r10
        L_0x00e3:
            if (r11 == 0) goto L_0x0106
            r2 = -492369756(0xffffffffe2a708a4, float:-1.5406144E21)
            r6.startReplaceableGroup(r2)
            java.lang.Object r2 = r6.rememberedValue()
            androidx.compose.runtime.Composer$Companion r4 = androidx.compose.runtime.Composer.Companion
            java.lang.Object r4 = r4.getEmpty()
            if (r2 != r4) goto L_0x00fe
            androidx.compose.foundation.interaction.MutableInteractionSource r2 = androidx.compose.foundation.interaction.InteractionSourceKt.MutableInteractionSource()
            r6.updateRememberedValue(r2)
        L_0x00fe:
            r6.endReplaceableGroup()
            androidx.compose.foundation.interaction.MutableInteractionSource r2 = (androidx.compose.foundation.interaction.MutableInteractionSource) r2
            r19 = r2
            goto L_0x0108
        L_0x0106:
            r19 = r12
        L_0x0108:
            boolean r2 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r2 == 0) goto L_0x0114
            r2 = -1
            java.lang.String r4 = "androidx.compose.material.IconToggleButton (IconButton.kt:101)"
            androidx.compose.runtime.ComposerKt.traceEventStart(r0, r1, r2, r4)
        L_0x0114:
            androidx.compose.ui.Modifier r0 = androidx.compose.material.InteractiveComponentSizeKt.minimumInteractiveComponentSize(r17)
            androidx.compose.ui.semantics.Role$Companion r2 = androidx.compose.p002ui.semantics.Role.Companion
            int r2 = r2.m37815getCheckboxo7Vup1c()
            r10 = 0
            float r11 = RippleRadius
            r12 = 0
            r15 = 54
            r16 = 4
            r14 = r6
            androidx.compose.foundation.Indication r4 = androidx.compose.material.ripple.RippleKt.m34235rememberRipple9IZ8Weo(r10, r11, r12, r14, r15, r16)
            androidx.compose.ui.semantics.Role r10 = androidx.compose.p002ui.semantics.Role.m37807boximpl(r2)
            r11 = r1
            r1 = r20
            r2 = r19
            r12 = r3
            r3 = r4
            r4 = r18
            r5 = r10
            r10 = r6
            r6 = r21
            androidx.compose.ui.Modifier r0 = androidx.compose.foundation.selection.ToggleableKt.m33591toggleableO2vRcR0(r0, r1, r2, r3, r4, r5, r6)
            androidx.compose.ui.Alignment$Companion r1 = androidx.compose.p002ui.Alignment.Companion
            androidx.compose.ui.Alignment r1 = r1.getCenter()
            r2 = 733328855(0x2bb5b5d7, float:1.2911294E-12)
            r10.startReplaceableGroup(r2)
            r2 = 0
            r3 = 6
            androidx.compose.ui.layout.MeasurePolicy r1 = androidx.compose.foundation.layout.BoxKt.rememberBoxMeasurePolicy(r1, r2, r10, r3)
            r4 = -1323940314(0xffffffffb1164626, float:-2.1867748E-9)
            r10.startReplaceableGroup(r4)
            androidx.compose.runtime.ProvidableCompositionLocal r4 = androidx.compose.p002ui.platform.CompositionLocalsKt.getLocalDensity()
            java.lang.Object r4 = r10.consume(r4)
            androidx.compose.ui.unit.Density r4 = (androidx.compose.p002ui.unit.Density) r4
            androidx.compose.runtime.ProvidableCompositionLocal r5 = androidx.compose.p002ui.platform.CompositionLocalsKt.getLocalLayoutDirection()
            java.lang.Object r5 = r10.consume(r5)
            androidx.compose.ui.unit.LayoutDirection r5 = (androidx.compose.p002ui.unit.LayoutDirection) r5
            androidx.compose.runtime.ProvidableCompositionLocal r6 = androidx.compose.p002ui.platform.CompositionLocalsKt.getLocalViewConfiguration()
            java.lang.Object r6 = r10.consume(r6)
            androidx.compose.ui.platform.ViewConfiguration r6 = (androidx.compose.p002ui.platform.ViewConfiguration) r6
            androidx.compose.ui.node.ComposeUiNode$Companion r13 = androidx.compose.p002ui.node.ComposeUiNode.Companion
            of.a r14 = r13.getConstructor()
            of.p r0 = androidx.compose.p002ui.layout.LayoutKt.materializerOf(r0)
            androidx.compose.runtime.Applier r15 = r10.getApplier()
            boolean r15 = r15 instanceof androidx.compose.runtime.Applier
            if (r15 != 0) goto L_0x018c
            androidx.compose.runtime.ComposablesKt.invalidApplier()
        L_0x018c:
            r10.startReusableNode()
            boolean r15 = r10.getInserting()
            if (r15 == 0) goto L_0x0199
            r10.createNode(r14)
            goto L_0x019c
        L_0x0199:
            r10.useNode()
        L_0x019c:
            r10.disableReusing()
            androidx.compose.runtime.Composer r14 = androidx.compose.runtime.Updater.m35292constructorimpl(r10)
            of.o r15 = r13.getSetMeasurePolicy()
            androidx.compose.runtime.Updater.m35299setimpl((androidx.compose.runtime.Composer) r14, r1, r15)
            of.o r1 = r13.getSetDensity()
            androidx.compose.runtime.Updater.m35299setimpl((androidx.compose.runtime.Composer) r14, r4, r1)
            of.o r1 = r13.getSetLayoutDirection()
            androidx.compose.runtime.Updater.m35299setimpl((androidx.compose.runtime.Composer) r14, r5, r1)
            of.o r1 = r13.getSetViewConfiguration()
            androidx.compose.runtime.Updater.m35299setimpl((androidx.compose.runtime.Composer) r14, r6, r1)
            r10.enableReusing()
            androidx.compose.runtime.Composer r1 = androidx.compose.runtime.SkippableUpdater.m35284constructorimpl(r10)
            androidx.compose.runtime.SkippableUpdater r1 = androidx.compose.runtime.SkippableUpdater.m35283boximpl(r1)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r2)
            r0.invoke(r1, r10, r4)
            r0 = 2058660585(0x7ab4aae9, float:4.6903995E35)
            r10.startReplaceableGroup(r0)
            androidx.compose.foundation.layout.BoxScopeInstance r0 = androidx.compose.foundation.layout.BoxScopeInstance.INSTANCE
            if (r18 == 0) goto L_0x01f0
            r0 = -1866758084(0xffffffff90bb883c, float:-7.3968397E-29)
            r10.startReplaceableGroup(r0)
            androidx.compose.runtime.ProvidableCompositionLocal r0 = androidx.compose.material.ContentAlphaKt.getLocalContentAlpha()
            java.lang.Object r0 = r10.consume(r0)
            java.lang.Number r0 = (java.lang.Number) r0
            float r0 = r0.floatValue()
            goto L_0x01fc
        L_0x01f0:
            r0 = -1866758058(0xffffffff90bb8856, float:-7.3968553E-29)
            r10.startReplaceableGroup(r0)
            androidx.compose.material.ContentAlpha r0 = androidx.compose.material.ContentAlpha.INSTANCE
            float r0 = r0.getDisabled(r10, r3)
        L_0x01fc:
            r10.endReplaceableGroup()
            androidx.compose.runtime.ProvidedValue[] r1 = new androidx.compose.runtime.ProvidedValue[r12]
            androidx.compose.runtime.ProvidableCompositionLocal r3 = androidx.compose.material.ContentAlphaKt.getLocalContentAlpha()
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
            androidx.compose.runtime.ProvidedValue r0 = r3.provides(r0)
            r1[r2] = r0
            int r0 = r11 >> 12
            r0 = r0 & 112(0x70, float:1.57E-43)
            r0 = r0 | 8
            androidx.compose.runtime.CompositionLocalKt.CompositionLocalProvider((androidx.compose.runtime.ProvidedValue<?>[]) r1, (p404of.C13088o<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, p336ef.C11921v>) r8, (androidx.compose.runtime.Composer) r10, (int) r0)
            r10.endReplaceableGroup()
            r10.endNode()
            r10.endReplaceableGroup()
            r10.endReplaceableGroup()
            boolean r0 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r0 == 0) goto L_0x022d
            androidx.compose.runtime.ComposerKt.traceEventEnd()
        L_0x022d:
            r3 = r17
            r4 = r18
            r5 = r19
        L_0x0233:
            androidx.compose.runtime.ScopeUpdateScope r10 = r10.endRestartGroup()
            if (r10 != 0) goto L_0x023a
            goto L_0x024d
        L_0x023a:
            androidx.compose.material.IconButtonKt$IconToggleButton$3 r11 = new androidx.compose.material.IconButtonKt$IconToggleButton$3
            r0 = r11
            r1 = r20
            r2 = r21
            r6 = r25
            r7 = r27
            r8 = r28
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            r10.updateScope(r11)
        L_0x024d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.IconButtonKt.IconToggleButton(boolean, kotlin.jvm.functions.Function1, androidx.compose.ui.Modifier, boolean, androidx.compose.foundation.interaction.MutableInteractionSource, of.o, androidx.compose.runtime.Composer, int, int):void");
    }
}
