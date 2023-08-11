package p109h4;

import android.content.Context;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.cast.CastDevice;
import com.google.android.gms.common.api.C4719a;
import java.util.UUID;
import p150l4.C8697m;
import p190p4.C9056e;
import p231t4.C9705n;
import p231t4.C9713p;

/* renamed from: h4.c */
/* compiled from: com.google.android.gms:play-services-cast@@21.2.0 */
public final class C7913c {
    @NonNull

    /* renamed from: a */
    public static final C4719a<C7916c> f11076a;
    @NonNull

    /* renamed from: b */
    public static final C7915b f11077b = new C7921c1();

    /* renamed from: c */
    static final C4719a.C4720a f11078c;

    /* renamed from: h4.c$a */
    /* compiled from: com.google.android.gms:play-services-cast@@21.2.0 */
    public interface C7914a extends C9056e {
        /* renamed from: b */
        boolean mo41665b();

        @Nullable
        /* renamed from: d */
        String mo41666d();

        @Nullable
        /* renamed from: q */
        C7910b mo41667q();

        @Nullable
        /* renamed from: z */
        String mo41668z();
    }

    @Deprecated
    /* renamed from: h4.c$b */
    /* compiled from: com.google.android.gms:play-services-cast@@21.2.0 */
    public interface C7915b {
    }

    /* renamed from: h4.c$c */
    /* compiled from: com.google.android.gms:play-services-cast@@21.2.0 */
    public static final class C7916c implements C4719a.C4723d {

        /* renamed from: b */
        final CastDevice f11079b;

        /* renamed from: c */
        final C7918d f11080c;

        /* renamed from: d */
        final Bundle f11081d;

        /* renamed from: e */
        final int f11082e;

        /* renamed from: f */
        final String f11083f = UUID.randomUUID().toString();

        /* renamed from: h4.c$c$a */
        /* compiled from: com.google.android.gms:play-services-cast@@21.2.0 */
        public static final class C7917a {

            /* renamed from: a */
            CastDevice f11084a;

            /* renamed from: b */
            C7918d f11085b;
            /* access modifiers changed from: private */

            /* renamed from: c */
            public int f11086c = 0;
            /* access modifiers changed from: private */

            /* renamed from: d */
            public Bundle f11087d;

            public C7917a(@NonNull CastDevice castDevice, @NonNull C7918d dVar) {
                C9713p.m20276k(castDevice, "CastDevice parameter cannot be null");
                C9713p.m20276k(dVar, "CastListener parameter cannot be null");
                this.f11084a = castDevice;
                this.f11085b = dVar;
            }

            @NonNull
            /* renamed from: a */
            public C7916c mo41671a() {
                return new C7916c(this, (C7924d1) null);
            }

            @NonNull
            /* renamed from: d */
            public final C7917a mo41672d(@NonNull Bundle bundle) {
                this.f11087d = bundle;
                return this;
            }
        }

        /* synthetic */ C7916c(C7917a aVar, C7924d1 d1Var) {
            this.f11079b = aVar.f11084a;
            this.f11080c = aVar.f11085b;
            this.f11082e = aVar.f11086c;
            this.f11081d = aVar.f11087d;
        }

        public boolean equals(@Nullable Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof C7916c)) {
                return false;
            }
            C7916c cVar = (C7916c) obj;
            if (!C9705n.m20259b(this.f11079b, cVar.f11079b) || !C9705n.m20258a(this.f11081d, cVar.f11081d) || this.f11082e != cVar.f11082e || !C9705n.m20259b(this.f11083f, cVar.f11083f)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return C9705n.m20260c(this.f11079b, this.f11081d, Integer.valueOf(this.f11082e), this.f11083f);
        }
    }

    /* renamed from: h4.c$e */
    /* compiled from: com.google.android.gms:play-services-cast@@21.2.0 */
    public interface C7919e {
        /* renamed from: a */
        void mo32161a(@NonNull CastDevice castDevice, @NonNull String str, @NonNull String str2);
    }

    static {
        C7912b1 b1Var = new C7912b1();
        f11078c = b1Var;
        f11076a = new C4719a<>("Cast.API", b1Var, C8697m.f12440a);
    }

    /* renamed from: a */
    public static C7930f1 m15542a(Context context, C7916c cVar) {
        return new C7947k0(context, cVar);
    }

    /* renamed from: h4.c$d */
    /* compiled from: com.google.android.gms:play-services-cast@@21.2.0 */
    public static class C7918d {
        /* renamed from: d */
        public void mo41676d() {
        }

        /* renamed from: e */
        public void mo41677e() {
        }

        /* renamed from: g */
        public void mo41679g() {
        }

        /* renamed from: a */
        public void mo41673a(int i) {
        }

        /* renamed from: b */
        public void mo41674b(int i) {
        }

        /* renamed from: c */
        public void mo41675c(@Nullable C7910b bVar) {
        }

        /* renamed from: f */
        public void mo41678f(int i) {
        }
    }
}
