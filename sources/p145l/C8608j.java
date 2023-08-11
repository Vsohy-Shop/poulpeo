package p145l;

import android.webkit.MimeTypeMap;
import java.io.Closeable;
import java.io.File;
import okio.C13143j;
import okio.C13158p0;
import p080f.C7539e;
import p115i.C8042f;
import p115i.C8058q;
import p145l.C8606i;
import p205r.C9345k;
import p355hf.C12074d;

/* renamed from: l.j */
/* compiled from: FileFetcher.kt */
public final class C8608j implements C8606i {

    /* renamed from: a */
    private final File f12294a;

    /* renamed from: l.j$a */
    /* compiled from: FileFetcher.kt */
    public static final class C8609a implements C8606i.C8607a<File> {
        /* renamed from: b */
        public C8606i mo42681a(File file, C9345k kVar, C7539e eVar) {
            return new C8608j(file);
        }
    }

    public C8608j(File file) {
        this.f12294a = file;
    }

    /* renamed from: a */
    public Object mo42680a(C12074d<? super C8605h> dVar) {
        return new C8618m(C8058q.m15841d(C13158p0.C13159a.m29806d(C13158p0.f20947c, this.f12294a, false, 1, (Object) null), (C13143j) null, (String) null, (Closeable) null, 14, (Object) null), MimeTypeMap.getSingleton().getMimeTypeFromExtension(C12956j.m29271f(this.f12294a)), C8042f.DISK);
    }
}
