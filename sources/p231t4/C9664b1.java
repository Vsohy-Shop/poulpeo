package p231t4;

import android.util.Log;
import androidx.annotation.Nullable;

/* renamed from: t4.b1 */
/* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
public abstract class C9664b1<TListener> {
    @Nullable

    /* renamed from: a */
    private TListener f14376a;

    /* renamed from: b */
    private boolean f14377b = false;

    /* renamed from: c */
    final /* synthetic */ C9665c f14378c;

    public C9664b1(C9665c cVar, TListener tlistener) {
        this.f14378c = cVar;
        this.f14376a = tlistener;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo44117a(TListener tlistener);

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract void mo44118b();

    /* renamed from: c */
    public final void mo44119c() {
        TListener tlistener;
        synchronized (this) {
            tlistener = this.f14376a;
            if (this.f14377b) {
                String obj = toString();
                StringBuilder sb = new StringBuilder(obj.length() + 47);
                sb.append("Callback proxy ");
                sb.append(obj);
                sb.append(" being reused. This is not safe.");
                Log.w("GmsClient", sb.toString());
            }
        }
        if (tlistener != null) {
            try {
                mo44117a(tlistener);
            } catch (RuntimeException e) {
                throw e;
            }
        }
        synchronized (this) {
            this.f14377b = true;
        }
        mo44121e();
    }

    /* renamed from: d */
    public final void mo44120d() {
        synchronized (this) {
            this.f14376a = null;
        }
    }

    /* renamed from: e */
    public final void mo44121e() {
        mo44120d();
        synchronized (this.f14378c.f14402s) {
            this.f14378c.f14402s.remove(this);
        }
    }
}
