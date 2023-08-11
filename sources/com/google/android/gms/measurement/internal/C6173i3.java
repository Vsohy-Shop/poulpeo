package com.google.android.gms.measurement.internal;

import android.util.Log;
import androidx.exifinterface.media.ExifInterface;

/* renamed from: com.google.android.gms.measurement.internal.i3 */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.0.0 */
final class C6173i3 implements Runnable {

    /* renamed from: b */
    final /* synthetic */ int f7857b;

    /* renamed from: c */
    final /* synthetic */ String f7858c;

    /* renamed from: d */
    final /* synthetic */ Object f7859d;

    /* renamed from: e */
    final /* synthetic */ Object f7860e;

    /* renamed from: f */
    final /* synthetic */ Object f7861f;

    /* renamed from: g */
    final /* synthetic */ C6206l3 f7862g;

    C6173i3(C6206l3 l3Var, int i, String str, Object obj, Object obj2, Object obj3) {
        this.f7862g = l3Var;
        this.f7857b = i;
        this.f7858c = str;
        this.f7859d = obj;
        this.f7860e = obj2;
        this.f7861f = obj3;
    }

    public final void run() {
        C6360z3 F = this.f7862g.f7899a.mo35184F();
        if (F.mo35065n()) {
            if (this.f7862g.f7935c == 0) {
                if (this.f7862g.f7899a.mo35211z().mo34879H()) {
                    C6206l3 l3Var = this.f7862g;
                    l3Var.f7899a.mo34924d();
                    l3Var.f7935c = 'C';
                } else {
                    C6206l3 l3Var2 = this.f7862g;
                    l3Var2.f7899a.mo34924d();
                    l3Var2.f7935c = 'c';
                }
            }
            if (this.f7862g.f7936d < 0) {
                C6206l3 l3Var3 = this.f7862g;
                l3Var3.f7899a.mo35211z().mo34886q();
                l3Var3.f7936d = 46000;
            }
            char charAt = "01VDIWEA?".charAt(this.f7857b);
            char o = this.f7862g.f7935c;
            long p = this.f7862g.f7936d;
            String A = C6206l3.m10855A(true, this.f7858c, this.f7859d, this.f7860e, this.f7861f);
            StringBuilder sb = new StringBuilder(A.length() + 24);
            sb.append(ExifInterface.GPS_MEASUREMENT_2D);
            sb.append(charAt);
            sb.append(o);
            sb.append(p);
            sb.append(":");
            sb.append(A);
            String sb2 = sb.toString();
            if (sb2.length() > 1024) {
                sb2 = this.f7858c.substring(0, 1024);
            }
            C6327w3 w3Var = F.f8434d;
            if (w3Var != null) {
                w3Var.mo35394b(sb2, 1);
                return;
            }
            return;
        }
        Log.println(6, this.f7862g.mo35072C(), "Persisted config not initialized. Not logging error/warn");
    }
}
