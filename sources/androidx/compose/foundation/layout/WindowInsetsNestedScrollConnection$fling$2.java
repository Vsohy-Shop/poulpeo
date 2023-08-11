package androidx.compose.foundation.layout;

import android.view.WindowInsetsAnimationController;
import androidx.compose.animation.core.FloatDecayAnimationSpec;
import androidx.compose.animation.core.SuspendAnimationKt;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.jvm.internal.C12739f;
import kotlin.coroutines.jvm.internal.C12746l;
import kotlin.jvm.internal.C12757e0;
import p336ef.C11910n;
import p336ef.C11921v;
import p355hf.C12074d;
import p355hf.C12079g;
import p404of.C13088o;
import p466yf.C13995l0;
import p466yf.C14004n0;
import p466yf.C14054y1;

@C12739f(mo50609c = "androidx.compose.foundation.layout.WindowInsetsNestedScrollConnection$fling$2", mo50610f = "WindowInsetsConnection.android.kt", mo50611l = {348}, mo50612m = "invokeSuspend")
/* compiled from: WindowInsetsConnection.android.kt */
final class WindowInsetsNestedScrollConnection$fling$2 extends C12746l implements C13088o<C13995l0, C12074d<? super C11921v>, Object> {
    final /* synthetic */ WindowInsetsAnimationController $animationController;
    final /* synthetic */ int $current;
    final /* synthetic */ C12757e0 $endVelocity;
    final /* synthetic */ float $flingAmount;
    final /* synthetic */ int $hidden;
    final /* synthetic */ int $shown;
    final /* synthetic */ SplineBasedFloatDecayAnimationSpec $spec;
    final /* synthetic */ boolean $targetShown;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ WindowInsetsNestedScrollConnection this$0;

    @C12739f(mo50609c = "androidx.compose.foundation.layout.WindowInsetsNestedScrollConnection$fling$2$1", mo50610f = "WindowInsetsConnection.android.kt", mo50611l = {332}, mo50612m = "invokeSuspend")
    /* renamed from: androidx.compose.foundation.layout.WindowInsetsNestedScrollConnection$fling$2$1 */
    /* compiled from: WindowInsetsConnection.android.kt */
    static final class C04731 extends C12746l implements C13088o<C13995l0, C12074d<? super C11921v>, Object> {
        int label;

        public final C12074d<C11921v> create(Object obj, C12074d<?> dVar) {
            return new C04731(i2, f, splineBasedFloatDecayAnimationSpec, i3, i4, windowInsetsNestedScrollConnection2, e0Var, windowInsetsAnimationController, z, dVar);
        }

