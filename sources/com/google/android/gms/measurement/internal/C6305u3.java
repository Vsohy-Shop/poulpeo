package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences;
import android.os.Bundle;
import androidx.annotation.WorkerThread;
import com.appboy.Constants;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p231t4.C9713p;

/* renamed from: com.google.android.gms.measurement.internal.u3 */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.0.0 */
public final class C6305u3 {

    /* renamed from: a */
    private final String f8256a = "default_event_parameters";

    /* renamed from: b */
    private final Bundle f8257b = new Bundle();

    /* renamed from: c */
    private Bundle f8258c;

    /* renamed from: d */
    final /* synthetic */ C6360z3 f8259d;

    public C6305u3(C6360z3 z3Var, String str, Bundle bundle) {
        this.f8259d = z3Var;
        C9713p.m20271f("default_event_parameters");
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(3:35|36|47) */
    /* JADX WARNING: Code restructure failed: missing block: B:36:?, code lost:
        r11.f8259d.f7899a.mo34920b().mo35075r().mo35037a("Error reading value from SharedPreferences. Value dropped");
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:35:0x00a3 */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x006d  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x009b A[Catch:{ NumberFormatException | JSONException -> 0x00a3 }] */
    @androidx.annotation.WorkerThread
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.os.Bundle mo35312a() {
        /*
            r11 = this;
            android.os.Bundle r0 = r11.f8258c
            if (r0 == 0) goto L_0x0006
            goto L_0x00d4
        L_0x0006:
            com.google.android.gms.measurement.internal.z3 r0 = r11.f8259d
            android.content.SharedPreferences r0 = r0.mo35423o()
            java.lang.String r1 = r11.f8256a
            r2 = 0
            java.lang.String r0 = r0.getString(r1, r2)
            if (r0 == 0) goto L_0x00cc
            android.os.Bundle r1 = new android.os.Bundle     // Catch:{ JSONException -> 0x00bb }
            r1.<init>()     // Catch:{ JSONException -> 0x00bb }
            org.json.JSONArray r2 = new org.json.JSONArray     // Catch:{ JSONException -> 0x00bb }
            r2.<init>(r0)     // Catch:{ JSONException -> 0x00bb }
            r0 = 0
            r3 = r0
        L_0x0021:
            int r4 = r2.length()     // Catch:{ JSONException -> 0x00bb }
            if (r3 >= r4) goto L_0x00b8
            org.json.JSONObject r4 = r2.getJSONObject(r3)     // Catch:{ NumberFormatException | JSONException -> 0x00a3 }
            java.lang.String r5 = "n"
            java.lang.String r5 = r4.getString(r5)     // Catch:{ NumberFormatException | JSONException -> 0x00a3 }
            java.lang.String r6 = "t"
            java.lang.String r6 = r4.getString(r6)     // Catch:{ NumberFormatException | JSONException -> 0x00a3 }
            int r7 = r6.hashCode()     // Catch:{ NumberFormatException | JSONException -> 0x00a3 }
            r8 = 100
            r9 = 2
            r10 = 1
            if (r7 == r8) goto L_0x005e
            r8 = 108(0x6c, float:1.51E-43)
            if (r7 == r8) goto L_0x0054
            r8 = 115(0x73, float:1.61E-43)
            if (r7 == r8) goto L_0x004a
            goto L_0x0068
        L_0x004a:
            java.lang.String r7 = "s"
            boolean r7 = r6.equals(r7)
            if (r7 == 0) goto L_0x0068
            r7 = r0
            goto L_0x0069
        L_0x0054:
            java.lang.String r7 = "l"
            boolean r7 = r6.equals(r7)
            if (r7 == 0) goto L_0x0068
            r7 = r9
            goto L_0x0069
        L_0x005e:
            java.lang.String r7 = "d"
            boolean r7 = r6.equals(r7)
            if (r7 == 0) goto L_0x0068
            r7 = r10
            goto L_0x0069
        L_0x0068:
            r7 = -1
        L_0x0069:
            java.lang.String r8 = "v"
            if (r7 == 0) goto L_0x009b
            if (r7 == r10) goto L_0x008f
            if (r7 == r9) goto L_0x0083
            com.google.android.gms.measurement.internal.z3 r4 = r11.f8259d     // Catch:{ NumberFormatException | JSONException -> 0x00a3 }
            com.google.android.gms.measurement.internal.p4 r4 = r4.f7899a     // Catch:{ NumberFormatException | JSONException -> 0x00a3 }
            com.google.android.gms.measurement.internal.l3 r4 = r4.mo34920b()     // Catch:{ NumberFormatException | JSONException -> 0x00a3 }
            com.google.android.gms.measurement.internal.j3 r4 = r4.mo35075r()     // Catch:{ NumberFormatException | JSONException -> 0x00a3 }
            java.lang.String r5 = "Unrecognized persisted bundle type. Type"
            r4.mo35038b(r5, r6)     // Catch:{ NumberFormatException | JSONException -> 0x00a3 }
            goto L_0x00b4
        L_0x0083:
            java.lang.String r4 = r4.getString(r8)     // Catch:{ NumberFormatException | JSONException -> 0x00a3 }
            long r6 = java.lang.Long.parseLong(r4)     // Catch:{ NumberFormatException | JSONException -> 0x00a3 }
            r1.putLong(r5, r6)     // Catch:{ NumberFormatException | JSONException -> 0x00a3 }
            goto L_0x00b4
        L_0x008f:
            java.lang.String r4 = r4.getString(r8)     // Catch:{ NumberFormatException | JSONException -> 0x00a3 }
            double r6 = java.lang.Double.parseDouble(r4)     // Catch:{ NumberFormatException | JSONException -> 0x00a3 }
            r1.putDouble(r5, r6)     // Catch:{ NumberFormatException | JSONException -> 0x00a3 }
            goto L_0x00b4
        L_0x009b:
            java.lang.String r4 = r4.getString(r8)     // Catch:{ NumberFormatException | JSONException -> 0x00a3 }
            r1.putString(r5, r4)     // Catch:{ NumberFormatException | JSONException -> 0x00a3 }
            goto L_0x00b4
        L_0x00a3:
            com.google.android.gms.measurement.internal.z3 r4 = r11.f8259d     // Catch:{ JSONException -> 0x00bb }
            com.google.android.gms.measurement.internal.p4 r4 = r4.f7899a     // Catch:{ JSONException -> 0x00bb }
            com.google.android.gms.measurement.internal.l3 r4 = r4.mo34920b()     // Catch:{ JSONException -> 0x00bb }
            com.google.android.gms.measurement.internal.j3 r4 = r4.mo35075r()     // Catch:{ JSONException -> 0x00bb }
            java.lang.String r5 = "Error reading value from SharedPreferences. Value dropped"
            r4.mo35037a(r5)     // Catch:{ JSONException -> 0x00bb }
        L_0x00b4:
            int r3 = r3 + 1
            goto L_0x0021
        L_0x00b8:
            r11.f8258c = r1     // Catch:{ JSONException -> 0x00bb }
            goto L_0x00cc
        L_0x00bb:
            com.google.android.gms.measurement.internal.z3 r0 = r11.f8259d
            com.google.android.gms.measurement.internal.p4 r0 = r0.f7899a
            com.google.android.gms.measurement.internal.l3 r0 = r0.mo34920b()
            com.google.android.gms.measurement.internal.j3 r0 = r0.mo35075r()
            java.lang.String r1 = "Error loading bundle from SharedPreferences. Values will be lost"
            r0.mo35037a(r1)
        L_0x00cc:
            android.os.Bundle r0 = r11.f8258c
            if (r0 != 0) goto L_0x00d4
            android.os.Bundle r0 = r11.f8257b
            r11.f8258c = r0
        L_0x00d4:
            android.os.Bundle r0 = r11.f8258c
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C6305u3.mo35312a():android.os.Bundle");
    }

    @WorkerThread
    /* renamed from: b */
    public final void mo35313b(Bundle bundle) {
        if (bundle == null) {
            bundle = new Bundle();
        }
        SharedPreferences.Editor edit = this.f8259d.mo35423o().edit();
        if (bundle.size() == 0) {
            edit.remove(this.f8256a);
        } else {
            String str = this.f8256a;
            JSONArray jSONArray = new JSONArray();
            for (String next : bundle.keySet()) {
                Object obj = bundle.get(next);
                if (obj != null) {
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put(Constants.APPBOY_PUSH_CUSTOM_NOTIFICATION_ID, next);
                        jSONObject.put("v", obj.toString());
                        if (obj instanceof String) {
                            jSONObject.put(Constants.APPBOY_PUSH_TITLE_KEY, Constants.APPBOY_PUSH_SUMMARY_TEXT_KEY);
                        } else if (obj instanceof Long) {
                            jSONObject.put(Constants.APPBOY_PUSH_TITLE_KEY, "l");
                        } else if (obj instanceof Double) {
                            jSONObject.put(Constants.APPBOY_PUSH_TITLE_KEY, Constants.APPBOY_PUSH_NOTIFICATION_SOUND_DEFAULT_VALUE);
                        } else {
                            this.f8259d.f7899a.mo34920b().mo35075r().mo35038b("Cannot serialize bundle value to SharedPreferences. Type", obj.getClass());
                        }
                        jSONArray.put(jSONObject);
                    } catch (JSONException e) {
                        this.f8259d.f7899a.mo34920b().mo35075r().mo35038b("Cannot serialize bundle value to SharedPreferences", e);
                    }
                }
            }
            edit.putString(str, jSONArray.toString());
        }
        edit.apply();
        this.f8258c = bundle;
    }
}
