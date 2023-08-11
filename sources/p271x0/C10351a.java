package p271x0;

import android.content.Context;
import android.webkit.JavascriptInterface;
import androidx.annotation.VisibleForTesting;
import java.math.BigDecimal;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import org.json.JSONObject;
import p069e0.C7359b;
import p081f0.C7554a;
import p126j0.C8266c;
import p126j0.C8287i;
import p238u0.C9783d;
import p270x.C10156b;
import p404of.C13074a;

/* renamed from: x0.a */
/* compiled from: InAppMessageJavascriptInterface.kt */
public final class C10351a {

    /* renamed from: a */
    private final Context f15623a;

    /* renamed from: b */
    private final C7359b f15624b;

    /* renamed from: c */
    private final C10354c f15625c;

    /* renamed from: x0.a$a */
    /* compiled from: InAppMessageJavascriptInterface.kt */
    static final class C10352a extends C12777p implements C13074a<String> {

        /* renamed from: g */
        final /* synthetic */ String f15626g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C10352a(String str) {
            super(0);
            this.f15626g = str;
        }

        public final String invoke() {
            return C12775o.m28647q("Failed to parse properties JSON String: ", this.f15626g);
        }
    }

    public C10351a(Context context, C7359b bVar) {
        C12775o.m28639i(context, "context");
        C12775o.m28639i(bVar, "inAppMessage");
        this.f15623a = context;
        this.f15624b = bVar;
        this.f15625c = new C10354c(context);
    }

    @VisibleForTesting
    /* renamed from: a */
    public final C7554a mo45031a(String str) {
        if (str == null) {
            return null;
        }
        try {
            if (C12775o.m28634d(str, "undefined") || C12775o.m28634d(str, "null")) {
                return null;
            }
            return new C7554a(new JSONObject(str));
        } catch (Exception e) {
            C8266c.m16396e(C8266c.f11641a, this, C8266c.C8267a.f11649e, e, false, new C10352a(str), 4, (Object) null);
            return null;
        }
    }

    @JavascriptInterface
    public final void changeUser(String str, String str2) {
        C12775o.m28639i(str, "userId");
        C10156b.f15345m.mo44811g(this.f15623a).mo44766J(str, str2);
    }

    @JavascriptInterface
    public final C10354c getUser() {
        return this.f15625c;
    }

    @JavascriptInterface
    public final void logButtonClick(String str) {
        if (str != null) {
            this.f15624b.mo40972Q(str);
        }
    }

    @JavascriptInterface
    public final void logClick() {
        this.f15624b.logClick();
    }

    @JavascriptInterface
    public final void logCustomEventWithJSON(String str, String str2) {
        C10156b.f15345m.mo44811g(this.f15623a).mo44776V(str, mo45031a(str2));
    }

    @JavascriptInterface
    public final void logPurchaseWithJSON(String str, double d, String str2, int i, String str3) {
        String str4 = str;
        String str5 = str2;
        C10156b.f15345m.mo44811g(this.f15623a).mo44779Y(str4, str5, new BigDecimal(String.valueOf(d)), i, mo45031a(str3));
    }

    @JavascriptInterface
    public final void requestImmediateDataFlush() {
        C10156b.f15345m.mo44811g(this.f15623a).mo44795l0();
    }

    @JavascriptInterface
    public final void requestPushPermission() {
        C9783d.C9784a aVar = C9783d.f14623G;
        aVar.mo44312a().mo44385m(true);
        C8287i.m16473d(aVar.mo44312a().mo44373a());
    }
}
