package p275x4;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.PackageManager;
import android.util.Log;
import androidx.annotation.NonNull;
import java.util.NoSuchElementException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import p023a5.C2207e;
import p231t4.C9713p;
import p231t4.C9718q1;
import p286y4.C10680n;

/* renamed from: x4.b */
/* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
public class C10393b {

    /* renamed from: b */
    private static final Object f15675b = new Object();

    /* renamed from: c */
    private static volatile C10393b f15676c;
    @NonNull

    /* renamed from: a */
    public ConcurrentHashMap<ServiceConnection, ServiceConnection> f15677a = new ConcurrentHashMap<>();

    private C10393b() {
    }

    @NonNull
    /* renamed from: b */
    public static C10393b m21775b() {
        if (f15676c == null) {
            synchronized (f15675b) {
                if (f15676c == null) {
                    f15676c = new C10393b();
                }
            }
        }
        C10393b bVar = f15676c;
        C9713p.m20275j(bVar);
        return bVar;
    }

    /* renamed from: e */
    private static void m21776e(Context context, ServiceConnection serviceConnection) {
        try {
            context.unbindService(serviceConnection);
        } catch (IllegalArgumentException | IllegalStateException | NoSuchElementException unused) {
        }
    }

    /* renamed from: f */
    private final boolean m21777f(Context context, String str, Intent intent, ServiceConnection serviceConnection, int i, boolean z, Executor executor) {
        ComponentName component = intent.getComponent();
        if (component != null) {
            String packageName = component.getPackageName();
            "com.google.android.gms".equals(packageName);
            try {
                if ((C2207e.m1805a(context).mo23528c(packageName, 0).flags & 2097152) != 0) {
                    Log.w("ConnectionTracker", "Attempted to bind to a service in a STOPPED package.");
                    return false;
                }
            } catch (PackageManager.NameNotFoundException unused) {
            }
        }
        if (!m21778g(serviceConnection)) {
            return m21779h(context, intent, serviceConnection, i, executor);
        }
        ServiceConnection putIfAbsent = this.f15677a.putIfAbsent(serviceConnection, serviceConnection);
        if (!(putIfAbsent == null || serviceConnection == putIfAbsent)) {
            Log.w("ConnectionTracker", String.format("Duplicate binding with the same ServiceConnection: %s, %s, %s.", new Object[]{serviceConnection, str, intent.getAction()}));
        }
        try {
            boolean h = m21779h(context, intent, serviceConnection, i, executor);
            if (h) {
                return h;
            }
            return false;
        } finally {
            this.f15677a.remove(serviceConnection, serviceConnection);
        }
    }

    /* renamed from: g */
    private static boolean m21778g(ServiceConnection serviceConnection) {
        if (!(serviceConnection instanceof C9718q1)) {
            return true;
        }
        return false;
    }

    /* renamed from: h */
    private static final boolean m21779h(Context context, Intent intent, ServiceConnection serviceConnection, int i, Executor executor) {
        if (!C10680n.m22706j() || executor == null) {
            return context.bindService(intent, serviceConnection, i);
        }
        return context.bindService(intent, i, executor, serviceConnection);
    }

    /* renamed from: a */
    public boolean mo45087a(@NonNull Context context, @NonNull Intent intent, @NonNull ServiceConnection serviceConnection, int i) {
        return m21777f(context, context.getClass().getName(), intent, serviceConnection, i, true, (Executor) null);
    }

    /* renamed from: c */
    public void mo45088c(@NonNull Context context, @NonNull ServiceConnection serviceConnection) {
        if (!m21778g(serviceConnection) || !this.f15677a.containsKey(serviceConnection)) {
            m21776e(context, serviceConnection);
            return;
        }
        try {
            m21776e(context, this.f15677a.get(serviceConnection));
        } finally {
            this.f15677a.remove(serviceConnection);
        }
    }

    /* renamed from: d */
    public final boolean mo45089d(@NonNull Context context, @NonNull String str, @NonNull Intent intent, @NonNull ServiceConnection serviceConnection, int i, Executor executor) {
        return m21777f(context, str, intent, serviceConnection, i, true, executor);
    }
}
