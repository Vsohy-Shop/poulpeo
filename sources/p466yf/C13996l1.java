package p466yf;

import androidx.compose.animation.core.AnimationKt;
import androidx.core.location.LocationRequestCompat;
import p331dg.C11828g0;

/* renamed from: yf.l1 */
/* compiled from: EventLoop.common.kt */
public final class C13996l1 {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public static final C11828g0 f22922a = new C11828g0("REMOVED_TASK");
    /* access modifiers changed from: private */

    /* renamed from: b */
    public static final C11828g0 f22923b = new C11828g0("CLOSED_EMPTY");

    /* renamed from: c */
    public static final long m32438c(long j) {
        if (j <= 0) {
            return 0;
        }
        if (j >= 9223372036854L) {
            return LocationRequestCompat.PASSIVE_INTERVAL;
        }
        return AnimationKt.MillisToNanos * j;
    }
}
