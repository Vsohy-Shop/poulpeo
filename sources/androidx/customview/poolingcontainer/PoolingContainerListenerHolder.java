package androidx.customview.poolingcontainer;

import java.util.ArrayList;
import kotlin.jvm.internal.C12775o;

/* compiled from: PoolingContainer.kt */
final class PoolingContainerListenerHolder {
    private final ArrayList<PoolingContainerListener> listeners = new ArrayList<>();

    public final void addListener(PoolingContainerListener poolingContainerListener) {
        C12775o.m28639i(poolingContainerListener, "listener");
        this.listeners.add(poolingContainerListener);
    }

    public final void onRelease() {
        for (int m = C12726w.m28526m(this.listeners); -1 < m; m--) {
            this.listeners.get(m).onRelease();
        }
    }

    public final void removeListener(PoolingContainerListener poolingContainerListener) {
        C12775o.m28639i(poolingContainerListener, "listener");
        this.listeners.remove(poolingContainerListener);
    }
}
