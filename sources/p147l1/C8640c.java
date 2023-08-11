package p147l1;

import android.content.Context;
import android.net.Uri;
import androidx.annotation.NonNull;
import java.io.InputStream;
import p058d1.C7222g;
import p082f1.C7562b;
import p082f1.C7563c;
import p137k1.C8476n;
import p137k1.C8478o;
import p137k1.C8484r;
import p283y1.C10652b;

/* renamed from: l1.c */
/* compiled from: MediaStoreImageThumbLoader */
public class C8640c implements C8476n<Uri, InputStream> {

    /* renamed from: a */
    private final Context f12347a;

    /* renamed from: l1.c$a */
    /* compiled from: MediaStoreImageThumbLoader */
    public static class C8641a implements C8478o<Uri, InputStream> {

        /* renamed from: a */
        private final Context f12348a;

        public C8641a(Context context) {
            this.f12348a = context;
        }

        @NonNull
        /* renamed from: b */
        public C8476n<Uri, InputStream> mo42462b(C8484r rVar) {
            return new C8640c(this.f12348a);
        }
    }

    public C8640c(Context context) {
        this.f12347a = context.getApplicationContext();
    }

    /* renamed from: c */
    public C8476n.C8477a<InputStream> mo42458b(@NonNull Uri uri, int i, int i2, @NonNull C7222g gVar) {
        if (C7562b.m14873d(i, i2)) {
            return new C8476n.C8477a<>(new C10652b(uri), C7563c.m14876f(this.f12347a, uri));
        }
        return null;
    }

    /* renamed from: d */
    public boolean mo42457a(@NonNull Uri uri) {
        return C7562b.m14870a(uri);
    }
}
