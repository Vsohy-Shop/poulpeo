package androidx.compose.foundation.gestures;

import kotlin.coroutines.jvm.internal.C12737d;
import kotlin.coroutines.jvm.internal.C12739f;
import p355hf.C12074d;

@C12739f(mo50609c = "androidx.compose.foundation.gestures.ScrollExtensionsKt", mo50610f = "ScrollExtensions.kt", mo50611l = {61}, mo50612m = "scrollBy")
/* compiled from: ScrollExtensions.kt */
final class ScrollExtensionsKt$scrollBy$1 extends C12737d {
    Object L$0;
    int label;
    /* synthetic */ Object result;

    ScrollExtensionsKt$scrollBy$1(C12074d<? super ScrollExtensionsKt$scrollBy$1> dVar) {
        super(dVar);
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return ScrollExtensionsKt.scrollBy((ScrollableState) null, 0.0f, this);
    }
}
