package p175o;

import android.content.res.Resources;
import android.net.Uri;
import java.util.List;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.SourceDebugExtension;
import p205r.C9345k;

@SourceDebugExtension({"SMAP\nResourceUriMapper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ResourceUriMapper.kt\ncoil/map/ResourceUriMapper\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Uri.kt\nandroidx/core/net/UriKt\n*L\n1#1,34:1\n1#2:35\n29#3:36\n*S KotlinDebug\n*F\n+ 1 ResourceUriMapper.kt\ncoil/map/ResourceUriMapper\n*L\n25#1:36\n*E\n"})
/* renamed from: o.f */
/* compiled from: ResourceUriMapper.kt */
public final class C8944f implements C8942d<Uri, Uri> {
    /* renamed from: b */
    private final boolean m18144b(Uri uri) {
        boolean z;
        if (!C12775o.m28634d(uri.getScheme(), "android.resource")) {
            return false;
        }
        String authority = uri.getAuthority();
        if (authority == null || C13754v.m31532t(authority)) {
            z = true;
        } else {
            z = false;
        }
        if (z || uri.getPathSegments().size() != 2) {
            return false;
        }
        return true;
    }

    /* renamed from: c */
    public Uri mo43092a(Uri uri, C9345k kVar) {
        if (!m18144b(uri)) {
            return null;
        }
        String authority = uri.getAuthority();
        if (authority == null) {
            authority = "";
        }
        Resources resourcesForApplication = kVar.mo43742g().getPackageManager().getResourcesForApplication(authority);
        List<String> pathSegments = uri.getPathSegments();
        boolean z = false;
        int identifier = resourcesForApplication.getIdentifier(pathSegments.get(1), pathSegments.get(0), authority);
        if (identifier != 0) {
            z = true;
        }
        if (z) {
            Uri parse = Uri.parse("android.resource://" + authority + '/' + identifier);
            C12775o.m28638h(parse, "parse(this)");
            return parse;
        }
        throw new IllegalStateException(("Invalid android.resource URI: " + uri).toString());
    }
}
