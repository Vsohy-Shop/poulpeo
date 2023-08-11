package p179o3;

import p183o7.C9003c;
import p183o7.C9004d;

/* renamed from: o3.c */
/* compiled from: LogEventDropped */
public final class C8961c {

    /* renamed from: c */
    private static final C8961c f13020c = new C8962a().mo43119a();

    /* renamed from: a */
    private final long f13021a;

    /* renamed from: b */
    private final C8963b f13022b;

    /* renamed from: o3.c$a */
    /* compiled from: LogEventDropped */
    public static final class C8962a {

        /* renamed from: a */
        private long f13023a = 0;

        /* renamed from: b */
        private C8963b f13024b = C8963b.REASON_UNKNOWN;

        C8962a() {
        }

        /* renamed from: a */
        public C8961c mo43119a() {
            return new C8961c(this.f13023a, this.f13024b);
        }

        /* renamed from: b */
        public C8962a mo43120b(long j) {
            this.f13023a = j;
            return this;
        }

        /* renamed from: c */
        public C8962a mo43121c(C8963b bVar) {
            this.f13024b = bVar;
            return this;
        }
    }

    /* renamed from: o3.c$b */
    /* compiled from: LogEventDropped */
    public enum C8963b implements C9003c {
        REASON_UNKNOWN(0),
        MESSAGE_TOO_OLD(1),
        CACHE_FULL(2),
        PAYLOAD_TOO_BIG(3),
        MAX_RETRIES_REACHED(4),
        INVALID_PAYLOD(5),
        SERVER_ERROR(6);
        

        /* renamed from: b */
        private final int f13033b;

        private C8963b(int i) {
            this.f13033b = i;
        }

        /* renamed from: y */
        public int mo43122y() {
            return this.f13033b;
        }
    }

    C8961c(long j, C8963b bVar) {
        this.f13021a = j;
        this.f13022b = bVar;
    }

    /* renamed from: c */
    public static C8962a m18184c() {
        return new C8962a();
    }

    @C9004d(tag = 1)
    /* renamed from: a */
    public long mo43117a() {
        return this.f13021a;
    }

    @C9004d(tag = 3)
    /* renamed from: b */
    public C8963b mo43118b() {
        return this.f13022b;
    }
}
