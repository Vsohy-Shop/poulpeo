package com.google.android.gms.internal.gtm;

import android.content.Context;
import androidx.autofill.HintConstants;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p022a4.C2200a;
import p231t4.C9713p;
import p286y4.C10672f;

/* renamed from: com.google.android.gms.internal.gtm.ab */
public final class C5268ab extends C5521r5 {

    /* renamed from: d */
    private static final String f5817d = C5256a.UNIVERSAL_ANALYTICS.toString();

    /* renamed from: e */
    private static final List<String> f5818e = Arrays.asList(new String[]{"detail", "checkout", "checkout_option", "click", "add", "remove", "purchase", "refund"});

    /* renamed from: f */
    private static final Pattern f5819f = Pattern.compile("dimension(\\d+)");

    /* renamed from: g */
    private static final Pattern f5820g = Pattern.compile("metric(\\d+)");

    /* renamed from: h */
    private static final Set<String> f5821h = C10672f.m22676e("", "0", "false");

    /* renamed from: i */
    private static final Map<String, String> f5822i = C10672f.m22675d("transactionId", "&ti", "transactionAffiliation", "&ta", "transactionTax", "&tt", "transactionShipping", "&ts", "transactionTotal", "&tr", "transactionCurrency", "&cu");

    /* renamed from: j */
    private static final Map<String, String> f5823j = C10672f.m22675d(HintConstants.AUTOFILL_HINT_NAME, "&in", "sku", "&ic", "category", "&iv", "price", "&ip", "quantity", "&iq", "currency", "&cu");

    /* renamed from: a */
    private final C5413k5 f5824a;

    /* renamed from: b */
    private final C5637z3 f5825b;

    /* renamed from: c */
    private Map<String, Object> f5826c;

    public C5268ab(Context context, C5637z3 z3Var) {
        this(new C5413k5(context), z3Var);
    }

    /* renamed from: c */
    private static Map<String, String> m7749c(C5528rc<?> rcVar) {
        C9713p.m20275j(rcVar);
        C9713p.m20266a(rcVar instanceof C5285bd);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Object f = C5345fd.m7942f(C5345fd.m7944h(rcVar));
        C9713p.m20278m(f instanceof Map);
        for (Map.Entry entry : ((Map) f).entrySet()) {
            linkedHashMap.put(entry.getKey().toString(), entry.getValue().toString());
        }
        return linkedHashMap;
    }

    /* renamed from: d */
    private static Map<String, String> m7750d(C5528rc<?> rcVar) {
        Map<String, String> c = m7749c(rcVar);
        String str = c.get("&aip");
        if (str != null && f5821h.contains(str.toLowerCase())) {
            c.remove("&aip");
        }
        return c;
    }

    /* renamed from: e */
    private static C2200a m7751e(Map<String, Object> map) {
        String str;
        String str2;
        C2200a aVar = new C2200a();
        Object obj = map.get("id");
        if (obj != null) {
            aVar.mo23501g(String.valueOf(obj));
        }
        Object obj2 = map.get(HintConstants.AUTOFILL_HINT_NAME);
        if (obj2 != null) {
            aVar.mo23502h(String.valueOf(obj2));
        }
        Object obj3 = map.get("brand");
        if (obj3 != null) {
            aVar.mo23496b(String.valueOf(obj3));
        }
        Object obj4 = map.get("category");
        if (obj4 != null) {
            aVar.mo23497c(String.valueOf(obj4));
        }
        Object obj5 = map.get("variant");
        if (obj5 != null) {
            aVar.mo23506l(String.valueOf(obj5));
        }
        Object obj6 = map.get("coupon");
        if (obj6 != null) {
            aVar.mo23498d(String.valueOf(obj6));
        }
        Object obj7 = map.get("position");
        if (obj7 != null) {
            aVar.mo23503i(m7753g(obj7).intValue());
        }
        Object obj8 = map.get("price");
        if (obj8 != null) {
            aVar.mo23504j(m7752f(obj8).doubleValue());
        }
        Object obj9 = map.get("quantity");
        if (obj9 != null) {
            aVar.mo23505k(m7753g(obj9).intValue());
        }
        for (String next : map.keySet()) {
            Matcher matcher = f5819f.matcher(next);
            if (matcher.matches()) {
                try {
                    aVar.mo23499e(Integer.parseInt(matcher.group(1)), String.valueOf(map.get(next)));
                } catch (NumberFormatException unused) {
                    String valueOf = String.valueOf(next);
                    if (valueOf.length() != 0) {
                        str2 = "illegal number in custom dimension value: ".concat(valueOf);
                    } else {
                        str2 = new String("illegal number in custom dimension value: ");
                    }
                    C5426l3.m8134d(str2);
                }
            } else {
                Matcher matcher2 = f5820g.matcher(next);
                if (matcher2.matches()) {
                    try {
                        aVar.mo23500f(Integer.parseInt(matcher2.group(1)), m7753g(map.get(next)).intValue());
                    } catch (NumberFormatException unused2) {
                        String valueOf2 = String.valueOf(next);
                        if (valueOf2.length() != 0) {
                            str = "illegal number in custom metric value: ".concat(valueOf2);
                        } else {
                            str = new String("illegal number in custom metric value: ");
                        }
                        C5426l3.m8134d(str);
                    }
                }
            }
        }
        return aVar;
    }

    /* renamed from: f */
    private static Double m7752f(Object obj) {
        String str;
        String str2;
        if (obj instanceof String) {
            try {
                return Double.valueOf((String) obj);
            } catch (NumberFormatException e) {
                String valueOf = String.valueOf(e.getMessage());
                if (valueOf.length() != 0) {
                    str2 = "Cannot convert the object to Double: ".concat(valueOf);
                } else {
                    str2 = new String("Cannot convert the object to Double: ");
                }
                throw new RuntimeException(str2);
            }
        } else if (obj instanceof Integer) {
            return Double.valueOf(((Integer) obj).doubleValue());
        } else {
            if (obj instanceof Double) {
                return (Double) obj;
            }
            String valueOf2 = String.valueOf(obj.toString());
            if (valueOf2.length() != 0) {
                str = "Cannot convert the object to Double: ".concat(valueOf2);
            } else {
                str = new String("Cannot convert the object to Double: ");
            }
            throw new RuntimeException(str);
        }
    }

