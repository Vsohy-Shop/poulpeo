package p130j4;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.AsyncTask;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.cast.framework.media.C4635b;
import p231t4.C9713p;

/* renamed from: j4.b */
/* compiled from: com.google.android.gms:play-services-cast-framework@@21.2.0 */
public final class C8396b {

    /* renamed from: a */
    private final Context f11946a;

    /* renamed from: b */
    private final C4635b f11947b;
    @Nullable

    /* renamed from: c */
    private Uri f11948c;
    @Nullable

    /* renamed from: d */
    private C8400f f11949d;

    /* renamed from: e */
    private C8397c f11950e;
    @Nullable

    /* renamed from: f */
    private Bitmap f11951f;

    /* renamed from: g */
    private boolean f11952g;
    @Nullable

    /* renamed from: h */
    private C8395a f11953h;

    public C8396b(Context context) {
        this(context, new C4635b(-1, 0, 0));
    }

    /* renamed from: e */
    private final void m16778e() {
        C8400f fVar = this.f11949d;
        if (fVar != null) {
            fVar.cancel(true);
            this.f11949d = null;
        }
        this.f11948c = null;
        this.f11951f = null;
        this.f11952g = false;
    }

    /* renamed from: a */
    public final void mo42414a() {
        m16778e();
        this.f11953h = null;
    }

    /* renamed from: b */
    public final void mo42415b(Bitmap bitmap) {
        this.f11951f = bitmap;
        this.f11952g = true;
        C8395a aVar = this.f11953h;
        if (aVar != null) {
            aVar.mo32220a(bitmap);
        }
        this.f11949d = null;
    }

    /* renamed from: c */
    public final void mo42416c(C8395a aVar) {
        this.f11953h = aVar;
    }

    /* renamed from: d */
    public final boolean mo42417d(@Nullable Uri uri) {
        Uri uri2 = uri;
        if (uri2 == null) {
            m16778e();
            return true;
        } else if (!uri2.equals(this.f11948c)) {
            m16778e();
            this.f11948c = uri2;
            if (this.f11947b.mo32073G() == 0 || this.f11947b.mo32071A() == 0) {
                this.f11949d = new C8400f(this.f11946a, 0, 0, false, 2097152, 5, 333, 10000, this, (byte[]) null);
            } else {
                this.f11949d = new C8400f(this.f11946a, this.f11947b.mo32073G(), this.f11947b.mo32071A(), false, 2097152, 5, 333, 10000, this, (byte[]) null);
            }
            ((C8400f) C9713p.m20275j(this.f11949d)).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Uri[]{(Uri) C9713p.m20275j(this.f11948c)});
            return false;
        } else if (this.f11952g) {
            return true;
        } else {
            return false;
        }
    }

    public C8396b(Context context, @NonNull C4635b bVar) {
        this.f11946a = context;
        this.f11947b = bVar;
        this.f11950e = new C8397c();
        m16778e();
    }
}
