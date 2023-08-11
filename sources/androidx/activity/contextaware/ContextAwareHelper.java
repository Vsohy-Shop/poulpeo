package androidx.activity.contextaware;

import android.content.Context;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.jvm.internal.C12775o;

/* compiled from: ContextAwareHelper.kt */
public final class ContextAwareHelper {
    private volatile Context context;
    private final Set<OnContextAvailableListener> listeners = new CopyOnWriteArraySet();

    public final void addOnContextAvailableListener(OnContextAvailableListener onContextAvailableListener) {
        C12775o.m28639i(onContextAvailableListener, "listener");
        Context context2 = this.context;
        if (context2 != null) {
            onContextAvailableListener.onContextAvailable(context2);
        }
        this.listeners.add(onContextAvailableListener);
    }

    public final void clearAvailableContext() {
        this.context = null;
    }

    public final void dispatchOnContextAvailable(Context context2) {
        C12775o.m28639i(context2, "context");
        this.context = context2;
        for (OnContextAvailableListener onContextAvailable : this.listeners) {
            onContextAvailable.onContextAvailable(context2);
        }
    }

    public final Context peekAvailableContext() {
        return this.context;
    }

    public final void removeOnContextAvailableListener(OnContextAvailableListener onContextAvailableListener) {
        C12775o.m28639i(onContextAvailableListener, "listener");
        this.listeners.remove(onContextAvailableListener);
    }
}
