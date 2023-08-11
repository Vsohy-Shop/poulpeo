package com.google.android.gms.internal.gtm;

import androidx.exifinterface.media.ExifInterface;
import java.util.Map;
import p231t4.C9713p;

/* renamed from: com.google.android.gms.internal.gtm.g1 */
public class C5348g1 extends C5407k {

    /* renamed from: d */
    private static C5348g1 f5993d;

    public C5348g1(C5437m mVar) {
        super(mVar);
    }

    /* renamed from: U0 */
    private static String m7948U0(Object obj) {
        if (obj == null) {
            return null;
        }
        if (obj instanceof Integer) {
            obj = Long.valueOf((long) ((Integer) obj).intValue());
        }
        String str = "-";
        if (obj instanceof Long) {
            Long l = (Long) obj;
            if (Math.abs(l.longValue()) < 100) {
                return String.valueOf(obj);
            }
            if (String.valueOf(obj).charAt(0) != '-') {
                str = "";
            }
            String valueOf = String.valueOf(Math.abs(l.longValue()));
            return str + Math.round(Math.pow(10.0d, (double) (valueOf.length() - 1))) + "..." + str + Math.round(Math.pow(10.0d, (double) valueOf.length()) - 1.0d);
        } else if (obj instanceof Boolean) {
            return String.valueOf(obj);
        } else {
            if (obj instanceof Throwable) {
                return obj.getClass().getCanonicalName();
            }
            return str;
        }
    }

    /* renamed from: V0 */
    public static C5348g1 m7949V0() {
        return f5993d;
    }

    /* access modifiers changed from: protected */
    /* renamed from: P0 */
    public final void mo33181P0() {
        synchronized (C5348g1.class) {
            f5993d = this;
        }
    }

    /* renamed from: R0 */
    public final void mo33214R0(C5273b1 b1Var, String str) {
        String str2;
        String str3;
        if (b1Var != null) {
            str2 = b1Var.toString();
        } else {
            str2 = "no hit data";
        }
        String valueOf = String.valueOf(str);
        if (valueOf.length() != 0) {
            str3 = "Discarding hit. ".concat(valueOf);
        } else {
            str3 = new String("Discarding hit. ");
        }
        mo33262E0(str3, str2);
    }

    /* renamed from: S0 */
    public final void mo33215S0(Map<String, String> map, String str) {
        String str2;
        String str3;
        if (map != null) {
            StringBuilder sb = new StringBuilder();
            for (Map.Entry next : map.entrySet()) {
                if (sb.length() > 0) {
                    sb.append(',');
                }
                sb.append((String) next.getKey());
                sb.append('=');
                sb.append((String) next.getValue());
            }
            str2 = sb.toString();
        } else {
            str2 = "no hit data";
        }
        String valueOf = String.valueOf(str);
        if (valueOf.length() != 0) {
            str3 = "Discarding hit. ".concat(valueOf);
        } else {
            str3 = new String("Discarding hit. ");
        }
        mo33262E0(str3, str2);
    }

    /* renamed from: T0 */
    public final synchronized void mo33216T0(int i, String str, Object obj, Object obj2, Object obj3) {
        char c;
        C9713p.m20275j(str);
        if (i < 0) {
            i = 0;
        }
        if (i >= 9) {
            i = 8;
        }
        if (mo33281t0().mo33417a()) {
            c = 'C';
        } else {
            c = 'c';
        }
        char charAt = "01VDIWEA?".charAt(i);
        String str2 = C5422l.f6100a;
        String Y = C5392j.m8048Y(str, m7948U0(obj), m7948U0(obj2), m7948U0(obj3));
        StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 4 + String.valueOf(Y).length());
        sb.append(ExifInterface.GPS_MEASUREMENT_3D);
        sb.append(charAt);
        sb.append(c);
        sb.append(str2);
        sb.append(":");
        sb.append(Y);
        String sb2 = sb.toString();
        if (sb2.length() > 1024) {
            sb2 = sb2.substring(0, 1024);
        }
        C5409k1 q = mo33278j0().mo33342q();
        if (q != null) {
            q.mo33316X0().mo33346a(sb2);
        }
    }
}
