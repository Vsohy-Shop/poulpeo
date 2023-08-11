package androidx.compose.foundation;

import android.os.Build;
import androidx.compose.p002ui.unit.C1232Dp;
import androidx.compose.p002ui.unit.DpSize;
import androidx.compose.runtime.Stable;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.DefaultConstructorMarker;

@ExperimentalFoundationApi
@Stable
/* compiled from: Magnifier.kt */
public final class MagnifierStyle {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */
    public static final MagnifierStyle Default;
    /* access modifiers changed from: private */
    public static final MagnifierStyle TextDefault;
    private final boolean clippingEnabled;
    private final float cornerRadius;
    private final float elevation;
    private final boolean fishEyeEnabled;
    private final long size;
    private final boolean useTextDefault;

    static {
        MagnifierStyle magnifierStyle = new MagnifierStyle(0, 0.0f, 0.0f, false, false, 31, (DefaultConstructorMarker) null);
        Default = magnifierStyle;
        TextDefault = new MagnifierStyle(true, magnifierStyle.size, magnifierStyle.cornerRadius, magnifierStyle.elevation, magnifierStyle.clippingEnabled, magnifierStyle.fishEyeEnabled, (DefaultConstructorMarker) null);
    }

    @ExperimentalFoundationApi
    public /* synthetic */ MagnifierStyle(long j, float f, float f2, boolean z, boolean z2, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, f, f2, z, z2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MagnifierStyle)) {
            return false;
        }
        MagnifierStyle magnifierStyle = (MagnifierStyle) obj;
        if (this.useTextDefault == magnifierStyle.useTextDefault && DpSize.m38563equalsimpl0(this.size, magnifierStyle.size) && C1232Dp.m38473equalsimpl0(this.cornerRadius, magnifierStyle.cornerRadius) && C1232Dp.m38473equalsimpl0(this.elevation, magnifierStyle.elevation) && this.clippingEnabled == magnifierStyle.clippingEnabled && this.fishEyeEnabled == magnifierStyle.fishEyeEnabled) {
            return true;
        }
        return false;
    }

    public final boolean getClippingEnabled$foundation_release() {
        return this.clippingEnabled;
    }

    /* renamed from: getCornerRadius-D9Ej5fM$foundation_release  reason: not valid java name */
    public final float m33006getCornerRadiusD9Ej5fM$foundation_release() {
        return this.cornerRadius;
    }

    /* renamed from: getElevation-D9Ej5fM$foundation_release  reason: not valid java name */
    public final float m33007getElevationD9Ej5fM$foundation_release() {
        return this.elevation;
    }

    public final boolean getFishEyeEnabled$foundation_release() {
        return this.fishEyeEnabled;
    }

    /* renamed from: getSize-MYxV2XQ$foundation_release  reason: not valid java name */
    public final long m33008getSizeMYxV2XQ$foundation_release() {
        return this.size;
    }

    public final boolean getUseTextDefault$foundation_release() {
        return this.useTextDefault;
    }

    public int hashCode() {
        return (((((((((Boolean.hashCode(this.useTextDefault) * 31) + DpSize.m38568hashCodeimpl(this.size)) * 31) + C1232Dp.m38474hashCodeimpl(this.cornerRadius)) * 31) + C1232Dp.m38474hashCodeimpl(this.elevation)) * 31) + Boolean.hashCode(this.clippingEnabled)) * 31) + Boolean.hashCode(this.fishEyeEnabled);
    }

    public final boolean isSupported() {
        return Companion.isStyleSupported$foundation_release$default(Companion, this, 0, 2, (Object) null);
    }

    public String toString() {
        if (this.useTextDefault) {
            return "MagnifierStyle.TextDefault";
        }
        return "MagnifierStyle(size=" + DpSize.m38573toStringimpl(this.size) + ", cornerRadius=" + C1232Dp.m38479toStringimpl(this.cornerRadius) + ", elevation=" + C1232Dp.m38479toStringimpl(this.elevation) + ", clippingEnabled=" + this.clippingEnabled + ", fishEyeEnabled=" + this.fishEyeEnabled + ')';
    }

    public /* synthetic */ MagnifierStyle(boolean z, long j, float f, float f2, boolean z2, boolean z3, DefaultConstructorMarker defaultConstructorMarker) {
        this(z, j, f, f2, z2, z3);
    }

    private MagnifierStyle(boolean z, long j, float f, float f2, boolean z2, boolean z3) {
        this.useTextDefault = z;
        this.size = j;
        this.cornerRadius = f;
        this.elevation = f2;
        this.clippingEnabled = z2;
        this.fishEyeEnabled = z3;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ MagnifierStyle(long r8, float r10, float r11, boolean r12, boolean r13, int r14, kotlin.jvm.internal.DefaultConstructorMarker r15) {
        /*
            r7 = this;
            r0 = r14 & 1
            if (r0 == 0) goto L_0x000b
            androidx.compose.ui.unit.DpSize$Companion r0 = androidx.compose.p002ui.unit.DpSize.Companion
            long r0 = r0.m38575getUnspecifiedMYxV2XQ()
            goto L_0x000c
        L_0x000b:
            r0 = r8
        L_0x000c:
            r2 = r14 & 2
            if (r2 == 0) goto L_0x0017
            androidx.compose.ui.unit.Dp$Companion r2 = androidx.compose.p002ui.unit.C1232Dp.Companion
            float r2 = r2.m38488getUnspecifiedD9Ej5fM()
            goto L_0x0018
        L_0x0017:
            r2 = r10
        L_0x0018:
            r3 = r14 & 4
            if (r3 == 0) goto L_0x0023
            androidx.compose.ui.unit.Dp$Companion r3 = androidx.compose.p002ui.unit.C1232Dp.Companion
            float r3 = r3.m38488getUnspecifiedD9Ej5fM()
            goto L_0x0024
        L_0x0023:
            r3 = r11
        L_0x0024:
            r4 = r14 & 8
            if (r4 == 0) goto L_0x002a
            r4 = 1
            goto L_0x002b
        L_0x002a:
            r4 = r12
        L_0x002b:
            r5 = r14 & 16
            if (r5 == 0) goto L_0x0031
            r5 = 0
            goto L_0x0032
        L_0x0031:
            r5 = r13
        L_0x0032:
            r6 = 0
            r8 = r7
            r9 = r0
            r11 = r2
            r12 = r3
            r13 = r4
            r14 = r5
            r15 = r6
            r8.<init>((long) r9, (float) r11, (float) r12, (boolean) r13, (boolean) r14, (kotlin.jvm.internal.DefaultConstructorMarker) r15)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.MagnifierStyle.<init>(long, float, float, boolean, boolean, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    private MagnifierStyle(long j, float f, float f2, boolean z, boolean z2) {
        this(false, j, f, f2, z, z2, (DefaultConstructorMarker) null);
    }

    /* compiled from: Magnifier.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ boolean isStyleSupported$foundation_release$default(Companion companion, MagnifierStyle magnifierStyle, int i, int i2, Object obj) {
            if ((i2 & 2) != 0) {
                i = Build.VERSION.SDK_INT;
            }
            return companion.isStyleSupported$foundation_release(magnifierStyle, i);
        }

        public final MagnifierStyle getDefault() {
            return MagnifierStyle.Default;
        }

        public final MagnifierStyle getTextDefault() {
            return MagnifierStyle.TextDefault;
        }

        public final boolean isStyleSupported$foundation_release(MagnifierStyle magnifierStyle, int i) {
            C12775o.m28639i(magnifierStyle, "style");
            if (!MagnifierKt.isPlatformMagnifierSupported(i) || magnifierStyle.getFishEyeEnabled$foundation_release()) {
                return false;
            }
            if (magnifierStyle.getUseTextDefault$foundation_release() || C12775o.m28634d(magnifierStyle, getDefault()) || i >= 29) {
                return true;
            }
            return false;
        }

        @ExperimentalFoundationApi
        public static /* synthetic */ void getDefault$annotations() {
        }

        @ExperimentalFoundationApi
        public static /* synthetic */ void getTextDefault$annotations() {
        }
    }
}
