package androidx.compose.material;

import java.util.Map;
import kotlin.jvm.internal.SourceDebugExtension;
import p314bg.C10962f;
import p314bg.C10967g;
import p336ef.C11921v;
import p355hf.C12074d;

@SourceDebugExtension({"SMAP\nSafeCollector.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1\n+ 2 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n*L\n1#1,112:1\n51#2,5:113\n*E\n"})
/* compiled from: SafeCollector.common.kt */
public final class SwipeableState$special$$inlined$filter$1 implements C10962f<Map<Float, ? extends T>> {
    final /* synthetic */ C10962f $this_unsafeTransform$inlined;

    public SwipeableState$special$$inlined$filter$1(C10962f fVar) {
        this.$this_unsafeTransform$inlined = fVar;
    }

    public Object collect(final C10967g gVar, C12074d dVar) {
        Object collect = this.$this_unsafeTransform$inlined.collect(new C10967g() {
            /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
            /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final java.lang.Object emit(java.lang.Object r5, p355hf.C12074d r6) {
                /*
                    r4 = this;
                    boolean r0 = r6 instanceof androidx.compose.material.SwipeableState$special$$inlined$filter$1.C08012.C08021
                    if (r0 == 0) goto L_0x0013
                    r0 = r6
                    androidx.compose.material.SwipeableState$special$$inlined$filter$1$2$1 r0 = (androidx.compose.material.SwipeableState$special$$inlined$filter$1.C08012.C08021) r0
                    int r1 = r0.label
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L_0x0013
                    int r1 = r1 - r2
                    r0.label = r1
                    goto L_0x0018
                L_0x0013:
                    androidx.compose.material.SwipeableState$special$$inlined$filter$1$2$1 r0 = new androidx.compose.material.SwipeableState$special$$inlined$filter$1$2$1
                    r0.<init>(r4, r6)
                L_0x0018:
                    java.lang.Object r6 = r0.result
                    java.lang.Object r1 = p362if.C12150d.m26492c()
                    int r2 = r0.label
                    r3 = 1
                    if (r2 == 0) goto L_0x0031
                    if (r2 != r3) goto L_0x0029
                    p336ef.C11910n.m25701b(r6)
                    goto L_0x0049
                L_0x0029:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r6)
                    throw r5
                L_0x0031:
                    p336ef.C11910n.m25701b(r6)
                    bg.g r6 = r3
                    r2 = r5
                    java.util.Map r2 = (java.util.Map) r2
                    boolean r2 = r2.isEmpty()
                    r2 = r2 ^ r3
                    if (r2 == 0) goto L_0x0049
                    r0.label = r3
                    java.lang.Object r5 = r6.emit(r5, r0)
                    if (r5 != r1) goto L_0x0049
                    return r1
                L_0x0049:
                    ef.v r5 = p336ef.C11921v.f18618a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.SwipeableState$special$$inlined$filter$1.C08012.emit(java.lang.Object, hf.d):java.lang.Object");
            }
        }, dVar);
        if (collect == C12150d.m26492c()) {
            return collect;
        }
        return C11921v.f18618a;
    }
}
