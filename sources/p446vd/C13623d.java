package p446vd;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.graphics.Point;
import android.os.Build;
import android.telephony.TelephonyManager;
import android.text.Html;
import android.view.Display;
import android.view.WindowManager;
import android.webkit.WebView;
import androidx.autofill.HintConstants;
import com.rmn.iosadapters.android.content.ContextContainer;
import java.util.UUID;

/* renamed from: vd.d */
/* compiled from: DeviceUtil */
public class C13623d {

    /* renamed from: a */
    private static String f21936a;

    /* renamed from: b */
    private static String f21937b;

    /* renamed from: c */
    private static String f21938c = UUID.randomUUID().toString();

    /* renamed from: a */
    public static void m31101a(ContextContainer contextContainer, String str, String str2) {
        try {
            ClipboardManager clipboardManager = (ClipboardManager) contextContainer.mo47843a().getSystemService("clipboard");
            if (clipboardManager != null) {
                clipboardManager.setPrimaryClip(ClipData.newPlainText(str, str2));
            }
        } catch (Exception unused) {
        }
    }

    /* renamed from: b */
    public static String m31102b() {
        return Build.MODEL;
    }

    /* renamed from: c */
    public static String m31103c() {
        return null;
    }

    /* renamed from: d */
    public static String m31104d() {
        return "Android";
    }

    /* renamed from: e */
    public static String m31105e() {
        return Build.VERSION.RELEASE;
    }

    /* renamed from: f */
    public static C13634o m31106f(ContextContainer contextContainer) {
        Display defaultDisplay = ((WindowManager) contextContainer.mo47843a().getSystemService("window")).getDefaultDisplay();
        Point point = new Point();
        defaultDisplay.getRealSize(point);
        return new C13634o(point.x, point.y);
    }

    /* renamed from: g */
    public static String m31107g(ContextContainer contextContainer) {
        if (contextContainer == null) {
            return null;
        }
        C13634o f = m31106f(contextContainer);
        if (f.mo53288c()) {
            return null;
        }
        int b = f.mo53287b();
        int a = f.mo53286a();
        return b + "x" + a;
    }

    /* renamed from: h */
    public static synchronized String m31108h(ContextContainer contextContainer) {
        synchronized (C13623d.class) {
            if (contextContainer != null) {
                String str = f21936a;
                if (str == null || str.equals("")) {
                    C13636q b = C13636q.m31181b(contextContainer);
                    String i = b.mo53298i("generated_UDID", (String) null);
                    f21936a = i;
                    if (i == null || i.equals("")) {
                        String uuid = UUID.randomUUID().toString();
                        f21936a = uuid;
                        b.mo53303n("generated_UDID", uuid);
                        C13633n.m31145a(C13623d.class, "Generated UDID (random) : " + f21936a);
                        String str2 = f21936a;
                        return str2;
                    }
                    String str3 = f21936a;
                    return str3;
                }
                String str4 = f21936a;
                return str4;
            }
            throw new IllegalArgumentException();
        }
    }

    /* renamed from: i */
    public static String m31109i(ContextContainer contextContainer) {
        if (contextContainer == null) {
            return null;
        }
        if (f21937b == null) {
            try {
                f21937b = new WebView(contextContainer.mo47843a()).getSettings().getUserAgentString();
            } catch (Exception unused) {
            }
            String str = f21937b;
            if (str == null || str.equals("")) {
                f21937b = null;
            }
        }
        return f21937b;
    }

    /* renamed from: j */
    public static String m31110j(ContextContainer contextContainer) {
        try {
            TelephonyManager telephonyManager = (TelephonyManager) contextContainer.mo47843a().getSystemService(HintConstants.AUTOFILL_HINT_PHONE);
            if (telephonyManager == null || telephonyManager.getPhoneType() != 0) {
                return "smartphone";
            }
            return "tablet";
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: k */
    public static String m31111k(String str) {
        return Html.fromHtml(str).toString();
    }

    /* renamed from: l */
    public static boolean m31112l() {
        return true;
    }

    /* renamed from: m */
    public static boolean m31113m() {
        return false;
    }
}
