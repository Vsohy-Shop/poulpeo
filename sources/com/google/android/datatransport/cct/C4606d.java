package com.google.android.datatransport.cct;

import android.content.Context;
import android.content.pm.PackageManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.telephony.TelephonyManager;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.autofill.HintConstants;
import androidx.browser.trusted.sharing.ShareTarget;
import com.adjust.sdk.Constants;
import com.google.firebase.encoders.EncodingException;
import com.rmn.apiclient.impl.api.call.APIParams;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ConnectException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.UnknownHostException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;
import p119i3.C8109b;
import p129j3.C8355a;
import p129j3.C8381j;
import p129j3.C8382k;
import p129j3.C8385l;
import p129j3.C8387m;
import p129j3.C8389n;
import p129j3.C8390o;
import p129j3.C8394p;
import p139k3.C8538h;
import p139k3.C8539i;
import p149l3.C8662f;
import p149l3.C8664g;
import p149l3.C8672m;
import p153l7.C8745a;
import p189p3.C9050a;
import p199q3.C9214b;
import p252v3.C9927a;

/* renamed from: com.google.android.datatransport.cct.d */
/* compiled from: CctTransportBackend */
final class C4606d implements C8672m {

    /* renamed from: a */
    private final C8745a f4404a;

    /* renamed from: b */
    private final ConnectivityManager f4405b;

    /* renamed from: c */
    private final Context f4406c;

    /* renamed from: d */
    final URL f4407d;

    /* renamed from: e */
    private final C9927a f4408e;

    /* renamed from: f */
    private final C9927a f4409f;

    /* renamed from: g */
    private final int f4410g;

    /* renamed from: com.google.android.datatransport.cct.d$a */
    /* compiled from: CctTransportBackend */
    static final class C4607a {

        /* renamed from: a */
        final URL f4411a;

        /* renamed from: b */
        final C8381j f4412b;
        @Nullable

        /* renamed from: c */
        final String f4413c;

        C4607a(URL url, C8381j jVar, @Nullable String str) {
            this.f4411a = url;
            this.f4412b = jVar;
            this.f4413c = str;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public C4607a mo31828a(URL url) {
            return new C4607a(url, this.f4412b, this.f4413c);
        }
    }

    /* renamed from: com.google.android.datatransport.cct.d$b */
    /* compiled from: CctTransportBackend */
    static final class C4608b {

        /* renamed from: a */
        final int f4414a;
        @Nullable

        /* renamed from: b */
        final URL f4415b;

        /* renamed from: c */
        final long f4416c;

        C4608b(int i, @Nullable URL url, long j) {
            this.f4414a = i;
            this.f4415b = url;
            this.f4416c = j;
        }
    }

