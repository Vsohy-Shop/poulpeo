package com.facebook;

import java.util.Random;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p198q2.C9166l;
import p262w2.C10107b;

/* compiled from: FacebookException.kt */
public class FacebookException extends RuntimeException {

    /* renamed from: b */
    public static final C4494b f4099b = new C4494b((DefaultConstructorMarker) null);
    public static final long serialVersionUID = 1;

    /* renamed from: com.facebook.FacebookException$a */
    /* compiled from: FacebookException.kt */
    static final class C4493a implements C9166l.C9167a {

        /* renamed from: a */
        final /* synthetic */ String f4100a;

        C4493a(String str) {
            this.f4100a = str;
        }

        /* renamed from: a */
        public final void mo28381a(boolean z) {
            if (z) {
                try {
                    C10107b.m21237c(this.f4100a);
                } catch (Exception unused) {
                }
            }
        }
    }

    /* renamed from: com.facebook.FacebookException$b */
    /* compiled from: FacebookException.kt */
    public static final class C4494b {
        private C4494b() {
        }

        public /* synthetic */ C4494b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public FacebookException() {
    }

    public String toString() {
        String message = getMessage();
        if (message != null) {
            return message;
        }
        return "";
    }

    public FacebookException(String str) {
        super(str);
        Random random = new Random();
        if (str != null && FacebookSdk.isInitialized() && random.nextInt(100) > 50) {
            C9166l.m18754a(C9166l.C9168b.ErrorReport, new C4493a(str));
        }
    }

    public FacebookException(String str, Throwable th) {
        super(str, th);
    }

    public FacebookException(Throwable th) {
        super(th);
    }
}
