package com.facebook;

import kotlin.jvm.internal.C12775o;

/* compiled from: FacebookGraphResponseException.kt */
public final class FacebookGraphResponseException extends FacebookException {

    /* renamed from: c */
    private final C4574o f4101c;

    public FacebookGraphResponseException(C4574o oVar, String str) {
        super(str);
        this.f4101c = oVar;
    }

    public String toString() {
        C4550k kVar;
        C4574o oVar = this.f4101c;
        if (oVar != null) {
            kVar = oVar.mo31709b();
        } else {
            kVar = null;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("{FacebookGraphResponseException: ");
        C12775o.m28638h(sb, "StringBuilder().append(\"…raphResponseException: \")");
        String message = getMessage();
        if (message != null) {
            sb.append(message);
            sb.append(" ");
        }
        if (kVar != null) {
            sb.append("httpResponseCode: ");
            sb.append(kVar.mo31601f());
            sb.append(", facebookErrorCode: ");
            sb.append(kVar.mo31596b());
            sb.append(", facebookErrorType: ");
            sb.append(kVar.mo31598d());
            sb.append(", message: ");
            sb.append(kVar.mo31597c());
            sb.append("}");
        }
        String sb2 = sb.toString();
        C12775o.m28638h(sb2, "errorStringBuilder.toString()");
        return sb2;
    }
}
