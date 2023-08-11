package androidx.compose.foundation.relocation;

import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.runtime.collection.MutableVector;
import kotlin.jvm.internal.SourceDebugExtension;

@SourceDebugExtension({"SMAP\nBringIntoViewRequester.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BringIntoViewRequester.kt\nandroidx/compose/foundation/relocation/BringIntoViewRequesterImpl\n+ 2 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n+ 3 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n*L\n1#1,154:1\n1182#2:155\n1161#2,2:156\n460#3,11:158\n*S KotlinDebug\n*F\n+ 1 BringIntoViewRequester.kt\nandroidx/compose/foundation/relocation/BringIntoViewRequesterImpl\n*L\n122#1:155\n122#1:156,2\n125#1:158,11\n*E\n"})
@ExperimentalFoundationApi
/* compiled from: BringIntoViewRequester.kt */
final class BringIntoViewRequesterImpl implements BringIntoViewRequester {
    private final MutableVector<BringIntoViewRequesterModifier> modifiers = new MutableVector<>(new BringIntoViewRequesterModifier[16], 0);

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0068, code lost:
        if (r8 >= r2) goto L_0x006a;
     */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x003e  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0066 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object bringIntoView(androidx.compose.p002ui.geometry.Rect r8, p355hf.C12074d<? super p336ef.C11921v> r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof androidx.compose.foundation.relocation.BringIntoViewRequesterImpl$bringIntoView$1
            if (r0 == 0) goto L_0x0013
            r0 = r9
            androidx.compose.foundation.relocation.BringIntoViewRequesterImpl$bringIntoView$1 r0 = (androidx.compose.foundation.relocation.BringIntoViewRequesterImpl$bringIntoView$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            androidx.compose.foundation.relocation.BringIntoViewRequesterImpl$bringIntoView$1 r0 = new androidx.compose.foundation.relocation.BringIntoViewRequesterImpl$bringIntoView$1
            r0.<init>(r7, r9)
        L_0x0018:
            java.lang.Object r9 = r0.result
            java.lang.Object r1 = p362if.C12150d.m26492c()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x003e
            if (r2 != r3) goto L_0x0036
            int r8 = r0.I$1
            int r2 = r0.I$0
            java.lang.Object r4 = r0.L$1
            java.lang.Object[] r4 = (java.lang.Object[]) r4
            java.lang.Object r5 = r0.L$0
            androidx.compose.ui.geometry.Rect r5 = (androidx.compose.p002ui.geometry.Rect) r5
            p336ef.C11910n.m25701b(r9)
            r9 = r5
            goto L_0x0067
        L_0x0036:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L_0x003e:
            p336ef.C11910n.m25701b(r9)
            androidx.compose.runtime.collection.MutableVector<androidx.compose.foundation.relocation.BringIntoViewRequesterModifier> r9 = r7.modifiers
            int r2 = r9.getSize()
            if (r2 <= 0) goto L_0x006a
            java.lang.Object[] r9 = r9.getContent()
            r4 = 0
            r6 = r9
            r9 = r8
            r8 = r4
            r4 = r6
        L_0x0052:
            r5 = r4[r8]
            androidx.compose.foundation.relocation.BringIntoViewRequesterModifier r5 = (androidx.compose.foundation.relocation.BringIntoViewRequesterModifier) r5
            r0.L$0 = r9
            r0.L$1 = r4
            r0.I$0 = r2
            r0.I$1 = r8
            r0.label = r3
            java.lang.Object r5 = r5.bringIntoView(r9, r0)
            if (r5 != r1) goto L_0x0067
            return r1
        L_0x0067:
            int r8 = r8 + r3
            if (r8 < r2) goto L_0x0052
        L_0x006a:
            ef.v r8 = p336ef.C11921v.f18618a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.relocation.BringIntoViewRequesterImpl.bringIntoView(androidx.compose.ui.geometry.Rect, hf.d):java.lang.Object");
    }

    public final MutableVector<BringIntoViewRequesterModifier> getModifiers() {
        return this.modifiers;
    }
}
