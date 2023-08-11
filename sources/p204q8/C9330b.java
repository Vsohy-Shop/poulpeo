package p204q8;

import androidx.annotation.NonNull;
import p151l5.C8722e;
import p151l5.C8736s;

/* renamed from: q8.b */
/* compiled from: com.google.firebase:firebase-messaging@@23.0.0 */
public final class C9330b {

    /* renamed from: b */
    private static final C9330b f13748b = new C9331a().mo43645a();

    /* renamed from: a */
    private final C9325a f13749a;

    /* renamed from: q8.b$a */
    /* compiled from: com.google.firebase:firebase-messaging@@23.0.0 */
    public static final class C9331a {

        /* renamed from: a */
        private C9325a f13750a = null;

        C9331a() {
        }

        @NonNull
        /* renamed from: a */
        public C9330b mo43645a() {
            return new C9330b(this.f13750a);
        }

        @NonNull
        /* renamed from: b */
        public C9331a mo43646b(@NonNull C9325a aVar) {
            this.f13750a = aVar;
            return this;
        }
    }

    C9330b(C9325a aVar) {
        this.f13749a = aVar;
    }

    @NonNull
    /* renamed from: b */
    public static C9331a m19229b() {
        return new C9331a();
    }

    @NonNull
    @C8736s(zza = 1)
    /* renamed from: a */
    public C9325a mo43643a() {
        return this.f13749a;
    }

    @NonNull
    /* renamed from: c */
    public byte[] mo43644c() {
        return C8722e.m17650b(this);
    }
}
