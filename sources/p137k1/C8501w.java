package p137k1;

import android.content.ContentResolver;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import androidx.annotation.NonNull;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import p058d1.C7222g;
import p070e1.C7419a;
import p070e1.C7422d;
import p070e1.C7431i;
import p070e1.C7442o;
import p137k1.C8476n;
import p283y1.C10652b;

/* renamed from: k1.w */
/* compiled from: UriLoader */
public class C8501w<Data> implements C8476n<Uri, Data> {

    /* renamed from: b */
    private static final Set<String> f12107b = Collections.unmodifiableSet(new HashSet(Arrays.asList(new String[]{"file", "android.resource", "content"})));

    /* renamed from: a */
    private final C8504c<Data> f12108a;

    /* renamed from: k1.w$a */
    /* compiled from: UriLoader */
    public static final class C8502a implements C8478o<Uri, AssetFileDescriptor>, C8504c<AssetFileDescriptor> {

        /* renamed from: a */
        private final ContentResolver f12109a;

        public C8502a(ContentResolver contentResolver) {
            this.f12109a = contentResolver;
        }

        /* renamed from: a */
        public C7422d<AssetFileDescriptor> mo42532a(Uri uri) {
            return new C7419a(this.f12109a, uri);
        }

        /* renamed from: b */
        public C8476n<Uri, AssetFileDescriptor> mo42462b(C8484r rVar) {
            return new C8501w(this);
        }
    }

    /* renamed from: k1.w$b */
    /* compiled from: UriLoader */
    public static class C8503b implements C8478o<Uri, ParcelFileDescriptor>, C8504c<ParcelFileDescriptor> {

        /* renamed from: a */
        private final ContentResolver f12110a;

        public C8503b(ContentResolver contentResolver) {
            this.f12110a = contentResolver;
        }

        /* renamed from: a */
        public C7422d<ParcelFileDescriptor> mo42532a(Uri uri) {
            return new C7431i(this.f12110a, uri);
        }

        @NonNull
        /* renamed from: b */
        public C8476n<Uri, ParcelFileDescriptor> mo42462b(C8484r rVar) {
            return new C8501w(this);
        }
    }

    /* renamed from: k1.w$c */
    /* compiled from: UriLoader */
    public interface C8504c<Data> {
        /* renamed from: a */
        C7422d<Data> mo42532a(Uri uri);
    }

    /* renamed from: k1.w$d */
    /* compiled from: UriLoader */
    public static class C8505d implements C8478o<Uri, InputStream>, C8504c<InputStream> {

        /* renamed from: a */
        private final ContentResolver f12111a;

        public C8505d(ContentResolver contentResolver) {
            this.f12111a = contentResolver;
        }

        /* renamed from: a */
        public C7422d<InputStream> mo42532a(Uri uri) {
            return new C7442o(this.f12111a, uri);
        }

        @NonNull
        /* renamed from: b */
        public C8476n<Uri, InputStream> mo42462b(C8484r rVar) {
            return new C8501w(this);
        }
    }

    public C8501w(C8504c<Data> cVar) {
        this.f12108a = cVar;
    }

    /* renamed from: c */
    public C8476n.C8477a<Data> mo42458b(@NonNull Uri uri, int i, int i2, @NonNull C7222g gVar) {
        return new C8476n.C8477a<>(new C10652b(uri), this.f12108a.mo42532a(uri));
    }

    /* renamed from: d */
    public boolean mo42457a(@NonNull Uri uri) {
        return f12107b.contains(uri.getScheme());
    }
}
