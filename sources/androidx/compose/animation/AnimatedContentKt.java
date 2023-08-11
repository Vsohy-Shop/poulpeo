package androidx.compose.animation;

import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.p002ui.unit.IntSize;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p404of.C13088o;

/* compiled from: AnimatedContent.kt */
public final class AnimatedContentKt {
    /* JADX WARNING: Removed duplicated region for block: B:24:0x004b  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x004e  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0067  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x006a  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0083  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0086  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x00a7  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x00ae  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x00fb  */
    /* JADX WARNING: Removed duplicated region for block: B:73:? A[RETURN, SYNTHETIC] */
    @androidx.compose.animation.ExperimentalAnimationApi
    @androidx.compose.runtime.Composable
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <S> void AnimatedContent(S r16, androidx.compose.p002ui.Modifier r17, kotlin.jvm.functions.Function1<? super androidx.compose.animation.AnimatedContentScope<S>, androidx.compose.animation.ContentTransform> r18, androidx.compose.p002ui.Alignment r19, p404of.C13090q<? super androidx.compose.animation.AnimatedVisibilityScope, ? super S, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, p336ef.C11921v> r20, androidx.compose.runtime.Composer r21, int r22, int r23) {
        /*
            r1 = r16
            r11 = r20
            r12 = r22
            java.lang.String r0 = "content"
            kotlin.jvm.internal.C12775o.m28639i(r11, r0)
            r0 = 2124549995(0x7ea20f6b, float:1.077075E38)
            r2 = r21
            androidx.compose.runtime.Composer r0 = r2.startRestartGroup(r0)
            r2 = r23 & 1
            if (r2 == 0) goto L_0x001b
            r2 = r12 | 6
            goto L_0x002b
        L_0x001b:
            r2 = r12 & 14
            if (r2 != 0) goto L_0x002a
            boolean r2 = r0.changed((java.lang.Object) r1)
            if (r2 == 0) goto L_0x0027
            r2 = 4
            goto L_0x0028
        L_0x0027:
            r2 = 2
        L_0x0028:
            r2 = r2 | r12
            goto L_0x002b
        L_0x002a:
            r2 = r12
        L_0x002b:
            r3 = r23 & 2
            if (r3 == 0) goto L_0x0032
            r2 = r2 | 48
            goto L_0x0045
        L_0x0032:
            r4 = r12 & 112(0x70, float:1.57E-43)
            if (r4 != 0) goto L_0x0045
            r4 = r17
            boolean r5 = r0.changed((java.lang.Object) r4)
            if (r5 == 0) goto L_0x0041
            r5 = 32
            goto L_0x0043
        L_0x0041:
            r5 = 16
        L_0x0043:
            r2 = r2 | r5
            goto L_0x0047
        L_0x0045:
            r4 = r17
        L_0x0047:
            r5 = r23 & 4
            if (r5 == 0) goto L_0x004e
            r2 = r2 | 384(0x180, float:5.38E-43)
            goto L_0x0061
        L_0x004e:
            r6 = r12 & 896(0x380, float:1.256E-42)
            if (r6 != 0) goto L_0x0061
            r6 = r18
            boolean r7 = r0.changed((java.lang.Object) r6)
            if (r7 == 0) goto L_0x005d
            r7 = 256(0x100, float:3.59E-43)
            goto L_0x005f
        L_0x005d:
            r7 = 128(0x80, float:1.794E-43)
        L_0x005f:
            r2 = r2 | r7
            goto L_0x0063
        L_0x0061:
            r6 = r18
        L_0x0063:
            r7 = r23 & 8
            if (r7 == 0) goto L_0x006a
            r2 = r2 | 3072(0xc00, float:4.305E-42)
            goto L_0x007d
        L_0x006a:
            r8 = r12 & 7168(0x1c00, float:1.0045E-41)
            if (r8 != 0) goto L_0x007d
            r8 = r19
            boolean r9 = r0.changed((java.lang.Object) r8)
            if (r9 == 0) goto L_0x0079
            r9 = 2048(0x800, float:2.87E-42)
            goto L_0x007b
        L_0x0079:
            r9 = 1024(0x400, float:1.435E-42)
        L_0x007b:
            r2 = r2 | r9
            goto L_0x007f
        L_0x007d:
            r8 = r19
        L_0x007f:
            r9 = r23 & 16
            if (r9 == 0) goto L_0x0086
            r2 = r2 | 24576(0x6000, float:3.4438E-41)
            goto L_0x0098
        L_0x0086:
            r9 = 57344(0xe000, float:8.0356E-41)
            r9 = r9 & r12
            if (r9 != 0) goto L_0x0098
            boolean r9 = r0.changed((java.lang.Object) r11)
            if (r9 == 0) goto L_0x0095
            r9 = 16384(0x4000, float:2.2959E-41)
            goto L_0x0097
        L_0x0095:
            r9 = 8192(0x2000, float:1.14794E-41)
        L_0x0097:
            r2 = r2 | r9
        L_0x0098:
            r9 = 46811(0xb6db, float:6.5596E-41)
            r9 = r9 & r2
            r10 = 9362(0x2492, float:1.3119E-41)
            if (r9 != r10) goto L_0x00ae
            boolean r9 = r0.getSkipping()
            if (r9 != 0) goto L_0x00a7
            goto L_0x00ae
        L_0x00a7:
            r0.skipToGroupEnd()
            r2 = r4
            r3 = r6
            r4 = r8
            goto L_0x00f4
        L_0x00ae:
            if (r3 == 0) goto L_0x00b4
            androidx.compose.ui.Modifier$Companion r3 = androidx.compose.p002ui.Modifier.Companion
            r13 = r3
            goto L_0x00b5
        L_0x00b4:
            r13 = r4
        L_0x00b5:
            if (r5 == 0) goto L_0x00bb
            androidx.compose.animation.AnimatedContentKt$AnimatedContent$1 r3 = androidx.compose.animation.AnimatedContentKt$AnimatedContent$1.INSTANCE
            r14 = r3
            goto L_0x00bc
        L_0x00bb:
            r14 = r6
        L_0x00bc:
            if (r7 == 0) goto L_0x00c6
            androidx.compose.ui.Alignment$Companion r3 = androidx.compose.p002ui.Alignment.Companion
            androidx.compose.ui.Alignment r3 = r3.getTopStart()
            r15 = r3
            goto L_0x00c7
        L_0x00c6:
            r15 = r8
        L_0x00c7:
            r3 = r2 & 8
            r3 = r3 | 48
            r4 = r2 & 14
            r3 = r3 | r4
            r4 = 0
            java.lang.String r5 = "AnimatedContent"
            androidx.compose.animation.core.Transition r3 = androidx.compose.animation.core.TransitionKt.updateTransition(r1, (java.lang.String) r5, (androidx.compose.runtime.Composer) r0, (int) r3, (int) r4)
            r6 = 0
            r4 = r2 & 112(0x70, float:1.57E-43)
            r5 = r2 & 896(0x380, float:1.256E-42)
            r4 = r4 | r5
            r5 = r2 & 7168(0x1c00, float:1.0045E-41)
            r4 = r4 | r5
            int r2 = r2 << 3
            r5 = 458752(0x70000, float:6.42848E-40)
            r2 = r2 & r5
            r9 = r4 | r2
            r10 = 8
            r2 = r3
            r3 = r13
            r4 = r14
            r5 = r15
            r7 = r20
            r8 = r0
            AnimatedContent(r2, r3, r4, r5, r6, r7, r8, r9, r10)
            r2 = r13
            r3 = r14
            r4 = r15
        L_0x00f4:
            androidx.compose.runtime.ScopeUpdateScope r8 = r0.endRestartGroup()
            if (r8 != 0) goto L_0x00fb
            goto L_0x010c
        L_0x00fb:
            androidx.compose.animation.AnimatedContentKt$AnimatedContent$2 r9 = new androidx.compose.animation.AnimatedContentKt$AnimatedContent$2
            r0 = r9
            r1 = r16
            r5 = r20
            r6 = r22
            r7 = r23
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            r8.updateScope(r9)
        L_0x010c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.animation.AnimatedContentKt.AnimatedContent(java.lang.Object, androidx.compose.ui.Modifier, kotlin.jvm.functions.Function1, androidx.compose.ui.Alignment, of.q, androidx.compose.runtime.Composer, int, int):void");
    }

    @ExperimentalAnimationApi
    public static final SizeTransform SizeTransform(boolean z, C13088o<? super IntSize, ? super IntSize, ? extends FiniteAnimationSpec<IntSize>> oVar) {
        C12775o.m28639i(oVar, "sizeAnimationSpec");
        return new SizeTransformImpl(z, oVar);
    }

    public static /* synthetic */ SizeTransform SizeTransform$default(boolean z, C13088o oVar, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        if ((i & 2) != 0) {
            oVar = AnimatedContentKt$SizeTransform$1.INSTANCE;
        }
        return SizeTransform(z, oVar);
    }

    @ExperimentalAnimationApi
    public static final ContentTransform with(EnterTransition enterTransition, ExitTransition exitTransition) {
        C12775o.m28639i(enterTransition, "<this>");
        C12775o.m28639i(exitTransition, "exit");
        return new ContentTransform(enterTransition, exitTransition, 0.0f, (SizeTransform) null, 12, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v2, resolved type: androidx.compose.animation.AnimatedContentScope} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v2, resolved type: androidx.compose.animation.AnimatedContentKt$AnimatedContent$4} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v2, resolved type: androidx.compose.animation.AnimatedContentKt$AnimatedContent$3} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v3, resolved type: androidx.compose.ui.Modifier$Companion} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:153:0x0393  */
    /* JADX WARNING: Removed duplicated region for block: B:161:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0052  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0055  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x006e  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0071  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x008a  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x008d  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00a8  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x00ac  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x00ce  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x00d6  */
    @androidx.compose.animation.ExperimentalAnimationApi
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    @androidx.compose.runtime.Composable
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <S> void AnimatedContent(androidx.compose.animation.core.Transition<S> r22, androidx.compose.p002ui.Modifier r23, kotlin.jvm.functions.Function1<? super androidx.compose.animation.AnimatedContentScope<S>, androidx.compose.animation.ContentTransform> r24, androidx.compose.p002ui.Alignment r25, kotlin.jvm.functions.Function1<? super S, ? extends java.lang.Object> r26, p404of.C13090q<? super androidx.compose.animation.AnimatedVisibilityScope, ? super S, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, p336ef.C11921v> r27, androidx.compose.runtime.Composer r28, int r29, int r30) {
        /*
            r8 = r22
            r9 = r27
            r10 = r29
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.C12775o.m28639i(r8, r0)
            java.lang.String r0 = "content"
            kotlin.jvm.internal.C12775o.m28639i(r9, r0)
            r0 = -114689412(0xfffffffff929fa7c, float:-5.516116E34)
            r1 = r28
            androidx.compose.runtime.Composer r11 = r1.startRestartGroup(r0)
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r30 & r0
            if (r0 == 0) goto L_0x0022
            r0 = r10 | 6
            goto L_0x0032
        L_0x0022:
            r0 = r10 & 14
            if (r0 != 0) goto L_0x0031
            boolean r0 = r11.changed((java.lang.Object) r8)
            if (r0 == 0) goto L_0x002e
            r0 = 4
            goto L_0x002f
        L_0x002e:
            r0 = 2
        L_0x002f:
            r0 = r0 | r10
            goto L_0x0032
        L_0x0031:
            r0 = r10
        L_0x0032:
            r1 = r30 & 1
            if (r1 == 0) goto L_0x0039
            r0 = r0 | 48
            goto L_0x004c
        L_0x0039:
            r2 = r10 & 112(0x70, float:1.57E-43)
            if (r2 != 0) goto L_0x004c
            r2 = r23
            boolean r3 = r11.changed((java.lang.Object) r2)
            if (r3 == 0) goto L_0x0048
            r3 = 32
            goto L_0x004a
        L_0x0048:
            r3 = 16
        L_0x004a:
            r0 = r0 | r3
            goto L_0x004e
        L_0x004c:
            r2 = r23
        L_0x004e:
            r3 = r30 & 2
            if (r3 == 0) goto L_0x0055
            r0 = r0 | 384(0x180, float:5.38E-43)
            goto L_0x0068
        L_0x0055:
            r4 = r10 & 896(0x380, float:1.256E-42)
            if (r4 != 0) goto L_0x0068
            r4 = r24
            boolean r5 = r11.changed((java.lang.Object) r4)
            if (r5 == 0) goto L_0x0064
            r5 = 256(0x100, float:3.59E-43)
            goto L_0x0066
        L_0x0064:
            r5 = 128(0x80, float:1.794E-43)
        L_0x0066:
            r0 = r0 | r5
            goto L_0x006a
        L_0x0068:
            r4 = r24
        L_0x006a:
            r5 = r30 & 4
            if (r5 == 0) goto L_0x0071
            r0 = r0 | 3072(0xc00, float:4.305E-42)
            goto L_0x0084
        L_0x0071:
            r6 = r10 & 7168(0x1c00, float:1.0045E-41)
            if (r6 != 0) goto L_0x0084
            r6 = r25
            boolean r7 = r11.changed((java.lang.Object) r6)
            if (r7 == 0) goto L_0x0080
            r7 = 2048(0x800, float:2.87E-42)
            goto L_0x0082
        L_0x0080:
            r7 = 1024(0x400, float:1.435E-42)
        L_0x0082:
            r0 = r0 | r7
            goto L_0x0086
        L_0x0084:
            r6 = r25
        L_0x0086:
            r7 = r30 & 8
            if (r7 == 0) goto L_0x008d
            r0 = r0 | 24576(0x6000, float:3.4438E-41)
            goto L_0x00a2
        L_0x008d:
            r12 = 57344(0xe000, float:8.0356E-41)
            r12 = r12 & r10
            if (r12 != 0) goto L_0x00a2
            r12 = r26
            boolean r13 = r11.changed((java.lang.Object) r12)
            if (r13 == 0) goto L_0x009e
            r13 = 16384(0x4000, float:2.2959E-41)
            goto L_0x00a0
        L_0x009e:
            r13 = 8192(0x2000, float:1.14794E-41)
        L_0x00a0:
            r0 = r0 | r13
            goto L_0x00a4
        L_0x00a2:
            r12 = r26
        L_0x00a4:
            r13 = r30 & 16
            if (r13 == 0) goto L_0x00ac
            r13 = 196608(0x30000, float:2.75506E-40)
        L_0x00aa:
            r0 = r0 | r13
            goto L_0x00bd
        L_0x00ac:
            r13 = 458752(0x70000, float:6.42848E-40)
            r13 = r13 & r10
            if (r13 != 0) goto L_0x00bd
            boolean r13 = r11.changed((java.lang.Object) r9)
            if (r13 == 0) goto L_0x00ba
            r13 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00aa
        L_0x00ba:
            r13 = 65536(0x10000, float:9.18355E-41)
            goto L_0x00aa
        L_0x00bd:
            r13 = r0
            r0 = 374491(0x5b6db, float:5.24774E-40)
            r0 = r0 & r13
            r14 = 74898(0x12492, float:1.04954E-40)
            if (r0 != r14) goto L_0x00d6
            boolean r0 = r11.getSkipping()
            if (r0 != 0) goto L_0x00ce
            goto L_0x00d6
        L_0x00ce:
            r11.skipToGroupEnd()
            r3 = r4
            r4 = r6
            r5 = r12
            goto L_0x038c
        L_0x00d6:
            if (r1 == 0) goto L_0x00dc
            androidx.compose.ui.Modifier$Companion r0 = androidx.compose.p002ui.Modifier.Companion
            r14 = r0
            goto L_0x00dd
        L_0x00dc:
            r14 = r2
        L_0x00dd:
            if (r3 == 0) goto L_0x00e3
            androidx.compose.animation.AnimatedContentKt$AnimatedContent$3 r0 = androidx.compose.animation.AnimatedContentKt$AnimatedContent$3.INSTANCE
            r15 = r0
            goto L_0x00e4
        L_0x00e3:
            r15 = r4
        L_0x00e4:
            if (r5 == 0) goto L_0x00ed
            androidx.compose.ui.Alignment$Companion r0 = androidx.compose.p002ui.Alignment.Companion
            androidx.compose.ui.Alignment r0 = r0.getTopStart()
            r6 = r0
        L_0x00ed:
            if (r7 == 0) goto L_0x00f2
            androidx.compose.animation.AnimatedContentKt$AnimatedContent$4 r0 = androidx.compose.animation.AnimatedContentKt$AnimatedContent$4.INSTANCE
            r12 = r0
        L_0x00f2:
            androidx.compose.runtime.ProvidableCompositionLocal r0 = androidx.compose.p002ui.platform.CompositionLocalsKt.getLocalLayoutDirection()
            java.lang.Object r0 = r11.consume(r0)
            androidx.compose.ui.unit.LayoutDirection r0 = (androidx.compose.p002ui.unit.LayoutDirection) r0
            r1 = 1157296644(0x44faf204, float:2007.563)
            r11.startReplaceableGroup(r1)
            boolean r2 = r11.changed((java.lang.Object) r8)
            java.lang.Object r3 = r11.rememberedValue()
            if (r2 != 0) goto L_0x0114
            androidx.compose.runtime.Composer$Companion r2 = androidx.compose.runtime.Composer.Companion
            java.lang.Object r2 = r2.getEmpty()
            if (r3 != r2) goto L_0x011c
        L_0x0114:
            androidx.compose.animation.AnimatedContentScope r3 = new androidx.compose.animation.AnimatedContentScope
            r3.<init>(r8, r6, r0)
            r11.updateRememberedValue(r3)
        L_0x011c:
            r11.endReplaceableGroup()
            r7 = r3
            androidx.compose.animation.AnimatedContentScope r7 = (androidx.compose.animation.AnimatedContentScope) r7
            r11.startReplaceableGroup(r1)
            boolean r2 = r11.changed((java.lang.Object) r8)
            java.lang.Object r3 = r11.rememberedValue()
            r5 = 0
            r4 = 1
            if (r2 != 0) goto L_0x0139
            androidx.compose.runtime.Composer$Companion r2 = androidx.compose.runtime.Composer.Companion
            java.lang.Object r2 = r2.getEmpty()
            if (r3 != r2) goto L_0x0148
        L_0x0139:
            java.lang.Object[] r2 = new java.lang.Object[r4]
            java.lang.Object r3 = r22.getCurrentState()
            r2[r5] = r3
            androidx.compose.runtime.snapshots.SnapshotStateList r3 = androidx.compose.runtime.SnapshotStateKt.mutableStateListOf(r2)
            r11.updateRememberedValue(r3)
        L_0x0148:
            r11.endReplaceableGroup()
            androidx.compose.runtime.snapshots.SnapshotStateList r3 = (androidx.compose.runtime.snapshots.SnapshotStateList) r3
            r11.startReplaceableGroup(r1)
            boolean r1 = r11.changed((java.lang.Object) r8)
            java.lang.Object r2 = r11.rememberedValue()
            if (r1 != 0) goto L_0x0162
            androidx.compose.runtime.Composer$Companion r1 = androidx.compose.runtime.Composer.Companion
            java.lang.Object r1 = r1.getEmpty()
            if (r2 != r1) goto L_0x016a
        L_0x0162:
            java.util.LinkedHashMap r2 = new java.util.LinkedHashMap
            r2.<init>()
            r11.updateRememberedValue(r2)
        L_0x016a:
            r11.endReplaceableGroup()
            java.util.Map r2 = (java.util.Map) r2
            java.lang.Object r1 = r22.getCurrentState()
            java.lang.Object r5 = r22.getTargetState()
            boolean r1 = kotlin.jvm.internal.C12775o.m28634d(r1, r5)
            if (r1 == 0) goto L_0x01b5
            int r1 = r3.size()
            if (r1 != r4) goto L_0x0192
            r5 = 0
            java.lang.Object r1 = r3.get(r5)
            java.lang.Object r5 = r22.getCurrentState()
            boolean r1 = kotlin.jvm.internal.C12775o.m28634d(r1, r5)
            if (r1 != 0) goto L_0x019c
        L_0x0192:
            r3.clear()
            java.lang.Object r1 = r22.getCurrentState()
            r3.add(r1)
        L_0x019c:
            int r1 = r2.size()
            if (r1 != r4) goto L_0x01ac
            java.lang.Object r1 = r22.getCurrentState()
            boolean r1 = r2.containsKey(r1)
            if (r1 == 0) goto L_0x01af
        L_0x01ac:
            r2.clear()
        L_0x01af:
            r7.setContentAlignment$animation_release(r6)
            r7.setLayoutDirection$animation_release(r0)
        L_0x01b5:
            java.lang.Object r0 = r22.getCurrentState()
            java.lang.Object r1 = r22.getTargetState()
            boolean r0 = kotlin.jvm.internal.C12775o.m28634d(r0, r1)
            if (r0 != 0) goto L_0x0207
            java.lang.Object r0 = r22.getTargetState()
            boolean r0 = r3.contains(r0)
            if (r0 != 0) goto L_0x0207
            java.util.Iterator r0 = r3.iterator()
            r1 = 0
        L_0x01d2:
            boolean r5 = r0.hasNext()
            if (r5 == 0) goto L_0x01f4
            java.lang.Object r5 = r0.next()
            java.lang.Object r5 = r12.invoke(r5)
            java.lang.Object r4 = r22.getTargetState()
            java.lang.Object r4 = r12.invoke(r4)
            boolean r4 = kotlin.jvm.internal.C12775o.m28634d(r5, r4)
            if (r4 == 0) goto L_0x01f0
            r0 = -1
            goto L_0x01f6
        L_0x01f0:
            int r1 = r1 + 1
            r4 = 1
            goto L_0x01d2
        L_0x01f4:
            r0 = -1
            r1 = -1
        L_0x01f6:
            if (r1 != r0) goto L_0x0200
            java.lang.Object r0 = r22.getTargetState()
            r3.add(r0)
            goto L_0x0207
        L_0x0200:
            java.lang.Object r0 = r22.getTargetState()
            r3.set(r1, r0)
        L_0x0207:
            java.lang.Object r0 = r22.getTargetState()
            boolean r0 = r2.containsKey(r0)
            if (r0 != 0) goto L_0x025f
            r2.clear()
            int r5 = r3.size()
            r4 = 0
        L_0x0219:
            if (r4 >= r5) goto L_0x025f
            java.lang.Object r1 = r3.get(r4)
            androidx.compose.animation.AnimatedContentKt$AnimatedContent$5$1 r0 = new androidx.compose.animation.AnimatedContentKt$AnimatedContent$5$1
            r25 = r0
            r26 = r1
            r1 = r22
            r8 = r2
            r2 = r26
            r16 = r3
            r3 = r13
            r17 = r4
            r9 = 1
            r4 = r15
            r18 = r5
            r19 = 0
            r5 = r7
            r20 = r6
            r6 = r27
            r21 = r7
            r7 = r16
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            r0 = 963631013(0x396fd7a5, float:2.287315E-4)
            r1 = r25
            androidx.compose.runtime.internal.ComposableLambda r0 = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambda(r11, r0, r9, r1)
            r1 = r26
            r8.put(r1, r0)
            int r4 = r17 + 1
            r9 = r27
            r2 = r8
            r3 = r16
            r5 = r18
            r6 = r20
            r7 = r21
            r8 = r22
            goto L_0x0219
        L_0x025f:
            r8 = r2
            r16 = r3
            r20 = r6
            r21 = r7
            r19 = 0
            androidx.compose.animation.core.Transition$Segment r0 = r22.getSegment()
            r1 = 511388516(0x1e7b2b64, float:1.3296802E-20)
            r11.startReplaceableGroup(r1)
            r3 = r21
            boolean r1 = r11.changed((java.lang.Object) r3)
            boolean r0 = r11.changed((java.lang.Object) r0)
            r0 = r0 | r1
            java.lang.Object r1 = r11.rememberedValue()
            if (r0 != 0) goto L_0x028b
            androidx.compose.runtime.Composer$Companion r0 = androidx.compose.runtime.Composer.Companion
            java.lang.Object r0 = r0.getEmpty()
            if (r1 != r0) goto L_0x0295
        L_0x028b:
            java.lang.Object r0 = r15.invoke(r3)
            r1 = r0
            androidx.compose.animation.ContentTransform r1 = (androidx.compose.animation.ContentTransform) r1
            r11.updateRememberedValue(r1)
        L_0x0295:
            r11.endReplaceableGroup()
            androidx.compose.animation.ContentTransform r1 = (androidx.compose.animation.ContentTransform) r1
            r0 = 72
            androidx.compose.ui.Modifier r0 = r3.createSizeAnimationModifier$animation_release(r1, r11, r0)
            androidx.compose.ui.Modifier r0 = r14.then(r0)
            r1 = -492369756(0xffffffffe2a708a4, float:-1.5406144E21)
            r11.startReplaceableGroup(r1)
            java.lang.Object r1 = r11.rememberedValue()
            androidx.compose.runtime.Composer$Companion r2 = androidx.compose.runtime.Composer.Companion
            java.lang.Object r2 = r2.getEmpty()
            if (r1 != r2) goto L_0x02be
            androidx.compose.animation.AnimatedContentMeasurePolicy r1 = new androidx.compose.animation.AnimatedContentMeasurePolicy
            r1.<init>(r3)
            r11.updateRememberedValue(r1)
        L_0x02be:
            r11.endReplaceableGroup()
            androidx.compose.animation.AnimatedContentMeasurePolicy r1 = (androidx.compose.animation.AnimatedContentMeasurePolicy) r1
            r2 = -1323940314(0xffffffffb1164626, float:-2.1867748E-9)
            r11.startReplaceableGroup(r2)
            androidx.compose.runtime.ProvidableCompositionLocal r2 = androidx.compose.p002ui.platform.CompositionLocalsKt.getLocalDensity()
            java.lang.Object r2 = r11.consume(r2)
            androidx.compose.ui.unit.Density r2 = (androidx.compose.p002ui.unit.Density) r2
            androidx.compose.runtime.ProvidableCompositionLocal r3 = androidx.compose.p002ui.platform.CompositionLocalsKt.getLocalLayoutDirection()
            java.lang.Object r3 = r11.consume(r3)
            androidx.compose.ui.unit.LayoutDirection r3 = (androidx.compose.p002ui.unit.LayoutDirection) r3
            androidx.compose.runtime.ProvidableCompositionLocal r4 = androidx.compose.p002ui.platform.CompositionLocalsKt.getLocalViewConfiguration()
            java.lang.Object r4 = r11.consume(r4)
            androidx.compose.ui.platform.ViewConfiguration r4 = (androidx.compose.p002ui.platform.ViewConfiguration) r4
            androidx.compose.ui.node.ComposeUiNode$Companion r5 = androidx.compose.p002ui.node.ComposeUiNode.Companion
            of.a r6 = r5.getConstructor()
            of.p r0 = androidx.compose.p002ui.layout.LayoutKt.materializerOf(r0)
            androidx.compose.runtime.Applier r7 = r11.getApplier()
            boolean r7 = r7 instanceof androidx.compose.runtime.Applier
            if (r7 != 0) goto L_0x02fc
            androidx.compose.runtime.ComposablesKt.invalidApplier()
        L_0x02fc:
            r11.startReusableNode()
            boolean r7 = r11.getInserting()
            if (r7 == 0) goto L_0x0309
            r11.createNode(r6)
            goto L_0x030c
        L_0x0309:
            r11.useNode()
        L_0x030c:
            r11.disableReusing()
            androidx.compose.runtime.Composer r6 = androidx.compose.runtime.Updater.m35292constructorimpl(r11)
            of.o r7 = r5.getSetMeasurePolicy()
            androidx.compose.runtime.Updater.m35299setimpl((androidx.compose.runtime.Composer) r6, r1, r7)
            of.o r1 = r5.getSetDensity()
            androidx.compose.runtime.Updater.m35299setimpl((androidx.compose.runtime.Composer) r6, r2, r1)
            of.o r1 = r5.getSetLayoutDirection()
            androidx.compose.runtime.Updater.m35299setimpl((androidx.compose.runtime.Composer) r6, r3, r1)
            of.o r1 = r5.getSetViewConfiguration()
            androidx.compose.runtime.Updater.m35299setimpl((androidx.compose.runtime.Composer) r6, r4, r1)
            r11.enableReusing()
            androidx.compose.runtime.Composer r1 = androidx.compose.runtime.SkippableUpdater.m35284constructorimpl(r11)
            androidx.compose.runtime.SkippableUpdater r1 = androidx.compose.runtime.SkippableUpdater.m35283boximpl(r1)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r19)
            r0.invoke(r1, r11, r2)
            r0 = 2058660585(0x7ab4aae9, float:4.6903995E35)
            r11.startReplaceableGroup(r0)
            r0 = -451584589(0xffffffffe5155db3, float:-4.4085066E22)
            r11.startReplaceableGroup(r0)
            java.util.Iterator r0 = r16.iterator()
        L_0x0351:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x037b
            java.lang.Object r1 = r0.next()
            r2 = -1739565921(0xffffffff9850549f, float:-2.6926093E-24)
            java.lang.Object r3 = r12.invoke(r1)
            r11.startMovableGroup(r2, r3)
            java.lang.Object r1 = r8.get(r1)
            of.o r1 = (p404of.C13088o) r1
            if (r1 != 0) goto L_0x036e
            goto L_0x0377
        L_0x036e:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r19)
            r1.invoke(r11, r2)
            ef.v r1 = p336ef.C11921v.f18618a
        L_0x0377:
            r11.endMovableGroup()
            goto L_0x0351
        L_0x037b:
            r11.endReplaceableGroup()
            r11.endReplaceableGroup()
            r11.endNode()
            r11.endReplaceableGroup()
            r5 = r12
            r2 = r14
            r3 = r15
            r4 = r20
        L_0x038c:
            androidx.compose.runtime.ScopeUpdateScope r9 = r11.endRestartGroup()
            if (r9 != 0) goto L_0x0393
            goto L_0x03a4
        L_0x0393:
            androidx.compose.animation.AnimatedContentKt$AnimatedContent$8 r11 = new androidx.compose.animation.AnimatedContentKt$AnimatedContent$8
            r0 = r11
            r1 = r22
            r6 = r27
            r7 = r29
            r8 = r30
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            r9.updateScope(r11)
        L_0x03a4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.animation.AnimatedContentKt.AnimatedContent(androidx.compose.animation.core.Transition, androidx.compose.ui.Modifier, kotlin.jvm.functions.Function1, androidx.compose.ui.Alignment, kotlin.jvm.functions.Function1, of.q, androidx.compose.runtime.Composer, int, int):void");
    }
}
