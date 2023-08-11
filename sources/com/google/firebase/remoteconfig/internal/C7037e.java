package com.google.firebase.remoteconfig.internal;

import java.util.Date;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.firebase.remoteconfig.internal.e */
/* compiled from: ConfigContainer */
public class C7037e {
    /* access modifiers changed from: private */

    /* renamed from: f */
    public static final Date f9432f = new Date(0);

    /* renamed from: a */
    private JSONObject f9433a;

    /* renamed from: b */
    private JSONObject f9434b;

    /* renamed from: c */
    private Date f9435c;

    /* renamed from: d */
    private JSONArray f9436d;

    /* renamed from: e */
    private JSONObject f9437e;

    /* renamed from: com.google.firebase.remoteconfig.internal.e$b */
    /* compiled from: ConfigContainer */
    public static class C7039b {

        /* renamed from: a */
        private JSONObject f9438a;

        /* renamed from: b */
        private Date f9439b;

        /* renamed from: c */
        private JSONArray f9440c;

        /* renamed from: d */
        private JSONObject f9441d;

        /* renamed from: a */
        public C7037e mo40050a() {
            return new C7037e(this.f9438a, this.f9439b, this.f9440c, this.f9441d);
        }

        /* renamed from: b */
        public C7039b mo40051b(JSONObject jSONObject) {
            try {
                this.f9438a = new JSONObject(jSONObject.toString());
            } catch (JSONException unused) {
            }
            return this;
        }

        /* renamed from: c */
        public C7039b mo40052c(JSONArray jSONArray) {
            try {
                this.f9440c = new JSONArray(jSONArray.toString());
            } catch (JSONException unused) {
            }
            return this;
        }

        /* renamed from: d */
        public C7039b mo40053d(Date date) {
            this.f9439b = date;
            return this;
        }

        /* renamed from: e */
        public C7039b mo40054e(JSONObject jSONObject) {
            try {
                this.f9441d = new JSONObject(jSONObject.toString());
            } catch (JSONException unused) {
            }
            return this;
        }

        private C7039b() {
            this.f9438a = new JSONObject();
            this.f9439b = C7037e.f9432f;
            this.f9440c = new JSONArray();
            this.f9441d = new JSONObject();
        }
    }

    /* renamed from: b */
    static C7037e m12513b(JSONObject jSONObject) {
        JSONObject optJSONObject = jSONObject.optJSONObject("personalization_metadata_key");
        if (optJSONObject == null) {
            optJSONObject = new JSONObject();
        }
        return new C7037e(jSONObject.getJSONObject("configs_key"), new Date(jSONObject.getLong("fetch_time_key")), jSONObject.getJSONArray("abt_experiments_key"), optJSONObject);
    }

    /* renamed from: g */
    public static C7039b m12514g() {
        return new C7039b();
    }

    /* renamed from: c */
    public JSONArray mo40043c() {
        return this.f9436d;
    }

    /* renamed from: d */
    public JSONObject mo40044d() {
        return this.f9434b;
    }

    /* renamed from: e */
    public Date mo40045e() {
        return this.f9435c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7037e)) {
            return false;
        }
        return this.f9433a.toString().equals(((C7037e) obj).toString());
    }

    /* renamed from: f */
    public JSONObject mo40047f() {
        return this.f9437e;
    }

    public int hashCode() {
        return this.f9433a.hashCode();
    }

    public String toString() {
        return this.f9433a.toString();
    }

    private C7037e(JSONObject jSONObject, Date date, JSONArray jSONArray, JSONObject jSONObject2) {
        JSONObject jSONObject3 = new JSONObject();
        jSONObject3.put("configs_key", jSONObject);
        jSONObject3.put("fetch_time_key", date.getTime());
        jSONObject3.put("abt_experiments_key", jSONArray);
        jSONObject3.put("personalization_metadata_key", jSONObject2);
        this.f9434b = jSONObject;
        this.f9435c = date;
        this.f9436d = jSONArray;
        this.f9437e = jSONObject2;
        this.f9433a = jSONObject3;
    }
}
