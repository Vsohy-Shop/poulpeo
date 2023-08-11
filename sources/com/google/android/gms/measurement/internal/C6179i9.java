package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.annotation.WorkerThread;
import androidx.autofill.HintConstants;
import com.google.android.gms.internal.measurement.C5653a5;
import com.google.android.gms.internal.measurement.C5664b;
import com.google.android.gms.internal.measurement.C5687c5;
import com.google.android.gms.internal.measurement.C5704d5;
import com.google.android.gms.internal.measurement.C5713de;
import com.google.android.gms.internal.measurement.C5719e3;
import com.google.android.gms.internal.measurement.C5721e5;
import com.google.android.gms.internal.measurement.C5753g3;
import com.google.android.gms.internal.measurement.C5754g4;
import com.google.android.gms.internal.measurement.C5788i4;
import com.google.android.gms.internal.measurement.C5792i8;
import com.google.android.gms.internal.measurement.C5805j4;
import com.google.android.gms.internal.measurement.C5822k4;
import com.google.android.gms.internal.measurement.C5838l3;
import com.google.android.gms.internal.measurement.C5870n3;
import com.google.android.gms.internal.measurement.C5871n4;
import com.google.android.gms.internal.measurement.C5887o4;
import com.google.android.gms.internal.measurement.C5950s3;
import com.google.android.gms.internal.measurement.C5951s4;
import com.google.android.gms.internal.measurement.C5967t4;
import com.google.android.gms.internal.measurement.C5983u4;
import com.google.android.gms.internal.measurement.C6036x9;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.zip.GZIPOutputStream;
import p201q5.C9267n;
import p231t4.C9713p;

/* renamed from: com.google.android.gms.measurement.internal.i9 */
/* compiled from: com.google.android.gms:play-services-measurement@@20.0.0 */
public final class C6179i9 extends C6343x8 {
    C6179i9(C6157g9 g9Var) {
        super(g9Var);
    }

    /* renamed from: D */
    static <Builder extends C6036x9> Builder m10729D(Builder builder, byte[] bArr) {
        C5792i8 b = C5792i8.m9401b();
        if (b != null) {
            return builder.mo33997V(bArr, b);
        }
        return builder.mo33996R(bArr);
    }

    /* renamed from: H */
    static List<C5887o4> m10730H(Bundle[] bundleArr) {
        ArrayList arrayList = new ArrayList();
        for (Bundle bundle : bundleArr) {
            if (bundle != null) {
                C5871n4 B = C5887o4.m9708B();
                for (String next : bundle.keySet()) {
                    C5871n4 B2 = C5887o4.m9708B();
                    B2.mo34206B(next);
                    Object obj = bundle.get(next);
                    if (obj instanceof Long) {
                        B2.mo34216z(((Long) obj).longValue());
                    } else if (obj instanceof String) {
                        B2.mo34207C((String) obj);
                    } else if (obj instanceof Double) {
                        B2.mo34215y(((Double) obj).doubleValue());
                    }
                    B.mo34210t(B2);
                }
                if (B.mo34208r() > 0) {
                    arrayList.add((C5887o4) B.mo34354l());
                }
            }
        }
        return arrayList;
    }

    /* renamed from: J */
    static List<Long> m10731J(BitSet bitSet) {
        int length = (bitSet.length() + 63) / 64;
        ArrayList arrayList = new ArrayList(length);
        for (int i = 0; i < length; i++) {
            long j = 0;
            for (int i2 = 0; i2 < 64; i2++) {
                int i3 = (i * 64) + i2;
                if (i3 >= bitSet.length()) {
                    break;
                }
                if (bitSet.get(i3)) {
                    j |= 1 << i2;
                }
            }
            arrayList.add(Long.valueOf(j));
        }
        return arrayList;
    }

    /* renamed from: N */
    static boolean m10732N(List<Long> list, int i) {
        if (i >= list.size() * 64) {
            return false;
        }
        if (((1 << (i % 64)) & list.get(i / 64).longValue()) != 0) {
            return true;
        }
        return false;
    }

    /* renamed from: P */
    static boolean m10733P(String str) {
        if (str == null || !str.matches("([+-])?([0-9]+\\.?[0-9]*|[0-9]*\\.?[0-9]+)") || str.length() > 310) {
            return false;
        }
        return true;
    }

