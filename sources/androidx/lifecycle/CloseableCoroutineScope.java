package androidx.lifecycle;

import java.io.Closeable;
import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.C12775o;
import p355hf.C12079g;
import p466yf.C13995l0;

/* compiled from: ViewModel.kt */
public final class CloseableCoroutineScope implements Closeable, C13995l0 {
    private final C12079g coroutineContext;

    public CloseableCoroutineScope(C12079g gVar) {
        C12775o.m28639i(gVar, "context");
        this.coroutineContext = gVar;
    }

    public void close() {
        C13944d2.m32238e(getCoroutineContext(), (CancellationException) null, 1, (Object) null);
    }

    public C12079g getCoroutineContext() {
        return this.coroutineContext;
    }
}
