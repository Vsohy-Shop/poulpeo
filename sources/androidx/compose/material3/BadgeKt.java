package androidx.compose.material3;

import androidx.compose.p002ui.unit.C1232Dp;

/* compiled from: Badge.kt */
public final class BadgeKt {
    private static final float BadgeOffset = C1232Dp.m38468constructorimpl((float) 0);
    private static final float BadgeWithContentHorizontalOffset;
    private static final float BadgeWithContentHorizontalPadding;
    private static final float BadgeWithContentVerticalOffset;

    static {
        float f = (float) 4;
        BadgeWithContentHorizontalPadding = C1232Dp.m38468constructorimpl(f);
        BadgeWithContentHorizontalOffset = C1232Dp.m38468constructorimpl(-C1232Dp.m38468constructorimpl(f));
        BadgeWithContentVerticalOffset = C1232Dp.m38468constructorimpl(-C1232Dp.m38468constructorimpl(f));
    }

    /* JADX WARNING: Removed duplicated region for block: B:100:0x022c  */
    /* JADX WARNING: Removed duplicated region for block: B:102:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0085  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x008c  */
    @androidx.compose.material3.ExperimentalMaterial3Api
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    @androidx.compose.runtime.Composable
    /* renamed from: Badge-eopBjH0  reason: not valid java name */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m34264BadgeeopBjH0(androidx.compose.p002ui.Modifier r16, long r17, long r19, p404of.C13089p<? super androidx.compose.foundation.layout.RowScope, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, p336ef.C11921v> r21, androidx.compose.runtime.Composer r22, int r23, int r24) {
        /*
            r7 = r23
            r0 = 1298144073(0x4d601b49, float:2.34992784E8)
            r1 = r22
            androidx.compose.runtime.Composer r1 = r1.startRestartGroup(r0)
            r2 = r24 & 1
            r3 = 2
            if (r2 == 0) goto L_0x0016
            r4 = r7 | 6
            r5 = r4
            r4 = r16
            goto L_0x002a
        L_0x0016:
            r4 = r7 & 14
            if (r4 != 0) goto L_0x0027
            r4 = r16
            boolean r5 = r1.changed((java.lang.Object) r4)
            if (r5 == 0) goto L_0x0024
            r5 = 4
            goto L_0x0025
        L_0x0024:
            r5 = r3
        L_0x0025:
            r5 = r5 | r7
            goto L_0x002a
        L_0x0027:
            r4 = r16
            r5 = r7
        L_0x002a:
            r6 = r7 & 112(0x70, float:1.57E-43)
            if (r6 != 0) goto L_0x0041
            r6 = r24 & 2
            r8 = r17
            if (r6 != 0) goto L_0x003d
            boolean r6 = r1.changed((long) r8)
            if (r6 == 0) goto L_0x003d
            r6 = 32
            goto L_0x003f
        L_0x003d:
            r6 = 16
        L_0x003f:
            r5 = r5 | r6
            goto L_0x0043
        L_0x0041:
            r8 = r17
        L_0x0043:
            r6 = r7 & 896(0x380, float:1.256E-42)
            if (r6 != 0) goto L_0x005a
            r6 = r24 & 4
            r10 = r19
            if (r6 != 0) goto L_0x0056
            boolean r6 = r1.changed((long) r10)
            if (r6 == 0) goto L_0x0056
            r6 = 256(0x100, float:3.59E-43)
            goto L_0x0058
        L_0x0056:
            r6 = 128(0x80, float:1.794E-43)
        L_0x0058:
            r5 = r5 | r6
            goto L_0x005c
        L_0x005a:
            r10 = r19
        L_0x005c:
            r6 = r24 & 8
            if (r6 == 0) goto L_0x0063
            r5 = r5 | 3072(0xc00, float:4.305E-42)
            goto L_0x0076
        L_0x0063:
            r12 = r7 & 7168(0x1c00, float:1.0045E-41)
            if (r12 != 0) goto L_0x0076
            r12 = r21
            boolean r13 = r1.changed((java.lang.Object) r12)
            if (r13 == 0) goto L_0x0072
            r13 = 2048(0x800, float:2.87E-42)
            goto L_0x0074
        L_0x0072:
            r13 = 1024(0x400, float:1.435E-42)
        L_0x0074:
            r5 = r5 | r13
            goto L_0x0078
        L_0x0076:
            r12 = r21
        L_0x0078:
            r13 = r5 & 5851(0x16db, float:8.199E-42)
            r14 = 1170(0x492, float:1.64E-42)
            if (r13 != r14) goto L_0x008c
            boolean r13 = r1.getSkipping()
            if (r13 != 0) goto L_0x0085
            goto L_0x008c
        L_0x0085:
            r1.skipToGroupEnd()
        L_0x0088:
            r2 = r8
            r6 = r12
            goto L_0x0225
        L_0x008c:
            r1.startDefaults()
            r13 = r7 & 1
            r14 = 0
            r15 = 6
            if (r13 == 0) goto L_0x00ad
            boolean r13 = r1.getDefaultsInvalid()
            if (r13 == 0) goto L_0x009c
            goto L_0x00ad
        L_0x009c:
            r1.skipToGroupEnd()
            r2 = r24 & 2
            if (r2 == 0) goto L_0x00a5
            r5 = r5 & -113(0xffffffffffffff8f, float:NaN)
        L_0x00a5:
            r2 = r24 & 4
            if (r2 == 0) goto L_0x00ab
            r5 = r5 & -897(0xfffffffffffffc7f, float:NaN)
        L_0x00ab:
            r2 = r4
            goto L_0x00d1
        L_0x00ad:
            if (r2 == 0) goto L_0x00b2
            androidx.compose.ui.Modifier$Companion r2 = androidx.compose.p002ui.Modifier.Companion
            goto L_0x00b3
        L_0x00b2:
            r2 = r4
        L_0x00b3:
            r4 = r24 & 2
            if (r4 == 0) goto L_0x00bf
            androidx.compose.material3.BadgeDefaults r4 = androidx.compose.material3.BadgeDefaults.INSTANCE
            long r8 = r4.getContainerColor(r1, r15)
            r5 = r5 & -113(0xffffffffffffff8f, float:NaN)
        L_0x00bf:
            r4 = r24 & 4
            if (r4 == 0) goto L_0x00ce
            int r4 = r5 >> 3
            r4 = r4 & 14
            long r10 = androidx.compose.material3.ColorSchemeKt.m34359contentColorForek8zF_U(r8, r1, r4)
            r4 = r5 & -897(0xfffffffffffffc7f, float:NaN)
            r5 = r4
        L_0x00ce:
            if (r6 == 0) goto L_0x00d1
            r12 = r14
        L_0x00d1:
            r1.endDefaults()
            boolean r4 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r4 == 0) goto L_0x00e0
            r4 = -1
            java.lang.String r6 = "androidx.compose.material3.Badge (Badge.kt:139)"
            androidx.compose.runtime.ComposerKt.traceEventStart(r0, r5, r4, r6)
        L_0x00e0:
            androidx.compose.material3.tokens.BadgeTokens r0 = androidx.compose.material3.tokens.BadgeTokens.INSTANCE
            if (r12 == 0) goto L_0x00e9
            float r0 = r0.m34776getLargeSizeD9Ej5fM()
            goto L_0x00ed
        L_0x00e9:
            float r0 = r0.m34777getSizeD9Ej5fM()
        L_0x00ed:
            if (r12 == 0) goto L_0x0103
            r4 = 1947275116(0x74110f6c, float:4.5971426E31)
            r1.startReplaceableGroup(r4)
            androidx.compose.material3.tokens.BadgeTokens r4 = androidx.compose.material3.tokens.BadgeTokens.INSTANCE
            androidx.compose.material3.tokens.ShapeKeyTokens r4 = r4.getLargeShape()
            androidx.compose.ui.graphics.Shape r4 = androidx.compose.material3.ShapesKt.toShape(r4, r1, r15)
            r1.endReplaceableGroup()
            goto L_0x0116
        L_0x0103:
            r4 = 1947275170(0x74110fa2, float:4.5971687E31)
            r1.startReplaceableGroup(r4)
            androidx.compose.material3.tokens.BadgeTokens r4 = androidx.compose.material3.tokens.BadgeTokens.INSTANCE
            androidx.compose.material3.tokens.ShapeKeyTokens r4 = r4.getShape()
            androidx.compose.ui.graphics.Shape r4 = androidx.compose.material3.ShapesKt.toShape(r4, r1, r15)
            r1.endReplaceableGroup()
        L_0x0116:
            androidx.compose.ui.Modifier r0 = androidx.compose.foundation.layout.SizeKt.m33322defaultMinSizeVpY3zN4(r2, r0, r0)
            androidx.compose.ui.Modifier r0 = androidx.compose.foundation.BackgroundKt.m32956backgroundbw27NRU(r0, r8, r4)
            androidx.compose.ui.Modifier r0 = androidx.compose.p002ui.draw.ClipKt.clip(r0, r4)
            if (r12 == 0) goto L_0x012e
            androidx.compose.ui.Modifier$Companion r4 = androidx.compose.p002ui.Modifier.Companion
            float r6 = BadgeWithContentHorizontalPadding
            r13 = 0
            androidx.compose.ui.Modifier r3 = androidx.compose.foundation.layout.PaddingKt.m33270paddingVpY3zN4$default(r4, r6, r13, r3, r14)
            goto L_0x0130
        L_0x012e:
            androidx.compose.ui.Modifier$Companion r3 = androidx.compose.p002ui.Modifier.Companion
        L_0x0130:
            androidx.compose.ui.Modifier r0 = r0.then(r3)
            androidx.compose.ui.Alignment$Companion r3 = androidx.compose.p002ui.Alignment.Companion
            androidx.compose.ui.Alignment$Vertical r3 = r3.getCenterVertically()
            androidx.compose.foundation.layout.Arrangement r4 = androidx.compose.foundation.layout.Arrangement.INSTANCE
            androidx.compose.foundation.layout.Arrangement$HorizontalOrVertical r4 = r4.getCenter()
            r6 = 693286680(0x2952b718, float:4.6788176E-14)
            r1.startReplaceableGroup(r6)
            r6 = 54
            androidx.compose.ui.layout.MeasurePolicy r3 = androidx.compose.foundation.layout.RowKt.rowMeasurePolicy(r4, r3, r1, r6)
            r4 = -1323940314(0xffffffffb1164626, float:-2.1867748E-9)
            r1.startReplaceableGroup(r4)
            androidx.compose.runtime.ProvidableCompositionLocal r4 = androidx.compose.p002ui.platform.CompositionLocalsKt.getLocalDensity()
            java.lang.Object r4 = r1.consume(r4)
            androidx.compose.ui.unit.Density r4 = (androidx.compose.p002ui.unit.Density) r4
            androidx.compose.runtime.ProvidableCompositionLocal r6 = androidx.compose.p002ui.platform.CompositionLocalsKt.getLocalLayoutDirection()
            java.lang.Object r6 = r1.consume(r6)
            androidx.compose.ui.unit.LayoutDirection r6 = (androidx.compose.p002ui.unit.LayoutDirection) r6
            androidx.compose.runtime.ProvidableCompositionLocal r13 = androidx.compose.p002ui.platform.CompositionLocalsKt.getLocalViewConfiguration()
            java.lang.Object r13 = r1.consume(r13)
            androidx.compose.ui.platform.ViewConfiguration r13 = (androidx.compose.p002ui.platform.ViewConfiguration) r13
            androidx.compose.ui.node.ComposeUiNode$Companion r14 = androidx.compose.p002ui.node.ComposeUiNode.Companion
            of.a r15 = r14.getConstructor()
            of.p r0 = androidx.compose.p002ui.layout.LayoutKt.materializerOf(r0)
            r16 = r2
            androidx.compose.runtime.Applier r2 = r1.getApplier()
            boolean r2 = r2 instanceof androidx.compose.runtime.Applier
            if (r2 != 0) goto L_0x0187
            androidx.compose.runtime.ComposablesKt.invalidApplier()
        L_0x0187:
            r1.startReusableNode()
            boolean r2 = r1.getInserting()
            if (r2 == 0) goto L_0x0194
            r1.createNode(r15)
            goto L_0x0197
        L_0x0194:
            r1.useNode()
        L_0x0197:
            r1.disableReusing()
            androidx.compose.runtime.Composer r2 = androidx.compose.runtime.Updater.m35292constructorimpl(r1)
            of.o r15 = r14.getSetMeasurePolicy()
            androidx.compose.runtime.Updater.m35299setimpl((androidx.compose.runtime.Composer) r2, r3, r15)
            of.o r3 = r14.getSetDensity()
            androidx.compose.runtime.Updater.m35299setimpl((androidx.compose.runtime.Composer) r2, r4, r3)
            of.o r3 = r14.getSetLayoutDirection()
            androidx.compose.runtime.Updater.m35299setimpl((androidx.compose.runtime.Composer) r2, r6, r3)
            of.o r3 = r14.getSetViewConfiguration()
            androidx.compose.runtime.Updater.m35299setimpl((androidx.compose.runtime.Composer) r2, r13, r3)
            r1.enableReusing()
            androidx.compose.runtime.Composer r2 = androidx.compose.runtime.SkippableUpdater.m35284constructorimpl(r1)
            androidx.compose.runtime.SkippableUpdater r2 = androidx.compose.runtime.SkippableUpdater.m35283boximpl(r2)
            r3 = 0
            java.lang.Integer r4 = java.lang.Integer.valueOf(r3)
            r0.invoke(r2, r1, r4)
            r0 = 2058660585(0x7ab4aae9, float:4.6903995E35)
            r1.startReplaceableGroup(r0)
            r0 = -678309503(0xffffffffd791d181, float:-3.20657997E14)
            r1.startReplaceableGroup(r0)
            androidx.compose.foundation.layout.RowScopeInstance r0 = androidx.compose.foundation.layout.RowScopeInstance.INSTANCE
            r2 = -1186521243(0xffffffffb9471f65, float:-1.8989814E-4)
            r1.startReplaceableGroup(r2)
            if (r12 == 0) goto L_0x0206
            r2 = 1
            androidx.compose.runtime.ProvidedValue[] r4 = new androidx.compose.runtime.ProvidedValue[r2]
            androidx.compose.runtime.ProvidableCompositionLocal r6 = androidx.compose.material3.ContentColorKt.getLocalContentColor()
            androidx.compose.ui.graphics.Color r13 = androidx.compose.p002ui.graphics.Color.m35661boximpl(r10)
            androidx.compose.runtime.ProvidedValue r6 = r6.provides(r13)
            r4[r3] = r6
            androidx.compose.material3.BadgeKt$Badge$1$1 r3 = new androidx.compose.material3.BadgeKt$Badge$1$1
            r6 = 6
            r3.<init>(r12, r0, r6, r5)
            r0 = 5609066(0x55966a, float:7.859976E-39)
            androidx.compose.runtime.internal.ComposableLambda r0 = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambda(r1, r0, r2, r3)
            r2 = 56
            androidx.compose.runtime.CompositionLocalKt.CompositionLocalProvider((androidx.compose.runtime.ProvidedValue<?>[]) r4, (p404of.C13088o<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, p336ef.C11921v>) r0, (androidx.compose.runtime.Composer) r1, (int) r2)
        L_0x0206:
            r1.endReplaceableGroup()
            r1.endReplaceableGroup()
            r1.endReplaceableGroup()
            r1.endNode()
            r1.endReplaceableGroup()
            r1.endReplaceableGroup()
            boolean r0 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r0 == 0) goto L_0x0221
            androidx.compose.runtime.ComposerKt.traceEventEnd()
        L_0x0221:
            r4 = r16
            goto L_0x0088
        L_0x0225:
            androidx.compose.runtime.ScopeUpdateScope r9 = r1.endRestartGroup()
            if (r9 != 0) goto L_0x022c
            goto L_0x023b
        L_0x022c:
            androidx.compose.material3.BadgeKt$Badge$2 r12 = new androidx.compose.material3.BadgeKt$Badge$2
            r0 = r12
            r1 = r4
            r4 = r10
            r7 = r23
            r8 = r24
            r0.<init>(r1, r2, r4, r6, r7, r8)
            r9.updateScope(r12)
        L_0x023b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.BadgeKt.m34264BadgeeopBjH0(androidx.compose.ui.Modifier, long, long, of.p, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x0050  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0053  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0070  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0078  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x0330  */
    /* JADX WARNING: Removed duplicated region for block: B:89:? A[RETURN, SYNTHETIC] */
    @androidx.compose.material3.ExperimentalMaterial3Api
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    @androidx.compose.runtime.Composable
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void BadgedBox(p404of.C13089p<? super androidx.compose.foundation.layout.BoxScope, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, p336ef.C11921v> r18, androidx.compose.p002ui.Modifier r19, p404of.C13089p<? super androidx.compose.foundation.layout.BoxScope, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, p336ef.C11921v> r20, androidx.compose.runtime.Composer r21, int r22, int r23) {
        /*
            r1 = r18
            r3 = r20
            r4 = r22
            java.lang.String r0 = "badge"
            kotlin.jvm.internal.C12775o.m28639i(r1, r0)
            java.lang.String r2 = "content"
            kotlin.jvm.internal.C12775o.m28639i(r3, r2)
            r2 = 1404022535(0x53afaf07, float:1.5091115E12)
            r5 = r21
            androidx.compose.runtime.Composer r5 = r5.startRestartGroup(r2)
            r6 = r23 & 1
            if (r6 == 0) goto L_0x0020
            r6 = r4 | 6
            goto L_0x0030
        L_0x0020:
            r6 = r4 & 14
            if (r6 != 0) goto L_0x002f
            boolean r6 = r5.changed((java.lang.Object) r1)
            if (r6 == 0) goto L_0x002c
            r6 = 4
            goto L_0x002d
        L_0x002c:
            r6 = 2
        L_0x002d:
            r6 = r6 | r4
            goto L_0x0030
        L_0x002f:
            r6 = r4
        L_0x0030:
            r8 = r23 & 2
            if (r8 == 0) goto L_0x0037
            r6 = r6 | 48
            goto L_0x004a
        L_0x0037:
            r9 = r4 & 112(0x70, float:1.57E-43)
            if (r9 != 0) goto L_0x004a
            r9 = r19
            boolean r10 = r5.changed((java.lang.Object) r9)
            if (r10 == 0) goto L_0x0046
            r10 = 32
            goto L_0x0048
        L_0x0046:
            r10 = 16
        L_0x0048:
            r6 = r6 | r10
            goto L_0x004c
        L_0x004a:
            r9 = r19
        L_0x004c:
            r10 = r23 & 4
            if (r10 == 0) goto L_0x0053
            r6 = r6 | 384(0x180, float:5.38E-43)
            goto L_0x0063
        L_0x0053:
            r10 = r4 & 896(0x380, float:1.256E-42)
            if (r10 != 0) goto L_0x0063
            boolean r10 = r5.changed((java.lang.Object) r3)
            if (r10 == 0) goto L_0x0060
            r10 = 256(0x100, float:3.59E-43)
            goto L_0x0062
        L_0x0060:
            r10 = 128(0x80, float:1.794E-43)
        L_0x0062:
            r6 = r6 | r10
        L_0x0063:
            r10 = r6 & 731(0x2db, float:1.024E-42)
            r11 = 146(0x92, float:2.05E-43)
            if (r10 != r11) goto L_0x0078
            boolean r10 = r5.getSkipping()
            if (r10 != 0) goto L_0x0070
            goto L_0x0078
        L_0x0070:
            r5.skipToGroupEnd()
            r2 = r1
            r17 = r9
            goto L_0x0329
        L_0x0078:
            if (r8 == 0) goto L_0x007d
            androidx.compose.ui.Modifier$Companion r8 = androidx.compose.p002ui.Modifier.Companion
            goto L_0x007e
        L_0x007d:
            r8 = r9
        L_0x007e:
            boolean r9 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r9 == 0) goto L_0x008a
            r9 = -1
            java.lang.String r10 = "androidx.compose.material3.BadgedBox (Badge.kt:61)"
            androidx.compose.runtime.ComposerKt.traceEventStart(r2, r6, r9, r10)
        L_0x008a:
            androidx.compose.material3.BadgeKt$BadgedBox$2 r2 = androidx.compose.material3.BadgeKt$BadgedBox$2.INSTANCE
            r9 = r6 & 112(0x70, float:1.57E-43)
            r10 = -1323940314(0xffffffffb1164626, float:-2.1867748E-9)
            r5.startReplaceableGroup(r10)
            androidx.compose.runtime.ProvidableCompositionLocal r11 = androidx.compose.p002ui.platform.CompositionLocalsKt.getLocalDensity()
            java.lang.Object r11 = r5.consume(r11)
            androidx.compose.ui.unit.Density r11 = (androidx.compose.p002ui.unit.Density) r11
            androidx.compose.runtime.ProvidableCompositionLocal r12 = androidx.compose.p002ui.platform.CompositionLocalsKt.getLocalLayoutDirection()
            java.lang.Object r12 = r5.consume(r12)
            androidx.compose.ui.unit.LayoutDirection r12 = (androidx.compose.p002ui.unit.LayoutDirection) r12
            androidx.compose.runtime.ProvidableCompositionLocal r13 = androidx.compose.p002ui.platform.CompositionLocalsKt.getLocalViewConfiguration()
            java.lang.Object r13 = r5.consume(r13)
            androidx.compose.ui.platform.ViewConfiguration r13 = (androidx.compose.p002ui.platform.ViewConfiguration) r13
            androidx.compose.ui.node.ComposeUiNode$Companion r14 = androidx.compose.p002ui.node.ComposeUiNode.Companion
            of.a r15 = r14.getConstructor()
            of.p r10 = androidx.compose.p002ui.layout.LayoutKt.materializerOf(r8)
            int r9 = r9 << 9
            r9 = r9 & 7168(0x1c00, float:1.0045E-41)
            r9 = r9 | 6
            androidx.compose.runtime.Applier r7 = r5.getApplier()
            boolean r7 = r7 instanceof androidx.compose.runtime.Applier
            if (r7 != 0) goto L_0x00cd
            androidx.compose.runtime.ComposablesKt.invalidApplier()
        L_0x00cd:
            r5.startReusableNode()
            boolean r7 = r5.getInserting()
            if (r7 == 0) goto L_0x00da
            r5.createNode(r15)
            goto L_0x00dd
        L_0x00da:
            r5.useNode()
        L_0x00dd:
            r5.disableReusing()
            androidx.compose.runtime.Composer r7 = androidx.compose.runtime.Updater.m35292constructorimpl(r5)
            of.o r15 = r14.getSetMeasurePolicy()
            androidx.compose.runtime.Updater.m35299setimpl((androidx.compose.runtime.Composer) r7, r2, r15)
            of.o r2 = r14.getSetDensity()
            androidx.compose.runtime.Updater.m35299setimpl((androidx.compose.runtime.Composer) r7, r11, r2)
            of.o r2 = r14.getSetLayoutDirection()
            androidx.compose.runtime.Updater.m35299setimpl((androidx.compose.runtime.Composer) r7, r12, r2)
            of.o r2 = r14.getSetViewConfiguration()
            androidx.compose.runtime.Updater.m35299setimpl((androidx.compose.runtime.Composer) r7, r13, r2)
            r5.enableReusing()
            androidx.compose.runtime.Composer r2 = androidx.compose.runtime.SkippableUpdater.m35284constructorimpl(r5)
            androidx.compose.runtime.SkippableUpdater r2 = androidx.compose.runtime.SkippableUpdater.m35283boximpl(r2)
            int r7 = r9 >> 3
            r7 = r7 & 112(0x70, float:1.57E-43)
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            r10.invoke(r2, r5, r7)
            r2 = 2058660585(0x7ab4aae9, float:4.6903995E35)
            r5.startReplaceableGroup(r2)
            int r7 = r9 >> 9
            r7 = r7 & 14
            r9 = 483395760(0x1cd008b0, float:1.3766531E-21)
            r5.startReplaceableGroup(r9)
            r7 = r7 & 11
            r9 = 2
            if (r7 != r9) goto L_0x013a
            boolean r7 = r5.getSkipping()
            if (r7 != 0) goto L_0x0132
            goto L_0x013a
        L_0x0132:
            r5.skipToGroupEnd()
            r2 = r1
            r17 = r8
            goto L_0x0314
        L_0x013a:
            androidx.compose.ui.Modifier$Companion r7 = androidx.compose.p002ui.Modifier.Companion
            java.lang.String r9 = "anchor"
            androidx.compose.ui.Modifier r9 = androidx.compose.p002ui.layout.LayoutIdKt.layoutId(r7, r9)
            androidx.compose.ui.Alignment$Companion r10 = androidx.compose.p002ui.Alignment.Companion
            androidx.compose.ui.Alignment r11 = r10.getCenter()
            int r12 = r6 << 3
            r12 = r12 & 7168(0x1c00, float:1.0045E-41)
            r12 = r12 | 54
            r13 = 733328855(0x2bb5b5d7, float:1.2911294E-12)
            r5.startReplaceableGroup(r13)
            int r15 = r12 >> 3
            r16 = r15 & 14
            r15 = r15 & 112(0x70, float:1.57E-43)
            r15 = r16 | r15
            r13 = 0
            androidx.compose.ui.layout.MeasurePolicy r11 = androidx.compose.foundation.layout.BoxKt.rememberBoxMeasurePolicy(r11, r13, r5, r15)
            int r15 = r12 << 3
            r15 = r15 & 112(0x70, float:1.57E-43)
            r13 = -1323940314(0xffffffffb1164626, float:-2.1867748E-9)
            r5.startReplaceableGroup(r13)
            androidx.compose.runtime.ProvidableCompositionLocal r13 = androidx.compose.p002ui.platform.CompositionLocalsKt.getLocalDensity()
            java.lang.Object r13 = r5.consume(r13)
            androidx.compose.ui.unit.Density r13 = (androidx.compose.p002ui.unit.Density) r13
            androidx.compose.runtime.ProvidableCompositionLocal r2 = androidx.compose.p002ui.platform.CompositionLocalsKt.getLocalLayoutDirection()
            java.lang.Object r2 = r5.consume(r2)
            androidx.compose.ui.unit.LayoutDirection r2 = (androidx.compose.p002ui.unit.LayoutDirection) r2
            androidx.compose.runtime.ProvidableCompositionLocal r4 = androidx.compose.p002ui.platform.CompositionLocalsKt.getLocalViewConfiguration()
            java.lang.Object r4 = r5.consume(r4)
            androidx.compose.ui.platform.ViewConfiguration r4 = (androidx.compose.p002ui.platform.ViewConfiguration) r4
            r17 = r8
            of.a r8 = r14.getConstructor()
            of.p r9 = androidx.compose.p002ui.layout.LayoutKt.materializerOf(r9)
            int r15 = r15 << 9
            r15 = r15 & 7168(0x1c00, float:1.0045E-41)
            r15 = r15 | 6
            androidx.compose.runtime.Applier r1 = r5.getApplier()
            boolean r1 = r1 instanceof androidx.compose.runtime.Applier
            if (r1 != 0) goto L_0x01a4
            androidx.compose.runtime.ComposablesKt.invalidApplier()
        L_0x01a4:
            r5.startReusableNode()
            boolean r1 = r5.getInserting()
            if (r1 == 0) goto L_0x01b1
            r5.createNode(r8)
            goto L_0x01b4
        L_0x01b1:
            r5.useNode()
        L_0x01b4:
            r5.disableReusing()
            androidx.compose.runtime.Composer r1 = androidx.compose.runtime.Updater.m35292constructorimpl(r5)
            of.o r8 = r14.getSetMeasurePolicy()
            androidx.compose.runtime.Updater.m35299setimpl((androidx.compose.runtime.Composer) r1, r11, r8)
            of.o r8 = r14.getSetDensity()
            androidx.compose.runtime.Updater.m35299setimpl((androidx.compose.runtime.Composer) r1, r13, r8)
            of.o r8 = r14.getSetLayoutDirection()
            androidx.compose.runtime.Updater.m35299setimpl((androidx.compose.runtime.Composer) r1, r2, r8)
            of.o r2 = r14.getSetViewConfiguration()
            androidx.compose.runtime.Updater.m35299setimpl((androidx.compose.runtime.Composer) r1, r4, r2)
            r5.enableReusing()
            androidx.compose.runtime.Composer r1 = androidx.compose.runtime.SkippableUpdater.m35284constructorimpl(r5)
            androidx.compose.runtime.SkippableUpdater r1 = androidx.compose.runtime.SkippableUpdater.m35283boximpl(r1)
            int r2 = r15 >> 3
            r2 = r2 & 112(0x70, float:1.57E-43)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r9.invoke(r1, r5, r2)
            r1 = 2058660585(0x7ab4aae9, float:4.6903995E35)
            r5.startReplaceableGroup(r1)
            int r1 = r15 >> 9
            r1 = r1 & 14
            r2 = -2137368960(0xffffffff809a5680, float:-1.4173697E-38)
            r5.startReplaceableGroup(r2)
            r1 = r1 & 11
            r4 = 2
            if (r1 != r4) goto L_0x020d
            boolean r1 = r5.getSkipping()
            if (r1 != 0) goto L_0x0209
            goto L_0x020d
        L_0x0209:
            r5.skipToGroupEnd()
            goto L_0x021c
        L_0x020d:
            androidx.compose.foundation.layout.BoxScopeInstance r1 = androidx.compose.foundation.layout.BoxScopeInstance.INSTANCE
            int r4 = r12 >> 6
            r4 = r4 & 112(0x70, float:1.57E-43)
            r4 = r4 | 6
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r3.invoke(r1, r5, r4)
        L_0x021c:
            r5.endReplaceableGroup()
            r5.endReplaceableGroup()
            r5.endNode()
            r5.endReplaceableGroup()
            r5.endReplaceableGroup()
            androidx.compose.ui.Modifier r0 = androidx.compose.p002ui.layout.LayoutIdKt.layoutId(r7, r0)
            int r1 = r6 << 9
            r1 = r1 & 7168(0x1c00, float:1.0045E-41)
            r1 = r1 | 6
            r4 = 733328855(0x2bb5b5d7, float:1.2911294E-12)
            r5.startReplaceableGroup(r4)
            androidx.compose.ui.Alignment r4 = r10.getTopStart()
            int r6 = r1 >> 3
            r7 = r6 & 14
            r6 = r6 & 112(0x70, float:1.57E-43)
            r6 = r6 | r7
            r7 = 0
            androidx.compose.ui.layout.MeasurePolicy r4 = androidx.compose.foundation.layout.BoxKt.rememberBoxMeasurePolicy(r4, r7, r5, r6)
            int r6 = r1 << 3
            r6 = r6 & 112(0x70, float:1.57E-43)
            r7 = -1323940314(0xffffffffb1164626, float:-2.1867748E-9)
            r5.startReplaceableGroup(r7)
            androidx.compose.runtime.ProvidableCompositionLocal r7 = androidx.compose.p002ui.platform.CompositionLocalsKt.getLocalDensity()
            java.lang.Object r7 = r5.consume(r7)
            androidx.compose.ui.unit.Density r7 = (androidx.compose.p002ui.unit.Density) r7
            androidx.compose.runtime.ProvidableCompositionLocal r8 = androidx.compose.p002ui.platform.CompositionLocalsKt.getLocalLayoutDirection()
            java.lang.Object r8 = r5.consume(r8)
            androidx.compose.ui.unit.LayoutDirection r8 = (androidx.compose.p002ui.unit.LayoutDirection) r8
            androidx.compose.runtime.ProvidableCompositionLocal r9 = androidx.compose.p002ui.platform.CompositionLocalsKt.getLocalViewConfiguration()
            java.lang.Object r9 = r5.consume(r9)
            androidx.compose.ui.platform.ViewConfiguration r9 = (androidx.compose.p002ui.platform.ViewConfiguration) r9
            of.a r10 = r14.getConstructor()
            of.p r0 = androidx.compose.p002ui.layout.LayoutKt.materializerOf(r0)
            int r6 = r6 << 9
            r6 = r6 & 7168(0x1c00, float:1.0045E-41)
            r6 = r6 | 6
            androidx.compose.runtime.Applier r11 = r5.getApplier()
            boolean r11 = r11 instanceof androidx.compose.runtime.Applier
            if (r11 != 0) goto L_0x028c
            androidx.compose.runtime.ComposablesKt.invalidApplier()
        L_0x028c:
            r5.startReusableNode()
            boolean r11 = r5.getInserting()
            if (r11 == 0) goto L_0x0299
            r5.createNode(r10)
            goto L_0x029c
        L_0x0299:
            r5.useNode()
        L_0x029c:
            r5.disableReusing()
            androidx.compose.runtime.Composer r10 = androidx.compose.runtime.Updater.m35292constructorimpl(r5)
            of.o r11 = r14.getSetMeasurePolicy()
            androidx.compose.runtime.Updater.m35299setimpl((androidx.compose.runtime.Composer) r10, r4, r11)
            of.o r4 = r14.getSetDensity()
            androidx.compose.runtime.Updater.m35299setimpl((androidx.compose.runtime.Composer) r10, r7, r4)
            of.o r4 = r14.getSetLayoutDirection()
            androidx.compose.runtime.Updater.m35299setimpl((androidx.compose.runtime.Composer) r10, r8, r4)
            of.o r4 = r14.getSetViewConfiguration()
            androidx.compose.runtime.Updater.m35299setimpl((androidx.compose.runtime.Composer) r10, r9, r4)
            r5.enableReusing()
            androidx.compose.runtime.Composer r4 = androidx.compose.runtime.SkippableUpdater.m35284constructorimpl(r5)
            androidx.compose.runtime.SkippableUpdater r4 = androidx.compose.runtime.SkippableUpdater.m35283boximpl(r4)
            int r7 = r6 >> 3
            r7 = r7 & 112(0x70, float:1.57E-43)
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            r0.invoke(r4, r5, r7)
            r0 = 2058660585(0x7ab4aae9, float:4.6903995E35)
            r5.startReplaceableGroup(r0)
            int r0 = r6 >> 9
            r0 = r0 & 14
            r5.startReplaceableGroup(r2)
            r0 = r0 & 11
            r2 = 2
            if (r0 != r2) goto L_0x02f4
            boolean r0 = r5.getSkipping()
            if (r0 != 0) goto L_0x02ee
            goto L_0x02f4
        L_0x02ee:
            r5.skipToGroupEnd()
            r2 = r18
            goto L_0x0305
        L_0x02f4:
            androidx.compose.foundation.layout.BoxScopeInstance r0 = androidx.compose.foundation.layout.BoxScopeInstance.INSTANCE
            int r1 = r1 >> 6
            r1 = r1 & 112(0x70, float:1.57E-43)
            r1 = r1 | 6
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r2 = r18
            r2.invoke(r0, r5, r1)
        L_0x0305:
            r5.endReplaceableGroup()
            r5.endReplaceableGroup()
            r5.endNode()
            r5.endReplaceableGroup()
            r5.endReplaceableGroup()
        L_0x0314:
            r5.endReplaceableGroup()
            r5.endReplaceableGroup()
            r5.endNode()
            r5.endReplaceableGroup()
            boolean r0 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r0 == 0) goto L_0x0329
            androidx.compose.runtime.ComposerKt.traceEventEnd()
        L_0x0329:
            androidx.compose.runtime.ScopeUpdateScope r6 = r5.endRestartGroup()
            if (r6 != 0) goto L_0x0330
            goto L_0x0343
        L_0x0330:
            androidx.compose.material3.BadgeKt$BadgedBox$3 r7 = new androidx.compose.material3.BadgeKt$BadgedBox$3
            r0 = r7
            r1 = r18
            r2 = r17
            r3 = r20
            r4 = r22
            r5 = r23
            r0.<init>(r1, r2, r3, r4, r5)
            r6.updateScope(r7)
        L_0x0343:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.BadgeKt.BadgedBox(of.p, androidx.compose.ui.Modifier, of.p, androidx.compose.runtime.Composer, int, int):void");
    }

    public static final float getBadgeOffset() {
        return BadgeOffset;
    }

    public static final float getBadgeWithContentHorizontalOffset() {
        return BadgeWithContentHorizontalOffset;
    }

    public static final float getBadgeWithContentHorizontalPadding() {
        return BadgeWithContentHorizontalPadding;
    }

    public static final float getBadgeWithContentVerticalOffset() {
        return BadgeWithContentVerticalOffset;
    }
}
