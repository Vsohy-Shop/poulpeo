package androidx.compose.p002ui.input.pointer;

import androidx.compose.runtime.internal.StabilityInferred;
import java.util.concurrent.CancellationException;

@StabilityInferred(parameters = 0)
/* renamed from: androidx.compose.ui.input.pointer.PointerEventTimeoutCancellationException */
/* compiled from: SuspendingPointerInputFilter.kt */
public final class PointerEventTimeoutCancellationException extends CancellationException {
    public static final int $stable = 0;

    public PointerEventTimeoutCancellationException(long j) {
        super("Timed out waiting for " + j + " ms");
    }
}
