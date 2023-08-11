package p231t4;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.collection.SimpleArrayMap;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.core.p004os.ConfigurationCompat;
import com.google.android.gms.common.C4784b;
import java.util.Locale;
import p023a5.C2207e;
import p097g4.C7773b;
import p180o4.C8977f;
import p286y4.C10675i;

/* renamed from: t4.b0 */
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
public final class C9663b0 {

    /* renamed from: a */
    private static final SimpleArrayMap<String, String> f14374a = new SimpleArrayMap<>();
    @Nullable

    /* renamed from: b */
    private static Locale f14375b;

    /* renamed from: a */
    public static String m20103a(Context context) {
        String packageName = context.getPackageName();
        try {
            return C2207e.m1805a(context).mo23529d(packageName).toString();
        } catch (PackageManager.NameNotFoundException | NullPointerException unused) {
            String str = context.getApplicationInfo().name;
            if (TextUtils.isEmpty(str)) {
                return packageName;
            }
            return str;
        }
    }

    /* renamed from: b */
    public static String m20104b(Context context) {
        return context.getResources().getString(C7773b.f10802g);
    }

    @NonNull
    /* renamed from: c */
    public static String m20105c(Context context, int i) {
        Resources resources = context.getResources();
        if (i == 1) {
            return resources.getString(C7773b.f10799d);
        }
        if (i == 2) {
            return resources.getString(C7773b.f10805j);
        }
        if (i != 3) {
            return resources.getString(17039370);
        }
        return resources.getString(C7773b.f10796a);
    }

    @NonNull
    /* renamed from: d */
    public static String m20106d(Context context, int i) {
        Resources resources = context.getResources();
        String a = m20103a(context);
        if (i == 1) {
            return resources.getString(C7773b.f10800e, new Object[]{a});
        } else if (i != 2) {
            if (i == 3) {
                return resources.getString(C7773b.f10797b, new Object[]{a});
            } else if (i == 5) {
                return m20110h(context, "common_google_play_services_invalid_account_text", a);
            } else {
                if (i == 7) {
                    return m20110h(context, "common_google_play_services_network_error_text", a);
                }
                if (i == 9) {
                    return resources.getString(C7773b.f10804i, new Object[]{a});
                } else if (i == 20) {
                    return m20110h(context, "common_google_play_services_restricted_profile_text", a);
                } else {
                    switch (i) {
                        case 16:
                            return m20110h(context, "common_google_play_services_api_unavailable_text", a);
                        case 17:
                            return m20110h(context, "common_google_play_services_sign_in_failed_text", a);
                        case 18:
                            return resources.getString(C7773b.f10808m, new Object[]{a});
                        default:
                            return resources.getString(C8977f.f13065a, new Object[]{a});
                    }
                }
            }
        } else if (C10675i.m22686d(context)) {
            return resources.getString(C7773b.f10809n);
        } else {
            return resources.getString(C7773b.f10806k, new Object[]{a});
        }
    }

    @NonNull
    /* renamed from: e */
    public static String m20107e(Context context, int i) {
        if (i == 6 || i == 19) {
            return m20110h(context, "common_google_play_services_resolution_required_text", m20103a(context));
        }
        return m20106d(context, i);
    }

    @NonNull
    /* renamed from: f */
    public static String m20108f(Context context, int i) {
        String str;
        if (i == 6) {
            str = m20111i(context, "common_google_play_services_resolution_required_title");
        } else {
            str = m20109g(context, i);
        }
        if (str == null) {
            return context.getResources().getString(C7773b.f10803h);
        }
        return str;
    }

    @Nullable
    /* renamed from: g */
    public static String m20109g(Context context, int i) {
        Resources resources = context.getResources();
        switch (i) {
            case 1:
                return resources.getString(C7773b.f10801f);
            case 2:
                return resources.getString(C7773b.f10807l);
            case 3:
                return resources.getString(C7773b.f10798c);
            case 4:
            case 6:
            case 18:
                return null;
            case 5:
                Log.e("GoogleApiAvailability", "An invalid account was specified when connecting. Please provide a valid account.");
                return m20111i(context, "common_google_play_services_invalid_account_title");
            case 7:
                Log.e("GoogleApiAvailability", "Network error occurred. Please retry request later.");
                return m20111i(context, "common_google_play_services_network_error_title");
            case 8:
                Log.e("GoogleApiAvailability", "Internal error occurred. Please see logs for detailed information");
                return null;
            case 9:
                Log.e("GoogleApiAvailability", "Google Play services is invalid. Cannot recover.");
                return null;
            case 10:
                Log.e("GoogleApiAvailability", "Developer error occurred. Please see logs for detailed information");
                return null;
            case 11:
                Log.e("GoogleApiAvailability", "The application is not licensed to the user.");
                return null;
            case 16:
                Log.e("GoogleApiAvailability", "One of the API components you attempted to connect to is not available.");
                return null;
            case 17:
                Log.e("GoogleApiAvailability", "The specified account could not be signed in.");
                return m20111i(context, "common_google_play_services_sign_in_failed_title");
            case 20:
                Log.e("GoogleApiAvailability", "The current user profile is restricted and could not use authenticated features.");
                return m20111i(context, "common_google_play_services_restricted_profile_title");
            default:
                StringBuilder sb = new StringBuilder(33);
                sb.append("Unexpected error code ");
                sb.append(i);
                Log.e("GoogleApiAvailability", sb.toString());
                return null;
        }
    }

    /* renamed from: h */
    private static String m20110h(Context context, String str, String str2) {
        Resources resources = context.getResources();
        String i = m20111i(context, str);
        if (i == null) {
            i = resources.getString(C8977f.f13065a);
        }
        return String.format(resources.getConfiguration().locale, i, new Object[]{str2});
    }

    @Nullable
    /* renamed from: i */
    private static String m20111i(Context context, String str) {
        String str2;
        String str3;
        SimpleArrayMap<String, String> simpleArrayMap = f14374a;
        synchronized (simpleArrayMap) {
            Locale locale = ConfigurationCompat.getLocales(context.getResources().getConfiguration()).get(0);
            if (!locale.equals(f14375b)) {
                simpleArrayMap.clear();
                f14375b = locale;
            }
            String str4 = simpleArrayMap.get(str);
            if (str4 != null) {
                return str4;
            }
            Resources e = C4784b.m6692e(context);
            if (e == null) {
                return null;
            }
            int identifier = e.getIdentifier(str, TypedValues.Custom.S_STRING, "com.google.android.gms");
            if (identifier == 0) {
                if (str.length() != 0) {
                    str3 = "Missing resource: ".concat(str);
                } else {
                    str3 = new String("Missing resource: ");
                }
                Log.w("GoogleApiAvailability", str3);
                return null;
            }
            String string = e.getString(identifier);
            if (TextUtils.isEmpty(string)) {
                if (str.length() != 0) {
                    str2 = "Got empty resource: ".concat(str);
                } else {
                    str2 = new String("Got empty resource: ");
                }
                Log.w("GoogleApiAvailability", str2);
                return null;
            }
            simpleArrayMap.put(str, string);
            return string;
        }
    }
}
