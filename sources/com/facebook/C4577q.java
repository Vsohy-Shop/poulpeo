package com.facebook;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.adjust.sdk.Constants;
import java.util.ArrayList;
import java.util.Date;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p198q2.C9194v;

/* renamed from: com.facebook.q */
/* compiled from: LegacyTokenHelper.kt */
public final class C4577q {

    /* renamed from: c */
    private static final String f4296c;

    /* renamed from: d */
    public static final C4578a f4297d = new C4578a((DefaultConstructorMarker) null);

    /* renamed from: a */
    private final String f4298a;

    /* renamed from: b */
    private final SharedPreferences f4299b;

    /* renamed from: com.facebook.q$a */
    /* compiled from: LegacyTokenHelper.kt */
    public static final class C4578a {
        private C4578a() {
        }

        public /* synthetic */ C4578a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: b */
        private final Date m5753b(Bundle bundle, String str) {
            if (bundle == null) {
                return null;
            }
            long j = bundle.getLong(str, Long.MIN_VALUE);
            if (j == Long.MIN_VALUE) {
                return null;
            }
            return new Date(j);
        }

        /* renamed from: a */
        public final String mo31719a(Bundle bundle) {
            C12775o.m28639i(bundle, "bundle");
            return bundle.getString("com.facebook.TokenCachingStrategy.ApplicationId");
        }

        /* renamed from: c */
        public final Date mo31720c(Bundle bundle) {
            C12775o.m28639i(bundle, "bundle");
            return m5753b(bundle, "com.facebook.TokenCachingStrategy.ExpirationDate");
        }

        /* renamed from: d */
        public final Date mo31721d(Bundle bundle) {
            C12775o.m28639i(bundle, "bundle");
            return m5753b(bundle, "com.facebook.TokenCachingStrategy.LastRefreshDate");
        }

        /* renamed from: e */
        public final C4537e mo31722e(Bundle bundle) {
            C12775o.m28639i(bundle, "bundle");
            if (bundle.containsKey("com.facebook.TokenCachingStrategy.AccessTokenSource")) {
                return (C4537e) bundle.getSerializable("com.facebook.TokenCachingStrategy.AccessTokenSource");
            }
            if (bundle.getBoolean("com.facebook.TokenCachingStrategy.IsSSO")) {
                return C4537e.FACEBOOK_APPLICATION_WEB;
            }
            return C4537e.WEB_VIEW;
        }

        /* renamed from: f */
        public final String mo31723f(Bundle bundle) {
            C12775o.m28639i(bundle, "bundle");
            return bundle.getString("com.facebook.TokenCachingStrategy.Token");
        }

        /* renamed from: g */
        public final boolean mo31724g(Bundle bundle) {
            String string;
            boolean z;
            if (bundle == null || (string = bundle.getString("com.facebook.TokenCachingStrategy.Token")) == null) {
                return false;
            }
            if (string.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (!z && bundle.getLong("com.facebook.TokenCachingStrategy.ExpirationDate", 0) != 0) {
                return true;
            }
            return false;
        }
    }

