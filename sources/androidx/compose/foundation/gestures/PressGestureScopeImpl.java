package androidx.compose.foundation.gestures;

import androidx.compose.p002ui.geometry.Rect;
import androidx.compose.p002ui.unit.Density;
import androidx.compose.p002ui.unit.DpRect;
import androidx.compose.runtime.Stable;
import kotlin.jvm.internal.C12775o;
import p356hg.C12088a;
import p356hg.C12096c;

/* compiled from: TapGestureDetector.kt */
final class PressGestureScopeImpl implements PressGestureScope, Density {
    private final /* synthetic */ Density $$delegate_0;
    private boolean isCanceled;
    private boolean isReleased;
    private final C12088a mutex = C12096c.m26295a(false);

    public PressGestureScopeImpl(Density density) {
        C12775o.m28639i(density, "density");
        this.$$delegate_0 = density;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0045  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0048  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object awaitRelease(p355hf.C12074d<? super p336ef.C11921v> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof androidx.compose.foundation.gestures.PressGestureScopeImpl$awaitRelease$1
            if (r0 == 0) goto L_0x0013
            r0 = r5
            androidx.compose.foundation.gestures.PressGestureScopeImpl$awaitRelease$1 r0 = (androidx.compose.foundation.gestures.PressGestureScopeImpl$awaitRelease$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            androidx.compose.foundation.gestures.PressGestureScopeImpl$awaitRelease$1 r0 = new androidx.compose.foundation.gestures.PressGestureScopeImpl$awaitRelease$1
            r0.<init>(r4, r5)
        L_0x0018:
            java.lang.Object r5 = r0.result
            java.lang.Object r1 = p362if.C12150d.m26492c()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x0031
            if (r2 != r3) goto L_0x0029
            p336ef.C11910n.m25701b(r5)
            goto L_0x003d
        L_0x0029:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L_0x0031:
            p336ef.C11910n.m25701b(r5)
            r0.label = r3
            java.lang.Object r5 = r4.tryAwaitRelease(r0)
            if (r5 != r1) goto L_0x003d
            return r1
        L_0x003d:
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            if (r5 == 0) goto L_0x0048
            ef.v r5 = p336ef.C11921v.f18618a
            return r5
        L_0x0048:
            androidx.compose.foundation.gestures.GestureCancellationException r5 = new androidx.compose.foundation.gestures.GestureCancellationException
            java.lang.String r0 = "The press gesture was canceled."
            r5.<init>(r0)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.PressGestureScopeImpl.awaitRelease(hf.d):java.lang.Object");
    }

    public final void cancel() {
        this.isCanceled = true;
        C12088a.C12089a.m26273c(this.mutex, (Object) null, 1, (Object) null);
    }

    public float getDensity() {
        return this.$$delegate_0.getDensity();
    }

    public float getFontScale() {
        return this.$$delegate_0.getFontScale();
    }

    public final void release() {
        this.isReleased = true;
        C12088a.C12089a.m26273c(this.mutex, (Object) null, 1, (Object) null);
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0035  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object reset(p355hf.C12074d<? super p336ef.C11921v> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof androidx.compose.foundation.gestures.PressGestureScopeImpl$reset$1
            if (r0 == 0) goto L_0x0013
            r0 = r5
            androidx.compose.foundation.gestures.PressGestureScopeImpl$reset$1 r0 = (androidx.compose.foundation.gestures.PressGestureScopeImpl$reset$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            androidx.compose.foundation.gestures.PressGestureScopeImpl$reset$1 r0 = new androidx.compose.foundation.gestures.PressGestureScopeImpl$reset$1
            r0.<init>(r4, r5)
        L_0x0018:
            java.lang.Object r5 = r0.result
            java.lang.Object r1 = p362if.C12150d.m26492c()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x0035
            if (r2 != r3) goto L_0x002d
            java.lang.Object r0 = r0.L$0
            androidx.compose.foundation.gestures.PressGestureScopeImpl r0 = (androidx.compose.foundation.gestures.PressGestureScopeImpl) r0
            p336ef.C11910n.m25701b(r5)
            goto L_0x0047
        L_0x002d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L_0x0035:
            p336ef.C11910n.m25701b(r5)
            hg.a r5 = r4.mutex
            r0.L$0 = r4
            r0.label = r3
            r2 = 0
            java.lang.Object r5 = p356hg.C12088a.C12089a.m26271a(r5, r2, r0, r3, r2)
            if (r5 != r1) goto L_0x0046
            return r1
        L_0x0046:
            r0 = r4
        L_0x0047:
            r5 = 0
            r0.isReleased = r5
            r0.isCanceled = r5
            ef.v r5 = p336ef.C11921v.f18618a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.PressGestureScopeImpl.reset(hf.d):java.lang.Object");
    }

    @Stable
    /* renamed from: roundToPx--R2X_6o  reason: not valid java name */
    public int m33117roundToPxR2X_6o(long j) {
        return this.$$delegate_0.m38442roundToPxR2X_6o(j);
    }

    @Stable
    /* renamed from: roundToPx-0680j_4  reason: not valid java name */
    public int m33118roundToPx0680j_4(float f) {
        return this.$$delegate_0.m38443roundToPx0680j_4(f);
    }

    @Stable
    /* renamed from: toDp-GaN1DYA  reason: not valid java name */
    public float m33119toDpGaN1DYA(long j) {
        return this.$$delegate_0.m38444toDpGaN1DYA(j);
    }

    @Stable
    /* renamed from: toDp-u2uoSUM  reason: not valid java name */
    public float m33120toDpu2uoSUM(float f) {
        return this.$$delegate_0.m38445toDpu2uoSUM(f);
    }

    @Stable
    /* renamed from: toDpSize-k-rfVVM  reason: not valid java name */
    public long m33122toDpSizekrfVVM(long j) {
        return this.$$delegate_0.m38447toDpSizekrfVVM(j);
    }

    @Stable
    /* renamed from: toPx--R2X_6o  reason: not valid java name */
    public float m33123toPxR2X_6o(long j) {
        return this.$$delegate_0.m38448toPxR2X_6o(j);
    }

    @Stable
    /* renamed from: toPx-0680j_4  reason: not valid java name */
    public float m33124toPx0680j_4(float f) {
        return this.$$delegate_0.m38449toPx0680j_4(f);
    }

    @Stable
    public Rect toRect(DpRect dpRect) {
        C12775o.m28639i(dpRect, "<this>");
        return this.$$delegate_0.toRect(dpRect);
    }

    @Stable
    /* renamed from: toSize-XkaWNTQ  reason: not valid java name */
    public long m33125toSizeXkaWNTQ(long j) {
        return this.$$delegate_0.m38450toSizeXkaWNTQ(j);
    }

    @Stable
    /* renamed from: toSp-0xMU5do  reason: not valid java name */
    public long m33126toSp0xMU5do(float f) {
        return this.$$delegate_0.m38451toSp0xMU5do(f);
    }

    @Stable
    /* renamed from: toSp-kPz2Gy4  reason: not valid java name */
    public long m33127toSpkPz2Gy4(float f) {
        return this.$$delegate_0.m38452toSpkPz2Gy4(f);
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0036  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object tryAwaitRelease(p355hf.C12074d<? super java.lang.Boolean> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof androidx.compose.foundation.gestures.PressGestureScopeImpl$tryAwaitRelease$1
            if (r0 == 0) goto L_0x0013
            r0 = r6
            androidx.compose.foundation.gestures.PressGestureScopeImpl$tryAwaitRelease$1 r0 = (androidx.compose.foundation.gestures.PressGestureScopeImpl$tryAwaitRelease$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            androidx.compose.foundation.gestures.PressGestureScopeImpl$tryAwaitRelease$1 r0 = new androidx.compose.foundation.gestures.PressGestureScopeImpl$tryAwaitRelease$1
            r0.<init>(r5, r6)
        L_0x0018:
            java.lang.Object r6 = r0.result
            java.lang.Object r1 = p362if.C12150d.m26492c()
            int r2 = r0.label
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L_0x0036
            if (r2 != r4) goto L_0x002e
            java.lang.Object r0 = r0.L$0
            androidx.compose.foundation.gestures.PressGestureScopeImpl r0 = (androidx.compose.foundation.gestures.PressGestureScopeImpl) r0
            p336ef.C11910n.m25701b(r6)
            goto L_0x004f
        L_0x002e:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L_0x0036:
            p336ef.C11910n.m25701b(r6)
            boolean r6 = r5.isReleased
            if (r6 != 0) goto L_0x0055
            boolean r6 = r5.isCanceled
            if (r6 != 0) goto L_0x0055
            hg.a r6 = r5.mutex
            r0.L$0 = r5
            r0.label = r4
            java.lang.Object r6 = p356hg.C12088a.C12089a.m26271a(r6, r3, r0, r4, r3)
            if (r6 != r1) goto L_0x004e
            return r1
        L_0x004e:
            r0 = r5
        L_0x004f:
            hg.a r6 = r0.mutex
            p356hg.C12088a.C12089a.m26273c(r6, r3, r4, r3)
            goto L_0x0056
        L_0x0055:
            r0 = r5
        L_0x0056:
            boolean r6 = r0.isReleased
            java.lang.Boolean r6 = kotlin.coroutines.jvm.internal.C12735b.m28558a(r6)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.PressGestureScopeImpl.tryAwaitRelease(hf.d):java.lang.Object");
    }

    @Stable
    /* renamed from: toDp-u2uoSUM  reason: not valid java name */
    public float m33121toDpu2uoSUM(int i) {
        return this.$$delegate_0.m38446toDpu2uoSUM(i);
    }

    @Stable
    /* renamed from: toSp-kPz2Gy4  reason: not valid java name */
    public long m33128toSpkPz2Gy4(int i) {
        return this.$$delegate_0.m38453toSpkPz2Gy4(i);
    }
}
