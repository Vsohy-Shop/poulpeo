package androidx.compose.animation;

import androidx.compose.animation.core.Transition;
import androidx.compose.p002ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.State;
import kotlin.jvm.internal.C12777p;
import p404of.C13089p;

/* compiled from: EnterExitTransition.kt */
final class EnterExitTransitionKt$shrinkExpand$1 extends C12777p implements C13089p<Modifier, Composer, Integer, Modifier> {
    final /* synthetic */ State<ChangeSize> $expand;
    final /* synthetic */ String $labelPrefix;
    final /* synthetic */ State<ChangeSize> $shrink;
    final /* synthetic */ Transition<EnterExitState> $transition;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    EnterExitTransitionKt$shrinkExpand$1(Transition<EnterExitState> transition, State<ChangeSize> state, State<ChangeSize> state2, String str) {
        super(3);
        this.$transition = transition;
        this.$expand = state;
        this.$shrink = state2;
        this.$labelPrefix = str;
    }

    /* renamed from: invoke$lambda-1  reason: not valid java name */
    private static final boolean m32851invoke$lambda1(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    /* renamed from: invoke$lambda-2  reason: not valid java name */
    private static final void m32852invoke$lambda2(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return invoke((Modifier) obj, (Composer) obj2, ((Number) obj3).intValue());
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v4, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v7, resolved type: androidx.compose.animation.ExpandShrinkModifier} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v2, resolved type: androidx.compose.animation.ExpandShrinkModifier} */
    /* JADX WARNING: type inference failed for: r6v5 */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x016d, code lost:
        if (r6 == r14.getEmpty()) goto L_0x016f;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00db  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x010c  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x010e  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0130  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0169  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x0193  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x0197  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x01be  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x01c0  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x01c3  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x01df  */
    @androidx.compose.runtime.Composable
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final androidx.compose.p002ui.Modifier invoke(androidx.compose.p002ui.Modifier r21, androidx.compose.runtime.Composer r22, int r23) {
        /*
            r20 = this;
            r0 = r20
            r1 = r21
            r8 = r22
            java.lang.String r2 = "$this$composed"
            kotlin.jvm.internal.C12775o.m28639i(r1, r2)
            r2 = -140634085(0xfffffffff79e181b, float:-6.413061E33)
            r8.startReplaceableGroup(r2)
            androidx.compose.animation.core.Transition<androidx.compose.animation.EnterExitState> r2 = r0.$transition
            r9 = 1157296644(0x44faf204, float:2007.563)
            r8.startReplaceableGroup(r9)
            boolean r2 = r8.changed((java.lang.Object) r2)
            java.lang.Object r3 = r22.rememberedValue()
            r10 = 0
            if (r2 != 0) goto L_0x002c
            androidx.compose.runtime.Composer$Companion r2 = androidx.compose.runtime.Composer.Companion
            java.lang.Object r2 = r2.getEmpty()
            if (r3 != r2) goto L_0x0036
        L_0x002c:
            java.lang.Boolean r2 = java.lang.Boolean.FALSE
            r3 = 2
            androidx.compose.runtime.MutableState r3 = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(r2, r10, r3, r10)
            r8.updateRememberedValue(r3)
        L_0x0036:
            r22.endReplaceableGroup()
            androidx.compose.runtime.MutableState r3 = (androidx.compose.runtime.MutableState) r3
            androidx.compose.animation.core.Transition<androidx.compose.animation.EnterExitState> r2 = r0.$transition
            java.lang.Object r2 = r2.getCurrentState()
            androidx.compose.animation.core.Transition<androidx.compose.animation.EnterExitState> r4 = r0.$transition
            java.lang.Object r4 = r4.getTargetState()
            r11 = 1
            r12 = 0
            if (r2 != r4) goto L_0x0057
            androidx.compose.animation.core.Transition<androidx.compose.animation.EnterExitState> r2 = r0.$transition
            boolean r2 = r2.isSeeking()
            if (r2 != 0) goto L_0x0057
            m32852invoke$lambda2(r3, r12)
            goto L_0x006a
        L_0x0057:
            androidx.compose.runtime.State<androidx.compose.animation.ChangeSize> r2 = r0.$expand
            java.lang.Object r2 = r2.getValue()
            if (r2 != 0) goto L_0x0067
            androidx.compose.runtime.State<androidx.compose.animation.ChangeSize> r2 = r0.$shrink
            java.lang.Object r2 = r2.getValue()
            if (r2 == 0) goto L_0x006a
        L_0x0067:
            m32852invoke$lambda2(r3, r11)
        L_0x006a:
            boolean r2 = m32851invoke$lambda1(r3)
            if (r2 == 0) goto L_0x01eb
            androidx.compose.animation.core.Transition<androidx.compose.animation.EnterExitState> r2 = r0.$transition
            androidx.compose.animation.core.Transition$Segment r2 = r2.getSegment()
            androidx.compose.animation.EnterExitState r3 = androidx.compose.animation.EnterExitState.PreEnter
            androidx.compose.animation.EnterExitState r4 = androidx.compose.animation.EnterExitState.Visible
            boolean r2 = r2.isTransitioningTo(r3, r4)
            androidx.compose.runtime.State<androidx.compose.animation.ChangeSize> r3 = r0.$expand
            androidx.compose.runtime.State<androidx.compose.animation.ChangeSize> r4 = r0.$shrink
            if (r2 == 0) goto L_0x009f
            java.lang.Object r2 = r3.getValue()
            androidx.compose.animation.ChangeSize r2 = (androidx.compose.animation.ChangeSize) r2
            if (r2 == 0) goto L_0x0092
            androidx.compose.ui.Alignment r2 = r2.getAlignment()
            if (r2 != 0) goto L_0x00bb
        L_0x0092:
            java.lang.Object r2 = r4.getValue()
            androidx.compose.animation.ChangeSize r2 = (androidx.compose.animation.ChangeSize) r2
            if (r2 == 0) goto L_0x00ba
            androidx.compose.ui.Alignment r2 = r2.getAlignment()
            goto L_0x00bb
        L_0x009f:
            java.lang.Object r2 = r4.getValue()
            androidx.compose.animation.ChangeSize r2 = (androidx.compose.animation.ChangeSize) r2
            if (r2 == 0) goto L_0x00ad
            androidx.compose.ui.Alignment r2 = r2.getAlignment()
            if (r2 != 0) goto L_0x00bb
        L_0x00ad:
            java.lang.Object r2 = r3.getValue()
            androidx.compose.animation.ChangeSize r2 = (androidx.compose.animation.ChangeSize) r2
            if (r2 == 0) goto L_0x00ba
            androidx.compose.ui.Alignment r2 = r2.getAlignment()
            goto L_0x00bb
        L_0x00ba:
            r2 = r10
        L_0x00bb:
            androidx.compose.runtime.State r19 = androidx.compose.runtime.SnapshotStateKt.rememberUpdatedState(r2, r8, r12)
            androidx.compose.animation.core.Transition<androidx.compose.animation.EnterExitState> r2 = r0.$transition
            androidx.compose.ui.unit.IntSize$Companion r3 = androidx.compose.p002ui.unit.IntSize.Companion
            androidx.compose.animation.core.TwoWayConverter r3 = androidx.compose.animation.core.VectorConvertersKt.getVectorConverter((androidx.compose.p002ui.unit.IntSize.Companion) r3)
            java.lang.String r4 = r0.$labelPrefix
            r13 = -492369756(0xffffffffe2a708a4, float:-1.5406144E21)
            r8.startReplaceableGroup(r13)
            java.lang.Object r5 = r22.rememberedValue()
            androidx.compose.runtime.Composer$Companion r14 = androidx.compose.runtime.Composer.Companion
            java.lang.Object r6 = r14.getEmpty()
            if (r5 != r6) goto L_0x00ef
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r4)
            java.lang.String r4 = " shrink/expand"
            r5.append(r4)
            java.lang.String r5 = r5.toString()
            r8.updateRememberedValue(r5)
        L_0x00ef:
            r22.endReplaceableGroup()
            r4 = r5
            java.lang.String r4 = (java.lang.String) r4
            r6 = 448(0x1c0, float:6.28E-43)
            r7 = 0
            r5 = r22
            androidx.compose.animation.core.Transition$DeferredAnimation r15 = androidx.compose.animation.core.TransitionKt.createDeferredAnimation(r2, r3, r4, r5, r6, r7)
            androidx.compose.animation.core.Transition<androidx.compose.animation.EnterExitState> r2 = r0.$transition
            java.lang.Object r2 = r2.getCurrentState()
            androidx.compose.animation.core.Transition<androidx.compose.animation.EnterExitState> r3 = r0.$transition
            java.lang.Object r3 = r3.getTargetState()
            if (r2 != r3) goto L_0x010e
            r2 = r11
            goto L_0x010f
        L_0x010e:
            r2 = r12
        L_0x010f:
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            r3 = -1553214637(0xffffffffa36bd353, float:-1.2784125E-17)
            r8.startMovableGroup(r3, r2)
            androidx.compose.animation.core.Transition<androidx.compose.animation.EnterExitState> r2 = r0.$transition
            androidx.compose.ui.unit.IntOffset$Companion r3 = androidx.compose.p002ui.unit.IntOffset.Companion
            androidx.compose.animation.core.TwoWayConverter r3 = androidx.compose.animation.core.VectorConvertersKt.getVectorConverter((androidx.compose.p002ui.unit.IntOffset.Companion) r3)
            java.lang.String r4 = r0.$labelPrefix
            r8.startReplaceableGroup(r13)
            java.lang.Object r5 = r22.rememberedValue()
            java.lang.Object r6 = r14.getEmpty()
            if (r5 != r6) goto L_0x0144
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r4)
            java.lang.String r4 = " InterruptionHandlingOffset"
            r5.append(r4)
            java.lang.String r5 = r5.toString()
            r8.updateRememberedValue(r5)
        L_0x0144:
            r22.endReplaceableGroup()
            r4 = r5
            java.lang.String r4 = (java.lang.String) r4
            r6 = 448(0x1c0, float:6.28E-43)
            r7 = 0
            r5 = r22
            androidx.compose.animation.core.Transition$DeferredAnimation r2 = androidx.compose.animation.core.TransitionKt.createDeferredAnimation(r2, r3, r4, r5, r6, r7)
            r22.endMovableGroup()
            androidx.compose.animation.core.Transition<androidx.compose.animation.EnterExitState> r3 = r0.$transition
            androidx.compose.runtime.State<androidx.compose.animation.ChangeSize> r4 = r0.$expand
            androidx.compose.runtime.State<androidx.compose.animation.ChangeSize> r5 = r0.$shrink
            r8.startReplaceableGroup(r9)
            boolean r3 = r8.changed((java.lang.Object) r3)
            java.lang.Object r6 = r22.rememberedValue()
            if (r3 != 0) goto L_0x016f
            java.lang.Object r3 = r14.getEmpty()
            if (r6 != r3) goto L_0x0180
        L_0x016f:
            androidx.compose.animation.ExpandShrinkModifier r6 = new androidx.compose.animation.ExpandShrinkModifier
            r13 = r6
            r14 = r15
            r15 = r2
            r16 = r4
            r17 = r5
            r18 = r19
            r13.<init>(r14, r15, r16, r17, r18)
            r8.updateRememberedValue(r6)
        L_0x0180:
            r22.endReplaceableGroup()
            androidx.compose.animation.ExpandShrinkModifier r6 = (androidx.compose.animation.ExpandShrinkModifier) r6
            androidx.compose.animation.core.Transition<androidx.compose.animation.EnterExitState> r2 = r0.$transition
            java.lang.Object r2 = r2.getCurrentState()
            androidx.compose.animation.core.Transition<androidx.compose.animation.EnterExitState> r3 = r0.$transition
            java.lang.Object r3 = r3.getTargetState()
            if (r2 != r3) goto L_0x0197
            r6.setCurrentAlignment(r10)
            goto L_0x01ae
        L_0x0197:
            androidx.compose.ui.Alignment r2 = r6.getCurrentAlignment()
            if (r2 != 0) goto L_0x01ae
            java.lang.Object r2 = r19.getValue()
            androidx.compose.ui.Alignment r2 = (androidx.compose.p002ui.Alignment) r2
            if (r2 != 0) goto L_0x01ab
            androidx.compose.ui.Alignment$Companion r2 = androidx.compose.p002ui.Alignment.Companion
            androidx.compose.ui.Alignment r2 = r2.getTopStart()
        L_0x01ab:
            r6.setCurrentAlignment(r2)
        L_0x01ae:
            androidx.compose.runtime.State<androidx.compose.animation.ChangeSize> r2 = r0.$expand
            java.lang.Object r2 = r2.getValue()
            androidx.compose.animation.ChangeSize r2 = (androidx.compose.animation.ChangeSize) r2
            if (r2 == 0) goto L_0x01c0
            boolean r2 = r2.getClip()
            if (r2 != 0) goto L_0x01c0
            r2 = r11
            goto L_0x01c1
        L_0x01c0:
            r2 = r12
        L_0x01c1:
            if (r2 != 0) goto L_0x01da
            androidx.compose.runtime.State<androidx.compose.animation.ChangeSize> r2 = r0.$shrink
            java.lang.Object r2 = r2.getValue()
            androidx.compose.animation.ChangeSize r2 = (androidx.compose.animation.ChangeSize) r2
            if (r2 == 0) goto L_0x01d5
            boolean r2 = r2.getClip()
            if (r2 != 0) goto L_0x01d5
            r2 = r11
            goto L_0x01d6
        L_0x01d5:
            r2 = r12
        L_0x01d6:
            if (r2 == 0) goto L_0x01d9
            goto L_0x01da
        L_0x01d9:
            r11 = r12
        L_0x01da:
            androidx.compose.ui.Modifier$Companion r2 = androidx.compose.p002ui.Modifier.Companion
            if (r11 == 0) goto L_0x01df
            goto L_0x01e3
        L_0x01df:
            androidx.compose.ui.Modifier r2 = androidx.compose.p002ui.draw.ClipKt.clipToBounds(r2)
        L_0x01e3:
            androidx.compose.ui.Modifier r1 = r1.then(r2)
            androidx.compose.ui.Modifier r1 = r1.then(r6)
        L_0x01eb:
            r22.endReplaceableGroup()
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.animation.EnterExitTransitionKt$shrinkExpand$1.invoke(androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, int):androidx.compose.ui.Modifier");
    }
}
