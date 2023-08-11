package com.google.firebase.messaging;

import android.app.ActivityManager;
import android.app.KeyguardManager;
import android.app.NotificationManager;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Process;
import android.os.SystemClock;
import android.util.Log;
import androidx.annotation.Nullable;
import androidx.core.app.NotificationCompat;
import com.google.firebase.messaging.C6954a;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import p276x5.C10410i;
import p286y4.C10680n;

/* renamed from: com.google.firebase.messaging.c */
/* compiled from: com.google.firebase:firebase-messaging@@23.0.0 */
class C6963c {

    /* renamed from: a */
    private final Executor f9251a;

    /* renamed from: b */
    private final Context f9252b;

    /* renamed from: c */
    private final C6994l0 f9253c;

    public C6963c(Context context, C6994l0 l0Var, Executor executor) {
        this.f9251a = executor;
        this.f9252b = context;
        this.f9253c = l0Var;
    }

    /* renamed from: b */
    private boolean m12232b() {
        if (((KeyguardManager) this.f9252b.getSystemService("keyguard")).inKeyguardRestrictedInputMode()) {
            return false;
        }
        if (!C10680n.m22702f()) {
            SystemClock.sleep(10);
        }
        int myPid = Process.myPid();
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) this.f9252b.getSystemService("activity")).getRunningAppProcesses();
        if (runningAppProcesses != null) {
            Iterator<ActivityManager.RunningAppProcessInfo> it = runningAppProcesses.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                ActivityManager.RunningAppProcessInfo next = it.next();
                if (next.pid == myPid) {
                    if (next.importance == 100) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    /* renamed from: c */
    private void m12233c(C6954a.C6955a aVar) {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Showing notification");
        }
        ((NotificationManager) this.f9252b.getSystemService("notification")).notify(aVar.f9236b, aVar.f9237c, aVar.f9235a.build());
    }

    @Nullable
    /* renamed from: d */
    private C6981h0 m12234d() {
        C6981h0 c = C6981h0.m12305c(this.f9253c.mo39957p("gcm.n.image"));
        if (c != null) {
            c.mo39930A(this.f9251a);
        }
        return c;
    }

    /* renamed from: e */
    private void m12235e(NotificationCompat.Builder builder, @Nullable C6981h0 h0Var) {
        if (h0Var != null) {
            try {
                Bitmap bitmap = (Bitmap) C10410i.m21828b(h0Var.mo39933k(), 5, TimeUnit.SECONDS);
                builder.setLargeIcon(bitmap);
                builder.setStyle(new NotificationCompat.BigPictureStyle().bigPicture(bitmap).bigLargeIcon((Bitmap) null));
            } catch (ExecutionException e) {
                Log.w("FirebaseMessaging", "Failed to download image: ".concat(String.valueOf(e.getCause())));
            } catch (InterruptedException unused) {
                Log.w("FirebaseMessaging", "Interrupted while downloading image, showing notification without it");
                h0Var.close();
                Thread.currentThread().interrupt();
            } catch (TimeoutException unused2) {
                Log.w("FirebaseMessaging", "Failed to download image in time, showing notification without it");
                h0Var.close();
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean mo39894a() {
        if (this.f9253c.mo39943a("gcm.n.noui")) {
            return true;
        }
        if (m12232b()) {
            return false;
        }
        C6981h0 d = m12234d();
        C6954a.C6955a d2 = C6954a.m12203d(this.f9252b, this.f9253c);
        m12235e(d2.f9235a, d);
        m12233c(d2);
        return true;
    }
}
