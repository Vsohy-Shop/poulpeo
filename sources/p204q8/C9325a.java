package p204q8;

import androidx.annotation.NonNull;
import p151l5.C8734q;
import p151l5.C8736s;

/* renamed from: q8.a */
/* compiled from: com.google.firebase:firebase-messaging@@23.0.0 */
public final class C9325a {

    /* renamed from: p */
    private static final C9325a f13700p = new C9326a().mo43630a();

    /* renamed from: a */
    private final long f13701a;

    /* renamed from: b */
    private final String f13702b;

    /* renamed from: c */
    private final String f13703c;

    /* renamed from: d */
    private final C9328c f13704d;

    /* renamed from: e */
    private final C9329d f13705e;

    /* renamed from: f */
    private final String f13706f;

    /* renamed from: g */
    private final String f13707g;

    /* renamed from: h */
    private final int f13708h;

    /* renamed from: i */
    private final int f13709i;

    /* renamed from: j */
    private final String f13710j;

    /* renamed from: k */
    private final long f13711k;

    /* renamed from: l */
    private final C9327b f13712l;

    /* renamed from: m */
    private final String f13713m;

    /* renamed from: n */
    private final long f13714n;

    /* renamed from: o */
    private final String f13715o;

    /* renamed from: q8.a$a */
    /* compiled from: com.google.firebase:firebase-messaging@@23.0.0 */
    public static final class C9326a {

        /* renamed from: a */
        private long f13716a = 0;

        /* renamed from: b */
        private String f13717b = "";

        /* renamed from: c */
        private String f13718c = "";

        /* renamed from: d */
        private C9328c f13719d = C9328c.UNKNOWN;

        /* renamed from: e */
        private C9329d f13720e = C9329d.UNKNOWN_OS;

        /* renamed from: f */
        private String f13721f = "";

        /* renamed from: g */
        private String f13722g = "";

        /* renamed from: h */
        private int f13723h = 0;

        /* renamed from: i */
        private int f13724i = 0;

        /* renamed from: j */
        private String f13725j = "";

        /* renamed from: k */
        private long f13726k = 0;

        /* renamed from: l */
        private C9327b f13727l = C9327b.UNKNOWN_EVENT;

        /* renamed from: m */
        private String f13728m = "";

        /* renamed from: n */
        private long f13729n = 0;

        /* renamed from: o */
        private String f13730o = "";

        C9326a() {
        }

        @NonNull
        /* renamed from: a */
        public C9325a mo43630a() {
            return new C9325a(this.f13716a, this.f13717b, this.f13718c, this.f13719d, this.f13720e, this.f13721f, this.f13722g, this.f13723h, this.f13724i, this.f13725j, this.f13726k, this.f13727l, this.f13728m, this.f13729n, this.f13730o);
        }

        @NonNull
        /* renamed from: b */
        public C9326a mo43631b(@NonNull String str) {
            this.f13728m = str;
            return this;
        }

        @NonNull
        /* renamed from: c */
        public C9326a mo43632c(@NonNull String str) {
            this.f13722g = str;
            return this;
        }

        @NonNull
        /* renamed from: d */
        public C9326a mo43633d(@NonNull String str) {
            this.f13730o = str;
            return this;
        }

        @NonNull
        /* renamed from: e */
        public C9326a mo43634e(@NonNull C9327b bVar) {
            this.f13727l = bVar;
            return this;
        }

        @NonNull
        /* renamed from: f */
        public C9326a mo43635f(@NonNull String str) {
            this.f13718c = str;
            return this;
        }

        @NonNull
        /* renamed from: g */
        public C9326a mo43636g(@NonNull String str) {
            this.f13717b = str;
            return this;
        }

        @NonNull
        /* renamed from: h */
        public C9326a mo43637h(@NonNull C9328c cVar) {
            this.f13719d = cVar;
            return this;
        }

        @NonNull
        /* renamed from: i */
        public C9326a mo43638i(@NonNull String str) {
            this.f13721f = str;
            return this;
        }

        @NonNull
        /* renamed from: j */
        public C9326a mo43639j(long j) {
            this.f13716a = j;
            return this;
        }

        @NonNull
        /* renamed from: k */
        public C9326a mo43640k(@NonNull C9329d dVar) {
            this.f13720e = dVar;
            return this;
        }

        @NonNull
        /* renamed from: l */
        public C9326a mo43641l(@NonNull String str) {
            this.f13725j = str;
            return this;
        }

