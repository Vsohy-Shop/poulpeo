package com.google.firebase.messaging;

import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;
import android.util.Log;
import androidx.annotation.CallSuper;
import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.tasks.Task;
import com.google.firebase.messaging.C6988j1;
import java.util.concurrent.ExecutorService;
import p276x5.C10406g;
import p276x5.C10410i;

/* renamed from: com.google.firebase.messaging.g */
/* compiled from: com.google.firebase:firebase-messaging@@23.0.0 */
public abstract class C6976g extends Service {
    @VisibleForTesting

    /* renamed from: b */
    final ExecutorService f9297b = C7000n.m12398b();

    /* renamed from: c */
    private Binder f9298c;

    /* renamed from: d */
    private final Object f9299d = new Object();

    /* renamed from: e */
    private int f9300e;

    /* renamed from: f */
    private int f9301f = 0;

    /* renamed from: com.google.firebase.messaging.g$a */
    /* compiled from: com.google.firebase:firebase-messaging@@23.0.0 */
    class C6977a implements C6988j1.C6989a {
        C6977a() {
        }

        /* renamed from: a */
        public Task<Void> mo39928a(Intent intent) {
            return C6976g.this.m12290h(intent);
        }
    }

    /* renamed from: b */
    private void m12289b(Intent intent) {
        if (intent != null) {
            C6979g1.m12299b(intent);
        }
        synchronized (this.f9299d) {
            int i = this.f9301f - 1;
            this.f9301f = i;
            if (i == 0) {
                mo39924i(this.f9300e);
            }
        }
    }

    /* access modifiers changed from: private */
    @MainThread
    /* renamed from: h */
    public Task<Void> m12290h(Intent intent) {
        if (mo39921e(intent)) {
            return C10410i.m21831e(null);
        }
        C10406g gVar = new C10406g();
        this.f9297b.execute(new C6969e(this, intent, gVar));
        return gVar.mo45096a();
    }

    /* renamed from: d */
    public abstract void mo39876d(@NonNull Intent intent);

    /* renamed from: e */
    public boolean mo39921e(@NonNull Intent intent) {
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public /* synthetic */ void mo39922f(Intent intent, Task task) {
        m12289b(intent);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public /* synthetic */ void mo39923g(Intent intent, C10406g gVar) {
        try {
            mo39876d(intent);
        } finally {
            gVar.mo45098c(null);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public boolean mo39924i(int i) {
        return stopSelfResult(i);
    }

    @NonNull
    public final synchronized IBinder onBind(@NonNull Intent intent) {
        if (Log.isLoggable("EnhancedIntentService", 3)) {
            Log.d("EnhancedIntentService", "Service received bind request");
        }
        if (this.f9298c == null) {
            this.f9298c = new C6988j1(new C6977a());
        }
        return this.f9298c;
    }

    @CallSuper
    public void onDestroy() {
        this.f9297b.shutdown();
        super.onDestroy();
    }

    public final int onStartCommand(@NonNull Intent intent, int i, int i2) {
        synchronized (this.f9299d) {
            this.f9300e = i2;
            this.f9301f++;
        }
        Intent c = mo39875c(intent);
        if (c == null) {
            m12289b(intent);
            return 2;
        }
        Task<Void> h = m12290h(c);
        if (h.mo35464o()) {
            m12289b(intent);
            return 2;
        }
        h.mo35451b(C6972f.f9280b, new C6966d(this, intent));
        return 3;
    }

    /* access modifiers changed from: protected */
    @NonNull
    /* renamed from: c */
    public Intent mo39875c(@NonNull Intent intent) {
        return intent;
    }
}
