package p177o1;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.List;
import p058d1.C7222g;
import p058d1.C7224i;
import p094g1.C7744c;

/* renamed from: o1.d */
/* compiled from: ResourceDrawableDecoder */
public class C8950d implements C7224i<Uri, Drawable> {

    /* renamed from: a */
    private final Context f12987a;

    public C8950d(Context context) {
        this.f12987a = context.getApplicationContext();
    }

    @NonNull
    /* renamed from: d */
    private Context m18157d(Uri uri, String str) {
        if (str.equals(this.f12987a.getPackageName())) {
            return this.f12987a;
        }
        try {
            return this.f12987a.createPackageContext(str, 0);
        } catch (PackageManager.NameNotFoundException e) {
            if (str.contains(this.f12987a.getPackageName())) {
                return this.f12987a;
            }
            throw new IllegalArgumentException("Failed to obtain context or unrecognized Uri format for: " + uri, e);
        }
    }

    @DrawableRes
    /* renamed from: e */
    private int m18158e(Uri uri) {
        try {
            return Integer.parseInt(uri.getPathSegments().get(0));
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("Unrecognized Uri format: " + uri, e);
        }
    }

    @DrawableRes
    /* renamed from: f */
    private int m18159f(Context context, Uri uri) {
        List<String> pathSegments = uri.getPathSegments();
        String authority = uri.getAuthority();
        String str = pathSegments.get(0);
        String str2 = pathSegments.get(1);
        int identifier = context.getResources().getIdentifier(str2, str, authority);
        if (identifier == 0) {
            identifier = Resources.getSystem().getIdentifier(str2, str, SystemMediaRouteProvider.PACKAGE_NAME);
        }
        if (identifier != 0) {
            return identifier;
        }
        throw new IllegalArgumentException("Failed to find resource id for: " + uri);
    }

    @DrawableRes
    /* renamed from: g */
    private int m18160g(Context context, Uri uri) {
        List<String> pathSegments = uri.getPathSegments();
        if (pathSegments.size() == 2) {
            return m18159f(context, uri);
        }
        if (pathSegments.size() == 1) {
            return m18158e(uri);
        }
        throw new IllegalArgumentException("Unrecognized Uri format: " + uri);
    }

    @Nullable
    /* renamed from: c */
    public C7744c<Drawable> mo31395a(@NonNull Uri uri, int i, int i2, @NonNull C7222g gVar) {
        Context d = m18157d(uri, uri.getAuthority());
        return C8949c.m18155c(C8947a.m18150b(this.f12987a, d, m18160g(d, uri)));
    }

    /* renamed from: h */
    public boolean mo31396b(@NonNull Uri uri, @NonNull C7222g gVar) {
        return uri.getScheme().equals("android.resource");
    }
}
