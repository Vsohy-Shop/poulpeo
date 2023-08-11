package androidx.compose.p002ui.platform;

import kotlin.KotlinNothingValueException;
import kotlin.coroutines.jvm.internal.C12739f;
import kotlin.coroutines.jvm.internal.C12746l;
import p314bg.C10967g;
import p314bg.C10972h0;
import p336ef.C11910n;
import p336ef.C11921v;
import p355hf.C12074d;
import p404of.C13088o;
import p466yf.C13995l0;

@C12739f(mo50609c = "androidx.compose.ui.platform.WindowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2$onStateChanged$1$1$1", mo50610f = "WindowRecomposer.android.kt", mo50611l = {387}, mo50612m = "invokeSuspend")
/* renamed from: androidx.compose.ui.platform.WindowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2$onStateChanged$1$1$1 */
/* compiled from: WindowRecomposer.android.kt */
final class C1109x93d788e4 extends C12746l implements C13088o<C13995l0, C12074d<? super C11921v>, Object> {
    final /* synthetic */ C10972h0<Float> $durationScaleStateFlow;
    final /* synthetic */ MotionDurationScaleImpl $it;
    int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C1109x93d788e4(C10972h0<Float> h0Var, MotionDurationScaleImpl motionDurationScaleImpl, C12074d<? super C1109x93d788e4> dVar) {
        super(2, dVar);
        this.$durationScaleStateFlow = h0Var;
        this.$it = motionDurationScaleImpl;
    }

    public final C12074d<C11921v> create(Object obj, C12074d<?> dVar) {
        return new C1109x93d788e4(this.$durationScaleStateFlow, this.$it, dVar);
    }

    public final Object invokeSuspend(Object obj) {
        Object c = C12150d.m26492c();
        int i = this.label;
        if (i == 0) {
            C11910n.m25701b(obj);
            C10972h0<Float> h0Var = this.$durationScaleStateFlow;
            final MotionDurationScaleImpl motionDurationScaleImpl = this.$it;
            C11101 r1 = new C10967g<Float>() {
                public /* bridge */ /* synthetic */ Object emit(Object obj, C12074d dVar) {
                    return emit(((Number) obj).floatValue(), (C12074d<? super C11921v>) dVar);
                }

                public final Object emit(float f, C12074d<? super C11921v> dVar) {
                    motionDurationScaleImpl.setScaleFactor(f);
                    return C11921v.f18618a;
                }
            };
            this.label = 1;
            if (h0Var.collect(r1, this) == c) {
                return c;
            }
        } else if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        } else {
            C11910n.m25701b(obj);
        }
        throw new KotlinNothingValueException();
    }

    public final Object invoke(C13995l0 l0Var, C12074d<? super C11921v> dVar) {
        return ((C1109x93d788e4) create(l0Var, dVar)).invokeSuspend(C11921v.f18618a);
    }
}
