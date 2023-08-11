package androidx.compose.material.ripple;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.animation.AnimationUtils;
import androidx.compose.foundation.interaction.PressInteraction;
import androidx.compose.p002ui.geometry.Offset;
import androidx.compose.p002ui.geometry.Size;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p336ef.C11921v;
import p404of.C13074a;

/* compiled from: RippleHostView.android.kt */
public final class RippleHostView extends View {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    private static final long MinimumRippleStateChangeTime = 5;
    private static final int[] PressedState = {16842919, 16842910};
    private static final long ResetRippleDelayDuration = 50;
    private static final int[] RestingState = new int[0];
    private Boolean bounded;
    private Long lastRippleStateChangeTimeMillis;
    private C13074a<C11921v> onInvalidateRipple;
    private Runnable resetRippleRunnable;
    private UnprojectedRipple ripple;

    /* compiled from: RippleHostView.android.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public RippleHostView(Context context) {
        super(context);
        C12775o.m28639i(context, "context");
    }

    private final void createRipple(boolean z) {
        UnprojectedRipple unprojectedRipple = new UnprojectedRipple(z);
        setBackground(unprojectedRipple);
        this.ripple = unprojectedRipple;
    }

    private final void setRippleState(boolean z) {
        long j;
        int[] iArr;
        long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        Runnable runnable = this.resetRippleRunnable;
        if (runnable != null) {
            removeCallbacks(runnable);
            runnable.run();
        }
        Long l = this.lastRippleStateChangeTimeMillis;
        if (l != null) {
            j = l.longValue();
        } else {
            j = 0;
        }
        long j2 = currentAnimationTimeMillis - j;
        if (z || j2 >= MinimumRippleStateChangeTime) {
            if (z) {
                iArr = PressedState;
            } else {
                iArr = RestingState;
            }
            UnprojectedRipple unprojectedRipple = this.ripple;
            if (unprojectedRipple != null) {
                unprojectedRipple.setState(iArr);
            }
        } else {
            C0835a aVar = new C0835a(this);
            this.resetRippleRunnable = aVar;
            postDelayed(aVar, ResetRippleDelayDuration);
        }
        this.lastRippleStateChangeTimeMillis = Long.valueOf(currentAnimationTimeMillis);
    }

    /* access modifiers changed from: private */
    public static final void setRippleState$lambda$2(RippleHostView rippleHostView) {
        C12775o.m28639i(rippleHostView, "this$0");
        UnprojectedRipple unprojectedRipple = rippleHostView.ripple;
        if (unprojectedRipple != null) {
            unprojectedRipple.setState(RestingState);
        }
        rippleHostView.resetRippleRunnable = null;
    }

    /* renamed from: addRipple-KOepWvA  reason: not valid java name */
    public final void m34232addRippleKOepWvA(PressInteraction.Press press, boolean z, long j, int i, long j2, float f, C13074a<C11921v> aVar) {
        boolean z2 = z;
        C13074a<C11921v> aVar2 = aVar;
        PressInteraction.Press press2 = press;
        C12775o.m28639i(press, "interaction");
        C12775o.m28639i(aVar2, "onInvalidateRipple");
        if (this.ripple == null || !C12775o.m28634d(Boolean.valueOf(z), this.bounded)) {
            createRipple(z);
            this.bounded = Boolean.valueOf(z);
        }
        UnprojectedRipple unprojectedRipple = this.ripple;
        C12775o.m28636f(unprojectedRipple);
        this.onInvalidateRipple = aVar2;
        m34233updateRipplePropertiesbiQXAtU(j, i, j2, f);
        if (z2) {
            unprojectedRipple.setHotspot(Offset.m35422getXimpl(press.m33158getPressPositionF1C5BW0()), Offset.m35423getYimpl(press.m33158getPressPositionF1C5BW0()));
        } else {
            unprojectedRipple.setHotspot((float) unprojectedRipple.getBounds().centerX(), (float) unprojectedRipple.getBounds().centerY());
        }
        setRippleState(true);
    }

    public final void disposeRipple() {
        this.onInvalidateRipple = null;
        Runnable runnable = this.resetRippleRunnable;
        if (runnable != null) {
            removeCallbacks(runnable);
            Runnable runnable2 = this.resetRippleRunnable;
            C12775o.m28636f(runnable2);
            runnable2.run();
        } else {
            UnprojectedRipple unprojectedRipple = this.ripple;
            if (unprojectedRipple != null) {
                unprojectedRipple.setState(RestingState);
            }
        }
        UnprojectedRipple unprojectedRipple2 = this.ripple;
        if (unprojectedRipple2 != null) {
            unprojectedRipple2.setVisible(false, false);
            unscheduleDrawable(unprojectedRipple2);
        }
    }

    public void invalidateDrawable(Drawable drawable) {
        C12775o.m28639i(drawable, "who");
        C13074a<C11921v> aVar = this.onInvalidateRipple;
        if (aVar != null) {
            aVar.invoke();
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        setMeasuredDimension(0, 0);
    }

    public final void removeRipple() {
        setRippleState(false);
    }

    /* renamed from: updateRippleProperties-biQXAtU  reason: not valid java name */
    public final void m34233updateRipplePropertiesbiQXAtU(long j, int i, long j2, float f) {
        UnprojectedRipple unprojectedRipple = this.ripple;
        if (unprojectedRipple != null) {
            unprojectedRipple.trySetRadius(i);
            unprojectedRipple.m34241setColorDxMtmZc(j2, f);
            Rect rect = new Rect(0, 0, C13265c.m30134c(Size.m35491getWidthimpl(j)), C13265c.m30134c(Size.m35488getHeightimpl(j)));
            setLeft(rect.left);
            setTop(rect.top);
            setRight(rect.right);
            setBottom(rect.bottom);
            unprojectedRipple.setBounds(rect);
        }
    }

    public void refreshDrawableState() {
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
    }
}
