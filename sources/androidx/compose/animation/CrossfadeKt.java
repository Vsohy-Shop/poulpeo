package androidx.compose.animation;

/* compiled from: Crossfade.kt */
public final class CrossfadeKt {
    /* JADX WARNING: Removed duplicated region for block: B:24:0x004a  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0050  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0053  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0072  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x0079  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x00b6  */
    /* JADX WARNING: Removed duplicated region for block: B:53:? A[RETURN, SYNTHETIC] */
    @androidx.compose.runtime.Composable
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <T> void Crossfade(T r14, androidx.compose.p002ui.Modifier r15, androidx.compose.animation.core.FiniteAnimationSpec<java.lang.Float> r16, p404of.C13089p<? super T, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, p336ef.C11921v> r17, androidx.compose.runtime.Composer r18, int r19, int r20) {
        /*
            r1 = r14
            r10 = r17
            r11 = r19
            java.lang.String r0 = "content"
            kotlin.jvm.internal.C12775o.m28639i(r10, r0)
            r0 = 523603005(0x1f358c3d, float:3.8444243E-20)
            r2 = r18
            androidx.compose.runtime.Composer r0 = r2.startRestartGroup(r0)
            r2 = r20 & 1
            r3 = 4
            r4 = 2
            if (r2 == 0) goto L_0x001c
            r2 = r11 | 6
            goto L_0x002c
        L_0x001c:
            r2 = r11 & 14
            if (r2 != 0) goto L_0x002b
            boolean r2 = r0.changed((java.lang.Object) r14)
            if (r2 == 0) goto L_0x0028
            r2 = r3
            goto L_0x0029
        L_0x0028:
            r2 = r4
        L_0x0029:
            r2 = r2 | r11
            goto L_0x002c
        L_0x002b:
            r2 = r11
        L_0x002c:
            r5 = r20 & 2
            if (r5 == 0) goto L_0x0033
            r2 = r2 | 48
            goto L_0x0045
        L_0x0033:
            r6 = r11 & 112(0x70, float:1.57E-43)
            if (r6 != 0) goto L_0x0045
            r6 = r15
            boolean r7 = r0.changed((java.lang.Object) r15)
            if (r7 == 0) goto L_0x0041
            r7 = 32
            goto L_0x0043
        L_0x0041:
            r7 = 16
        L_0x0043:
            r2 = r2 | r7
            goto L_0x0046
        L_0x0045:
            r6 = r15
        L_0x0046:
            r7 = r20 & 4
            if (r7 == 0) goto L_0x004c
            r2 = r2 | 128(0x80, float:1.794E-43)
        L_0x004c:
            r8 = r20 & 8
            if (r8 == 0) goto L_0x0053
            r2 = r2 | 3072(0xc00, float:4.305E-42)
            goto L_0x0063
        L_0x0053:
            r8 = r11 & 7168(0x1c00, float:1.0045E-41)
            if (r8 != 0) goto L_0x0063
            boolean r8 = r0.changed((java.lang.Object) r10)
            if (r8 == 0) goto L_0x0060
            r8 = 2048(0x800, float:2.87E-42)
            goto L_0x0062
        L_0x0060:
            r8 = 1024(0x400, float:1.435E-42)
        L_0x0062:
            r2 = r2 | r8
        L_0x0063:
            if (r7 != r3) goto L_0x0079
            r3 = r2 & 5851(0x16db, float:8.199E-42)
            r8 = 1170(0x492, float:1.64E-42)
            if (r3 != r8) goto L_0x0079
            boolean r3 = r0.getSkipping()
            if (r3 != 0) goto L_0x0072
            goto L_0x0079
        L_0x0072:
            r0.skipToGroupEnd()
            r3 = r16
            r2 = r6
            goto L_0x00af
        L_0x0079:
            if (r5 == 0) goto L_0x007f
            androidx.compose.ui.Modifier$Companion r3 = androidx.compose.p002ui.Modifier.Companion
            r12 = r3
            goto L_0x0080
        L_0x007f:
            r12 = r6
        L_0x0080:
            r3 = 0
            if (r7 == 0) goto L_0x008b
            r5 = 7
            r6 = 0
            androidx.compose.animation.core.TweenSpec r5 = androidx.compose.animation.core.AnimationSpecKt.tween$default(r6, r6, r3, r5, r3)
            r13 = r5
            goto L_0x008d
        L_0x008b:
            r13 = r16
        L_0x008d:
            r5 = r2 & 8
            r6 = r2 & 14
            r5 = r5 | r6
            androidx.compose.animation.core.Transition r3 = androidx.compose.animation.core.TransitionKt.updateTransition(r14, (java.lang.String) r3, (androidx.compose.runtime.Composer) r0, (int) r5, (int) r4)
            r5 = 0
            r4 = r2 & 112(0x70, float:1.57E-43)
            r4 = r4 | 512(0x200, float:7.175E-43)
            int r2 = r2 << 3
            r6 = 57344(0xe000, float:8.0356E-41)
            r2 = r2 & r6
            r8 = r4 | r2
            r9 = 4
            r2 = r3
            r3 = r12
            r4 = r13
            r6 = r17
            r7 = r0
            Crossfade(r2, r3, r4, r5, r6, r7, r8, r9)
            r2 = r12
            r3 = r13
        L_0x00af:
            androidx.compose.runtime.ScopeUpdateScope r7 = r0.endRestartGroup()
            if (r7 != 0) goto L_0x00b6
            goto L_0x00c6
        L_0x00b6:
            androidx.compose.animation.CrossfadeKt$Crossfade$1 r8 = new androidx.compose.animation.CrossfadeKt$Crossfade$1
            r0 = r8
            r1 = r14
            r4 = r17
            r5 = r19
            r6 = r20
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r7.updateScope(r8)
        L_0x00c6:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.animation.CrossfadeKt.Crossfade(java.lang.Object, androidx.compose.ui.Modifier, androidx.compose.animation.core.FiniteAnimationSpec, of.p, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:123:0x0307  */
    /* JADX WARNING: Removed duplicated region for block: B:131:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0053  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0059  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x005c  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0075  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0078  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x009c  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x00a4  */
    @androidx.compose.animation.ExperimentalAnimationApi
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[0[0]]")
    @androidx.compose.runtime.Composable
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <T> void Crossfade(androidx.compose.animation.core.Transition<T> r18, androidx.compose.p002ui.Modifier r19, androidx.compose.animation.core.FiniteAnimationSpec<java.lang.Float> r20, kotlin.jvm.functions.Function1<? super T, ? extends java.lang.Object> r21, p404of.C13089p<? super T, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, p336ef.C11921v> r22, androidx.compose.runtime.Composer r23, int r24, int r25) {
        /*
            r6 = r18
            r7 = r22
            r8 = r24
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.C12775o.m28639i(r6, r0)
            java.lang.String r0 = "content"
            kotlin.jvm.internal.C12775o.m28639i(r7, r0)
            r0 = 679005231(0x2878cc2f, float:1.3811041E-14)
            r1 = r23
            androidx.compose.runtime.Composer r9 = r1.startRestartGroup(r0)
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r25 & r0
            r10 = 2
            if (r0 == 0) goto L_0x0023
            r0 = r8 | 6
            goto L_0x0033
        L_0x0023:
            r0 = r8 & 14
            if (r0 != 0) goto L_0x0032
            boolean r0 = r9.changed((java.lang.Object) r6)
            if (r0 == 0) goto L_0x002f
            r0 = 4
            goto L_0x0030
        L_0x002f:
            r0 = r10
        L_0x0030:
            r0 = r0 | r8
            goto L_0x0033
        L_0x0032:
            r0 = r8
        L_0x0033:
            r1 = r25 & 1
            if (r1 == 0) goto L_0x003a
            r0 = r0 | 48
            goto L_0x004d
        L_0x003a:
            r2 = r8 & 112(0x70, float:1.57E-43)
            if (r2 != 0) goto L_0x004d
            r2 = r19
            boolean r3 = r9.changed((java.lang.Object) r2)
            if (r3 == 0) goto L_0x0049
            r3 = 32
            goto L_0x004b
        L_0x0049:
            r3 = 16
        L_0x004b:
            r0 = r0 | r3
            goto L_0x004f
        L_0x004d:
            r2 = r19
        L_0x004f:
            r3 = r25 & 2
            if (r3 == 0) goto L_0x0055
            r0 = r0 | 128(0x80, float:1.794E-43)
        L_0x0055:
            r4 = r25 & 4
            if (r4 == 0) goto L_0x005c
            r0 = r0 | 3072(0xc00, float:4.305E-42)
            goto L_0x006f
        L_0x005c:
            r5 = r8 & 7168(0x1c00, float:1.0045E-41)
            if (r5 != 0) goto L_0x006f
            r5 = r21
            boolean r12 = r9.changed((java.lang.Object) r5)
            if (r12 == 0) goto L_0x006b
            r12 = 2048(0x800, float:2.87E-42)
            goto L_0x006d
        L_0x006b:
            r12 = 1024(0x400, float:1.435E-42)
        L_0x006d:
            r0 = r0 | r12
            goto L_0x0071
        L_0x006f:
            r5 = r21
        L_0x0071:
            r12 = r25 & 8
            if (r12 == 0) goto L_0x0078
            r0 = r0 | 24576(0x6000, float:3.4438E-41)
            goto L_0x008a
        L_0x0078:
            r12 = 57344(0xe000, float:8.0356E-41)
            r12 = r12 & r8
            if (r12 != 0) goto L_0x008a
            boolean r12 = r9.changed((java.lang.Object) r7)
            if (r12 == 0) goto L_0x0087
            r12 = 16384(0x4000, float:2.2959E-41)
            goto L_0x0089
        L_0x0087:
            r12 = 8192(0x2000, float:1.14794E-41)
        L_0x0089:
            r0 = r0 | r12
        L_0x008a:
            r12 = r0
            if (r3 != r10) goto L_0x00a4
            r0 = 46811(0xb6db, float:6.5596E-41)
            r0 = r0 & r12
            r13 = 9362(0x2492, float:1.3119E-41)
            if (r0 != r13) goto L_0x00a4
            boolean r0 = r9.getSkipping()
            if (r0 != 0) goto L_0x009c
            goto L_0x00a4
        L_0x009c:
            r9.skipToGroupEnd()
            r3 = r20
            r4 = r5
            goto L_0x0300
        L_0x00a4:
            if (r1 == 0) goto L_0x00aa
            androidx.compose.ui.Modifier$Companion r0 = androidx.compose.p002ui.Modifier.Companion
            r13 = r0
            goto L_0x00ab
        L_0x00aa:
            r13 = r2
        L_0x00ab:
            r14 = 0
            if (r3 == 0) goto L_0x00b6
            r0 = 7
            r1 = 0
            androidx.compose.animation.core.TweenSpec r0 = androidx.compose.animation.core.AnimationSpecKt.tween$default(r14, r14, r1, r0, r1)
            r15 = r0
            goto L_0x00b8
        L_0x00b6:
            r15 = r20
        L_0x00b8:
            if (r4 == 0) goto L_0x00bd
            androidx.compose.animation.CrossfadeKt$Crossfade$2 r0 = androidx.compose.animation.CrossfadeKt$Crossfade$2.INSTANCE
            r5 = r0
        L_0x00bd:
            r0 = -492369756(0xffffffffe2a708a4, float:-1.5406144E21)
            r9.startReplaceableGroup(r0)
            java.lang.Object r1 = r9.rememberedValue()
            androidx.compose.runtime.Composer$Companion r2 = androidx.compose.runtime.Composer.Companion
            java.lang.Object r3 = r2.getEmpty()
            if (r1 != r3) goto L_0x00df
            androidx.compose.runtime.snapshots.SnapshotStateList r1 = androidx.compose.runtime.SnapshotStateKt.mutableStateListOf()
            java.lang.Object r3 = r18.getCurrentState()
            r1.add(r3)
            ef.v r3 = p336ef.C11921v.f18618a
            r9.updateRememberedValue(r1)
        L_0x00df:
            r9.endReplaceableGroup()
            r4 = r1
            androidx.compose.runtime.snapshots.SnapshotStateList r4 = (androidx.compose.runtime.snapshots.SnapshotStateList) r4
            r9.startReplaceableGroup(r0)
            java.lang.Object r0 = r9.rememberedValue()
            java.lang.Object r1 = r2.getEmpty()
            if (r0 != r1) goto L_0x00fa
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>()
            r9.updateRememberedValue(r0)
        L_0x00fa:
            r9.endReplaceableGroup()
            r3 = r0
            java.util.Map r3 = (java.util.Map) r3
            r0 = -1621449801(0xffffffff9f5aa3b7, float:-4.6298717E-20)
            r9.startReplaceableGroup(r0)
            java.lang.Object r0 = r18.getCurrentState()
            java.lang.Object r1 = r18.getTargetState()
            boolean r0 = kotlin.jvm.internal.C12775o.m28634d(r0, r1)
            r1 = 1
            if (r0 == 0) goto L_0x0152
            int r0 = r4.size()
            if (r0 != r1) goto L_0x0129
            java.lang.Object r0 = r4.get(r14)
            java.lang.Object r1 = r18.getTargetState()
            boolean r0 = kotlin.jvm.internal.C12775o.m28634d(r0, r1)
            if (r0 != 0) goto L_0x0152
        L_0x0129:
            r0 = 1157296644(0x44faf204, float:2007.563)
            r9.startReplaceableGroup(r0)
            boolean r0 = r9.changed((java.lang.Object) r6)
            java.lang.Object r1 = r9.rememberedValue()
            if (r0 != 0) goto L_0x013f
            java.lang.Object r0 = r2.getEmpty()
            if (r1 != r0) goto L_0x0147
        L_0x013f:
            androidx.compose.animation.CrossfadeKt$Crossfade$3$1 r1 = new androidx.compose.animation.CrossfadeKt$Crossfade$3$1
            r1.<init>(r6)
            r9.updateRememberedValue(r1)
        L_0x0147:
            r9.endReplaceableGroup()
            kotlin.jvm.functions.Function1 r1 = (kotlin.jvm.functions.Function1) r1
            boolean unused = kotlin.collections.C12669b0.m28187K(r4, r1)
            r3.clear()
        L_0x0152:
            r9.endReplaceableGroup()
            java.lang.Object r0 = r18.getTargetState()
            boolean r0 = r3.containsKey(r0)
            if (r0 != 0) goto L_0x01d7
            java.util.Iterator r0 = r4.iterator()
            r1 = r14
        L_0x0164:
            boolean r2 = r0.hasNext()
            r11 = -1
            if (r2 == 0) goto L_0x0186
            java.lang.Object r2 = r0.next()
            java.lang.Object r2 = r5.invoke(r2)
            java.lang.Object r10 = r18.getTargetState()
            java.lang.Object r10 = r5.invoke(r10)
            boolean r2 = kotlin.jvm.internal.C12775o.m28634d(r2, r10)
            if (r2 == 0) goto L_0x0182
            goto L_0x0187
        L_0x0182:
            int r1 = r1 + 1
            r10 = 2
            goto L_0x0164
        L_0x0186:
            r1 = r11
        L_0x0187:
            if (r1 != r11) goto L_0x0191
            java.lang.Object r0 = r18.getTargetState()
            r4.add(r0)
            goto L_0x0198
        L_0x0191:
            java.lang.Object r0 = r18.getTargetState()
            r4.set(r1, r0)
        L_0x0198:
            r3.clear()
            int r10 = r4.size()
            r11 = r14
        L_0x01a0:
            if (r11 >= r10) goto L_0x01d7
            java.lang.Object r2 = r4.get(r11)
            androidx.compose.animation.CrossfadeKt$Crossfade$4$1 r1 = new androidx.compose.animation.CrossfadeKt$Crossfade$4$1
            r0 = r1
            r14 = r1
            r6 = 1
            r1 = r18
            r19 = r2
            r2 = r12
            r16 = r3
            r3 = r15
            r20 = r4
            r4 = r19
            r17 = r5
            r5 = r22
            r0.<init>(r1, r2, r3, r4, r5)
            r0 = -1426421288(0xffffffffaafa89d8, float:-4.450457E-13)
            androidx.compose.runtime.internal.ComposableLambda r0 = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambda(r9, r0, r6, r14)
            r2 = r19
            r1 = r16
            r1.put(r2, r0)
            int r11 = r11 + 1
            r14 = 0
            r6 = r18
            r4 = r20
            r3 = r1
            r5 = r17
            goto L_0x01a0
        L_0x01d7:
            r1 = r3
            r20 = r4
            r17 = r5
            int r0 = r12 >> 3
            r0 = r0 & 14
            r2 = -1990474327(0xffffffff895bc5a9, float:-2.6454105E-33)
            r9.startReplaceableGroup(r2)
            androidx.compose.ui.Alignment$Companion r2 = androidx.compose.p002ui.Alignment.Companion
            androidx.compose.ui.Alignment r2 = r2.getTopStart()
            int r3 = r0 >> 3
            r4 = r3 & 14
            r3 = r3 & 112(0x70, float:1.57E-43)
            r3 = r3 | r4
            r4 = 0
            androidx.compose.ui.layout.MeasurePolicy r2 = androidx.compose.foundation.layout.BoxKt.rememberBoxMeasurePolicy(r2, r4, r9, r3)
            int r3 = r0 << 3
            r3 = r3 & 112(0x70, float:1.57E-43)
            r4 = 1376089335(0x520574f7, float:1.43298249E11)
            r9.startReplaceableGroup(r4)
            androidx.compose.runtime.ProvidableCompositionLocal r4 = androidx.compose.p002ui.platform.CompositionLocalsKt.getLocalDensity()
            java.lang.Object r4 = r9.consume(r4)
            androidx.compose.ui.unit.Density r4 = (androidx.compose.p002ui.unit.Density) r4
            androidx.compose.runtime.ProvidableCompositionLocal r5 = androidx.compose.p002ui.platform.CompositionLocalsKt.getLocalLayoutDirection()
            java.lang.Object r5 = r9.consume(r5)
            androidx.compose.ui.unit.LayoutDirection r5 = (androidx.compose.p002ui.unit.LayoutDirection) r5
            androidx.compose.ui.node.ComposeUiNode$Companion r6 = androidx.compose.p002ui.node.ComposeUiNode.Companion
            of.a r10 = r6.getConstructor()
            of.p r11 = androidx.compose.p002ui.layout.LayoutKt.materializerOf(r13)
            int r3 = r3 << 9
            r3 = r3 & 7168(0x1c00, float:1.0045E-41)
            androidx.compose.runtime.Applier r12 = r9.getApplier()
            boolean r12 = r12 instanceof androidx.compose.runtime.Applier
            if (r12 != 0) goto L_0x022f
            androidx.compose.runtime.ComposablesKt.invalidApplier()
        L_0x022f:
            r9.startReusableNode()
            boolean r12 = r9.getInserting()
            if (r12 == 0) goto L_0x023c
            r9.createNode(r10)
            goto L_0x023f
        L_0x023c:
            r9.useNode()
        L_0x023f:
            r9.disableReusing()
            androidx.compose.runtime.Composer r10 = androidx.compose.runtime.Updater.m35292constructorimpl(r9)
            of.o r12 = r6.getSetMeasurePolicy()
            androidx.compose.runtime.Updater.m35299setimpl((androidx.compose.runtime.Composer) r10, r2, r12)
            of.o r2 = r6.getSetDensity()
            androidx.compose.runtime.Updater.m35299setimpl((androidx.compose.runtime.Composer) r10, r4, r2)
            of.o r2 = r6.getSetLayoutDirection()
            androidx.compose.runtime.Updater.m35299setimpl((androidx.compose.runtime.Composer) r10, r5, r2)
            r9.enableReusing()
            androidx.compose.runtime.Composer r2 = androidx.compose.runtime.SkippableUpdater.m35284constructorimpl(r9)
            androidx.compose.runtime.SkippableUpdater r2 = androidx.compose.runtime.SkippableUpdater.m35283boximpl(r2)
            int r4 = r3 >> 3
            r4 = r4 & 112(0x70, float:1.57E-43)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r11.invoke(r2, r9, r4)
            r2 = 2058660585(0x7ab4aae9, float:4.6903995E35)
            r9.startReplaceableGroup(r2)
            int r2 = r3 >> 9
            r2 = r2 & 14
            r3 = -1253629305(0xffffffffb5472287, float:-7.418352E-7)
            r9.startReplaceableGroup(r3)
            r2 = r2 & 11
            r3 = 2
            r2 = r2 ^ r3
            if (r2 != 0) goto L_0x0294
            boolean r2 = r9.getSkipping()
            if (r2 != 0) goto L_0x028e
            goto L_0x0294
        L_0x028e:
            r9.skipToGroupEnd()
            r6 = r17
            goto L_0x02ee
        L_0x0294:
            androidx.compose.foundation.layout.BoxScopeInstance r2 = androidx.compose.foundation.layout.BoxScopeInstance.INSTANCE
            int r0 = r0 >> 6
            r0 = r0 & 112(0x70, float:1.57E-43)
            r0 = r0 | 6
            r2 = 1930908853(0x731754b5, float:1.1989668E31)
            r9.startReplaceableGroup(r2)
            r0 = r0 & 81
            r2 = 16
            if (r0 != r2) goto L_0x02b5
            boolean r0 = r9.getSkipping()
            if (r0 != 0) goto L_0x02af
            goto L_0x02b5
        L_0x02af:
            r9.skipToGroupEnd()
        L_0x02b2:
            r6 = r17
            goto L_0x02eb
        L_0x02b5:
            int r0 = r20.size()
            r4 = 0
        L_0x02ba:
            if (r4 >= r0) goto L_0x02b2
            r2 = r20
            java.lang.Object r3 = r2.get(r4)
            r5 = -450541954(0xffffffffe525467e, float:-4.8780676E22)
            r6 = r17
            java.lang.Object r10 = r6.invoke(r3)
            r9.startMovableGroup(r5, r10)
            java.lang.Object r3 = r1.get(r3)
            of.o r3 = (p404of.C13088o) r3
            r5 = 0
            if (r3 != 0) goto L_0x02d8
            goto L_0x02e1
        L_0x02d8:
            java.lang.Integer r10 = java.lang.Integer.valueOf(r5)
            r3.invoke(r9, r10)
            ef.v r3 = p336ef.C11921v.f18618a
        L_0x02e1:
            r9.endMovableGroup()
            int r4 = r4 + 1
            r20 = r2
            r17 = r6
            goto L_0x02ba
        L_0x02eb:
            r9.endReplaceableGroup()
        L_0x02ee:
            r9.endReplaceableGroup()
            r9.endReplaceableGroup()
            r9.endNode()
            r9.endReplaceableGroup()
            r9.endReplaceableGroup()
            r4 = r6
            r2 = r13
            r3 = r15
        L_0x0300:
            androidx.compose.runtime.ScopeUpdateScope r9 = r9.endRestartGroup()
            if (r9 != 0) goto L_0x0307
            goto L_0x0318
        L_0x0307:
            androidx.compose.animation.CrossfadeKt$Crossfade$6 r10 = new androidx.compose.animation.CrossfadeKt$Crossfade$6
            r0 = r10
            r1 = r18
            r5 = r22
            r6 = r24
            r7 = r25
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            r9.updateScope(r10)
        L_0x0318:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.animation.CrossfadeKt.Crossfade(androidx.compose.animation.core.Transition, androidx.compose.ui.Modifier, androidx.compose.animation.core.FiniteAnimationSpec, kotlin.jvm.functions.Function1, of.p, androidx.compose.runtime.Composer, int, int):void");
    }
}
