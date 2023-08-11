package androidx.core.util;

import androidx.annotation.RequiresApi;
import java.util.function.Consumer;
import kotlin.jvm.internal.C12775o;
import p355hf.C12074d;

@RequiresApi(24)
/* compiled from: Consumer.kt */
public final class ConsumerKt {
    @RequiresApi(24)
    public static final <T> Consumer<T> asConsumer(C12074d<? super T> dVar) {
        C12775o.m28639i(dVar, "<this>");
        return new ContinuationConsumer(dVar);
    }
}
