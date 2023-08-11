package okhttp3.internal.http2;

import androidx.autofill.HintConstants;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import okio.C13133f;

/* compiled from: Header.kt */
public final class Header {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    public static final C13133f PSEUDO_PREFIX;
    public static final C13133f RESPONSE_STATUS;
    public static final String RESPONSE_STATUS_UTF8 = ":status";
    public static final C13133f TARGET_AUTHORITY;
    public static final String TARGET_AUTHORITY_UTF8 = ":authority";
    public static final C13133f TARGET_METHOD;
    public static final String TARGET_METHOD_UTF8 = ":method";
    public static final C13133f TARGET_PATH;
    public static final String TARGET_PATH_UTF8 = ":path";
    public static final C13133f TARGET_SCHEME;
    public static final String TARGET_SCHEME_UTF8 = ":scheme";
    public final int hpackSize;
    public final C13133f name;
    public final C13133f value;

    /* compiled from: Header.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        C13133f.C13134a aVar = C13133f.f20903e;
        PSEUDO_PREFIX = aVar.mo52622d(":");
        RESPONSE_STATUS = aVar.mo52622d(RESPONSE_STATUS_UTF8);
        TARGET_METHOD = aVar.mo52622d(TARGET_METHOD_UTF8);
        TARGET_PATH = aVar.mo52622d(TARGET_PATH_UTF8);
        TARGET_SCHEME = aVar.mo52622d(TARGET_SCHEME_UTF8);
        TARGET_AUTHORITY = aVar.mo52622d(TARGET_AUTHORITY_UTF8);
    }

    public Header(C13133f fVar, C13133f fVar2) {
        C12775o.m28639i(fVar, HintConstants.AUTOFILL_HINT_NAME);
        C12775o.m28639i(fVar2, "value");
        this.name = fVar;
        this.value = fVar2;
        this.hpackSize = fVar.mo52590H() + 32 + fVar2.mo52590H();
    }

    public static /* synthetic */ Header copy$default(Header header, C13133f fVar, C13133f fVar2, int i, Object obj) {
        if ((i & 1) != 0) {
            fVar = header.name;
        }
        if ((i & 2) != 0) {
            fVar2 = header.value;
        }
        return header.copy(fVar, fVar2);
    }

    public final C13133f component1() {
        return this.name;
    }

    public final C13133f component2() {
        return this.value;
    }

    public final Header copy(C13133f fVar, C13133f fVar2) {
        C12775o.m28639i(fVar, HintConstants.AUTOFILL_HINT_NAME);
        C12775o.m28639i(fVar2, "value");
        return new Header(fVar, fVar2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Header)) {
            return false;
        }
        Header header = (Header) obj;
        if (C12775o.m28634d(this.name, header.name) && C12775o.m28634d(this.value, header.value)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (this.name.hashCode() * 31) + this.value.hashCode();
    }

    public String toString() {
        return this.name.mo52595N() + ": " + this.value.mo52595N();
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public Header(java.lang.String r2, java.lang.String r3) {
        /*
            r1 = this;
            java.lang.String r0 = "name"
            kotlin.jvm.internal.C12775o.m28639i(r2, r0)
            java.lang.String r0 = "value"
            kotlin.jvm.internal.C12775o.m28639i(r3, r0)
            okio.f$a r0 = okio.C13133f.f20903e
            okio.f r2 = r0.mo52622d(r2)
            okio.f r3 = r0.mo52622d(r3)
            r1.<init>((okio.C13133f) r2, (okio.C13133f) r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.http2.Header.<init>(java.lang.String, java.lang.String):void");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public Header(C13133f fVar, String str) {
        this(fVar, C13133f.f20903e.mo52622d(str));
        C12775o.m28639i(fVar, HintConstants.AUTOFILL_HINT_NAME);
        C12775o.m28639i(str, "value");
    }
}
