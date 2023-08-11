package androidx.compose.foundation.layout;

import android.graphics.Insets;
import android.os.CancellationSignal;
import android.view.View;
import android.view.WindowInsetsAnimationControlListener;
import android.view.WindowInsetsAnimationController;
import android.view.WindowInsetsController;
import android.view.animation.Interpolator;
import androidx.annotation.RequiresApi;
import androidx.compose.p002ui.geometry.Offset;
import androidx.compose.p002ui.input.nestedscroll.NestedScrollConnection;
import androidx.compose.p002ui.unit.Density;
import androidx.compose.p002ui.unit.Velocity;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.jvm.internal.C12741h;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.SourceDebugExtension;
import p355hf.C12074d;
import p466yf.C14002n;
import p466yf.C14010o;
import p466yf.C14054y1;

@RequiresApi(30)
@SourceDebugExtension({"SMAP\nWindowInsetsConnection.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WindowInsetsConnection.android.kt\nandroidx/compose/foundation/layout/WindowInsetsNestedScrollConnection\n+ 2 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n*L\n1#1,708:1\n314#2,11:709\n*S KotlinDebug\n*F\n+ 1 WindowInsetsConnection.android.kt\nandroidx/compose/foundation/layout/WindowInsetsNestedScrollConnection\n*L\n197#1:709,11\n*E\n"})
/* compiled from: WindowInsetsConnection.android.kt */
final class WindowInsetsNestedScrollConnection implements NestedScrollConnection, WindowInsetsAnimationControlListener {
    /* access modifiers changed from: private */
    public WindowInsetsAnimationController animationController;
    /* access modifiers changed from: private */
    public C14054y1 animationJob;
    private final CancellationSignal cancellationSignal = new CancellationSignal();
    /* access modifiers changed from: private */
    public C14002n<? super WindowInsetsAnimationController> continuation;
    private final Density density;
    private boolean isControllerRequested;
    private float partialConsumption;
    private final SideCalculator sideCalculator;
    private final View view;
    private final AndroidWindowInsets windowInsets;

    public WindowInsetsNestedScrollConnection(AndroidWindowInsets androidWindowInsets, View view2, SideCalculator sideCalculator2, Density density2) {
        C12775o.m28639i(androidWindowInsets, "windowInsets");
        C12775o.m28639i(view2, "view");
        C12775o.m28639i(sideCalculator2, "sideCalculator");
        C12775o.m28639i(density2, "density");
        this.windowInsets = androidWindowInsets;
        this.view = view2;
        this.sideCalculator = sideCalculator2;
        this.density = density2;
    }

    /* access modifiers changed from: private */
    public final void adjustInsets(float f) {
        WindowInsetsAnimationController windowInsetsAnimationController = this.animationController;
        if (windowInsetsAnimationController != null) {
            Insets a = windowInsetsAnimationController.getCurrentInsets();
            C12775o.m28638h(a, "it.currentInsets");
            windowInsetsAnimationController.setInsetsAndAlpha(this.sideCalculator.adjustInsets(a, C13265c.m30134c(f)), 1.0f, 0.0f);
        }
    }

