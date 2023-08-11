package androidx.core.util;

import kotlin.jvm.internal.C12775o;
import p355hf.C12074d;

/* compiled from: AndroidXConsumer.kt */
public final class AndroidXConsumerKt {
    public static final <T> Consumer<T> asAndroidXConsumer(C12074d<? super T> dVar) {
        C12775o.m28639i(dVar, "<this>");
        return new AndroidXContinuationConsumer(dVar);
    }
}
