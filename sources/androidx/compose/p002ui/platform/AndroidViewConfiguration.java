package androidx.compose.p002ui.platform;

import android.view.ViewConfiguration;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.C12775o;

@StabilityInferred(parameters = 0)
/* renamed from: androidx.compose.ui.platform.AndroidViewConfiguration */
/* compiled from: AndroidViewConfiguration.android.kt */
public final class AndroidViewConfiguration implements ViewConfiguration {
    public static final int $stable = 8;
    private final ViewConfiguration viewConfiguration;

    public AndroidViewConfiguration(ViewConfiguration viewConfiguration2) {
        C12775o.m28639i(viewConfiguration2, "viewConfiguration");
        this.viewConfiguration = viewConfiguration2;
    }

    public long getDoubleTapMinTimeMillis() {
        return 40;
    }

    public long getDoubleTapTimeoutMillis() {
        return (long) ViewConfiguration.getDoubleTapTimeout();
    }

    public long getLongPressTimeoutMillis() {
        return (long) ViewConfiguration.getLongPressTimeout();
    }

    public float getTouchSlop() {
        return (float) this.viewConfiguration.getScaledTouchSlop();
    }
}
