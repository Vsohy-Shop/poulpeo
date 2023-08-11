package p118i2;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.os.Bundle;
import com.facebook.C4509a;
import com.facebook.C4579r;
import com.facebook.FacebookSdk;
import java.util.Arrays;
import java.util.Locale;
import kotlin.jvm.internal.C12770k0;
import kotlin.jvm.internal.C12775o;
import p033b2.C2849g;
import p033b2.C2867m;
import p198q2.C9194v;
import p251v2.C9925a;
import p295z2.C10794a;

/* renamed from: i2.i */
/* compiled from: SessionLogger.kt */
public final class C8105i {

    /* renamed from: a */
    private static final String f11405a = C8105i.class.getCanonicalName();

    /* renamed from: b */
    private static final long[] f11406b = {300000, 900000, 1800000, 3600000, 21600000, 43200000, 86400000, 172800000, 259200000, 604800000, 1209600000, 1814400000, 2419200000L, 5184000000L, 7776000000L, 10368000000L, 12960000000L, 15552000000L, 31536000000L};

    /* renamed from: c */
    public static final C8105i f11407c = new C8105i();

    private C8105i() {
    }

    /* renamed from: b */
    public static final int m15959b(long j) {
        Class<C8105i> cls = C8105i.class;
        if (C9925a.m20734d(cls)) {
            return 0;
        }
        int i = 0;
        while (true) {
            try {
                long[] jArr = f11406b;
                if (i >= jArr.length || jArr[i] >= j) {
                    return i;
                }
                i++;
            } catch (Throwable th) {
                C9925a.m20732b(th, cls);
                return 0;
            }
        }
        return i;
    }

    /* renamed from: c */
    public static final void m15960c(String str, C8106j jVar, String str2, Context context) {
        String str3;
        Class<C8105i> cls = C8105i.class;
        if (!C9925a.m20734d(cls)) {
            try {
                C12775o.m28639i(str, "activityName");
                C12775o.m28639i(context, "context");
                if (jVar == null || (str3 = jVar.toString()) == null) {
                    str3 = "Unclassified";
                }
                Bundle bundle = new Bundle();
                bundle.putString("fb_mobile_launch_source", str3);
                bundle.putString("fb_mobile_pckg_fp", f11407c.mo41952a(context));
                bundle.putString("fb_mobile_app_cert_hash", C10794a.m22969a(context));
                C2867m mVar = new C2867m(str, str2, (C4509a) null);
                mVar.mo28389d("fb_mobile_activate_app", bundle);
                if (C2867m.f1252b.mo28397b() != C2849g.C2851b.EXPLICIT_ONLY) {
                    mVar.mo28386a();
                }
            } catch (Throwable th) {
                C9925a.m20732b(th, cls);
            }
        }
    }

    /* renamed from: d */
    private final void m15961d() {
        if (!C9925a.m20734d(this)) {
            try {
                C9194v.C9195a aVar = C9194v.f13504f;
                C4579r rVar = C4579r.APP_EVENTS;
                String str = f11405a;
                C12775o.m28636f(str);
                aVar.mo43482c(rVar, str, "Clock skew detected");
            } catch (Throwable th) {
                C9925a.m20732b(th, this);
            }
        }
    }

    /* renamed from: e */
    public static final void m15962e(String str, C8103h hVar, String str2) {
        long j;
        String str3;
        long j2;
        Class<C8105i> cls = C8105i.class;
        if (!C9925a.m20734d(cls)) {
            try {
                C12775o.m28639i(str, "activityName");
                if (hVar != null) {
                    Long b = hVar.mo41938b();
                    long j3 = 0;
                    if (b != null) {
                        j = b.longValue();
                    } else {
                        Long e = hVar.mo41941e();
                        if (e != null) {
                            j2 = e.longValue();
                        } else {
                            j2 = 0;
                        }
                        j = 0 - j2;
                    }
                    if (j < 0) {
                        f11407c.m15961d();
                        j = 0;
                    }
                    long f = hVar.mo41942f();
                    if (f < 0) {
                        f11407c.m15961d();
                        f = 0;
                    }
                    Bundle bundle = new Bundle();
                    bundle.putInt("fb_mobile_app_interruptions", hVar.mo41939c());
                    C12770k0 k0Var = C12770k0.f20423a;
                    String format = String.format(Locale.ROOT, "session_quanta_%d", Arrays.copyOf(new Object[]{Integer.valueOf(m15959b(j))}, 1));
                    C12775o.m28638h(format, "java.lang.String.format(locale, format, *args)");
                    bundle.putString("fb_mobile_time_between_sessions", format);
                    C8106j g = hVar.mo41943g();
                    if (g == null || (str3 = g.toString()) == null) {
                        str3 = "Unclassified";
                    }
                    bundle.putString("fb_mobile_launch_source", str3);
                    Long e2 = hVar.mo41941e();
                    if (e2 != null) {
                        j3 = e2.longValue();
                    }
                    bundle.putLong("_logTime", j3 / ((long) 1000));
                    new C2867m(str, str2, (C4509a) null).mo28388c("fb_mobile_deactivate_app", ((double) f) / ((double) 1000), bundle);
                }
            } catch (Throwable th) {
                C9925a.m20732b(th, cls);
            }
        }
    }

    /* renamed from: a */
    public final String mo41952a(Context context) {
        if (C9925a.m20734d(this)) {
            return null;
        }
        try {
            C12775o.m28639i(context, "context");
            try {
                PackageManager packageManager = context.getPackageManager();
                String str = "PCKGCHKSUM;" + packageManager.getPackageInfo(context.getPackageName(), 0).versionName;
                SharedPreferences sharedPreferences = context.getSharedPreferences(FacebookSdk.APP_EVENT_PREFERENCES, 0);
                String string = sharedPreferences.getString(str, (String) null);
                if (string != null && string.length() == 32) {
                    return string;
                }
                String c = C8101g.m15942c(context, (Long) null);
                if (c == null) {
                    c = C8101g.m15941b(packageManager.getApplicationInfo(context.getPackageName(), 0).sourceDir);
                }
                sharedPreferences.edit().putString(str, c).apply();
                return c;
            } catch (Exception unused) {
                return null;
            }
        } catch (Throwable th) {
            C9925a.m20732b(th, this);
            return null;
        }
    }
}
