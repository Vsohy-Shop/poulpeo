package p085f4;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import org.json.JSONException;
import p231t4.C9713p;

/* renamed from: f4.c */
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
public class C7573c {

    /* renamed from: c */
    private static final Lock f10551c = new ReentrantLock();
    @Nullable

    /* renamed from: d */
    private static C7573c f10552d;

    /* renamed from: a */
    private final Lock f10553a = new ReentrantLock();

    /* renamed from: b */
    private final SharedPreferences f10554b;

    C7573c(Context context) {
        this.f10554b = context.getSharedPreferences("com.google.android.gms.signin", 0);
    }

    @NonNull
    /* renamed from: b */
    public static C7573c m14901b(@NonNull Context context) {
        C9713p.m20275j(context);
        Lock lock = f10551c;
        lock.lock();
        try {
            if (f10552d == null) {
                f10552d = new C7573c(context.getApplicationContext());
            }
            C7573c cVar = f10552d;
            lock.unlock();
            return cVar;
        } catch (Throwable th) {
            f10551c.unlock();
            throw th;
        }
    }

    /* renamed from: i */
    private static final String m14902i(String str, String str2) {
        StringBuilder sb = new StringBuilder(str.length() + 1 + String.valueOf(str2).length());
        sb.append(str);
        sb.append(":");
        sb.append(str2);
        return sb.toString();
    }

    /* renamed from: a */
    public void mo41325a() {
        this.f10553a.lock();
        try {
            this.f10554b.edit().clear().apply();
        } finally {
            this.f10553a.unlock();
        }
    }

    @Nullable
    /* renamed from: c */
    public GoogleSignInAccount mo41326c() {
        String g;
        String g2 = mo41330g("defaultGoogleSignInAccount");
        if (TextUtils.isEmpty(g2) || (g = mo41330g(m14902i("googleSignInAccount", g2))) == null) {
            return null;
        }
        try {
            return GoogleSignInAccount.m5904O(g);
        } catch (JSONException unused) {
            return null;
        }
    }

    @Nullable
    /* renamed from: d */
    public GoogleSignInOptions mo41327d() {
        String g;
        String g2 = mo41330g("defaultGoogleSignInAccount");
        if (TextUtils.isEmpty(g2) || (g = mo41330g(m14902i("googleSignInOptions", g2))) == null) {
            return null;
        }
        try {
            return GoogleSignInOptions.m5924M(g);
        } catch (JSONException unused) {
            return null;
        }
    }

    @Nullable
    /* renamed from: e */
    public String mo41328e() {
        return mo41330g("refreshToken");
    }

    /* renamed from: f */
    public void mo41329f(@NonNull GoogleSignInAccount googleSignInAccount, @NonNull GoogleSignInOptions googleSignInOptions) {
        C9713p.m20275j(googleSignInAccount);
        C9713p.m20275j(googleSignInOptions);
        mo41331h("defaultGoogleSignInAccount", googleSignInAccount.mo31851P());
        C9713p.m20275j(googleSignInAccount);
        C9713p.m20275j(googleSignInOptions);
        String P = googleSignInAccount.mo31851P();
        mo41331h(m14902i("googleSignInAccount", P), googleSignInAccount.mo31852Q());
        mo41331h(m14902i("googleSignInOptions", P), googleSignInOptions.mo31868Q());
    }

    /* access modifiers changed from: protected */
    @Nullable
    /* renamed from: g */
    public final String mo41330g(@NonNull String str) {
        this.f10553a.lock();
        try {
            return this.f10554b.getString(str, (String) null);
        } finally {
            this.f10553a.unlock();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public final void mo41331h(@NonNull String str, @NonNull String str2) {
        this.f10553a.lock();
        try {
            this.f10554b.edit().putString(str, str2).apply();
        } finally {
            this.f10553a.unlock();
        }
    }
}
