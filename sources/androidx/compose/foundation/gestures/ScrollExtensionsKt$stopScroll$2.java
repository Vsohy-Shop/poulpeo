package androidx.compose.foundation.gestures;

import kotlin.coroutines.jvm.internal.C12739f;
import kotlin.coroutines.jvm.internal.C12746l;
import p336ef.C11910n;
import p336ef.C11921v;
import p355hf.C12074d;
import p404of.C13088o;

@C12739f(mo50609c = "androidx.compose.foundation.gestures.ScrollExtensionsKt$stopScroll$2", mo50610f = "ScrollExtensions.kt", mo50611l = {}, mo50612m = "invokeSuspend")
/* compiled from: ScrollExtensions.kt */
final class ScrollExtensionsKt$stopScroll$2 extends C12746l implements C13088o<ScrollScope, C12074d<? super C11921v>, Object> {
    int label;

    ScrollExtensionsKt$stopScroll$2(C12074d<? super ScrollExtensionsKt$stopScroll$2> dVar) {
        super(2, dVar);
    }

    public final C12074d<C11921v> create(Object obj, C12074d<?> dVar) {
        return new ScrollExtensionsKt$stopScroll$2(dVar);
    }

    public final Object invoke(ScrollScope scrollScope, C12074d<? super C11921v> dVar) {
        return ((ScrollExtensionsKt$stopScroll$2) create(scrollScope, dVar)).invokeSuspend(C11921v.f18618a);
    }

    public final Object invokeSuspend(Object obj) {
        Object unused = C12150d.m26492c();
        if (this.label == 0) {
            C11910n.m25701b(obj);
            return C11921v.f18618a;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
