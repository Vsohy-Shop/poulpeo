package androidx.compose.p002ui.platform;

import android.os.Looper;

/* renamed from: androidx.compose.ui.platform.AndroidUiDispatcher_androidKt */
/* compiled from: AndroidUiDispatcher.android.kt */
public final class AndroidUiDispatcher_androidKt {
    /* access modifiers changed from: private */
    public static final boolean isMainThread() {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            return true;
        }
        return false;
    }
}
