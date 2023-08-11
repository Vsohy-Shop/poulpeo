package p117i1;

import android.content.Context;
import java.io.File;
import p117i1.C8071d;

/* renamed from: i1.f */
/* compiled from: InternalCacheDiskCacheFactory */
public final class C8074f extends C8071d {

    /* renamed from: i1.f$a */
    /* compiled from: InternalCacheDiskCacheFactory */
    class C8075a implements C8071d.C8072a {

        /* renamed from: a */
        final /* synthetic */ Context f11333a;

        /* renamed from: b */
        final /* synthetic */ String f11334b;

        C8075a(Context context, String str) {
            this.f11333a = context;
            this.f11334b = str;
        }

        /* renamed from: a */
        public File mo41900a() {
            File cacheDir = this.f11333a.getCacheDir();
            if (cacheDir == null) {
                return null;
            }
            if (this.f11334b != null) {
                return new File(cacheDir, this.f11334b);
            }
            return cacheDir;
        }
    }

    public C8074f(Context context) {
        this(context, "image_manager_disk_cache", 262144000);
    }

    public C8074f(Context context, String str, long j) {
        super(new C8075a(context, str), j);
    }
}
