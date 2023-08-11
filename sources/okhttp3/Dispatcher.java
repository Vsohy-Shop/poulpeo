package okhttp3;

import androidx.core.app.NotificationCompat;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Deque;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.C12775o;
import okhttp3.internal.Util;
import okhttp3.internal.connection.RealCall;
import p336ef.C11921v;

/* compiled from: Dispatcher.kt */
public final class Dispatcher {
    private ExecutorService executorServiceOrNull;
    private Runnable idleCallback;
    private int maxRequests;
    private int maxRequestsPerHost;
    private final ArrayDeque<RealCall.AsyncCall> readyAsyncCalls;
    private final ArrayDeque<RealCall.AsyncCall> runningAsyncCalls;
    private final ArrayDeque<RealCall> runningSyncCalls;

    public Dispatcher() {
        this.maxRequests = 64;
        this.maxRequestsPerHost = 5;
        this.readyAsyncCalls = new ArrayDeque<>();
        this.runningAsyncCalls = new ArrayDeque<>();
        this.runningSyncCalls = new ArrayDeque<>();
    }

    private final RealCall.AsyncCall findExistingCallWithHost(String str) {
        Iterator<RealCall.AsyncCall> it = this.runningAsyncCalls.iterator();
        while (it.hasNext()) {
            RealCall.AsyncCall next = it.next();
            if (C12775o.m28634d(next.getHost(), str)) {
                return next;
            }
        }
        Iterator<RealCall.AsyncCall> it2 = this.readyAsyncCalls.iterator();
        while (it2.hasNext()) {
            RealCall.AsyncCall next2 = it2.next();
            if (C12775o.m28634d(next2.getHost(), str)) {
                return next2;
            }
        }
        return null;
    }

    private final <T> void finished(Deque<T> deque, T t) {
        Runnable idleCallback2;
        synchronized (this) {
            if (deque.remove(t)) {
                idleCallback2 = getIdleCallback();
                C11921v vVar = C11921v.f18618a;
            } else {
                throw new AssertionError("Call wasn't in-flight!");
            }
        }
        if (!promoteAndExecute() && idleCallback2 != null) {
            idleCallback2.run();
        }
    }

