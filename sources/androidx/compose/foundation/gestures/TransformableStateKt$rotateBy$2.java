package androidx.compose.foundation.gestures;

import androidx.compose.p002ui.geometry.Offset;
import kotlin.coroutines.jvm.internal.C12739f;
import kotlin.coroutines.jvm.internal.C12746l;
import p336ef.C11910n;
import p336ef.C11921v;
import p355hf.C12074d;
import p404of.C13088o;

@C12739f(mo50609c = "androidx.compose.foundation.gestures.TransformableStateKt$rotateBy$2", mo50610f = "TransformableState.kt", mo50611l = {}, mo50612m = "invokeSuspend")
/* compiled from: TransformableState.kt */
final class TransformableStateKt$rotateBy$2 extends C12746l implements C13088o<TransformScope, C12074d<? super C11921v>, Object> {
    final /* synthetic */ float $degrees;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    TransformableStateKt$rotateBy$2(float f, C12074d<? super TransformableStateKt$rotateBy$2> dVar) {
        super(2, dVar);
        this.$degrees = f;
    }

    public final C12074d<C11921v> create(Object obj, C12074d<?> dVar) {
        TransformableStateKt$rotateBy$2 transformableStateKt$rotateBy$2 = new TransformableStateKt$rotateBy$2(this.$degrees, dVar);
        transformableStateKt$rotateBy$2.L$0 = obj;
        return transformableStateKt$rotateBy$2;
    }

    public final Object invoke(TransformScope transformScope, C12074d<? super C11921v> dVar) {
        return ((TransformableStateKt$rotateBy$2) create(transformScope, dVar)).invokeSuspend(C11921v.f18618a);
    }

    public final Object invokeSuspend(Object obj) {
        Object unused = C12150d.m26492c();
        if (this.label == 0) {
            C11910n.m25701b(obj);
            ((TransformScope) this.L$0).m33152transformByd4ec7I(1.0f, Offset.Companion.m35438getZeroF1C5BW0(), this.$degrees);
            return C11921v.f18618a;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
