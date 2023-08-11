package androidx.compose.p002ui.input.pointer;

import androidx.compose.p002ui.ExperimentalComposeUiApi;
import androidx.compose.p002ui.geometry.Offset;
import androidx.compose.runtime.Immutable;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Immutable
@ExperimentalComposeUiApi
/* renamed from: androidx.compose.ui.input.pointer.HistoricalChange */
/* compiled from: PointerEvent.kt */
public final class HistoricalChange {
    public static final int $stable = 0;
    private final long position;
    private final long uptimeMillis;

    public /* synthetic */ HistoricalChange(long j, long j2, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, j2);
    }

    /* renamed from: getPosition-F1C5BW0  reason: not valid java name */
    public final long m37099getPositionF1C5BW0() {
        return this.position;
    }

    public final long getUptimeMillis() {
        return this.uptimeMillis;
    }

    public String toString() {
        return "HistoricalChange(uptimeMillis=" + this.uptimeMillis + ", position=" + Offset.m35430toStringimpl(this.position) + ')';
    }

    private HistoricalChange(long j, long j2) {
        this.uptimeMillis = j;
        this.position = j2;
    }
}
