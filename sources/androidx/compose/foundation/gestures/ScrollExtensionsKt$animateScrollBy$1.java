package androidx.compose.foundation.gestures;

import androidx.compose.animation.core.AnimationSpec;
import kotlin.coroutines.jvm.internal.C12737d;
import kotlin.coroutines.jvm.internal.C12739f;
import p355hf.C12074d;

@C12739f(mo50609c = "androidx.compose.foundation.gestures.ScrollExtensionsKt", mo50610f = "ScrollExtensions.kt", mo50611l = {40}, mo50612m = "animateScrollBy")
/* compiled from: ScrollExtensions.kt */
final class ScrollExtensionsKt$animateScrollBy$1 extends C12737d {
    Object L$0;
    int label;
    /* synthetic */ Object result;

    ScrollExtensionsKt$animateScrollBy$1(C12074d<? super ScrollExtensionsKt$animateScrollBy$1> dVar) {
        super(dVar);
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return ScrollExtensionsKt.animateScrollBy((ScrollableState) null, 0.0f, (AnimationSpec<Float>) null, this);
    }
}
