package com.google.android.gms.internal.gtm;

import android.content.Context;
import android.os.RemoteException;
import androidx.core.app.NotificationCompat;
import androidx.exifinterface.media.ExifInterface;
import com.adjust.sdk.Constants;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import p231t4.C9713p;
import p254v5.C9942c;
import p254v5.C9951l;

/* renamed from: com.google.android.gms.internal.gtm.v3 */
public final class C5580v3 {

    /* renamed from: a */
    private final Context f6374a;

    /* renamed from: b */
    private final String f6375b;

    /* renamed from: c */
    private final C5299cc f6376c;

    /* renamed from: d */
    private final C9951l f6377d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final C9942c f6378e;

    /* renamed from: f */
    private final C5276b4 f6379f;

    /* renamed from: g */
    private final C5285bd f6380g;

    /* renamed from: h */
    private final C5285bd f6381h;

    /* renamed from: i */
    private final Set<String> f6382i = new HashSet();

    /* renamed from: j */
    private int f6383j;

    /* renamed from: k */
    private C5495p9 f6384k;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public C5564u2 f6385l;

    /* renamed from: m */
    private final C5637z3 f6386m;

    public C5580v3(Context context, String str, C5299cc ccVar, C5420kc kcVar, C9951l lVar, C9942c cVar) {
        C5276b4 b4Var = new C5276b4();
        this.f6379f = b4Var;
        C5285bd bdVar = new C5285bd(new HashMap(50));
        this.f6380g = bdVar;
        C5285bd bdVar2 = new C5285bd(new HashMap(10));
        this.f6381h = bdVar2;
        C5595w3 w3Var = new C5595w3(this);
        this.f6386m = w3Var;
        C9713p.m20276k(ccVar, "Internal Error: Container resource cannot be null");
        C9713p.m20276k(kcVar, "Internal Error: Runtime resource cannot be null");
        C9713p.m20272g(str, "Internal Error: ContainerId cannot be empty");
        C9713p.m20275j(lVar);
        C9713p.m20275j(cVar);
        this.f6374a = context;
        this.f6375b = str;
        this.f6376c = ccVar;
        this.f6377d = lVar;
        this.f6378e = cVar;
        b4Var.mo33123c("1", new C5604wc(new C5477o6()));
        b4Var.mo33123c("12", new C5604wc(new C5492p6()));
        b4Var.mo33123c("18", new C5604wc(new C5507q6()));
        b4Var.mo33123c("19", new C5604wc(new C5522r6()));
        b4Var.mo33123c("20", new C5604wc(new C5537s6()));
        b4Var.mo33123c("21", new C5604wc(new C5553t6()));
        b4Var.mo33123c("23", new C5604wc(new C5568u6()));
        b4Var.mo33123c("24", new C5604wc(new C5583v6()));
        b4Var.mo33123c("27", new C5604wc(new C5598w6()));
        b4Var.mo33123c("28", new C5604wc(new C5612x6()));
        b4Var.mo33123c("29", new C5604wc(new C5626y6()));
        b4Var.mo33123c("30", new C5604wc(new C5640z6()));
        b4Var.mo33123c("32", new C5604wc(new C5264a7()));
        b4Var.mo33123c("33", new C5604wc(new C5264a7()));
        b4Var.mo33123c("34", new C5604wc(new C5279b7()));
        b4Var.mo33123c("35", new C5604wc(new C5279b7()));
        b4Var.mo33123c("39", new C5604wc(new C5294c7()));
        b4Var.mo33123c("40", new C5604wc(new C5309d7()));
        b4Var.mo33123c("0", new C5604wc(new C5265a8()));
        b4Var.mo33123c("10", new C5604wc(new C5280b8()));
        b4Var.mo33123c("25", new C5604wc(new C5295c8()));
        b4Var.mo33123c("26", new C5604wc(new C5310d8()));
        b4Var.mo33123c("37", new C5604wc(new C5325e8()));
        b4Var.mo33123c(ExifInterface.GPS_MEASUREMENT_2D, new C5604wc(new C5324e7()));
        b4Var.mo33123c(ExifInterface.GPS_MEASUREMENT_3D, new C5604wc(new C5339f7()));
        b4Var.mo33123c("4", new C5604wc(new C5354g7()));
        b4Var.mo33123c("5", new C5604wc(new C5370h7()));
        b4Var.mo33123c("6", new C5604wc(new C5385i7()));
        b4Var.mo33123c("7", new C5604wc(new C5400j7()));
        b4Var.mo33123c("8", new C5604wc(new C5415k7()));
        b4Var.mo33123c("9", new C5604wc(new C5370h7()));
        b4Var.mo33123c("13", new C5604wc(new C5430l7()));
        b4Var.mo33123c("47", new C5604wc(new C5445m7()));
        b4Var.mo33123c("15", new C5604wc(new C5460n7()));
        b4Var.mo33123c("48", new C5604wc(new C5478o7(this)));
        C5493p7 p7Var = new C5493p7();
        b4Var.mo33123c("16", new C5604wc(p7Var));
        b4Var.mo33123c("17", new C5604wc(p7Var));
        b4Var.mo33123c("22", new C5604wc(new C5523r7()));
        b4Var.mo33123c("45", new C5604wc(new C5538s7()));
        b4Var.mo33123c("46", new C5604wc(new C5554t7()));
        b4Var.mo33123c("36", new C5604wc(new C5569u7()));
        b4Var.mo33123c("43", new C5604wc(new C5584v7()));
        b4Var.mo33123c("38", new C5604wc(new C5599w7()));
        b4Var.mo33123c("44", new C5604wc(new C5613x7()));
        b4Var.mo33123c("41", new C5604wc(new C5627y7()));
        b4Var.mo33123c("42", new C5604wc(new C5641z7()));
        m8582e(C5256a.CONTAINS, new C5448ma());
        m8582e(C5256a.ENDS_WITH, new C5463na());
        m8582e(C5256a.EQUALS, new C5481oa());
        m8582e(C5256a.GREATER_EQUALS, new C5496pa());
        m8582e(C5256a.GREATER_THAN, new C5526ra());
        m8582e(C5256a.LESS_EQUALS, new C5541sa());
        m8582e(C5256a.LESS_THAN, new C5557ta());
        m8582e(C5256a.REGEX, new C5587va());
        m8582e(C5256a.STARTS_WITH, new C5602wa());
        bdVar.mo33499b("advertiserId", new C5604wc(new C5341f9(context)));
        bdVar.mo33499b("advertiserTrackingEnabled", new C5604wc(new C5356g9(context)));
        bdVar.mo33499b("adwordsClickReferrer", new C5604wc(new C5372h9(context, w3Var)));
        bdVar.mo33499b("applicationId", new C5604wc(new C5387i9(context)));
        bdVar.mo33499b("applicationName", new C5604wc(new C5402j9(context)));
        bdVar.mo33499b("applicationVersion", new C5604wc(new C5417k9(context)));
        bdVar.mo33499b("applicationVersionName", new C5604wc(new C5432l9(context)));
        bdVar.mo33499b("arbitraryPixieMacro", new C5604wc(new C5296c9(1, b4Var)));
        bdVar.mo33499b("carrier", new C5604wc(new C5447m9(context)));
        bdVar.mo33499b("constant", new C5604wc(new C5569u7()));
        bdVar.mo33499b("containerId", new C5604wc(new C5462n9(new C5315dd(str))));
        bdVar.mo33499b("containerVersion", new C5604wc(new C5462n9(new C5315dd(ccVar.mo33159a()))));
        bdVar.mo33499b("customMacro", new C5604wc(new C5266a9(new C5623y3(this, (C5595w3) null))));
        bdVar.mo33499b("deviceBrand", new C5604wc(new C5510q9()));
        bdVar.mo33499b("deviceId", new C5604wc(new C5525r9(context)));
        bdVar.mo33499b("deviceModel", new C5604wc(new C5540s9()));
        bdVar.mo33499b("deviceName", new C5604wc(new C5556t9()));
        bdVar.mo33499b("encode", new C5604wc(new C5571u9()));
        bdVar.mo33499b("encrypt", new C5604wc(new C5586v9()));
        bdVar.mo33499b(NotificationCompat.CATEGORY_EVENT, new C5604wc(new C5480o9()));
        bdVar.mo33499b("eventParameters", new C5604wc(new C5601w9(w3Var)));
        bdVar.mo33499b("version", new C5604wc(new C5615x9()));
        bdVar.mo33499b("hashcode", new C5604wc(new C5629y9()));
        bdVar.mo33499b("installReferrer", new C5604wc(new C5643z9(context)));
        bdVar.mo33499b("join", new C5604wc(new C5267aa()));
        bdVar.mo33499b("language", new C5604wc(new C5282ba()));
        bdVar.mo33499b("locale", new C5604wc(new C5297ca()));
        bdVar.mo33499b("adWordsUniqueId", new C5604wc(new C5327ea(context)));
        bdVar.mo33499b("osVersion", new C5604wc(new C5342fa()));
        bdVar.mo33499b("platform", new C5604wc(new C5357ga()));
        bdVar.mo33499b("random", new C5604wc(new C5373ha()));
        bdVar.mo33499b("regexGroup", new C5604wc(new C5388ia()));
        bdVar.mo33499b("resolution", new C5604wc(new C5418ka(context)));
        bdVar.mo33499b("runtimeVersion", new C5604wc(new C5403ja()));
        bdVar.mo33499b("sdkVersion", new C5604wc(new C5433la()));
        this.f6384k = new C5495p9();
        bdVar.mo33499b("currentTime", new C5604wc(this.f6384k));
        bdVar.mo33499b("userProperty", new C5604wc(new C5312da(context, w3Var)));
        bdVar.mo33499b("arbitraryPixel", new C5604wc(new C5644za(C5533s2.m8487a(context))));
        bdVar.mo33499b("customTag", new C5604wc(new C5266a9(new C5609x3(this, (C5595w3) null))));
        bdVar.mo33499b("universalAnalytics", new C5604wc(new C5268ab(context, (C5637z3) w3Var)));
        bdVar.mo33499b("queueRequest", new C5604wc(new C5616xa(C5533s2.m8487a(context))));
        bdVar.mo33499b("sendMeasurement", new C5604wc(new C5630ya(lVar, w3Var)));
        bdVar.mo33499b("arbitraryPixieTag", new C5604wc(new C5296c9(0, b4Var)));
        bdVar.mo33499b("suppressPassthrough", new C5604wc(new C5326e9(context, w3Var)));
        bdVar2.mo33499b("decodeURI", new C5604wc(new C5585v8()));
        bdVar2.mo33499b("decodeURIComponent", new C5604wc(new C5600w8()));
        bdVar2.mo33499b("encodeURI", new C5604wc(new C5614x8()));
        bdVar2.mo33499b("encodeURIComponent", new C5604wc(new C5628y8()));
        bdVar2.mo33499b("log", new C5604wc(new C5311d9()));
        bdVar2.mo33499b("isArray", new C5604wc(new C5642z8()));
        for (C5476o5 next : kcVar.mo33322a()) {
            next.mo33427d(this.f6379f);
            this.f6379f.mo33123c(next.mo33426c(), new C5604wc(next));
        }
        C5285bd bdVar3 = new C5285bd(new HashMap(1));
        bdVar3.mo33499b("mobile", this.f6380g);
        bdVar3.mo33499b("common", this.f6381h);
        this.f6379f.mo33123c("gtmUtils", bdVar3);
        C5285bd bdVar4 = new C5285bd(new HashMap((Map) this.f6380g.mo33142a()));
        bdVar4.mo33149j();
        C5285bd bdVar5 = new C5285bd(new HashMap((Map) this.f6381h.mo33142a()));
        bdVar5.mo33149j();
        if (this.f6379f.mo33121a("main") && (this.f6379f.mo33125e("main") instanceof C5604wc)) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(bdVar3);
            C5345fd.m7938b(this.f6379f, new C5300cd("main", arrayList));
        }
        this.f6380g.mo33499b("base", bdVar4);
        this.f6381h.mo33499b("base", bdVar5);
        bdVar3.mo33149j();
        this.f6380g.mo33149j();
        this.f6381h.mo33149j();
    }

    /* renamed from: c */
    private final C5528rc<?> m8580c(C5329ec ecVar) {
        this.f6382i.clear();
        try {
            C5528rc<?> m = m8588m(m8587l(ecVar.mo33194a()));
            if (m instanceof C5574uc) {
                return m;
            }
            C5503q2.m8408a("Predicate must return a boolean value", this.f6374a);
            return new C5574uc(Boolean.FALSE);
        } catch (IllegalStateException unused) {
            C5426l3.m8135e("Error evaluating predicate.");
            return C5618xc.f6731g;
        }
    }

    /* renamed from: d */
    private final C5528rc<?> m8581d(C5465nc ncVar) {
        switch (ncVar.mo33388a()) {
            case 1:
                try {
                    return new C5589vc(Double.valueOf(Double.parseDouble((String) ncVar.mo33389b())));
                } catch (NumberFormatException unused) {
                    return new C5315dd((String) ncVar.mo33389b());
                }
            case 2:
                List<C5465nc> list = (List) ncVar.mo33389b();
                ArrayList arrayList = new ArrayList(list.size());
                for (C5465nc d : list) {
                    arrayList.add(m8581d(d));
                }
                return new C5632yc(arrayList);
            case 3:
                Map map = (Map) ncVar.mo33389b();
                HashMap hashMap = new HashMap(map.size());
                for (Map.Entry entry : map.entrySet()) {
                    C5528rc<?> d2 = m8581d((C5465nc) entry.getKey());
                    hashMap.put(C5506q5.m8420g(d2), m8581d((C5465nc) entry.getValue()));
                }
                return new C5285bd(hashMap);
            case 4:
                C5528rc<?> i = m8584i((String) ncVar.mo33389b());
                if (!(i instanceof C5315dd) || ncVar.mo33390c().isEmpty()) {
                    return i;
                }
                String str = (String) ((C5315dd) i).mo33142a();
                for (Integer intValue : ncVar.mo33390c()) {
                    int intValue2 = intValue.intValue();
                    if (intValue2 != 12) {
                        StringBuilder sb = new StringBuilder(39);
                        sb.append("Unsupported Value Escaping: ");
                        sb.append(intValue2);
                        C5426l3.m8135e(sb.toString());
                    } else {
                        str = m8585j(str);
                    }
                }
                return new C5315dd(str);
            case 5:
                return new C5315dd((String) ncVar.mo33389b());
            case 6:
                return new C5589vc(Double.valueOf(((Integer) ncVar.mo33389b()).doubleValue()));
            case 7:
                StringBuilder sb2 = new StringBuilder();
                for (C5465nc d3 : (List) ncVar.mo33389b()) {
                    sb2.append(C5506q5.m8420g(m8581d(d3)));
                }
                return new C5315dd(sb2.toString());
            case 8:
                return new C5574uc((Boolean) ncVar.mo33389b());
            default:
                int a = ncVar.mo33388a();
                StringBuilder sb3 = new StringBuilder(52);
                sb3.append("Attempting to expand unknown Value type ");
                sb3.append(a);
                sb3.append(".");
                throw new IllegalStateException(sb3.toString());
        }
    }

    /* renamed from: e */
    private final void m8582e(C5256a aVar, C5491p5 p5Var) {
        this.f6380g.mo33499b(C5443m5.m8188b(aVar), new C5604wc(p5Var));
    }

    /* renamed from: i */
    private final C5528rc<?> m8584i(String str) {
        this.f6383j++;
        String n = m8589n();
        StringBuilder sb = new StringBuilder(String.valueOf(n).length() + 31 + String.valueOf(str).length());
        sb.append(n);
        sb.append("Beginning to evaluate variable ");
        sb.append(str);
        C5426l3.m8133c(sb.toString());
        if (!this.f6382i.contains(str)) {
            this.f6382i.add(str);
            C5329ec b = this.f6376c.mo33160b(str);
            if (b != null) {
                C5528rc<?> m = m8588m(m8587l(b.mo33194a()));
                String n2 = m8589n();
                StringBuilder sb2 = new StringBuilder(String.valueOf(n2).length() + 25 + String.valueOf(str).length());
                sb2.append(n2);
                sb2.append("Done evaluating variable ");
                sb2.append(str);
                C5426l3.m8133c(sb2.toString());
                this.f6383j--;
                this.f6382i.remove(str);
                return m;
            }
            this.f6383j--;
            this.f6382i.remove(str);
            String n3 = m8589n();
            StringBuilder sb3 = new StringBuilder(String.valueOf(n3).length() + 36 + String.valueOf(str).length());
            sb3.append(n3);
            sb3.append("Attempting to resolve unknown macro ");
            sb3.append(str);
            throw new IllegalStateException(sb3.toString());
        }
        this.f6383j--;
        String obj = this.f6382i.toString();
        StringBuilder sb4 = new StringBuilder(String.valueOf(str).length() + 77 + String.valueOf(obj).length());
        sb4.append("Macro cycle detected.  Current macro reference: ");
        sb4.append(str);
        sb4.append(". Previous macro references: ");
        sb4.append(obj);
        throw new IllegalStateException(sb4.toString());
    }

    /* renamed from: j */
    private static String m8585j(String str) {
        try {
            return URLEncoder.encode(str, Constants.ENCODING).replaceAll("\\+", "%20");
        } catch (UnsupportedEncodingException e) {
            C5426l3.m8132b("Escape URI: unsupported encoding", e);
            return str;
        }
    }

    /* renamed from: k */
    private final C5300cd m8586k(String str, Map<String, C5528rc<?>> map) {
        try {
            return C5443m5.m8187a(str, map, this.f6379f);
        } catch (RuntimeException e) {
            String message = e.getMessage();
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 30 + String.valueOf(message).length());
            sb.append("Incorrect keys for function ");
            sb.append(str);
            sb.append(". ");
            sb.append(message);
            C5426l3.m8135e(sb.toString());
            return null;
        }
    }

    /* renamed from: l */
    private final Map<String, C5528rc<?>> m8587l(Map<String, C5465nc> map) {
        HashMap hashMap = new HashMap();
        for (Map.Entry next : map.entrySet()) {
            hashMap.put((String) next.getKey(), m8581d((C5465nc) next.getValue()));
        }
        return hashMap;
    }

    /* renamed from: m */
    private final C5528rc m8588m(Map<String, C5528rc<?>> map) {
        C5300cd cdVar;
        String str;
        boolean z;
        if (map == null) {
            C5503q2.m8408a("executeFunctionCall: cannot access the function parameters.", this.f6374a);
            return C5618xc.f6732h;
        }
        C5528rc rcVar = map.get(C5605x.FUNCTION.toString());
        if (!(rcVar instanceof C5315dd)) {
            C5503q2.m8408a("No function id in properties", this.f6374a);
            return C5618xc.f6732h;
        }
        String str2 = (String) ((C5315dd) rcVar).mo33142a();
        if (this.f6379f.mo33121a(str2)) {
            HashMap hashMap = new HashMap();
            for (Map.Entry next : map.entrySet()) {
                if (((String) next.getKey()).startsWith("vtp_")) {
                    hashMap.put(((String) next.getKey()).substring(4), (C5528rc) next.getValue());
                }
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(new C5285bd(hashMap));
            cdVar = new C5300cd(str2, arrayList);
        } else {
            String c = C5443m5.m8189c(str2);
            if (c == null || !this.f6380g.mo33500c(c)) {
                z = false;
            } else {
                z = true;
            }
            if (z) {
                cdVar = m8586k(str2, map);
            } else {
                StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 30);
                sb.append("functionId '");
                sb.append(str2);
                sb.append("' is not supported");
                C5503q2.m8408a(sb.toString(), this.f6374a);
                return C5618xc.f6732h;
            }
        }
        if (cdVar == null) {
            C5503q2.m8408a("Internal error: failed to convert function to a valid statement", this.f6374a);
            return C5618xc.f6732h;
        }
        String valueOf = String.valueOf(cdVar.mo33163i());
        if (valueOf.length() != 0) {
            str = "Executing: ".concat(valueOf);
        } else {
            str = new String("Executing: ");
        }
        C5426l3.m8133c(str);
        C5528rc b = C5345fd.m7938b(this.f6379f, cdVar);
        if (!(b instanceof C5618xc)) {
            return b;
        }
        C5618xc xcVar = (C5618xc) b;
        if (xcVar.mo33621i()) {
            return (C5528rc) xcVar.mo33142a();
        }
        return b;
    }

    /* renamed from: n */
    private final String m8589n() {
        if (this.f6383j <= 1) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        sb.append(Integer.toString(this.f6383j));
        for (int i = 2; i < this.f6383j; i++) {
            sb.append(' ');
        }
        sb.append(": ");
        return sb.toString();
    }

    /* renamed from: a */
    public final void mo33577a() {
        C5533s2.m8487a(this.f6374a).mo33510k();
    }

    /* renamed from: g */
    public final void mo33578g(C5564u2 u2Var) {
        boolean z;
        C5528rc<?> ucVar;
        this.f6379f.mo33123c("gtm.globals.eventName", new C5315dd(u2Var.mo33551e()));
        this.f6384k.mo33451b(u2Var);
        this.f6385l = u2Var;
        HashSet<C5329ec> hashSet = new HashSet<>();
        HashSet hashSet2 = new HashSet();
        HashMap hashMap = new HashMap();
        for (C5375hc next : this.f6376c.mo33161c()) {
            if (!next.mo33242c().isEmpty() || !next.mo33243d().isEmpty()) {
                String valueOf = String.valueOf(next);
                StringBuilder sb = new StringBuilder(valueOf.length() + 19);
                sb.append("Evaluating trigger ");
                sb.append(valueOf);
                C5426l3.m8133c(sb.toString());
                Iterator<C5329ec> it = next.mo33241b().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        Iterator<C5329ec> it2 = next.mo33240a().iterator();
                        while (true) {
                            if (!it2.hasNext()) {
                                ucVar = new C5574uc(Boolean.TRUE);
                                break;
                            }
                            C5329ec next2 = it2.next();
                            C5528rc<?> rcVar = (C5528rc) hashMap.get(next2);
                            if (rcVar == null) {
                                rcVar = m8580c(next2);
                                hashMap.put(next2, rcVar);
                            }
                            ucVar = C5618xc.f6731g;
                            if (rcVar != ucVar) {
                                if (!((Boolean) ((C5574uc) rcVar).mo33142a()).booleanValue()) {
                                    ucVar = new C5574uc(Boolean.FALSE);
                                    break;
                                }
                            } else {
                                break;
                            }
                        }
                    } else {
                        C5329ec next3 = it.next();
                        C5528rc<?> rcVar2 = (C5528rc) hashMap.get(next3);
                        if (rcVar2 == null) {
                            rcVar2 = m8580c(next3);
                            hashMap.put(next3, rcVar2);
                        }
                        ucVar = C5618xc.f6731g;
                        if (rcVar2 != ucVar) {
                            if (((Boolean) ((C5574uc) rcVar2).mo33142a()).booleanValue()) {
                                ucVar = new C5574uc(Boolean.FALSE);
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                }
                if (ucVar == C5618xc.f6731g) {
                    String valueOf2 = String.valueOf(next);
                    StringBuilder sb2 = new StringBuilder(valueOf2.length() + 41);
                    sb2.append("Error encounted while evaluating trigger ");
                    sb2.append(valueOf2);
                    C5503q2.m8410c(sb2.toString(), this.f6374a);
                    if (!next.mo33243d().isEmpty()) {
                        String valueOf3 = String.valueOf(next.mo33243d());
                        StringBuilder sb3 = new StringBuilder(valueOf3.length() + 15);
                        sb3.append("Blocking tags: ");
                        sb3.append(valueOf3);
                        C5426l3.m8133c(sb3.toString());
                        hashSet2.addAll(next.mo33243d());
                    }
                } else if (((Boolean) ((C5574uc) ucVar).mo33142a()).booleanValue()) {
                    String valueOf4 = String.valueOf(next);
                    StringBuilder sb4 = new StringBuilder(valueOf4.length() + 19);
                    sb4.append("Trigger is firing: ");
                    sb4.append(valueOf4);
                    C5426l3.m8133c(sb4.toString());
                    if (!next.mo33242c().isEmpty()) {
                        String valueOf5 = String.valueOf(next.mo33242c());
                        StringBuilder sb5 = new StringBuilder(valueOf5.length() + 34);
                        sb5.append("Adding tags to firing candidates: ");
                        sb5.append(valueOf5);
                        C5426l3.m8133c(sb5.toString());
                        hashSet.addAll(next.mo33242c());
                    }
                    if (!next.mo33243d().isEmpty()) {
                        String valueOf6 = String.valueOf(next.mo33243d());
                        StringBuilder sb6 = new StringBuilder(valueOf6.length() + 24);
                        sb6.append("Blocking disabled tags: ");
                        sb6.append(valueOf6);
                        C5426l3.m8133c(sb6.toString());
                        hashSet2.addAll(next.mo33243d());
                    }
                }
            } else {
                String valueOf7 = String.valueOf(next);
                StringBuilder sb7 = new StringBuilder(valueOf7.length() + 64);
                sb7.append("Trigger is not being evaluated since it has no associated tags: ");
                sb7.append(valueOf7);
                C5426l3.m8133c(sb7.toString());
            }
        }
        hashSet.removeAll(hashSet2);
        boolean z2 = false;
        for (C5329ec ecVar : hashSet) {
            this.f6382i.clear();
            String valueOf8 = String.valueOf(ecVar);
            StringBuilder sb8 = new StringBuilder(valueOf8.length() + 21);
            sb8.append("Executing firing tag ");
            sb8.append(valueOf8);
            C5426l3.m8133c(sb8.toString());
            try {
                m8588m(m8587l(ecVar.mo33194a()));
                C5465nc ncVar = ecVar.mo33194a().get(C5605x.DISPATCH_ON_FIRE.toString());
                if (ncVar == null || ncVar.mo33388a() != 8 || !((Boolean) ncVar.mo33389b()).booleanValue()) {
                    z = false;
                } else {
                    z = true;
                }
                if (z) {
                    try {
                        String valueOf9 = String.valueOf(ecVar);
                        StringBuilder sb9 = new StringBuilder(valueOf9.length() + 36);
                        sb9.append("Tag configured to dispatch on fire: ");
                        sb9.append(valueOf9);
                        C5426l3.m8133c(sb9.toString());
                        z2 = true;
                    } catch (IllegalStateException e) {
                        e = e;
                        z2 = true;
                        String valueOf10 = String.valueOf(ecVar);
                        StringBuilder sb10 = new StringBuilder(valueOf10.length() + 19);
                        sb10.append("Error firing tag ");
                        sb10.append(valueOf10);
                        sb10.append(": ");
                        C5503q2.m8409b(sb10.toString(), e, this.f6374a);
                    }
                }
            } catch (IllegalStateException e2) {
                e = e2;
                String valueOf102 = String.valueOf(ecVar);
                StringBuilder sb102 = new StringBuilder(valueOf102.length() + 19);
                sb102.append("Error firing tag ");
                sb102.append(valueOf102);
                sb102.append(": ");
                C5503q2.m8409b(sb102.toString(), e, this.f6374a);
            }
        }
        this.f6379f.mo33122b("gtm.globals.eventName");
        if (u2Var.mo33554h()) {
            String e3 = u2Var.mo33551e();
            StringBuilder sb11 = new StringBuilder(String.valueOf(e3).length() + 35);
            sb11.append("Log passthrough event ");
            sb11.append(e3);
            sb11.append(" to Firebase.");
            C5426l3.m8133c(sb11.toString());
            try {
                this.f6377d.mo35447z0(u2Var.mo33553g(), u2Var.mo33551e(), u2Var.mo33552f(), u2Var.mo33547a());
            } catch (RemoteException e4) {
                C5503q2.m8409b("Error calling measurement proxy: ", e4, this.f6374a);
            }
        } else {
            String e5 = u2Var.mo33551e();
            StringBuilder sb12 = new StringBuilder(String.valueOf(e5).length() + 63);
            sb12.append("Non-passthrough event ");
            sb12.append(e5);
            sb12.append(" doesn't get logged to Firebase directly.");
            C5426l3.m8133c(sb12.toString());
        }
        if (z2) {
            C5426l3.m8133c("Dispatch called for dispatchOnFire tags.");
            mo33577a();
        }
    }

    /* renamed from: h */
    public final C5528rc<?> mo33579h(String str) {
        if (!this.f6382i.contains(str)) {
            this.f6383j = 0;
            return m8584i(str);
        }
        String obj = this.f6382i.toString();
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 77 + String.valueOf(obj).length());
        sb.append("Macro cycle detected.  Current macro reference: ");
        sb.append(str);
        sb.append(". Previous macro references: ");
        sb.append(obj);
        throw new IllegalStateException(sb.toString());
    }
}
