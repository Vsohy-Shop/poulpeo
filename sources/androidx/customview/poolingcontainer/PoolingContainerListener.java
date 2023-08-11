package androidx.customview.poolingcontainer;

import androidx.annotation.UiThread;

/* compiled from: PoolingContainer.kt */
public interface PoolingContainerListener {
    @UiThread
    void onRelease();
}
