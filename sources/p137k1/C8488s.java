package p137k1;

import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.io.InputStream;
import p058d1.C7222g;
import p137k1.C8476n;

/* renamed from: k1.s */
/* compiled from: ResourceLoader */
public class C8488s<Data> implements C8476n<Integer, Data> {

    /* renamed from: a */
    private final C8476n<Uri, Data> f12096a;

    /* renamed from: b */
    private final Resources f12097b;

    /* renamed from: k1.s$a */
    /* compiled from: ResourceLoader */
    public static final class C8489a implements C8478o<Integer, AssetFileDescriptor> {

        /* renamed from: a */
        private final Resources f12098a;

        public C8489a(Resources resources) {
            this.f12098a = resources;
        }

        /* renamed from: b */
        public C8476n<Integer, AssetFileDescriptor> mo42462b(C8484r rVar) {
            return new C8488s(this.f12098a, rVar.mo42520d(Uri.class, AssetFileDescriptor.class));
        }
    }

    /* renamed from: k1.s$b */
    /* compiled from: ResourceLoader */
    public static class C8490b implements C8478o<Integer, ParcelFileDescriptor> {

        /* renamed from: a */
        private final Resources f12099a;

        public C8490b(Resources resources) {
            this.f12099a = resources;
        }

        @NonNull
        /* renamed from: b */
        public C8476n<Integer, ParcelFileDescriptor> mo42462b(C8484r rVar) {
            return new C8488s(this.f12099a, rVar.mo42520d(Uri.class, ParcelFileDescriptor.class));
        }
    }

    /* renamed from: k1.s$c */
    /* compiled from: ResourceLoader */
    public static class C8491c implements C8478o<Integer, InputStream> {

        /* renamed from: a */
        private final Resources f12100a;

        public C8491c(Resources resources) {
            this.f12100a = resources;
        }

        @NonNull
        /* renamed from: b */
        public C8476n<Integer, InputStream> mo42462b(C8484r rVar) {
            return new C8488s(this.f12100a, rVar.mo42520d(Uri.class, InputStream.class));
        }
    }

    /* renamed from: k1.s$d */
    /* compiled from: ResourceLoader */
    public static class C8492d implements C8478o<Integer, Uri> {

        /* renamed from: a */
        private final Resources f12101a;

        public C8492d(Resources resources) {
            this.f12101a = resources;
        }

        @NonNull
        /* renamed from: b */
        public C8476n<Integer, Uri> mo42462b(C8484r rVar) {
            return new C8488s(this.f12101a, C8498v.m17028c());
        }
    }

    public C8488s(Resources resources, C8476n<Uri, Data> nVar) {
        this.f12097b = resources;
        this.f12096a = nVar;
    }

    @Nullable
    /* renamed from: d */
    private Uri m17008d(Integer num) {
        try {
            return Uri.parse("android.resource://" + this.f12097b.getResourcePackageName(num.intValue()) + '/' + this.f12097b.getResourceTypeName(num.intValue()) + '/' + this.f12097b.getResourceEntryName(num.intValue()));
        } catch (Resources.NotFoundException e) {
            if (!Log.isLoggable("ResourceLoader", 5)) {
                return null;
            }
            Log.w("ResourceLoader", "Received invalid resource id: " + num, e);
            return null;
        }
    }

    /* renamed from: c */
    public C8476n.C8477a<Data> mo42458b(@NonNull Integer num, int i, int i2, @NonNull C7222g gVar) {
        Uri d = m17008d(num);
        if (d == null) {
            return null;
        }
        return this.f12096a.mo42458b(d, i, i2, gVar);
    }

    /* renamed from: e */
    public boolean mo42457a(@NonNull Integer num) {
        return true;
    }
}