        @NonNull
        /* renamed from: m */
        public C9326a mo43642m(int i) {
            this.f13724i = i;
            return this;
        }
    }

    /* renamed from: q8.a$b */
    /* compiled from: com.google.firebase:firebase-messaging@@23.0.0 */
    public enum C9327b implements C8734q {
        UNKNOWN_EVENT(0),
        MESSAGE_DELIVERED(1),
        MESSAGE_OPEN(2);
        

        /* renamed from: b */
        private final int f13735b;

        private C9327b(int i) {
            this.f13735b = i;
        }

        /* renamed from: y */
        public int mo42867y() {
            return this.f13735b;
        }
    }

    /* renamed from: q8.a$c */
    /* compiled from: com.google.firebase:firebase-messaging@@23.0.0 */
    public enum C9328c implements C8734q {
        UNKNOWN(0),
        DATA_MESSAGE(1),
        TOPIC(2),
        DISPLAY_NOTIFICATION(3);
        

        /* renamed from: b */
        private final int f13741b;

        private C9328c(int i) {
            this.f13741b = i;
        }

        /* renamed from: y */
        public int mo42867y() {
            return this.f13741b;
        }
    }

    /* renamed from: q8.a$d */
    /* compiled from: com.google.firebase:firebase-messaging@@23.0.0 */
    public enum C9329d implements C8734q {
        UNKNOWN_OS(0),
        ANDROID(1),
        IOS(2),
        WEB(3);
        

        /* renamed from: b */
        private final int f13747b;

        private C9329d(int i) {
            this.f13747b = i;
        }

        /* renamed from: y */
        public int mo42867y() {
            return this.f13747b;
        }
    }

    C9325a(long j, String str, String str2, C9328c cVar, C9329d dVar, String str3, String str4, int i, int i2, String str5, long j2, C9327b bVar, String str6, long j3, String str7) {
        this.f13701a = j;
        this.f13702b = str;
        this.f13703c = str2;
        this.f13704d = cVar;
        this.f13705e = dVar;
        this.f13706f = str3;
        this.f13707g = str4;
        this.f13708h = i;
        this.f13709i = i2;
        this.f13710j = str5;
        this.f13711k = j2;
        this.f13712l = bVar;
        this.f13713m = str6;
        this.f13714n = j3;
        this.f13715o = str7;
    }

    @NonNull
    /* renamed from: p */
    public static C9326a m19194p() {
        return new C9326a();
    }

    @NonNull
    @C8736s(zza = 13)
    /* renamed from: a */
    public String mo43615a() {
        return this.f13713m;
    }

    @C8736s(zza = 11)
    /* renamed from: b */
    public long mo43616b() {
        return this.f13711k;
    }

    @C8736s(zza = 14)
    /* renamed from: c */
    public long mo43617c() {
        return this.f13714n;
    }

    @NonNull
    @C8736s(zza = 7)
    /* renamed from: d */
    public String mo43618d() {
        return this.f13707g;
    }

    @NonNull
    @C8736s(zza = 15)
    /* renamed from: e */
    public String mo43619e() {
        return this.f13715o;
    }

    @NonNull
    @C8736s(zza = 12)
    /* renamed from: f */
    public C9327b mo43620f() {
        return this.f13712l;
    }

    @NonNull
    @C8736s(zza = 3)
    /* renamed from: g */
    public String mo43621g() {
        return this.f13703c;
    }

    @NonNull
    @C8736s(zza = 2)
    /* renamed from: h */
    public String mo43622h() {
        return this.f13702b;
    }

    @NonNull
    @C8736s(zza = 4)
    /* renamed from: i */
    public C9328c mo43623i() {
        return this.f13704d;
    }

    @NonNull
    @C8736s(zza = 6)
    /* renamed from: j */
    public String mo43624j() {
        return this.f13706f;
    }

    @C8736s(zza = 8)
    /* renamed from: k */
    public int mo43625k() {
        return this.f13708h;
    }

    @C8736s(zza = 1)
    /* renamed from: l */
    public long mo43626l() {
        return this.f13701a;
    }

    @NonNull
    @C8736s(zza = 5)
    /* renamed from: m */
    public C9329d mo43627m() {
        return this.f13705e;
    }

    @NonNull
    @C8736s(zza = 10)
    /* renamed from: n */
    public String mo43628n() {
        return this.f13710j;
    }

    @C8736s(zza = 9)
    /* renamed from: o */
    public int mo43629o() {
        return this.f13709i;
    }
}
