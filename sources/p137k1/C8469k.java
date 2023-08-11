package p137k1;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.bumptech.glide.C4368f;
import java.io.File;
import java.io.FileNotFoundException;
import p058d1.C7214a;
import p058d1.C7222g;
import p070e1.C7422d;
import p082f1.C7562b;
import p137k1.C8476n;
import p283y1.C10652b;

/* renamed from: k1.k */
/* compiled from: MediaStoreFileLoader */
public final class C8469k implements C8476n<Uri, File> {

    /* renamed from: a */
    private final Context f12060a;

    /* renamed from: k1.k$a */
    /* compiled from: MediaStoreFileLoader */
    public static final class C8470a implements C8478o<Uri, File> {

        /* renamed from: a */
        private final Context f12061a;

        public C8470a(Context context) {
            this.f12061a = context;
        }

        @NonNull
        /* renamed from: b */
        public C8476n<Uri, File> mo42462b(C8484r rVar) {
            return new C8469k(this.f12061a);
        }
    }

    public C8469k(Context context) {
        this.f12060a = context;
    }

    /* renamed from: c */
    public C8476n.C8477a<File> mo42458b(@NonNull Uri uri, int i, int i2, @NonNull C7222g gVar) {
        return new C8476n.C8477a<>(new C10652b(uri), new C8471b(this.f12060a, uri));
    }

    /* renamed from: d */
    public boolean mo42457a(@NonNull Uri uri) {
        return C7562b.m14871b(uri);
    }

    /* renamed from: k1.k$b */
    /* compiled from: MediaStoreFileLoader */
    private static class C8471b implements C7422d<File> {

        /* renamed from: d */
        private static final String[] f12062d = {"_data"};

        /* renamed from: b */
        private final Context f12063b;

        /* renamed from: c */
        private final Uri f12064c;

        C8471b(Context context, Uri uri) {
            this.f12063b = context;
            this.f12064c = uri;
        }

        @NonNull
        /* renamed from: a */
        public Class<File> mo41069a() {
            return File.class;
        }

        @NonNull
        /* renamed from: d */
        public C7214a mo41077d() {
            return C7214a.LOCAL;
        }

        /* renamed from: e */
        public void mo41078e(@NonNull C4368f fVar, @NonNull C7422d.C7423a<? super File> aVar) {
            Cursor query = this.f12063b.getContentResolver().query(this.f12064c, f12062d, (String) null, (String[]) null, (String) null);
            String str = null;
            if (query != null) {
                try {
                    if (query.moveToFirst()) {
                        str = query.getString(query.getColumnIndexOrThrow("_data"));
                    }
                } finally {
                    query.close();
                }
            }
            if (TextUtils.isEmpty(str)) {
                aVar.mo31269c(new FileNotFoundException("Failed to find file path for: " + this.f12064c));
                return;
            }
            aVar.mo31271f(new File(str));
        }

        /* renamed from: b */
        public void mo41074b() {
        }

        public void cancel() {
        }
    }
}
