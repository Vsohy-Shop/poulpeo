package p147l1;

import android.content.Context;
import android.net.Uri;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bumptech.glide.load.resource.bitmap.C4441b0;
import java.io.InputStream;
import p058d1.C7222g;
import p082f1.C7562b;
import p082f1.C7563c;
import p137k1.C8476n;
import p137k1.C8478o;
import p137k1.C8484r;
import p283y1.C10652b;

/* renamed from: l1.d */
/* compiled from: MediaStoreVideoThumbLoader */
public class C8642d implements C8476n<Uri, InputStream> {

    /* renamed from: a */
    private final Context f12349a;

    /* renamed from: l1.d$a */
    /* compiled from: MediaStoreVideoThumbLoader */
    public static class C8643a implements C8478o<Uri, InputStream> {

        /* renamed from: a */
        private final Context f12350a;

        public C8643a(Context context) {
            this.f12350a = context;
        }

        @NonNull
        /* renamed from: b */
        public C8476n<Uri, InputStream> mo42462b(C8484r rVar) {
            return new C8642d(this.f12350a);
        }
    }

    public C8642d(Context context) {
        this.f12349a = context.getApplicationContext();
    }

    /* renamed from: e */
    private boolean m17366e(C7222g gVar) {
        Long l = (Long) gVar.mo40779c(C4441b0.f3996d);
        if (l == null || l.longValue() != -1) {
            return false;
        }
        return true;
    }

    @Nullable
    /* renamed from: c */
    public C8476n.C8477a<InputStream> mo42458b(@NonNull Uri uri, int i, int i2, @NonNull C7222g gVar) {
        if (!C7562b.m14873d(i, i2) || !m17366e(gVar)) {
            return null;
        }
        return new C8476n.C8477a<>(new C10652b(uri), C7563c.m14877g(this.f12349a, uri));
    }

    /* renamed from: d */
    public boolean mo42457a(@NonNull Uri uri) {
        return C7562b.m14872c(uri);
    }
}
