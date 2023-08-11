package androidx.compose.p002ui.platform;

import android.view.accessibility.AccessibilityManager;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import kotlin.jvm.internal.C12775o;

@RequiresApi(29)
/* renamed from: androidx.compose.ui.platform.Api29Impl */
/* compiled from: AndroidAccessibilityManager.android.kt */
public final class Api29Impl {
    public static final Api29Impl INSTANCE = new Api29Impl();

    private Api29Impl() {
    }

    @DoNotInline
    public final int getRecommendedTimeoutMillis(AccessibilityManager accessibilityManager, int i, int i2) {
        C12775o.m28639i(accessibilityManager, "accessibilityManager");
        return accessibilityManager.getRecommendedTimeoutMillis(i, i2);
    }
}
