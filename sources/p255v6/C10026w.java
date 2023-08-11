package p255v6;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.Locale;
import java.util.UUID;
import java.util.regex.Pattern;
import p124i8.C8213d;
import p222s6.C9511f;

/* renamed from: v6.w */
/* compiled from: IdManager */
public class C10026w implements C10027x {

    /* renamed from: g */
    private static final Pattern f15095g = Pattern.compile("[^\\p{Alnum}]");

    /* renamed from: h */
    private static final String f15096h = Pattern.quote("/");

    /* renamed from: a */
    private final C10028y f15097a;

    /* renamed from: b */
    private final Context f15098b;

    /* renamed from: c */
    private final String f15099c;

    /* renamed from: d */
    private final C8213d f15100d;

    /* renamed from: e */
    private final C10019s f15101e;

    /* renamed from: f */
    private String f15102f;

    public C10026w(Context context, String str, C8213d dVar, C10019s sVar) {
        if (context == null) {
            throw new IllegalArgumentException("appContext must not be null");
        } else if (str != null) {
            this.f15098b = context;
            this.f15099c = str;
            this.f15100d = dVar;
            this.f15101e = sVar;
            this.f15097a = new C10028y();
        } else {
            throw new IllegalArgumentException("appIdentifier must not be null");
        }
    }

    @NonNull
    /* renamed from: b */
    private synchronized String m21029b(String str, SharedPreferences sharedPreferences) {
        String e;
        e = m21032e(UUID.randomUUID().toString());
        C9511f f = C9511f.m19696f();
        f.mo43971i("Created new Crashlytics installation ID: " + e + " for FID: " + str);
        sharedPreferences.edit().putString("crashlytics.installation.id", e).putString("firebase.installation.id", str).apply();
        return e;
    }

    /* renamed from: c */
    static String m21030c() {
        return "SYN_" + UUID.randomUUID().toString();
    }

    @Nullable
    /* renamed from: d */
    private String m21031d() {
        try {
            return (String) C10016r0.m20999d(this.f15100d.getId());
        } catch (Exception e) {
            C9511f.m19696f().mo43974l("Failed to retrieve Firebase Installations ID.", e);
            return null;
        }
    }

    /* renamed from: e */
    private static String m21032e(String str) {
        if (str == null) {
            return null;
        }
        return f15095g.matcher(str).replaceAll("").toLowerCase(Locale.US);
    }

    /* renamed from: k */
    static boolean m21033k(String str) {
        if (str == null || !str.startsWith("SYN_")) {
            return false;
        }
        return true;
    }

    /* renamed from: l */
    private String m21034l(SharedPreferences sharedPreferences) {
        return sharedPreferences.getString("crashlytics.installation.id", (String) null);
    }

    /* renamed from: m */
    private String m21035m(String str) {
        return str.replaceAll(f15096h, "");
    }

    @NonNull
    /* renamed from: a */
    public synchronized String mo44604a() {
        String str = this.f15102f;
        if (str != null) {
            return str;
        }
        C9511f.m19696f().mo43971i("Determining Crashlytics installation ID...");
        SharedPreferences r = C9972g.m20828r(this.f15098b);
        String string = r.getString("firebase.installation.id", (String) null);
        C9511f f = C9511f.m19696f();
        f.mo43971i("Cached Firebase Installation ID: " + string);
        if (this.f15101e.mo44598d()) {
            String d = m21031d();
            C9511f f2 = C9511f.m19696f();
            f2.mo43971i("Fetched Firebase Installation ID: " + d);
            if (d == null) {
                if (string == null) {
                    d = m21030c();
                } else {
                    d = string;
                }
            }
            if (d.equals(string)) {
                this.f15102f = m21034l(r);
            } else {
                this.f15102f = m21029b(d, r);
            }
        } else if (m21033k(string)) {
            this.f15102f = m21034l(r);
        } else {
            this.f15102f = m21029b(m21030c(), r);
        }
        if (this.f15102f == null) {
            C9511f.m19696f().mo43973k("Unable to determine Crashlytics Install Id, creating a new one.");
            this.f15102f = m21029b(m21030c(), r);
        }
        C9511f f3 = C9511f.m19696f();
        f3.mo43971i("Crashlytics installation ID: " + this.f15102f);
        return this.f15102f;
    }

    /* renamed from: f */
    public String mo44605f() {
        return this.f15099c;
    }

    /* renamed from: g */
    public String mo44606g() {
        return this.f15097a.mo44610a(this.f15098b);
    }

    /* renamed from: h */
    public String mo44607h() {
        return String.format(Locale.US, "%s/%s", new Object[]{m21035m(Build.MANUFACTURER), m21035m(Build.MODEL)});
    }

    /* renamed from: i */
    public String mo44608i() {
        return m21035m(Build.VERSION.INCREMENTAL);
    }

    /* renamed from: j */
    public String mo44609j() {
        return m21035m(Build.VERSION.RELEASE);
    }
}
