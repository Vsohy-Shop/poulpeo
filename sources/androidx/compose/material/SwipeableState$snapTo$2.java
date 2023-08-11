package androidx.compose.material;

import java.util.Map;
import p314bg.C10967g;

/* compiled from: Swipeable.kt */
final class SwipeableState$snapTo$2 implements C10967g<Map<Float, ? extends T>> {
    final /* synthetic */ T $targetValue;
    final /* synthetic */ SwipeableState<T> this$0;

    SwipeableState$snapTo$2(T t, SwipeableState<T> swipeableState) {
        this.$targetValue = t;
        this.this$0 = swipeableState;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0035  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object emit(java.util.Map<java.lang.Float, ? extends T> r5, p355hf.C12074d<? super p336ef.C11921v> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof androidx.compose.material.SwipeableState$snapTo$2$emit$1
            if (r0 == 0) goto L_0x0013
            r0 = r6
            androidx.compose.material.SwipeableState$snapTo$2$emit$1 r0 = (androidx.compose.material.SwipeableState$snapTo$2$emit$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            androidx.compose.material.SwipeableState$snapTo$2$emit$1 r0 = new androidx.compose.material.SwipeableState$snapTo$2$emit$1
            r0.<init>(r4, r6)
        L_0x0018:
            java.lang.Object r6 = r0.result
            java.lang.Object r1 = p362if.C12150d.m26492c()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x0035
            if (r2 != r3) goto L_0x002d
            java.lang.Object r5 = r0.L$0
            androidx.compose.material.SwipeableState$snapTo$2 r5 = (androidx.compose.material.SwipeableState$snapTo$2) r5
            p336ef.C11910n.m25701b(r6)
            goto L_0x0052
        L_0x002d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x0035:
            p336ef.C11910n.m25701b(r6)
            T r6 = r4.$targetValue
            java.lang.Float r5 = androidx.compose.material.SwipeableKt.getOffset(r5, r6)
            if (r5 == 0) goto L_0x005c
            androidx.compose.material.SwipeableState<T> r6 = r4.this$0
            float r5 = r5.floatValue()
            r0.L$0 = r4
            r0.label = r3
            java.lang.Object r5 = r6.snapInternalToOffset(r5, r0)
            if (r5 != r1) goto L_0x0051
            return r1
        L_0x0051:
            r5 = r4
        L_0x0052:
            androidx.compose.material.SwipeableState<T> r6 = r5.this$0
            T r5 = r5.$targetValue
            r6.setCurrentValue(r5)
            ef.v r5 = p336ef.C11921v.f18618a
            return r5
        L_0x005c:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.String r6 = "The target value must have an associated anchor."
            java.lang.String r6 = r6.toString()
            r5.<init>(r6)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.SwipeableState$snapTo$2.emit(java.util.Map, hf.d):java.lang.Object");
    }
}
