package androidx.core.p004os;

import android.os.OutcomeReceiver;
import androidx.annotation.RequiresApi;
import kotlin.jvm.internal.C12775o;
import p355hf.C12074d;

@RequiresApi(31)
/* renamed from: androidx.core.os.OutcomeReceiverKt */
/* compiled from: OutcomeReceiver.kt */
public final class OutcomeReceiverKt {
    @RequiresApi(31)
    public static final <R, E extends Throwable> OutcomeReceiver<R, E> asOutcomeReceiver(C12074d<? super R> dVar) {
        C12775o.m28639i(dVar, "<this>");
        return new ContinuationOutcomeReceiver(dVar);
    }
}
