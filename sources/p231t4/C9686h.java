package p231t4;

import android.content.Context;
import android.content.ServiceConnection;
import android.os.HandlerThread;
import android.os.Looper;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.concurrent.Executor;

/* renamed from: t4.h */
/* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
public abstract class C9686h {

    /* renamed from: a */
    private static int f14463a = 4225;

    /* renamed from: b */
    private static final Object f14464b = new Object();
    @Nullable

    /* renamed from: c */
    private static C9715p1 f14465c = null;
    @Nullable

    /* renamed from: d */
    static HandlerThread f14466d = null;

    /* renamed from: e */
    private static boolean f14467e = false;

    /* renamed from: a */
    public static int m20227a() {
        return f14463a;
    }

    @NonNull
    /* renamed from: b */
    public static C9686h m20228b(@NonNull Context context) {
        Looper looper;
        synchronized (f14464b) {
            if (f14465c == null) {
                Context applicationContext = context.getApplicationContext();
                if (f14467e) {
                    looper = m20229c().getLooper();
                } else {
                    looper = context.getMainLooper();
                }
                f14465c = new C9715p1(applicationContext, looper);
            }
        }
        return f14465c;
    }

    @NonNull
    /* renamed from: c */
    public static HandlerThread m20229c() {
        synchronized (f14464b) {
            HandlerThread handlerThread = f14466d;
            if (handlerThread != null) {
                return handlerThread;
            }
            HandlerThread handlerThread2 = new HandlerThread("GoogleApiHandler", 9);
            f14466d = handlerThread2;
            handlerThread2.start();
            HandlerThread handlerThread3 = f14466d;
            return handlerThread3;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public abstract void mo44191d(C9701l1 l1Var, ServiceConnection serviceConnection, String str);

    /* renamed from: e */
    public final void mo44192e(@NonNull String str, @NonNull String str2, int i, @NonNull ServiceConnection serviceConnection, @NonNull String str3, boolean z) {
        mo44191d(new C9701l1(str, str2, i, z), serviceConnection, str3);
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public abstract boolean mo44193f(C9701l1 l1Var, ServiceConnection serviceConnection, String str, @Nullable Executor executor);
}
