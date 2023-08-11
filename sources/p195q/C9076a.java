package p195q;

import kotlin.Lazy;
import kotlin.jvm.internal.C12777p;
import okhttp3.CacheControl;
import okhttp3.Headers;
import okhttp3.MediaType;
import okhttp3.Response;
import okio.C13127d;
import okio.C13130e;
import p259w.C10070i;
import p336ef.C11904j;
import p404of.C13074a;

/* renamed from: q.a */
/* compiled from: CacheResponse.kt */
public final class C9076a {

    /* renamed from: a */
    private final Lazy f13208a;

    /* renamed from: b */
    private final Lazy f13209b;

    /* renamed from: c */
    private final long f13210c;

    /* renamed from: d */
    private final long f13211d;

    /* renamed from: e */
    private final boolean f13212e;

    /* renamed from: f */
    private final Headers f13213f;

    /* renamed from: q.a$a */
    /* compiled from: CacheResponse.kt */
    static final class C9077a extends C12777p implements C13074a<CacheControl> {

        /* renamed from: g */
        final /* synthetic */ C9076a f13214g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C9077a(C9076a aVar) {
            super(0);
            this.f13214g = aVar;
        }

        /* renamed from: b */
        public final CacheControl invoke() {
            return CacheControl.Companion.parse(this.f13214g.mo43289d());
        }
    }

    /* renamed from: q.a$b */
    /* compiled from: CacheResponse.kt */
    static final class C9078b extends C12777p implements C13074a<MediaType> {

        /* renamed from: g */
        final /* synthetic */ C9076a f13215g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C9078b(C9076a aVar) {
            super(0);
            this.f13215g = aVar;
        }

        /* renamed from: b */
        public final MediaType invoke() {
            String str = this.f13215g.mo43289d().get("Content-Type");
            if (str != null) {
                return MediaType.Companion.parse(str);
            }
            return null;
        }
    }

    public C9076a(C13130e eVar) {
        C11904j jVar = C11904j.NONE;
        this.f13208a = C11901h.m25689a(jVar, new C9077a(this));
        this.f13209b = C11901h.m25689a(jVar, new C9078b(this));
        this.f13210c = Long.parseLong(eVar.mo52507U());
        this.f13211d = Long.parseLong(eVar.mo52507U());
        this.f13212e = Integer.parseInt(eVar.mo52507U()) > 0;
        int parseInt = Integer.parseInt(eVar.mo52507U());
        Headers.Builder builder = new Headers.Builder();
        for (int i = 0; i < parseInt; i++) {
            C10070i.m21142b(builder, eVar.mo52507U());
        }
        this.f13213f = builder.build();
    }

    /* renamed from: a */
    public final CacheControl mo43286a() {
        return (CacheControl) this.f13208a.getValue();
    }

    /* renamed from: b */
    public final MediaType mo43287b() {
        return (MediaType) this.f13209b.getValue();
    }

    /* renamed from: c */
    public final long mo43288c() {
        return this.f13211d;
    }

    /* renamed from: d */
    public final Headers mo43289d() {
        return this.f13213f;
    }

    /* renamed from: e */
    public final long mo43290e() {
        return this.f13210c;
    }

    /* renamed from: f */
    public final boolean mo43291f() {
        return this.f13212e;
    }

    /* renamed from: g */
    public final void mo43292g(C13127d dVar) {
        long j;
        dVar.mo52535o0(this.f13210c).writeByte(10);
        dVar.mo52535o0(this.f13211d).writeByte(10);
        if (this.f13212e) {
            j = 1;
        } else {
            j = 0;
        }
        dVar.mo52535o0(j).writeByte(10);
        dVar.mo52535o0((long) this.f13213f.size()).writeByte(10);
        int size = this.f13213f.size();
        for (int i = 0; i < size; i++) {
            dVar.mo52486F(this.f13213f.name(i)).mo52486F(": ").mo52486F(this.f13213f.value(i)).writeByte(10);
        }
    }

    public C9076a(Response response) {
        C11904j jVar = C11904j.NONE;
        this.f13208a = C11901h.m25689a(jVar, new C9077a(this));
        this.f13209b = C11901h.m25689a(jVar, new C9078b(this));
        this.f13210c = response.sentRequestAtMillis();
        this.f13211d = response.receivedResponseAtMillis();
        this.f13212e = response.handshake() != null;
        this.f13213f = response.headers();
    }
}
