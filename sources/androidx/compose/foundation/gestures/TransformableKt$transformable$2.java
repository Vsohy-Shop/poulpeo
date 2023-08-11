package androidx.compose.foundation.gestures;

import androidx.compose.p002ui.Modifier;
import androidx.compose.p002ui.input.pointer.PointerInputScope;
import androidx.compose.p002ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import kotlin.coroutines.jvm.internal.C12739f;
import kotlin.coroutines.jvm.internal.C12746l;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import kotlin.jvm.internal.SourceDebugExtension;
import p308ag.C10886a;
import p308ag.C10894d;
import p308ag.C10898g;
import p336ef.C11921v;
import p355hf.C12074d;
import p404of.C13088o;
import p404of.C13089p;
import p466yf.C13995l0;

@SourceDebugExtension({"SMAP\nTransformable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Transformable.kt\nandroidx/compose/foundation/gestures/TransformableKt$transformable$2\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,180:1\n25#2:181\n25#2:188\n1114#3,6:182\n1114#3,6:189\n*S KotlinDebug\n*F\n+ 1 Transformable.kt\nandroidx/compose/foundation/gestures/TransformableKt$transformable$2\n*L\n68#1:181\n89#1:188\n68#1:182,6\n89#1:189,6\n*E\n"})
/* compiled from: Transformable.kt */
final class TransformableKt$transformable$2 extends C12777p implements C13089p<Modifier, Composer, Integer, Modifier> {
    final /* synthetic */ boolean $enabled;
    final /* synthetic */ boolean $lockRotationOnZoomPan;
    final /* synthetic */ TransformableState $state;

    @C12739f(mo50609c = "androidx.compose.foundation.gestures.TransformableKt$transformable$2$1", mo50610f = "Transformable.kt", mo50611l = {72, 75}, mo50612m = "invokeSuspend")
    /* renamed from: androidx.compose.foundation.gestures.TransformableKt$transformable$2$1 */
    /* compiled from: Transformable.kt */
    static final class C04341 extends C12746l implements C13088o<C13995l0, C12074d<? super C11921v>, Object> {
        private /* synthetic */ Object L$0;
        Object L$1;
        Object L$2;
        int label;

        public final C12074d<C11921v> create(Object obj, C12074d<?> dVar) {
            C04341 r0 = new C04341(dVar, transformableState, dVar);
            r0.L$0 = obj;
            return r0;
        }

