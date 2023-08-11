package androidx.compose.p002ui.window;

import androidx.compose.p002ui.ExperimentalComposeUiApi;
import androidx.compose.runtime.Immutable;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Immutable
/* renamed from: androidx.compose.ui.window.PopupProperties */
/* compiled from: AndroidPopup.android.kt */
public final class PopupProperties {
    public static final int $stable = 0;
    private final boolean clippingEnabled;
    private final boolean dismissOnBackPress;
    private final boolean dismissOnClickOutside;
    private final boolean excludeFromSystemGesture;
    private final boolean focusable;
    private final SecureFlagPolicy securePolicy;
    private final boolean usePlatformDefaultWidth;

    @ExperimentalComposeUiApi
    public PopupProperties() {
        this(false, false, false, (SecureFlagPolicy) null, false, false, false, 127, (DefaultConstructorMarker) null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PopupProperties)) {
            return false;
        }
        PopupProperties popupProperties = (PopupProperties) obj;
        if (this.focusable == popupProperties.focusable && this.dismissOnBackPress == popupProperties.dismissOnBackPress && this.dismissOnClickOutside == popupProperties.dismissOnClickOutside && this.securePolicy == popupProperties.securePolicy && this.excludeFromSystemGesture == popupProperties.excludeFromSystemGesture && this.clippingEnabled == popupProperties.clippingEnabled && this.usePlatformDefaultWidth == popupProperties.usePlatformDefaultWidth) {
            return true;
        }
        return false;
    }

    public final boolean getClippingEnabled() {
        return this.clippingEnabled;
    }

    public final boolean getDismissOnBackPress() {
        return this.dismissOnBackPress;
    }

    public final boolean getDismissOnClickOutside() {
        return this.dismissOnClickOutside;
    }

    public final boolean getExcludeFromSystemGesture() {
        return this.excludeFromSystemGesture;
    }

    public final boolean getFocusable() {
        return this.focusable;
    }

    public final SecureFlagPolicy getSecurePolicy() {
        return this.securePolicy;
    }

    public final boolean getUsePlatformDefaultWidth() {
        return this.usePlatformDefaultWidth;
    }

    public int hashCode() {
        return (((((((((((((Boolean.hashCode(this.dismissOnBackPress) * 31) + Boolean.hashCode(this.focusable)) * 31) + Boolean.hashCode(this.dismissOnBackPress)) * 31) + Boolean.hashCode(this.dismissOnClickOutside)) * 31) + this.securePolicy.hashCode()) * 31) + Boolean.hashCode(this.excludeFromSystemGesture)) * 31) + Boolean.hashCode(this.clippingEnabled)) * 31) + Boolean.hashCode(this.usePlatformDefaultWidth);
    }

    @ExperimentalComposeUiApi
    public PopupProperties(boolean z, boolean z2, boolean z3, SecureFlagPolicy secureFlagPolicy, boolean z4, boolean z5, boolean z6) {
        C12775o.m28639i(secureFlagPolicy, "securePolicy");
        this.focusable = z;
        this.dismissOnBackPress = z2;
        this.dismissOnClickOutside = z3;
        this.securePolicy = secureFlagPolicy;
        this.excludeFromSystemGesture = z4;
        this.clippingEnabled = z5;
        this.usePlatformDefaultWidth = z6;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ PopupProperties(boolean r7, boolean r8, boolean r9, androidx.compose.p002ui.window.SecureFlagPolicy r10, boolean r11, boolean r12, boolean r13, int r14, kotlin.jvm.internal.DefaultConstructorMarker r15) {
        /*
            r6 = this;
            r15 = r14 & 1
            r0 = 0
            if (r15 == 0) goto L_0x0007
            r15 = r0
            goto L_0x0008
        L_0x0007:
            r15 = r7
        L_0x0008:
            r7 = r14 & 2
            r1 = 1
            if (r7 == 0) goto L_0x000f
            r2 = r1
            goto L_0x0010
        L_0x000f:
            r2 = r8
        L_0x0010:
            r7 = r14 & 4
            if (r7 == 0) goto L_0x0016
            r3 = r1
            goto L_0x0017
        L_0x0016:
            r3 = r9
        L_0x0017:
            r7 = r14 & 8
            if (r7 == 0) goto L_0x001d
            androidx.compose.ui.window.SecureFlagPolicy r10 = androidx.compose.p002ui.window.SecureFlagPolicy.Inherit
        L_0x001d:
            r4 = r10
            r7 = r14 & 16
            if (r7 == 0) goto L_0x0024
            r5 = r1
            goto L_0x0025
        L_0x0024:
            r5 = r11
        L_0x0025:
            r7 = r14 & 32
            if (r7 == 0) goto L_0x002a
            goto L_0x002b
        L_0x002a:
            r1 = r12
        L_0x002b:
            r7 = r14 & 64
            if (r7 == 0) goto L_0x0031
            r14 = r0
            goto L_0x0032
        L_0x0031:
            r14 = r13
        L_0x0032:
            r7 = r6
            r8 = r15
            r9 = r2
            r10 = r3
            r11 = r4
            r12 = r5
            r13 = r1
            r7.<init>(r8, r9, r10, r11, r12, r13, r14)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p002ui.window.PopupProperties.<init>(boolean, boolean, boolean, androidx.compose.ui.window.SecureFlagPolicy, boolean, boolean, boolean, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ PopupProperties(boolean r5, boolean r6, boolean r7, androidx.compose.p002ui.window.SecureFlagPolicy r8, boolean r9, boolean r10, int r11, kotlin.jvm.internal.DefaultConstructorMarker r12) {
        /*
            r4 = this;
            r12 = r11 & 1
            if (r12 == 0) goto L_0x0005
            r5 = 0
        L_0x0005:
            r12 = r11 & 2
            r0 = 1
            if (r12 == 0) goto L_0x000c
            r12 = r0
            goto L_0x000d
        L_0x000c:
            r12 = r6
        L_0x000d:
            r6 = r11 & 4
            if (r6 == 0) goto L_0x0013
            r1 = r0
            goto L_0x0014
        L_0x0013:
            r1 = r7
        L_0x0014:
            r6 = r11 & 8
            if (r6 == 0) goto L_0x001a
            androidx.compose.ui.window.SecureFlagPolicy r8 = androidx.compose.p002ui.window.SecureFlagPolicy.Inherit
        L_0x001a:
            r2 = r8
            r6 = r11 & 16
            if (r6 == 0) goto L_0x0021
            r3 = r0
            goto L_0x0022
        L_0x0021:
            r3 = r9
        L_0x0022:
            r6 = r11 & 32
            if (r6 == 0) goto L_0x0027
            goto L_0x0028
        L_0x0027:
            r0 = r10
        L_0x0028:
            r6 = r4
            r7 = r5
            r8 = r12
            r9 = r1
            r10 = r2
            r11 = r3
            r12 = r0
            r6.<init>(r7, r8, r9, r10, r11, r12)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p002ui.window.PopupProperties.<init>(boolean, boolean, boolean, androidx.compose.ui.window.SecureFlagPolicy, boolean, boolean, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public PopupProperties(boolean z, boolean z2, boolean z3, SecureFlagPolicy secureFlagPolicy, boolean z4, boolean z5) {
        this(z, z2, z3, secureFlagPolicy, z4, z5, false);
        C12775o.m28639i(secureFlagPolicy, "securePolicy");
    }
}
