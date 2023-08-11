package androidx.compose.foundation.gestures;

import androidx.compose.p002ui.geometry.Offset;
import androidx.compose.runtime.State;
import kotlin.jvm.internal.C12777p;
import p336ef.C11921v;
import p404of.C13089p;

/* compiled from: TransformableState.kt */
final class TransformableStateKt$rememberTransformableState$1$1 extends C12777p implements C13089p<Float, Offset, Float, C11921v> {
    final /* synthetic */ State<C13089p<Float, Offset, Float, C11921v>> $lambdaState;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    TransformableStateKt$rememberTransformableState$1$1(State<? extends C13089p<? super Float, ? super Offset, ? super Float, C11921v>> state) {
        super(3);
        this.$lambdaState = state;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        m33157invoked4ec7I(((Number) obj).floatValue(), ((Offset) obj2).m35432unboximpl(), ((Number) obj3).floatValue());
        return C11921v.f18618a;
    }

    /* renamed from: invoke-d-4ec7I  reason: not valid java name */
    public final void m33157invoked4ec7I(float f, long j, float f2) {
        this.$lambdaState.getValue().invoke(Float.valueOf(f), Offset.m35411boximpl(j), Float.valueOf(f2));
    }
}