        public final Object invokeSuspend(Object obj) {
            Object c = C12150d.m26492c();
            int i = this.label;
            if (i == 0) {
                C11910n.m25701b(obj);
                float f = f;
                SplineBasedFloatDecayAnimationSpec splineBasedFloatDecayAnimationSpec = splineBasedFloatDecayAnimationSpec;
                final int i2 = i3;
                final int i3 = i4;
                final WindowInsetsNestedScrollConnection windowInsetsNestedScrollConnection = windowInsetsNestedScrollConnection2;
                final C12757e0 e0Var = e0Var;
                final WindowInsetsAnimationController windowInsetsAnimationController = windowInsetsAnimationController;
                final boolean z = z;
                C04741 r4 = new C13088o<Float, Float, C11921v>() {
                    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                        invoke(((Number) obj).floatValue(), ((Number) obj2).floatValue());
                        return C11921v.f18618a;
                    }

                    public final void invoke(float f, float f2) {
                        float f3 = (float) i2;
                        boolean z = false;
                        if (f <= ((float) i3) && f3 <= f) {
                            z = true;
                        }
                        if (z) {
                            windowInsetsNestedScrollConnection.adjustInsets(f);
                            return;
                        }
                        e0Var.f20408b = f2;
                        windowInsetsAnimationController.finish(z);
                        windowInsetsNestedScrollConnection.animationController = null;
                        C14054y1 access$getAnimationJob$p = windowInsetsNestedScrollConnection.animationJob;
                        if (access$getAnimationJob$p != null) {
                            C14054y1.C14055a.m32600a(access$getAnimationJob$p, (CancellationException) null, 1, (Object) null);
                        }
                    }
                };
                this.label = 1;
                if (SuspendAnimationKt.animateDecay((float) i2, f, (FloatDecayAnimationSpec) splineBasedFloatDecayAnimationSpec, (C13088o<? super Float, ? super Float, C11921v>) r4, (C12074d<? super C11921v>) this) == c) {
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
            return ((C04731) create(l0Var, dVar)).invokeSuspend(C11921v.f18618a);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    WindowInsetsNestedScrollConnection$fling$2(WindowInsetsNestedScrollConnection windowInsetsNestedScrollConnection, int i, float f, SplineBasedFloatDecayAnimationSpec splineBasedFloatDecayAnimationSpec, int i2, int i3, C12757e0 e0Var, WindowInsetsAnimationController windowInsetsAnimationController, boolean z, C12074d<? super WindowInsetsNestedScrollConnection$fling$2> dVar) {
        super(2, dVar);
        this.this$0 = windowInsetsNestedScrollConnection;
        this.$current = i;
        this.$flingAmount = f;
        this.$spec = splineBasedFloatDecayAnimationSpec;
        this.$hidden = i2;
        this.$shown = i3;
        this.$endVelocity = e0Var;
        this.$animationController = windowInsetsAnimationController;
        this.$targetShown = z;
    }

    public final C12074d<C11921v> create(Object obj, C12074d<?> dVar) {
        WindowInsetsNestedScrollConnection$fling$2 windowInsetsNestedScrollConnection$fling$2 = new WindowInsetsNestedScrollConnection$fling$2(this.this$0, this.$current, this.$flingAmount, this.$spec, this.$hidden, this.$shown, this.$endVelocity, this.$animationController, this.$targetShown, dVar);
        windowInsetsNestedScrollConnection$fling$2.L$0 = obj;
        return windowInsetsNestedScrollConnection$fling$2;
    }

    public final Object invokeSuspend(Object obj) {
        Object c = C12150d.m26492c();
        int i = this.label;
        if (i == 0) {
            C11910n.m25701b(obj);
            WindowInsetsNestedScrollConnection windowInsetsNestedScrollConnection = this.this$0;
            final int i2 = this.$current;
            final float f = this.$flingAmount;
            final SplineBasedFloatDecayAnimationSpec splineBasedFloatDecayAnimationSpec = this.$spec;
            final int i3 = this.$hidden;
            final int i4 = this.$shown;
            final C12757e0 e0Var = this.$endVelocity;
            final WindowInsetsAnimationController windowInsetsAnimationController = this.$animationController;
            final boolean z = this.$targetShown;
            final WindowInsetsNestedScrollConnection windowInsetsNestedScrollConnection2 = windowInsetsNestedScrollConnection;
            windowInsetsNestedScrollConnection.animationJob = C13985j.m32422d((C13995l0) this.L$0, (C12079g) null, (C14004n0) null, new C04731((C12074d<? super C04731>) null), 3, (Object) null);
            C14054y1 access$getAnimationJob$p = this.this$0.animationJob;
            if (access$getAnimationJob$p != null) {
                this.label = 1;
                if (access$getAnimationJob$p.mo53703G(this) == c) {
                    return c;
                }
            }
        } else if (i == 1) {
            C11910n.m25701b(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        this.this$0.animationJob = null;
        return C11921v.f18618a;
    }

    public final Object invoke(C13995l0 l0Var, C12074d<? super C11921v> dVar) {
        return ((WindowInsetsNestedScrollConnection$fling$2) create(l0Var, dVar)).invokeSuspend(C11921v.f18618a);
    }
}
