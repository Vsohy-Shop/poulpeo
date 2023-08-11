package p180o4;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import androidx.annotation.NonNull;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import p231t4.C9713p;

/* renamed from: o4.a */
/* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
public class C8970a implements ServiceConnection {

    /* renamed from: b */
    boolean f13049b = false;

    /* renamed from: c */
    private final BlockingQueue<IBinder> f13050c = new LinkedBlockingQueue();

    @NonNull
    /* renamed from: a */
    public IBinder mo43138a(long j, @NonNull TimeUnit timeUnit) {
        C9713p.m20274i("BlockingServiceConnection.getServiceWithTimeout() called on main thread");
        if (!this.f13049b) {
            this.f13049b = true;
            IBinder poll = this.f13050c.poll(j, timeUnit);
            if (poll != null) {
                return poll;
            }
            throw new TimeoutException("Timed out waiting for the service connection");
        }
        throw new IllegalStateException("Cannot call get on this connection more than once");
    }

    public final void onServiceConnected(@NonNull ComponentName componentName, @NonNull IBinder iBinder) {
        this.f13050c.add(iBinder);
    }

    public final void onServiceDisconnected(@NonNull ComponentName componentName) {
    }
}
