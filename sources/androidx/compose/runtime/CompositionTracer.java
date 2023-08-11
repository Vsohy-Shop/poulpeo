package androidx.compose.runtime;

@InternalComposeTracingApi
/* compiled from: Composer.kt */
public interface CompositionTracer {
    boolean isTraceInProgress();

    void traceEventEnd();

    void traceEventStart(int i, int i2, int i3, String str);
}
