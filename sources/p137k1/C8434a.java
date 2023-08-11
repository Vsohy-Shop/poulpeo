package p137k1;

import android.content.res.AssetManager;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import androidx.annotation.NonNull;
import java.io.InputStream;
import p058d1.C7222g;
import p070e1.C7422d;
import p070e1.C7430h;
import p070e1.C7441n;
import p137k1.C8476n;
import p283y1.C10652b;

/* renamed from: k1.a */
/* compiled from: AssetUriLoader */
public class C8434a<Data> implements C8476n<Uri, Data> {

    /* renamed from: c */
    private static final int f12021c = 22;

    /* renamed from: a */
    private final AssetManager f12022a;

    /* renamed from: b */
    private final C8435a<Data> f12023b;

    /* renamed from: k1.a$a */
    /* compiled from: AssetUriLoader */
    public interface C8435a<Data> {
        /* renamed from: a */
        C7422d<Data> mo42461a(AssetManager assetManager, String str);
    }

    /* renamed from: k1.a$b */
    /* compiled from: AssetUriLoader */
    public static class C8436b implements C8478o<Uri, ParcelFileDescriptor>, C8435a<ParcelFileDescriptor> {

        /* renamed from: a */
        private final AssetManager f12024a;

        public C8436b(AssetManager assetManager) {
            this.f12024a = assetManager;
        }

        /* renamed from: a */
        public C7422d<ParcelFileDescriptor> mo42461a(AssetManager assetManager, String str) {
            return new C7430h(assetManager, str);
        }

        @NonNull
        /* renamed from: b */
        public C8476n<Uri, ParcelFileDescriptor> mo42462b(C8484r rVar) {
            return new C8434a(this.f12024a, this);
        }
    }

    /* renamed from: k1.a$c */
    /* compiled from: AssetUriLoader */
    public static class C8437c implements C8478o<Uri, InputStream>, C8435a<InputStream> {

        /* renamed from: a */
        private final AssetManager f12025a;

        public C8437c(AssetManager assetManager) {
            this.f12025a = assetManager;
        }

        /* renamed from: a */
        public C7422d<InputStream> mo42461a(AssetManager assetManager, String str) {
            return new C7441n(assetManager, str);
        }

        @NonNull
        /* renamed from: b */
        public C8476n<Uri, InputStream> mo42462b(C8484r rVar) {
            return new C8434a(this.f12025a, this);
        }
    }

    public C8434a(AssetManager assetManager, C8435a<Data> aVar) {
        this.f12022a = assetManager;
        this.f12023b = aVar;
    }

    /* renamed from: c */
    public C8476n.C8477a<Data> mo42458b(@NonNull Uri uri, int i, int i2, @NonNull C7222g gVar) {
        return new C8476n.C8477a<>(new C10652b(uri), this.f12023b.mo42461a(this.f12022a, uri.toString().substring(f12021c)));
    }

    /* renamed from: d */
    public boolean mo42457a(@NonNull Uri uri) {
        if (!"file".equals(uri.getScheme()) || uri.getPathSegments().isEmpty() || !"android_asset".equals(uri.getPathSegments().get(0))) {
            return false;
        }
        return true;
    }
}
