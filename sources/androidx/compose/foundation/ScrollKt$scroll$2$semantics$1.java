package androidx.compose.foundation;

import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.foundation.gestures.ScrollExtensionsKt;
import androidx.compose.p002ui.semantics.ScrollAxisRange;
import androidx.compose.p002ui.semantics.SemanticsPropertiesKt;
import androidx.compose.p002ui.semantics.SemanticsPropertyReceiver;
import kotlin.coroutines.jvm.internal.C12739f;
import kotlin.coroutines.jvm.internal.C12746l;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import p336ef.C11910n;
import p336ef.C11921v;
import p355hf.C12074d;
import p355hf.C12079g;
import p404of.C13088o;
import p466yf.C13995l0;
import p466yf.C14004n0;
import p466yf.C14054y1;

/* compiled from: Scroll.kt */
final class ScrollKt$scroll$2$semantics$1 extends C12777p implements Function1<SemanticsPropertyReceiver, C11921v> {
    final /* synthetic */ C13995l0 $coroutineScope;
    final /* synthetic */ boolean $isScrollable;
    final /* synthetic */ boolean $isVertical;
    final /* synthetic */ boolean $reverseScrolling;
    final /* synthetic */ ScrollState $state;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    ScrollKt$scroll$2$semantics$1(boolean z, boolean z2, boolean z3, ScrollState scrollState, C13995l0 l0Var) {
        super(1);
        this.$reverseScrolling = z;
        this.$isVertical = z2;
        this.$isScrollable = z3;
        this.$state = scrollState;
        this.$coroutineScope = l0Var;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((SemanticsPropertyReceiver) obj);
        return C11921v.f18618a;
    }

    public final void invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
        C12775o.m28639i(semanticsPropertyReceiver, "$this$semantics");
        ScrollAxisRange scrollAxisRange = new ScrollAxisRange(new ScrollKt$scroll$2$semantics$1$accessibilityScrollState$1(this.$state), new ScrollKt$scroll$2$semantics$1$accessibilityScrollState$2(this.$state), this.$reverseScrolling);
        if (this.$isVertical) {
            SemanticsPropertiesKt.setVerticalScrollAxisRange(semanticsPropertyReceiver, scrollAxisRange);
        } else {
            SemanticsPropertiesKt.setHorizontalScrollAxisRange(semanticsPropertyReceiver, scrollAxisRange);
        }
        if (this.$isScrollable) {
            final C13995l0 l0Var = this.$coroutineScope;
            final boolean z = this.$isVertical;
            final ScrollState scrollState = this.$state;
            SemanticsPropertiesKt.scrollBy$default(semanticsPropertyReceiver, (String) null, new C13088o<Float, Float, Boolean>() {

                @C12739f(mo50609c = "androidx.compose.foundation.ScrollKt$scroll$2$semantics$1$1$1", mo50610f = "Scroll.kt", mo50611l = {285, 287}, mo50612m = "invokeSuspend")
                /* renamed from: androidx.compose.foundation.ScrollKt$scroll$2$semantics$1$1$1 */
                /* compiled from: Scroll.kt */
                static final class C03871 extends C12746l implements C13088o<C13995l0, C12074d<? super C11921v>, Object> {
                    int label;

                    public final C12074d<C11921v> create(Object obj, C12074d<?> dVar) {
                        return new C03871(z, scrollState, f3, f4, dVar);
                    }

                    public final Object invokeSuspend(Object obj) {
                        Object c = C12150d.m26492c();
                        int i = this.label;
                        if (i == 0) {
                            C11910n.m25701b(obj);
                            if (z) {
                                ScrollState scrollState = scrollState;
                                C12775o.m28637g(scrollState, "null cannot be cast to non-null type androidx.compose.foundation.gestures.ScrollableState");
                                float f = f3;
                                this.label = 1;
                                if (ScrollExtensionsKt.animateScrollBy$default(scrollState, f, (AnimationSpec) null, this, 2, (Object) null) == c) {
                                    return c;
                                }
                            } else {
                                ScrollState scrollState2 = scrollState;
                                C12775o.m28637g(scrollState2, "null cannot be cast to non-null type androidx.compose.foundation.gestures.ScrollableState");
                                float f2 = f4;
                                this.label = 2;
                                if (ScrollExtensionsKt.animateScrollBy$default(scrollState2, f2, (AnimationSpec) null, this, 2, (Object) null) == c) {
                                    return c;
                                }
                            }
                        } else if (i == 1 || i == 2) {
                            C11910n.m25701b(obj);
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        return C11921v.f18618a;
                    }

                    public final Object invoke(C13995l0 l0Var, C12074d<? super C11921v> dVar) {
                        return ((C03871) create(l0Var, dVar)).invokeSuspend(C11921v.f18618a);
                    }
                }

                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    return invoke(((Number) obj).floatValue(), ((Number) obj2).floatValue());
                }

                public final Boolean invoke(float f, float f2) {
                    C13995l0 l0Var = l0Var;
                    final boolean z = z;
                    final ScrollState scrollState = scrollState;
                    final float f3 = f2;
                    final float f4 = f;
                    C14054y1 unused = C13985j.m32422d(l0Var, (C12079g) null, (C14004n0) null, new C03871((C12074d<? super C03871>) null), 3, (Object) null);
                    return Boolean.TRUE;
                }
            }, 1, (Object) null);
        }
    }
}
