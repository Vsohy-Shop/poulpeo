package p042bo.app;

import androidx.core.app.NotificationCompat;
import com.appboy.Constants;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.json.JSONObject;

/* renamed from: bo.app.k4 */
public final class C3317k4 extends C3240j {

    /* renamed from: j */
    public static final C3318a f1982j = new C3318a((DefaultConstructorMarker) null);

    /* renamed from: bo.app.k4$a */
    public static final class C3318a {
        public /* synthetic */ C3318a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final C3317k4 mo29199a(String str) {
            C12775o.m28639i(str, "campaignId");
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(Constants.APPBOY_PUSH_CAMPAIGN_ID_KEY, str);
            return new C3317k4(C3040c1.PUSH_CLICKED, jSONObject, (DefaultConstructorMarker) null);
        }

        private C3318a() {
        }

        /* renamed from: a */
        public final String mo29200a(C3785x1 x1Var) {
            C12775o.m28639i(x1Var, NotificationCompat.CATEGORY_EVENT);
            String string = x1Var.mo29053k().getString(Constants.APPBOY_PUSH_CAMPAIGN_ID_KEY);
            C12775o.m28638h(string, "event.data.getString(IBrazeEvent.DATA_CAMPAIGN_ID)");
            return string;
        }
    }

    public /* synthetic */ C3317k4(C3040c1 c1Var, JSONObject jSONObject, DefaultConstructorMarker defaultConstructorMarker) {
        this(c1Var, jSONObject);
    }

    private C3317k4(C3040c1 c1Var, JSONObject jSONObject) {
        super(c1Var, jSONObject, 0.0d, (String) null, 12, (DefaultConstructorMarker) null);
    }
}
