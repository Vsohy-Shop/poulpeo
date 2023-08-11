package com.google.firebase.messaging;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import p151l5.C8726i;
import p297z4.C10822b;

/* renamed from: com.google.firebase.messaging.n */
/* compiled from: com.google.firebase:firebase-messaging@@23.0.0 */
class C7000n {
    /* renamed from: a */
    static ScheduledExecutorService m12397a() {
        return new ScheduledThreadPoolExecutor(1, new C10822b("Firebase-Messaging-Init"));
    }

    /* renamed from: b */
    static ExecutorService m12398b() {
        C8726i.m17652a();
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue(), new C10822b("Firebase-Messaging-Intent-Handle"));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        return Executors.unconfigurableExecutorService(threadPoolExecutor);
    }

    /* renamed from: c */
    static ExecutorService m12399c() {
        return Executors.newSingleThreadExecutor(new C10822b("Firebase-Messaging-Network-Io"));
    }

    /* renamed from: d */
    static ExecutorService m12400d() {
        return Executors.newSingleThreadExecutor(new C10822b("Firebase-Messaging-Task"));
    }

    /* renamed from: e */
    static ScheduledExecutorService m12401e() {
        return new ScheduledThreadPoolExecutor(1, new C10822b("Firebase-Messaging-Topics-Io"));
    }
}
