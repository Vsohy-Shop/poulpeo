package androidx.compose.material.pullrefresh;

import androidx.compose.p002ui.geometry.Offset;
import androidx.compose.p002ui.geometry.OffsetKt;
import androidx.compose.p002ui.input.nestedscroll.NestedScrollConnection;
import androidx.compose.p002ui.input.nestedscroll.NestedScrollSource;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import p355hf.C12074d;
import p404of.C13088o;

/* compiled from: PullRefresh.kt */
final class PullRefreshNestedScrollConnection implements NestedScrollConnection {
    private final boolean enabled;
    private final Function1<Float, Float> onPull;
    private final C13088o<Float, C12074d<? super Float>, Object> onRelease;

    public PullRefreshNestedScrollConnection(Function1<? super Float, Float> function1, C13088o<? super Float, ? super C12074d<? super Float>, ? extends Object> oVar, boolean z) {
        C12775o.m28639i(function1, "onPull");
        C12775o.m28639i(oVar, "onRelease");
        this.onPull = function1;
        this.onRelease = oVar;
        this.enabled = z;
    }

    /* renamed from: onPostScroll-DzOQY0M  reason: not valid java name */
    public long m34220onPostScrollDzOQY0M(long j, long j2, int i) {
        if (!this.enabled) {
            return Offset.Companion.m35438getZeroF1C5BW0();
        }
        if (!NestedScrollSource.m37063equalsimpl0(i, NestedScrollSource.Companion.m37068getDragWNlRxjI()) || Offset.m35423getYimpl(j2) <= 0.0f) {
            return Offset.Companion.m35438getZeroF1C5BW0();
        }
        return OffsetKt.Offset(0.0f, this.onPull.invoke(Float.valueOf(Offset.m35423getYimpl(j2))).floatValue());
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0033  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* renamed from: onPreFling-QWom1Mo  reason: not valid java name */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object m34221onPreFlingQWom1Mo(long r5, p355hf.C12074d<? super androidx.compose.p002ui.unit.Velocity> r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof androidx.compose.material.pullrefresh.PullRefreshNestedScrollConnection$onPreFling$1
            if (r0 == 0) goto L_0x0013
            r0 = r7
            androidx.compose.material.pullrefresh.PullRefreshNestedScrollConnection$onPreFling$1 r0 = (androidx.compose.material.pullrefresh.PullRefreshNestedScrollConnection$onPreFling$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            androidx.compose.material.pullrefresh.PullRefreshNestedScrollConnection$onPreFling$1 r0 = new androidx.compose.material.pullrefresh.PullRefreshNestedScrollConnection$onPreFling$1
            r0.<init>(r4, r7)
        L_0x0018:
            java.lang.Object r7 = r0.result
            java.lang.Object r1 = p362if.C12150d.m26492c()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x0033
            if (r2 != r3) goto L_0x002b
            float r5 = r0.F$0
            p336ef.C11910n.m25701b(r7)
            goto L_0x004d
        L_0x002b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x0033:
            p336ef.C11910n.m25701b(r7)
            of.o<java.lang.Float, hf.d<? super java.lang.Float>, java.lang.Object> r7 = r4.onRelease
            float r5 = androidx.compose.p002ui.unit.Velocity.m38694getYimpl(r5)
            java.lang.Float r5 = kotlin.coroutines.jvm.internal.C12735b.m28559b(r5)
            r6 = 0
            r0.F$0 = r6
            r0.label = r3
            java.lang.Object r7 = r7.invoke(r5, r0)
            if (r7 != r1) goto L_0x004c
            return r1
        L_0x004c:
            r5 = r6
        L_0x004d:
            java.lang.Number r7 = (java.lang.Number) r7
            float r6 = r7.floatValue()
            long r5 = androidx.compose.p002ui.unit.VelocityKt.Velocity(r5, r6)
            androidx.compose.ui.unit.Velocity r5 = androidx.compose.p002ui.unit.Velocity.m38684boximpl(r5)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.pullrefresh.PullRefreshNestedScrollConnection.m34221onPreFlingQWom1Mo(long, hf.d):java.lang.Object");
    }

    /* renamed from: onPreScroll-OzD1aCk  reason: not valid java name */
    public long m34222onPreScrollOzD1aCk(long j, int i) {
        if (!this.enabled) {
            return Offset.Companion.m35438getZeroF1C5BW0();
        }
        if (!NestedScrollSource.m37063equalsimpl0(i, NestedScrollSource.Companion.m37068getDragWNlRxjI()) || Offset.m35423getYimpl(j) >= 0.0f) {
            return Offset.Companion.m35438getZeroF1C5BW0();
        }
        return OffsetKt.Offset(0.0f, this.onPull.invoke(Float.valueOf(Offset.m35423getYimpl(j))).floatValue());
    }
}
