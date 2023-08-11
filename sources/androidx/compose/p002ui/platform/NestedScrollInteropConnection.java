package androidx.compose.p002ui.platform;

import android.view.View;
import androidx.compose.p002ui.geometry.Offset;
import androidx.compose.p002ui.input.nestedscroll.NestedScrollConnection;
import androidx.compose.p002ui.unit.Velocity;
import androidx.core.view.NestedScrollingChildHelper;
import androidx.core.view.ViewCompat;
import kotlin.jvm.internal.C12775o;
import p355hf.C12074d;

/* renamed from: androidx.compose.ui.platform.NestedScrollInteropConnection */
/* compiled from: NestedScrollInteropConnection.kt */
public final class NestedScrollInteropConnection implements NestedScrollConnection {
    private final int[] consumedScrollCache = new int[2];
    private final NestedScrollingChildHelper nestedScrollChildHelper;
    private final View view;

    public NestedScrollInteropConnection(View view2) {
        C12775o.m28639i(view2, "view");
        this.view = view2;
        NestedScrollingChildHelper nestedScrollingChildHelper = new NestedScrollingChildHelper(view2);
        nestedScrollingChildHelper.setNestedScrollingEnabled(true);
        this.nestedScrollChildHelper = nestedScrollingChildHelper;
        ViewCompat.setNestedScrollingEnabled(view2, true);
    }

    private final void interruptOngoingScrolls() {
        if (this.nestedScrollChildHelper.hasNestedScrollingParent(0)) {
            this.nestedScrollChildHelper.stopNestedScroll(0);
        }
        if (this.nestedScrollChildHelper.hasNestedScrollingParent(1)) {
            this.nestedScrollChildHelper.stopNestedScroll(1);
        }
    }

    /* renamed from: onPostFling-RZ2iAVY  reason: not valid java name */
    public Object m37757onPostFlingRZ2iAVY(long j, long j2, C12074d<? super Velocity> dVar) {
        if (!this.nestedScrollChildHelper.dispatchNestedFling(NestedScrollInteropConnectionKt.toViewVelocity(Velocity.m38693getXimpl(j2)), NestedScrollInteropConnectionKt.toViewVelocity(Velocity.m38694getYimpl(j2)), true)) {
            j2 = Velocity.Companion.m38704getZero9UxMQ8M();
        }
        interruptOngoingScrolls();
        return Velocity.m38684boximpl(j2);
    }

    /* renamed from: onPostScroll-DzOQY0M  reason: not valid java name */
    public long m37758onPostScrollDzOQY0M(long j, long j2, int i) {
        if (!this.nestedScrollChildHelper.startNestedScroll(NestedScrollInteropConnectionKt.m37764getScrollAxesk4lQ0M(j2), NestedScrollInteropConnectionKt.m37766toViewTypeGyEprt8(i))) {
            return Offset.Companion.m35438getZeroF1C5BW0();
        }
        C12708o.m28354u(this.consumedScrollCache, 0, 0, 0, 6, (Object) null);
        this.nestedScrollChildHelper.dispatchNestedScroll(NestedScrollInteropConnectionKt.composeToViewOffset(Offset.m35422getXimpl(j)), NestedScrollInteropConnectionKt.composeToViewOffset(Offset.m35423getYimpl(j)), NestedScrollInteropConnectionKt.composeToViewOffset(Offset.m35422getXimpl(j2)), NestedScrollInteropConnectionKt.composeToViewOffset(Offset.m35423getYimpl(j2)), (int[]) null, NestedScrollInteropConnectionKt.m37766toViewTypeGyEprt8(i), this.consumedScrollCache);
        return NestedScrollInteropConnectionKt.m37765toOffsetUv8p0NA(this.consumedScrollCache, j2);
    }

    /* renamed from: onPreFling-QWom1Mo  reason: not valid java name */
    public Object m37759onPreFlingQWom1Mo(long j, C12074d<? super Velocity> dVar) {
        if (!this.nestedScrollChildHelper.dispatchNestedPreFling(NestedScrollInteropConnectionKt.toViewVelocity(Velocity.m38693getXimpl(j)), NestedScrollInteropConnectionKt.toViewVelocity(Velocity.m38694getYimpl(j)))) {
            j = Velocity.Companion.m38704getZero9UxMQ8M();
        }
        interruptOngoingScrolls();
        return Velocity.m38684boximpl(j);
    }

    /* renamed from: onPreScroll-OzD1aCk  reason: not valid java name */
    public long m37760onPreScrollOzD1aCk(long j, int i) {
        if (!this.nestedScrollChildHelper.startNestedScroll(NestedScrollInteropConnectionKt.m37764getScrollAxesk4lQ0M(j), NestedScrollInteropConnectionKt.m37766toViewTypeGyEprt8(i))) {
            return Offset.Companion.m35438getZeroF1C5BW0();
        }
        C12708o.m28354u(this.consumedScrollCache, 0, 0, 0, 6, (Object) null);
        this.nestedScrollChildHelper.dispatchNestedPreScroll(NestedScrollInteropConnectionKt.composeToViewOffset(Offset.m35422getXimpl(j)), NestedScrollInteropConnectionKt.composeToViewOffset(Offset.m35423getYimpl(j)), this.consumedScrollCache, (int[]) null, NestedScrollInteropConnectionKt.m37766toViewTypeGyEprt8(i));
        return NestedScrollInteropConnectionKt.m37765toOffsetUv8p0NA(this.consumedScrollCache, j);
    }
}
