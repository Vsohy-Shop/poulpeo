package androidx.core.util;

import kotlin.jvm.internal.C12775o;
import p336ef.C11921v;
import p355hf.C12074d;

/* compiled from: Runnable.kt */
public final class RunnableKt {
    public static final Runnable asRunnable(C12074d<? super C11921v> dVar) {
        C12775o.m28639i(dVar, "<this>");
        return new ContinuationRunnable(dVar);
    }
}
