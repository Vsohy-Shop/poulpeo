package androidx.customview.poolingcontainer;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.core.view.ViewGroupKt;
import androidx.core.view.ViewKt;
import kotlin.jvm.internal.C12775o;

/* compiled from: PoolingContainer.kt */
public final class PoolingContainer {
    private static final int IsPoolingContainerTag = C1929R.C1930id.is_pooling_container_tag;
    private static final int PoolingContainerListenerHolderTag = C1929R.C1930id.pooling_container_listener_holder_tag;

    public static final void addPoolingContainerListener(View view, PoolingContainerListener poolingContainerListener) {
        C12775o.m28639i(view, "<this>");
        C12775o.m28639i(poolingContainerListener, "listener");
        getPoolingContainerListenerHolder(view).addListener(poolingContainerListener);
    }

    public static final void callPoolingContainerOnRelease(View view) {
        C12775o.m28639i(view, "<this>");
        for (View poolingContainerListenerHolder : ViewKt.getAllViews(view)) {
            getPoolingContainerListenerHolder(poolingContainerListenerHolder).onRelease();
        }
    }

    public static final void callPoolingContainerOnReleaseForChildren(ViewGroup viewGroup) {
        C12775o.m28639i(viewGroup, "<this>");
        for (View poolingContainerListenerHolder : ViewGroupKt.getChildren(viewGroup)) {
            getPoolingContainerListenerHolder(poolingContainerListenerHolder).onRelease();
        }
    }

    private static final PoolingContainerListenerHolder getPoolingContainerListenerHolder(View view) {
        int i = PoolingContainerListenerHolderTag;
        PoolingContainerListenerHolder poolingContainerListenerHolder = (PoolingContainerListenerHolder) view.getTag(i);
        if (poolingContainerListenerHolder != null) {
            return poolingContainerListenerHolder;
        }
        PoolingContainerListenerHolder poolingContainerListenerHolder2 = new PoolingContainerListenerHolder();
        view.setTag(i, poolingContainerListenerHolder2);
        return poolingContainerListenerHolder2;
    }

    public static final boolean isPoolingContainer(View view) {
        Boolean bool;
        C12775o.m28639i(view, "<this>");
        Object tag = view.getTag(IsPoolingContainerTag);
        if (tag instanceof Boolean) {
            bool = (Boolean) tag;
        } else {
            bool = null;
        }
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    public static final boolean isWithinPoolingContainer(View view) {
        C12775o.m28639i(view, "<this>");
        for (ViewParent next : ViewKt.getAncestors(view)) {
            if ((next instanceof View) && isPoolingContainer((View) next)) {
                return true;
            }
        }
        return false;
    }

    public static final void removePoolingContainerListener(View view, PoolingContainerListener poolingContainerListener) {
        C12775o.m28639i(view, "<this>");
        C12775o.m28639i(poolingContainerListener, "listener");
        getPoolingContainerListenerHolder(view).removeListener(poolingContainerListener);
    }

    public static final void setPoolingContainer(View view, boolean z) {
        C12775o.m28639i(view, "<this>");
        view.setTag(IsPoolingContainerTag, Boolean.valueOf(z));
    }
}
