package androidx.compose.p002ui.platform;

import android.content.Context;
import android.os.Build;
import android.view.accessibility.AccessibilityManager;
import androidx.core.location.LocationRequestCompat;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: androidx.compose.ui.platform.AndroidAccessibilityManager */
/* compiled from: AndroidAccessibilityManager.android.kt */
public final class AndroidAccessibilityManager implements AccessibilityManager {
    private static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    @Deprecated
    public static final int FlagContentControls = 4;
    @Deprecated
    public static final int FlagContentIcons = 1;
    @Deprecated
    public static final int FlagContentText = 2;
    private final AccessibilityManager accessibilityManager;

    /* renamed from: androidx.compose.ui.platform.AndroidAccessibilityManager$Companion */
    /* compiled from: AndroidAccessibilityManager.android.kt */
    private static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public AndroidAccessibilityManager(Context context) {
        C12775o.m28639i(context, "context");
        Object systemService = context.getSystemService("accessibility");
        C12775o.m28637g(systemService, "null cannot be cast to non-null type android.view.accessibility.AccessibilityManager");
        this.accessibilityManager = (AccessibilityManager) systemService;
    }

    public long calculateRecommendedTimeoutMillis(long j, boolean z, boolean z2, boolean z3) {
        if (j >= 2147483647L) {
            return j;
        }
        if (z2) {
            z |= true;
        }
        if (z3) {
            z |= true;
        }
        if (Build.VERSION.SDK_INT >= 29) {
            int recommendedTimeoutMillis = Api29Impl.INSTANCE.getRecommendedTimeoutMillis(this.accessibilityManager, (int) j, z ? 1 : 0);
            if (recommendedTimeoutMillis != Integer.MAX_VALUE) {
                return (long) recommendedTimeoutMillis;
            }
        } else if (!z3 || !this.accessibilityManager.isTouchExplorationEnabled()) {
            return j;
        }
        return LocationRequestCompat.PASSIVE_INTERVAL;
    }
}
