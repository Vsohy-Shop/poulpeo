package androidx.compose.foundation.layout;

import android.view.WindowInsetsAnimationController;
import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimatableKt;
import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.AnimationVector1D;
import kotlin.coroutines.jvm.internal.C12735b;
import kotlin.coroutines.jvm.internal.C12739f;
import kotlin.coroutines.jvm.internal.C12746l;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import p336ef.C11910n;
import p336ef.C11921v;
import p355hf.C12074d;
import p355hf.C12079g;
import p404of.C13088o;
import p466yf.C13995l0;
import p466yf.C14004n0;

@C12739f(mo50609c = "androidx.compose.foundation.layout.WindowInsetsNestedScrollConnection$fling$3", mo50610f = "WindowInsetsConnection.android.kt", mo50611l = {}, mo50612m = "invokeSuspend")
/* compiled from: WindowInsetsConnection.android.kt */
final class WindowInsetsNestedScrollConnection$fling$3 extends C12746l implements C13088o<C13995l0, C12074d<? super C11921v>, Object> {
    final /* synthetic */ WindowInsetsAnimationController $animationController;
    final /* synthetic */ int $current;
    final /* synthetic */ float $flingAmount;
    final /* synthetic */ int $target;
    final /* synthetic */ boolean $targetShown;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ WindowInsetsNestedScrollConnection this$0;

    @C12739f(mo50609c = "androidx.compose.foundation.layout.WindowInsetsNestedScrollConnection$fling$3$1", mo50610f = "WindowInsetsConnection.android.kt", mo50611l = {358}, mo50612m = "invokeSuspend")
    /* renamed from: androidx.compose.foundation.layout.WindowInsetsNestedScrollConnection$fling$3$1 */
    /* compiled from: WindowInsetsConnection.android.kt */
    static final class C04751 extends C12746l implements C13088o<C13995l0, C12074d<? super C11921v>, Object> {
        int label;

        public final C12074d<C11921v> create(Object obj, C12074d<?> dVar) {
            return new C04751(i, i2, f, windowInsetsAnimationController, z, windowInsetsNestedScrollConnection2, dVar);
        }

        public final Object invokeSuspend(Object obj) {
            Object c = C12150d.m26492c();
            int i = this.label;
            if (i == 0) {
                C11910n.m25701b(obj);
                Animatable Animatable$default = AnimatableKt.Animatable$default((float) i, 0.0f, 2, (Object) null);
                Float b = C12735b.m28559b((float) i2);
                Float b2 = C12735b.m28559b(f);
                final WindowInsetsNestedScrollConnection windowInsetsNestedScrollConnection = windowInsetsNestedScrollConnection2;
                C04761 r9 = new Function1<Animatable<Float, AnimationVector1D>, C11921v>() {
                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                        invoke((Animatable<Float, AnimationVector1D>) (Animatable) obj);
                        return C11921v.f18618a;
                    }

                    public final void invoke(Animatable<Float, AnimationVector1D> animatable) {
                        C12775o.m28639i(animatable, "$this$animateTo");
                        windowInsetsNestedScrollConnection.adjustInsets(animatable.getValue().floatValue());
                    }
                };
                this.label = 1;
                if (Animatable.animateTo$default(Animatable$default, b, (AnimationSpec) null, b2, r9, this, 2, (Object) null) == c) {
                    return c;
                }
            } else if (i == 1) {
                C11910n.m25701b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            windowInsetsAnimationController.finish(z);
            windowInsetsNestedScrollConnection2.animationController = null;
            return C11921v.f18618a;
        }

        public final Object invoke(C13995l0 l0Var, C12074d<? super C11921v> dVar) {
            return ((C04751) create(l0Var, dVar)).invokeSuspend(C11921v.f18618a);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    WindowInsetsNestedScrollConnection$fling$3(WindowInsetsNestedScrollConnection windowInsetsNestedScrollConnection, int i, int i2, float f, WindowInsetsAnimationController windowInsetsAnimationController, boolean z, C12074d<? super WindowInsetsNestedScrollConnection$fling$3> dVar) {
        super(2, dVar);
        this.this$0 = windowInsetsNestedScrollConnection;
        this.$current = i;
        this.$target = i2;
        this.$flingAmount = f;
        this.$animationController = windowInsetsAnimationController;
        this.$targetShown = z;
    }

    public final C12074d<C11921v> create(Object obj, C12074d<?> dVar) {
        WindowInsetsNestedScrollConnection$fling$3 windowInsetsNestedScrollConnection$fling$3 = new WindowInsetsNestedScrollConnection$fling$3(this.this$0, this.$current, this.$target, this.$flingAmount, this.$animationController, this.$targetShown, dVar);
        windowInsetsNestedScrollConnection$fling$3.L$0 = obj;
        return windowInsetsNestedScrollConnection$fling$3;
    }

    public final Object invokeSuspend(Object obj) {
        Object unused = C12150d.m26492c();
        if (this.label == 0) {
            C11910n.m25701b(obj);
            WindowInsetsNestedScrollConnection windowInsetsNestedScrollConnection = this.this$0;
            final int i = this.$current;
            final int i2 = this.$target;
            final float f = this.$flingAmount;
            final WindowInsetsAnimationController windowInsetsAnimationController = this.$animationController;
            final boolean z = this.$targetShown;
            final WindowInsetsNestedScrollConnection windowInsetsNestedScrollConnection2 = windowInsetsNestedScrollConnection;
            windowInsetsNestedScrollConnection.animationJob = C13985j.m32422d((C13995l0) this.L$0, (C12079g) null, (C14004n0) null, new C04751((C12074d<? super C04751>) null), 3, (Object) null);
            return C11921v.f18618a;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }

    public final Object invoke(C13995l0 l0Var, C12074d<? super C11921v> dVar) {
        return ((WindowInsetsNestedScrollConnection$fling$3) create(l0Var, dVar)).invokeSuspend(C11921v.f18618a);
    }
}
