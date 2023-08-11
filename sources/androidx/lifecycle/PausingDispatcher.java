package androidx.lifecycle;

import kotlin.jvm.internal.C12775o;
import p355hf.C12079g;
import p466yf.C13933b1;
import p466yf.C13971h0;

/* compiled from: PausingDispatcher.kt */
public final class PausingDispatcher extends C13971h0 {
    public final DispatchQueue dispatchQueue = new DispatchQueue();

    public void dispatch(C12079g gVar, Runnable runnable) {
        C12775o.m28639i(gVar, "context");
        C12775o.m28639i(runnable, "block");
        this.dispatchQueue.dispatchAndEnqueue(gVar, runnable);
    }

    public boolean isDispatchNeeded(C12079g gVar) {
        C12775o.m28639i(gVar, "context");
        if (C13933b1.m32212c().mo49059t0().isDispatchNeeded(gVar)) {
            return true;
        }
        return !this.dispatchQueue.canRun();
    }
}
