package com.google.firebase.messaging;

import android.content.SharedPreferences;
import android.text.TextUtils;
import androidx.annotation.GuardedBy;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.WorkerThread;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.concurrent.Executor;

/* renamed from: com.google.firebase.messaging.y0 */
/* compiled from: com.google.firebase:firebase-messaging@@23.0.0 */
final class C7024y0 {

    /* renamed from: a */
    private final SharedPreferences f9373a;

    /* renamed from: b */
    private final String f9374b;

    /* renamed from: c */
    private final String f9375c;
    @GuardedBy("internalQueue")

    /* renamed from: d */
    private final ArrayDeque<String> f9376d = new ArrayDeque<>();

    /* renamed from: e */
    private final Executor f9377e;
    @GuardedBy("internalQueue")

    /* renamed from: f */
    private boolean f9378f = false;

    private C7024y0(SharedPreferences sharedPreferences, String str, String str2, Executor executor) {
        this.f9373a = sharedPreferences;
        this.f9374b = "topic_operation_queue";
        this.f9375c = ",";
        this.f9377e = executor;
    }

    @GuardedBy("internalQueue")
    /* renamed from: c */
    private boolean m12433c(boolean z) {
        if (!z || this.f9378f) {
            return z;
        }
        m12437j();
        return true;
    }

    @WorkerThread
    /* renamed from: d */
    static C7024y0 m12434d(SharedPreferences sharedPreferences, String str, String str2, Executor executor) {
        C7024y0 y0Var = new C7024y0(sharedPreferences, "topic_operation_queue", ",", executor);
        y0Var.m12435e();
        return y0Var;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0048, code lost:
        return;
     */
    @androidx.annotation.WorkerThread
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m12435e() {
        /*
            r6 = this;
            java.util.ArrayDeque<java.lang.String> r0 = r6.f9376d
            monitor-enter(r0)
            java.util.ArrayDeque<java.lang.String> r1 = r6.f9376d     // Catch:{ all -> 0x0049 }
            r1.clear()     // Catch:{ all -> 0x0049 }
            android.content.SharedPreferences r1 = r6.f9373a     // Catch:{ all -> 0x0049 }
            java.lang.String r2 = r6.f9374b     // Catch:{ all -> 0x0049 }
            java.lang.String r3 = ""
            java.lang.String r1 = r1.getString(r2, r3)     // Catch:{ all -> 0x0049 }
            boolean r2 = android.text.TextUtils.isEmpty(r1)     // Catch:{ all -> 0x0049 }
            if (r2 != 0) goto L_0x0047
            java.lang.String r2 = r6.f9375c     // Catch:{ all -> 0x0049 }
            boolean r2 = r1.contains(r2)     // Catch:{ all -> 0x0049 }
            if (r2 != 0) goto L_0x0021
            goto L_0x0047
        L_0x0021:
            java.lang.String r2 = r6.f9375c     // Catch:{ all -> 0x0049 }
            r3 = -1
            java.lang.String[] r1 = r1.split(r2, r3)     // Catch:{ all -> 0x0049 }
            int r2 = r1.length     // Catch:{ all -> 0x0049 }
            r3 = 0
            if (r2 != 0) goto L_0x0033
            java.lang.String r4 = "FirebaseMessaging"
            java.lang.String r5 = "Corrupted queue. Please check the queue contents and item separator provided"
            android.util.Log.e(r4, r5)     // Catch:{ all -> 0x0049 }
        L_0x0033:
            if (r3 >= r2) goto L_0x0045
            r4 = r1[r3]     // Catch:{ all -> 0x0049 }
            boolean r5 = android.text.TextUtils.isEmpty(r4)     // Catch:{ all -> 0x0049 }
            if (r5 != 0) goto L_0x0042
            java.util.ArrayDeque<java.lang.String> r5 = r6.f9376d     // Catch:{ all -> 0x0049 }
            r5.add(r4)     // Catch:{ all -> 0x0049 }
        L_0x0042:
            int r3 = r3 + 1
            goto L_0x0033
        L_0x0045:
            monitor-exit(r0)     // Catch:{ all -> 0x0049 }
            return
        L_0x0047:
            monitor-exit(r0)     // Catch:{ all -> 0x0049 }
            return
        L_0x0049:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0049 }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.messaging.C7024y0.m12435e():void");
    }

    /* access modifiers changed from: private */
    @WorkerThread
    /* renamed from: i */
    public void m12436i() {
        synchronized (this.f9376d) {
            this.f9373a.edit().putString(this.f9374b, mo40004h()).commit();
        }
    }

    /* renamed from: j */
    private void m12437j() {
        this.f9377e.execute(new C7022x0(this));
    }

    /* renamed from: b */
    public boolean mo40001b(@NonNull String str) {
        boolean add;
        if (TextUtils.isEmpty(str) || str.contains(this.f9375c)) {
            return false;
        }
        synchronized (this.f9376d) {
            add = this.f9376d.add(str);
            m12433c(add);
        }
        return add;
    }

    @Nullable
    /* renamed from: f */
    public String mo40002f() {
        String peek;
        synchronized (this.f9376d) {
            peek = this.f9376d.peek();
        }
        return peek;
    }

    /* renamed from: g */
    public boolean mo40003g(@Nullable Object obj) {
        boolean remove;
        synchronized (this.f9376d) {
            remove = this.f9376d.remove(obj);
            m12433c(remove);
        }
        return remove;
    }

    @GuardedBy("internalQueue")
    @NonNull
    /* renamed from: h */
    public String mo40004h() {
        StringBuilder sb = new StringBuilder();
        Iterator<String> it = this.f9376d.iterator();
        while (it.hasNext()) {
            sb.append(it.next());
            sb.append(this.f9375c);
        }
        return sb.toString();
    }
}
