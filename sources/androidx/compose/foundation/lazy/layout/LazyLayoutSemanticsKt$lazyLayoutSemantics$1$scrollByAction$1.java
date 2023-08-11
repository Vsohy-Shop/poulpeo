package androidx.compose.foundation.lazy.layout;

import kotlin.coroutines.jvm.internal.C12739f;
import kotlin.coroutines.jvm.internal.C12746l;
import kotlin.jvm.internal.C12777p;
import p336ef.C11910n;
import p336ef.C11921v;
import p355hf.C12074d;
import p355hf.C12079g;
import p404of.C13088o;
import p466yf.C13995l0;
import p466yf.C14004n0;
import p466yf.C14054y1;

/* compiled from: LazyLayoutSemantics.kt */
final class LazyLayoutSemanticsKt$lazyLayoutSemantics$1$scrollByAction$1 extends C12777p implements C13088o<Float, Float, Boolean> {
    final /* synthetic */ C13995l0 $coroutineScope;
    final /* synthetic */ boolean $isVertical;
    final /* synthetic */ LazyLayoutSemanticState $state;

    @C12739f(mo50609c = "androidx.compose.foundation.lazy.layout.LazyLayoutSemanticsKt$lazyLayoutSemantics$1$scrollByAction$1$1", mo50610f = "LazyLayoutSemantics.kt", mo50611l = {96}, mo50612m = "invokeSuspend")
    /* renamed from: androidx.compose.foundation.lazy.layout.LazyLayoutSemanticsKt$lazyLayoutSemantics$1$scrollByAction$1$1 */
    /* compiled from: LazyLayoutSemantics.kt */
    static final class C05561 extends C12746l implements C13088o<C13995l0, C12074d<? super C11921v>, Object> {
        int label;

        public final C12074d<C11921v> create(Object obj, C12074d<?> dVar) {
            return new C05561(lazyLayoutSemanticState, f, dVar);
        }

        public final Object invokeSuspend(Object obj) {
            Object c = C12150d.m26492c();
            int i = this.label;
            if (i == 0) {
                C11910n.m25701b(obj);
                LazyLayoutSemanticState lazyLayoutSemanticState = lazyLayoutSemanticState;
                float f = f;
                this.label = 1;
                if (lazyLayoutSemanticState.animateScrollBy(f, this) == c) {
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
            return ((C05561) create(l0Var, dVar)).invokeSuspend(C11921v.f18618a);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    LazyLayoutSemanticsKt$lazyLayoutSemantics$1$scrollByAction$1(boolean z, C13995l0 l0Var, LazyLayoutSemanticState lazyLayoutSemanticState) {
        super(2);
        this.$isVertical = z;
        this.$coroutineScope = l0Var;
        this.$state = lazyLayoutSemanticState;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return invoke(((Number) obj).floatValue(), ((Number) obj2).floatValue());
    }

    public final Boolean invoke(final float f, float f2) {
        if (this.$isVertical) {
            f = f2;
        }
        C13995l0 l0Var = this.$coroutineScope;
        final LazyLayoutSemanticState lazyLayoutSemanticState = this.$state;
        C14054y1 unused = C13985j.m32422d(l0Var, (C12079g) null, (C14004n0) null, new C05561((C12074d<? super C05561>) null), 3, (Object) null);
        return Boolean.TRUE;
    }
}
