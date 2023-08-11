package com.google.common.util.concurrent;

import java.util.concurrent.Executor;
import java.util.concurrent.Future;

/* renamed from: com.google.common.util.concurrent.d */
/* compiled from: ListenableFuture */
public interface C6906d<V> extends Future<V> {
    void addListener(Runnable runnable, Executor executor);
}
