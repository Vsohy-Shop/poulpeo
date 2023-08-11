package com.appboy.models.outgoing;

import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.json.JSONException;
import org.json.JSONObject;
import p057d0.C7213c;
import p126j0.C8266c;
import p404of.C13074a;

public final class AttributionData implements C7213c<JSONObject> {
    private static final String ADGROUP_KEY = "adgroup";
    private static final String CAMPAIGN_KEY = "campaign";
    private static final String CREATIVE_KEY = "ad";
    public static final C4173a Companion = new C4173a((DefaultConstructorMarker) null);
    private static final String NETWORK_KEY = "source";
    private final String adGroup;
    private final String campaign;
    private final String creative;
    private final String network;

    /* renamed from: com.appboy.models.outgoing.AttributionData$a */
    public static final class C4173a {
        public /* synthetic */ C4173a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C4173a() {
        }
    }

    /* renamed from: com.appboy.models.outgoing.AttributionData$b */
    static final class C4174b extends C12777p implements C13074a<String> {

        /* renamed from: b */
        public static final C4174b f3294b = new C4174b();

        C4174b() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "Caught exception creating AttributionData Json.";
        }
    }

    public AttributionData(String str, String str2, String str3, String str4) {
        C12775o.m28639i(str, "network");
        C12775o.m28639i(str2, "campaign");
        C12775o.m28639i(str3, "adGroup");
        C12775o.m28639i(str4, "creative");
        this.network = str;
        this.campaign = str2;
        this.adGroup = str3;
        this.creative = str4;
    }

    public JSONObject forJsonPut() {
        JSONObject jSONObject = new JSONObject();
        try {
            if (!C13754v.m31532t(this.network)) {
                jSONObject.put("source", this.network);
            }
            if (!C13754v.m31532t(this.campaign)) {
                jSONObject.put("campaign", this.campaign);
            }
            if (!C13754v.m31532t(this.adGroup)) {
                jSONObject.put(ADGROUP_KEY, this.adGroup);
            }
            if (!C13754v.m31532t(this.creative)) {
                jSONObject.put(CREATIVE_KEY, this.creative);
            }
        } catch (JSONException e) {
            C8266c.m16396e(C8266c.f11641a, this, C8266c.C8267a.f11649e, e, false, C4174b.f3294b, 4, (Object) null);
        }
        return jSONObject;
    }
}
