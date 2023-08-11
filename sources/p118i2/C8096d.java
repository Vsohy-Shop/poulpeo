package p118i2;

import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import androidx.annotation.RestrictTo;
import com.facebook.FacebookSdk;
import com.rmn.apiclient.impl.jsonapi.serializer.JSONAPIResourceIdSerializer;
import java.math.BigDecimal;
import java.util.Currency;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.C12775o;
import org.json.JSONException;
import org.json.JSONObject;
import p033b2.C2849g;
import p033b2.C2867m;
import p095g2.C7760d;
import p198q2.C9144e0;
import p198q2.C9173o;
import p198q2.C9177p;
import p198q2.C9181q;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* renamed from: i2.d */
/* compiled from: AutomaticAnalyticsLogger.kt */
public final class C8096d {

    /* renamed from: a */
    private static final String f11381a = C8096d.class.getCanonicalName();

    /* renamed from: b */
    private static final C2867m f11382b = new C2867m(FacebookSdk.getApplicationContext());

    /* renamed from: c */
    public static final C8096d f11383c = new C8096d();

    /* renamed from: i2.d$a */
    /* compiled from: AutomaticAnalyticsLogger.kt */
    private static final class C8097a {

        /* renamed from: a */
        private BigDecimal f11384a;

        /* renamed from: b */
        private Currency f11385b;

        /* renamed from: c */
        private Bundle f11386c;

        public C8097a(BigDecimal bigDecimal, Currency currency, Bundle bundle) {
            C12775o.m28639i(bigDecimal, "purchaseAmount");
            C12775o.m28639i(currency, "currency");
            C12775o.m28639i(bundle, "param");
            this.f11384a = bigDecimal;
            this.f11385b = currency;
            this.f11386c = bundle;
        }

        /* renamed from: a */
        public final Currency mo41929a() {
            return this.f11385b;
        }

        /* renamed from: b */
        public final Bundle mo41930b() {
            return this.f11386c;
        }

        /* renamed from: c */
        public final BigDecimal mo41931c() {
            return this.f11384a;
        }
    }

    private C8096d() {
    }

    /* renamed from: a */
    private final C8097a m15927a(String str, String str2) {
        return m15928b(str, str2, new HashMap());
    }

    /* renamed from: b */
    private final C8097a m15928b(String str, String str2, Map<String, String> map) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            JSONObject jSONObject2 = new JSONObject(str2);
            boolean z = true;
            Bundle bundle = new Bundle(1);
            bundle.putCharSequence("fb_iap_product_id", jSONObject.getString("productId"));
            bundle.putCharSequence("fb_iap_purchase_time", jSONObject.getString("purchaseTime"));
            bundle.putCharSequence("fb_iap_purchase_token", jSONObject.getString("purchaseToken"));
            bundle.putCharSequence("fb_iap_package_name", jSONObject.optString("packageName"));
            bundle.putCharSequence("fb_iap_product_title", jSONObject2.optString("title"));
            bundle.putCharSequence("fb_iap_product_description", jSONObject2.optString("description"));
            String optString = jSONObject2.optString(JSONAPIResourceIdSerializer.FIELD_TYPE);
            bundle.putCharSequence("fb_iap_product_type", optString);
            if (C12775o.m28634d(optString, "subs")) {
                bundle.putCharSequence("fb_iap_subs_auto_renewing", Boolean.toString(jSONObject.optBoolean("autoRenewing", false)));
                bundle.putCharSequence("fb_iap_subs_period", jSONObject2.optString("subscriptionPeriod"));
                bundle.putCharSequence("fb_free_trial_period", jSONObject2.optString("freeTrialPeriod"));
                String optString2 = jSONObject2.optString("introductoryPriceCycles");
                C12775o.m28638h(optString2, "introductoryPriceCycles");
                if (optString2.length() != 0) {
                    z = false;
                }
                if (!z) {
                    bundle.putCharSequence("fb_intro_price_amount_micros", jSONObject2.optString("introductoryPriceAmountMicros"));
                    bundle.putCharSequence("fb_intro_price_cycles", optString2);
                }
            }
            for (Map.Entry next : map.entrySet()) {
                bundle.putCharSequence((String) next.getKey(), (String) next.getValue());
            }
            BigDecimal bigDecimal = new BigDecimal(((double) jSONObject2.getLong("price_amount_micros")) / 1000000.0d);
            Currency instance = Currency.getInstance(jSONObject2.getString("price_currency_code"));
            C12775o.m28638h(instance, "Currency.getInstance(sku…g(\"price_currency_code\"))");
            return new C8097a(bigDecimal, instance, bundle);
        } catch (JSONException e) {
            Log.e(f11381a, "Error parsing in-app subscription data.", e);
            return null;
        }
    }

    /* renamed from: c */
    public static final boolean m15929c() {
        C9177p j = C9181q.m18806j(FacebookSdk.getApplicationId());
        if (j == null || !FacebookSdk.getAutoLogAppEventsEnabled() || !j.mo43457e()) {
            return false;
        }
        return true;
    }

    /* renamed from: d */
    public static final void m15930d() {
        Context applicationContext = FacebookSdk.getApplicationContext();
        String applicationId = FacebookSdk.getApplicationId();
        boolean autoLogAppEventsEnabled = FacebookSdk.getAutoLogAppEventsEnabled();
        C9144e0.m18691j(applicationContext, "context");
        if (!autoLogAppEventsEnabled) {
            return;
        }
        if (applicationContext instanceof Application) {
            C2849g.f1214c.mo28350a((Application) applicationContext, applicationId);
        } else {
            Log.w(f11381a, "Automatic logging of basic events will not happen, because FacebookSdk.getApplicationContext() returns object that is not instance of android.app.Application. Make sure you call FacebookSdk.sdkInitialize() from Application class and pass application context.");
        }
    }

    /* renamed from: e */
    public static final void m15931e(String str, long j) {
        Context applicationContext = FacebookSdk.getApplicationContext();
        String applicationId = FacebookSdk.getApplicationId();
        C9144e0.m18691j(applicationContext, "context");
        C9177p o = C9181q.m18810o(applicationId, false);
        if (o != null && o.mo43453a() && j > 0) {
            C2867m mVar = new C2867m(applicationContext);
            Bundle bundle = new Bundle(1);
            bundle.putCharSequence("fb_aa_time_spent_view_name", str);
            mVar.mo28388c("fb_aa_time_spent_on_view", (double) j, bundle);
        }
    }

    /* renamed from: f */
    public static final void m15932f(String str, String str2, boolean z) {
        C8097a a;
        String str3;
        C12775o.m28639i(str, "purchase");
        C12775o.m28639i(str2, "skuDetails");
        if (m15929c() && (a = f11383c.m15927a(str, str2)) != null) {
            boolean z2 = false;
            if (z && C9173o.m18772f("app_events_if_auto_log_subs", FacebookSdk.getApplicationId(), false)) {
                z2 = true;
            }
            if (z2) {
                if (C7760d.f10769f.mo41406m(str2)) {
                    str3 = "StartTrial";
                } else {
                    str3 = "Subscribe";
                }
                f11382b.mo28394i(str3, a.mo41931c(), a.mo41929a(), a.mo41930b());
                return;
            }
            f11382b.mo28395j(a.mo41931c(), a.mo41929a(), a.mo41930b());
        }
    }
}