    /* renamed from: g */
    private static Integer m7753g(Object obj) {
        String str;
        String str2;
        if (obj instanceof String) {
            try {
                return Integer.valueOf((String) obj);
            } catch (NumberFormatException e) {
                String valueOf = String.valueOf(e.getMessage());
                if (valueOf.length() != 0) {
                    str2 = "Cannot convert the object to Integer: ".concat(valueOf);
                } else {
                    str2 = new String("Cannot convert the object to Integer: ");
                }
                throw new RuntimeException(str2);
            }
        } else if (obj instanceof Double) {
            return Integer.valueOf(((Double) obj).intValue());
        } else {
            if (obj instanceof Integer) {
                return (Integer) obj;
            }
            String valueOf2 = String.valueOf(obj.toString());
            if (valueOf2.length() != 0) {
                str = "Cannot convert the object to Integer: ".concat(valueOf2);
            } else {
                str = new String("Cannot convert the object to Integer: ");
            }
            throw new RuntimeException(str);
        }
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:143:0x0225, code lost:
        r6 = (java.util.Map) r8.get(r5);
        r0 = (java.util.List) r6.get("products");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:144:0x0234, code lost:
        if (r0 == null) goto L_0x026b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:145:0x0236, code lost:
        r7 = r0.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:147:0x023e, code lost:
        if (r7.hasNext() == false) goto L_0x026b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:150:?, code lost:
        r4.mo45721b(m7751e((java.util.Map) r7.next()));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:151:0x024e, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:153:?, code lost:
        r0 = java.lang.String.valueOf(r0.getMessage());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:154:0x025b, code lost:
        if (r0.length() != 0) goto L_0x025d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:155:0x025d, code lost:
        r0 = "Failed to extract a product from event data. ".concat(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:156:0x0262, code lost:
        r0 = new java.lang.String("Failed to extract a product from event data. ");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:157:0x0267, code lost:
        com.google.android.gms.internal.gtm.C5426l3.m8135e(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:160:0x026f, code lost:
        if (r6.containsKey("actionField") == false) goto L_0x0310;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:161:0x0271, code lost:
        r0 = (java.util.Map) r6.get("actionField");
        r2 = new p022a4.C2201b(r5);
        r3 = r0.get("id");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:162:0x0280, code lost:
        if (r3 == null) goto L_0x0289;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:163:0x0282, code lost:
        r2.mo23515h(java.lang.String.valueOf(r3));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:164:0x0289, code lost:
        r3 = r0.get("affiliation");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:165:0x028f, code lost:
        if (r3 == null) goto L_0x0298;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:166:0x0291, code lost:
        r2.mo23513f(java.lang.String.valueOf(r3));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:167:0x0298, code lost:
        r3 = r0.get("coupon");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:168:0x029e, code lost:
        if (r3 == null) goto L_0x02a7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:169:0x02a0, code lost:
        r2.mo23514g(java.lang.String.valueOf(r3));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:170:0x02a7, code lost:
        r3 = r0.get("list");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:171:0x02ab, code lost:
        if (r3 == null) goto L_0x02b4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:172:0x02ad, code lost:
        r2.mo23512e(java.lang.String.valueOf(r3));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:173:0x02b4, code lost:
        r3 = r0.get("option");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:174:0x02ba, code lost:
        if (r3 == null) goto L_0x02c3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:175:0x02bc, code lost:
        r2.mo23510c(java.lang.String.valueOf(r3));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:176:0x02c3, code lost:
        r3 = r0.get("revenue");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:177:0x02c9, code lost:
        if (r3 == null) goto L_0x02d6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:178:0x02cb, code lost:
        r2.mo23516i(m7752f(r3).doubleValue());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:179:0x02d6, code lost:
        r3 = r0.get("tax");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:180:0x02dc, code lost:
        if (r3 == null) goto L_0x02e9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:181:0x02de, code lost:
        r2.mo23518k(m7752f(r3).doubleValue());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:182:0x02e9, code lost:
        r3 = r0.get("shipping");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:183:0x02ef, code lost:
        if (r3 == null) goto L_0x02fc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:184:0x02f1, code lost:
        r2.mo23517j(m7752f(r3).doubleValue());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:185:0x02fc, code lost:
        r0 = r0.get("step");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:186:0x0302, code lost:
        if (r0 == null) goto L_0x0315;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:187:0x0304, code lost:
        r2.mo23511d(m7753g(r0).intValue());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:188:0x0310, code lost:
        r2 = new p022a4.C2201b(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:189:0x0315, code lost:
        r4.mo45726g(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:190:0x0319, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:193:?, code lost:
        r0 = java.lang.String.valueOf(r0.getMessage());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:194:0x0328, code lost:
        if (r0.length() != 0) goto L_0x032a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:195:0x032a, code lost:
        r0 = "Failed to extract a product action from event data. ".concat(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:196:0x032f, code lost:
        r0 = new java.lang.String("Failed to extract a product action from event data. ");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:197:0x0334, code lost:
        com.google.android.gms.internal.gtm.C5426l3.m8135e(r0);
     */
    /* JADX WARNING: Removed duplicated region for block: B:138:0x020d A[Catch:{ RuntimeException -> 0x0144, all -> 0x0477 }] */
    /* JADX WARNING: Removed duplicated region for block: B:199:0x033f A[Catch:{ RuntimeException -> 0x0144, all -> 0x0477 }] */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00a7 A[Catch:{ RuntimeException -> 0x0144, all -> 0x0477 }] */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00b4 A[Catch:{ RuntimeException -> 0x0144, all -> 0x0477 }] */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x00d8 A[SYNTHETIC, Splitter:B:62:0x00d8] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.internal.gtm.C5528rc<?> mo33099b(com.google.android.gms.internal.gtm.C5276b4 r19, com.google.android.gms.internal.gtm.C5528rc<?>... r20) {
        /*
            r18 = this;
            r1 = r18
            r0 = r20
            java.lang.String r2 = "actionField"
            java.lang.String r3 = "promoView"
            java.lang.String r4 = "&t"
            java.lang.String r5 = "&cu"
            java.lang.String r6 = "promoClick"
            r7 = 1
            p231t4.C9713p.m20266a(r7)
            int r8 = r0.length
            r9 = 0
            if (r8 <= 0) goto L_0x0018
            r8 = r7
            goto L_0x0019
        L_0x0018:
            r8 = r9
        L_0x0019:
            p231t4.C9713p.m20266a(r8)
            com.google.android.gms.internal.gtm.z3 r10 = r1.f5825b     // Catch:{ all -> 0x0477 }
            com.google.android.gms.internal.gtm.u2 r10 = r10.mo33601a()     // Catch:{ all -> 0x0477 }
            android.os.Bundle r10 = r10.mo33552f()     // Catch:{ all -> 0x0477 }
            java.util.Map r10 = com.google.android.gms.internal.gtm.C5345fd.m7940d(r10)     // Catch:{ all -> 0x0477 }
            r1.f5826c = r10     // Catch:{ all -> 0x0477 }
            r10 = r0[r9]     // Catch:{ all -> 0x0477 }
            int r11 = r0.length     // Catch:{ all -> 0x0477 }
            if (r11 <= r7) goto L_0x0034
            r11 = r0[r7]     // Catch:{ all -> 0x0477 }
            goto L_0x003b
        L_0x0034:
            com.google.android.gms.internal.gtm.uc r11 = new com.google.android.gms.internal.gtm.uc     // Catch:{ all -> 0x0477 }
            java.lang.Boolean r12 = java.lang.Boolean.TRUE     // Catch:{ all -> 0x0477 }
            r11.<init>(r12)     // Catch:{ all -> 0x0477 }
        L_0x003b:
            int r12 = r0.length     // Catch:{ all -> 0x0477 }
            r13 = 2
            if (r12 <= r13) goto L_0x0042
            r12 = r0[r13]     // Catch:{ all -> 0x0477 }
            goto L_0x0049
        L_0x0042:
            com.google.android.gms.internal.gtm.uc r12 = new com.google.android.gms.internal.gtm.uc     // Catch:{ all -> 0x0477 }
            java.lang.Boolean r13 = java.lang.Boolean.FALSE     // Catch:{ all -> 0x0477 }
            r12.<init>(r13)     // Catch:{ all -> 0x0477 }
        L_0x0049:
            int r13 = r0.length     // Catch:{ all -> 0x0477 }
            r14 = 3
            if (r13 <= r14) goto L_0x0050
            r13 = r0[r14]     // Catch:{ all -> 0x0477 }
            goto L_0x0052
        L_0x0050:
            com.google.android.gms.internal.gtm.xc r13 = com.google.android.gms.internal.gtm.C5618xc.f6732h     // Catch:{ all -> 0x0477 }
        L_0x0052:
            int r14 = r0.length     // Catch:{ all -> 0x0477 }
            r15 = 4
            if (r14 <= r15) goto L_0x0059
            r14 = r0[r15]     // Catch:{ all -> 0x0477 }
            goto L_0x005b
        L_0x0059:
            com.google.android.gms.internal.gtm.xc r14 = com.google.android.gms.internal.gtm.C5618xc.f6732h     // Catch:{ all -> 0x0477 }
        L_0x005b:
            int r15 = r0.length     // Catch:{ all -> 0x0477 }
            r7 = 5
            if (r15 <= r7) goto L_0x0062
            r7 = r0[r7]     // Catch:{ all -> 0x0477 }
            goto L_0x0069
        L_0x0062:
            com.google.android.gms.internal.gtm.uc r7 = new com.google.android.gms.internal.gtm.uc     // Catch:{ all -> 0x0477 }
            java.lang.Boolean r15 = java.lang.Boolean.FALSE     // Catch:{ all -> 0x0477 }
            r7.<init>(r15)     // Catch:{ all -> 0x0477 }
        L_0x0069:
            int r15 = r0.length     // Catch:{ all -> 0x0477 }
            r9 = 6
            if (r15 <= r9) goto L_0x0070
            r9 = r0[r9]     // Catch:{ all -> 0x0477 }
            goto L_0x0077
        L_0x0070:
            com.google.android.gms.internal.gtm.uc r9 = new com.google.android.gms.internal.gtm.uc     // Catch:{ all -> 0x0477 }
            java.lang.Boolean r15 = java.lang.Boolean.FALSE     // Catch:{ all -> 0x0477 }
            r9.<init>(r15)     // Catch:{ all -> 0x0477 }
        L_0x0077:
            int r15 = r0.length     // Catch:{ all -> 0x0477 }
            r8 = 7
            if (r15 <= r8) goto L_0x007e
            r8 = r0[r8]     // Catch:{ all -> 0x0477 }
            goto L_0x0080
        L_0x007e:
            com.google.android.gms.internal.gtm.xc r8 = com.google.android.gms.internal.gtm.C5618xc.f6732h     // Catch:{ all -> 0x0477 }
        L_0x0080:
            int r15 = r0.length     // Catch:{ all -> 0x0477 }
            r16 = r4
            r4 = 8
            if (r15 <= r4) goto L_0x008a
            r0 = r0[r4]     // Catch:{ all -> 0x0477 }
            goto L_0x0091
        L_0x008a:
            com.google.android.gms.internal.gtm.uc r0 = new com.google.android.gms.internal.gtm.uc     // Catch:{ all -> 0x0477 }
            java.lang.Boolean r4 = java.lang.Boolean.FALSE     // Catch:{ all -> 0x0477 }
            r0.<init>(r4)     // Catch:{ all -> 0x0477 }
        L_0x0091:
            boolean r4 = r10 instanceof com.google.android.gms.internal.gtm.C5285bd     // Catch:{ all -> 0x0477 }
            p231t4.C9713p.m20266a(r4)     // Catch:{ all -> 0x0477 }
            com.google.android.gms.internal.gtm.xc r4 = com.google.android.gms.internal.gtm.C5618xc.f6732h     // Catch:{ all -> 0x0477 }
            if (r13 == r4) goto L_0x00a1
            boolean r15 = r13 instanceof com.google.android.gms.internal.gtm.C5285bd     // Catch:{ all -> 0x0477 }
            if (r15 == 0) goto L_0x009f
            goto L_0x00a1
        L_0x009f:
            r15 = 0
            goto L_0x00a2
        L_0x00a1:
            r15 = 1
        L_0x00a2:
            p231t4.C9713p.m20266a(r15)     // Catch:{ all -> 0x0477 }
            if (r14 == r4) goto L_0x00ae
            boolean r15 = r14 instanceof com.google.android.gms.internal.gtm.C5285bd     // Catch:{ all -> 0x0477 }
            if (r15 == 0) goto L_0x00ac
            goto L_0x00ae
        L_0x00ac:
            r15 = 0
            goto L_0x00af
        L_0x00ae:
            r15 = 1
        L_0x00af:
            p231t4.C9713p.m20266a(r15)     // Catch:{ all -> 0x0477 }
            if (r8 == r4) goto L_0x00bb
            boolean r15 = r8 instanceof com.google.android.gms.internal.gtm.C5285bd     // Catch:{ all -> 0x0477 }
            if (r15 == 0) goto L_0x00b9
            goto L_0x00bb
        L_0x00b9:
            r15 = 0
            goto L_0x00bc
        L_0x00bb:
            r15 = 1
        L_0x00bc:
            p231t4.C9713p.m20266a(r15)     // Catch:{ all -> 0x0477 }
            com.google.android.gms.internal.gtm.k5 r15 = r1.f5824a     // Catch:{ all -> 0x0477 }
            r17 = r14
            java.lang.String r14 = "_GTM_DEFAULT_TRACKER_"
            z3.f r14 = r15.mo33320a(r14)     // Catch:{ all -> 0x0477 }
            boolean r0 = com.google.android.gms.internal.gtm.C5506q5.m8415b(r0)     // Catch:{ all -> 0x0477 }
            r14.mo45727R0(r0)     // Catch:{ all -> 0x0477 }
            boolean r0 = com.google.android.gms.internal.gtm.C5506q5.m8415b(r7)     // Catch:{ all -> 0x0477 }
            java.lang.String r7 = "name"
            if (r0 == 0) goto L_0x033f
            z3.d r4 = new z3.d     // Catch:{ all -> 0x0477 }
            r4.<init>()     // Catch:{ all -> 0x0477 }
            java.util.Map r0 = m7750d(r10)     // Catch:{ all -> 0x0477 }
            r4.mo45725f(r0)     // Catch:{ all -> 0x0477 }
            boolean r9 = com.google.android.gms.internal.gtm.C5506q5.m8415b(r9)     // Catch:{ all -> 0x0477 }
            if (r9 == 0) goto L_0x00f3
            java.util.Map<java.lang.String, java.lang.Object> r8 = r1.f5826c     // Catch:{ all -> 0x0477 }
            java.lang.String r9 = "ecommerce"
            java.lang.Object r8 = r8.get(r9)     // Catch:{ all -> 0x0477 }
            goto L_0x00fb
        L_0x00f3:
            com.google.android.gms.internal.gtm.rc r8 = com.google.android.gms.internal.gtm.C5345fd.m7944h(r8)     // Catch:{ all -> 0x0477 }
            java.lang.Object r8 = com.google.android.gms.internal.gtm.C5345fd.m7942f(r8)     // Catch:{ all -> 0x0477 }
        L_0x00fb:
            boolean r9 = r8 instanceof java.util.Map     // Catch:{ all -> 0x0477 }
            if (r9 == 0) goto L_0x0337
            java.util.Map r8 = (java.util.Map) r8     // Catch:{ all -> 0x0477 }
            java.lang.Object r0 = r0.get(r5)     // Catch:{ all -> 0x0477 }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ all -> 0x0477 }
            if (r0 != 0) goto L_0x0111
            java.lang.String r0 = "currencyCode"
            java.lang.Object r0 = r8.get(r0)     // Catch:{ all -> 0x0477 }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ all -> 0x0477 }
        L_0x0111:
            if (r0 == 0) goto L_0x0116
            r4.mo45724e(r5, r0)     // Catch:{ all -> 0x0477 }
        L_0x0116:
            java.lang.String r0 = "impressions"
            java.lang.Object r0 = r8.get(r0)     // Catch:{ all -> 0x0477 }
            boolean r5 = r0 instanceof java.util.List     // Catch:{ all -> 0x0477 }
            java.lang.String r9 = "Failed to extract a product from event data. "
            java.lang.String r10 = "list"
            if (r5 == 0) goto L_0x0161
            java.util.List r0 = (java.util.List) r0     // Catch:{ all -> 0x0477 }
            java.util.Iterator r5 = r0.iterator()     // Catch:{ all -> 0x0477 }
        L_0x012a:
            boolean r0 = r5.hasNext()     // Catch:{ all -> 0x0477 }
            if (r0 == 0) goto L_0x0161
            java.lang.Object r0 = r5.next()     // Catch:{ all -> 0x0477 }
            java.util.Map r0 = (java.util.Map) r0     // Catch:{ all -> 0x0477 }
            a4.a r11 = m7751e(r0)     // Catch:{ RuntimeException -> 0x0144 }
            java.lang.Object r0 = r0.get(r10)     // Catch:{ RuntimeException -> 0x0144 }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ RuntimeException -> 0x0144 }
            r4.mo45720a(r11, r0)     // Catch:{ RuntimeException -> 0x0144 }
            goto L_0x012a
        L_0x0144:
            r0 = move-exception
            java.lang.String r0 = r0.getMessage()     // Catch:{ all -> 0x0477 }
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x0477 }
            int r11 = r0.length()     // Catch:{ all -> 0x0477 }
            if (r11 == 0) goto L_0x0158
            java.lang.String r0 = r9.concat(r0)     // Catch:{ all -> 0x0477 }
            goto L_0x015d
        L_0x0158:
            java.lang.String r0 = new java.lang.String     // Catch:{ all -> 0x0477 }
            r0.<init>(r9)     // Catch:{ all -> 0x0477 }
        L_0x015d:
            com.google.android.gms.internal.gtm.C5426l3.m8135e(r0)     // Catch:{ all -> 0x0477 }
            goto L_0x012a
        L_0x0161:
            boolean r0 = r8.containsKey(r6)     // Catch:{ all -> 0x0477 }
            java.lang.String r5 = "promotions"
            if (r0 == 0) goto L_0x0176
            java.lang.Object r0 = r8.get(r6)     // Catch:{ all -> 0x0477 }
            java.util.Map r0 = (java.util.Map) r0     // Catch:{ all -> 0x0477 }
            java.lang.Object r0 = r0.get(r5)     // Catch:{ all -> 0x0477 }
            java.util.List r0 = (java.util.List) r0     // Catch:{ all -> 0x0477 }
            goto L_0x018a
        L_0x0176:
            boolean r0 = r8.containsKey(r3)     // Catch:{ all -> 0x0477 }
            if (r0 == 0) goto L_0x0189
            java.lang.Object r0 = r8.get(r3)     // Catch:{ all -> 0x0477 }
            java.util.Map r0 = (java.util.Map) r0     // Catch:{ all -> 0x0477 }
            java.lang.Object r0 = r0.get(r5)     // Catch:{ all -> 0x0477 }
            java.util.List r0 = (java.util.List) r0     // Catch:{ all -> 0x0477 }
            goto L_0x018a
        L_0x0189:
            r0 = 0
        L_0x018a:
            java.lang.String r3 = "id"
            if (r0 == 0) goto L_0x020a
            java.util.Iterator r5 = r0.iterator()     // Catch:{ all -> 0x0477 }
        L_0x0192:
            boolean r0 = r5.hasNext()     // Catch:{ all -> 0x0477 }
            if (r0 == 0) goto L_0x01f6
            java.lang.Object r0 = r5.next()     // Catch:{ all -> 0x0477 }
            java.util.Map r0 = (java.util.Map) r0     // Catch:{ all -> 0x0477 }
            a4.c r11 = new a4.c     // Catch:{ RuntimeException -> 0x01d7 }
            r11.<init>()     // Catch:{ RuntimeException -> 0x01d7 }
            java.lang.Object r12 = r0.get(r3)     // Catch:{ RuntimeException -> 0x01d7 }
            java.lang.String r12 = (java.lang.String) r12     // Catch:{ RuntimeException -> 0x01d7 }
            if (r12 == 0) goto L_0x01ae
            r11.mo23521c(r12)     // Catch:{ RuntimeException -> 0x01d7 }
        L_0x01ae:
            java.lang.Object r12 = r0.get(r7)     // Catch:{ RuntimeException -> 0x01d7 }
            java.lang.String r12 = (java.lang.String) r12     // Catch:{ RuntimeException -> 0x01d7 }
            if (r12 == 0) goto L_0x01b9
            r11.mo23522d(r12)     // Catch:{ RuntimeException -> 0x01d7 }
        L_0x01b9:
            java.lang.String r12 = "creative"
            java.lang.Object r12 = r0.get(r12)     // Catch:{ RuntimeException -> 0x01d7 }
            java.lang.String r12 = (java.lang.String) r12     // Catch:{ RuntimeException -> 0x01d7 }
            if (r12 == 0) goto L_0x01c6
            r11.mo23520b(r12)     // Catch:{ RuntimeException -> 0x01d7 }
        L_0x01c6:
            java.lang.String r12 = "position"
            java.lang.Object r0 = r0.get(r12)     // Catch:{ RuntimeException -> 0x01d7 }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ RuntimeException -> 0x01d7 }
            if (r0 == 0) goto L_0x01d3
            r11.mo23523e(r0)     // Catch:{ RuntimeException -> 0x01d7 }
        L_0x01d3:
            r4.mo45722c(r11)     // Catch:{ RuntimeException -> 0x01d7 }
            goto L_0x0192
        L_0x01d7:
            r0 = move-exception
            java.lang.String r11 = "Failed to extract a promotion from event data. "
            java.lang.String r0 = r0.getMessage()     // Catch:{ all -> 0x0477 }
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x0477 }
            int r12 = r0.length()     // Catch:{ all -> 0x0477 }
            if (r12 == 0) goto L_0x01ed
            java.lang.String r0 = r11.concat(r0)     // Catch:{ all -> 0x0477 }
            goto L_0x01f2
        L_0x01ed:
            java.lang.String r0 = new java.lang.String     // Catch:{ all -> 0x0477 }
            r0.<init>(r11)     // Catch:{ all -> 0x0477 }
        L_0x01f2:
            com.google.android.gms.internal.gtm.C5426l3.m8135e(r0)     // Catch:{ all -> 0x0477 }
            goto L_0x0192
        L_0x01f6:
            boolean r0 = r8.containsKey(r6)     // Catch:{ all -> 0x0477 }
            java.lang.String r5 = "&promoa"
            if (r0 == 0) goto L_0x0205
            java.lang.String r0 = "click"
            r4.mo45724e(r5, r0)     // Catch:{ all -> 0x0477 }
            r7 = 0
            goto L_0x020b
        L_0x0205:
            java.lang.String r0 = "view"
            r4.mo45724e(r5, r0)     // Catch:{ all -> 0x0477 }
        L_0x020a:
            r7 = 1
        L_0x020b:
            if (r7 == 0) goto L_0x0337
            java.util.List<java.lang.String> r0 = f5818e     // Catch:{ all -> 0x0477 }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ all -> 0x0477 }
        L_0x0213:
            boolean r5 = r0.hasNext()     // Catch:{ all -> 0x0477 }
            if (r5 == 0) goto L_0x0337
            java.lang.Object r5 = r0.next()     // Catch:{ all -> 0x0477 }
            java.lang.String r5 = (java.lang.String) r5     // Catch:{ all -> 0x0477 }
            boolean r6 = r8.containsKey(r5)     // Catch:{ all -> 0x0477 }
            if (r6 == 0) goto L_0x0213
            java.lang.Object r0 = r8.get(r5)     // Catch:{ all -> 0x0477 }
            r6 = r0
            java.util.Map r6 = (java.util.Map) r6     // Catch:{ all -> 0x0477 }
            java.lang.String r0 = "products"
            java.lang.Object r0 = r6.get(r0)     // Catch:{ all -> 0x0477 }
            java.util.List r0 = (java.util.List) r0     // Catch:{ all -> 0x0477 }
            if (r0 == 0) goto L_0x026b
            java.util.Iterator r7 = r0.iterator()     // Catch:{ all -> 0x0477 }
        L_0x023a:
            boolean r0 = r7.hasNext()     // Catch:{ all -> 0x0477 }
            if (r0 == 0) goto L_0x026b
            java.lang.Object r0 = r7.next()     // Catch:{ all -> 0x0477 }
            java.util.Map r0 = (java.util.Map) r0     // Catch:{ all -> 0x0477 }
            a4.a r0 = m7751e(r0)     // Catch:{ RuntimeException -> 0x024e }
            r4.mo45721b(r0)     // Catch:{ RuntimeException -> 0x024e }
            goto L_0x023a
        L_0x024e:
            r0 = move-exception
            java.lang.String r0 = r0.getMessage()     // Catch:{ all -> 0x0477 }
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x0477 }
            int r8 = r0.length()     // Catch:{ all -> 0x0477 }
            if (r8 == 0) goto L_0x0262
            java.lang.String r0 = r9.concat(r0)     // Catch:{ all -> 0x0477 }
            goto L_0x0267
        L_0x0262:
            java.lang.String r0 = new java.lang.String     // Catch:{ all -> 0x0477 }
            r0.<init>(r9)     // Catch:{ all -> 0x0477 }
        L_0x0267:
            com.google.android.gms.internal.gtm.C5426l3.m8135e(r0)     // Catch:{ all -> 0x0477 }
            goto L_0x023a
        L_0x026b:
            boolean r0 = r6.containsKey(r2)     // Catch:{ RuntimeException -> 0x0319 }
            if (r0 == 0) goto L_0x0310
            java.lang.Object r0 = r6.get(r2)     // Catch:{ RuntimeException -> 0x0319 }
            java.util.Map r0 = (java.util.Map) r0     // Catch:{ RuntimeException -> 0x0319 }
            a4.b r2 = new a4.b     // Catch:{ RuntimeException -> 0x0319 }
            r2.<init>(r5)     // Catch:{ RuntimeException -> 0x0319 }
            java.lang.Object r3 = r0.get(r3)     // Catch:{ RuntimeException -> 0x0319 }
            if (r3 == 0) goto L_0x0289
            java.lang.String r3 = java.lang.String.valueOf(r3)     // Catch:{ RuntimeException -> 0x0319 }
            r2.mo23515h(r3)     // Catch:{ RuntimeException -> 0x0319 }
        L_0x0289:
            java.lang.String r3 = "affiliation"
            java.lang.Object r3 = r0.get(r3)     // Catch:{ RuntimeException -> 0x0319 }
            if (r3 == 0) goto L_0x0298
            java.lang.String r3 = java.lang.String.valueOf(r3)     // Catch:{ RuntimeException -> 0x0319 }
            r2.mo23513f(r3)     // Catch:{ RuntimeException -> 0x0319 }
        L_0x0298:
            java.lang.String r3 = "coupon"
            java.lang.Object r3 = r0.get(r3)     // Catch:{ RuntimeException -> 0x0319 }
            if (r3 == 0) goto L_0x02a7
            java.lang.String r3 = java.lang.String.valueOf(r3)     // Catch:{ RuntimeException -> 0x0319 }
            r2.mo23514g(r3)     // Catch:{ RuntimeException -> 0x0319 }
        L_0x02a7:
            java.lang.Object r3 = r0.get(r10)     // Catch:{ RuntimeException -> 0x0319 }
            if (r3 == 0) goto L_0x02b4
            java.lang.String r3 = java.lang.String.valueOf(r3)     // Catch:{ RuntimeException -> 0x0319 }
            r2.mo23512e(r3)     // Catch:{ RuntimeException -> 0x0319 }
        L_0x02b4:
            java.lang.String r3 = "option"
            java.lang.Object r3 = r0.get(r3)     // Catch:{ RuntimeException -> 0x0319 }
            if (r3 == 0) goto L_0x02c3
            java.lang.String r3 = java.lang.String.valueOf(r3)     // Catch:{ RuntimeException -> 0x0319 }
            r2.mo23510c(r3)     // Catch:{ RuntimeException -> 0x0319 }
        L_0x02c3:
            java.lang.String r3 = "revenue"
            java.lang.Object r3 = r0.get(r3)     // Catch:{ RuntimeException -> 0x0319 }
            if (r3 == 0) goto L_0x02d6
            java.lang.Double r3 = m7752f(r3)     // Catch:{ RuntimeException -> 0x0319 }
            double r5 = r3.doubleValue()     // Catch:{ RuntimeException -> 0x0319 }
            r2.mo23516i(r5)     // Catch:{ RuntimeException -> 0x0319 }
        L_0x02d6:
            java.lang.String r3 = "tax"
            java.lang.Object r3 = r0.get(r3)     // Catch:{ RuntimeException -> 0x0319 }
            if (r3 == 0) goto L_0x02e9
            java.lang.Double r3 = m7752f(r3)     // Catch:{ RuntimeException -> 0x0319 }
            double r5 = r3.doubleValue()     // Catch:{ RuntimeException -> 0x0319 }
            r2.mo23518k(r5)     // Catch:{ RuntimeException -> 0x0319 }
        L_0x02e9:
            java.lang.String r3 = "shipping"
            java.lang.Object r3 = r0.get(r3)     // Catch:{ RuntimeException -> 0x0319 }
            if (r3 == 0) goto L_0x02fc
            java.lang.Double r3 = m7752f(r3)     // Catch:{ RuntimeException -> 0x0319 }
            double r5 = r3.doubleValue()     // Catch:{ RuntimeException -> 0x0319 }
            r2.mo23517j(r5)     // Catch:{ RuntimeException -> 0x0319 }
        L_0x02fc:
            java.lang.String r3 = "step"
            java.lang.Object r0 = r0.get(r3)     // Catch:{ RuntimeException -> 0x0319 }
            if (r0 == 0) goto L_0x0315
            java.lang.Integer r0 = m7753g(r0)     // Catch:{ RuntimeException -> 0x0319 }
            int r0 = r0.intValue()     // Catch:{ RuntimeException -> 0x0319 }
            r2.mo23511d(r0)     // Catch:{ RuntimeException -> 0x0319 }
            goto L_0x0315
        L_0x0310:
            a4.b r2 = new a4.b     // Catch:{ RuntimeException -> 0x0319 }
            r2.<init>(r5)     // Catch:{ RuntimeException -> 0x0319 }
        L_0x0315:
            r4.mo45726g(r2)     // Catch:{ RuntimeException -> 0x0319 }
            goto L_0x0337
        L_0x0319:
            r0 = move-exception
            java.lang.String r2 = "Failed to extract a product action from event data. "
            java.lang.String r0 = r0.getMessage()     // Catch:{ all -> 0x0477 }
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x0477 }
            int r3 = r0.length()     // Catch:{ all -> 0x0477 }
            if (r3 == 0) goto L_0x032f
            java.lang.String r0 = r2.concat(r0)     // Catch:{ all -> 0x0477 }
            goto L_0x0334
        L_0x032f:
            java.lang.String r0 = new java.lang.String     // Catch:{ all -> 0x0477 }
            r0.<init>(r2)     // Catch:{ all -> 0x0477 }
        L_0x0334:
            com.google.android.gms.internal.gtm.C5426l3.m8135e(r0)     // Catch:{ all -> 0x0477 }
        L_0x0337:
            java.util.Map r0 = r4.mo45723d()     // Catch:{ all -> 0x0477 }
            r14.mo45728S0(r0)     // Catch:{ all -> 0x0477 }
            goto L_0x034c
        L_0x033f:
            boolean r0 = com.google.android.gms.internal.gtm.C5506q5.m8415b(r11)     // Catch:{ all -> 0x0477 }
            if (r0 == 0) goto L_0x034f
            java.util.Map r0 = m7750d(r10)     // Catch:{ all -> 0x0477 }
            r14.mo45728S0(r0)     // Catch:{ all -> 0x0477 }
        L_0x034c:
            r2 = 0
            goto L_0x0472
        L_0x034f:
            boolean r0 = com.google.android.gms.internal.gtm.C5506q5.m8415b(r12)     // Catch:{ all -> 0x0477 }
            if (r0 == 0) goto L_0x046b
            java.util.Map<java.lang.String, java.lang.Object> r0 = r1.f5826c     // Catch:{ all -> 0x0477 }
            java.lang.String r2 = "transactionId"
            java.lang.Object r0 = r0.get(r2)     // Catch:{ all -> 0x0477 }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ all -> 0x0477 }
            if (r0 != 0) goto L_0x0367
            java.lang.String r0 = "Cannot find transactionId in data layer."
            com.google.android.gms.internal.gtm.C5426l3.m8135e(r0)     // Catch:{ all -> 0x0477 }
            goto L_0x034c
        L_0x0367:
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch:{ all -> 0x0477 }
            r2.<init>()     // Catch:{ all -> 0x0477 }
            java.util.Map r3 = m7750d(r10)     // Catch:{ IllegalArgumentException -> 0x0463 }
            java.lang.String r5 = "transaction"
            r6 = r16
            r3.put(r6, r5)     // Catch:{ IllegalArgumentException -> 0x0463 }
            if (r13 != r4) goto L_0x037c
            java.util.Map<java.lang.String, java.lang.String> r4 = f5822i     // Catch:{ IllegalArgumentException -> 0x0463 }
            goto L_0x0380
        L_0x037c:
            java.util.Map r4 = m7749c(r13)     // Catch:{ IllegalArgumentException -> 0x0463 }
        L_0x0380:
            java.util.Set r4 = r4.entrySet()     // Catch:{ IllegalArgumentException -> 0x0463 }
            java.util.Iterator r4 = r4.iterator()     // Catch:{ IllegalArgumentException -> 0x0463 }
        L_0x0388:
            boolean r5 = r4.hasNext()     // Catch:{ IllegalArgumentException -> 0x0463 }
            if (r5 == 0) goto L_0x03ac
            java.lang.Object r5 = r4.next()     // Catch:{ IllegalArgumentException -> 0x0463 }
            java.util.Map$Entry r5 = (java.util.Map.Entry) r5     // Catch:{ IllegalArgumentException -> 0x0463 }
            java.util.Map<java.lang.String, java.lang.Object> r8 = r1.f5826c     // Catch:{ IllegalArgumentException -> 0x0463 }
            java.lang.Object r9 = r5.getKey()     // Catch:{ IllegalArgumentException -> 0x0463 }
            java.lang.Object r8 = r8.get(r9)     // Catch:{ IllegalArgumentException -> 0x0463 }
            java.lang.String r8 = (java.lang.String) r8     // Catch:{ IllegalArgumentException -> 0x0463 }
            if (r8 == 0) goto L_0x0388
            java.lang.Object r5 = r5.getValue()     // Catch:{ IllegalArgumentException -> 0x0463 }
            java.lang.String r5 = (java.lang.String) r5     // Catch:{ IllegalArgumentException -> 0x0463 }
            r3.put(r5, r8)     // Catch:{ IllegalArgumentException -> 0x0463 }
            goto L_0x0388
        L_0x03ac:
            r2.add(r3)     // Catch:{ IllegalArgumentException -> 0x0463 }
            java.lang.String r3 = "transactionProducts"
            java.util.Map<java.lang.String, java.lang.Object> r4 = r1.f5826c     // Catch:{ IllegalArgumentException -> 0x0463 }
            java.lang.Object r3 = r4.get(r3)     // Catch:{ IllegalArgumentException -> 0x0463 }
            if (r3 != 0) goto L_0x03bb
            r3 = 0
            goto L_0x03dc
        L_0x03bb:
            boolean r4 = r3 instanceof java.util.List     // Catch:{ IllegalArgumentException -> 0x0463 }
            if (r4 == 0) goto L_0x045b
            java.util.List r3 = (java.util.List) r3     // Catch:{ IllegalArgumentException -> 0x0463 }
            java.util.Iterator r4 = r3.iterator()     // Catch:{ IllegalArgumentException -> 0x0463 }
        L_0x03c5:
            boolean r5 = r4.hasNext()     // Catch:{ IllegalArgumentException -> 0x0463 }
            if (r5 == 0) goto L_0x03dc
            java.lang.Object r5 = r4.next()     // Catch:{ IllegalArgumentException -> 0x0463 }
            boolean r5 = r5 instanceof java.util.Map     // Catch:{ IllegalArgumentException -> 0x0463 }
            if (r5 == 0) goto L_0x03d4
            goto L_0x03c5
        L_0x03d4:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException     // Catch:{ IllegalArgumentException -> 0x0463 }
            java.lang.String r2 = "Each element of transactionProducts should be of type Map."
            r0.<init>(r2)     // Catch:{ IllegalArgumentException -> 0x0463 }
            throw r0     // Catch:{ IllegalArgumentException -> 0x0463 }
        L_0x03dc:
            if (r3 == 0) goto L_0x0448
            java.util.Iterator r3 = r3.iterator()     // Catch:{ IllegalArgumentException -> 0x0463 }
        L_0x03e2:
            boolean r4 = r3.hasNext()     // Catch:{ IllegalArgumentException -> 0x0463 }
            if (r4 == 0) goto L_0x0448
            java.lang.Object r4 = r3.next()     // Catch:{ IllegalArgumentException -> 0x0463 }
            java.util.Map r4 = (java.util.Map) r4     // Catch:{ IllegalArgumentException -> 0x0463 }
            java.lang.Object r5 = r4.get(r7)     // Catch:{ IllegalArgumentException -> 0x0463 }
            if (r5 != 0) goto L_0x03fb
            java.lang.String r0 = "Unable to send transaction item hit due to missing 'name' field."
            com.google.android.gms.internal.gtm.C5426l3.m8135e(r0)     // Catch:{ IllegalArgumentException -> 0x0463 }
            goto L_0x034c
        L_0x03fb:
            java.util.Map r5 = m7750d(r10)     // Catch:{ IllegalArgumentException -> 0x0463 }
            java.lang.String r8 = "item"
            r5.put(r6, r8)     // Catch:{ IllegalArgumentException -> 0x0463 }
            java.lang.String r8 = "&ti"
            r5.put(r8, r0)     // Catch:{ IllegalArgumentException -> 0x0463 }
            com.google.android.gms.internal.gtm.xc r8 = com.google.android.gms.internal.gtm.C5618xc.f6732h     // Catch:{ IllegalArgumentException -> 0x0463 }
            r9 = r17
            if (r9 != r8) goto L_0x0412
            java.util.Map<java.lang.String, java.lang.String> r8 = f5823j     // Catch:{ IllegalArgumentException -> 0x0463 }
            goto L_0x0416
        L_0x0412:
            java.util.Map r8 = m7749c(r9)     // Catch:{ IllegalArgumentException -> 0x0463 }
        L_0x0416:
            java.util.Set r8 = r8.entrySet()     // Catch:{ IllegalArgumentException -> 0x0463 }
            java.util.Iterator r8 = r8.iterator()     // Catch:{ IllegalArgumentException -> 0x0463 }
        L_0x041e:
            boolean r11 = r8.hasNext()     // Catch:{ IllegalArgumentException -> 0x0463 }
            if (r11 == 0) goto L_0x0442
            java.lang.Object r11 = r8.next()     // Catch:{ IllegalArgumentException -> 0x0463 }
            java.util.Map$Entry r11 = (java.util.Map.Entry) r11     // Catch:{ IllegalArgumentException -> 0x0463 }
            java.lang.Object r12 = r11.getKey()     // Catch:{ IllegalArgumentException -> 0x0463 }
            java.lang.Object r12 = r4.get(r12)     // Catch:{ IllegalArgumentException -> 0x0463 }
            if (r12 == 0) goto L_0x041e
            java.lang.Object r11 = r11.getValue()     // Catch:{ IllegalArgumentException -> 0x0463 }
            java.lang.String r11 = (java.lang.String) r11     // Catch:{ IllegalArgumentException -> 0x0463 }
            java.lang.String r12 = r12.toString()     // Catch:{ IllegalArgumentException -> 0x0463 }
            r5.put(r11, r12)     // Catch:{ IllegalArgumentException -> 0x0463 }
            goto L_0x041e
        L_0x0442:
            r2.add(r5)     // Catch:{ IllegalArgumentException -> 0x0463 }
            r17 = r9
            goto L_0x03e2
        L_0x0448:
            int r0 = r2.size()     // Catch:{ IllegalArgumentException -> 0x0463 }
            r9 = 0
        L_0x044d:
            if (r9 >= r0) goto L_0x034c
            java.lang.Object r3 = r2.get(r9)     // Catch:{ IllegalArgumentException -> 0x0463 }
            int r9 = r9 + 1
            java.util.Map r3 = (java.util.Map) r3     // Catch:{ IllegalArgumentException -> 0x0463 }
            r14.mo45728S0(r3)     // Catch:{ IllegalArgumentException -> 0x0463 }
            goto L_0x044d
        L_0x045b:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException     // Catch:{ IllegalArgumentException -> 0x0463 }
            java.lang.String r2 = "transactionProducts should be of type List."
            r0.<init>(r2)     // Catch:{ IllegalArgumentException -> 0x0463 }
            throw r0     // Catch:{ IllegalArgumentException -> 0x0463 }
        L_0x0463:
            r0 = move-exception
            java.lang.String r2 = "Unable to send transaction"
            com.google.android.gms.internal.gtm.C5426l3.m8132b(r2, r0)     // Catch:{ all -> 0x0477 }
            goto L_0x034c
        L_0x046b:
            java.lang.String r0 = "Ignoring unknown tag."
            com.google.android.gms.internal.gtm.C5426l3.m8134d(r0)     // Catch:{ all -> 0x0477 }
            goto L_0x034c
        L_0x0472:
            r1.f5826c = r2
            com.google.android.gms.internal.gtm.xc r0 = com.google.android.gms.internal.gtm.C5618xc.f6732h
            return r0
        L_0x0477:
            r0 = move-exception
            r2 = 0
            r1.f5826c = r2
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.gtm.C5268ab.mo33099b(com.google.android.gms.internal.gtm.b4, com.google.android.gms.internal.gtm.rc[]):com.google.android.gms.internal.gtm.rc");
    }

    private C5268ab(C5413k5 k5Var, C5637z3 z3Var) {
        this.f5825b = z3Var;
        this.f5824a = k5Var;
    }
}
