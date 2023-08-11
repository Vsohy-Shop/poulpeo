package com.google.firebase.remoteconfig.internal;

import android.util.Log;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.adjust.sdk.Constants;
import java.nio.charset.Charset;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.regex.Pattern;
import org.json.JSONException;
import p286y4.C10670d;

/* renamed from: com.google.firebase.remoteconfig.internal.l */
/* compiled from: ConfigGetParameterHandler */
public class C7047l {
    @VisibleForTesting(otherwise = 3)

    /* renamed from: e */
    public static final Charset f9469e = Charset.forName(Constants.ENCODING);

    /* renamed from: f */
    static final Pattern f9470f = Pattern.compile("^(1|true|t|yes|y|on)$", 2);

    /* renamed from: g */
    static final Pattern f9471g = Pattern.compile("^(0|false|f|no|n|off|)$", 2);

    /* renamed from: a */
    private final Set<C10670d<String, C7037e>> f9472a = new HashSet();

    /* renamed from: b */
    private final Executor f9473b;

    /* renamed from: c */
    private final C7034d f9474c;

    /* renamed from: d */
    private final C7034d f9475d;

    public C7047l(Executor executor, C7034d dVar, C7034d dVar2) {
        this.f9473b = executor;
        this.f9474c = dVar;
        this.f9475d = dVar2;
    }

    /* renamed from: c */
    private void m12558c(String str, C7037e eVar) {
        if (eVar != null) {
            synchronized (this.f9472a) {
                for (C10670d<String, C7037e> kVar : this.f9472a) {
                    this.f9473b.execute(new C7046k(kVar, str, eVar));
                }
            }
        }
    }

    @Nullable
    /* renamed from: d */
    private static C7037e m12559d(C7034d dVar) {
        return dVar.mo40037f();
    }

    @Nullable
    /* renamed from: f */
    private static String m12560f(C7034d dVar, String str) {
        C7037e d = m12559d(dVar);
        if (d == null) {
            return null;
        }
        try {
            return d.mo40044d().getString(str);
        } catch (JSONException unused) {
            return null;
        }
    }

    /* renamed from: h */
    private static void m12562h(String str, String str2) {
        Log.w("FirebaseRemoteConfig", String.format("No value of type '%s' exists for parameter key '%s'.", new Object[]{str2, str}));
    }

    /* renamed from: b */
    public void mo40060b(C10670d<String, C7037e> dVar) {
        synchronized (this.f9472a) {
            this.f9472a.add(dVar);
        }
    }

    /* renamed from: e */
    public String mo40061e(String str) {
        String f = m12560f(this.f9474c, str);
        if (f != null) {
            m12558c(str, m12559d(this.f9474c));
            return f;
        }
        String f2 = m12560f(this.f9475d, str);
        if (f2 != null) {
            return f2;
        }
        m12562h(str, "String");
        return "";
    }
}
