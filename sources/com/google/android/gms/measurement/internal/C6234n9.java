package com.google.android.gms.measurement.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.content.pm.Signature;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.text.TextUtils;
import androidx.annotation.WorkerThread;
import androidx.autofill.HintConstants;
import androidx.core.app.NotificationCompat;
import com.adjust.sdk.Constants;
import com.google.android.gms.common.C4718a;
import com.google.android.gms.common.C4785c;
import com.google.android.gms.internal.measurement.C5785i1;
import com.google.android.gms.internal.measurement.C5831kd;
import com.rmn.apiclient.impl.api.call.APIParams;
import com.rmn.apiclient.impl.api.descriptors.APIResourceDescriptors;
import java.io.ByteArrayInputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.TreeSet;
import java.util.concurrent.atomic.AtomicLong;
import javax.security.auth.x500.X500Principal;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
import p023a5.C2207e;
import p201q5.C9266m;
import p201q5.C9267n;
import p201q5.C9268o;
import p201q5.C9269p;
import p231t4.C9713p;
import p286y4.C10672f;

/* renamed from: com.google.android.gms.measurement.internal.n9 */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.0.0 */
public final class C6234n9 extends C6197k5 {

    /* renamed from: g */
    private static final String[] f8029g = {"firebase_", "google_", "ga_"};

    /* renamed from: h */
    private static final String[] f8030h = {"_err"};

    /* renamed from: i */
    public static final /* synthetic */ int f8031i = 0;

    /* renamed from: c */
    private SecureRandom f8032c;

    /* renamed from: d */
    private final AtomicLong f8033d = new AtomicLong(0);

    /* renamed from: e */
    private int f8034e;

    /* renamed from: f */
    private Integer f8035f = null;

    C6234n9(C6251p4 p4Var) {
        super(p4Var);
    }

    /* renamed from: V */
    static boolean m10921V(String str) {
        if (TextUtils.isEmpty(str) || !str.startsWith("_")) {
            return false;
        }
        return true;
    }

    /* renamed from: W */
    static boolean m10922W(String str) {
        C9713p.m20271f(str);
        if (str.charAt(0) != '_' || str.equals("_ep")) {
            return true;
        }
        return false;
    }

