package androidx.compose.animation;

import androidx.compose.animation.core.Transition;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12777p;
import p336ef.C11921v;
import p404of.C13088o;
import p404of.C13090q;

/* compiled from: AnimatedContent.kt */
final class AnimatedContentKt$AnimatedContent$5$1 extends C12777p implements C13088o<Composer, Integer, C11921v> {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ C13090q<AnimatedVisibilityScope, S, Composer, Integer, C11921v> $content;
    final /* synthetic */ SnapshotStateList<S> $currentlyVisible;
    final /* synthetic */ AnimatedContentScope<S> $rootScope;
    final /* synthetic */ S $stateForContent;
    final /* synthetic */ Transition<S> $this_AnimatedContent;
    final /* synthetic */ Function1<AnimatedContentScope<S>, ContentTransform> $transitionSpec;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    AnimatedContentKt$AnimatedContent$5$1(Transition<S> transition, S s, int i, Function1<? super AnimatedContentScope<S>, ContentTransform> function1, AnimatedContentScope<S> animatedContentScope, C13090q<? super AnimatedVisibilityScope, ? super S, ? super Composer, ? super Integer, C11921v> qVar, SnapshotStateList<S> snapshotStateList) {
        super(2);
        this.$this_AnimatedContent = transition;
        this.$stateForContent = s;
        this.$$dirty = i;
        this.$transitionSpec = function1;
        this.$rootScope = animatedContentScope;
        this.$content = qVar;
        this.$currentlyVisible = snapshotStateList;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((Composer) obj, ((Number) obj2).intValue());
        return C11921v.f18618a;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v2, resolved type: androidx.compose.animation.ExitTransition} */
    /* JADX WARNING: Multi-variable type inference failed */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void invoke(androidx.compose.runtime.Composer r15, int r16) {
        /*
            r14 = this;
            r0 = r14
            r7 = r15
            r1 = r16 & 11
            r2 = 2
            if (r1 != r2) goto L_0x0013
            boolean r1 = r15.getSkipping()
            if (r1 != 0) goto L_0x000e
            goto L_0x0013
        L_0x000e:
            r15.skipToGroupEnd()
            goto L_0x00f3
        L_0x0013:
            kotlin.jvm.functions.Function1<androidx.compose.animation.AnimatedContentScope<S>, androidx.compose.animation.ContentTransform> r1 = r0.$transitionSpec
            androidx.compose.animation.AnimatedContentScope<S> r2 = r0.$rootScope
            r3 = -492369756(0xffffffffe2a708a4, float:-1.5406144E21)
            r15.startReplaceableGroup(r3)
            java.lang.Object r4 = r15.rememberedValue()
            androidx.compose.runtime.Composer$Companion r5 = androidx.compose.runtime.Composer.Companion
            java.lang.Object r6 = r5.getEmpty()
            if (r4 != r6) goto L_0x0033
            java.lang.Object r1 = r1.invoke(r2)
            r4 = r1
            androidx.compose.animation.ContentTransform r4 = (androidx.compose.animation.ContentTransform) r4
            r15.updateRememberedValue(r4)
        L_0x0033:
            r15.endReplaceableGroup()
            androidx.compose.animation.ContentTransform r4 = (androidx.compose.animation.ContentTransform) r4
            androidx.compose.animation.core.Transition<S> r1 = r0.$this_AnimatedContent
            androidx.compose.animation.core.Transition$Segment r1 = r1.getSegment()
            java.lang.Object r1 = r1.getTargetState()
            S r2 = r0.$stateForContent
            boolean r1 = kotlin.jvm.internal.C12775o.m28634d(r1, r2)
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            kotlin.jvm.functions.Function1<androidx.compose.animation.AnimatedContentScope<S>, androidx.compose.animation.ContentTransform> r2 = r0.$transitionSpec
            androidx.compose.animation.AnimatedContentScope<S> r6 = r0.$rootScope
            r8 = 1157296644(0x44faf204, float:2007.563)
            r15.startReplaceableGroup(r8)
            boolean r1 = r15.changed((java.lang.Object) r1)
            java.lang.Object r8 = r15.rememberedValue()
            if (r1 != 0) goto L_0x0066
            java.lang.Object r1 = r5.getEmpty()
            if (r8 != r1) goto L_0x0073
        L_0x0066:
            java.lang.Object r1 = r2.invoke(r6)
            androidx.compose.animation.ContentTransform r1 = (androidx.compose.animation.ContentTransform) r1
            androidx.compose.animation.ExitTransition r8 = r1.getInitialContentExit()
            r15.updateRememberedValue(r8)
        L_0x0073:
            r15.endReplaceableGroup()
            r6 = r8
            androidx.compose.animation.ExitTransition r6 = (androidx.compose.animation.ExitTransition) r6
            S r1 = r0.$stateForContent
            androidx.compose.animation.core.Transition<S> r2 = r0.$this_AnimatedContent
            r15.startReplaceableGroup(r3)
            java.lang.Object r3 = r15.rememberedValue()
            java.lang.Object r5 = r5.getEmpty()
            if (r3 != r5) goto L_0x009a
            androidx.compose.animation.AnimatedContentScope$ChildData r3 = new androidx.compose.animation.AnimatedContentScope$ChildData
            java.lang.Object r2 = r2.getTargetState()
            boolean r1 = kotlin.jvm.internal.C12775o.m28634d(r1, r2)
            r3.<init>(r1)
            r15.updateRememberedValue(r3)
        L_0x009a:
            r15.endReplaceableGroup()
            androidx.compose.animation.AnimatedContentScope$ChildData r3 = (androidx.compose.animation.AnimatedContentScope.ChildData) r3
            androidx.compose.animation.EnterTransition r5 = r4.getTargetContentEnter()
            androidx.compose.ui.Modifier$Companion r1 = androidx.compose.p002ui.Modifier.Companion
            androidx.compose.animation.AnimatedContentKt$AnimatedContent$5$1$1 r2 = new androidx.compose.animation.AnimatedContentKt$AnimatedContent$5$1$1
            r2.<init>(r4)
            androidx.compose.ui.Modifier r1 = androidx.compose.p002ui.layout.LayoutModifierKt.layout(r1, r2)
            S r2 = r0.$stateForContent
            androidx.compose.animation.core.Transition<S> r4 = r0.$this_AnimatedContent
            java.lang.Object r4 = r4.getTargetState()
            boolean r2 = kotlin.jvm.internal.C12775o.m28634d(r2, r4)
            r3.setTarget(r2)
            androidx.compose.ui.Modifier r3 = r1.then(r3)
            androidx.compose.animation.core.Transition<S> r1 = r0.$this_AnimatedContent
            androidx.compose.animation.AnimatedContentKt$AnimatedContent$5$1$3 r2 = new androidx.compose.animation.AnimatedContentKt$AnimatedContent$5$1$3
            S r4 = r0.$stateForContent
            r2.<init>(r4)
            androidx.compose.animation.AnimatedContentKt$AnimatedContent$5$1$4 r4 = new androidx.compose.animation.AnimatedContentKt$AnimatedContent$5$1$4
            androidx.compose.animation.AnimatedContentScope<S> r9 = r0.$rootScope
            S r10 = r0.$stateForContent
            of.q<androidx.compose.animation.AnimatedVisibilityScope, S, androidx.compose.runtime.Composer, java.lang.Integer, ef.v> r11 = r0.$content
            int r12 = r0.$$dirty
            androidx.compose.runtime.snapshots.SnapshotStateList<S> r13 = r0.$currentlyVisible
            r8 = r4
            r8.<init>(r9, r10, r11, r12, r13)
            r8 = -1816907410(0xffffffff93b4316e, float:-4.548713E-27)
            r9 = 1
            androidx.compose.runtime.internal.ComposableLambda r8 = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambda(r15, r8, r9, r4)
            int r4 = r0.$$dirty
            r4 = r4 & 14
            r9 = 196608(0x30000, float:2.75506E-40)
            r9 = r9 | r4
            r10 = 0
            r4 = r5
            r5 = r6
            r6 = r8
            r7 = r15
            r8 = r9
            r9 = r10
            androidx.compose.animation.AnimatedVisibilityKt.AnimatedVisibility(r1, r2, (androidx.compose.p002ui.Modifier) r3, (androidx.compose.animation.EnterTransition) r4, (androidx.compose.animation.ExitTransition) r5, (p404of.C13089p<? super androidx.compose.animation.AnimatedVisibilityScope, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, p336ef.C11921v>) r6, (androidx.compose.runtime.Composer) r7, (int) r8, (int) r9)
        L_0x00f3:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.animation.AnimatedContentKt$AnimatedContent$5$1.invoke(androidx.compose.runtime.Composer, int):void");
    }
}
