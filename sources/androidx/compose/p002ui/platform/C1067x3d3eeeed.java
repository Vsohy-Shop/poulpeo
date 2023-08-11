package androidx.compose.p002ui.platform;

import kotlin.coroutines.jvm.internal.C12737d;
import kotlin.coroutines.jvm.internal.C12739f;
import p355hf.C12074d;

@C12739f(mo50609c = "androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat", mo50610f = "AndroidComposeViewAccessibilityDelegateCompat.android.kt", mo50611l = {2024, 2054}, mo50612m = "boundsUpdatesEventLoop")
/* renamed from: androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat$boundsUpdatesEventLoop$1 */
/* compiled from: AndroidComposeViewAccessibilityDelegateCompat.android.kt */
final class C1067x3d3eeeed extends C12737d {
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ AndroidComposeViewAccessibilityDelegateCompat this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C1067x3d3eeeed(AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat, C12074d<? super C1067x3d3eeeed> dVar) {
        super(dVar);
        this.this$0 = androidComposeViewAccessibilityDelegateCompat;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.boundsUpdatesEventLoop(this);
    }
}
