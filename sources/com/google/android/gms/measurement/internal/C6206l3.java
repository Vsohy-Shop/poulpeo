package com.google.android.gms.measurement.internal;

import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.GuardedBy;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
import p231t4.C9713p;

/* renamed from: com.google.android.gms.measurement.internal.l3 */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.0.0 */
public final class C6206l3 extends C6197k5 {
    /* access modifiers changed from: private */

    /* renamed from: c */
    public char f7935c = 0;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public long f7936d = -1;
    @GuardedBy("this")

    /* renamed from: e */
    private String f7937e;

    /* renamed from: f */
    private final C6184j3 f7938f = new C6184j3(this, 6, false, false);

    /* renamed from: g */
    private final C6184j3 f7939g = new C6184j3(this, 6, true, false);

    /* renamed from: h */
    private final C6184j3 f7940h = new C6184j3(this, 6, false, true);

    /* renamed from: i */
    private final C6184j3 f7941i = new C6184j3(this, 5, false, false);

    /* renamed from: j */
    private final C6184j3 f7942j = new C6184j3(this, 5, true, false);

    /* renamed from: k */
    private final C6184j3 f7943k = new C6184j3(this, 5, false, true);

    /* renamed from: l */
    private final C6184j3 f7944l = new C6184j3(this, 4, false, false);

    /* renamed from: m */
    private final C6184j3 f7945m = new C6184j3(this, 3, false, false);

    /* renamed from: n */
    private final C6184j3 f7946n = new C6184j3(this, 2, false, false);

    C6206l3(C6251p4 p4Var) {
        super(p4Var);
    }

    /* renamed from: A */
    static String m10855A(boolean z, String str, Object obj, Object obj2, Object obj3) {
        String str2 = "";
        if (str == null) {
            str = str2;
        }
        String B = m10856B(z, obj);
        String B2 = m10856B(z, obj2);
        String B3 = m10856B(z, obj3);
        StringBuilder sb = new StringBuilder();
        if (!TextUtils.isEmpty(str)) {
            sb.append(str);
            str2 = ": ";
        }
        String str3 = ", ";
        if (!TextUtils.isEmpty(B)) {
            sb.append(str2);
            sb.append(B);
            str2 = str3;
        }
        if (!TextUtils.isEmpty(B2)) {
            sb.append(str2);
            sb.append(B2);
        } else {
            str3 = str2;
        }
        if (!TextUtils.isEmpty(B3)) {
            sb.append(str3);
            sb.append(B3);
        }
        return sb.toString();
    }

    /* renamed from: B */
    static String m10856B(boolean z, Object obj) {
        String str;
        String className;
        String str2 = "";
        if (obj == null) {
            return str2;
        }
        if (obj instanceof Integer) {
            obj = Long.valueOf((long) ((Integer) obj).intValue());
        }
        int i = 0;
        if (obj instanceof Long) {
            if (!z) {
                return obj.toString();
            }
            Long l = (Long) obj;
            if (Math.abs(l.longValue()) < 100) {
                return obj.toString();
            }
            if (obj.toString().charAt(0) == '-') {
                str2 = "-";
            }
            String valueOf = String.valueOf(Math.abs(l.longValue()));
            long round = Math.round(Math.pow(10.0d, (double) (valueOf.length() - 1)));
            long round2 = Math.round(Math.pow(10.0d, (double) valueOf.length()) - 4.0d);
            StringBuilder sb = new StringBuilder(str2.length() + 43 + str2.length());
            sb.append(str2);
            sb.append(round);
            sb.append("...");
            sb.append(str2);
            sb.append(round2);
            return sb.toString();
        } else if (obj instanceof Boolean) {
            return obj.toString();
        } else {
            if (obj instanceof Throwable) {
                Throwable th = (Throwable) obj;
                if (z) {
                    str = th.getClass().getName();
                } else {
                    str = th.toString();
                }
                StringBuilder sb2 = new StringBuilder(str);
                String G = m10859G(C6251p4.class.getCanonicalName());
                StackTraceElement[] stackTrace = th.getStackTrace();
                int length = stackTrace.length;
                while (true) {
                    if (i >= length) {
                        break;
                    }
                    StackTraceElement stackTraceElement = stackTrace[i];
                    if (!stackTraceElement.isNativeMethod() && (className = stackTraceElement.getClassName()) != null && m10859G(className).equals(G)) {
                        sb2.append(": ");
                        sb2.append(stackTraceElement);
                        break;
                    }
                    i++;
                }
                return sb2.toString();
            } else if (obj instanceof C6195k3) {
                return ((C6195k3) obj).f7916a;
            } else {
                if (z) {
                    return "-";
                }
                return obj.toString();
            }
        }
    }

    /* renamed from: G */
    private static String m10859G(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        int lastIndexOf = str.lastIndexOf(46);
        if (lastIndexOf == -1) {
            return str;
        }
        return str.substring(0, lastIndexOf);
    }

    /* renamed from: z */
    protected static Object m10862z(String str) {
        if (str == null) {
            return null;
        }
        return new C6195k3(str);
    }

    /* access modifiers changed from: protected */
    @EnsuresNonNull({"logTagDoNotUseDirectly"})
    /* renamed from: C */
    public final String mo35072C() {
        String str;
        synchronized (this) {
            if (this.f7937e == null) {
                if (this.f7899a.mo35194Q() != null) {
                    this.f7937e = this.f7899a.mo35194Q();
                } else {
                    this.f7937e = this.f7899a.mo35211z().mo34892w();
                }
            }
            C9713p.m20275j(this.f7937e);
            str = this.f7937e;
        }
        return str;
    }

    /* access modifiers changed from: protected */
    /* renamed from: F */
    public final void mo35073F(int i, boolean z, boolean z2, String str, Object obj, Object obj2, Object obj3) {
        if (!z && Log.isLoggable(mo35072C(), i)) {
            Log.println(i, mo35072C(), m10855A(false, str, obj, obj2, obj3));
        }
        if (!z2 && i >= 5) {
            C9713p.m20275j(str);
            C6229n4 G = this.f7899a.mo35185G();
            if (G == null) {
                Log.println(6, mo35072C(), "Scheduler not set. Not logging error/warn");
            } else if (!G.mo35065n()) {
                Log.println(6, mo35072C(), "Scheduler not initialized. Not logging error/warn");
            } else {
                if (i >= 9) {
                    i = 8;
                }
                G.mo35110z(new C6173i3(this, i, str, obj, obj2, obj3));
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public final boolean mo35061j() {
        return false;
    }

    /* renamed from: q */
    public final C6184j3 mo35074q() {
        return this.f7945m;
    }

    /* renamed from: r */
    public final C6184j3 mo35075r() {
        return this.f7938f;
    }

    /* renamed from: s */
    public final C6184j3 mo35076s() {
        return this.f7940h;
    }

    /* renamed from: t */
    public final C6184j3 mo35077t() {
        return this.f7939g;
    }

    /* renamed from: u */
    public final C6184j3 mo35078u() {
        return this.f7944l;
    }

    /* renamed from: v */
    public final C6184j3 mo35079v() {
        return this.f7946n;
    }

    /* renamed from: w */
    public final C6184j3 mo35080w() {
        return this.f7941i;
    }

    /* renamed from: x */
    public final C6184j3 mo35081x() {
        return this.f7943k;
    }

    /* renamed from: y */
    public final C6184j3 mo35082y() {
        return this.f7942j;
    }
}
