package p175o;

import android.net.Uri;
import java.io.File;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.SourceDebugExtension;
import p205r.C9345k;
import p259w.C10070i;

@SourceDebugExtension({"SMAP\nFileUriMapper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FileUriMapper.kt\ncoil/map/FileUriMapper\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,29:1\n1#2:30\n*E\n"})
/* renamed from: o.b */
/* compiled from: FileUriMapper.kt */
public final class C8940b implements C8942d<Uri, File> {
    /* renamed from: b */
    private final boolean m18135b(Uri uri) {
        boolean z;
        if (C10070i.m21157q(uri)) {
            return false;
        }
        String scheme = uri.getScheme();
        if (scheme == null || C12775o.m28634d(scheme, "file")) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            return false;
        }
        String path = uri.getPath();
        if (path == null) {
            path = "";
        }
        if (!C13755w.m31599y0(path, '/', false, 2, (Object) null) || C10070i.m21148h(uri) == null) {
            return false;
        }
        return true;
    }

    /* renamed from: c */
    public File mo43092a(Uri uri, C9345k kVar) {
        if (!m18135b(uri)) {
            return null;
        }
        if (!C12775o.m28634d(uri.getScheme(), "file")) {
            return new File(uri.toString());
        }
        String path = uri.getPath();
        if (path != null) {
            return new File(path);
        }
        return null;
    }
}