    /* renamed from: m */
    static final void m10734m(C5805j4 j4Var, String str, Object obj) {
        List<C5887o4> I = j4Var.mo34110I();
        int i = 0;
        while (true) {
            if (i >= I.size()) {
                i = -1;
                break;
            } else if (str.equals(I.get(i).mo34240D())) {
                break;
            } else {
                i++;
            }
        }
        C5871n4 B = C5887o4.m9708B();
        B.mo34206B(str);
        if (obj instanceof Long) {
            B.mo34216z(((Long) obj).longValue());
        } else if (obj instanceof String) {
            B.mo34207C((String) obj);
        } else if (obj instanceof Double) {
            B.mo34215y(((Double) obj).doubleValue());
        } else if (obj instanceof Bundle[]) {
            B.mo34209s(m10730H((Bundle[]) obj));
        }
        if (i >= 0) {
            j4Var.mo34104B(i, B);
        } else {
            j4Var.mo34116v(B);
        }
    }

    @WorkerThread
    /* renamed from: n */
    static final boolean m10735n(C6290t tVar, C6289s9 s9Var) {
        C9713p.m20275j(tVar);
        C9713p.m20275j(s9Var);
        if (!TextUtils.isEmpty(s9Var.f8208c) || !TextUtils.isEmpty(s9Var.f8223r)) {
            return true;
        }
        return false;
    }

    /* renamed from: o */
    static final C5887o4 m10736o(C5822k4 k4Var, String str) {
        for (C5887o4 next : k4Var.mo34135F()) {
            if (next.mo34240D().equals(str)) {
                return next;
            }
        }
        return null;
    }

    /* renamed from: p */
    static final Object m10737p(C5822k4 k4Var, String str) {
        C5887o4 o = m10736o(k4Var, str);
        if (o == null) {
            return null;
        }
        if (o.mo34247X()) {
            return o.mo34241E();
        }
        if (o.mo34245U()) {
            return Long.valueOf(o.mo34251z());
        }
        if (o.mo34243S()) {
            return Double.valueOf(o.mo34248w());
        }
        if (o.mo34250y() <= 0) {
            return null;
        }
        List<C5887o4> F = o.mo34242F();
        ArrayList arrayList = new ArrayList();
        for (C5887o4 next : F) {
            if (next != null) {
                Bundle bundle = new Bundle();
                for (C5887o4 next2 : next.mo34242F()) {
                    if (next2.mo34247X()) {
                        bundle.putString(next2.mo34240D(), next2.mo34241E());
                    } else if (next2.mo34245U()) {
                        bundle.putLong(next2.mo34240D(), next2.mo34251z());
                    } else if (next2.mo34243S()) {
                        bundle.putDouble(next2.mo34240D(), next2.mo34248w());
                    }
                }
                if (!bundle.isEmpty()) {
                    arrayList.add(bundle);
                }
            }
        }
        return (Bundle[]) arrayList.toArray(new Bundle[arrayList.size()]);
    }

    /* renamed from: q */
    private final void m10738q(StringBuilder sb, int i, List<C5887o4> list) {
        String str;
        String str2;
        Long l;
        if (list != null) {
            int i2 = i + 1;
            for (C5887o4 next : list) {
                if (next != null) {
                    m10740s(sb, i2);
                    sb.append("param {\n");
                    Double d = null;
                    if (next.mo34246W()) {
                        str = this.f7899a.mo35182D().mo34900e(next.mo34240D());
                    } else {
                        str = null;
                    }
                    m10743v(sb, i2, HintConstants.AUTOFILL_HINT_NAME, str);
                    if (next.mo34247X()) {
                        str2 = next.mo34241E();
                    } else {
                        str2 = null;
                    }
                    m10743v(sb, i2, "string_value", str2);
                    if (next.mo34245U()) {
                        l = Long.valueOf(next.mo34251z());
                    } else {
                        l = null;
                    }
                    m10743v(sb, i2, "int_value", l);
                    if (next.mo34243S()) {
                        d = Double.valueOf(next.mo34248w());
                    }
                    m10743v(sb, i2, "double_value", d);
                    if (next.mo34250y() > 0) {
                        m10738q(sb, i2, next.mo34242F());
                    }
                    m10740s(sb, i2);
                    sb.append("}\n");
                }
            }
        }
    }

