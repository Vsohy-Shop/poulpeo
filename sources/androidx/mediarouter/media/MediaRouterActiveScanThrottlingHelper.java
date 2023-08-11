package androidx.mediarouter.media;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;

class MediaRouterActiveScanThrottlingHelper {
    static final long MAX_ACTIVE_SCAN_DURATION_MS = 30000;
    private boolean mActiveScan;
    private long mCurrentTime;
    private final Handler mHandler = new Handler(Looper.getMainLooper());
    private long mSuppressActiveScanTimeout;
    private final Runnable mUpdateDiscoveryRequestRunnable;

    MediaRouterActiveScanThrottlingHelper(Runnable runnable) {
        this.mUpdateDiscoveryRequestRunnable = runnable;
    }

    public boolean finalizeActiveScanAndScheduleSuppressActiveScanRunnable() {
        if (this.mActiveScan) {
            long j = this.mSuppressActiveScanTimeout;
            if (j > 0) {
                this.mHandler.postDelayed(this.mUpdateDiscoveryRequestRunnable, j);
            }
        }
        return this.mActiveScan;
    }

    public void requestActiveScan(boolean z, long j) {
        if (z) {
            long j2 = this.mCurrentTime;
            if (j2 - j < MAX_ACTIVE_SCAN_DURATION_MS) {
                this.mSuppressActiveScanTimeout = Math.max(this.mSuppressActiveScanTimeout, (j + MAX_ACTIVE_SCAN_DURATION_MS) - j2);
                this.mActiveScan = true;
            }
        }
    }

    public void reset() {
        this.mSuppressActiveScanTimeout = 0;
        this.mActiveScan = false;
        this.mCurrentTime = SystemClock.elapsedRealtime();
        this.mHandler.removeCallbacks(this.mUpdateDiscoveryRequestRunnable);
    }
}
