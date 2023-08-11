package p154l8;

import android.content.Context;
import android.content.pm.PackageManager;
import android.net.TrafficStats;
import android.text.TextUtils;
import android.util.JsonReader;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.autofill.HintConstants;
import androidx.browser.trusted.sharing.ShareTarget;
import com.adjust.sdk.Constants;
import com.google.firebase.installations.FirebaseInstallationsException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.nio.charset.Charset;
import java.util.regex.Pattern;
import java.util.zip.GZIPOutputStream;
import org.json.JSONException;
import org.json.JSONObject;
import p113h8.C8030b;
import p154l8.C8760d;
import p154l8.C8764f;
import p203q7.C9322f;
import p214r8.C9403i;
import p231t4.C9713p;
import p286y4.C10667a;
import p286y4.C10676j;

/* renamed from: l8.c */
/* compiled from: FirebaseInstallationServiceClient */
public class C8759c {

    /* renamed from: e */
    private static final Pattern f12613e = Pattern.compile("[0-9]+s");

    /* renamed from: f */
    private static final Charset f12614f = Charset.forName(Constants.ENCODING);

    /* renamed from: a */
    private final Context f12615a;

    /* renamed from: b */
    private final C8030b<C9403i> f12616b;

    /* renamed from: c */
    private final C8030b<C9322f> f12617c;

    /* renamed from: d */
    private final C8763e f12618d = new C8763e();

    public C8759c(@NonNull Context context, @NonNull C8030b<C9403i> bVar, @NonNull C8030b<C9322f> bVar2) {
        this.f12615a = context;
        this.f12616b = bVar;
        this.f12617c = bVar2;
    }

    /* renamed from: a */
    private static String m17725a(@Nullable String str, @NonNull String str2, @NonNull String str3) {
        String str4;
        Object[] objArr = new Object[3];
        objArr[0] = str2;
        objArr[1] = str3;
        if (TextUtils.isEmpty(str)) {
            str4 = "";
        } else {
            str4 = ", " + str;
        }
        objArr[2] = str4;
        return String.format("Firebase options used while communicating with Firebase server APIs: %s, %s%s", objArr);
    }