    /* renamed from: r */
    private final void m10739r(StringBuilder sb, int i, C5753g3 g3Var) {
        String str;
        if (g3Var != null) {
            m10740s(sb, i);
            sb.append("filter {\n");
            if (g3Var.mo34027E()) {
                m10743v(sb, i, "complement", Boolean.valueOf(g3Var.mo34026D()));
            }
            if (g3Var.mo34029H()) {
                m10743v(sb, i, "param_name", this.f7899a.mo35182D().mo34900e(g3Var.mo34025B()));
            }
            if (g3Var.mo34030I()) {
                int i2 = i + 1;
                C5950s3 z = g3Var.mo34032z();
                if (z != null) {
                    m10740s(sb, i2);
                    sb.append("string_filter {\n");
                    if (z.mo34343F()) {
                        switch (z.mo34344H()) {
                            case 1:
                                str = "UNKNOWN_MATCH_TYPE";
                                break;
                            case 2:
                                str = "REGEXP";
                                break;
                            case 3:
                                str = "BEGINS_WITH";
                                break;
                            case 4:
                                str = "ENDS_WITH";
                                break;
                            case 5:
                                str = "PARTIAL";
                                break;
                            case 6:
                                str = "EXACT";
                                break;
                            default:
                                str = "IN_LIST";
                                break;
                        }
                        m10743v(sb, i2, "match_type", str);
                    }
                    if (z.mo34342E()) {
                        m10743v(sb, i2, "expression", z.mo34346z());
                    }
                    if (z.mo34341D()) {
                        m10743v(sb, i2, "case_sensitive", Boolean.valueOf(z.mo34340C()));
                    }
                    if (z.mo34345w() > 0) {
                        m10740s(sb, i2 + 1);
                        sb.append("expression_list {\n");
                        for (String append : z.mo34339B()) {
                            m10740s(sb, i2 + 2);
                            sb.append(append);
                            sb.append("\n");
                        }
                        sb.append("}\n");
                    }
                    m10740s(sb, i2);
                    sb.append("}\n");
                }
            }
            if (g3Var.mo34028F()) {
                m10744w(sb, i + 1, "number_filter", g3Var.mo34031y());
            }
            m10740s(sb, i);
            sb.append("}\n");
        }
    }

