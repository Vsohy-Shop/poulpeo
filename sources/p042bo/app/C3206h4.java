package p042bo.app;

import com.appboy.Constants;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.json.JSONObject;

/* renamed from: bo.app.h4 */
public final class C3206h4 extends C3240j {

    /* renamed from: k */
    public static final C3207a f1802k = new C3207a((DefaultConstructorMarker) null);

    /* renamed from: j */
    private final boolean f1803j;

    /* renamed from: bo.app.h4$a */
    public static final class C3207a {
        public /* synthetic */ C3207a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final C3785x1 mo29002a(String str, String str2, String str3) {
            C12775o.m28639i(str, "campaignId");
            C12775o.m28639i(str2, "actionId");
            C12775o.m28639i(str3, "actionType");
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(Constants.APPBOY_PUSH_CAMPAIGN_ID_KEY, str);
            jSONObject.put(Constants.APPBOY_PUSH_CONTENT_KEY, str2);
            return new C3206h4(C3040c1.PUSH_ACTION_BUTTON_CLICKED, jSONObject, str3, (DefaultConstructorMarker) null);
        }

        private C3207a() {
        }
    }

    public /* synthetic */ C3206h4(C3040c1 c1Var, JSONObject jSONObject, String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(c1Var, jSONObject, str);
    }

    /* renamed from: x */
    public final boolean mo29001x() {
        return this.f1803j;
    }

    private C3206h4(C3040c1 c1Var, JSONObject jSONObject, String str) {
        super(c1Var, jSONObject, 0.0d, (String) null, 12, (DefaultConstructorMarker) null);
        this.f1803j = C12775o.m28634d(str, Constants.APPBOY_PUSH_ACTION_TYPE_NONE);
    }
}
