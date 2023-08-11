package com.google.common.util.concurrent;

import java.lang.Thread;
import java.util.Locale;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: com.google.common.util.concurrent.g */
/* compiled from: ThreadFactoryBuilder */
public final class C6909g {

    /* renamed from: a */
    private String f9096a = null;

    /* renamed from: b */
    private Boolean f9097b = null;

    /* renamed from: c */
    private Integer f9098c = null;

    /* renamed from: d */
    private Thread.UncaughtExceptionHandler f9099d = null;

    /* renamed from: e */
    private ThreadFactory f9100e = null;

    /* renamed from: com.google.common.util.concurrent.g$a */
    /* compiled from: ThreadFactoryBuilder */
    class C6910a implements ThreadFactory {

        /* renamed from: b */
        final /* synthetic */ ThreadFactory f9101b;

        /* renamed from: c */
        final /* synthetic */ String f9102c;

        /* renamed from: d */
        final /* synthetic */ AtomicLong f9103d;

        /* renamed from: e */
        final /* synthetic */ Boolean f9104e;

        /* renamed from: f */
        final /* synthetic */ Integer f9105f;

        /* renamed from: g */
        final /* synthetic */ Thread.UncaughtExceptionHandler f9106g;

        C6910a(ThreadFactory threadFactory, String str, AtomicLong atomicLong, Boolean bool, Integer num, Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
            this.f9101b = threadFactory;
            this.f9102c = str;
            this.f9103d = atomicLong;
            this.f9104e = bool;
            this.f9105f = num;
            this.f9106g = uncaughtExceptionHandler;
        }

        public Thread newThread(Runnable runnable) {
            Thread newThread = this.f9101b.newThread(runnable);
            String str = this.f9102c;
            if (str != null) {
                newThread.setName(C6909g.m11995d(str, Long.valueOf(this.f9103d.getAndIncrement())));
            }
            Boolean bool = this.f9104e;
            if (bool != null) {
                newThread.setDaemon(bool.booleanValue());
            }
            Integer num = this.f9105f;
            if (num != null) {
                newThread.setPriority(num.intValue());
            }
            Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.f9106g;
            if (uncaughtExceptionHandler != null) {
                newThread.setUncaughtExceptionHandler(uncaughtExceptionHandler);
            }
            return newThread;
        }
    }

    /* renamed from: c */
    private static ThreadFactory m11994c(C6909g gVar) {
        AtomicLong atomicLong;
        String str = gVar.f9096a;
        Boolean bool = gVar.f9097b;
        Integer num = gVar.f9098c;
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = gVar.f9099d;
        ThreadFactory threadFactory = gVar.f9100e;
        if (threadFactory == null) {
            threadFactory = Executors.defaultThreadFactory();
        }
        ThreadFactory threadFactory2 = threadFactory;
        if (str != null) {
            atomicLong = new AtomicLong(0);
        } else {
            atomicLong = null;
        }
        return new C6910a(threadFactory2, str, atomicLong, bool, num, uncaughtExceptionHandler);
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public static String m11995d(String str, Object... objArr) {
        return String.format(Locale.ROOT, str, objArr);
    }

    /* renamed from: b */
    public ThreadFactory mo39748b() {
        return m11994c(this);
    }

    /* renamed from: e */
    public C6909g mo39749e(boolean z) {
        this.f9097b = Boolean.valueOf(z);
        return this;
    }

    /* renamed from: f */
    public C6909g mo39750f(String str) {
        m11995d(str, 0);
        this.f9096a = str;
        return this;
    }
}
