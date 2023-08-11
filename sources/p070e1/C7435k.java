package p070e1;

import androidx.annotation.NonNull;
import com.bumptech.glide.load.resource.bitmap.C4481v;
import java.io.InputStream;
import p070e1.C7424e;
import p106h1.C7883b;

/* renamed from: e1.k */
/* compiled from: InputStreamRewinder */
public final class C7435k implements C7424e<InputStream> {

    /* renamed from: a */
    private final C4481v f10282a;

    /* renamed from: e1.k$a */
    /* compiled from: InputStreamRewinder */
    public static final class C7436a implements C7424e.C7425a<InputStream> {

        /* renamed from: a */
        private final C7883b f10283a;

        public C7436a(C7883b bVar) {
            this.f10283a = bVar;
        }

        @NonNull
        /* renamed from: a */
        public Class<InputStream> mo41087a() {
            return InputStream.class;
        }

        @NonNull
        /* renamed from: c */
        public C7424e<InputStream> mo41088b(InputStream inputStream) {
            return new C7435k(inputStream, this.f10283a);
        }
    }

    public C7435k(InputStream inputStream, C7883b bVar) {
        C4481v vVar = new C4481v(inputStream, bVar);
        this.f10282a = vVar;
        vVar.mark(5242880);
    }

    /* renamed from: b */
    public void mo41086b() {
        this.f10282a.mo31445c();
    }

    /* renamed from: c */
    public void mo41102c() {
        this.f10282a.mo31444b();
    }

    @NonNull
    /* renamed from: d */
    public InputStream mo41085a() {
        this.f10282a.reset();
        return this.f10282a;
    }
}
