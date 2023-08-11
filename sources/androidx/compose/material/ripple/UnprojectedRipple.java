package androidx.compose.material.ripple;

import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import androidx.compose.p002ui.graphics.Color;
import androidx.compose.p002ui.graphics.ColorKt;
import java.lang.reflect.Method;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: RippleHostView.android.kt */
final class UnprojectedRipple extends RippleDrawable {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    private static boolean setMaxRadiusFetched;
    private static Method setMaxRadiusMethod;
    private final boolean bounded;
    private boolean projected;
    private Color rippleColor;
    private Integer rippleRadius;

    /* compiled from: RippleHostView.android.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @RequiresApi(23)
    /* compiled from: RippleHostView.android.kt */
    private static final class MRadiusHelper {
        public static final MRadiusHelper INSTANCE = new MRadiusHelper();

        private MRadiusHelper() {
        }

        @DoNotInline
        public final void setRadius(RippleDrawable rippleDrawable, int i) {
            C12775o.m28639i(rippleDrawable, "ripple");
            rippleDrawable.setRadius(i);
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public UnprojectedRipple(boolean r5) {
        /*
            r4 = this;
            r0 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            android.content.res.ColorStateList r0 = android.content.res.ColorStateList.valueOf(r0)
            r1 = 0
            if (r5 == 0) goto L_0x0010
            android.graphics.drawable.ColorDrawable r2 = new android.graphics.drawable.ColorDrawable
            r3 = -1
            r2.<init>(r3)
            goto L_0x0011
        L_0x0010:
            r2 = r1
        L_0x0011:
            r4.<init>(r0, r1, r2)
            r4.bounded = r5
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.ripple.UnprojectedRipple.<init>(boolean):void");
    }

    /* renamed from: calculateRippleColor-5vOe2sY  reason: not valid java name */
    private final long m34240calculateRippleColor5vOe2sY(long j, float f) {
        if (Build.VERSION.SDK_INT < 28) {
            f *= (float) 2;
        }
        return Color.m35670copywmQWz5c$default(j, C13537l.m30881h(f, 1.0f), 0.0f, 0.0f, 0.0f, 14, (Object) null);
    }

    public Rect getDirtyBounds() {
        if (!this.bounded) {
            this.projected = true;
        }
        Rect dirtyBounds = super.getDirtyBounds();
        C12775o.m28638h(dirtyBounds, "super.getDirtyBounds()");
        this.projected = false;
        return dirtyBounds;
    }

    public boolean isProjected() {
        return this.projected;
    }

    /* renamed from: setColor-DxMtmZc  reason: not valid java name */
    public final void m34241setColorDxMtmZc(long j, float f) {
        boolean z;
        long r3 = m34240calculateRippleColor5vOe2sY(j, f);
        Color color = this.rippleColor;
        if (color == null) {
            z = false;
        } else {
            z = Color.m35672equalsimpl0(color.m35681unboximpl(), r3);
        }
        if (!z) {
            this.rippleColor = Color.m35661boximpl(r3);
            setColor(ColorStateList.valueOf(ColorKt.m35725toArgb8_81llA(r3)));
        }
    }

    public final void trySetRadius(int i) {
        Integer num = this.rippleRadius;
        if (num == null || num.intValue() != i) {
            this.rippleRadius = Integer.valueOf(i);
            MRadiusHelper.INSTANCE.setRadius(this, i);
        }
    }
}
