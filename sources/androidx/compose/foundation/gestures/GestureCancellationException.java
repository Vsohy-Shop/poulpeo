package androidx.compose.foundation.gestures;

import androidx.compose.runtime.internal.StabilityInferred;
import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.DefaultConstructorMarker;

@StabilityInferred(parameters = 0)
/* compiled from: ForEachGesture.kt */
public final class GestureCancellationException extends CancellationException {
    public static final int $stable = 0;

    public GestureCancellationException() {
        this((String) null, 1, (DefaultConstructorMarker) null);
    }

    public GestureCancellationException(String str) {
        super(str);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ GestureCancellationException(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str);
    }
}
