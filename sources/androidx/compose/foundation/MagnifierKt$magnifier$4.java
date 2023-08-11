package androidx.compose.foundation;

import android.view.View;
import androidx.compose.p002ui.Modifier;
import androidx.compose.p002ui.draw.DrawModifierKt;
import androidx.compose.p002ui.geometry.Offset;
import androidx.compose.p002ui.graphics.drawscope.DrawScope;
import androidx.compose.p002ui.layout.OnGloballyPositionedModifierKt;
import androidx.compose.p002ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.p002ui.platform.CompositionLocalsKt;
import androidx.compose.p002ui.semantics.SemanticsModifierKt;
import androidx.compose.p002ui.unit.Density;
import androidx.compose.p002ui.unit.DpSize;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotMutationPolicy;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import kotlin.coroutines.jvm.internal.C12739f;
import kotlin.coroutines.jvm.internal.C12746l;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import kotlin.jvm.internal.SourceDebugExtension;
import p308ag.C10886a;
import p314bg.C11024t;
import p314bg.C11033z;
import p336ef.C11921v;
import p355hf.C12074d;
import p404of.C13088o;
import p404of.C13089p;
import p466yf.C13995l0;

@SourceDebugExtension({"SMAP\nMagnifier.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Magnifier.kt\nandroidx/compose/foundation/MagnifierKt$magnifier$4\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 5 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,394:1\n76#2:395\n76#2:396\n25#3:397\n25#3:404\n25#3:411\n25#3:418\n36#3:425\n36#3:432\n1114#4,6:398\n1114#4,6:405\n1114#4,6:412\n1114#4,6:419\n1114#4,6:426\n1114#4,6:433\n76#5:439\n102#5,2:440\n76#5:442\n76#5:443\n76#5:444\n76#5:445\n76#5:446\n76#5:447\n*S KotlinDebug\n*F\n+ 1 Magnifier.kt\nandroidx/compose/foundation/MagnifierKt$magnifier$4\n*L\n274#1:395\n275#1:396\n276#1:397\n281#1:404\n291#1:411\n296#1:418\n374#1:425\n386#1:432\n276#1:398,6\n281#1:405,6\n291#1:412,6\n296#1:419,6\n374#1:426,6\n386#1:433,6\n276#1:439\n276#1:440,2\n277#1:442\n278#1:443\n279#1:444\n280#1:445\n281#1:446\n291#1:447\n*E\n"})
/* compiled from: Magnifier.kt */
final class MagnifierKt$magnifier$4 extends C12777p implements C13089p<Modifier, Composer, Integer, Modifier> {
    final /* synthetic */ Function1<Density, Offset> $magnifierCenter;
    final /* synthetic */ Function1<DpSize, C11921v> $onSizeChanged;
    final /* synthetic */ PlatformMagnifierFactory $platformMagnifierFactory;
    final /* synthetic */ Function1<Density, Offset> $sourceCenter;
    final /* synthetic */ MagnifierStyle $style;
    final /* synthetic */ float $zoom;