    private final boolean promoteAndExecute() {
        int i;
        boolean z;
        if (!Util.assertionsEnabled || !Thread.holdsLock(this)) {
            ArrayList arrayList = new ArrayList();
            synchronized (this) {
                Iterator<RealCall.AsyncCall> it = this.readyAsyncCalls.iterator();
                C12775o.m28638h(it, "readyAsyncCalls.iterator()");
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    RealCall.AsyncCall next = it.next();
                    if (this.runningAsyncCalls.size() >= getMaxRequests()) {
                        break;
                    } else if (next.getCallsPerHost().get() < getMaxRequestsPerHost()) {
                        it.remove();
                        next.getCallsPerHost().incrementAndGet();
                        C12775o.m28638h(next, "asyncCall");
                        arrayList.add(next);
                        this.runningAsyncCalls.add(next);
                    }
                }
                if (runningCallsCount() > 0) {
                    z = true;
                } else {
                    z = false;
                }
                C11921v vVar = C11921v.f18618a;
            }
            int size = arrayList.size();
            for (i = 0; i < size; i++) {
                ((RealCall.AsyncCall) arrayList.get(i)).executeOn(executorService());
            }
            return z;
        }
        throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + this);
    }

    /* renamed from: -deprecated_executorService  reason: not valid java name */
    public final ExecutorService m38780deprecated_executorService() {
        return executorService();
    }

    public final synchronized void cancelAll() {
        Iterator<RealCall.AsyncCall> it = this.readyAsyncCalls.iterator();
        while (it.hasNext()) {
            it.next().getCall().cancel();
        }
        Iterator<RealCall.AsyncCall> it2 = this.runningAsyncCalls.iterator();
        while (it2.hasNext()) {
            it2.next().getCall().cancel();
        }
        Iterator<RealCall> it3 = this.runningSyncCalls.iterator();
        while (it3.hasNext()) {
            it3.next().cancel();
        }
    }

    public final void enqueue$okhttp(RealCall.AsyncCall asyncCall) {
        RealCall.AsyncCall findExistingCallWithHost;
        C12775o.m28639i(asyncCall, NotificationCompat.CATEGORY_CALL);
        synchronized (this) {
            this.readyAsyncCalls.add(asyncCall);
            if (!asyncCall.getCall().getForWebSocket() && (findExistingCallWithHost = findExistingCallWithHost(asyncCall.getHost())) != null) {
                asyncCall.reuseCallsPerHostFrom(findExistingCallWithHost);
            }
            C11921v vVar = C11921v.f18618a;
        }
        promoteAndExecute();
    }

    public final synchronized void executed$okhttp(RealCall realCall) {
        C12775o.m28639i(realCall, NotificationCompat.CATEGORY_CALL);
        this.runningSyncCalls.add(realCall);
    }

    public final synchronized ExecutorService executorService() {
        ExecutorService executorService;
        if (this.executorServiceOrNull == null) {
            this.executorServiceOrNull = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60, TimeUnit.SECONDS, new SynchronousQueue(), Util.threadFactory(C12775o.m28647q(Util.okHttpName, " Dispatcher"), false));
        }
        executorService = this.executorServiceOrNull;
        C12775o.m28636f(executorService);
        return executorService;
    }

    public final void finished$okhttp(RealCall.AsyncCall asyncCall) {
        C12775o.m28639i(asyncCall, NotificationCompat.CATEGORY_CALL);
        asyncCall.getCallsPerHost().decrementAndGet();
        finished(this.runningAsyncCalls, asyncCall);
    }

    public final synchronized Runnable getIdleCallback() {
        return this.idleCallback;
    }

    public final synchronized int getMaxRequests() {
        return this.maxRequests;
    }

    public final synchronized int getMaxRequestsPerHost() {
        return this.maxRequestsPerHost;
    }

    public final synchronized List<Call> queuedCalls() {
        List<Call> unmodifiableList;
        ArrayDeque<RealCall.AsyncCall> arrayDeque = this.readyAsyncCalls;
        ArrayList arrayList = new ArrayList(C12728x.m28544v(arrayDeque, 10));
        for (RealCall.AsyncCall call : arrayDeque) {
            arrayList.add(call.getCall());
        }
        unmodifiableList = Collections.unmodifiableList(arrayList);
        C12775o.m28638h(unmodifiableList, "unmodifiableList(readyAsyncCalls.map { it.call })");
        return unmodifiableList;
    }

    public final synchronized int queuedCallsCount() {
        return this.readyAsyncCalls.size();
    }

    public final synchronized List<Call> runningCalls() {
        List<Call> unmodifiableList;
        ArrayDeque<RealCall> arrayDeque = this.runningSyncCalls;
        ArrayDeque<RealCall.AsyncCall> arrayDeque2 = this.runningAsyncCalls;
        ArrayList arrayList = new ArrayList(C12728x.m28544v(arrayDeque2, 10));
        for (RealCall.AsyncCall call : arrayDeque2) {
            arrayList.add(call.getCall());
        }
        unmodifiableList = Collections.unmodifiableList(C12686e0.m28236o0(arrayDeque, arrayList));
        C12775o.m28638h(unmodifiableList, "unmodifiableList(running…yncCalls.map { it.call })");
        return unmodifiableList;
    }

    public final synchronized int runningCallsCount() {
        return this.runningAsyncCalls.size() + this.runningSyncCalls.size();
    }

    public final synchronized void setIdleCallback(Runnable runnable) {
        this.idleCallback = runnable;
    }

    public final void setMaxRequests(int i) {
        boolean z = true;
        if (i < 1) {
            z = false;
        }
        if (z) {
            synchronized (this) {
                this.maxRequests = i;
                C11921v vVar = C11921v.f18618a;
            }
            promoteAndExecute();
            return;
        }
        throw new IllegalArgumentException(C12775o.m28647q("max < 1: ", Integer.valueOf(i)).toString());
    }

    public final void setMaxRequestsPerHost(int i) {
        boolean z = true;
        if (i < 1) {
            z = false;
        }
        if (z) {
            synchronized (this) {
                this.maxRequestsPerHost = i;
                C11921v vVar = C11921v.f18618a;
            }
            promoteAndExecute();
            return;
        }
        throw new IllegalArgumentException(C12775o.m28647q("max < 1: ", Integer.valueOf(i)).toString());
    }

    public final void finished$okhttp(RealCall realCall) {
        C12775o.m28639i(realCall, NotificationCompat.CATEGORY_CALL);
        finished(this.runningSyncCalls, realCall);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public Dispatcher(ExecutorService executorService) {
        this();
        C12775o.m28639i(executorService, "executorService");
        this.executorServiceOrNull = executorService;
    }
}
