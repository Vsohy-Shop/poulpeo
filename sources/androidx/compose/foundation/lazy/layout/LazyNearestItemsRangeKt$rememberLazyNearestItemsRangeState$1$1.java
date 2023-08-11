package androidx.compose.foundation.lazy.layout;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import kotlin.coroutines.jvm.internal.C12739f;
import kotlin.coroutines.jvm.internal.C12746l;
import p314bg.C10962f;
import p314bg.C10967g;
import p336ef.C11910n;
import p336ef.C11921v;
import p355hf.C12074d;
import p404of.C13074a;
import p404of.C13088o;
import p436tf.C13528f;
import p466yf.C13995l0;

@C12739f(mo50609c = "androidx.compose.foundation.lazy.layout.LazyNearestItemsRangeKt$rememberLazyNearestItemsRangeState$1$1", mo50610f = "LazyNearestItemsRange.kt", mo50611l = {66}, mo50612m = "invokeSuspend")
/* compiled from: LazyNearestItemsRange.kt */
final class LazyNearestItemsRangeKt$rememberLazyNearestItemsRangeState$1$1 extends C12746l implements C13088o<C13995l0, C12074d<? super C11921v>, Object> {
    final /* synthetic */ C13074a<Integer> $extraItemCount;
    final /* synthetic */ C13074a<Integer> $firstVisibleItemIndex;
    final /* synthetic */ C13074a<Integer> $slidingWindowSize;
    final /* synthetic */ MutableState<C13528f> $state;
    int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    LazyNearestItemsRangeKt$rememberLazyNearestItemsRangeState$1$1(C13074a<Integer> aVar, C13074a<Integer> aVar2, C13074a<Integer> aVar3, MutableState<C13528f> mutableState, C12074d<? super LazyNearestItemsRangeKt$rememberLazyNearestItemsRangeState$1$1> dVar) {
        super(2, dVar);
        this.$firstVisibleItemIndex = aVar;
        this.$slidingWindowSize = aVar2;
        this.$extraItemCount = aVar3;
        this.$state = mutableState;
    }

    public final C12074d<C11921v> create(Object obj, C12074d<?> dVar) {
        return new LazyNearestItemsRangeKt$rememberLazyNearestItemsRangeState$1$1(this.$firstVisibleItemIndex, this.$slidingWindowSize, this.$extraItemCount, this.$state, dVar);
    }

    public final Object invokeSuspend(Object obj) {
        Object c = C12150d.m26492c();
        int i = this.label;
        if (i == 0) {
            C11910n.m25701b(obj);
            final C13074a<Integer> aVar = this.$firstVisibleItemIndex;
            final C13074a<Integer> aVar2 = this.$slidingWindowSize;
            final C13074a<Integer> aVar3 = this.$extraItemCount;
            C10962f snapshotFlow = SnapshotStateKt.snapshotFlow(new C13074a<C13528f>() {
                public final C13528f invoke() {
                    return LazyNearestItemsRangeKt.calculateNearestItemsRange(aVar.invoke().intValue(), aVar2.invoke().intValue(), aVar3.invoke().intValue());
                }
            });
            final MutableState<C13528f> mutableState = this.$state;
            C05602 r1 = new C10967g<C13528f>() {
                public final Object emit(C13528f fVar, C12074d<? super C11921v> dVar) {
                    mutableState.setValue(fVar);
                    return C11921v.f18618a;
                }
            };
            this.label = 1;
            if (snapshotFlow.collect(r1, this) == c) {
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
        return ((LazyNearestItemsRangeKt$rememberLazyNearestItemsRangeState$1$1) create(l0Var, dVar)).invokeSuspend(C11921v.f18618a);
    }
}
