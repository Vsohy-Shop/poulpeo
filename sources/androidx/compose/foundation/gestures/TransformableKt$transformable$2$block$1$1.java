package androidx.compose.foundation.gestures;

import androidx.compose.p002ui.input.pointer.AwaitPointerEventScope;
import androidx.compose.p002ui.input.pointer.PointerInputScope;
import androidx.compose.runtime.State;
import kotlin.coroutines.jvm.internal.C12739f;
import kotlin.coroutines.jvm.internal.C12746l;
import p308ag.C10894d;
import p336ef.C11910n;
import p336ef.C11921v;
import p355hf.C12074d;
import p404of.C13088o;
import p466yf.C13995l0;
import p466yf.C13999m0;

@C12739f(mo50609c = "androidx.compose.foundation.gestures.TransformableKt$transformable$2$block$1$1", mo50610f = "Transformable.kt", mo50611l = {91}, mo50612m = "invokeSuspend")
/* compiled from: Transformable.kt */
final class TransformableKt$transformable$2$block$1$1 extends C12746l implements C13088o<PointerInputScope, C12074d<? super C11921v>, Object> {
    final /* synthetic */ C10894d<TransformEvent> $channel;
    final /* synthetic */ State<Boolean> $updatePanZoomLock;
    private /* synthetic */ Object L$0;
    int label;

    @C12739f(mo50609c = "androidx.compose.foundation.gestures.TransformableKt$transformable$2$block$1$1$1", mo50610f = "Transformable.kt", mo50611l = {92}, mo50612m = "invokeSuspend")
    /* renamed from: androidx.compose.foundation.gestures.TransformableKt$transformable$2$block$1$1$1 */
    /* compiled from: Transformable.kt */
    static final class C04361 extends C12746l implements C13088o<C13995l0, C12074d<? super C11921v>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        public final C12074d<C11921v> create(Object obj, C12074d<?> dVar) {
            C04361 r0 = new C04361(pointerInputScope, state, dVar, dVar);
            r0.L$0 = obj;
            return r0;
        }

        public final Object invokeSuspend(Object obj) {
            Object c = C12150d.m26492c();
            int i = this.label;
            if (i == 0) {
                C11910n.m25701b(obj);
                final C13995l0 l0Var = (C13995l0) this.L$0;
                PointerInputScope pointerInputScope = pointerInputScope;
                final State<Boolean> state = state;
                final C10894d<TransformEvent> dVar = dVar;
                C04371 r3 = new C13088o<AwaitPointerEventScope, C12074d<? super C11921v>, Object>((C12074d<? super C04371>) null) {
                    private /* synthetic */ Object L$0;
                    int label;

                    public final C12074d<C11921v> create(Object obj, C12074d<?> dVar) {
                        C04371 r0 = 

                        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                        TransformableKt$transformable$2$block$1$1(State<Boolean> state, C10894d<TransformEvent> dVar, C12074d<? super TransformableKt$transformable$2$block$1$1> dVar2) {
                            super(2, dVar2);
                            this.$updatePanZoomLock = state;
                            this.$channel = dVar;
                        }

                        public final C12074d<C11921v> create(Object obj, C12074d<?> dVar) {
                            TransformableKt$transformable$2$block$1$1 transformableKt$transformable$2$block$1$1 = new TransformableKt$transformable$2$block$1$1(this.$updatePanZoomLock, this.$channel, dVar);
                            transformableKt$transformable$2$block$1$1.L$0 = obj;
                            return transformableKt$transformable$2$block$1$1;
                        }

                        public final Object invoke(PointerInputScope pointerInputScope, C12074d<? super C11921v> dVar) {
                            return ((TransformableKt$transformable$2$block$1$1) create(pointerInputScope, dVar)).invokeSuspend(C11921v.f18618a);
                        }

                        public final Object invokeSuspend(Object obj) {
                            Object c = C12150d.m26492c();
                            int i = this.label;
                            if (i == 0) {
                                C11910n.m25701b(obj);
                                final PointerInputScope pointerInputScope = (PointerInputScope) this.L$0;
                                final State<Boolean> state = this.$updatePanZoomLock;
                                final C10894d<TransformEvent> dVar = this.$channel;
                                C04361 r1 = new C04361((C12074d<? super C04361>) null);
                                this.label = 1;
                                if (C13999m0.m32451e(r1, this) == c) {
                                    return c;
                                }
                            } else if (i == 1) {
                                C11910n.m25701b(obj);
                            } else {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            return C11921v.f18618a;
                        }
                    }
