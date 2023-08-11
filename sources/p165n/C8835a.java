package p165n;

import java.io.File;
import p205r.C9345k;

/* renamed from: n.a */
/* compiled from: FileKeyer.kt */
public final class C8835a implements C8836b<File> {

    /* renamed from: a */
    private final boolean f12805a;

    public C8835a(boolean z) {
        this.f12805a = z;
    }

    /* renamed from: b */
    public String mo42969a(File file, C9345k kVar) {
        if (!this.f12805a) {
            return file.getPath();
        }
        return file.getPath() + ':' + file.lastModified();
    }
}