    /* renamed from: X */
    static boolean m10923X(Context context) {
        ActivityInfo receiverInfo;
        C9713p.m20275j(context);
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null || (receiverInfo = packageManager.getReceiverInfo(new ComponentName(context, "com.google.android.gms.measurement.AppMeasurementReceiver"), 0)) == null || !receiverInfo.enabled) {
                return false;
            }
            return true;
        } catch (PackageManager.NameNotFoundException unused) {
        }
    }

    /* renamed from: Y */
    static boolean m10924Y(Context context, boolean z) {
        C9713p.m20275j(context);
        return m10932i0(context, "com.google.android.gms.measurement.AppMeasurementJobService");
    }

    /* renamed from: Z */
    static boolean m10925Z(String str, String str2) {
        if (str == null && str2 == null) {
            return true;
        }
        if (str == null) {
            return false;
        }
        return str.equals(str2);
    }

    /* renamed from: a0 */
    public static boolean m10926a0(String str) {
        if (f8030h[0].equals(str)) {
            return false;
        }
        return true;
    }

    /* renamed from: d0 */
    static final boolean m10927d0(Bundle bundle, int i) {
        if (bundle.getLong("_err") != 0) {
            return false;
        }
        bundle.putLong("_err", (long) i);
        return true;
    }

    /* renamed from: e0 */
    static final boolean m10928e0(String str) {
        C9713p.m20275j(str);
        return str.matches("^(1:\\d+:android:[a-f0-9]+|ca-app-pub-.*)$");
    }

    /* renamed from: f0 */
    private final int m10929f0(String str) {
        if ("_ldl".equals(str)) {
            this.f7899a.mo35211z();
            return 2048;
        } else if ("_id".equals(str)) {
            this.f7899a.mo35211z();
            return 256;
        } else if (!this.f7899a.mo35211z().mo34873B((String) null, C6084a3.f7575d0) || !"_lgclid".equals(str)) {
            this.f7899a.mo35211z();
            return 36;
        } else {
            this.f7899a.mo35211z();
            return 100;
        }
    }

    /* renamed from: g0 */
    private final Object m10930g0(int i, Object obj, boolean z, boolean z2) {
        long j;
        if (obj == null) {
            return null;
        }
        if ((obj instanceof Long) || (obj instanceof Double)) {
            return obj;
        }
        if (obj instanceof Integer) {
            return Long.valueOf((long) ((Integer) obj).intValue());
        }
        if (obj instanceof Byte) {
            return Long.valueOf((long) ((Byte) obj).byteValue());
        }
        if (obj instanceof Short) {
            return Long.valueOf((long) ((Short) obj).shortValue());
        }
        if (obj instanceof Boolean) {
            if (true != ((Boolean) obj).booleanValue()) {
                j = 0;
            } else {
                j = 1;
            }
            return Long.valueOf(j);
        } else if (obj instanceof Float) {
            return Double.valueOf(((Float) obj).doubleValue());
        } else {
            if ((obj instanceof String) || (obj instanceof Character) || (obj instanceof CharSequence)) {
                return mo35147q(obj.toString(), i, z);
            }
            if (!z2 || (!(obj instanceof Bundle[]) && !(obj instanceof Parcelable[]))) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            for (Parcelable parcelable : (Parcelable[]) obj) {
                if (parcelable instanceof Bundle) {
                    Bundle u0 = mo35153u0((Bundle) parcelable);
                    if (!u0.isEmpty()) {
                        arrayList.add(u0);
                    }
                }
            }
            return arrayList.toArray(new Bundle[arrayList.size()]);
        }
    }

    /* renamed from: h0 */
    private static boolean m10931h0(String str, String[] strArr) {
        C9713p.m20275j(strArr);
        for (String Z : strArr) {
            if (m10925Z(str, Z)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: i0 */
    private static boolean m10932i0(Context context, String str) {
        ServiceInfo serviceInfo;
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null || (serviceInfo = packageManager.getServiceInfo(new ComponentName(context, str), 0)) == null || !serviceInfo.enabled) {
                return false;
            }
            return true;
        } catch (PackageManager.NameNotFoundException unused) {
        }
    }

    /* renamed from: q0 */
    static long m10933q0(byte[] bArr) {
        boolean z;
        C9713p.m20275j(bArr);
        int length = bArr.length;
        int i = 0;
        if (length > 0) {
            z = true;
        } else {
            z = false;
        }
        C9713p.m20278m(z);
        int i2 = length - 1;
        long j = 0;
        while (i2 >= 0 && i2 >= bArr.length - 8) {
            j += (((long) bArr[i2]) & 255) << i;
            i += 8;
            i2--;
        }
        return j;
    }

    /* renamed from: s */
    static MessageDigest m10934s() {
        int i = 0;
        while (i < 2) {
            try {
                MessageDigest instance = MessageDigest.getInstance(Constants.MD5);
                if (instance != null) {
                    return instance;
                }
                i++;
            } catch (NoSuchAlgorithmException unused) {
            }
        }
        return null;
    }

    /* renamed from: u */
    public static ArrayList<Bundle> m10935u(List<C6103c> list) {
        if (list == null) {
            return new ArrayList<>(0);
        }
        ArrayList<Bundle> arrayList = new ArrayList<>(list.size());
        for (C6103c next : list) {
            Bundle bundle = new Bundle();
            bundle.putString("app_id", next.f7652b);
            bundle.putString("origin", next.f7653c);
            bundle.putLong("creation_timestamp", next.f7655e);
            bundle.putString(HintConstants.AUTOFILL_HINT_NAME, next.f7654d.f7907c);
            C9266m.m19028b(bundle, C9713p.m20275j(next.f7654d.mo35057A()));
            bundle.putBoolean("active", next.f7656f);
            String str = next.f7657g;
            if (str != null) {
                bundle.putString("trigger_event_name", str);
            }
            C6290t tVar = next.f7658h;
            if (tVar != null) {
                bundle.putString("timed_out_event_name", tVar.f8229b);
                C6268r rVar = tVar.f8230c;
                if (rVar != null) {
                    bundle.putBundle("timed_out_event_params", rVar.mo35270G());
                }
            }
            bundle.putLong("trigger_timeout", next.f7659i);
            C6290t tVar2 = next.f7660j;
            if (tVar2 != null) {
                bundle.putString("triggered_event_name", tVar2.f8229b);
                C6268r rVar2 = tVar2.f8230c;
                if (rVar2 != null) {
                    bundle.putBundle("triggered_event_params", rVar2.mo35270G());
                }
            }
            bundle.putLong("triggered_timestamp", next.f7654d.f7908d);
            bundle.putLong("time_to_live", next.f7661k);
            C6290t tVar3 = next.f7662l;
            if (tVar3 != null) {
                bundle.putString("expired_event_name", tVar3.f8229b);
                C6268r rVar3 = tVar3.f8230c;
                if (rVar3 != null) {
                    bundle.putBundle("expired_event_params", rVar3.mo35270G());
                }
            }
            arrayList.add(bundle);
        }
        return arrayList;
    }

    @WorkerThread
    /* renamed from: x */
    public static void m10936x(C6319v6 v6Var, Bundle bundle, boolean z) {
        if (!(bundle == null || v6Var == null)) {
            if (!bundle.containsKey("_sc") || z) {
                String str = v6Var.f8323a;
                if (str != null) {
                    bundle.putString("_sn", str);
                } else {
                    bundle.remove("_sn");
                }
                String str2 = v6Var.f8324b;
                if (str2 != null) {
                    bundle.putString("_sc", str2);
                } else {
                    bundle.remove("_sc");
                }
                bundle.putLong("_si", v6Var.f8325c);
                return;
            }
            z = false;
        }
        if (bundle != null && v6Var == null && z) {
            bundle.remove("_sn");
            bundle.remove("_sc");
            bundle.remove("_si");
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: A */
    public final void mo35115A(C6223m9 m9Var, String str, int i, String str2, String str3, int i2) {
        Bundle bundle = new Bundle();
        m10927d0(bundle, i);
        if (!TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str3)) {
            bundle.putString(str2, str3);
        }
        if (i == 6 || i == 7 || i == 2) {
            bundle.putLong("_el", (long) i2);
        }
        m9Var.mo34852a(str, "_err", bundle);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: B */
    public final void mo35116B(Bundle bundle, String str, Object obj) {
        String str2;
        if (bundle != null) {
            if (obj instanceof Long) {
                bundle.putLong(str, ((Long) obj).longValue());
            } else if (obj instanceof String) {
                bundle.putString(str, String.valueOf(obj));
            } else if (obj instanceof Double) {
                bundle.putDouble(str, ((Double) obj).doubleValue());
            } else if (obj instanceof Bundle[]) {
                bundle.putParcelableArray(str, (Bundle[]) obj);
            } else if (str != null) {
                if (obj != null) {
                    str2 = obj.getClass().getSimpleName();
                } else {
                    str2 = null;
                }
                this.f7899a.mo34920b().mo35081x().mo35039c("Not putting event parameter. Invalid value type. name, type", this.f7899a.mo35182D().mo34900e(str), str2);
            }
        }
    }

    /* renamed from: C */
    public final void mo35117C(C5785i1 i1Var, boolean z) {
        Bundle bundle = new Bundle();
        bundle.putBoolean("r", z);
        try {
            i1Var.mo33691r(bundle);
        } catch (RemoteException e) {
            this.f7899a.mo34920b().mo35080w().mo35038b("Error returning boolean value to wrapper", e);
        }
    }

    /* renamed from: D */
    public final void mo35118D(C5785i1 i1Var, ArrayList<Bundle> arrayList) {
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList("r", arrayList);
        try {
            i1Var.mo33691r(bundle);
        } catch (RemoteException e) {
            this.f7899a.mo34920b().mo35080w().mo35038b("Error returning bundle list to wrapper", e);
        }
    }

    /* renamed from: E */
    public final void mo35119E(C5785i1 i1Var, Bundle bundle) {
        try {
            i1Var.mo33691r(bundle);
        } catch (RemoteException e) {
            this.f7899a.mo34920b().mo35080w().mo35038b("Error returning bundle value to wrapper", e);
        }
    }

    /* renamed from: F */
    public final void mo35120F(C5785i1 i1Var, byte[] bArr) {
        Bundle bundle = new Bundle();
        bundle.putByteArray("r", bArr);
        try {
            i1Var.mo33691r(bundle);
        } catch (RemoteException e) {
            this.f7899a.mo34920b().mo35080w().mo35038b("Error returning byte array to wrapper", e);
        }
    }

    /* renamed from: G */
    public final void mo35121G(C5785i1 i1Var, int i) {
        Bundle bundle = new Bundle();
        bundle.putInt("r", i);
        try {
            i1Var.mo33691r(bundle);
        } catch (RemoteException e) {
            this.f7899a.mo34920b().mo35080w().mo35038b("Error returning int value to wrapper", e);
        }
    }

    /* renamed from: H */
    public final void mo35122H(C5785i1 i1Var, long j) {
        Bundle bundle = new Bundle();
        bundle.putLong("r", j);
        try {
            i1Var.mo33691r(bundle);
        } catch (RemoteException e) {
            this.f7899a.mo34920b().mo35080w().mo35038b("Error returning long value to wrapper", e);
        }
    }

    /* renamed from: I */
    public final void mo35123I(C5785i1 i1Var, String str) {
        Bundle bundle = new Bundle();
        bundle.putString("r", str);
        try {
            i1Var.mo33691r(bundle);
        } catch (RemoteException e) {
            this.f7899a.mo34920b().mo35080w().mo35038b("Error returning string value to wrapper", e);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: J */
    public final void mo35124J(String str, String str2, String str3, Bundle bundle, List<String> list, boolean z) {
        int i;
        String str4;
        int i2;
        String str5;
        int i3;
        String str6 = str2;
        Bundle bundle2 = bundle;
        List<String> list2 = list;
        if (bundle2 != null) {
            this.f7899a.mo35211z();
            int i4 = 0;
            for (String str7 : new TreeSet(bundle.keySet())) {
                if (list2 == null || !list2.contains(str7)) {
                    if (!z) {
                        i3 = mo35141m0(str7);
                    } else {
                        i3 = 0;
                    }
                    if (i3 == 0) {
                        i3 = mo35140l0(str7);
                    }
                    i = i3;
                } else {
                    i = 0;
                }
                if (i != 0) {
                    if (i == 3) {
                        str5 = str7;
                    } else {
                        str5 = null;
                    }
                    mo35156w(bundle, i, str7, str7, str5);
                    bundle2.remove(str7);
                } else {
                    if (mo35134T(bundle2.get(str7))) {
                        this.f7899a.mo34920b().mo35081x().mo35040d("Nested Bundle parameters are not allowed; discarded. event name, param name, child param name", str6, str3, str7);
                        i2 = 22;
                        str4 = str7;
                    } else {
                        String str8 = str3;
                        str4 = str7;
                        i2 = mo35129O(str, str2, str7, bundle2.get(str7), bundle, list, z, false);
                    }
                    if (i2 != 0 && !"_ev".equals(str4)) {
                        mo35156w(bundle, i2, str4, str4, bundle2.get(str4));
                        bundle2.remove(str4);
                    } else if (m10922W(str4) && !m10931h0(str4, C9268o.f13614d) && (i4 = i4 + 1) > 0) {
                        this.f7899a.mo34920b().mo35076s().mo35039c("Item cannot contain custom parameters", this.f7899a.mo35182D().mo34899d(str6), this.f7899a.mo35182D().mo34897b(bundle2));
                        m10927d0(bundle2, 23);
                        bundle2.remove(str4);
                    }
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: K */
    public final boolean mo35125K(String str, String str2, String str3) {
        if (TextUtils.isEmpty(str)) {
            C5831kd.m9523b();
            if (this.f7899a.mo35211z().mo34873B((String) null, C6084a3.f7577e0) && !TextUtils.isEmpty(str3)) {
                return true;
            }
            if (TextUtils.isEmpty(str2)) {
                if (this.f7899a.mo35206q()) {
                    this.f7899a.mo34920b().mo35076s().mo35037a("Missing google_app_id. Firebase Analytics disabled. See https://goo.gl/NAOOOI");
                }
                return false;
            } else if (m10928e0(str2)) {
                return true;
            } else {
                this.f7899a.mo34920b().mo35076s().mo35038b("Invalid admob_app_id. Analytics disabled.", C6206l3.m10862z(str2));
                return false;
            }
        } else if (m10928e0(str)) {
            return true;
        } else {
            if (this.f7899a.mo35206q()) {
                this.f7899a.mo34920b().mo35076s().mo35038b("Invalid google_app_id. Firebase Analytics disabled. See https://goo.gl/NAOOOI. provided id", C6206l3.m10862z(str));
            }
            return false;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: L */
    public final boolean mo35126L(String str, int i, String str2) {
        if (str2 == null) {
            this.f7899a.mo34920b().mo35076s().mo35038b("Name is required and can't be null. Type", str);
            return false;
        } else if (str2.codePointCount(0, str2.length()) <= i) {
            return true;
        } else {
            this.f7899a.mo34920b().mo35076s().mo35040d("Name is too long. Type, maximum supported length, name", str, Integer.valueOf(i), str2);
            return false;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: M */
    public final boolean mo35127M(String str, String[] strArr, String[] strArr2, String str2) {
        if (str2 == null) {
            this.f7899a.mo34920b().mo35076s().mo35038b("Name is required and can't be null. Type", str);
            return false;
        }
        C9713p.m20275j(str2);
        String[] strArr3 = f8029g;
        for (int i = 0; i < 3; i++) {
            if (str2.startsWith(strArr3[i])) {
                this.f7899a.mo34920b().mo35076s().mo35039c("Name starts with reserved prefix. Type, name", str, str2);
                return false;
            }
        }
        if (strArr == null || !m10931h0(str2, strArr)) {
            return true;
        }
        if (strArr2 != null && m10931h0(str2, strArr2)) {
            return true;
        }
        this.f7899a.mo34920b().mo35076s().mo35039c("Name is reserved. Type, name", str, str2);
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: N */
    public final boolean mo35128N(String str, String str2, int i, Object obj) {
        if (obj != null && !(obj instanceof Long) && !(obj instanceof Float) && !(obj instanceof Integer) && !(obj instanceof Byte) && !(obj instanceof Short) && !(obj instanceof Boolean) && !(obj instanceof Double)) {
            if (!(obj instanceof String) && !(obj instanceof Character) && !(obj instanceof CharSequence)) {
                return false;
            }
            String obj2 = obj.toString();
            if (obj2.codePointCount(0, obj2.length()) > i) {
                this.f7899a.mo34920b().mo35081x().mo35040d("Value is too long; discarded. Value kind, name, value length", str, str2, Integer.valueOf(obj2.length()));
                return false;
            }
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00c8  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00d0  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00dd A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00de  */
    @androidx.annotation.WorkerThread
    /* renamed from: O */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo35129O(java.lang.String r15, java.lang.String r16, java.lang.String r17, java.lang.Object r18, android.os.Bundle r19, java.util.List<java.lang.String> r20, boolean r21, boolean r22) {
        /*
            r14 = this;
            r7 = r14
            r8 = r17
            r0 = r18
            r1 = r19
            r14.mo34778h()
            boolean r2 = r14.mo35134T(r0)
            java.lang.String r3 = "param"
            r4 = 0
            if (r2 == 0) goto L_0x00ac
            if (r22 == 0) goto L_0x00a9
            java.lang.String[] r2 = p201q5.C9268o.f13613c
            boolean r2 = m10931h0(r8, r2)
            if (r2 != 0) goto L_0x0020
            r0 = 20
            return r0
        L_0x0020:
            com.google.android.gms.measurement.internal.p4 r2 = r7.f7899a
            com.google.android.gms.measurement.internal.d8 r2 = r2.mo35189L()
            r2.mo34778h()
            r2.mo35413i()
            boolean r5 = r2.mo34819B()
            if (r5 != 0) goto L_0x0033
            goto L_0x0045
        L_0x0033:
            com.google.android.gms.measurement.internal.p4 r2 = r2.f7899a
            com.google.android.gms.measurement.internal.n9 r2 = r2.mo35191N()
            int r2 = r2.mo35144o0()
            r5 = 200900(0x310c4, float:2.81521E-40)
            if (r2 >= r5) goto L_0x0045
            r0 = 25
            return r0
        L_0x0045:
            com.google.android.gms.measurement.internal.p4 r2 = r7.f7899a
            r2.mo35211z()
            boolean r2 = r0 instanceof android.os.Parcelable[]
            if (r2 == 0) goto L_0x0053
            r5 = r0
            android.os.Parcelable[] r5 = (android.os.Parcelable[]) r5
            int r5 = r5.length
            goto L_0x005e
        L_0x0053:
            boolean r5 = r0 instanceof java.util.ArrayList
            if (r5 == 0) goto L_0x00ac
            r5 = r0
            java.util.ArrayList r5 = (java.util.ArrayList) r5
            int r5 = r5.size()
        L_0x005e:
            r6 = 200(0xc8, float:2.8E-43)
            if (r5 <= r6) goto L_0x00ac
            com.google.android.gms.measurement.internal.p4 r9 = r7.f7899a
            com.google.android.gms.measurement.internal.l3 r9 = r9.mo34920b()
            com.google.android.gms.measurement.internal.j3 r9 = r9.mo35081x()
            java.lang.String r10 = "Parameter array is too long; discarded. Value kind, name, array length"
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r9.mo35040d(r10, r3, r8, r5)
            com.google.android.gms.measurement.internal.p4 r5 = r7.f7899a
            r5.mo35211z()
            r5 = 17
            if (r2 == 0) goto L_0x008e
            r2 = r0
            android.os.Parcelable[] r2 = (android.os.Parcelable[]) r2
            int r9 = r2.length
            if (r9 <= r6) goto L_0x00a7
            java.lang.Object[] r2 = java.util.Arrays.copyOf(r2, r6)
            android.os.Parcelable[] r2 = (android.os.Parcelable[]) r2
            r1.putParcelableArray(r8, r2)
            goto L_0x00a7
        L_0x008e:
            boolean r2 = r0 instanceof java.util.ArrayList
            if (r2 == 0) goto L_0x00a7
            r2 = r0
            java.util.ArrayList r2 = (java.util.ArrayList) r2
            int r9 = r2.size()
            if (r9 <= r6) goto L_0x00a7
            java.util.ArrayList r9 = new java.util.ArrayList
            java.util.List r2 = r2.subList(r4, r6)
            r9.<init>(r2)
            r1.putParcelableArrayList(r8, r9)
        L_0x00a7:
            r9 = r5
            goto L_0x00ad
        L_0x00a9:
            r0 = 21
            return r0
        L_0x00ac:
            r9 = r4
        L_0x00ad:
            com.google.android.gms.measurement.internal.p4 r1 = r7.f7899a
            com.google.android.gms.measurement.internal.g r1 = r1.mo35211z()
            com.google.android.gms.measurement.internal.z2<java.lang.Boolean> r2 = com.google.android.gms.measurement.internal.C6084a3.f7561T
            r10 = r15
            boolean r1 = r1.mo34873B(r15, r2)
            if (r1 == 0) goto L_0x00c2
            boolean r1 = m10921V(r16)
            if (r1 != 0) goto L_0x00c8
        L_0x00c2:
            boolean r1 = m10921V(r17)
            if (r1 == 0) goto L_0x00d0
        L_0x00c8:
            com.google.android.gms.measurement.internal.p4 r1 = r7.f7899a
            r1.mo35211z()
            r1 = 256(0x100, float:3.59E-43)
            goto L_0x00d7
        L_0x00d0:
            com.google.android.gms.measurement.internal.p4 r1 = r7.f7899a
            r1.mo35211z()
            r1 = 100
        L_0x00d7:
            boolean r1 = r14.mo35128N(r3, r8, r1, r0)
            if (r1 == 0) goto L_0x00de
            return r9
        L_0x00de:
            if (r22 == 0) goto L_0x0171
            boolean r1 = r0 instanceof android.os.Bundle
            if (r1 == 0) goto L_0x00f6
            r4 = r0
            android.os.Bundle r4 = (android.os.Bundle) r4
            r0 = r14
            r1 = r15
            r2 = r16
            r3 = r17
            r5 = r20
            r6 = r21
            r0.mo35124J(r1, r2, r3, r4, r5, r6)
            goto L_0x0170
        L_0x00f6:
            boolean r1 = r0 instanceof android.os.Parcelable[]
            if (r1 == 0) goto L_0x012e
            r11 = r0
            android.os.Parcelable[] r11 = (android.os.Parcelable[]) r11
            int r12 = r11.length
            r13 = r4
        L_0x00ff:
            if (r13 >= r12) goto L_0x0170
            r0 = r11[r13]
            boolean r1 = r0 instanceof android.os.Bundle
            if (r1 != 0) goto L_0x011b
            com.google.android.gms.measurement.internal.p4 r1 = r7.f7899a
            com.google.android.gms.measurement.internal.l3 r1 = r1.mo34920b()
            com.google.android.gms.measurement.internal.j3 r1 = r1.mo35081x()
            java.lang.Class r0 = r0.getClass()
            java.lang.String r2 = "All Parcelable[] elements must be of type Bundle. Value type, name"
            r1.mo35039c(r2, r0, r8)
            goto L_0x0171
        L_0x011b:
            r4 = r0
            android.os.Bundle r4 = (android.os.Bundle) r4
            r0 = r14
            r1 = r15
            r2 = r16
            r3 = r17
            r5 = r20
            r6 = r21
            r0.mo35124J(r1, r2, r3, r4, r5, r6)
            int r13 = r13 + 1
            goto L_0x00ff
        L_0x012e:
            boolean r1 = r0 instanceof java.util.ArrayList
            if (r1 == 0) goto L_0x0171
            r11 = r0
            java.util.ArrayList r11 = (java.util.ArrayList) r11
            int r12 = r11.size()
            r13 = r4
        L_0x013a:
            if (r13 >= r12) goto L_0x0170
            java.lang.Object r0 = r11.get(r13)
            boolean r1 = r0 instanceof android.os.Bundle
            if (r1 != 0) goto L_0x015d
            com.google.android.gms.measurement.internal.p4 r1 = r7.f7899a
            com.google.android.gms.measurement.internal.l3 r1 = r1.mo34920b()
            com.google.android.gms.measurement.internal.j3 r1 = r1.mo35081x()
            if (r0 == 0) goto L_0x0155
            java.lang.Class r0 = r0.getClass()
            goto L_0x0157
        L_0x0155:
            java.lang.String r0 = "null"
        L_0x0157:
            java.lang.String r2 = "All ArrayList elements must be of type Bundle. Value type, name"
            r1.mo35039c(r2, r0, r8)
            goto L_0x0171
        L_0x015d:
            r4 = r0
            android.os.Bundle r4 = (android.os.Bundle) r4
            r0 = r14
            r1 = r15
            r2 = r16
            r3 = r17
            r5 = r20
            r6 = r21
            r0.mo35124J(r1, r2, r3, r4, r5, r6)
            int r13 = r13 + 1
            goto L_0x013a
        L_0x0170:
            return r9
        L_0x0171:
            r0 = 4
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C6234n9.mo35129O(java.lang.String, java.lang.String, java.lang.String, java.lang.Object, android.os.Bundle, java.util.List, boolean, boolean):int");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: P */
    public final boolean mo35130P(String str, String str2) {
        if (str2 == null) {
            this.f7899a.mo34920b().mo35076s().mo35038b("Name is required and can't be null. Type", str);
            return false;
        } else if (str2.length() == 0) {
            this.f7899a.mo34920b().mo35076s().mo35038b("Name is required and can't be empty. Type", str);
            return false;
        } else {
            int codePointAt = str2.codePointAt(0);
            if (!Character.isLetter(codePointAt)) {
                if (codePointAt == 95) {
                    codePointAt = 95;
                } else {
                    this.f7899a.mo34920b().mo35076s().mo35039c("Name must start with a letter or _ (underscore). Type, name", str, str2);
                    return false;
                }
            }
            int length = str2.length();
            int charCount = Character.charCount(codePointAt);
            while (charCount < length) {
                int codePointAt2 = str2.codePointAt(charCount);
                if (codePointAt2 == 95 || Character.isLetterOrDigit(codePointAt2)) {
                    charCount += Character.charCount(codePointAt2);
                } else {
                    this.f7899a.mo34920b().mo35076s().mo35039c("Name must consist of letters, digits or _ (underscores). Type, name", str, str2);
                    return false;
                }
            }
            return true;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: Q */
    public final boolean mo35131Q(String str, String str2) {
        if (str2 == null) {
            this.f7899a.mo34920b().mo35076s().mo35038b("Name is required and can't be null. Type", str);
            return false;
        } else if (str2.length() == 0) {
            this.f7899a.mo34920b().mo35076s().mo35038b("Name is required and can't be empty. Type", str);
            return false;
        } else {
            int codePointAt = str2.codePointAt(0);
            if (!Character.isLetter(codePointAt)) {
                this.f7899a.mo34920b().mo35076s().mo35039c("Name must start with a letter. Type, name", str, str2);
                return false;
            }
            int length = str2.length();
            int charCount = Character.charCount(codePointAt);
            while (charCount < length) {
                int codePointAt2 = str2.codePointAt(charCount);
                if (codePointAt2 == 95 || Character.isLetterOrDigit(codePointAt2)) {
                    charCount += Character.charCount(codePointAt2);
                } else {
                    this.f7899a.mo34920b().mo35076s().mo35039c("Name must consist of letters, digits or _ (underscores). Type, name", str, str2);
                    return false;
                }
            }
            return true;
        }
    }

    /* access modifiers changed from: package-private */
    @WorkerThread
    /* renamed from: R */
    public final boolean mo35132R(String str) {
        mo34778h();
        if (C2207e.m1805a(this.f7899a.mo34927f()).mo23526a(str) == 0) {
            return true;
        }
        this.f7899a.mo34920b().mo35074q().mo35038b("Permission not granted", str);
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: S */
    public final boolean mo35133S(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        String u = this.f7899a.mo35211z().mo34890u();
        this.f7899a.mo34924d();
        return u.equals(str);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: T */
    public final boolean mo35134T(Object obj) {
        if ((obj instanceof Parcelable[]) || (obj instanceof ArrayList) || (obj instanceof Bundle)) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: U */
    public final boolean mo35135U(Context context, String str) {
        Signature[] signatureArr;
        X500Principal x500Principal = new X500Principal("CN=Android Debug,O=Android,C=US");
        try {
            PackageInfo e = C2207e.m1805a(context).mo23530e(str, 64);
            if (e == null || (signatureArr = e.signatures) == null || signatureArr.length <= 0) {
                return true;
            }
            return ((X509Certificate) CertificateFactory.getInstance("X.509").generateCertificate(new ByteArrayInputStream(signatureArr[0].toByteArray()))).getSubjectX500Principal().equals(x500Principal);
        } catch (CertificateException e2) {
            this.f7899a.mo34920b().mo35075r().mo35038b("Error obtaining certificate", e2);
            return true;
        } catch (PackageManager.NameNotFoundException e3) {
            this.f7899a.mo34920b().mo35075r().mo35038b("Package name not found", e3);
            return true;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b0 */
    public final boolean mo35136b0(String str, String str2, String str3, String str4) {
        boolean isEmpty = TextUtils.isEmpty(str);
        boolean isEmpty2 = TextUtils.isEmpty(str2);
        if (!isEmpty && !isEmpty2) {
            C9713p.m20275j(str);
            if (!str.equals(str2)) {
                return true;
            }
            return false;
        } else if (!isEmpty || !isEmpty2) {
            if (!isEmpty) {
                if (TextUtils.isEmpty(str4)) {
                    return false;
                }
                if (TextUtils.isEmpty(str3) || !str3.equals(str4)) {
                    return true;
                }
                return false;
            } else if (TextUtils.isEmpty(str3) || !str3.equals(str4)) {
                return true;
            } else {
                return false;
            }
        } else if (TextUtils.isEmpty(str3) || TextUtils.isEmpty(str4)) {
            if (!TextUtils.isEmpty(str4)) {
                return true;
            }
            return false;
        } else if (!str3.equals(str4)) {
            return true;
        } else {
            return false;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c0 */
    public final byte[] mo35137c0(Parcelable parcelable) {
        if (parcelable == null) {
            return null;
        }
        Parcel obtain = Parcel.obtain();
        try {
            parcelable.writeToParcel(obtain, 0);
            return obtain.marshall();
        } finally {
            obtain.recycle();
        }
    }

    /* access modifiers changed from: protected */
    @WorkerThread
    /* renamed from: i */
    public final void mo35060i() {
        mo34778h();
        SecureRandom secureRandom = new SecureRandom();
        long nextLong = secureRandom.nextLong();
        if (nextLong == 0) {
            nextLong = secureRandom.nextLong();
            if (nextLong == 0) {
                this.f7899a.mo34920b().mo35080w().mo35037a("Utils falling back to Random for random id");
            }
        }
        this.f8033d.set(nextLong);
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public final boolean mo35061j() {
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j0 */
    public final int mo35138j0(String str, Object obj) {
        boolean z;
        if ("_ldl".equals(str)) {
            z = mo35128N("user property referrer", str, m10929f0(str), obj);
        } else {
            z = mo35128N("user property", str, m10929f0(str), obj);
        }
        if (z) {
            return 0;
        }
        return 7;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k0 */
    public final int mo35139k0(String str) {
        if (!mo35130P(NotificationCompat.CATEGORY_EVENT, str)) {
            return 2;
        }
        if (!mo35127M(NotificationCompat.CATEGORY_EVENT, C9267n.f13607a, C9267n.f13608b, str)) {
            return 13;
        }
        this.f7899a.mo35211z();
        if (!mo35126L(NotificationCompat.CATEGORY_EVENT, 40, str)) {
            return 2;
        }
        return 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l0 */
    public final int mo35140l0(String str) {
        if (!mo35130P("event param", str)) {
            return 3;
        }
        if (!mo35127M("event param", (String[]) null, (String[]) null, str)) {
            return 14;
        }
        this.f7899a.mo35211z();
        if (!mo35126L("event param", 40, str)) {
            return 3;
        }
        return 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m0 */
    public final int mo35141m0(String str) {
        if (!mo35131Q("event param", str)) {
            return 3;
        }
        if (!mo35127M("event param", (String[]) null, (String[]) null, str)) {
            return 14;
        }
        this.f7899a.mo35211z();
        if (!mo35126L("event param", 40, str)) {
            return 3;
        }
        return 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n0 */
    public final int mo35142n0(String str) {
        if (!mo35130P("user property", str)) {
            return 6;
        }
        if (!mo35127M("user property", C9269p.f13615a, (String[]) null, str)) {
            return 15;
        }
        this.f7899a.mo35211z();
        if (!mo35126L("user property", 24, str)) {
            return 6;
        }
        return 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: o */
    public final Object mo35143o(String str, Object obj) {
        int i = 256;
        if ("_ev".equals(str)) {
            this.f7899a.mo35211z();
            return m10930g0(256, obj, true, true);
        }
        if (m10921V(str)) {
            this.f7899a.mo35211z();
        } else {
            this.f7899a.mo35211z();
            i = 100;
        }
        return m10930g0(i, obj, false, true);
    }

    @EnsuresNonNull({"this.apkVersion"})
    /* renamed from: o0 */
    public final int mo35144o0() {
        if (this.f8035f == null) {
            this.f8035f = Integer.valueOf(C4718a.m6394f().mo32361a(this.f7899a.mo34927f()) / 1000);
        }
        return this.f8035f.intValue();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p */
    public final Object mo35145p(String str, Object obj) {
        if ("_ldl".equals(str)) {
            return m10930g0(m10929f0(str), obj, true, false);
        }
        return m10930g0(m10929f0(str), obj, false, false);
    }

    /* renamed from: p0 */
    public final int mo35146p0(int i) {
        return C4718a.m6394f().mo32347h(this.f7899a.mo34927f(), C4785c.f5063a);
    }

    /* renamed from: q */
    public final String mo35147q(String str, int i, boolean z) {
        if (str == null) {
            return null;
        }
        if (str.codePointCount(0, str.length()) <= i) {
            return str;
        }
        if (z) {
            return String.valueOf(str.substring(0, str.offsetByCodePoints(0, i))).concat("...");
        }
        return null;
    }

    /* renamed from: r */
    public final URL mo35148r(long j, String str, String str2, long j2) {
        try {
            C9713p.m20271f(str2);
            C9713p.m20271f(str);
            String format = String.format("https://www.googleadservices.com/pagead/conversion/app/deeplink?id_type=adid&sdk_version=%s&rdid=%s&bundleid=%s&retry=%s", new Object[]{String.format("v%s.%s", new Object[]{46000L, Integer.valueOf(mo35144o0())}), str2, str, Long.valueOf(j2)});
            if (str.equals(this.f7899a.mo35211z().mo34891v())) {
                format = format.concat("&ddl_test=1");
            }
            return new URL(format);
        } catch (IllegalArgumentException | MalformedURLException e) {
            this.f7899a.mo34920b().mo35075r().mo35038b("Failed to create BOW URL for Deferred Deep Link. exception", e.getMessage());
            return null;
        }
    }

    /* renamed from: r0 */
    public final long mo35149r0() {
        long andIncrement;
        long j;
        if (this.f8033d.get() == 0) {
            synchronized (this.f8033d) {
                long nextLong = new Random(System.nanoTime() ^ this.f7899a.mo34922c().mo33547a()).nextLong();
                int i = this.f8034e + 1;
                this.f8034e = i;
                j = nextLong + ((long) i);
            }
            return j;
        }
        synchronized (this.f8033d) {
            this.f8033d.compareAndSet(-1, 1);
            andIncrement = this.f8033d.getAndIncrement();
        }
        return andIncrement;
    }

    /* renamed from: s0 */
    public final long mo35150s0(long j, long j2) {
        return (j + (j2 * 60000)) / 86400000;
    }

    /* access modifiers changed from: package-private */
    @WorkerThread
    @EnsuresNonNull({"this.secureRandom"})
    /* renamed from: t */
    public final SecureRandom mo35151t() {
        mo34778h();
        if (this.f8032c == null) {
            this.f8032c = new SecureRandom();
        }
        return this.f8032c;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: t0 */
    public final Bundle mo35152t0(Uri uri) {
        String str;
        String str2;
        String str3;
        String str4;
        if (uri != null) {
            try {
                if (uri.isHierarchical()) {
                    str4 = uri.getQueryParameter("utm_campaign");
                    str3 = uri.getQueryParameter("utm_source");
                    str2 = uri.getQueryParameter("utm_medium");
                    str = uri.getQueryParameter("gclid");
                } else {
                    str4 = null;
                    str3 = null;
                    str2 = null;
                    str = null;
                }
                if (TextUtils.isEmpty(str4) && TextUtils.isEmpty(str3) && TextUtils.isEmpty(str2) && TextUtils.isEmpty(str)) {
                    return null;
                }
                Bundle bundle = new Bundle();
                if (!TextUtils.isEmpty(str4)) {
                    bundle.putString(APIResourceDescriptors.RESOURCE_TYPE_CAMPAIGN, str4);
                }
                if (!TextUtils.isEmpty(str3)) {
                    bundle.putString(APIParams.SOURCE, str3);
                }
                if (!TextUtils.isEmpty(str2)) {
                    bundle.putString(Constants.MEDIUM, str2);
                }
                if (!TextUtils.isEmpty(str)) {
                    bundle.putString("gclid", str);
                }
                String queryParameter = uri.getQueryParameter("utm_term");
                if (!TextUtils.isEmpty(queryParameter)) {
                    bundle.putString("term", queryParameter);
                }
                String queryParameter2 = uri.getQueryParameter("utm_content");
                if (!TextUtils.isEmpty(queryParameter2)) {
                    bundle.putString("content", queryParameter2);
                }
                String queryParameter3 = uri.getQueryParameter("aclid");
                if (!TextUtils.isEmpty(queryParameter3)) {
                    bundle.putString("aclid", queryParameter3);
                }
                String queryParameter4 = uri.getQueryParameter("cp1");
                if (!TextUtils.isEmpty(queryParameter4)) {
                    bundle.putString("cp1", queryParameter4);
                }
                String queryParameter5 = uri.getQueryParameter("anid");
                if (!TextUtils.isEmpty(queryParameter5)) {
                    bundle.putString("anid", queryParameter5);
                }
                return bundle;
            } catch (UnsupportedOperationException e) {
                this.f7899a.mo34920b().mo35080w().mo35038b("Install referrer url isn't a hierarchical URI", e);
            }
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: u0 */
    public final Bundle mo35153u0(Bundle bundle) {
        Bundle bundle2 = new Bundle();
        if (bundle != null) {
            for (String next : bundle.keySet()) {
                Object o = mo35143o(next, bundle.get(next));
                if (o == null) {
                    this.f7899a.mo34920b().mo35081x().mo35038b("Param value can't be null", this.f7899a.mo35182D().mo34900e(next));
                } else {
                    mo35116B(bundle2, next, o);
                }
            }
        }
        return bundle2;
    }

    /* access modifiers changed from: package-private */
    @WorkerThread
    /* renamed from: v */
    public final void mo35154v(Bundle bundle, long j) {
        long j2 = bundle.getLong("_et");
        if (j2 != 0) {
            this.f7899a.mo34920b().mo35080w().mo35038b("Params already contained engagement", Long.valueOf(j2));
        } else {
            j2 = 0;
        }
        bundle.putLong("_et", j + j2);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v5, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v0, resolved type: java.lang.String} */
    /* access modifiers changed from: package-private */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00c4  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x010a A[SYNTHETIC] */
    /* renamed from: v0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.os.Bundle mo35155v0(java.lang.String r21, java.lang.String r22, android.os.Bundle r23, java.util.List<java.lang.String> r24, boolean r25) {
        /*
            r20 = this;
            r9 = r20
            r10 = r22
            r11 = r23
            r12 = r24
            java.lang.String[] r0 = p201q5.C9267n.f13610d
            boolean r13 = m10931h0(r10, r0)
            if (r11 == 0) goto L_0x010f
            android.os.Bundle r15 = new android.os.Bundle
            r15.<init>(r11)
            com.google.android.gms.measurement.internal.p4 r0 = r9.f7899a
            com.google.android.gms.measurement.internal.g r0 = r0.mo35211z()
            int r8 = r0.mo34882m()
            java.util.TreeSet r0 = new java.util.TreeSet
            java.util.Set r1 = r23.keySet()
            r0.<init>(r1)
            java.util.Iterator r16 = r0.iterator()
            r17 = 0
            r18 = r17
        L_0x0030:
            boolean r0 = r16.hasNext()
            if (r0 == 0) goto L_0x010d
            java.lang.Object r0 = r16.next()
            r7 = r0
            java.lang.String r7 = (java.lang.String) r7
            if (r12 == 0) goto L_0x0049
            boolean r0 = r12.contains(r7)
            if (r0 != 0) goto L_0x0046
            goto L_0x0049
        L_0x0046:
            r2 = r17
            goto L_0x0059
        L_0x0049:
            if (r25 != 0) goto L_0x0050
            int r0 = r9.mo35141m0(r7)
            goto L_0x0052
        L_0x0050:
            r0 = r17
        L_0x0052:
            if (r0 != 0) goto L_0x0058
            int r0 = r9.mo35140l0(r7)
        L_0x0058:
            r2 = r0
        L_0x0059:
            if (r2 == 0) goto L_0x006f
            r0 = 3
            if (r2 != r0) goto L_0x0060
            r5 = r7
            goto L_0x0061
        L_0x0060:
            r5 = 0
        L_0x0061:
            r0 = r20
            r1 = r15
            r3 = r7
            r4 = r7
            r0.mo35156w(r1, r2, r3, r4, r5)
            r15.remove(r7)
            r14 = r8
            goto L_0x010a
        L_0x006f:
            java.lang.Object r4 = r11.get(r7)
            r0 = r20
            r1 = r21
            r2 = r22
            r3 = r7
            r5 = r15
            r6 = r24
            r19 = r7
            r7 = r25
            r14 = r8
            r8 = r13
            int r2 = r0.mo35129O(r1, r2, r3, r4, r5, r6, r7, r8)
            r0 = 17
            if (r2 != r0) goto L_0x009a
            r2 = 17
            java.lang.Boolean r5 = java.lang.Boolean.FALSE
            r0 = r20
            r1 = r15
            r3 = r19
            r4 = r19
            r0.mo35156w(r1, r2, r3, r4, r5)
            goto L_0x00bc
        L_0x009a:
            if (r2 == 0) goto L_0x00bc
            java.lang.String r0 = "_ev"
            r6 = r19
            boolean r0 = r0.equals(r6)
            if (r0 != 0) goto L_0x00be
            r0 = 21
            if (r2 != r0) goto L_0x00ac
            r3 = r10
            goto L_0x00ad
        L_0x00ac:
            r3 = r6
        L_0x00ad:
            java.lang.Object r5 = r11.get(r6)
            r0 = r20
            r1 = r15
            r4 = r6
            r0.mo35156w(r1, r2, r3, r4, r5)
            r15.remove(r6)
            goto L_0x010a
        L_0x00bc:
            r6 = r19
        L_0x00be:
            boolean r0 = m10922W(r6)
            if (r0 == 0) goto L_0x010a
            int r0 = r18 + 1
            if (r0 <= r14) goto L_0x0108
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r2 = 48
            r1.<init>(r2)
            java.lang.String r2 = "Event can't contain more than "
            r1.append(r2)
            r1.append(r14)
            java.lang.String r2 = " params"
            r1.append(r2)
            com.google.android.gms.measurement.internal.p4 r2 = r9.f7899a
            com.google.android.gms.measurement.internal.l3 r2 = r2.mo34920b()
            com.google.android.gms.measurement.internal.j3 r2 = r2.mo35076s()
            java.lang.String r1 = r1.toString()
            com.google.android.gms.measurement.internal.p4 r3 = r9.f7899a
            com.google.android.gms.measurement.internal.g3 r3 = r3.mo35182D()
            java.lang.String r3 = r3.mo34899d(r10)
            com.google.android.gms.measurement.internal.p4 r4 = r9.f7899a
            com.google.android.gms.measurement.internal.g3 r4 = r4.mo35182D()
            java.lang.String r4 = r4.mo34897b(r11)
            r2.mo35039c(r1, r3, r4)
            r1 = 5
            m10927d0(r15, r1)
            r15.remove(r6)
        L_0x0108:
            r18 = r0
        L_0x010a:
            r8 = r14
            goto L_0x0030
        L_0x010d:
            r14 = r15
            goto L_0x0110
        L_0x010f:
            r14 = 0
        L_0x0110:
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C6234n9.mo35155v0(java.lang.String, java.lang.String, android.os.Bundle, java.util.List, boolean):android.os.Bundle");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: w */
    public final void mo35156w(Bundle bundle, int i, String str, String str2, Object obj) {
        if (m10927d0(bundle, i)) {
            this.f7899a.mo35211z();
            bundle.putString("_ev", mo35147q(str, 40, true));
            if (obj != null) {
                C9713p.m20275j(bundle);
                if ((obj instanceof String) || (obj instanceof CharSequence)) {
                    bundle.putLong("_el", (long) obj.toString().length());
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: w0 */
    public final C6290t mo35157w0(String str, String str2, Bundle bundle, String str3, long j, boolean z, boolean z2) {
        Bundle bundle2;
        if (TextUtils.isEmpty(str2)) {
            return null;
        }
        if (mo35139k0(str2) == 0) {
            if (bundle != null) {
                bundle2 = new Bundle(bundle);
            } else {
                bundle2 = new Bundle();
            }
            Bundle bundle3 = bundle2;
            bundle3.putString("_o", str3);
            Bundle v0 = mo35155v0(str, str2, bundle3, C10672f.m22673b("_o"), true);
            if (z) {
                v0 = mo35153u0(v0);
            }
            C9713p.m20275j(v0);
            return new C6290t(str2, new C6268r(v0), str3, j);
        }
        this.f7899a.mo34920b().mo35075r().mo35038b("Invalid conditional property event name", this.f7899a.mo35182D().mo34901f(str2));
        throw new IllegalArgumentException();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: y */
    public final void mo35158y(Bundle bundle, Bundle bundle2) {
        if (bundle2 != null) {
            for (String next : bundle2.keySet()) {
                if (!bundle.containsKey(next)) {
                    this.f7899a.mo35191N().mo35116B(bundle, next, bundle2.get(next));
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: z */
    public final void mo35159z(C6217m3 m3Var, int i) {
        int i2 = 0;
        for (String str : new TreeSet(m3Var.f7975d.keySet())) {
            if (m10922W(str) && (i2 = i2 + 1) > i) {
                StringBuilder sb = new StringBuilder(48);
                sb.append("Event can't contain more than ");
                sb.append(i);
                sb.append(" params");
                this.f7899a.mo34920b().mo35076s().mo35039c(sb.toString(), this.f7899a.mo35182D().mo34899d(m3Var.f7972a), this.f7899a.mo35182D().mo34897b(m3Var.f7975d));
                m10927d0(m3Var.f7975d, 5);
                m3Var.f7975d.remove(str);
            }
        }
    }
}
