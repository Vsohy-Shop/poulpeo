package androidx.compose.p002ui.input.nestedscroll;

import androidx.compose.p002ui.geometry.Offset;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.C12775o;
import p404of.C13074a;
import p466yf.C13995l0;

@StabilityInferred(parameters = 0)
/* renamed from: androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher */
/* compiled from: NestedScrollModifier.kt */
public final class NestedScrollDispatcher {
    public static final int $stable = 8;
    private C13074a<? extends C13995l0> calculateNestedScrollScope = new NestedScrollDispatcher$calculateNestedScrollScope$1(this);
    private C13995l0 originNestedScrollScope;
    private NestedScrollConnection parent;

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0032  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* renamed from: dispatchPostFling-RZ2iAVY  reason: not valid java name */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object m37052dispatchPostFlingRZ2iAVY(long r8, long r10, p355hf.C12074d<? super androidx.compose.p002ui.unit.Velocity> r12) {
        /*
            r7 = this;
            boolean r0 = r12 instanceof androidx.compose.p002ui.input.nestedscroll.NestedScrollDispatcher$dispatchPostFling$1
            if (r0 == 0) goto L_0x0013
            r0 = r12
            androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher$dispatchPostFling$1 r0 = (androidx.compose.p002ui.input.nestedscroll.NestedScrollDispatcher$dispatchPostFling$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher$dispatchPostFling$1 r0 = new androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher$dispatchPostFling$1
            r0.<init>(r7, r12)
        L_0x0018:
            r6 = r0
            java.lang.Object r12 = r6.result
            java.lang.Object r0 = p362if.C12150d.m26492c()
            int r1 = r6.label
            r2 = 1
            if (r1 == 0) goto L_0x0032
            if (r1 != r2) goto L_0x002a
            p336ef.C11910n.m25701b(r12)
            goto L_0x0044
        L_0x002a:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L_0x0032:
            p336ef.C11910n.m25701b(r12)
            androidx.compose.ui.input.nestedscroll.NestedScrollConnection r1 = r7.parent
            if (r1 == 0) goto L_0x004b
            r6.label = r2
            r2 = r8
            r4 = r10
            java.lang.Object r12 = r1.m37044onPostFlingRZ2iAVY(r2, r4, r6)
            if (r12 != r0) goto L_0x0044
            return r0
        L_0x0044:
            androidx.compose.ui.unit.Velocity r12 = (androidx.compose.p002ui.unit.Velocity) r12
            long r8 = r12.m38702unboximpl()
            goto L_0x0051
        L_0x004b:
            androidx.compose.ui.unit.Velocity$Companion r8 = androidx.compose.p002ui.unit.Velocity.Companion
            long r8 = r8.m38704getZero9UxMQ8M()
        L_0x0051:
            androidx.compose.ui.unit.Velocity r8 = androidx.compose.p002ui.unit.Velocity.m38684boximpl(r8)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p002ui.input.nestedscroll.NestedScrollDispatcher.m37052dispatchPostFlingRZ2iAVY(long, long, hf.d):java.lang.Object");
    }

    /* renamed from: dispatchPostScroll-DzOQY0M  reason: not valid java name */
    public final long m37053dispatchPostScrollDzOQY0M(long j, long j2, int i) {
        NestedScrollConnection nestedScrollConnection = this.parent;
        if (nestedScrollConnection != null) {
            return nestedScrollConnection.m37045onPostScrollDzOQY0M(j, j2, i);
        }
        return Offset.Companion.m35438getZeroF1C5BW0();
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* renamed from: dispatchPreFling-QWom1Mo  reason: not valid java name */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object m37054dispatchPreFlingQWom1Mo(long r5, p355hf.C12074d<? super androidx.compose.p002ui.unit.Velocity> r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof androidx.compose.p002ui.input.nestedscroll.NestedScrollDispatcher$dispatchPreFling$1
            if (r0 == 0) goto L_0x0013
            r0 = r7
            androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher$dispatchPreFling$1 r0 = (androidx.compose.p002ui.input.nestedscroll.NestedScrollDispatcher$dispatchPreFling$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher$dispatchPreFling$1 r0 = new androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher$dispatchPreFling$1
            r0.<init>(r4, r7)
        L_0x0018:
            java.lang.Object r7 = r0.result
            java.lang.Object r1 = p362if.C12150d.m26492c()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x0031
            if (r2 != r3) goto L_0x0029
            p336ef.C11910n.m25701b(r7)
            goto L_0x0041
        L_0x0029:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x0031:
            p336ef.C11910n.m25701b(r7)
            androidx.compose.ui.input.nestedscroll.NestedScrollConnection r7 = r4.parent
            if (r7 == 0) goto L_0x0048
            r0.label = r3
            java.lang.Object r7 = r7.m37046onPreFlingQWom1Mo(r5, r0)
            if (r7 != r1) goto L_0x0041
            return r1
        L_0x0041:
            androidx.compose.ui.unit.Velocity r7 = (androidx.compose.p002ui.unit.Velocity) r7
            long r5 = r7.m38702unboximpl()
            goto L_0x004e
        L_0x0048:
            androidx.compose.ui.unit.Velocity$Companion r5 = androidx.compose.p002ui.unit.Velocity.Companion
            long r5 = r5.m38704getZero9UxMQ8M()
        L_0x004e:
            androidx.compose.ui.unit.Velocity r5 = androidx.compose.p002ui.unit.Velocity.m38684boximpl(r5)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p002ui.input.nestedscroll.NestedScrollDispatcher.m37054dispatchPreFlingQWom1Mo(long, hf.d):java.lang.Object");
    }

    /* renamed from: dispatchPreScroll-OzD1aCk  reason: not valid java name */
    public final long m37055dispatchPreScrollOzD1aCk(long j, int i) {
        NestedScrollConnection nestedScrollConnection = this.parent;
        if (nestedScrollConnection != null) {
            return nestedScrollConnection.m37047onPreScrollOzD1aCk(j, i);
        }
        return Offset.Companion.m35438getZeroF1C5BW0();
    }

    public final C13074a<C13995l0> getCalculateNestedScrollScope$ui_release() {
        return this.calculateNestedScrollScope;
    }

    public final C13995l0 getCoroutineScope() {
        C13995l0 l0Var = (C13995l0) this.calculateNestedScrollScope.invoke();
        if (l0Var != null) {
            return l0Var;
        }
        throw new IllegalStateException("in order to access nested coroutine scope you need to attach dispatcher to the `Modifier.nestedScroll` first.");
    }

    public final C13995l0 getOriginNestedScrollScope$ui_release() {
        return this.originNestedScrollScope;
    }

    public final NestedScrollConnection getParent$ui_release() {
        return this.parent;
    }

    public final void setCalculateNestedScrollScope$ui_release(C13074a<? extends C13995l0> aVar) {
        C12775o.m28639i(aVar, "<set-?>");
        this.calculateNestedScrollScope = aVar;
    }

    public final void setOriginNestedScrollScope$ui_release(C13995l0 l0Var) {
        this.originNestedScrollScope = l0Var;
    }

    public final void setParent$ui_release(NestedScrollConnection nestedScrollConnection) {
        this.parent = nestedScrollConnection;
    }
}
