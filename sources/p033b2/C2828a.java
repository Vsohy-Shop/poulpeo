package p033b2;

import androidx.annotation.RestrictTo;
import com.facebook.C4509a;
import com.facebook.FacebookSdk;
import java.io.Serializable;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p198q2.C9138d0;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* renamed from: b2.a */
/* compiled from: AccessTokenAppIdPair.kt */
public final class C2828a implements Serializable {

    /* renamed from: d */
    public static final C2829a f1167d = new C2829a((DefaultConstructorMarker) null);
    private static final long serialVersionUID = 1;

    /* renamed from: b */
    private final String f1168b;

    /* renamed from: c */
    private final String f1169c;

    /* renamed from: b2.a$a */
    /* compiled from: AccessTokenAppIdPair.kt */
    public static final class C2829a {
        private C2829a() {
        }

        public /* synthetic */ C2829a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: b2.a$b */
    /* compiled from: AccessTokenAppIdPair.kt */
    public static final class C2830b implements Serializable {

        /* renamed from: d */
        public static final C2831a f1170d = new C2831a((DefaultConstructorMarker) null);
        private static final long serialVersionUID = -2488473066578201069L;

        /* renamed from: b */
        private final String f1171b;

        /* renamed from: c */
        private final String f1172c;

        /* renamed from: b2.a$b$a */
        /* compiled from: AccessTokenAppIdPair.kt */
        public static final class C2831a {
            private C2831a() {
            }

            public /* synthetic */ C2831a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        public C2830b(String str, String str2) {
            C12775o.m28639i(str2, "appId");
            this.f1171b = str;
            this.f1172c = str2;
        }

        private final Object readResolve() {
            return new C2828a(this.f1171b, this.f1172c);
        }
    }

    public C2828a(String str, String str2) {
        C12775o.m28639i(str2, "applicationId");
        this.f1169c = str2;
        this.f1168b = C9138d0.m18618T(str) ? null : str;
    }

    private final Object writeReplace() {
        return new C2830b(this.f1168b, this.f1169c);
    }

    /* renamed from: a */
    public final String mo28326a() {
        return this.f1168b;
    }

    /* renamed from: b */
    public final String mo28327b() {
        return this.f1169c;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C2828a)) {
            return false;
        }
        C2828a aVar = (C2828a) obj;
        if (!C9138d0.m18625a(aVar.f1168b, this.f1168b) || !C9138d0.m18625a(aVar.f1169c, this.f1169c)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        int i;
        String str = this.f1168b;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        return i ^ this.f1169c.hashCode();
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C2828a(C4509a aVar) {
        this(aVar.mo31500n(), FacebookSdk.getApplicationId());
        C12775o.m28639i(aVar, "accessToken");
    }
}
