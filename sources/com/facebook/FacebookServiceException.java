package com.facebook;

import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: FacebookServiceException.kt */
public final class FacebookServiceException extends FacebookException {

    /* renamed from: d */
    public static final C4508a f4113d = new C4508a((DefaultConstructorMarker) null);
    private static final long serialVersionUID = 1;

    /* renamed from: c */
    private final C4550k f4114c;

    /* renamed from: com.facebook.FacebookServiceException$a */
    /* compiled from: FacebookServiceException.kt */
    public static final class C4508a {
        private C4508a() {
        }

        public /* synthetic */ C4508a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FacebookServiceException(C4550k kVar, String str) {
        super(str);
        C12775o.m28639i(kVar, "requestError");
        this.f4114c = kVar;
    }

    /* renamed from: a */
    public final C4550k mo31487a() {
        return this.f4114c;
    }

    public String toString() {
        String str = "{FacebookServiceException: " + "httpResponseCode: " + this.f4114c.mo31601f() + ", facebookErrorCode: " + this.f4114c.mo31596b() + ", facebookErrorType: " + this.f4114c.mo31598d() + ", message: " + this.f4114c.mo31597c() + "}";
        C12775o.m28638h(str, "StringBuilder()\n        …(\"}\")\n        .toString()");
        return str;
    }
}
