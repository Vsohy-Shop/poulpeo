package p188p2;

import android.graphics.Bitmap;
import android.net.nsd.NsdManager;
import android.net.nsd.NsdServiceInfo;
import androidx.core.view.ViewCompat;
import com.facebook.FacebookSdk;
import com.google.zxing.BarcodeFormat;
import com.google.zxing.EncodeHintType;
import com.google.zxing.MultiFormatWriter;
import com.google.zxing.WriterException;
import com.google.zxing.common.BitMatrix;
import java.util.EnumMap;
import java.util.HashMap;
import p198q2.C9119a0;
import p198q2.C9138d0;
import p198q2.C9177p;
import p198q2.C9181q;
import p251v2.C9925a;

/* renamed from: p2.a */
/* compiled from: DeviceRequestsHelper */
public class C9048a {

    /* renamed from: a */
    private static final String f13178a = "p2.a";

    /* renamed from: b */
    private static HashMap<String, NsdManager.RegistrationListener> f13179b = new HashMap<>();

    /* renamed from: a */
    public static void m18373a(String str) {
        Class<C9048a> cls = C9048a.class;
        if (!C9925a.m20734d(cls)) {
            try {
                m18374b(str);
            } catch (Throwable th) {
                C9925a.m20732b(th, cls);
            }
        }
    }

    /* renamed from: b */
    private static void m18374b(String str) {
        Class<C9048a> cls = C9048a.class;
        if (!C9925a.m20734d(cls)) {
            try {
                NsdManager.RegistrationListener registrationListener = f13179b.get(str);
                if (registrationListener != null) {
                    ((NsdManager) FacebookSdk.getApplicationContext().getSystemService("servicediscovery")).unregisterService(registrationListener);
                    f13179b.remove(str);
                }
            } catch (IllegalArgumentException e) {
                C9138d0.m18624Z(f13178a, e);
            } catch (Throwable th) {
                C9925a.m20732b(th, cls);
            }
        }
    }

    /* renamed from: c */
    public static Bitmap m18375c(String str) {
        int i;
        Class<C9048a> cls = C9048a.class;
        Bitmap bitmap = null;
        if (C9925a.m20734d(cls)) {
            return null;
        }
        try {
            EnumMap enumMap = new EnumMap(EncodeHintType.class);
            enumMap.put(EncodeHintType.MARGIN, 2);
            try {
                BitMatrix encode = new MultiFormatWriter().encode(str, BarcodeFormat.QR_CODE, 200, 200, enumMap);
                int height = encode.getHeight();
                int width = encode.getWidth();
                int[] iArr = new int[(height * width)];
                for (int i2 = 0; i2 < height; i2++) {
                    int i3 = i2 * width;
                    for (int i4 = 0; i4 < width; i4++) {
                        int i5 = i3 + i4;
                        if (encode.get(i4, i2)) {
                            i = ViewCompat.MEASURED_STATE_MASK;
                        } else {
                            i = -1;
                        }
                        iArr[i5] = i;
                    }
                }
                Bitmap createBitmap = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
                try {
                    createBitmap.setPixels(iArr, 0, width, 0, 0, width, height);
                    return createBitmap;
                } catch (WriterException unused) {
                    bitmap = createBitmap;
                }
            } catch (WriterException unused2) {
                return bitmap;
            }
        } catch (Throwable th) {
            C9925a.m20732b(th, cls);
            return null;
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(8:3|4|5|6|7|8|9|10) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:8:0x001d */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String m18376d() {
        /*
            java.lang.Class<p2.a> r0 = p188p2.C9048a.class
            boolean r1 = p251v2.C9925a.m20734d(r0)
            r2 = 0
            if (r1 == 0) goto L_0x000a
            return r2
        L_0x000a:
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch:{ all -> 0x0022 }
            r1.<init>()     // Catch:{ all -> 0x0022 }
            java.lang.String r3 = "device"
            java.lang.String r4 = android.os.Build.DEVICE     // Catch:{ JSONException -> 0x001d }
            r1.put(r3, r4)     // Catch:{ JSONException -> 0x001d }
            java.lang.String r3 = "model"
            java.lang.String r4 = android.os.Build.MODEL     // Catch:{ JSONException -> 0x001d }
            r1.put(r3, r4)     // Catch:{ JSONException -> 0x001d }
        L_0x001d:
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x0022 }
            return r0
        L_0x0022:
            r1 = move-exception
            p251v2.C9925a.m20732b(r1, r0)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p188p2.C9048a.m18376d():java.lang.String");
    }

    /* renamed from: e */
    public static boolean m18377e() {
        Class<C9048a> cls = C9048a.class;
        if (C9925a.m20734d(cls)) {
            return false;
        }
        try {
            C9177p j = C9181q.m18806j(FacebookSdk.getApplicationId());
            if (j == null || !j.mo43462j().contains(C9119a0.Enabled)) {
                return false;
            }
            return true;
        } catch (Throwable th) {
            C9925a.m20732b(th, cls);
            return false;
        }
    }

    /* renamed from: f */
    public static boolean m18378f(String str) {
        Class<C9048a> cls = C9048a.class;
        if (C9925a.m20734d(cls)) {
            return false;
        }
        try {
            if (m18377e()) {
                return m18379g(str);
            }
            return false;
        } catch (Throwable th) {
            C9925a.m20732b(th, cls);
            return false;
        }
    }

    /* renamed from: g */
    private static boolean m18379g(String str) {
        Class<C9048a> cls = C9048a.class;
        if (C9925a.m20734d(cls)) {
            return false;
        }
        try {
            if (f13179b.containsKey(str)) {
                return true;
            }
            String format = String.format("%s_%s_%s", new Object[]{"fbsdk", String.format("%s-%s", new Object[]{SystemMediaRouteProvider.PACKAGE_NAME, FacebookSdk.getSdkVersion().replace('.', '|')}), str});
            NsdServiceInfo nsdServiceInfo = new NsdServiceInfo();
            nsdServiceInfo.setServiceType("_fb._tcp.");
            nsdServiceInfo.setServiceName(format);
            nsdServiceInfo.setPort(80);
            C9049a aVar = new C9049a(format, str);
            f13179b.put(str, aVar);
            ((NsdManager) FacebookSdk.getApplicationContext().getSystemService("servicediscovery")).registerService(nsdServiceInfo, 1, aVar);
            return true;
        } catch (Throwable th) {
            C9925a.m20732b(th, cls);
            return false;
        }
    }

    /* renamed from: p2.a$a */
    /* compiled from: DeviceRequestsHelper */
    static class C9049a implements NsdManager.RegistrationListener {

        /* renamed from: a */
        final /* synthetic */ String f13180a;

        /* renamed from: b */
        final /* synthetic */ String f13181b;

        C9049a(String str, String str2) {
            this.f13180a = str;
            this.f13181b = str2;
        }

        public void onRegistrationFailed(NsdServiceInfo nsdServiceInfo, int i) {
            C9048a.m18373a(this.f13181b);
        }

        public void onServiceRegistered(NsdServiceInfo nsdServiceInfo) {
            if (!this.f13180a.equals(nsdServiceInfo.getServiceName())) {
                C9048a.m18373a(this.f13181b);
            }
        }

        public void onServiceUnregistered(NsdServiceInfo nsdServiceInfo) {
        }

        public void onUnregistrationFailed(NsdServiceInfo nsdServiceInfo, int i) {
        }
    }
}
