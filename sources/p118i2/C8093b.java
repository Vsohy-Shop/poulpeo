package p118i2;

import android.app.Activity;
import android.content.Context;
import android.content.pm.PackageManager;
import android.view.View;
import android.view.Window;
import com.facebook.FacebookSdk;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.jvm.internal.C12770k0;
import kotlin.jvm.internal.C12775o;
import p198q2.C9138d0;
import p251v2.C9925a;

/* renamed from: i2.b */
/* compiled from: AppEventUtility.kt */
public final class C8093b {

    /* renamed from: a */
    public static final C8093b f11375a = new C8093b();

    private C8093b() {
    }

    /* renamed from: c */
    public static final String m15921c(byte[] bArr) {
        C12775o.m28639i(bArr, "bytes");
        StringBuffer stringBuffer = new StringBuffer();
        for (byte valueOf : bArr) {
            C12770k0 k0Var = C12770k0.f20423a;
            String format = String.format("%02x", Arrays.copyOf(new Object[]{Byte.valueOf(valueOf)}, 1));
            C12775o.m28638h(format, "java.lang.String.format(format, *args)");
            stringBuffer.append(format);
        }
        String stringBuffer2 = stringBuffer.toString();
        C12775o.m28638h(stringBuffer2, "sb.toString()");
        return stringBuffer2;
    }

    /* renamed from: d */
    public static final String m15922d() {
        Context applicationContext = FacebookSdk.getApplicationContext();
        try {
            String str = applicationContext.getPackageManager().getPackageInfo(applicationContext.getPackageName(), 0).versionName;
            C12775o.m28638h(str, "packageInfo.versionName");
            return str;
        } catch (PackageManager.NameNotFoundException unused) {
            return "";
        }
    }

    /* renamed from: e */
    public static final View m15923e(Activity activity) {
        Class<C8093b> cls = C8093b.class;
        if (C9925a.m20734d(cls) || activity == null) {
            return null;
        }
        try {
            Window window = activity.getWindow();
            if (window == null) {
                return null;
            }
            View decorView = window.getDecorView();
            C12775o.m28638h(decorView, "window.decorView");
            return decorView.getRootView();
        } catch (Exception unused) {
            return null;
        } catch (Throwable th) {
            C9925a.m20732b(th, cls);
            return null;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0069, code lost:
        if (p454wf.C13754v.m31525E(r0, "generic", false, 2, (java.lang.Object) null) == false) goto L_0x006b;
     */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final boolean m15924f() {
        /*
            java.lang.String r0 = android.os.Build.FINGERPRINT
            java.lang.String r1 = "Build.FINGERPRINT"
            kotlin.jvm.internal.C12775o.m28638h(r0, r1)
            java.lang.String r2 = "generic"
            r3 = 0
            r4 = 2
            r5 = 0
            boolean r6 = p454wf.C13754v.m31525E(r0, r2, r3, r4, r5)
            if (r6 != 0) goto L_0x0073
            kotlin.jvm.internal.C12775o.m28638h(r0, r1)
            java.lang.String r1 = "unknown"
            boolean r0 = p454wf.C13754v.m31525E(r0, r1, r3, r4, r5)
            if (r0 != 0) goto L_0x0073
            java.lang.String r0 = android.os.Build.MODEL
            java.lang.String r1 = "Build.MODEL"
            kotlin.jvm.internal.C12775o.m28638h(r0, r1)
            java.lang.String r6 = "google_sdk"
            boolean r7 = p454wf.C13755w.m31552J(r0, r6, r3, r4, r5)
            if (r7 != 0) goto L_0x0073
            kotlin.jvm.internal.C12775o.m28638h(r0, r1)
            java.lang.String r7 = "Emulator"
            boolean r7 = p454wf.C13755w.m31552J(r0, r7, r3, r4, r5)
            if (r7 != 0) goto L_0x0073
            kotlin.jvm.internal.C12775o.m28638h(r0, r1)
            java.lang.String r1 = "Android SDK built for x86"
            boolean r0 = p454wf.C13755w.m31552J(r0, r1, r3, r4, r5)
            if (r0 != 0) goto L_0x0073
            java.lang.String r0 = android.os.Build.MANUFACTURER
            java.lang.String r1 = "Build.MANUFACTURER"
            kotlin.jvm.internal.C12775o.m28638h(r0, r1)
            java.lang.String r1 = "Genymotion"
            boolean r0 = p454wf.C13755w.m31552J(r0, r1, r3, r4, r5)
            if (r0 != 0) goto L_0x0073
            java.lang.String r0 = android.os.Build.BRAND
            java.lang.String r1 = "Build.BRAND"
            kotlin.jvm.internal.C12775o.m28638h(r0, r1)
            boolean r0 = p454wf.C13754v.m31525E(r0, r2, r3, r4, r5)
            if (r0 == 0) goto L_0x006b
            java.lang.String r0 = android.os.Build.DEVICE
            java.lang.String r1 = "Build.DEVICE"
            kotlin.jvm.internal.C12775o.m28638h(r0, r1)
            boolean r0 = p454wf.C13754v.m31525E(r0, r2, r3, r4, r5)
            if (r0 != 0) goto L_0x0073
        L_0x006b:
            java.lang.String r0 = android.os.Build.PRODUCT
            boolean r0 = kotlin.jvm.internal.C12775o.m28634d(r6, r0)
            if (r0 == 0) goto L_0x0074
        L_0x0073:
            r3 = 1
        L_0x0074:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p118i2.C8093b.m15924f():boolean");
    }

    /* renamed from: g */
    public static final double m15925g(String str) {
        try {
            Matcher matcher = Pattern.compile("[-+]*\\d+([.,]\\d+)*([.,]\\d+)?", 8).matcher(str);
            if (!matcher.find()) {
                return 0.0d;
            }
            return NumberFormat.getNumberInstance(C9138d0.m18667v()).parse(matcher.group(0)).doubleValue();
        } catch (ParseException unused) {
            return 0.0d;
        }
    }

    /* renamed from: a */
    public static final void m15919a() {
    }

    /* renamed from: b */
    public static final void m15920b() {
    }
}