    private final void animationEnded() {
        boolean z;
        WindowInsetsAnimationController windowInsetsAnimationController;
        WindowInsetsAnimationController windowInsetsAnimationController2 = this.animationController;
        if (windowInsetsAnimationController2 == null || !windowInsetsAnimationController2.isReady()) {
            z = false;
        } else {
            z = true;
        }
        if (z && (windowInsetsAnimationController = this.animationController) != null) {
            windowInsetsAnimationController.finish(this.windowInsets.isVisible());
        }
        this.animationController = null;
        C14002n<? super WindowInsetsAnimationController> nVar = this.continuation;
        if (nVar != null) {
            nVar.mo49529i(null, WindowInsetsNestedScrollConnection$animationEnded$1.INSTANCE);
        }
        this.continuation = null;
        C14054y1 y1Var = this.animationJob;
        if (y1Var != null) {
            C14054y1.C14055a.m32600a(y1Var, (CancellationException) null, 1, (Object) null);
        }
        this.animationJob = null;
        this.partialConsumption = 0.0f;
        this.isControllerRequested = false;
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0063  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00ab  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00b6  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002f  */
    /* renamed from: fling-huYlsQE  reason: not valid java name */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object m33360flinghuYlsQE(long r27, float r29, boolean r30, p355hf.C12074d<? super androidx.compose.p002ui.unit.Velocity> r31) {
        /*
            r26 = this;
            r0 = r26
            r1 = r29
            r2 = r30
            r3 = r31
            boolean r4 = r3 instanceof androidx.compose.foundation.layout.WindowInsetsNestedScrollConnection$fling$1
            if (r4 == 0) goto L_0x001b
            r4 = r3
            androidx.compose.foundation.layout.WindowInsetsNestedScrollConnection$fling$1 r4 = (androidx.compose.foundation.layout.WindowInsetsNestedScrollConnection$fling$1) r4
            int r5 = r4.label
            r6 = -2147483648(0xffffffff80000000, float:-0.0)
            r7 = r5 & r6
            if (r7 == 0) goto L_0x001b
            int r5 = r5 - r6
            r4.label = r5
            goto L_0x0020
        L_0x001b:
            androidx.compose.foundation.layout.WindowInsetsNestedScrollConnection$fling$1 r4 = new androidx.compose.foundation.layout.WindowInsetsNestedScrollConnection$fling$1
            r4.<init>(r0, r3)
        L_0x0020:
            java.lang.Object r3 = r4.result
            java.lang.Object r5 = p362if.C12150d.m26492c()
            int r6 = r4.label
            r7 = 3
            r8 = 2
            r10 = 0
            r11 = 0
            r12 = 1
            if (r6 == 0) goto L_0x0063
            if (r6 == r12) goto L_0x0057
            if (r6 == r8) goto L_0x0048
            if (r6 != r7) goto L_0x0040
            long r1 = r4.J$0
            java.lang.Object r4 = r4.L$0
            androidx.compose.foundation.layout.WindowInsetsNestedScrollConnection r4 = (androidx.compose.foundation.layout.WindowInsetsNestedScrollConnection) r4
            p336ef.C11910n.m25701b(r3)
            goto L_0x0157
        L_0x0040:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L_0x0048:
            long r1 = r4.J$0
            java.lang.Object r5 = r4.L$1
            kotlin.jvm.internal.e0 r5 = (kotlin.jvm.internal.C12757e0) r5
            java.lang.Object r4 = r4.L$0
            androidx.compose.foundation.layout.WindowInsetsNestedScrollConnection r4 = (androidx.compose.foundation.layout.WindowInsetsNestedScrollConnection) r4
            p336ef.C11910n.m25701b(r3)
            goto L_0x0193
        L_0x0057:
            float r1 = r4.F$0
            long r13 = r4.J$0
            java.lang.Object r2 = r4.L$0
            androidx.compose.foundation.layout.WindowInsetsNestedScrollConnection r2 = (androidx.compose.foundation.layout.WindowInsetsNestedScrollConnection) r2
            p336ef.C11910n.m25701b(r3)
            goto L_0x00a7
        L_0x0063:
            p336ef.C11910n.m25701b(r3)
            yf.y1 r3 = r0.animationJob
            if (r3 == 0) goto L_0x006d
            p466yf.C14054y1.C14055a.m32600a(r3, r10, r12, r10)
        L_0x006d:
            r0.animationJob = r10
            r0.partialConsumption = r11
            int r3 = (r1 > r11 ? 1 : (r1 == r11 ? 0 : -1))
            if (r3 != 0) goto L_0x0077
            r3 = r12
            goto L_0x0078
        L_0x0077:
            r3 = 0
        L_0x0078:
            if (r3 == 0) goto L_0x007c
            if (r2 == 0) goto L_0x0088
        L_0x007c:
            android.view.WindowInsetsAnimationController r3 = r0.animationController
            if (r3 != 0) goto L_0x0093
            androidx.compose.foundation.layout.AndroidWindowInsets r3 = r0.windowInsets
            boolean r3 = r3.isVisible()
            if (r3 != r2) goto L_0x0093
        L_0x0088:
            androidx.compose.ui.unit.Velocity$Companion r1 = androidx.compose.p002ui.unit.Velocity.Companion
            long r1 = r1.m38704getZero9UxMQ8M()
            androidx.compose.ui.unit.Velocity r1 = androidx.compose.p002ui.unit.Velocity.m38684boximpl(r1)
            return r1
        L_0x0093:
            r4.L$0 = r0
            r2 = r27
            r4.J$0 = r2
            r4.F$0 = r1
            r4.label = r12
            java.lang.Object r6 = r0.getAnimationController(r4)
            if (r6 != r5) goto L_0x00a4
            return r5
        L_0x00a4:
            r13 = r2
            r3 = r6
            r2 = r0
        L_0x00a7:
            android.view.WindowInsetsAnimationController r3 = (android.view.WindowInsetsAnimationController) r3
            if (r3 != 0) goto L_0x00b6
            androidx.compose.ui.unit.Velocity$Companion r1 = androidx.compose.p002ui.unit.Velocity.Companion
            long r1 = r1.m38704getZero9UxMQ8M()
            androidx.compose.ui.unit.Velocity r1 = androidx.compose.p002ui.unit.Velocity.m38684boximpl(r1)
            return r1
        L_0x00b6:
            androidx.compose.foundation.layout.SideCalculator r6 = r2.sideCalculator
            android.graphics.Insets r15 = r3.getHiddenStateInsets()
            java.lang.String r9 = "animationController.hiddenStateInsets"
            kotlin.jvm.internal.C12775o.m28638h(r15, r9)
            int r6 = r6.valueOf(r15)
            androidx.compose.foundation.layout.SideCalculator r9 = r2.sideCalculator
            android.graphics.Insets r15 = r3.getShownStateInsets()
            java.lang.String r12 = "animationController.shownStateInsets"
            kotlin.jvm.internal.C12775o.m28638h(r15, r12)
            int r9 = r9.valueOf(r15)
            android.graphics.Insets r12 = r3.getCurrentInsets()
            java.lang.String r15 = "animationController.currentInsets"
            kotlin.jvm.internal.C12775o.m28638h(r12, r15)
            androidx.compose.foundation.layout.SideCalculator r15 = r2.sideCalculator
            int r12 = r15.valueOf(r12)
            int r15 = (r1 > r11 ? 1 : (r1 == r11 ? 0 : -1))
            if (r15 > 0) goto L_0x00e9
            if (r12 == r6) goto L_0x00ef
        L_0x00e9:
            int r15 = (r1 > r11 ? 1 : (r1 == r11 ? 0 : -1))
            if (r15 < 0) goto L_0x0104
            if (r12 != r9) goto L_0x0104
        L_0x00ef:
            if (r12 != r9) goto L_0x00f3
            r9 = 1
            goto L_0x00f4
        L_0x00f3:
            r9 = 0
        L_0x00f4:
            r3.finish(r9)
            r2.animationController = r10
            androidx.compose.ui.unit.Velocity$Companion r1 = androidx.compose.p002ui.unit.Velocity.Companion
            long r1 = r1.m38704getZero9UxMQ8M()
            androidx.compose.ui.unit.Velocity r1 = androidx.compose.p002ui.unit.Velocity.m38684boximpl(r1)
            return r1
        L_0x0104:
            androidx.compose.foundation.layout.SplineBasedFloatDecayAnimationSpec r10 = new androidx.compose.foundation.layout.SplineBasedFloatDecayAnimationSpec
            androidx.compose.ui.unit.Density r15 = r2.density
            r10.<init>(r15)
            float r15 = (float) r12
            float r17 = r10.flingDistance(r1)
            float r15 = r15 + r17
            float r8 = (float) r6
            float r17 = r15 - r8
            int r11 = r9 - r6
            float r11 = (float) r11
            float r17 = r17 / r11
            r11 = 1056964608(0x3f000000, float:0.5)
            int r11 = (r17 > r11 ? 1 : (r17 == r11 ? 0 : -1))
            if (r11 <= 0) goto L_0x0123
            r24 = 1
            goto L_0x0125
        L_0x0123:
            r24 = 0
        L_0x0125:
            if (r24 == 0) goto L_0x012a
            r18 = r9
            goto L_0x012c
        L_0x012a:
            r18 = r6
        L_0x012c:
            float r11 = (float) r9
            int r11 = (r15 > r11 ? 1 : (r15 == r11 ? 0 : -1))
            if (r11 > 0) goto L_0x0163
            int r8 = (r15 > r8 ? 1 : (r15 == r8 ? 0 : -1))
            if (r8 >= 0) goto L_0x0136
            goto L_0x0163
        L_0x0136:
            androidx.compose.foundation.layout.WindowInsetsNestedScrollConnection$fling$3 r6 = new androidx.compose.foundation.layout.WindowInsetsNestedScrollConnection$fling$3
            r22 = 0
            r15 = r6
            r16 = r2
            r17 = r12
            r19 = r1
            r20 = r3
            r21 = r24
            r15.<init>(r16, r17, r18, r19, r20, r21, r22)
            r4.L$0 = r2
            r4.J$0 = r13
            r4.label = r7
            java.lang.Object r1 = p466yf.C13999m0.m32451e(r6, r4)
            if (r1 != r5) goto L_0x0155
            return r5
        L_0x0155:
            r4 = r2
            r1 = r13
        L_0x0157:
            androidx.compose.foundation.layout.SideCalculator r3 = r4.sideCalculator
            r4 = 0
            long r1 = r3.m33312consumedVelocityQWom1Mo(r1, r4)
            androidx.compose.ui.unit.Velocity r1 = androidx.compose.p002ui.unit.Velocity.m38684boximpl(r1)
            return r1
        L_0x0163:
            kotlin.jvm.internal.e0 r7 = new kotlin.jvm.internal.e0
            r7.<init>()
            androidx.compose.foundation.layout.WindowInsetsNestedScrollConnection$fling$2 r8 = new androidx.compose.foundation.layout.WindowInsetsNestedScrollConnection$fling$2
            r25 = 0
            r15 = r8
            r16 = r2
            r17 = r12
            r18 = r1
            r19 = r10
            r20 = r6
            r21 = r9
            r22 = r7
            r23 = r3
            r15.<init>(r16, r17, r18, r19, r20, r21, r22, r23, r24, r25)
            r4.L$0 = r2
            r4.L$1 = r7
            r4.J$0 = r13
            r1 = 2
            r4.label = r1
            java.lang.Object r1 = p466yf.C13999m0.m32451e(r8, r4)
            if (r1 != r5) goto L_0x0190
            return r5
        L_0x0190:
            r4 = r2
            r5 = r7
            r1 = r13
        L_0x0193:
            androidx.compose.foundation.layout.SideCalculator r3 = r4.sideCalculator
            float r4 = r5.f20408b
            long r1 = r3.m33312consumedVelocityQWom1Mo(r1, r4)
            androidx.compose.ui.unit.Velocity r1 = androidx.compose.p002ui.unit.Velocity.m38684boximpl(r1)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.layout.WindowInsetsNestedScrollConnection.m33360flinghuYlsQE(long, float, boolean, hf.d):java.lang.Object");
    }

    /* access modifiers changed from: private */
    public final Object getAnimationController(C12074d<? super WindowInsetsAnimationController> dVar) {
        Object obj = this.animationController;
        if (obj == null) {
            C14010o oVar = new C14010o(C12147c.m26491b(dVar), 1);
            oVar.mo53786B();
            this.continuation = oVar;
            requestAnimationController();
            obj = oVar.mo53797y();
            if (obj == C12150d.m26492c()) {
                C12741h.m28573c(dVar);
            }
        }
        return obj;
    }

    /* access modifiers changed from: private */
    public final void requestAnimationController() {
        if (!this.isControllerRequested) {
            this.isControllerRequested = true;
            WindowInsetsController a = this.view.getWindowInsetsController();
            if (a != null) {
                a.controlWindowInsetsAnimation(this.windowInsets.getType$foundation_layout_release(), -1, (Interpolator) null, this.cancellationSignal, this);
            }
        }
    }

    /* renamed from: scroll-8S9VItk  reason: not valid java name */
    private final long m33361scroll8S9VItk(long j, float f) {
        boolean z;
        int i;
        C14054y1 y1Var = this.animationJob;
        boolean z2 = true;
        if (y1Var != null) {
            C14054y1.C14055a.m32600a(y1Var, (CancellationException) null, 1, (Object) null);
            this.animationJob = null;
        }
        WindowInsetsAnimationController windowInsetsAnimationController = this.animationController;
        if (f == 0.0f) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            boolean isVisible = this.windowInsets.isVisible();
            int i2 = (f > 0.0f ? 1 : (f == 0.0f ? 0 : -1));
            if (i2 <= 0) {
                z2 = false;
            }
            if (!(isVisible == z2 && windowInsetsAnimationController == null)) {
                if (windowInsetsAnimationController == null) {
                    this.partialConsumption = 0.0f;
                    requestAnimationController();
                    return this.sideCalculator.m33311consumedOffsetsMKHz9U(j);
                }
                SideCalculator sideCalculator2 = this.sideCalculator;
                Insets a = windowInsetsAnimationController.getHiddenStateInsets();
                C12775o.m28638h(a, "animationController.hiddenStateInsets");
                int valueOf = sideCalculator2.valueOf(a);
                SideCalculator sideCalculator3 = this.sideCalculator;
                Insets a2 = windowInsetsAnimationController.getShownStateInsets();
                C12775o.m28638h(a2, "animationController.shownStateInsets");
                int valueOf2 = sideCalculator3.valueOf(a2);
                Insets a3 = windowInsetsAnimationController.getCurrentInsets();
                C12775o.m28638h(a3, "animationController.currentInsets");
                int valueOf3 = this.sideCalculator.valueOf(a3);
                if (i2 > 0) {
                    i = valueOf2;
                } else {
                    i = valueOf;
                }
                if (valueOf3 == i) {
                    this.partialConsumption = 0.0f;
                    return Offset.Companion.m35438getZeroF1C5BW0();
                }
                float f2 = ((float) valueOf3) + f + this.partialConsumption;
                int m = C13537l.m30886m(C13265c.m30134c(f2), valueOf, valueOf2);
                this.partialConsumption = f2 - ((float) C13265c.m30134c(f2));
                if (m != valueOf3) {
                    windowInsetsAnimationController.setInsetsAndAlpha(this.sideCalculator.adjustInsets(a3, m), 1.0f, 0.0f);
                }
                return this.sideCalculator.m33311consumedOffsetsMKHz9U(j);
            }
        }
        return Offset.Companion.m35438getZeroF1C5BW0();
    }

    public final void dispose() {
        C14002n<? super WindowInsetsAnimationController> nVar = this.continuation;
        if (nVar != null) {
            nVar.mo49529i(null, WindowInsetsNestedScrollConnection$dispose$1.INSTANCE);
        }
        C14054y1 y1Var = this.animationJob;
        if (y1Var != null) {
            C14054y1.C14055a.m32600a(y1Var, (CancellationException) null, 1, (Object) null);
        }
        WindowInsetsAnimationController windowInsetsAnimationController = this.animationController;
        if (windowInsetsAnimationController != null) {
            windowInsetsAnimationController.finish(!C12775o.m28634d(windowInsetsAnimationController.getCurrentInsets(), windowInsetsAnimationController.getHiddenStateInsets()));
        }
    }

    public final Density getDensity() {
        return this.density;
    }

    public final SideCalculator getSideCalculator() {
        return this.sideCalculator;
    }

    public final View getView() {
        return this.view;
    }

    public final AndroidWindowInsets getWindowInsets() {
        return this.windowInsets;
    }

    public void onCancelled(WindowInsetsAnimationController windowInsetsAnimationController) {
        animationEnded();
    }

    public void onFinished(WindowInsetsAnimationController windowInsetsAnimationController) {
        C12775o.m28639i(windowInsetsAnimationController, "controller");
        animationEnded();
    }

    /* renamed from: onPostFling-RZ2iAVY  reason: not valid java name */
    public Object m33362onPostFlingRZ2iAVY(long j, long j2, C12074d<? super Velocity> dVar) {
        return m33360flinghuYlsQE(j2, this.sideCalculator.showMotion(Velocity.m38693getXimpl(j2), Velocity.m38694getYimpl(j2)), true, dVar);
    }

    /* renamed from: onPostScroll-DzOQY0M  reason: not valid java name */
    public long m33363onPostScrollDzOQY0M(long j, long j2, int i) {
        return m33361scroll8S9VItk(j2, this.sideCalculator.showMotion(Offset.m35422getXimpl(j2), Offset.m35423getYimpl(j2)));
    }

    /* renamed from: onPreFling-QWom1Mo  reason: not valid java name */
    public Object m33364onPreFlingQWom1Mo(long j, C12074d<? super Velocity> dVar) {
        return m33360flinghuYlsQE(j, this.sideCalculator.hideMotion(Velocity.m38693getXimpl(j), Velocity.m38694getYimpl(j)), false, dVar);
    }

    /* renamed from: onPreScroll-OzD1aCk  reason: not valid java name */
    public long m33365onPreScrollOzD1aCk(long j, int i) {
        return m33361scroll8S9VItk(j, this.sideCalculator.hideMotion(Offset.m35422getXimpl(j), Offset.m35423getYimpl(j)));
    }

    public void onReady(WindowInsetsAnimationController windowInsetsAnimationController, int i) {
        C12775o.m28639i(windowInsetsAnimationController, "controller");
        this.animationController = windowInsetsAnimationController;
        this.isControllerRequested = false;
        C14002n<? super WindowInsetsAnimationController> nVar = this.continuation;
        if (nVar != null) {
            nVar.mo49529i(windowInsetsAnimationController, WindowInsetsNestedScrollConnection$onReady$1.INSTANCE);
        }
        this.continuation = null;
    }
}
