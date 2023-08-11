package p198q2;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import p251v2.C9925a;

/* renamed from: q2.x */
/* compiled from: PlatformServiceClient */
public abstract class C9208x implements ServiceConnection {

    /* renamed from: b */
    private final Context f13522b;

    /* renamed from: c */
    private final Handler f13523c;

    /* renamed from: d */
    private C9210b f13524d;

    /* renamed from: e */
    private boolean f13525e;

    /* renamed from: f */
    private Messenger f13526f;

    /* renamed from: g */
    private int f13527g;

    /* renamed from: h */
    private int f13528h;

    /* renamed from: i */
    private final String f13529i;

    /* renamed from: j */
    private final int f13530j;

    /* renamed from: q2.x$a */
    /* compiled from: PlatformServiceClient */
    class C9209a extends Handler {
        C9209a() {
        }

        public void handleMessage(Message message) {
            if (!C9925a.m20734d(this)) {
                try {
                    C9208x.this.mo43499c(message);
                } catch (Throwable th) {
                    C9925a.m20732b(th, this);
                }
            }
        }
    }

    /* renamed from: q2.x$b */
    /* compiled from: PlatformServiceClient */
    public interface C9210b {
        /* renamed from: a */
        void mo23341a(Bundle bundle);
    }

    public C9208x(Context context, int i, int i2, int i3, String str) {
        Context applicationContext = context.getApplicationContext();
        this.f13522b = applicationContext != null ? applicationContext : context;
        this.f13527g = i;
        this.f13528h = i2;
        this.f13529i = str;
        this.f13530j = i3;
        this.f13523c = new C9209a();
    }

    /* renamed from: a */
    private void m18898a(Bundle bundle) {
        if (this.f13525e) {
            this.f13525e = false;
            C9210b bVar = this.f13524d;
            if (bVar != null) {
                bVar.mo23341a(bundle);
            }
        }
    }

    /* renamed from: e */
    private void m18899e() {
        Bundle bundle = new Bundle();
        bundle.putString("com.facebook.platform.extra.APPLICATION_ID", this.f13529i);
        mo23335d(bundle);
        Message obtain = Message.obtain((Handler) null, this.f13527g);
        obtain.arg1 = this.f13530j;
        obtain.setData(bundle);
        obtain.replyTo = new Messenger(this.f13523c);
        try {
            this.f13526f.send(obtain);
        } catch (RemoteException unused) {
            m18898a((Bundle) null);
        }
    }

    /* renamed from: b */
    public void mo43498b() {
        this.f13525e = false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo43499c(Message message) {
        if (message.what == this.f13528h) {
            Bundle data = message.getData();
            if (data.getString("com.facebook.platform.status.ERROR_TYPE") != null) {
                m18898a((Bundle) null);
            } else {
                m18898a(data);
            }
            try {
                this.f13522b.unbindService(this);
            } catch (IllegalArgumentException unused) {
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public abstract void mo23335d(Bundle bundle);

    /* renamed from: f */
    public void mo43500f(C9210b bVar) {
        this.f13524d = bVar;
    }

    /* renamed from: g */
    public boolean mo43501g() {
        Intent n;
        if (this.f13525e || C9196w.m18864u(this.f13530j) == -1 || (n = C9196w.m18857n(this.f13522b)) == null) {
            return false;
        }
        this.f13525e = true;
        this.f13522b.bindService(n, this, 1);
        return true;
    }

    public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        this.f13526f = new Messenger(iBinder);
        m18899e();
    }

    public void onServiceDisconnected(ComponentName componentName) {
        this.f13526f = null;
        try {
            this.f13522b.unbindService(this);
        } catch (IllegalArgumentException unused) {
        }
        m18898a((Bundle) null);
    }
}
