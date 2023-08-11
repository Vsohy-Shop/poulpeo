package p145l;

import android.net.Uri;
import android.webkit.MimeTypeMap;
import kotlin.jvm.functions.Function1;
import okio.C13145j0;
import p080f.C7539e;
import p115i.C8032a;
import p115i.C8042f;
import p115i.C8058q;
import p145l.C8606i;
import p205r.C9345k;
import p259w.C10070i;
import p355hf.C12074d;

/* renamed from: l.a */
/* compiled from: AssetUriFetcher.kt */
public final class C8593a implements C8606i {

    /* renamed from: a */
    private final Uri f12281a;

    /* renamed from: b */
    private final C9345k f12282b;

    /* renamed from: l.a$a */
    /* compiled from: AssetUriFetcher.kt */
    public static final class C8594a implements C8606i.C8607a<Uri> {
        /* renamed from: b */
        public C8606i mo42681a(Uri uri, C9345k kVar, C7539e eVar) {
            if (!C10070i.m21157q(uri)) {
                return null;
            }
            return new C8593a(uri, kVar);
        }
    }

    public C8593a(Uri uri, C9345k kVar) {
        this.f12281a = uri;
        this.f12282b = kVar;
    }

    /* renamed from: a */
    public Object mo42680a(C12074d<? super C8605h> dVar) {
        String h0 = C12686e0.m28229h0(C12686e0.m28216U(this.f12281a.getPathSegments(), 1), "/", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (Function1) null, 62, (Object) null);
        return new C8618m(C8058q.m15839b(C13145j0.m29739d(C13145j0.m29747l(this.f12282b.mo43742g().getAssets().open(h0))), this.f12282b.mo43742g(), new C8032a(h0)), C10070i.m21150j(MimeTypeMap.getSingleton(), h0), C8042f.DISK);
    }
}