    @C12739f(mo50609c = "androidx.compose.foundation.MagnifierKt$magnifier$4$1", mo50610f = "Magnifier.kt", mo50611l = {365}, mo50612m = "invokeSuspend")
    /* renamed from: androidx.compose.foundation.MagnifierKt$magnifier$4$1 */
    /* compiled from: Magnifier.kt */
    static final class C03781 extends C12746l implements C13088o<C13995l0, C12074d<? super C11921v>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        public final C12074d<C11921v> create(Object obj, C12074d<?> dVar) {
            C03781 r1 = new C03781(platformMagnifierFactory, magnifierStyle3, view, density, f3, tVar2, rememberUpdatedState4, state4, state5, state6, mutableState3, state7, dVar);
            r1.L$0 = obj;
            return r1;
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v5, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v11, resolved type: androidx.compose.foundation.PlatformMagnifier} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r20) {
            /*
                r19 = this;
                r1 = r19
                java.lang.Object r0 = p362if.C12150d.m26492c()
                int r2 = r1.label
                r3 = 1
                if (r2 == 0) goto L_0x0022
                if (r2 != r3) goto L_0x001a
                java.lang.Object r0 = r1.L$0
                r2 = r0
                androidx.compose.foundation.PlatformMagnifier r2 = (androidx.compose.foundation.PlatformMagnifier) r2
                p336ef.C11910n.m25701b(r20)     // Catch:{ all -> 0x0017 }
                goto L_0x0095
            L_0x0017:
                r0 = move-exception
                goto L_0x009d
            L_0x001a:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
                r0.<init>(r2)
                throw r0
            L_0x0022:
                p336ef.C11910n.m25701b(r20)
                java.lang.Object r2 = r1.L$0
                yf.l0 r2 = (p466yf.C13995l0) r2
                androidx.compose.foundation.PlatformMagnifierFactory r4 = r5
                androidx.compose.foundation.MagnifierStyle r5 = r6
                android.view.View r6 = r7
                androidx.compose.ui.unit.Density r7 = r8
                float r8 = r9
                androidx.compose.foundation.PlatformMagnifier r4 = r4.create(r5, r6, r7, r8)
                kotlin.jvm.internal.g0 r5 = new kotlin.jvm.internal.g0
                r5.<init>()
                long r6 = r4.m33028getSizeYbymL2g()
                androidx.compose.ui.unit.Density r8 = r8
                androidx.compose.runtime.State<kotlin.jvm.functions.Function1<androidx.compose.ui.unit.DpSize, ef.v>> r9 = r11
                kotlin.jvm.functions.Function1 r9 = androidx.compose.foundation.MagnifierKt$magnifier$4.invoke$lambda$6(r9)
                if (r9 == 0) goto L_0x0059
                long r10 = androidx.compose.p002ui.unit.IntSizeKt.m38638toSizeozmzZPI(r6)
                long r10 = r8.m38447toDpSizekrfVVM(r10)
                androidx.compose.ui.unit.DpSize r8 = androidx.compose.p002ui.unit.DpSize.m38554boximpl(r10)
                r9.invoke(r8)
            L_0x0059:
                r5.f20418b = r6
                bg.t<ef.v> r6 = r10
                androidx.compose.foundation.MagnifierKt$magnifier$4$1$1 r7 = new androidx.compose.foundation.MagnifierKt$magnifier$4$1$1
                r8 = 0
                r7.<init>(r4, r8)
                bg.f r6 = p314bg.C10971h.m23612s(r6, r7)
                p314bg.C10971h.m23610q(r6, r2)
                androidx.compose.foundation.MagnifierKt$magnifier$4$1$2 r2 = new androidx.compose.foundation.MagnifierKt$magnifier$4$1$2     // Catch:{ all -> 0x009b }
                androidx.compose.ui.unit.Density r11 = r8     // Catch:{ all -> 0x009b }
                androidx.compose.runtime.State<java.lang.Boolean> r12 = r12     // Catch:{ all -> 0x009b }
                androidx.compose.runtime.State<androidx.compose.ui.geometry.Offset> r13 = r13     // Catch:{ all -> 0x009b }
                androidx.compose.runtime.State<kotlin.jvm.functions.Function1<androidx.compose.ui.unit.Density, androidx.compose.ui.geometry.Offset>> r14 = r14     // Catch:{ all -> 0x009b }
                androidx.compose.runtime.MutableState<androidx.compose.ui.geometry.Offset> r15 = r15     // Catch:{ all -> 0x009b }
                androidx.compose.runtime.State<java.lang.Float> r6 = r16     // Catch:{ all -> 0x009b }
                androidx.compose.runtime.State<kotlin.jvm.functions.Function1<androidx.compose.ui.unit.DpSize, ef.v>> r7 = r11     // Catch:{ all -> 0x009b }
                r9 = r2
                r10 = r4
                r16 = r6
                r17 = r5
                r18 = r7
                r9.<init>(r10, r11, r12, r13, r14, r15, r16, r17, r18)     // Catch:{ all -> 0x009b }
                bg.f r2 = androidx.compose.runtime.SnapshotStateKt.snapshotFlow(r2)     // Catch:{ all -> 0x009b }
                r1.L$0 = r4     // Catch:{ all -> 0x009b }
                r1.label = r3     // Catch:{ all -> 0x009b }
                java.lang.Object r2 = p314bg.C10971h.m23598e(r2, r1)     // Catch:{ all -> 0x009b }
                if (r2 != r0) goto L_0x0094
                return r0
            L_0x0094:
                r2 = r4
            L_0x0095:
                r2.dismiss()
                ef.v r0 = p336ef.C11921v.f18618a
                return r0
            L_0x009b:
                r0 = move-exception
                r2 = r4
            L_0x009d:
                r2.dismiss()
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.MagnifierKt$magnifier$4.C03781.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        public final Object invoke(C13995l0 l0Var, C12074d<? super C11921v> dVar) {
            return ((C03781) create(l0Var, dVar)).invokeSuspend(C11921v.f18618a);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    MagnifierKt$magnifier$4(Function1<? super Density, Offset> function1, Function1<? super Density, Offset> function12, float f, Function1<? super DpSize, C11921v> function13, PlatformMagnifierFactory platformMagnifierFactory, MagnifierStyle magnifierStyle) {
        super(3);
        this.$sourceCenter = function1;
        this.$magnifierCenter = function12;
        this.$zoom = f;
        this.$onSizeChanged = function13;
        this.$platformMagnifierFactory = platformMagnifierFactory;
        this.$style = magnifierStyle;
    }

    /* access modifiers changed from: private */
    public static final long invoke$lambda$1(MutableState<Offset> mutableState) {
        return mutableState.getValue().m35432unboximpl();
    }

    /* access modifiers changed from: private */
    public static final boolean invoke$lambda$10(State<Boolean> state) {
        return state.getValue().booleanValue();
    }

    /* access modifiers changed from: private */
    public static final void invoke$lambda$2(MutableState<Offset> mutableState, long j) {
        mutableState.setValue(Offset.m35411boximpl(j));
    }

    /* access modifiers changed from: private */
    public static final Function1<Density, Offset> invoke$lambda$3(State<? extends Function1<? super Density, Offset>> state) {
        return (Function1) state.getValue();
    }

    /* access modifiers changed from: private */
    public static final Function1<Density, Offset> invoke$lambda$4(State<? extends Function1<? super Density, Offset>> state) {
        return (Function1) state.getValue();
    }

    /* access modifiers changed from: private */
    public static final float invoke$lambda$5(State<Float> state) {
        return state.getValue().floatValue();
    }

    /* access modifiers changed from: private */
    public static final Function1<DpSize, C11921v> invoke$lambda$6(State<? extends Function1<? super DpSize, C11921v>> state) {
        return (Function1) state.getValue();
    }

    /* access modifiers changed from: private */
    public static final long invoke$lambda$8(State<Offset> state) {
        return state.getValue().m35432unboximpl();
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return invoke((Modifier) obj, (Composer) obj2, ((Number) obj3).intValue());
    }

    @Composable
    public final Modifier invoke(Modifier modifier, Composer composer, int i) {
        Composer composer2 = composer;
        C12775o.m28639i(modifier, "$this$composed");
        composer2.startReplaceableGroup(-454877003);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-454877003, i, -1, "androidx.compose.foundation.magnifier.<anonymous> (Magnifier.kt:272)");
        }
        final View view = (View) composer2.consume(AndroidCompositionLocals_androidKt.getLocalView());
        final Density density = (Density) composer2.consume(CompositionLocalsKt.getLocalDensity());
        composer2.startReplaceableGroup(-492369756);
        Object rememberedValue = composer.rememberedValue();
        Composer.Companion companion = Composer.Companion;
        if (rememberedValue == companion.getEmpty()) {
            rememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Offset.m35411boximpl(Offset.Companion.m35437getUnspecifiedF1C5BW0()), (SnapshotMutationPolicy) null, 2, (Object) null);
            composer2.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceableGroup();
        MutableState mutableState = (MutableState) rememberedValue;
        State<T> rememberUpdatedState = SnapshotStateKt.rememberUpdatedState(this.$sourceCenter, composer2, 0);
        State<T> rememberUpdatedState2 = SnapshotStateKt.rememberUpdatedState(this.$magnifierCenter, composer2, 0);
        State rememberUpdatedState3 = SnapshotStateKt.rememberUpdatedState(Float.valueOf(this.$zoom), composer2, 0);
        final State<T> rememberUpdatedState4 = SnapshotStateKt.rememberUpdatedState(this.$onSizeChanged, composer2, 0);
        composer2.startReplaceableGroup(-492369756);
        Object rememberedValue2 = composer.rememberedValue();
        if (rememberedValue2 == companion.getEmpty()) {
            rememberedValue2 = SnapshotStateKt.derivedStateOf(new MagnifierKt$magnifier$4$sourceCenterInRoot$2$1(density, rememberUpdatedState, mutableState));
            composer2.updateRememberedValue(rememberedValue2);
        }
        composer.endReplaceableGroup();
        State state = (State) rememberedValue2;
        composer2.startReplaceableGroup(-492369756);
        Object rememberedValue3 = composer.rememberedValue();
        if (rememberedValue3 == companion.getEmpty()) {
            rememberedValue3 = SnapshotStateKt.derivedStateOf(new MagnifierKt$magnifier$4$isMagnifierShown$2$1(state));
            composer2.updateRememberedValue(rememberedValue3);
        }
        composer.endReplaceableGroup();
        State state2 = (State) rememberedValue3;
        composer2.startReplaceableGroup(-492369756);
        Object rememberedValue4 = composer.rememberedValue();
        if (rememberedValue4 == companion.getEmpty()) {
            rememberedValue4 = C11033z.m23722b(1, 0, C10886a.DROP_OLDEST, 2, (Object) null);
            composer2.updateRememberedValue(rememberedValue4);
        }
        composer.endReplaceableGroup();
        final C11024t tVar = (C11024t) rememberedValue4;
        float f = this.$platformMagnifierFactory.getCanUpdateZoom() ? 0.0f : this.$zoom;
        MagnifierStyle magnifierStyle = this.$style;
        Object[] objArr = {view, density, Float.valueOf(f), magnifierStyle, Boolean.valueOf(C12775o.m28634d(magnifierStyle, MagnifierStyle.Companion.getTextDefault()))};
        final PlatformMagnifierFactory platformMagnifierFactory = this.$platformMagnifierFactory;
        MagnifierStyle magnifierStyle2 = this.$style;
        float f2 = this.$zoom;
        C03781 r0 = r4;
        final MagnifierStyle magnifierStyle3 = magnifierStyle2;
        Object[] objArr2 = objArr;
        final float f3 = f2;
        final C11024t tVar2 = tVar;
        State state3 = state;
        final State state4 = state2;
        final State state5 = state3;
        MutableState mutableState2 = mutableState;
        final State<T> state6 = rememberUpdatedState2;
        final MutableState mutableState3 = mutableState2;
        final State state7 = rememberUpdatedState3;
        C03781 r4 = new C03781((C12074d<? super C03781>) null);
        EffectsKt.LaunchedEffect(objArr2, (C13088o<? super C13995l0, ? super C12074d<? super C11921v>, ? extends Object>) r0, composer2, 72);
        composer2.startReplaceableGroup(1157296644);
        MutableState mutableState4 = mutableState2;
        boolean changed = composer2.changed((Object) mutableState4);
        Object rememberedValue5 = composer.rememberedValue();
        if (changed || rememberedValue5 == companion.getEmpty()) {
            rememberedValue5 = new MagnifierKt$magnifier$4$2$1(mutableState4);
            composer2.updateRememberedValue(rememberedValue5);
        }
        composer.endReplaceableGroup();
        Modifier drawBehind = DrawModifierKt.drawBehind(OnGloballyPositionedModifierKt.onGloballyPositioned(modifier, (Function1) rememberedValue5), new Function1<DrawScope, C11921v>() {
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((DrawScope) obj);
                return C11921v.f18618a;
            }

            public final void invoke(DrawScope drawScope) {
                C12775o.m28639i(drawScope, "$this$drawBehind");
                tVar.mo46041e(C11921v.f18618a);
            }
        });
        composer2.startReplaceableGroup(1157296644);
        State state8 = state3;
        boolean changed2 = composer2.changed((Object) state8);
        Object rememberedValue6 = composer.rememberedValue();
        if (changed2 || rememberedValue6 == companion.getEmpty()) {
            rememberedValue6 = new MagnifierKt$magnifier$4$4$1(state8);
            composer2.updateRememberedValue(rememberedValue6);
        }
        composer.endReplaceableGroup();
        Modifier semantics$default = SemanticsModifierKt.semantics$default(drawBehind, false, (Function1) rememberedValue6, 1, (Object) null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return semantics$default;
    }
}
