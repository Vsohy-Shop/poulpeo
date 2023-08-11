package p042bo.app;

import com.appboy.Constants;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p057d0.C7213c;

/* renamed from: bo.app.c1 */
public enum C3040c1 implements C7213c<String> {
    LOCATION_RECORDED("lr"),
    CUSTOM_EVENT("ce"),
    PURCHASE(Constants.APPBOY_PUSH_PRIORITY_KEY),
    PUSH_STORY_PAGE_CLICK("cic"),
    PUSH_CLICKED("pc"),
    PUSH_ACTION_BUTTON_CLICKED("ca"),
    INTERNAL("i"),
    INTERNAL_ERROR("ie"),
    NEWS_FEED_CARD_IMPRESSION("ci"),
    NEWS_FEED_CARD_CLICK("cc"),
    GEOFENCE("g"),
    CONTENT_CARDS_CLICK("ccc"),
    CONTENT_CARDS_IMPRESSION("cci"),
    CONTENT_CARDS_CONTROL_IMPRESSION("ccic"),
    CONTENT_CARDS_DISMISS("ccd"),
    INCREMENT("inc"),
    ADD_TO_CUSTOM_ATTRIBUTE_ARRAY("add"),
    REMOVE_FROM_CUSTOM_ATTRIBUTE_ARRAY("rem"),
    SET_CUSTOM_ATTRIBUTE_ARRAY("set"),
    INAPP_MESSAGE_IMPRESSION("si"),
    INAPP_MESSAGE_CONTROL_IMPRESSION("iec"),
    INAPP_MESSAGE_CLICK("sc"),
    INAPP_MESSAGE_BUTTON_CLICK("sbc"),
    INAPP_MESSAGE_DISPLAY_FAILURE("sfe"),
    USER_ALIAS("uae"),
    SESSION_START("ss"),
    SESSION_END("se"),
    TEST_TYPE("tt"),
    LOCATION_CUSTOM_ATTRIBUTE_ADD("lcaa"),
    LOCATION_CUSTOM_ATTRIBUTE_REMOVE("lcar"),
    SUBSCRIPTION_GROUP_UPDATE("sgu"),
    UNKNOWN("");
    

    /* renamed from: c */
    public static final C3041a f1508c = null;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public static final Map<String, C3040c1> f1509d = null;

    /* renamed from: b */
    private final String f1532b;

    /* renamed from: bo.app.c1$a */
    public static final class C3041a {
        public /* synthetic */ C3041a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final C3040c1 mo28683a(String str) {
            C12775o.m28639i(str, "value");
            Object obj = C3040c1.f1509d.get(str);
            if (obj == null) {
                obj = C3040c1.UNKNOWN;
            }
            return (C3040c1) obj;
        }

        private C3041a() {
        }
    }

    static {
        int i;
        f1508c = new C3041a((DefaultConstructorMarker) null);
        C3040c1[] values = values();
        LinkedHashMap linkedHashMap = new LinkedHashMap(C13537l.m30877d(C12714q0.m28413d(values.length), 16));
        int length = values.length;
        while (i < length) {
            C3040c1 c1Var = values[i];
            i++;
            linkedHashMap.put(c1Var.f1532b, c1Var);
        }
        f1509d = linkedHashMap;
    }

    private C3040c1(String str) {
        this.f1532b = str;
    }

    /* renamed from: w */
    public String forJsonPut() {
        return this.f1532b;
    }
}