    /* renamed from: s */
    private static final void m10740s(StringBuilder sb, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            sb.append("  ");
        }
    }

    /* renamed from: t */
    private static final String m10741t(boolean z, boolean z2, boolean z3) {
        StringBuilder sb = new StringBuilder();
        if (z) {
            sb.append("Dynamic ");
        }
        if (z2) {
            sb.append("Sequence ");
        }
        if (z3) {
            sb.append("Session-Scoped ");
        }
        return sb.toString();
    }

    /* renamed from: u */
    private static final void m10742u(StringBuilder sb, int i, String str, C5653a5 a5Var) {
        Integer num;
        Integer num2;
        Long l;
        if (a5Var != null) {
            m10740s(sb, 3);
            sb.append(str);
            sb.append(" {\n");
            if (a5Var.mo33656x() != 0) {
                m10740s(sb, 4);
                sb.append("results: ");
                int i2 = 0;
                for (Long next : a5Var.mo33652I()) {
                    int i3 = i2 + 1;
                    if (i2 != 0) {
                        sb.append(", ");
                    }
                    sb.append(next);
                    i2 = i3;
                }
                sb.append(10);
            }
            if (a5Var.mo33658z() != 0) {
                m10740s(sb, 4);
                sb.append("status: ");
                int i4 = 0;
                for (Long next2 : a5Var.mo33654K()) {
                    int i5 = i4 + 1;
                    if (i4 != 0) {
                        sb.append(", ");
                    }
                    sb.append(next2);
                    i4 = i5;
                }
                sb.append(10);
            }
            if (a5Var.mo33655w() != 0) {
                m10740s(sb, 4);
                sb.append("dynamic_filter_timestamps: {");
                int i6 = 0;
                for (C5788i4 next3 : a5Var.mo33651H()) {
                    int i7 = i6 + 1;
                    if (i6 != 0) {
                        sb.append(", ");
                    }
                    if (next3.mo34088E()) {
                        num2 = Integer.valueOf(next3.mo34089w());
                    } else {
                        num2 = null;
                    }
                    sb.append(num2);
                    sb.append(":");
                    if (next3.mo34087D()) {
                        l = Long.valueOf(next3.mo34090x());
                    } else {
                        l = null;
                    }
                    sb.append(l);
                    i6 = i7;
                }
                sb.append("}\n");
            }
            if (a5Var.mo33657y() != 0) {
                m10740s(sb, 4);
                sb.append("sequence_filter_timestamps: {");
                int i8 = 0;
                for (C5687c5 next4 : a5Var.mo33653J()) {
                    int i9 = i8 + 1;
                    if (i8 != 0) {
                        sb.append(", ");
                    }
                    if (next4.mo33748F()) {
                        num = Integer.valueOf(next4.mo33750x());
                    } else {
                        num = null;
                    }
                    sb.append(num);
                    sb.append(": [");
                    int i10 = 0;
                    for (Long longValue : next4.mo33747C()) {
                        long longValue2 = longValue.longValue();
                        int i11 = i10 + 1;
                        if (i10 != 0) {
                            sb.append(", ");
                        }
                        sb.append(longValue2);
                        i10 = i11;
                    }
                    sb.append("]");
                    i8 = i9;
                }
                sb.append("}\n");
            }
            m10740s(sb, 3);
            sb.append("}\n");
        }
    }

    /* renamed from: v */
    private static final void m10743v(StringBuilder sb, int i, String str, Object obj) {
        if (obj != null) {
            m10740s(sb, i + 1);
            sb.append(str);
            sb.append(": ");
            sb.append(obj);
            sb.append(10);
        }
    }

    /* renamed from: w */
    private static final void m10744w(StringBuilder sb, int i, String str, C5838l3 l3Var) {
        String str2;
        if (l3Var != null) {
            m10740s(sb, i);
            sb.append(str);
            sb.append(" {\n");
            if (l3Var.mo34152D()) {
                int J = l3Var.mo34157J();
                if (J == 1) {
                    str2 = "UNKNOWN_COMPARISON_TYPE";
                } else if (J == 2) {
                    str2 = "LESS_THAN";
                } else if (J == 3) {
                    str2 = "GREATER_THAN";
                } else if (J != 4) {
                    str2 = "BETWEEN";
                } else {
                    str2 = "EQUAL";
                }
                m10743v(sb, i, "comparison_type", str2);
            }
            if (l3Var.mo34154F()) {
                m10743v(sb, i, "match_as_float", Boolean.valueOf(l3Var.mo34151C()));
            }
            if (l3Var.mo34153E()) {
                m10743v(sb, i, "comparison_value", l3Var.mo34158y());
            }
            if (l3Var.mo34156I()) {
                m10743v(sb, i, "min_comparison_value", l3Var.mo34150B());
            }
            if (l3Var.mo34155H()) {
                m10743v(sb, i, "max_comparison_value", l3Var.mo34159z());
            }
            m10740s(sb, i);
            sb.append("}\n");
        }
    }

    /* renamed from: x */
    static int m10745x(C5967t4 t4Var, String str) {
        for (int i = 0; i < t4Var.mo34419o0(); i++) {
            if (str.equals(t4Var.mo34413i0(i).mo33891C())) {
                return i;
            }
        }
        return -1;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:10:?, code lost:
        r4.f7899a.mo34920b().mo35075r().mo35037a("Failed to load parcelable from buffer");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x002e, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002f, code lost:
        r1.recycle();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0032, code lost:
        throw r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001a, code lost:
        r5 = move-exception;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x001c */
    /* renamed from: A */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final <T extends android.os.Parcelable> T mo34985A(byte[] r5, android.os.Parcelable.Creator<T> r6) {
        /*
            r4 = this;
            r0 = 0
            if (r5 != 0) goto L_0x0004
            return r0
        L_0x0004:
            android.os.Parcel r1 = android.os.Parcel.obtain()
            int r2 = r5.length     // Catch:{ ParseException -> 0x001c }
            r3 = 0
            r1.unmarshall(r5, r3, r2)     // Catch:{ ParseException -> 0x001c }
            r1.setDataPosition(r3)     // Catch:{ ParseException -> 0x001c }
            java.lang.Object r5 = r6.createFromParcel(r1)     // Catch:{ ParseException -> 0x001c }
            android.os.Parcelable r5 = (android.os.Parcelable) r5     // Catch:{ ParseException -> 0x001c }
            r1.recycle()
            return r5
        L_0x001a:
            r5 = move-exception
            goto L_0x002f
        L_0x001c:
            com.google.android.gms.measurement.internal.p4 r5 = r4.f7899a     // Catch:{ all -> 0x001a }
            com.google.android.gms.measurement.internal.l3 r5 = r5.mo34920b()     // Catch:{ all -> 0x001a }
            com.google.android.gms.measurement.internal.j3 r5 = r5.mo35075r()     // Catch:{ all -> 0x001a }
            java.lang.String r6 = "Failed to load parcelable from buffer"
            r5.mo35037a(r6)     // Catch:{ all -> 0x001a }
            r1.recycle()
            return r0
        L_0x002f:
            r1.recycle()
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C6179i9.mo34985A(byte[], android.os.Parcelable$Creator):android.os.Parcelable");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: B */
    public final C6290t mo34986B(C5664b bVar) {
        String str;
        Object obj;
        Bundle z = mo34998z(bVar.mo33682e(), true);
        if (!z.containsKey("_o") || (obj = z.get("_o")) == null) {
            str = "app";
        } else {
            str = obj.toString();
        }
        String str2 = str;
        String b = C9267n.m19030b(bVar.mo33681d());
        if (b == null) {
            b = bVar.mo33681d();
        }
        return new C6290t(b, new C6268r(z), str2, bVar.mo33677a());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: C */
    public final C5822k4 mo34987C(C6235o oVar) {
        C5805j4 B = C5822k4.m9480B();
        B.mo34106D(oVar.f8040e);
        C6257q qVar = new C6257q(oVar.f8041f);
        while (qVar.hasNext()) {
            String a = qVar.next();
            C5871n4 B2 = C5887o4.m9708B();
            B2.mo34206B(a);
            Object J = oVar.f8041f.mo35273J(a);
            C9713p.m20275j(J);
            mo34993L(B2, J);
            B.mo34116v(B2);
        }
        return (C5822k4) B.mo34354l();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: E */
    public final String mo34988E(C5951s4 s4Var) {
        Long l;
        Long l2;
        Double d;
        if (s4Var == null) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        sb.append("\nbatch {\n");
        for (C5983u4 next : s4Var.mo34348z()) {
            if (next != null) {
                m10740s(sb, 1);
                sb.append("bundle {\n");
                if (next.mo34506l1()) {
                    m10743v(sb, 1, "protocol_version", Integer.valueOf(next.mo34514t1()));
                }
                m10743v(sb, 1, "platform", next.mo34486I());
                if (next.mo34502h1()) {
                    m10743v(sb, 1, "gmp_version", Long.valueOf(next.mo34476C1()));
                }
                if (next.mo34512r1()) {
                    m10743v(sb, 1, "uploading_gmp_version", Long.valueOf(next.mo34485H1()));
                }
                if (next.mo34500f1()) {
                    m10743v(sb, 1, "dynamite_version", Long.valueOf(next.mo34472A1()));
                }
                if (next.mo34529z0()) {
                    m10743v(sb, 1, "config_version", Long.valueOf(next.mo34527y1()));
                }
                m10743v(sb, 1, "gmp_app_id", next.mo34479E());
                m10743v(sb, 1, "admob_app_id", next.mo34493M1());
                m10743v(sb, 1, "app_id", next.mo34495N1());
                m10743v(sb, 1, "app_version", next.mo34522x());
                if (next.mo34523x0()) {
                    m10743v(sb, 1, "app_version_major", Integer.valueOf(next.mo34497a0()));
                }
                m10743v(sb, 1, "firebase_instance_id", next.mo34475C());
                if (next.mo34499e1()) {
                    m10743v(sb, 1, "dev_cert_hash", Long.valueOf(next.mo34530z1()));
                }
                m10743v(sb, 1, "app_store", next.mo34519w());
                if (next.mo34511q1()) {
                    m10743v(sb, 1, "upload_timestamp_millis", Long.valueOf(next.mo34483G1()));
                }
                if (next.mo34509o1()) {
                    m10743v(sb, 1, "start_timestamp_millis", Long.valueOf(next.mo34482F1()));
                }
                if (next.mo34501g1()) {
                    m10743v(sb, 1, "end_timestamp_millis", Long.valueOf(next.mo34474B1()));
                }
                if (next.mo34505k1()) {
                    m10743v(sb, 1, "previous_bundle_start_timestamp_millis", Long.valueOf(next.mo34480E1()));
                }
                if (next.mo34504j1()) {
                    m10743v(sb, 1, "previous_bundle_end_timestamp_millis", Long.valueOf(next.mo34478D1()));
                }
                m10743v(sb, 1, "app_instance_id", next.mo34496O1());
                m10743v(sb, 1, "resettable_device_id", next.mo34488J());
                m10743v(sb, 1, "ds_id", next.mo34473B());
                if (next.mo34503i1()) {
                    m10743v(sb, 1, "limited_ad_tracking", Boolean.valueOf(next.mo34515u0()));
                }
                m10743v(sb, 1, "os_version", next.mo34484H());
                m10743v(sb, 1, "device_model", next.mo34528z());
                m10743v(sb, 1, "user_default_language", next.mo34489K());
                if (next.mo34510p1()) {
                    m10743v(sb, 1, "time_zone_offset_minutes", Integer.valueOf(next.mo34518v1()));
                }
                if (next.mo34526y0()) {
                    m10743v(sb, 1, "bundle_sequential_index", Integer.valueOf(next.mo34498b1()));
                }
                if (next.mo34508n1()) {
                    m10743v(sb, 1, "service_upload", Boolean.valueOf(next.mo34517v0()));
                }
                m10743v(sb, 1, "health_monitor", next.mo34481F());
                if (!this.f7899a.mo35211z().mo34873B((String) null, C6084a3.f7597o0) && next.mo34520w0() && next.mo34524x1() != 0) {
                    m10743v(sb, 1, "android_id", Long.valueOf(next.mo34524x1()));
                }
                if (next.mo34507m1()) {
                    m10743v(sb, 1, "retry_counter", Integer.valueOf(next.mo34516u1()));
                }
                if (next.mo34471A0()) {
                    m10743v(sb, 1, "consent_signals", next.mo34525y());
                }
                List<C5721e5> N = next.mo34494N();
                if (N != null) {
                    for (C5721e5 next2 : N) {
                        if (next2 != null) {
                            m10740s(sb, 2);
                            sb.append("user_property {\n");
                            if (next2.mo33895P()) {
                                l = Long.valueOf(next2.mo33899y());
                            } else {
                                l = null;
                            }
                            m10743v(sb, 2, "set_timestamp_millis", l);
                            m10743v(sb, 2, HintConstants.AUTOFILL_HINT_NAME, this.f7899a.mo35182D().mo34901f(next2.mo33891C()));
                            m10743v(sb, 2, "string_value", next2.mo33892D());
                            if (next2.mo33894O()) {
                                l2 = Long.valueOf(next2.mo33898x());
                            } else {
                                l2 = null;
                            }
                            m10743v(sb, 2, "int_value", l2);
                            if (next2.mo33893N()) {
                                d = Double.valueOf(next2.mo33897w());
                            } else {
                                d = null;
                            }
                            m10743v(sb, 2, "double_value", d);
                            m10740s(sb, 2);
                            sb.append("}\n");
                        }
                    }
                }
                List<C5754g4> L = next.mo34490L();
                if (L != null) {
                    for (C5754g4 next3 : L) {
                        if (next3 != null) {
                            m10740s(sb, 2);
                            sb.append("audience_membership {\n");
                            if (next3.mo34035I()) {
                                m10743v(sb, 2, "audience_id", Integer.valueOf(next3.mo34038w()));
                            }
                            if (next3.mo34036J()) {
                                m10743v(sb, 2, "new_audience", Boolean.valueOf(next3.mo34034H()));
                            }
                            m10742u(sb, 2, "current_data", next3.mo34039z());
                            if (next3.mo34037K()) {
                                m10742u(sb, 2, "previous_data", next3.mo34033B());
                            }
                            m10740s(sb, 2);
                            sb.append("}\n");
                        }
                    }
                }
                List<C5822k4> M = next.mo34492M();
                if (M != null) {
                    for (C5822k4 next4 : M) {
                        if (next4 != null) {
                            m10740s(sb, 2);
                            sb.append("event {\n");
                            m10743v(sb, 2, HintConstants.AUTOFILL_HINT_NAME, this.f7899a.mo35182D().mo34899d(next4.mo34134E()));
                            if (next4.mo34138S()) {
                                m10743v(sb, 2, "timestamp_millis", Long.valueOf(next4.mo34142z()));
                            }
                            if (next4.mo34137Q()) {
                                m10743v(sb, 2, "previous_timestamp_millis", Long.valueOf(next4.mo34141y()));
                            }
                            if (next4.mo34136P()) {
                                m10743v(sb, 2, "count", Integer.valueOf(next4.mo34139w()));
                            }
                            if (next4.mo34140x() != 0) {
                                m10738q(sb, 2, next4.mo34135F());
                            }
                            m10740s(sb, 2);
                            sb.append("}\n");
                        }
                    }
                }
                m10740s(sb, 1);
                sb.append("}\n");
            }
        }
        sb.append("}\n");
        return sb.toString();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: F */
    public final String mo34989F(C5719e3 e3Var) {
        if (e3Var == null) {
            return "null";
        }
        StringBuilder sb = new StringBuilder();
        sb.append("\nevent_filter {\n");
        if (e3Var.mo33887M()) {
            m10743v(sb, 0, "filter_id", Integer.valueOf(e3Var.mo33890x()));
        }
        m10743v(sb, 0, "event_name", this.f7899a.mo35182D().mo34899d(e3Var.mo33881D()));
        String t = m10741t(e3Var.mo33883I(), e3Var.mo33884J(), e3Var.mo33885K());
        if (!t.isEmpty()) {
            m10743v(sb, 0, "filter_type", t);
        }
        if (e3Var.mo33886L()) {
            m10744w(sb, 1, "event_count_filter", e3Var.mo33880C());
        }
        if (e3Var.mo33889w() > 0) {
            sb.append("  filters {\n");
            for (C5753g3 r : e3Var.mo33882E()) {
                m10739r(sb, 2, r);
            }
        }
        m10740s(sb, 1);
        sb.append("}\n}\n");
        return sb.toString();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: G */
    public final String mo34990G(C5870n3 n3Var) {
        if (n3Var == null) {
            return "null";
        }
        StringBuilder sb = new StringBuilder();
        sb.append("\nproperty_filter {\n");
        if (n3Var.mo34202H()) {
            m10743v(sb, 0, "filter_id", Integer.valueOf(n3Var.mo34204w()));
        }
        m10743v(sb, 0, "property_name", this.f7899a.mo35182D().mo34901f(n3Var.mo34198B()));
        String t = m10741t(n3Var.mo34199D(), n3Var.mo34200E(), n3Var.mo34201F());
        if (!t.isEmpty()) {
            m10743v(sb, 0, "filter_type", t);
        }
        m10739r(sb, 1, n3Var.mo34205x());
        sb.append("}\n");
        return sb.toString();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: I */
    public final List<Long> mo34991I(List<Long> list, List<Integer> list2) {
        int i;
        ArrayList arrayList = new ArrayList(list);
        for (Integer next : list2) {
            if (next.intValue() < 0) {
                this.f7899a.mo34920b().mo35080w().mo35038b("Ignoring negative bit index to be cleared", next);
            } else {
                int intValue = next.intValue() / 64;
                if (intValue >= arrayList.size()) {
                    this.f7899a.mo34920b().mo35080w().mo35039c("Ignoring bit index greater than bitSet size", next, Integer.valueOf(arrayList.size()));
                } else {
                    arrayList.set(intValue, Long.valueOf(((Long) arrayList.get(intValue)).longValue() & (~(1 << (next.intValue() % 64)))));
                }
            }
        }
        int size = arrayList.size();
        int size2 = arrayList.size() - 1;
        while (true) {
            int i2 = size2;
            i = size;
            size = i2;
            if (size >= 0 && ((Long) arrayList.get(size)).longValue() == 0) {
                size2 = size - 1;
            }
        }
        return arrayList.subList(0, i);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: K */
    public final Map<String, Object> mo34992K(Bundle bundle, boolean z) {
        HashMap hashMap = new HashMap();
        for (String next : bundle.keySet()) {
            Object obj = bundle.get(next);
            C5713de.m9057b();
            if (!this.f7899a.mo35211z().mo34873B((String) null, C6084a3.f7613w0) ? (obj instanceof Bundle[]) || (obj instanceof ArrayList) || (obj instanceof Bundle) : (obj instanceof Parcelable[]) || (obj instanceof ArrayList) || (obj instanceof Bundle)) {
                if (z) {
                    ArrayList arrayList = new ArrayList();
                    if (obj instanceof Parcelable[]) {
                        for (Parcelable parcelable : (Parcelable[]) obj) {
                            if (parcelable instanceof Bundle) {
                                arrayList.add(mo34992K((Bundle) parcelable, false));
                            }
                        }
                    } else if (obj instanceof ArrayList) {
                        ArrayList arrayList2 = (ArrayList) obj;
                        int size = arrayList2.size();
                        for (int i = 0; i < size; i++) {
                            Object obj2 = arrayList2.get(i);
                            if (obj2 instanceof Bundle) {
                                arrayList.add(mo34992K((Bundle) obj2, false));
                            }
                        }
                    } else if (obj instanceof Bundle) {
                        arrayList.add(mo34992K((Bundle) obj, false));
                    }
                    hashMap.put(next, arrayList);
                }
            } else if (obj != null) {
                hashMap.put(next, obj);
            }
        }
        return hashMap;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: L */
    public final void mo34993L(C5871n4 n4Var, Object obj) {
        C9713p.m20275j(obj);
        n4Var.mo34214x();
        n4Var.mo34212v();
        n4Var.mo34211u();
        n4Var.mo34213w();
        if (obj instanceof String) {
            n4Var.mo34207C((String) obj);
        } else if (obj instanceof Long) {
            n4Var.mo34216z(((Long) obj).longValue());
        } else if (obj instanceof Double) {
            n4Var.mo34215y(((Double) obj).doubleValue());
        } else if (obj instanceof Bundle[]) {
            n4Var.mo34209s(m10730H((Bundle[]) obj));
        } else {
            this.f7899a.mo34920b().mo35075r().mo35038b("Ignoring invalid (type) event param value", obj);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: M */
    public final void mo34994M(C5704d5 d5Var, Object obj) {
        C9713p.m20275j(obj);
        d5Var.mo33827t();
        d5Var.mo33826s();
        d5Var.mo33825r();
        if (obj instanceof String) {
            d5Var.mo33832y((String) obj);
        } else if (obj instanceof Long) {
            d5Var.mo33829v(((Long) obj).longValue());
        } else if (obj instanceof Double) {
            d5Var.mo33828u(((Double) obj).doubleValue());
        } else {
            this.f7899a.mo34920b().mo35075r().mo35038b("Ignoring invalid (type) user attribute value", obj);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: O */
    public final boolean mo34995O(long j, long j2) {
        if (j == 0 || j2 <= 0 || Math.abs(this.f7899a.mo34922c().mo33547a() - j) > j2) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: Q */
    public final byte[] mo34996Q(byte[] bArr) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
            gZIPOutputStream.write(bArr);
            gZIPOutputStream.close();
            byteArrayOutputStream.close();
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e) {
            this.f7899a.mo34920b().mo35075r().mo35038b("Failed to gzip content", e);
            throw e;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public final boolean mo34749l() {
        return false;
    }

    /* access modifiers changed from: package-private */
    @WorkerThread
    /* renamed from: y */
    public final long mo34997y(byte[] bArr) {
        C9713p.m20275j(bArr);
        this.f7899a.mo35191N().mo34778h();
        MessageDigest s = C6234n9.m10934s();
        if (s != null) {
            return C6234n9.m10933q0(s.digest(bArr));
        }
        this.f7899a.mo34920b().mo35075r().mo35037a("Failed to get MD5");
        return 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: z */
    public final Bundle mo34998z(Map<String, Object> map, boolean z) {
        Bundle bundle = new Bundle();
        for (String next : map.keySet()) {
            Object obj = map.get(next);
            if (obj == null) {
                bundle.putString(next, (String) null);
            } else if (obj instanceof Long) {
                bundle.putLong(next, ((Long) obj).longValue());
            } else if (obj instanceof Double) {
                bundle.putDouble(next, ((Double) obj).doubleValue());
            } else if (!(obj instanceof ArrayList)) {
                bundle.putString(next, obj.toString());
            } else if (z) {
                C5713de.m9057b();
                if (this.f7899a.mo35211z().mo34873B((String) null, C6084a3.f7613w0)) {
                    ArrayList arrayList = (ArrayList) obj;
                    ArrayList arrayList2 = new ArrayList();
                    int size = arrayList.size();
                    for (int i = 0; i < size; i++) {
                        arrayList2.add(mo34998z((Map) arrayList.get(i), false));
                    }
                    bundle.putParcelableArray(next, (Parcelable[]) arrayList2.toArray(new Parcelable[0]));
                } else {
                    ArrayList arrayList3 = (ArrayList) obj;
                    ArrayList arrayList4 = new ArrayList();
                    int size2 = arrayList3.size();
                    for (int i2 = 0; i2 < size2; i2++) {
                        arrayList4.add(mo34998z((Map) arrayList3.get(i2), false));
                    }
                    bundle.putParcelableArrayList(next, arrayList4);
                }
            }
        }
        return bundle;
    }
}
