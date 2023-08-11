package androidx.compose.foundation.pager;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.p002ui.geometry.Offset;
import androidx.compose.p002ui.input.nestedscroll.NestedScrollConnection;
import androidx.compose.p002ui.input.nestedscroll.NestedScrollSource;
import androidx.compose.p002ui.unit.Velocity;
import kotlin.jvm.internal.C12775o;
import p355hf.C12074d;

/* compiled from: Pager.kt */
final class ConsumeAllFlingOnDirection implements NestedScrollConnection {
    private final Orientation orientation;

    public ConsumeAllFlingOnDirection(Orientation orientation2) {
        C12775o.m28639i(orientation2, "orientation");
        this.orientation = orientation2;
    }

    /* renamed from: consumeOnOrientation-8S9VItk  reason: not valid java name */
    public final long m33579consumeOnOrientation8S9VItk(long j, Orientation orientation2) {
        C12775o.m28639i(orientation2, "orientation");
        if (orientation2 == Orientation.Vertical) {
            return Offset.m35416copydBAh8RU$default(j, 0.0f, 0.0f, 2, (Object) null);
        }
        return Offset.m35416copydBAh8RU$default(j, 0.0f, 0.0f, 1, (Object) null);
    }

    /* renamed from: consumeOnOrientation-QWom1Mo  reason: not valid java name */
    public final long m33580consumeOnOrientationQWom1Mo(long j, Orientation orientation2) {
        C12775o.m28639i(orientation2, "orientation");
        if (orientation2 == Orientation.Vertical) {
            return Velocity.m38689copyOhffZ5M$default(j, 0.0f, 0.0f, 2, (Object) null);
        }
        return Velocity.m38689copyOhffZ5M$default(j, 0.0f, 0.0f, 1, (Object) null);
    }

    public final Orientation getOrientation() {
        return this.orientation;
    }

    /* renamed from: onPostFling-RZ2iAVY  reason: not valid java name */
    public Object m33581onPostFlingRZ2iAVY(long j, long j2, C12074d<? super Velocity> dVar) {
        return Velocity.m38684boximpl(m33580consumeOnOrientationQWom1Mo(j2, this.orientation));
    }

    /* renamed from: onPostScroll-DzOQY0M  reason: not valid java name */
    public long m33582onPostScrollDzOQY0M(long j, long j2, int i) {
        if (NestedScrollSource.m37063equalsimpl0(i, NestedScrollSource.Companion.m37069getFlingWNlRxjI())) {
            return m33579consumeOnOrientation8S9VItk(j2, this.orientation);
        }
        return Offset.Companion.m35438getZeroF1C5BW0();
    }
}