    /* renamed from: b */
    private static JSONObject m17726b(@Nullable String str, @NonNull String str2) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("fid", str);
            jSONObject.put("appId", str2);
            jSONObject.put("authVersion", "FIS_v2");
            jSONObject.put("sdkVersion", "a:17.0.0");
            return jSONObject;
        } catch (JSONException e) {
            throw new IllegalStateException(e);
        }
    }

    /* renamed from: c */
    private static JSONObject m17727c() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("sdkVersion", "a:17.0.0");
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("installation", jSONObject);
            return jSONObject2;
        } catch (JSONException e) {
            throw new IllegalStateException(e);
        }
    }

    /* renamed from: f */
    private String m17728f() {
        try {
            Context context = this.f12615a;
            byte[] a = C10667a.m22664a(context, context.getPackageName());
            if (a != null) {
                return C10676j.m22690b(a, false);
            }
            Log.e("ContentValues", "Could not get fingerprint hash for package: " + this.f12615a.getPackageName());
            return null;
        } catch (PackageManager.NameNotFoundException e) {
            Log.e("ContentValues", "No such package: " + this.f12615a.getPackageName(), e);
            return null;
        }
    }

    /* renamed from: g */
    private URL m17729g(String str) {
        try {
            return new URL(String.format("https://%s/%s/%s", new Object[]{"firebaseinstallations.googleapis.com", "v1", str}));
        } catch (MalformedURLException e) {
            throw new FirebaseInstallationsException(e.getMessage(), FirebaseInstallationsException.C6939a.UNAVAILABLE);
        }
    }

    /* renamed from: h */
    private static byte[] m17730h(JSONObject jSONObject) {
        return jSONObject.toString().getBytes(Constants.ENCODING);
    }

    /* renamed from: i */
    private static boolean m17731i(int i) {
        if (i < 200 || i >= 300) {
            return false;
        }
        return true;
    }

    /* renamed from: j */
    private static void m17732j() {
        Log.e("Firebase-Installations", "Firebase Installations can not communicate with Firebase server APIs due to invalid configuration. Please update your Firebase initialization process and set valid Firebase options (API key, Project ID, Application ID) when initializing Firebase.");
    }

    /* renamed from: k */
    private static void m17733k(HttpURLConnection httpURLConnection, @Nullable String str, @NonNull String str2, @NonNull String str3) {
        String o = m17737o(httpURLConnection);
        if (!TextUtils.isEmpty(o)) {
            Log.w("Firebase-Installations", o);
            Log.w("Firebase-Installations", m17725a(str, str2, str3));
        }
    }

    /* renamed from: l */
    private HttpURLConnection m17734l(URL url, String str) {
        C9322f.C9323a a;
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
            httpURLConnection.setConnectTimeout(10000);
            httpURLConnection.setUseCaches(false);
            httpURLConnection.setReadTimeout(10000);
            httpURLConnection.addRequestProperty("Content-Type", "application/json");
            httpURLConnection.addRequestProperty("Accept", "application/json");
            httpURLConnection.addRequestProperty("Content-Encoding", "gzip");
            httpURLConnection.addRequestProperty("Cache-Control", "no-cache");
            httpURLConnection.addRequestProperty("X-Android-Package", this.f12615a.getPackageName());
            if (!(this.f12617c.get() == null || this.f12616b.get() == null || (a = this.f12617c.get().mo43611a("fire-installations-id")) == C9322f.C9323a.NONE)) {
                httpURLConnection.addRequestProperty("x-firebase-client", this.f12616b.get().mo43820a());
                httpURLConnection.addRequestProperty("x-firebase-client-log-type", Integer.toString(a.mo43612a()));
            }
            httpURLConnection.addRequestProperty("X-Android-Cert", m17728f());
            httpURLConnection.addRequestProperty("x-goog-api-key", str);
            return httpURLConnection;
        } catch (IOException unused) {
            throw new FirebaseInstallationsException("Firebase Installations Service is unavailable. Please try again later.", FirebaseInstallationsException.C6939a.UNAVAILABLE);
        }
    }

    /* renamed from: m */
    static long m17735m(String str) {
        C9713p.m20267b(f12613e.matcher(str).matches(), "Invalid Expiration Timestamp.");
        if (str == null || str.length() == 0) {
            return 0;
        }
        return Long.parseLong(str.substring(0, str.length() - 1));
    }

    /* renamed from: n */
    private C8760d m17736n(HttpURLConnection httpURLConnection) {
        InputStream inputStream = httpURLConnection.getInputStream();
        JsonReader jsonReader = new JsonReader(new InputStreamReader(inputStream, f12614f));
        C8764f.C8765a a = C8764f.m17762a();
        C8760d.C8761a a2 = C8760d.m17744a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            if (nextName.equals(HintConstants.AUTOFILL_HINT_NAME)) {
                a2.mo42907f(jsonReader.nextString());
            } else if (nextName.equals("fid")) {
                a2.mo42904c(jsonReader.nextString());
            } else if (nextName.equals("refreshToken")) {
                a2.mo42905d(jsonReader.nextString());
            } else if (nextName.equals("authToken")) {
                jsonReader.beginObject();
                while (jsonReader.hasNext()) {
                    String nextName2 = jsonReader.nextName();
                    if (nextName2.equals("token")) {
                        a.mo42916c(jsonReader.nextString());
                    } else if (nextName2.equals("expiresIn")) {
                        a.mo42917d(m17735m(jsonReader.nextString()));
                    } else {
                        jsonReader.skipValue();
                    }
                }
                a2.mo42903b(a.mo42914a());
                jsonReader.endObject();
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        jsonReader.close();
        inputStream.close();
        return a2.mo42906e(C8760d.C8762b.OK).mo42902a();
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x004f */
    @androidx.annotation.Nullable
    /* renamed from: o */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.String m17737o(java.net.HttpURLConnection r7) {
        /*
            java.io.InputStream r0 = r7.getErrorStream()
            r1 = 0
            if (r0 != 0) goto L_0x0008
            return r1
        L_0x0008:
            java.io.BufferedReader r2 = new java.io.BufferedReader
            java.io.InputStreamReader r3 = new java.io.InputStreamReader
            java.nio.charset.Charset r4 = f12614f
            r3.<init>(r0, r4)
            r2.<init>(r3)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x004f, all -> 0x004a }
            r0.<init>()     // Catch:{ IOException -> 0x004f, all -> 0x004a }
        L_0x0019:
            java.lang.String r3 = r2.readLine()     // Catch:{ IOException -> 0x004f, all -> 0x004a }
            if (r3 == 0) goto L_0x0028
            r0.append(r3)     // Catch:{ IOException -> 0x004f, all -> 0x004a }
            r3 = 10
            r0.append(r3)     // Catch:{ IOException -> 0x004f, all -> 0x004a }
            goto L_0x0019
        L_0x0028:
            java.lang.String r3 = "Error when communicating with the Firebase Installations server API. HTTP response: [%d %s: %s]"
            r4 = 3
            java.lang.Object[] r4 = new java.lang.Object[r4]     // Catch:{ IOException -> 0x004f, all -> 0x004a }
            int r5 = r7.getResponseCode()     // Catch:{ IOException -> 0x004f, all -> 0x004a }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch:{ IOException -> 0x004f, all -> 0x004a }
            r6 = 0
            r4[r6] = r5     // Catch:{ IOException -> 0x004f, all -> 0x004a }
            java.lang.String r7 = r7.getResponseMessage()     // Catch:{ IOException -> 0x004f, all -> 0x004a }
            r5 = 1
            r4[r5] = r7     // Catch:{ IOException -> 0x004f, all -> 0x004a }
            r7 = 2
            r4[r7] = r0     // Catch:{ IOException -> 0x004f, all -> 0x004a }
            java.lang.String r7 = java.lang.String.format(r3, r4)     // Catch:{ IOException -> 0x004f, all -> 0x004a }
            r2.close()     // Catch:{ IOException -> 0x0049 }
        L_0x0049:
            return r7
        L_0x004a:
            r7 = move-exception
            r2.close()     // Catch:{ IOException -> 0x004e }
        L_0x004e:
            throw r7
        L_0x004f:
            r2.close()     // Catch:{ IOException -> 0x0052 }
        L_0x0052:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p154l8.C8759c.m17737o(java.net.HttpURLConnection):java.lang.String");
    }

    /* renamed from: p */
    private C8764f m17738p(HttpURLConnection httpURLConnection) {
        InputStream inputStream = httpURLConnection.getInputStream();
        JsonReader jsonReader = new JsonReader(new InputStreamReader(inputStream, f12614f));
        C8764f.C8765a a = C8764f.m17762a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            if (nextName.equals("token")) {
                a.mo42916c(jsonReader.nextString());
            } else if (nextName.equals("expiresIn")) {
                a.mo42917d(m17735m(jsonReader.nextString()));
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        jsonReader.close();
        inputStream.close();
        return a.mo42915b(C8764f.C8766b.OK).mo42914a();
    }

    /* renamed from: q */
    private void m17739q(HttpURLConnection httpURLConnection, @Nullable String str, @NonNull String str2) {
        m17741s(httpURLConnection, m17730h(m17726b(str, str2)));
    }

    /* renamed from: r */
    private void m17740r(HttpURLConnection httpURLConnection) {
        m17741s(httpURLConnection, m17730h(m17727c()));
    }

    /* renamed from: s */
    private static void m17741s(URLConnection uRLConnection, byte[] bArr) {
        OutputStream outputStream = uRLConnection.getOutputStream();
        if (outputStream != null) {
            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(outputStream);
            try {
                gZIPOutputStream.write(bArr);
            } finally {
                try {
                    gZIPOutputStream.close();
                    outputStream.close();
                } catch (IOException unused) {
                }
            }
        } else {
            throw new IOException("Cannot send request to FIS servers. No OutputStream available.");
        }
    }

    @NonNull
    /* renamed from: d */
    public C8760d mo42918d(@NonNull String str, @Nullable String str2, @NonNull String str3, @NonNull String str4, @Nullable String str5) {
        C8760d n;
        if (this.f12618d.mo42920b()) {
            int i = 0;
            URL g = m17729g(String.format("projects/%s/installations", new Object[]{str3}));
            while (i <= 1) {
                TrafficStats.setThreadStatsTag(32769);
                HttpURLConnection l = m17734l(g, str);
                try {
                    l.setRequestMethod(ShareTarget.METHOD_POST);
                    l.setDoOutput(true);
                    if (str5 != null) {
                        l.addRequestProperty("x-goog-fis-android-iid-migration-auth", str5);
                    }
                    m17739q(l, str2, str4);
                    int responseCode = l.getResponseCode();
                    this.f12618d.mo42921f(responseCode);
                    if (m17731i(responseCode)) {
                        n = m17736n(l);
                    } else {
                        m17733k(l, str4, str, str3);
                        if (responseCode == 429) {
                            throw new FirebaseInstallationsException("Firebase servers have received too many requests from this client in a short period of time. Please try again later.", FirebaseInstallationsException.C6939a.TOO_MANY_REQUESTS);
                        } else if (responseCode < 500 || responseCode >= 600) {
                            m17732j();
                            n = C8760d.m17744a().mo42906e(C8760d.C8762b.BAD_CONFIG).mo42902a();
                        } else {
                            l.disconnect();
                            TrafficStats.clearThreadStatsTag();
                            i++;
                        }
                    }
                    l.disconnect();
                    TrafficStats.clearThreadStatsTag();
                    return n;
                } catch (IOException | AssertionError unused) {
                } catch (Throwable th) {
                    l.disconnect();
                    TrafficStats.clearThreadStatsTag();
                    throw th;
                }
            }
            throw new FirebaseInstallationsException("Firebase Installations Service is unavailable. Please try again later.", FirebaseInstallationsException.C6939a.UNAVAILABLE);
        }
        throw new FirebaseInstallationsException("Firebase Installations Service is unavailable. Please try again later.", FirebaseInstallationsException.C6939a.UNAVAILABLE);
    }

    @NonNull
    /* renamed from: e */
    public C8764f mo42919e(@NonNull String str, @NonNull String str2, @NonNull String str3, @NonNull String str4) {
        C8764f p;
        if (this.f12618d.mo42920b()) {
            int i = 0;
            URL g = m17729g(String.format("projects/%s/installations/%s/authTokens:generate", new Object[]{str3, str2}));
            while (i <= 1) {
                TrafficStats.setThreadStatsTag(32771);
                HttpURLConnection l = m17734l(g, str);
                try {
                    l.setRequestMethod(ShareTarget.METHOD_POST);
                    l.addRequestProperty("Authorization", "FIS_v2 " + str4);
                    l.setDoOutput(true);
                    m17740r(l);
                    int responseCode = l.getResponseCode();
                    this.f12618d.mo42921f(responseCode);
                    if (m17731i(responseCode)) {
                        p = m17738p(l);
                    } else {
                        m17733k(l, (String) null, str, str3);
                        if (responseCode != 401) {
                            if (responseCode != 404) {
                                if (responseCode == 429) {
                                    throw new FirebaseInstallationsException("Firebase servers have received too many requests from this client in a short period of time. Please try again later.", FirebaseInstallationsException.C6939a.TOO_MANY_REQUESTS);
                                } else if (responseCode < 500 || responseCode >= 600) {
                                    m17732j();
                                    p = C8764f.m17762a().mo42915b(C8764f.C8766b.BAD_CONFIG).mo42914a();
                                } else {
                                    l.disconnect();
                                    TrafficStats.clearThreadStatsTag();
                                    i++;
                                }
                            }
                        }
                        p = C8764f.m17762a().mo42915b(C8764f.C8766b.AUTH_ERROR).mo42914a();
                    }
                    l.disconnect();
                    TrafficStats.clearThreadStatsTag();
                    return p;
                } catch (IOException | AssertionError unused) {
                } catch (Throwable th) {
                    l.disconnect();
                    TrafficStats.clearThreadStatsTag();
                    throw th;
                }
            }
            throw new FirebaseInstallationsException("Firebase Installations Service is unavailable. Please try again later.", FirebaseInstallationsException.C6939a.UNAVAILABLE);
        }
        throw new FirebaseInstallationsException("Firebase Installations Service is unavailable. Please try again later.", FirebaseInstallationsException.C6939a.UNAVAILABLE);
    }
}
