package androidx.lifecycle;

import androidx.core.app.NotificationCompat;
import androidx.lifecycle.Lifecycle;
import com.rmn.apiclient.impl.api.call.APIParams;
import kotlin.jvm.internal.C12775o;

/* compiled from: SingleGeneratedAdapterObserver.kt */
public final class SingleGeneratedAdapterObserver implements LifecycleEventObserver {
    private final GeneratedAdapter generatedAdapter;

    public SingleGeneratedAdapterObserver(GeneratedAdapter generatedAdapter2) {
        C12775o.m28639i(generatedAdapter2, "generatedAdapter");
        this.generatedAdapter = generatedAdapter2;
    }

    public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        C12775o.m28639i(lifecycleOwner, APIParams.SOURCE);
        C12775o.m28639i(event, NotificationCompat.CATEGORY_EVENT);
        this.generatedAdapter.callMethods(lifecycleOwner, event, false, (MethodCallsLogger) null);
        this.generatedAdapter.callMethods(lifecycleOwner, event, true, (MethodCallsLogger) null);
    }
}