    C4606d(Context context, C9927a aVar, C9927a aVar2, int i) {
        this.f4404a = C8381j.m16720b();
        this.f4406c = context;
        this.f4405b = (ConnectivityManager) context.getSystemService("connectivity");
        this.f4407d = m5887n(C4603a.f4395c);
        this.f4408e = aVar2;
        this.f4409f = aVar;
        this.f4410g = i;
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public C4608b m5878e(C4607a aVar) {
        GZIPOutputStream gZIPOutputStream;
        InputStream m;
        C9050a.m18380a("CctTransportBackend", "Making request to: %s", aVar.f4411a);
        HttpURLConnection httpURLConnection = (HttpURLConnection) aVar.f4411a.openConnection();
        httpURLConnection.setConnectTimeout(30000);
        httpURLConnection.setReadTimeout(this.f4410g);
        httpURLConnection.setDoOutput(true);
        httpURLConnection.setInstanceFollowRedirects(false);
        httpURLConnection.setRequestMethod(ShareTarget.METHOD_POST);
        httpURLConnection.setRequestProperty("User-Agent", String.format("datatransport/%s android/", new Object[]{"3.1.3"}));
        httpURLConnection.setRequestProperty("Content-Encoding", "gzip");
        httpURLConnection.setRequestProperty("Content-Type", "application/json");
        httpURLConnection.setRequestProperty("Accept-Encoding", "gzip");
        String str = aVar.f4413c;
        if (str != null) {
            httpURLConnection.setRequestProperty("X-Goog-Api-Key", str);
        }
        try {
            OutputStream outputStream = httpURLConnection.getOutputStream();
            try {
                gZIPOutputStream = new GZIPOutputStream(outputStream);
                this.f4404a.mo42884a(aVar.f4412b, new BufferedWriter(new OutputStreamWriter(gZIPOutputStream)));
                gZIPOutputStream.close();
                if (outputStream != null) {
                    outputStream.close();
                }
                int responseCode = httpURLConnection.getResponseCode();
                C9050a.m18384e("CctTransportBackend", "Status Code: " + responseCode);
                C9050a.m18384e("CctTransportBackend", "Content-Type: " + httpURLConnection.getHeaderField("Content-Type"));
                C9050a.m18384e("CctTransportBackend", "Content-Encoding: " + httpURLConnection.getHeaderField("Content-Encoding"));
                if (responseCode == 302 || responseCode == 301 || responseCode == 307) {
                    return new C4608b(responseCode, new URL(httpURLConnection.getHeaderField("Location")), 0);
                }
                if (responseCode != 200) {
                    return new C4608b(responseCode, (URL) null, 0);
                }
                InputStream inputStream = httpURLConnection.getInputStream();
                try {
                    m = m5886m(inputStream, httpURLConnection.getHeaderField("Content-Encoding"));
                    C4608b bVar = new C4608b(responseCode, (URL) null, C8389n.m16765b(new BufferedReader(new InputStreamReader(m))).mo42398c());
                    if (m != null) {
                        m.close();
                    }
                    if (inputStream != null) {
                        inputStream.close();
                    }
                    return bVar;
                } catch (Throwable th) {
                    if (inputStream != null) {
                        try {
                            inputStream.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                    }
                    throw th;
                }
                throw th;
                throw th;
            } catch (Throwable th3) {
                if (outputStream != null) {
                    outputStream.close();
                }
                throw th3;
            }
        } catch (ConnectException | UnknownHostException e) {
            C9050a.m18382c("CctTransportBackend", "Couldn't open connection, returning with 500", e);
            return new C4608b(500, (URL) null, 0);
        } catch (EncodingException | IOException e2) {
            C9050a.m18382c("CctTransportBackend", "Couldn't encode request, returning with 400", e2);
            return new C4608b(Constants.MINIMAL_ERROR_STATUS_CODE, (URL) null, 0);
        } catch (Throwable th4) {
            th3.addSuppressed(th4);
        }
    }

    /* renamed from: f */
    private static int m5879f(NetworkInfo networkInfo) {
        if (networkInfo == null) {
            return C8390o.C8392b.UNKNOWN_MOBILE_SUBTYPE.mo42412b();
        }
        int subtype = networkInfo.getSubtype();
        if (subtype == -1) {
            return C8390o.C8392b.COMBINED.mo42412b();
        }
        if (C8390o.C8392b.m16773a(subtype) != null) {
            return subtype;
        }
        return 0;
    }

    /* renamed from: g */
    private static int m5880g(NetworkInfo networkInfo) {
        if (networkInfo == null) {
            return C8390o.C8393c.NONE.mo42413b();
        }
        return networkInfo.getType();
    }

    /* renamed from: h */
    private static int m5881h(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
        } catch (PackageManager.NameNotFoundException e) {
            C9050a.m18382c("CctTransportBackend", "Unable to find version code for package", e);
            return -1;
        }
    }

    /* renamed from: i */
    private C8381j m5882i(C8662f fVar) {
        C8385l.C8386a aVar;
        HashMap hashMap = new HashMap();
        for (C8539i next : fVar.mo42729b()) {
            String j = next.mo42555j();
            if (!hashMap.containsKey(j)) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(next);
                hashMap.put(j, arrayList);
            } else {
                ((List) hashMap.get(j)).add(next);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (Map.Entry entry : hashMap.entrySet()) {
            C8539i iVar = (C8539i) ((List) entry.getValue()).get(0);
            C8387m.C8388a b = C8387m.m16746a().mo42395f(C8394p.DEFAULT).mo42396g(this.f4409f.mo44504a()).mo42397h(this.f4408e.mo44504a()).mo42391b(C8382k.m16722a().mo42361c(C8382k.C8384b.ANDROID_FIREBASE).mo42360b(C8355a.m16613a().mo42338m(Integer.valueOf(iVar.mo42600g("sdk-version"))).mo42335j(iVar.mo42599b("model")).mo42331f(iVar.mo42599b("hardware")).mo42329d(iVar.mo42599b("device")).mo42337l(iVar.mo42599b("product")).mo42336k(iVar.mo42599b("os-uild")).mo42333h(iVar.mo42599b("manufacturer")).mo42330e(iVar.mo42599b(APIParams.FINGERPRINT)).mo42328c(iVar.mo42599b("country")).mo42332g(iVar.mo42599b("locale")).mo42334i(iVar.mo42599b("mcc_mnc")).mo42327b(iVar.mo42599b("application_build")).mo42326a()).mo42359a());
            try {
                b.mo42410i(Integer.parseInt((String) entry.getKey()));
            } catch (NumberFormatException unused) {
                b.mo42411j((String) entry.getKey());
            }
            ArrayList arrayList3 = new ArrayList();
            for (C8539i iVar2 : (List) entry.getValue()) {
                C8538h e = iVar2.mo42551e();
                C8109b b2 = e.mo42595b();
                if (b2.equals(C8109b.m15970b("proto"))) {
                    aVar = C8385l.m16730j(e.mo42594a());
                } else if (b2.equals(C8109b.m15970b("json"))) {
                    aVar = C8385l.m16729i(new String(e.mo42594a(), Charset.forName(Constants.ENCODING)));
                } else {
                    C9050a.m18385f("CctTransportBackend", "Received event of unsupported encoding %s. Skipping...", b2);
                }
                aVar.mo42374c(iVar2.mo42553f()).mo42375d(iVar2.mo42556k()).mo42379h(iVar2.mo42601h("tz-offset")).mo42376e(C8390o.m16767a().mo42409c(C8390o.C8393c.m16775a(iVar2.mo42600g("net-type"))).mo42408b(C8390o.C8392b.m16773a(iVar2.mo42600g("mobile-subtype"))).mo42407a());
                if (iVar2.mo42550d() != null) {
                    aVar.mo42373b(iVar2.mo42550d());
                }
                arrayList3.add(aVar.mo42372a());
            }
            b.mo42392c(arrayList3);
            arrayList2.add(b.mo42390a());
        }
        return C8381j.m16719a(arrayList2);
    }

    /* renamed from: j */
    private static TelephonyManager m5883j(Context context) {
        return (TelephonyManager) context.getSystemService(HintConstants.AUTOFILL_HINT_PHONE);
    }

    @VisibleForTesting
    /* renamed from: k */
    static long m5884k() {
        Calendar.getInstance();
        return (long) (TimeZone.getDefault().getOffset(Calendar.getInstance().getTimeInMillis()) / 1000);
    }

    /* access modifiers changed from: private */
    /* renamed from: l */
    public static /* synthetic */ C4607a m5885l(C4607a aVar, C4608b bVar) {
        URL url = bVar.f4415b;
        if (url == null) {
            return null;
        }
        C9050a.m18380a("CctTransportBackend", "Following redirect to: %s", url);
        return aVar.mo31828a(bVar.f4415b);
    }

    /* renamed from: m */
    private static InputStream m5886m(InputStream inputStream, String str) {
        if ("gzip".equals(str)) {
            return new GZIPInputStream(inputStream);
        }
        return inputStream;
    }

    /* renamed from: n */
    private static URL m5887n(String str) {
        try {
            return new URL(str);
        } catch (MalformedURLException e) {
            throw new IllegalArgumentException("Invalid url: " + str, e);
        }
    }

    /* renamed from: a */
    public C8539i mo31826a(C8539i iVar) {
        NetworkInfo activeNetworkInfo = this.f4405b.getActiveNetworkInfo();
        return iVar.mo42603l().mo42604a("sdk-version", Build.VERSION.SDK_INT).mo42606c("model", Build.MODEL).mo42606c("hardware", Build.HARDWARE).mo42606c("device", Build.DEVICE).mo42606c("product", Build.PRODUCT).mo42606c("os-uild", Build.ID).mo42606c("manufacturer", Build.MANUFACTURER).mo42606c(APIParams.FINGERPRINT, Build.FINGERPRINT).mo42605b("tz-offset", m5884k()).mo42604a("net-type", m5880g(activeNetworkInfo)).mo42604a("mobile-subtype", m5879f(activeNetworkInfo)).mo42606c("country", Locale.getDefault().getCountry()).mo42606c("locale", Locale.getDefault().getLanguage()).mo42606c("mcc_mnc", m5883j(this.f4406c).getSimOperator()).mo42606c("application_build", Integer.toString(m5881h(this.f4406c))).mo42558d();
    }

    /* renamed from: b */
    public C8664g mo31827b(C8662f fVar) {
        C8381j i = m5882i(fVar);
        URL url = this.f4407d;
        String str = null;
        if (fVar.mo42730c() != null) {
            try {
                C4603a c = C4603a.m5870c(fVar.mo42730c());
                if (c.mo31820d() != null) {
                    str = c.mo31820d();
                }
                if (c.mo31821e() != null) {
                    url = m5887n(c.mo31821e());
                }
            } catch (IllegalArgumentException unused) {
                return C8664g.m17418a();
            }
        }
        try {
            C4608b bVar = (C4608b) C9214b.m18918a(5, new C4607a(url, i, str), new C4604b(this), new C4605c());
            int i2 = bVar.f4414a;
            if (i2 == 200) {
                return C8664g.m17420e(bVar.f4416c);
            }
            if (i2 < 500) {
                if (i2 != 404) {
                    if (i2 == 400) {
                        return C8664g.m17419d();
                    }
                    return C8664g.m17418a();
                }
            }
            return C8664g.m17421f();
        } catch (IOException e) {
            C9050a.m18382c("CctTransportBackend", "Could not make request to the backend", e);
            return C8664g.m17421f();
        }
    }

    C4606d(Context context, C9927a aVar, C9927a aVar2) {
        this(context, aVar, aVar2, 40000);
    }
}
