package androidx.core.p004os;

import android.os.OutcomeReceiver;
import androidx.annotation.RequiresApi;
import java.lang.Throwable;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.C12775o;
import p336ef.C11907m;
import p336ef.C11910n;
import p355hf.C12074d;

@RequiresApi(31)
/* renamed from: androidx.core.os.ContinuationOutcomeReceiver */
/* compiled from: OutcomeReceiver.kt */
final class ContinuationOutcomeReceiver<R, E extends Throwable> extends AtomicBoolean implements OutcomeReceiver<R, E> {
    private final C12074d<R> continuation;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ContinuationOutcomeReceiver(C12074d<? super R> dVar) {
        super(false);
        C12775o.m28639i(dVar, "continuation");
        this.continuation = dVar;
    }

    public void onError(E e) {
        C12775o.m28639i(e, MediaRouteProviderProtocol.SERVICE_DATA_ERROR);
        if (compareAndSet(false, true)) {
            C12074d<R> dVar = this.continuation;
            C11907m.C11908a aVar = C11907m.f18600b;
            dVar.resumeWith(C11907m.m25696a(C11910n.m25700a(e)));
        }
    }

    public void onResult(R r) {
        if (compareAndSet(false, true)) {
            this.continuation.resumeWith(C11907m.m25696a(r));
        }
    }

    public String toString() {
        return "ContinuationOutcomeReceiver(outcomeReceived = " + get() + ')';
    }
}
