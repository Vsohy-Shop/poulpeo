package androidx.compose.foundation.text;

import androidx.compose.foundation.gestures.TapGestureDetectorKt;
import androidx.compose.p002ui.geometry.Offset;
import androidx.compose.p002ui.input.pointer.PointerEventPass;
import androidx.compose.p002ui.input.pointer.PointerInputScope;
import androidx.compose.p002ui.text.TextLayoutResult;
import androidx.compose.runtime.MutableState;
import kotlin.coroutines.jvm.internal.C12739f;
import kotlin.coroutines.jvm.internal.C12746l;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.Ref$ObjectRef;
import p336ef.C11910n;
import p336ef.C11921v;
import p355hf.C12074d;
import p355hf.C12079g;
import p404of.C13088o;
import p404of.C13089p;
import p466yf.C13995l0;
import p466yf.C14004n0;
import p466yf.C14054y1;

@C12739f(mo50609c = "androidx.compose.foundation.text.ClickableTextKt$ClickableText$pointerInputModifier$1", mo50610f = "ClickableText.kt", mo50611l = {174}, mo50612m = "invokeSuspend")
/* compiled from: ClickableText.kt */
final class ClickableTextKt$ClickableText$pointerInputModifier$1 extends C12746l implements C13088o<PointerInputScope, C12074d<? super C11921v>, Object> {
    final /* synthetic */ C13995l0 $coroutineScope;
    final /* synthetic */ MutableState<TextLayoutResult> $layoutResult;
    final /* synthetic */ Function1<Integer, C11921v> $onClick;
    final /* synthetic */ Function1<Integer, C11921v> $onHover;
    private /* synthetic */ Object L$0;
    int label;

    @C12739f(mo50609c = "androidx.compose.foundation.text.ClickableTextKt$ClickableText$pointerInputModifier$1$1", mo50610f = "ClickableText.kt", mo50611l = {165}, mo50612m = "invokeSuspend")
    /* renamed from: androidx.compose.foundation.text.ClickableTextKt$ClickableText$pointerInputModifier$1$1 */
    /* compiled from: ClickableText.kt */
    static final class C06011 extends C12746l implements C13088o<C13995l0, C12074d<? super C11921v>, Object> {
        int label;

        public final C12074d<C11921v> create(Object obj, C12074d<?> dVar) {
            return new C06011(pointerInputScope, function1, mutableState, dVar);
        }

        public final Object invokeSuspend(Object obj) {
            Object c = C12150d.m26492c();
            int i = this.label;
            if (i == 0) {
                C11910n.m25701b(obj);
                final Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
                PointerInputScope pointerInputScope = pointerInputScope;
                PointerEventPass pointerEventPass = PointerEventPass.Main;
                final Function1<Integer, C11921v> function1 = function1;
                final MutableState<TextLayoutResult> mutableState = mutableState;
                C06021 r4 = new Function1<Offset, C11921v>() {
                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                        m33637invokek4lQ0M(((Offset) obj).m35432unboximpl());
                        return C11921v.f18618a;
                    }

                    /* renamed from: invoke-k-4lQ0M  reason: not valid java name */
                    public final void m33637invokek4lQ0M(long j) {
                        T access$ClickableText_03UYbkw$getOffset = ClickableTextKt.ClickableText_03UYbkw$getOffset(mutableState, j);
                        if (!C12775o.m28634d(ref$ObjectRef.f20403b, access$ClickableText_03UYbkw$getOffset)) {
                            ref$ObjectRef.f20403b = access$ClickableText_03UYbkw$getOffset;
                            function1.invoke(access$ClickableText_03UYbkw$getOffset);
                        }
                    }
                };
                this.label = 1;
                if (PointerMoveDetectorKt.detectMoves(pointerInputScope, pointerEventPass, r4, this) == c) {
                    return c;
                }
            } else if (i == 1) {
                C11910n.m25701b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return C11921v.f18618a;
        }

        public final Object invoke(C13995l0 l0Var, C12074d<? super C11921v> dVar) {
            return ((C06011) create(l0Var, dVar)).invokeSuspend(C11921v.f18618a);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    ClickableTextKt$ClickableText$pointerInputModifier$1(C13995l0 l0Var, Function1<? super Integer, C11921v> function1, MutableState<TextLayoutResult> mutableState, Function1<? super Integer, C11921v> function12, C12074d<? super ClickableTextKt$ClickableText$pointerInputModifier$1> dVar) {
        super(2, dVar);
        this.$coroutineScope = l0Var;
        this.$onHover = function1;
        this.$layoutResult = mutableState;
        this.$onClick = function12;
    }

    public final C12074d<C11921v> create(Object obj, C12074d<?> dVar) {
        ClickableTextKt$ClickableText$pointerInputModifier$1 clickableTextKt$ClickableText$pointerInputModifier$1 = new ClickableTextKt$ClickableText$pointerInputModifier$1(this.$coroutineScope, this.$onHover, this.$layoutResult, this.$onClick, dVar);
        clickableTextKt$ClickableText$pointerInputModifier$1.L$0 = obj;
        return clickableTextKt$ClickableText$pointerInputModifier$1;
    }

    public final Object invoke(PointerInputScope pointerInputScope, C12074d<? super C11921v> dVar) {
        return ((ClickableTextKt$ClickableText$pointerInputModifier$1) create(pointerInputScope, dVar)).invokeSuspend(C11921v.f18618a);
    }

    public final Object invokeSuspend(Object obj) {
        Object c = C12150d.m26492c();
        int i = this.label;
        if (i == 0) {
            C11910n.m25701b(obj);
            final PointerInputScope pointerInputScope = (PointerInputScope) this.L$0;
            C13995l0 l0Var = this.$coroutineScope;
            final Function1<Integer, C11921v> function1 = this.$onHover;
            final MutableState<TextLayoutResult> mutableState = this.$layoutResult;
            C14054y1 unused = C13985j.m32422d(l0Var, (C12079g) null, (C14004n0) null, new C06011((C12074d<? super C06011>) null), 3, (Object) null);
            final Function1<Integer, C11921v> function12 = this.$onClick;
            final MutableState<TextLayoutResult> mutableState2 = this.$layoutResult;
            C06032 r7 = new Function1<Offset, C11921v>() {
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    m33638invokek4lQ0M(((Offset) obj).m35432unboximpl());
                    return C11921v.f18618a;
                }

                /* renamed from: invoke-k-4lQ0M  reason: not valid java name */
                public final void m33638invokek4lQ0M(long j) {
                    Integer access$ClickableText_03UYbkw$getOffset = ClickableTextKt.ClickableText_03UYbkw$getOffset(mutableState2, j);
                    if (access$ClickableText_03UYbkw$getOffset != null) {
                        function12.invoke(access$ClickableText_03UYbkw$getOffset);
                    }
                }
            };
            this.label = 1;
            if (TapGestureDetectorKt.detectTapGestures$default(pointerInputScope, (Function1) null, (Function1) null, (C13089p) null, r7, this, 7, (Object) null) == c) {
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
