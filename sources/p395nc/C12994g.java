package p395nc;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.DefaultConstructorMarker;

@StabilityInferred(parameters = 0)
/* renamed from: nc.g */
/* compiled from: SignInWithAppleResult.kt */
public abstract class C12994g {

    @StabilityInferred(parameters = 0)
    /* renamed from: nc.g$a */
    /* compiled from: SignInWithAppleResult.kt */
    public static final class C12995a extends C12994g {

        /* renamed from: a */
        public static final C12995a f20797a = new C12995a();

        private C12995a() {
            super((DefaultConstructorMarker) null);
        }
    }

    @StabilityInferred(parameters = 0)
    /* renamed from: nc.g$b */
    /* compiled from: SignInWithAppleResult.kt */
    public static final class C12996b extends C12994g {

        /* renamed from: a */
        private final String f20798a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C12996b(String str) {
            super((DefaultConstructorMarker) null);
            C12775o.m28639i(str, "errorMessage");
            this.f20798a = str;
        }

        /* renamed from: a */
        public final String mo50911a() {
            return this.f20798a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof C12996b) && C12775o.m28634d(this.f20798a, ((C12996b) obj).f20798a)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return this.f20798a.hashCode();
        }

        public String toString() {
            String str = this.f20798a;
            return "Failure(errorMessage=" + str + ")";
        }
    }

    @StabilityInferred(parameters = 0)
    /* renamed from: nc.g$c */
    /* compiled from: SignInWithAppleResult.kt */
    public static final class C12997c extends C12994g {

        /* renamed from: a */
        private final String f20799a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C12997c(String str) {
            super((DefaultConstructorMarker) null);
            C12775o.m28639i(str, "idToken");
            this.f20799a = str;
        }

        /* renamed from: a */
        public final String mo50915a() {
            return this.f20799a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof C12997c) && C12775o.m28634d(this.f20799a, ((C12997c) obj).f20799a)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return this.f20799a.hashCode();
        }

        public String toString() {
            String str = this.f20799a;
            return "Success(idToken=" + str + ")";
        }
    }

    private C12994g() {
    }

    public /* synthetic */ C12994g(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
