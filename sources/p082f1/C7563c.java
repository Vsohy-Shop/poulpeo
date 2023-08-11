package p082f1;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.provider.MediaStore;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import com.bumptech.glide.C4362b;
import com.bumptech.glide.C4368f;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import p058d1.C7214a;
import p070e1.C7422d;
import p070e1.C7429g;

/* renamed from: f1.c */
/* compiled from: ThumbFetcher */
public class C7563c implements C7422d<InputStream> {

    /* renamed from: b */
    private final Uri f10506b;

    /* renamed from: c */
    private final C7567e f10507c;

    /* renamed from: d */
    private InputStream f10508d;

    /* renamed from: f1.c$a */
    /* compiled from: ThumbFetcher */
    static class C7564a implements C7566d {

        /* renamed from: b */
        private static final String[] f10509b = {"_data"};

        /* renamed from: a */
        private final ContentResolver f10510a;

        C7564a(ContentResolver contentResolver) {
            this.f10510a = contentResolver;
        }

        /* renamed from: a */
        public Cursor mo41314a(Uri uri) {
            String lastPathSegment = uri.getLastPathSegment();
            return this.f10510a.query(MediaStore.Images.Thumbnails.EXTERNAL_CONTENT_URI, f10509b, "kind = 1 AND image_id = ?", new String[]{lastPathSegment}, (String) null);
        }
    }

    /* renamed from: f1.c$b */
    /* compiled from: ThumbFetcher */
    static class C7565b implements C7566d {

        /* renamed from: b */
        private static final String[] f10511b = {"_data"};

        /* renamed from: a */
        private final ContentResolver f10512a;

        C7565b(ContentResolver contentResolver) {
            this.f10512a = contentResolver;
        }

        /* renamed from: a */
        public Cursor mo41314a(Uri uri) {
            String lastPathSegment = uri.getLastPathSegment();
            return this.f10512a.query(MediaStore.Video.Thumbnails.EXTERNAL_CONTENT_URI, f10511b, "kind = 1 AND video_id = ?", new String[]{lastPathSegment}, (String) null);
        }
    }

    @VisibleForTesting
    C7563c(Uri uri, C7567e eVar) {
        this.f10506b = uri;
        this.f10507c = eVar;
    }

    /* renamed from: c */
    private static C7563c m14875c(Context context, Uri uri, C7566d dVar) {
        return new C7563c(uri, new C7567e(C4362b.m5041c(context).mo31181j().mo31163g(), dVar, C4362b.m5041c(context).mo31176e(), context.getContentResolver()));
    }

    /* renamed from: f */
    public static C7563c m14876f(Context context, Uri uri) {
        return m14875c(context, uri, new C7564a(context.getContentResolver()));
    }

    /* renamed from: g */
    public static C7563c m14877g(Context context, Uri uri) {
        return m14875c(context, uri, new C7565b(context.getContentResolver()));
    }

    /* renamed from: h */
    private InputStream m14878h() {
        int i;
        InputStream d = this.f10507c.mo41316d(this.f10506b);
        if (d != null) {
            i = this.f10507c.mo41315a(this.f10506b);
        } else {
            i = -1;
        }
        if (i != -1) {
            return new C7429g(d, i);
        }
        return d;
    }

    @NonNull
    /* renamed from: a */
    public Class<InputStream> mo41069a() {
        return InputStream.class;
    }

    /* renamed from: b */
    public void mo41074b() {
        InputStream inputStream = this.f10508d;
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException unused) {
            }
        }
    }

    @NonNull
    /* renamed from: d */
    public C7214a mo41077d() {
        return C7214a.LOCAL;
    }

    /* renamed from: e */
    public void mo41078e(@NonNull C4368f fVar, @NonNull C7422d.C7423a<? super InputStream> aVar) {
        try {
            InputStream h = m14878h();
            this.f10508d = h;
            aVar.mo31271f(h);
        } catch (FileNotFoundException e) {
            if (Log.isLoggable("MediaStoreThumbFetcher", 3)) {
                Log.d("MediaStoreThumbFetcher", "Failed to find thumbnail file", e);
            }
            aVar.mo31269c(e);
        }
    }

    public void cancel() {
    }
}
