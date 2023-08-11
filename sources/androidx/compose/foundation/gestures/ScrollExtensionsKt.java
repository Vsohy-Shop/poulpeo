package androidx.compose.foundation.gestures;

import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.foundation.MutatePriority;
import p336ef.C11921v;
import p355hf.C12074d;

/* compiled from: ScrollExtensions.kt */
public final class ScrollExtensionsKt {
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0036  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object animateScrollBy(androidx.compose.foundation.gestures.ScrollableState r7, float r8, androidx.compose.animation.core.AnimationSpec<java.lang.Float> r9, p355hf.C12074d<? super java.lang.Float> r10) {
        /*
            boolean r0 = r10 instanceof androidx.compose.foundation.gestures.ScrollExtensionsKt$animateScrollBy$1
            if (r0 == 0) goto L_0x0013
            r0 = r10
            androidx.compose.foundation.gestures.ScrollExtensionsKt$animateScrollBy$1 r0 = (androidx.compose.foundation.gestures.ScrollExtensionsKt$animateScrollBy$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            androidx.compose.foundation.gestures.ScrollExtensionsKt$animateScrollBy$1 r0 = new androidx.compose.foundation.gestures.ScrollExtensionsKt$animateScrollBy$1
            r0.<init>(r10)
        L_0x0018:
            r4 = r0
            java.lang.Object r10 = r4.result
            java.lang.Object r0 = p362if.C12150d.m26492c()
            int r1 = r4.label
            r2 = 1
            if (r1 == 0) goto L_0x0036
            if (r1 != r2) goto L_0x002e
            java.lang.Object r7 = r4.L$0
            kotlin.jvm.internal.e0 r7 = (kotlin.jvm.internal.C12757e0) r7
            p336ef.C11910n.m25701b(r10)
            goto L_0x0057
        L_0x002e:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L_0x0036:
            p336ef.C11910n.m25701b(r10)
            kotlin.jvm.internal.e0 r10 = new kotlin.jvm.internal.e0
            r10.<init>()
            r3 = 0
            androidx.compose.foundation.gestures.ScrollExtensionsKt$animateScrollBy$2 r5 = new androidx.compose.foundation.gestures.ScrollExtensionsKt$animateScrollBy$2
            r1 = 0
            r5.<init>(r8, r9, r10, r1)
            r8 = 1
            r6 = 0
            r4.L$0 = r10
            r4.label = r2
            r1 = r7
            r2 = r3
            r3 = r5
            r5 = r8
            java.lang.Object r7 = androidx.compose.foundation.gestures.ScrollableState.scroll$default(r1, r2, r3, r4, r5, r6)
            if (r7 != r0) goto L_0x0056
            return r0
        L_0x0056:
            r7 = r10
        L_0x0057:
            float r7 = r7.f20408b
            java.lang.Float r7 = kotlin.coroutines.jvm.internal.C12735b.m28559b(r7)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.ScrollExtensionsKt.animateScrollBy(androidx.compose.foundation.gestures.ScrollableState, float, androidx.compose.animation.core.AnimationSpec, hf.d):java.lang.Object");
    }

    public static /* synthetic */ Object animateScrollBy$default(ScrollableState scrollableState, float f, AnimationSpec animationSpec, C12074d dVar, int i, Object obj) {
        if ((i & 2) != 0) {
            animationSpec = AnimationSpecKt.spring$default(0.0f, 0.0f, (Object) null, 7, (Object) null);
        }
        return animateScrollBy(scrollableState, f, animationSpec, dVar);
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0036  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object scrollBy(androidx.compose.foundation.gestures.ScrollableState r7, float r8, p355hf.C12074d<? super java.lang.Float> r9) {
        /*
            boolean r0 = r9 instanceof androidx.compose.foundation.gestures.ScrollExtensionsKt$scrollBy$1
            if (r0 == 0) goto L_0x0013
            r0 = r9
            androidx.compose.foundation.gestures.ScrollExtensionsKt$scrollBy$1 r0 = (androidx.compose.foundation.gestures.ScrollExtensionsKt$scrollBy$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            androidx.compose.foundation.gestures.ScrollExtensionsKt$scrollBy$1 r0 = new androidx.compose.foundation.gestures.ScrollExtensionsKt$scrollBy$1
            r0.<init>(r9)
        L_0x0018:
            r4 = r0
            java.lang.Object r9 = r4.result
            java.lang.Object r0 = p362if.C12150d.m26492c()
            int r1 = r4.label
            r2 = 1
            if (r1 == 0) goto L_0x0036
            if (r1 != r2) goto L_0x002e
            java.lang.Object r7 = r4.L$0
            kotlin.jvm.internal.e0 r7 = (kotlin.jvm.internal.C12757e0) r7
            p336ef.C11910n.m25701b(r9)
            goto L_0x0057
        L_0x002e:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L_0x0036:
            p336ef.C11910n.m25701b(r9)
            kotlin.jvm.internal.e0 r9 = new kotlin.jvm.internal.e0
            r9.<init>()
            r3 = 0
            androidx.compose.foundation.gestures.ScrollExtensionsKt$scrollBy$2 r5 = new androidx.compose.foundation.gestures.ScrollExtensionsKt$scrollBy$2
            r1 = 0
            r5.<init>(r9, r8, r1)
            r8 = 1
            r6 = 0
            r4.L$0 = r9
            r4.label = r2
            r1 = r7
            r2 = r3
            r3 = r5
            r5 = r8
            java.lang.Object r7 = androidx.compose.foundation.gestures.ScrollableState.scroll$default(r1, r2, r3, r4, r5, r6)
            if (r7 != r0) goto L_0x0056
            return r0
        L_0x0056:
            r7 = r9
        L_0x0057:
            float r7 = r7.f20408b
            java.lang.Float r7 = kotlin.coroutines.jvm.internal.C12735b.m28559b(r7)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.ScrollExtensionsKt.scrollBy(androidx.compose.foundation.gestures.ScrollableState, float, hf.d):java.lang.Object");
    }

    public static final Object stopScroll(ScrollableState scrollableState, MutatePriority mutatePriority, C12074d<? super C11921v> dVar) {
        Object scroll = scrollableState.scroll(mutatePriority, new ScrollExtensionsKt$stopScroll$2((C12074d<? super ScrollExtensionsKt$stopScroll$2>) null), dVar);
        if (scroll == C12150d.m26492c()) {
            return scroll;
        }
        return C11921v.f18618a;
    }

    public static /* synthetic */ Object stopScroll$default(ScrollableState scrollableState, MutatePriority mutatePriority, C12074d dVar, int i, Object obj) {
        if ((i & 1) != 0) {
            mutatePriority = MutatePriority.Default;
        }
        return stopScroll(scrollableState, mutatePriority, dVar);
    }
}
