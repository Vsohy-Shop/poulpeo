package androidx.compose.foundation;

import androidx.compose.foundation.interaction.HoverInteraction;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.p002ui.Modifier;
import androidx.compose.p002ui.input.pointer.AwaitPointerEventScope;
import androidx.compose.p002ui.input.pointer.PointerInputScope;
import androidx.compose.p002ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotMutationPolicy;
import kotlin.coroutines.jvm.internal.C12739f;
import kotlin.coroutines.jvm.internal.C12746l;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import kotlin.jvm.internal.SourceDebugExtension;
import p336ef.C11910n;
import p336ef.C11921v;
import p355hf.C12074d;
import p355hf.C12079g;
import p355hf.C12085h;
import p404of.C13088o;
import p404of.C13089p;
import p466yf.C13995l0;

@SourceDebugExtension({"SMAP\nHoverable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Hoverable.kt\nandroidx/compose/foundation/HoverableKt$hoverable$2\n+ 2 Effects.kt\nandroidx/compose/runtime/EffectsKt\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 5 Effects.kt\nandroidx/compose/runtime/EffectsKt$rememberCoroutineScope$1\n+ 6 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,116:1\n474#2,4:117\n478#2,2:125\n482#2:131\n25#3:121\n25#3:132\n50#3:139\n49#3:140\n67#3,3:147\n66#3:150\n1114#4,3:122\n1117#4,3:128\n1114#4,6:133\n1114#4,6:141\n1114#4,6:151\n474#5:127\n76#6:157\n102#6,2:158\n*S KotlinDebug\n*F\n+ 1 Hoverable.kt\nandroidx/compose/foundation/HoverableKt$hoverable$2\n*L\n56#1:117,4\n56#1:125,2\n56#1:131\n56#1:121\n57#1:132\n83#1:139\n83#1:140\n86#1:147,3\n86#1:150\n56#1:122,3\n56#1:128,3\n57#1:133,6\n83#1:141,6\n86#1:151,6\n56#1:127\n57#1:157\n57#1:158,2\n*E\n"})
/* compiled from: Hoverable.kt */
final class HoverableKt$hoverable$2 extends C12777p implements C13089p<Modifier, Composer, Integer, Modifier> {
    final /* synthetic */ boolean $enabled;
    final /* synthetic */ MutableInteractionSource $interactionSource;

    @SourceDebugExtension({"SMAP\nHoverable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Hoverable.kt\nandroidx/compose/foundation/HoverableKt$hoverable$2$3\n+ 2 CoroutineScope.kt\nkotlinx/coroutines/CoroutineScopeKt\n*L\n1#1,116:1\n329#2:117\n*S KotlinDebug\n*F\n+ 1 Hoverable.kt\nandroidx/compose/foundation/HoverableKt$hoverable$2$3\n*L\n101#1:117\n*E\n"})
    @C12739f(mo50609c = "androidx.compose.foundation.HoverableKt$hoverable$2$3", mo50610f = "Hoverable.kt", mo50611l = {102}, mo50612m = "invokeSuspend")
    /* renamed from: androidx.compose.foundation.HoverableKt$hoverable$2$3 */
    /* compiled from: Hoverable.kt */
    static final class C03743 extends C12746l implements C13088o<PointerInputScope, C12074d<? super C11921v>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        public final C12074d<C11921v> create(Object obj, C12074d<?> dVar) {
            C03743 r0 = new C03743(coroutineScope, mutableInteractionSource3, mutableState, dVar);
            r0.L$0 = obj;
            return r0;
        }

        public final Object invoke(PointerInputScope pointerInputScope, C12074d<? super C11921v> dVar) {
            return ((C03743) create(pointerInputScope, dVar)).invokeSuspend(C11921v.f18618a);
        }

