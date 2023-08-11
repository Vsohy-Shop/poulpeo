package p035b4;

import android.os.Bundle;
import androidx.annotation.Nullable;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.C4719a;
import p047c4.C3881a;
import p061d4.C7263a;
import p073e4.C7473a;
import p085f4.C7578h;
import p085f4.C7579i;
import p110h5.C7983f;
import p110h5.C7984g;
import p231t4.C9705n;

/* renamed from: b4.a */
/* compiled from: com.google.android.gms:play-services-auth@@19.0.0 */
public final class C2880a {

    /* renamed from: a */
    public static final C4719a.C4729g<C7984g> f1276a;

    /* renamed from: b */
    public static final C4719a.C4729g<C7578h> f1277b;

    /* renamed from: c */
    private static final C4719a.C4720a<C7984g, C2881a> f1278c;

    /* renamed from: d */
    private static final C4719a.C4720a<C7578h, GoogleSignInOptions> f1279d;
    @Deprecated

    /* renamed from: e */
    public static final C4719a<C2884c> f1280e = C2883b.f1295c;

    /* renamed from: f */
    public static final C4719a<C2881a> f1281f;

    /* renamed from: g */
    public static final C4719a<GoogleSignInOptions> f1282g;
    @Deprecated

    /* renamed from: h */
    public static final C7263a f1283h = C2883b.f1296d;

    /* renamed from: i */
    public static final C3881a f1284i = new C7983f();

    /* renamed from: j */
    public static final C7473a f1285j = new C7579i();

    @Deprecated
    /* renamed from: b4.a$a */
    /* compiled from: com.google.android.gms:play-services-auth@@19.0.0 */
    public static class C2881a implements C4719a.C4723d {

        /* renamed from: e */
        public static final C2881a f1286e = new C2882a().mo28415b();
        /* access modifiers changed from: private */

        /* renamed from: b */
        public final String f1287b;
        /* access modifiers changed from: private */

        /* renamed from: c */
        public final boolean f1288c;
        /* access modifiers changed from: private */
        @Nullable

        /* renamed from: d */
        public final String f1289d;

        public C2881a(C2882a aVar) {
            this.f1287b = aVar.f1290a;
            this.f1288c = aVar.f1291b.booleanValue();
            this.f1289d = aVar.f1292c;
        }

        /* renamed from: a */
        public final Bundle mo28411a() {
            Bundle bundle = new Bundle();
            bundle.putString("consumer_package", this.f1287b);
            bundle.putBoolean("force_save_dialog", this.f1288c);
            bundle.putString("log_session_id", this.f1289d);
            return bundle;
        }

        public boolean equals(@Nullable Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof C2881a)) {
                return false;
            }
            C2881a aVar = (C2881a) obj;
            if (!C9705n.m20259b(this.f1287b, aVar.f1287b) || this.f1288c != aVar.f1288c || !C9705n.m20259b(this.f1289d, aVar.f1289d)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return C9705n.m20260c(this.f1287b, Boolean.valueOf(this.f1288c), this.f1289d);
        }

        @Deprecated
        /* renamed from: b4.a$a$a */
        /* compiled from: com.google.android.gms:play-services-auth@@19.0.0 */
        public static class C2882a {

            /* renamed from: a */
            protected String f1290a;

            /* renamed from: b */
            protected Boolean f1291b = Boolean.FALSE;
            @Nullable

            /* renamed from: c */
            protected String f1292c;

            public C2882a() {
            }

            /* renamed from: a */
            public C2882a mo28414a(String str) {
                this.f1292c = str;
                return this;
            }

            /* renamed from: b */
            public C2881a mo28415b() {
                return new C2881a(this);
            }

            public C2882a(C2881a aVar) {
                this.f1290a = aVar.f1287b;
                this.f1291b = Boolean.valueOf(aVar.f1288c);
                this.f1292c = aVar.f1289d;
            }
        }
    }

    static {
        C4719a.C4729g<C7984g> gVar = new C4719a.C4729g<>();
        f1276a = gVar;
        C4719a.C4729g<C7578h> gVar2 = new C4719a.C4729g<>();
        f1277b = gVar2;
        C2886e eVar = new C2886e();
        f1278c = eVar;
        C2887f fVar = new C2887f();
        f1279d = fVar;
        f1281f = new C4719a<>("Auth.CREDENTIALS_API", eVar, gVar);
        f1282g = new C4719a<>("Auth.GOOGLE_SIGN_IN_API", fVar, gVar2);
    }
}