    static {
        String simpleName = C4577q.class.getSimpleName();
        C12775o.m28638h(simpleName, "LegacyTokenHelper::class.java.simpleName");
        f4296c = simpleName;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0014, code lost:
        if ((r4.length() == 0) != false) goto L_0x0016;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C4577q(android.content.Context r3, java.lang.String r4) {
        /*
            r2 = this;
            java.lang.String r0 = "context"
            kotlin.jvm.internal.C12775o.m28639i(r3, r0)
            r2.<init>()
            r0 = 0
            if (r4 == 0) goto L_0x0016
            int r1 = r4.length()
            if (r1 != 0) goto L_0x0013
            r1 = 1
            goto L_0x0014
        L_0x0013:
            r1 = r0
        L_0x0014:
            if (r1 == 0) goto L_0x0018
        L_0x0016:
            java.lang.String r4 = "com.facebook.SharedPreferencesTokenCachingStrategy.DEFAULT_KEY"
        L_0x0018:
            r2.f4298a = r4
            android.content.Context r1 = r3.getApplicationContext()
            if (r1 == 0) goto L_0x0021
            r3 = r1
        L_0x0021:
            android.content.SharedPreferences r3 = r3.getSharedPreferences(r4, r0)
            java.lang.String r4 = "context.getSharedPrefere…ey, Context.MODE_PRIVATE)"
            kotlin.jvm.internal.C12775o.m28638h(r3, r4)
            r2.f4299b = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.C4577q.<init>(android.content.Context, java.lang.String):void");
    }

    /* renamed from: b */
    private final void m5750b(String str, Bundle bundle) {
        String str2;
        String string = this.f4299b.getString(str, "{}");
        if (string != null) {
            JSONObject jSONObject = new JSONObject(string);
            String string2 = jSONObject.getString("valueType");
            if (C12775o.m28634d(string2, "bool")) {
                bundle.putBoolean(str, jSONObject.getBoolean("value"));
                return;
            }
            int i = 0;
            if (C12775o.m28634d(string2, "bool[]")) {
                JSONArray jSONArray = jSONObject.getJSONArray("value");
                int length = jSONArray.length();
                boolean[] zArr = new boolean[length];
                while (i < length) {
                    zArr[i] = jSONArray.getBoolean(i);
                    i++;
                }
                bundle.putBooleanArray(str, zArr);
            } else if (C12775o.m28634d(string2, "byte")) {
                bundle.putByte(str, (byte) jSONObject.getInt("value"));
            } else if (C12775o.m28634d(string2, "byte[]")) {
                JSONArray jSONArray2 = jSONObject.getJSONArray("value");
                int length2 = jSONArray2.length();
                byte[] bArr = new byte[length2];
                while (i < length2) {
                    bArr[i] = (byte) jSONArray2.getInt(i);
                    i++;
                }
                bundle.putByteArray(str, bArr);
            } else if (C12775o.m28634d(string2, "short")) {
                bundle.putShort(str, (short) jSONObject.getInt("value"));
            } else if (C12775o.m28634d(string2, "short[]")) {
                JSONArray jSONArray3 = jSONObject.getJSONArray("value");
                int length3 = jSONArray3.length();
                short[] sArr = new short[length3];
                while (i < length3) {
                    sArr[i] = (short) jSONArray3.getInt(i);
                    i++;
                }
                bundle.putShortArray(str, sArr);
            } else if (C12775o.m28634d(string2, "int")) {
                bundle.putInt(str, jSONObject.getInt("value"));
            } else if (C12775o.m28634d(string2, "int[]")) {
                JSONArray jSONArray4 = jSONObject.getJSONArray("value");
                int length4 = jSONArray4.length();
                int[] iArr = new int[length4];
                while (i < length4) {
                    iArr[i] = jSONArray4.getInt(i);
                    i++;
                }
                bundle.putIntArray(str, iArr);
            } else if (C12775o.m28634d(string2, Constants.LONG)) {
                bundle.putLong(str, jSONObject.getLong("value"));
            } else if (C12775o.m28634d(string2, "long[]")) {
                JSONArray jSONArray5 = jSONObject.getJSONArray("value");
                int length5 = jSONArray5.length();
                long[] jArr = new long[length5];
                while (i < length5) {
                    jArr[i] = jSONArray5.getLong(i);
                    i++;
                }
                bundle.putLongArray(str, jArr);
            } else if (C12775o.m28634d(string2, TypedValues.Custom.S_FLOAT)) {
                bundle.putFloat(str, (float) jSONObject.getDouble("value"));
            } else if (C12775o.m28634d(string2, "float[]")) {
                JSONArray jSONArray6 = jSONObject.getJSONArray("value");
                int length6 = jSONArray6.length();
                float[] fArr = new float[length6];
                while (i < length6) {
                    fArr[i] = (float) jSONArray6.getDouble(i);
                    i++;
                }
                bundle.putFloatArray(str, fArr);
            } else if (C12775o.m28634d(string2, "double")) {
                bundle.putDouble(str, jSONObject.getDouble("value"));
            } else if (C12775o.m28634d(string2, "double[]")) {
                JSONArray jSONArray7 = jSONObject.getJSONArray("value");
                int length7 = jSONArray7.length();
                double[] dArr = new double[length7];
                while (i < length7) {
                    dArr[i] = jSONArray7.getDouble(i);
                    i++;
                }
                bundle.putDoubleArray(str, dArr);
            } else if (C12775o.m28634d(string2, "char")) {
                String string3 = jSONObject.getString("value");
                if (string3 != null && string3.length() == 1) {
                    bundle.putChar(str, string3.charAt(0));
                }
            } else if (C12775o.m28634d(string2, "char[]")) {
                JSONArray jSONArray8 = jSONObject.getJSONArray("value");
                int length8 = jSONArray8.length();
                char[] cArr = new char[length8];
                for (int i2 = 0; i2 < length8; i2++) {
                    String string4 = jSONArray8.getString(i2);
                    if (string4 != null && string4.length() == 1) {
                        cArr[i2] = string4.charAt(0);
                    }
                }
                bundle.putCharArray(str, cArr);
            } else if (C12775o.m28634d(string2, TypedValues.Custom.S_STRING)) {
                bundle.putString(str, jSONObject.getString("value"));
            } else if (C12775o.m28634d(string2, "stringList")) {
                JSONArray jSONArray9 = jSONObject.getJSONArray("value");
                int length9 = jSONArray9.length();
                ArrayList arrayList = new ArrayList(length9);
                while (i < length9) {
                    Object obj = jSONArray9.get(i);
                    if (obj == JSONObject.NULL) {
                        str2 = null;
                    } else if (obj != null) {
                        str2 = (String) obj;
                    } else {
                        throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                    }
                    arrayList.add(i, str2);
                    i++;
                }
                bundle.putStringArrayList(str, arrayList);
            } else if (C12775o.m28634d(string2, "enum")) {
                try {
                    bundle.putSerializable(str, Enum.valueOf(Class.forName(jSONObject.getString("enumType")), jSONObject.getString("value")));
                } catch (ClassNotFoundException | IllegalArgumentException unused) {
                }
            }
        } else {
            throw new IllegalStateException("Required value was null.".toString());
        }
    }

    /* renamed from: a */
    public final void mo31717a() {
        this.f4299b.edit().clear().apply();
    }

    /* renamed from: c */
    public final Bundle mo31718c() {
        Bundle bundle = new Bundle();
        for (String next : this.f4299b.getAll().keySet()) {
            try {
                C12775o.m28638h(next, "key");
                m5750b(next, bundle);
            } catch (JSONException e) {
                C9194v.C9195a aVar = C9194v.f13504f;
                C4579r rVar = C4579r.CACHE;
                String str = f4296c;
                aVar.mo43480a(rVar, 5, str, "Error reading cached value for key: '" + next + "' -- " + e);
                return null;
            }
        }
        return bundle;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C4577q(Context context, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : str);
    }
}