        public final Object invokeSuspend(Object obj) {
            Object c = C12150d.m26492c();
            int i = this.label;
            if (i == 0) {
                C11910n.m25701b(obj);
                final C12079g context = getContext();
                final C13995l0 l0Var = coroutineScope;
                final MutableInteractionSource mutableInteractionSource = mutableInteractionSource3;
                final MutableState<HoverInteraction.Enter> mutableState = mutableState;
                C03751 r3 = new C13088o<AwaitPointerEventScope, C12074d<? super C11921v>, Object>((C12074d<? super C03751>) null) {
                    private /* synthetic */ Object L$0;
                    int label;

                    public final C12074d<C11921v> create(Object obj, C12074d<?> dVar) {
                        C03751 r0 = 

                        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                        HoverableKt$hoverable$2(MutableInteractionSource mutableInteractionSource, boolean z) {
                            super(3);
                            this.$interactionSource = mutableInteractionSource;
                            this.$enabled = z;
                        }

                        /* Code decompiled incorrectly, please refer to instructions dump. */
                        public static final java.lang.Object invoke$emitEnter(androidx.compose.foundation.interaction.MutableInteractionSource r4, androidx.compose.runtime.MutableState<androidx.compose.foundation.interaction.HoverInteraction.Enter> r5, p355hf.C12074d<? super p336ef.C11921v> r6) {
                            /*
                                boolean r0 = r6 instanceof androidx.compose.foundation.HoverableKt$hoverable$2$invoke$emitEnter$1
                                if (r0 == 0) goto L_0x0013
                                r0 = r6
                                androidx.compose.foundation.HoverableKt$hoverable$2$invoke$emitEnter$1 r0 = (androidx.compose.foundation.HoverableKt$hoverable$2$invoke$emitEnter$1) r0
                                int r1 = r0.label
                                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                                r3 = r1 & r2
                                if (r3 == 0) goto L_0x0013
                                int r1 = r1 - r2
                                r0.label = r1
                                goto L_0x0018
                            L_0x0013:
                                androidx.compose.foundation.HoverableKt$hoverable$2$invoke$emitEnter$1 r0 = new androidx.compose.foundation.HoverableKt$hoverable$2$invoke$emitEnter$1
                                r0.<init>(r6)
                            L_0x0018:
                                java.lang.Object r6 = r0.result
                                java.lang.Object r1 = p362if.C12150d.m26492c()
                                int r2 = r0.label
                                r3 = 1
                                if (r2 == 0) goto L_0x0039
                                if (r2 != r3) goto L_0x0031
                                java.lang.Object r4 = r0.L$1
                                androidx.compose.foundation.interaction.HoverInteraction$Enter r4 = (androidx.compose.foundation.interaction.HoverInteraction.Enter) r4
                                java.lang.Object r5 = r0.L$0
                                androidx.compose.runtime.MutableState r5 = (androidx.compose.runtime.MutableState) r5
                                p336ef.C11910n.m25701b(r6)
                                goto L_0x0055
                            L_0x0031:
                                java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
                                java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
                                r4.<init>(r5)
                                throw r4
                            L_0x0039:
                                p336ef.C11910n.m25701b(r6)
                                androidx.compose.foundation.interaction.HoverInteraction$Enter r6 = invoke$lambda$1(r5)
                                if (r6 != 0) goto L_0x0058
                                androidx.compose.foundation.interaction.HoverInteraction$Enter r6 = new androidx.compose.foundation.interaction.HoverInteraction$Enter
                                r6.<init>()
                                r0.L$0 = r5
                                r0.L$1 = r6
                                r0.label = r3
                                java.lang.Object r4 = r4.emit(r6, r0)
                                if (r4 != r1) goto L_0x0054
                                return r1
                            L_0x0054:
                                r4 = r6
                            L_0x0055:
                                invoke$lambda$2(r5, r4)
                            L_0x0058:
                                ef.v r4 = p336ef.C11921v.f18618a
                                return r4
                            */
                            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.HoverableKt$hoverable$2.invoke$emitEnter(androidx.compose.foundation.interaction.MutableInteractionSource, androidx.compose.runtime.MutableState, hf.d):java.lang.Object");
                        }

                        /* Code decompiled incorrectly, please refer to instructions dump. */
                        public static final java.lang.Object invoke$emitExit(androidx.compose.runtime.MutableState<androidx.compose.foundation.interaction.HoverInteraction.Enter> r4, androidx.compose.foundation.interaction.MutableInteractionSource r5, p355hf.C12074d<? super p336ef.C11921v> r6) {
                            /*
                                boolean r0 = r6 instanceof androidx.compose.foundation.HoverableKt$hoverable$2$invoke$emitExit$1
                                if (r0 == 0) goto L_0x0013
                                r0 = r6
                                androidx.compose.foundation.HoverableKt$hoverable$2$invoke$emitExit$1 r0 = (androidx.compose.foundation.HoverableKt$hoverable$2$invoke$emitExit$1) r0
                                int r1 = r0.label
                                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                                r3 = r1 & r2
                                if (r3 == 0) goto L_0x0013
                                int r1 = r1 - r2
                                r0.label = r1
                                goto L_0x0018
                            L_0x0013:
                                androidx.compose.foundation.HoverableKt$hoverable$2$invoke$emitExit$1 r0 = new androidx.compose.foundation.HoverableKt$hoverable$2$invoke$emitExit$1
                                r0.<init>(r6)
                            L_0x0018:
                                java.lang.Object r6 = r0.result
                                java.lang.Object r1 = p362if.C12150d.m26492c()
                                int r2 = r0.label
                                r3 = 1
                                if (r2 == 0) goto L_0x0035
                                if (r2 != r3) goto L_0x002d
                                java.lang.Object r4 = r0.L$0
                                androidx.compose.runtime.MutableState r4 = (androidx.compose.runtime.MutableState) r4
                                p336ef.C11910n.m25701b(r6)
                                goto L_0x004e
                            L_0x002d:
                                java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
                                java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
                                r4.<init>(r5)
                                throw r4
                            L_0x0035:
                                p336ef.C11910n.m25701b(r6)
                                androidx.compose.foundation.interaction.HoverInteraction$Enter r6 = invoke$lambda$1(r4)
                                if (r6 == 0) goto L_0x0052
                                androidx.compose.foundation.interaction.HoverInteraction$Exit r2 = new androidx.compose.foundation.interaction.HoverInteraction$Exit
                                r2.<init>(r6)
                                r0.L$0 = r4
                                r0.label = r3
                                java.lang.Object r5 = r5.emit(r2, r0)
                                if (r5 != r1) goto L_0x004e
                                return r1
                            L_0x004e:
                                r5 = 0
                                invoke$lambda$2(r4, r5)
                            L_0x0052:
                                ef.v r4 = p336ef.C11921v.f18618a
                                return r4
                            */
                            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.HoverableKt$hoverable$2.invoke$emitExit(androidx.compose.runtime.MutableState, androidx.compose.foundation.interaction.MutableInteractionSource, hf.d):java.lang.Object");
                        }

                        private static final HoverInteraction.Enter invoke$lambda$1(MutableState<HoverInteraction.Enter> mutableState) {
                            return mutableState.getValue();
                        }

                        private static final void invoke$lambda$2(MutableState<HoverInteraction.Enter> mutableState, HoverInteraction.Enter enter) {
                            mutableState.setValue(enter);
                        }

                        /* access modifiers changed from: private */
                        public static final void invoke$tryEmitExit(MutableState<HoverInteraction.Enter> mutableState, MutableInteractionSource mutableInteractionSource) {
                            HoverInteraction.Enter invoke$lambda$1 = invoke$lambda$1(mutableState);
                            if (invoke$lambda$1 != null) {
                                mutableInteractionSource.tryEmit(new HoverInteraction.Exit(invoke$lambda$1));
                                invoke$lambda$2(mutableState, (HoverInteraction.Enter) null);
                            }
                        }

                        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                            return invoke((Modifier) obj, (Composer) obj2, ((Number) obj3).intValue());
                        }

                        @Composable
                        public final Modifier invoke(Modifier modifier, Composer composer, int i) {
                            Modifier modifier2;
                            C12775o.m28639i(modifier, "$this$composed");
                            composer.startReplaceableGroup(1294013553);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(1294013553, i, -1, "androidx.compose.foundation.hoverable.<anonymous> (Hoverable.kt:54)");
                            }
                            composer.startReplaceableGroup(773894976);
                            composer.startReplaceableGroup(-492369756);
                            Object rememberedValue = composer.rememberedValue();
                            Composer.Companion companion = Composer.Companion;
                            if (rememberedValue == companion.getEmpty()) {
                                CompositionScopedCoroutineScopeCanceller compositionScopedCoroutineScopeCanceller = new CompositionScopedCoroutineScopeCanceller(EffectsKt.createCompositionCoroutineScope(C12085h.f18916b, composer));
                                composer.updateRememberedValue(compositionScopedCoroutineScopeCanceller);
                                rememberedValue = compositionScopedCoroutineScopeCanceller;
                            }
                            composer.endReplaceableGroup();
                            final C13995l0 coroutineScope = ((CompositionScopedCoroutineScopeCanceller) rememberedValue).getCoroutineScope();
                            composer.endReplaceableGroup();
                            composer.startReplaceableGroup(-492369756);
                            Object rememberedValue2 = composer.rememberedValue();
                            if (rememberedValue2 == companion.getEmpty()) {
                                rememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default((Object) null, (SnapshotMutationPolicy) null, 2, (Object) null);
                                composer.updateRememberedValue(rememberedValue2);
                            }
                            composer.endReplaceableGroup();
                            final MutableState mutableState = (MutableState) rememberedValue2;
                            MutableInteractionSource mutableInteractionSource = this.$interactionSource;
                            composer.startReplaceableGroup(511388516);
                            boolean changed = composer.changed((Object) mutableState) | composer.changed((Object) mutableInteractionSource);
                            Object rememberedValue3 = composer.rememberedValue();
                            if (changed || rememberedValue3 == companion.getEmpty()) {
                                rememberedValue3 = new HoverableKt$hoverable$2$1$1(mutableState, mutableInteractionSource);
                                composer.updateRememberedValue(rememberedValue3);
                            }
                            composer.endReplaceableGroup();
                            EffectsKt.DisposableEffect((Object) mutableInteractionSource, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) (Function1) rememberedValue3, composer, 0);
                            Boolean valueOf = Boolean.valueOf(this.$enabled);
                            Boolean valueOf2 = Boolean.valueOf(this.$enabled);
                            MutableInteractionSource mutableInteractionSource2 = this.$interactionSource;
                            boolean z = this.$enabled;
                            composer.startReplaceableGroup(1618982084);
                            boolean changed2 = composer.changed((Object) valueOf2) | composer.changed((Object) mutableState) | composer.changed((Object) mutableInteractionSource2);
                            Object rememberedValue4 = composer.rememberedValue();
                            if (changed2 || rememberedValue4 == companion.getEmpty()) {
                                rememberedValue4 = new HoverableKt$hoverable$2$2$1(z, mutableState, mutableInteractionSource2, (C12074d<? super HoverableKt$hoverable$2$2$1>) null);
                                composer.updateRememberedValue(rememberedValue4);
                            }
                            composer.endReplaceableGroup();
                            EffectsKt.LaunchedEffect((Object) valueOf, (C13088o<? super C13995l0, ? super C12074d<? super C11921v>, ? extends Object>) (C13088o) rememberedValue4, composer, 64);
                            if (this.$enabled) {
                                Modifier.Companion companion2 = Modifier.Companion;
                                final MutableInteractionSource mutableInteractionSource3 = this.$interactionSource;
                                modifier2 = SuspendingPointerInputFilterKt.pointerInput((Modifier) companion2, (Object) mutableInteractionSource3, (C13088o<? super PointerInputScope, ? super C12074d<? super C11921v>, ? extends Object>) new C03743((C12074d<? super C03743>) null));
                            } else {
                                modifier2 = Modifier.Companion;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            composer.endReplaceableGroup();
                            return modifier2;
                        }
                    }
