package androidx.compose.p002ui.platform;

import android.view.accessibility.AccessibilityNodeInfo;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import java.util.List;
import kotlin.jvm.internal.C12775o;

@RequiresApi(26)
/* renamed from: androidx.compose.ui.platform.AccessibilityNodeInfoVerificationHelperMethods */
/* compiled from: AndroidComposeViewAccessibilityDelegateCompat.android.kt */
public final class AccessibilityNodeInfoVerificationHelperMethods {
    public static final AccessibilityNodeInfoVerificationHelperMethods INSTANCE = new AccessibilityNodeInfoVerificationHelperMethods();

    private AccessibilityNodeInfoVerificationHelperMethods() {
    }

    @RequiresApi(26)
    @DoNotInline
    public final void setAvailableExtraData(AccessibilityNodeInfo accessibilityNodeInfo, List<String> list) {
        C12775o.m28639i(accessibilityNodeInfo, "node");
        C12775o.m28639i(list, "data");
        accessibilityNodeInfo.setAvailableExtraData(list);
    }
}
