package p147l1;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.os.ParcelFileDescriptor;
import android.provider.MediaStore;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import com.bumptech.glide.C4368f;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.InputStream;
import p058d1.C7214a;
import p058d1.C7222g;
import p070e1.C7422d;
import p082f1.C7562b;
import p137k1.C8476n;
import p137k1.C8478o;
import p137k1.C8484r;
import p283y1.C10652b;

@RequiresApi(29)
/* renamed from: l1.e */
/* compiled from: QMediaStoreUriLoader */
public final class C8644e<DataT> implements C8476n<Uri, DataT> {

    /* renamed from: a */
    private final Context f12351a;

    /* renamed from: b */
    private final C8476n<File, DataT> f12352b;

    /* renamed from: c */
    private final C8476n<Uri, DataT> f12353c;

    /* renamed from: d */
    private final Class<DataT> f12354d;

    /* renamed from: l1.e$a */
    /* compiled from: QMediaStoreUriLoader */
    private static abstract class C8645a<DataT> implements C8478o<Uri, DataT> {

        /* renamed from: a */
        private final Context f12355a;

        /* renamed from: b */
        private final Class<DataT> f12356b;

        C8645a(Context context, Class<DataT> cls) {
            this.f12355a = context;
            this.f12356b = cls;
        }

        @NonNull
        /* renamed from: b */
        public final C8476n<Uri, DataT> mo42462b(@NonNull C8484r rVar) {
            return new C8644e(this.f12355a, rVar.mo42520d(File.class, this.f12356b), rVar.mo42520d(Uri.class, this.f12356b), this.f12356b);
        }
    }

    @RequiresApi(29)
    /* renamed from: l1.e$b */
    /* compiled from: QMediaStoreUriLoader */
    public static final class C8646b extends C8645a<ParcelFileDescriptor> {
        public C8646b(Context context) {
            super(context, ParcelFileDescriptor.class);
        }
    }

    @RequiresApi(29)
    /* renamed from: l1.e$c */
    /* compiled from: QMediaStoreUriLoader */
    public static final class C8647c extends C8645a<InputStream> {
        public C8647c(Context context) {
            super(context, InputStream.class);
        }
    }

    /* renamed from: l1.e$d */
    /* compiled from: QMediaStoreUriLoader */
    private static final class C8648d<DataT> implements C7422d<DataT> {

        /* renamed from: l */
        private static final String[] f12357l = {"_data"};

        /* renamed from: b */
        private final Context f12358b;

        /* renamed from: c */
        private final C8476n<File, DataT> f12359c;

        /* renamed from: d */
        private final C8476n<Uri, DataT> f12360d;

        /* renamed from: e */
        private final Uri f12361e;

        /* renamed from: f */
        private final int f12362f;

        /* renamed from: g */
        private final int f12363g;

        /* renamed from: h */
        private final C7222g f12364h;

        /* renamed from: i */
        private final Class<DataT> f12365i;

        /* renamed from: j */
        private volatile boolean f12366j;
        @Nullable

        /* renamed from: k */
        private volatile C7422d<DataT> f12367k;

        C8648d(Context context, C8476n<File, DataT> nVar, C8476n<Uri, DataT> nVar2, Uri uri, int i, int i2, C7222g gVar, Class<DataT> cls) {
            this.f12358b = context.getApplicationContext();
            this.f12359c = nVar;
            this.f12360d = nVar2;
            this.f12361e = uri;
            this.f12362f = i;
            this.f12363g = i2;
            this.f12364h = gVar;
            this.f12365i = cls;
        }

        @Nullable
        /* renamed from: c */
        private C8476n.C8477a<DataT> m17377c() {
            Uri uri;
            if (Environment.isExternalStorageLegacy()) {
                return this.f12359c.mo42458b(m17380h(this.f12361e), this.f12362f, this.f12363g, this.f12364h);
            }
            if (m17379g()) {
                uri = MediaStore.setRequireOriginal(this.f12361e);
            } else {
                uri = this.f12361e;
            }
            return this.f12360d.mo42458b(uri, this.f12362f, this.f12363g, this.f12364h);
        }

        @Nullable
        /* renamed from: f */
        private C7422d<DataT> m17378f() {
            C8476n.C8477a c = m17377c();
            if (c != null) {
                return c.f12073c;
            }
            return null;
        }

        /* renamed from: g */
        private boolean m17379g() {
            if (this.f12358b.checkSelfPermission("android.permission.ACCESS_MEDIA_LOCATION") == 0) {
                return true;
            }
            return false;
        }

        @NonNull
        /* renamed from: h */
        private File m17380h(Uri uri) {
            Cursor cursor = null;
            try {
                cursor = this.f12358b.getContentResolver().query(uri, f12357l, (String) null, (String[]) null, (String) null);
                if (cursor == null || !cursor.moveToFirst()) {
                    throw new FileNotFoundException("Failed to media store entry for: " + uri);
                }
                String string = cursor.getString(cursor.getColumnIndexOrThrow("_data"));
                if (!TextUtils.isEmpty(string)) {
                    File file = new File(string);
                    cursor.close();
                    return file;
                }
                throw new FileNotFoundException("File path was empty in media store for: " + uri);
            } catch (Throwable th) {
                if (cursor != null) {
                    cursor.close();
                }
                throw th;
            }
        }

        @NonNull
        /* renamed from: a */
        public Class<DataT> mo41069a() {
            return this.f12365i;
        }

        /* renamed from: b */
        public void mo41074b() {
            C7422d<DataT> dVar = this.f12367k;
            if (dVar != null) {
                dVar.mo41074b();
            }
        }

        public void cancel() {
            this.f12366j = true;
            C7422d<DataT> dVar = this.f12367k;
            if (dVar != null) {
                dVar.cancel();
            }
        }

        @NonNull
        /* renamed from: d */
        public C7214a mo41077d() {
            return C7214a.LOCAL;
        }

        /* renamed from: e */
        public void mo41078e(@NonNull C4368f fVar, @NonNull C7422d.C7423a<? super DataT> aVar) {
            try {
                C7422d<DataT> f = m17378f();
                if (f == null) {
                    aVar.mo31269c(new IllegalArgumentException("Failed to build fetcher for: " + this.f12361e));
                    return;
                }
                this.f12367k = f;
                if (this.f12366j) {
                    cancel();
                } else {
                    f.mo41078e(fVar, aVar);
                }
            } catch (FileNotFoundException e) {
                aVar.mo31269c(e);
            }
        }
    }

    C8644e(Context context, C8476n<File, DataT> nVar, C8476n<Uri, DataT> nVar2, Class<DataT> cls) {
        this.f12351a = context.getApplicationContext();
        this.f12352b = nVar;
        this.f12353c = nVar2;
        this.f12354d = cls;
    }

    /* renamed from: c */
    public C8476n.C8477a<DataT> mo42458b(@NonNull Uri uri, int i, int i2, @NonNull C7222g gVar) {
        return new C8476n.C8477a<>(new C10652b(uri), new C8648d(this.f12351a, this.f12352b, this.f12353c, uri, i, i2, gVar, this.f12354d));
    }

    /* renamed from: d */
    public boolean mo42457a(@NonNull Uri uri) {
        if (Build.VERSION.SDK_INT < 29 || !C7562b.m14871b(uri)) {
            return false;
        }
        return true;
    }
}
