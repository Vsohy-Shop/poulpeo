package p446vd;

import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import androidx.annotation.NonNull;
import com.rmn.iosadapters.android.content.ContextContainer;

/* renamed from: vd.q */
/* compiled from: StorageManager */
public class C13636q {

    /* renamed from: b */
    private static volatile C13636q f21955b;
    @NonNull

    /* renamed from: a */
    private ContextContainer f21956a;

    private C13636q(@NonNull ContextContainer contextContainer) {
        this.f21956a = contextContainer;
    }

    /* renamed from: b */
    public static C13636q m31181b(@NonNull ContextContainer contextContainer) {
        if (f21955b == null) {
            synchronized (C13636q.class) {
                if (f21955b == null) {
                    f21955b = new C13636q(contextContainer);
                }
            }
        } else {
            f21955b.f21956a = contextContainer;
        }
        return f21955b;
    }

    /* renamed from: c */
    private SharedPreferences m31182c() {
        return PreferenceManager.getDefaultSharedPreferences(this.f21956a.mo47843a());
    }

    /* renamed from: a */
    public boolean mo53292a(String str) {
        if (str == null) {
            return false;
        }
        return m31182c().contains(str);
    }

    /* renamed from: d */
    public void mo53293d(String str) {
        m31182c().edit().remove(str).apply();
    }

    /* renamed from: e */
    public boolean mo53294e(String str, boolean z) {
        return m31182c().getBoolean(str, z);
    }

    /* renamed from: f */
    public double mo53295f(String str, double d) {
        return Double.longBitsToDouble(m31182c().getLong(str, Double.doubleToLongBits(d)));
    }

    /* renamed from: g */
    public int mo53296g(String str, int i) {
        return m31182c().getInt(str, i);
    }

    /* renamed from: h */
    public long mo53297h(String str, long j) {
        return m31182c().getLong(str, j);
    }

    /* renamed from: i */
    public String mo53298i(String str, String str2) {
        return m31182c().getString(str, str2);
    }

    /* renamed from: j */
    public void mo53299j(String str, boolean z) {
        if (str != null) {
            m31182c().edit().putBoolean(str, z).apply();
        }
    }

    /* renamed from: k */
    public void mo53300k(String str, double d) {
        if (str != null) {
            m31182c().edit().putLong(str, Double.doubleToRawLongBits(d)).apply();
        }
    }

    /* renamed from: l */
    public void mo53301l(String str, int i) {
        if (str != null) {
            m31182c().edit().putInt(str, i).apply();
        }
    }

    /* renamed from: m */
    public void mo53302m(String str, long j) {
        if (str != null) {
            m31182c().edit().putLong(str, j).apply();
        }
    }

    /* renamed from: n */
    public void mo53303n(String str, String str2) {
        if (str != null) {
            m31182c().edit().putString(str, str2).apply();
        }
    }
}