        /* JADX WARNING: Removed duplicated region for block: B:16:0x003f  */
        /* JADX WARNING: Removed duplicated region for block: B:22:0x0063 A[SYNTHETIC, Splitter:B:22:0x0063] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(T r12) {
            /*
                r11 = this;
                java.lang.Object r0 = p362if.C12150d.m26492c()
                int r1 = r11.label
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L_0x0031
                if (r1 == r3) goto L_0x001f
                if (r1 != r2) goto L_0x0017
                java.lang.Object r1 = r11.L$0
                yf.l0 r1 = (p466yf.C13995l0) r1
                p336ef.C11910n.m25701b(r12)     // Catch:{ CancellationException -> 0x0015 }
            L_0x0015:
                r12 = r1
                goto L_0x0038
            L_0x0017:
                java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r12.<init>(r0)
                throw r12
            L_0x001f:
                java.lang.Object r1 = r11.L$2
                kotlin.jvm.internal.Ref$ObjectRef r1 = (kotlin.jvm.internal.Ref$ObjectRef) r1
                java.lang.Object r4 = r11.L$1
                kotlin.jvm.internal.Ref$ObjectRef r4 = (kotlin.jvm.internal.Ref$ObjectRef) r4
                java.lang.Object r5 = r11.L$0
                yf.l0 r5 = (p466yf.C13995l0) r5
                p336ef.C11910n.m25701b(r12)
                r6 = r4
                r4 = r11
                goto L_0x005b
            L_0x0031:
                p336ef.C11910n.m25701b(r12)
                java.lang.Object r12 = r11.L$0
                yf.l0 r12 = (p466yf.C13995l0) r12
            L_0x0038:
                r1 = r11
            L_0x0039:
                boolean r4 = p466yf.C13999m0.m32453g(r12)
                if (r4 == 0) goto L_0x0081
                kotlin.jvm.internal.Ref$ObjectRef r4 = new kotlin.jvm.internal.Ref$ObjectRef
                r4.<init>()
                ag.d<androidx.compose.foundation.gestures.TransformEvent> r5 = r0
                r1.L$0 = r12
                r1.L$1 = r4
                r1.L$2 = r4
                r1.label = r3
                java.lang.Object r5 = r5.mo45883b(r1)
                if (r5 != r0) goto L_0x0055
                return r0
            L_0x0055:
                r6 = r4
                r4 = r1
                r1 = r6
                r10 = r5
                r5 = r12
                r12 = r10
            L_0x005b:
                r1.f20403b = r12
                T r12 = r6.f20403b
                boolean r12 = r12 instanceof androidx.compose.foundation.gestures.TransformEvent.TransformStarted
                if (r12 == 0) goto L_0x007e
                androidx.compose.foundation.gestures.TransformableState r12 = r2     // Catch:{ CancellationException -> 0x007e }
                androidx.compose.foundation.MutatePriority r1 = androidx.compose.foundation.MutatePriority.UserInput     // Catch:{ CancellationException -> 0x007e }
                androidx.compose.foundation.gestures.TransformableKt$transformable$2$1$1 r7 = new androidx.compose.foundation.gestures.TransformableKt$transformable$2$1$1     // Catch:{ CancellationException -> 0x007e }
                ag.d<androidx.compose.foundation.gestures.TransformEvent> r8 = r0     // Catch:{ CancellationException -> 0x007e }
                r9 = 0
                r7.<init>(r6, r8, r9)     // Catch:{ CancellationException -> 0x007e }
                r4.L$0 = r5     // Catch:{ CancellationException -> 0x007e }
                r4.L$1 = r9     // Catch:{ CancellationException -> 0x007e }
                r4.L$2 = r9     // Catch:{ CancellationException -> 0x007e }
                r4.label = r2     // Catch:{ CancellationException -> 0x007e }
                java.lang.Object r12 = r12.transform(r1, r7, r4)     // Catch:{ CancellationException -> 0x007e }
                if (r12 != r0) goto L_0x007e
                return r0
            L_0x007e:
                r1 = r4
                r12 = r5
                goto L_0x0039
            L_0x0081:
                ef.v r12 = p336ef.C11921v.f18618a
                return r12
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.TransformableKt$transformable$2.C04341.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        public final Object invoke(C13995l0 l0Var, C12074d<? super C11921v> dVar) {
            return ((C04341) create(l0Var, dVar)).invokeSuspend(C11921v.f18618a);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    TransformableKt$transformable$2(boolean z, boolean z2, TransformableState transformableState) {
        super(3);
        this.$lockRotationOnZoomPan = z;
        this.$enabled = z2;
        this.$state = transformableState;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return invoke((Modifier) obj, (Composer) obj2, ((Number) obj3).intValue());
    }

    @Composable
    public final Modifier invoke(Modifier modifier, Composer composer, int i) {
        C12775o.m28639i(modifier, "$this$composed");
        composer.startReplaceableGroup(1509335853);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1509335853, i, -1, "androidx.compose.foundation.gestures.transformable.<anonymous> (Transformable.kt:65)");
        }
        State rememberUpdatedState = SnapshotStateKt.rememberUpdatedState(Boolean.valueOf(this.$lockRotationOnZoomPan), composer, 0);
        composer.startReplaceableGroup(-492369756);
        Object rememberedValue = composer.rememberedValue();
        Composer.Companion companion = Composer.Companion;
        if (rememberedValue == companion.getEmpty()) {
            rememberedValue = C10898g.m23419b(Integer.MAX_VALUE, (C10886a) null, (Function1) null, 6, (Object) null);
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceableGroup();
        final C10894d dVar = (C10894d) rememberedValue;
        composer.startReplaceableGroup(-2015617726);
        if (this.$enabled) {
            final TransformableState transformableState = this.$state;
            EffectsKt.LaunchedEffect((Object) transformableState, (C13088o<? super C13995l0, ? super C12074d<? super C11921v>, ? extends Object>) new C04341((C12074d<? super C04341>) null), composer, 64);
        }
        composer.endReplaceableGroup();
        composer.startReplaceableGroup(-492369756);
        Object rememberedValue2 = composer.rememberedValue();
        if (rememberedValue2 == companion.getEmpty()) {
            rememberedValue2 = new TransformableKt$transformable$2$block$1$1(rememberUpdatedState, dVar, (C12074d<? super TransformableKt$transformable$2$block$1$1>) null);
            composer.updateRememberedValue(rememberedValue2);
        }
        composer.endReplaceableGroup();
        Modifier pointerInput = this.$enabled ? SuspendingPointerInputFilterKt.pointerInput((Modifier) Modifier.Companion, (Object) C11921v.f18618a, (C13088o<? super PointerInputScope, ? super C12074d<? super C11921v>, ? extends Object>) (C13088o) rememberedValue2) : Modifier.Companion;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return pointerInput;
    }
}
