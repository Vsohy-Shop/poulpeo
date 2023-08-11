package com.google.android.gms.internal.gtm;

import android.text.TextUtils;
import androidx.exifinterface.media.ExifInterface;
import java.util.ArrayList;
import java.util.List;
import p231t4.C9713p;

/* renamed from: com.google.android.gms.internal.gtm.q5 */
public final class C5506q5 {
    /* renamed from: a */
    public static double m8414a(C5528rc<?> rcVar, C5528rc<?> rcVar2) {
        boolean z;
        boolean z2 = true;
        if (rcVar != null) {
            z = true;
        } else {
            z = false;
        }
        C9713p.m20266a(z);
        if (rcVar2 == null) {
            z2 = false;
        }
        C9713p.m20266a(z2);
        double c = m8416c(rcVar);
        double c2 = m8416c(rcVar2);
        if (Double.isNaN(c) || Double.isNaN(c2)) {
            return Double.NaN;
        }
        if ((c == Double.POSITIVE_INFINITY && c2 == Double.NEGATIVE_INFINITY) || (c == Double.NEGATIVE_INFINITY && c2 == Double.POSITIVE_INFINITY)) {
            return Double.NaN;
        }
        if (Double.isInfinite(c) && !Double.isInfinite(c2)) {
            return c;
        }
        if (Double.isInfinite(c) || !Double.isInfinite(c2)) {
            return c + c2;
        }
        return c2;
    }

    /* renamed from: b */
    public static boolean m8415b(C5528rc<?> rcVar) {
        boolean z;
        if (rcVar != null) {
            z = true;
        } else {
            z = false;
        }
        C9713p.m20266a(z);
        if (rcVar == C5618xc.f6732h || rcVar == C5618xc.f6731g) {
            return false;
        }
        if (rcVar instanceof C5574uc) {
            return ((Boolean) ((C5574uc) rcVar).mo33142a()).booleanValue();
        }
        if (rcVar instanceof C5589vc) {
            C5589vc vcVar = (C5589vc) rcVar;
            if (((Double) vcVar.mo33142a()).doubleValue() == 0.0d || ((Double) vcVar.mo33142a()).doubleValue() == -0.0d || Double.isNaN(((Double) vcVar.mo33142a()).doubleValue())) {
                return false;
            }
        } else if (rcVar instanceof C5315dd) {
            if (((String) ((C5315dd) rcVar).mo33142a()).isEmpty()) {
                return false;
            }
        } else if (m8423j(rcVar)) {
            String rcVar2 = rcVar.toString();
            StringBuilder sb = new StringBuilder(String.valueOf(rcVar2).length() + 33);
            sb.append("Illegal type given to isTruthy: ");
            sb.append(rcVar2);
            sb.append(".");
            throw new IllegalArgumentException(sb.toString());
        }
        return true;
    }

    /* renamed from: c */
    public static double m8416c(C5528rc<?> rcVar) {
        boolean z;
        while (true) {
            if (rcVar != null) {
                z = true;
            } else {
                z = false;
            }
            C9713p.m20266a(z);
            if (rcVar == C5618xc.f6732h) {
                return Double.NaN;
            }
            if (rcVar == C5618xc.f6731g) {
                return 0.0d;
            }
            if (rcVar instanceof C5574uc) {
                if (((Boolean) ((C5574uc) rcVar).mo33142a()).booleanValue()) {
                    return 1.0d;
                }
                return 0.0d;
            } else if (rcVar instanceof C5589vc) {
                return ((Double) ((C5589vc) rcVar).mo33142a()).doubleValue();
            } else {
                if (rcVar instanceof C5632yc) {
                    C5632yc ycVar = (C5632yc) rcVar;
                    if (!((List) ycVar.mo33142a()).isEmpty()) {
                        if (((List) ycVar.mo33142a()).size() != 1) {
                            break;
                        }
                        rcVar = new C5315dd(m8420g(ycVar.mo33627l(0)));
                    } else {
                        return 0.0d;
                    }
                } else if (rcVar instanceof C5315dd) {
                    C5315dd ddVar = (C5315dd) rcVar;
                    if (((String) ddVar.mo33142a()).isEmpty()) {
                        return 0.0d;
                    }
                    try {
                        return Double.parseDouble((String) ddVar.mo33142a());
                    } catch (NumberFormatException unused) {
                        return Double.NaN;
                    }
                }
            }
        }
        if (!m8423j(rcVar)) {
            return Double.NaN;
        }
        String rcVar2 = rcVar.toString();
        StringBuilder sb = new StringBuilder(String.valueOf(rcVar2).length() + 41);
        sb.append("Illegal type given to numberEquivalent: ");
        sb.append(rcVar2);
        sb.append(".");
        throw new IllegalArgumentException(sb.toString());
    }

    /* renamed from: d */
    public static boolean m8417d(C5528rc<?> rcVar, C5528rc<?> rcVar2) {
        boolean z;
        boolean z2;
        if (rcVar != null) {
            z = true;
        } else {
            z = false;
        }
        C9713p.m20266a(z);
        if (rcVar2 != null) {
            z2 = true;
        } else {
            z2 = false;
        }
        C9713p.m20266a(z2);
        if (m8423j(rcVar)) {
            String rcVar3 = rcVar.toString();
            StringBuilder sb = new StringBuilder(String.valueOf(rcVar3).length() + 50);
            sb.append("Illegal type given to abstractRelationalCompare: ");
            sb.append(rcVar3);
            sb.append(".");
            throw new IllegalArgumentException(sb.toString());
        } else if (!m8423j(rcVar2)) {
            if ((rcVar instanceof C5285bd) || (rcVar instanceof C5632yc) || (rcVar instanceof C5604wc)) {
                rcVar = new C5315dd(m8420g(rcVar));
            }
            if ((rcVar2 instanceof C5285bd) || (rcVar2 instanceof C5632yc) || (rcVar2 instanceof C5604wc)) {
                rcVar2 = new C5315dd(m8420g(rcVar2));
            }
            if (!(rcVar instanceof C5315dd) || !(rcVar2 instanceof C5315dd)) {
                double c = m8416c(rcVar);
                double c2 = m8416c(rcVar2);
                if (Double.isNaN(c) || Double.isNaN(c2) || ((c == 0.0d && c2 == -0.0d) || ((c == -0.0d && c2 == 0.0d) || c == Double.POSITIVE_INFINITY))) {
                    return false;
                }
                if (c2 == Double.POSITIVE_INFINITY) {
                    return true;
                }
                if (c2 == Double.NEGATIVE_INFINITY) {
                    return false;
                }
                if (c != Double.NEGATIVE_INFINITY && Double.compare(c, c2) >= 0) {
                    return false;
                }
                return true;
            } else if (((String) ((C5315dd) rcVar).mo33142a()).compareTo((String) ((C5315dd) rcVar2).mo33142a()) < 0) {
                return true;
            } else {
                return false;
            }
        } else {
            String rcVar4 = rcVar2.toString();
            StringBuilder sb2 = new StringBuilder(String.valueOf(rcVar4).length() + 50);
            sb2.append("Illegal type given to abstractRelationalCompare: ");
            sb2.append(rcVar4);
            sb2.append(".");
            throw new IllegalArgumentException(sb2.toString());
        }
    }

    /* renamed from: e */
    public static double m8418e(C5528rc<?> rcVar) {
        double c = m8416c(rcVar);
        if (Double.isNaN(c)) {
            return 0.0d;
        }
        if (c == 0.0d || c == -0.0d || Double.isInfinite(c)) {
            return c;
        }
        return Math.signum(c) * Math.floor(Math.abs(c));
    }

    /* renamed from: f */
    public static boolean m8419f(C5528rc<?> rcVar, C5528rc<?> rcVar2) {
        boolean z;
        boolean z2;
        C5528rc<?> rcVar3;
        C5528rc<?> ddVar;
        while (true) {
            if (rcVar != null) {
                z = true;
            } else {
                z = false;
            }
            C9713p.m20266a(z);
            if (rcVar2 != null) {
                z2 = true;
            } else {
                z2 = false;
            }
            C9713p.m20266a(z2);
            if (m8423j(rcVar)) {
                String rcVar4 = rcVar.toString();
                StringBuilder sb = new StringBuilder(String.valueOf(rcVar4).length() + 48);
                sb.append("Illegal type given to abstractEqualityCompare: ");
                sb.append(rcVar4);
                sb.append(".");
                throw new IllegalArgumentException(sb.toString());
            } else if (!m8423j(rcVar2)) {
                String i = m8422i(rcVar);
                String i2 = m8422i(rcVar2);
                if (i.equals(i2)) {
                    char c = 65535;
                    switch (i.hashCode()) {
                        case -1950496919:
                            if (i.equals("Number")) {
                                c = 0;
                                break;
                            }
                            break;
                        case -1939501217:
                            if (i.equals("Object")) {
                                c = 1;
                                break;
                            }
                            break;
                        case -1808118735:
                            if (i.equals("String")) {
                                c = 2;
                                break;
                            }
                            break;
                        case 2439591:
                            if (i.equals("Null")) {
                                c = 3;
                                break;
                            }
                            break;
                        case 965837104:
                            if (i.equals("Undefined")) {
                                c = 4;
                                break;
                            }
                            break;
                        case 1729365000:
                            if (i.equals("Boolean")) {
                                c = 5;
                                break;
                            }
                            break;
                    }
                    switch (c) {
                        case 0:
                            double doubleValue = ((Double) ((C5589vc) rcVar).mo33142a()).doubleValue();
                            double doubleValue2 = ((Double) ((C5589vc) rcVar2).mo33142a()).doubleValue();
                            if (Double.isNaN(doubleValue) || Double.isNaN(doubleValue2) || doubleValue != doubleValue2) {
                                return false;
                            }
                            return true;
                        case 1:
                            if (rcVar == rcVar2) {
                                return true;
                            }
                            return false;
                        case 2:
                            return ((String) ((C5315dd) rcVar).mo33142a()).equals((String) ((C5315dd) rcVar2).mo33142a());
                        case 3:
                        case 4:
                            return true;
                        case 5:
                            if (((Boolean) ((C5574uc) rcVar).mo33142a()) == ((Boolean) ((C5574uc) rcVar2).mo33142a())) {
                                return true;
                            }
                            return false;
                        default:
                            return false;
                    }
                } else {
                    C5618xc xcVar = C5618xc.f6732h;
                    if ((rcVar == xcVar || rcVar == C5618xc.f6731g) && (rcVar2 == xcVar || rcVar2 == C5618xc.f6731g)) {
                        return true;
                    }
                    if (!i.equals("Number") || !i2.equals("String")) {
                        if (i.equals("String") && i2.equals("Number")) {
                            rcVar3 = new C5589vc(Double.valueOf(m8416c(rcVar)));
                        } else if (i.equals("Boolean")) {
                            rcVar3 = new C5589vc(Double.valueOf(m8416c(rcVar)));
                        } else if (i2.equals("Boolean")) {
                            ddVar = new C5589vc(Double.valueOf(m8416c(rcVar2)));
                        } else if ((i.equals("String") || i.equals("Number")) && i2.equals("Object")) {
                            ddVar = new C5315dd(m8420g(rcVar2));
                        } else if (!i.equals("Object") || (!i2.equals("String") && !i2.equals("Number"))) {
                            return false;
                        } else {
                            rcVar3 = new C5315dd(m8420g(rcVar));
                        }
                        rcVar = rcVar3;
                    } else {
                        ddVar = new C5589vc(Double.valueOf(m8416c(rcVar2)));
                    }
                    rcVar2 = ddVar;
                }
            } else {
                String rcVar5 = rcVar2.toString();
                StringBuilder sb2 = new StringBuilder(String.valueOf(rcVar5).length() + 48);
                sb2.append("Illegal type given to abstractEqualityCompare: ");
                sb2.append(rcVar5);
                sb2.append(".");
                throw new IllegalArgumentException(sb2.toString());
            }
        }
        return false;
    }

    /* renamed from: g */
    public static String m8420g(C5528rc<?> rcVar) {
        boolean z;
        String str;
        if (rcVar != null) {
            z = true;
        } else {
            z = false;
        }
        C9713p.m20266a(z);
        if (rcVar == C5618xc.f6732h) {
            return "undefined";
        }
        if (rcVar == C5618xc.f6731g) {
            return "null";
        }
        if (rcVar instanceof C5574uc) {
            if (((Boolean) ((C5574uc) rcVar).mo33142a()).booleanValue()) {
                return "true";
            }
            return "false";
        } else if (rcVar instanceof C5589vc) {
            String d = Double.toString(((Double) ((C5589vc) rcVar).mo33142a()).doubleValue());
            int indexOf = d.indexOf(ExifInterface.LONGITUDE_EAST);
            if (indexOf > 0) {
                int parseInt = Integer.parseInt(d.substring(indexOf + 1, d.length()));
                if (parseInt < 0) {
                    if (parseInt <= -7) {
                        return d.replace(ExifInterface.LONGITUDE_EAST, "e");
                    }
                    String replace = d.substring(0, indexOf).replace(".", "");
                    StringBuilder sb = new StringBuilder();
                    sb.append("0.");
                    while (true) {
                        parseInt++;
                        if (parseInt < 0) {
                            sb.append("0");
                        } else {
                            sb.append(replace);
                            return sb.toString();
                        }
                    }
                } else if (parseInt >= 21) {
                    return d.replace(ExifInterface.LONGITUDE_EAST, "e+");
                } else {
                    String replace2 = d.substring(0, indexOf).replace(".", "");
                    int length = (parseInt + 1) - (replace2.length() - (replace2.startsWith("-") ? 1 : 0));
                    StringBuilder sb2 = new StringBuilder();
                    if (length < 0) {
                        int length2 = replace2.length() + length;
                        sb2.append(replace2.substring(0, length2));
                        sb2.append(".");
                        sb2.append(replace2.substring(length2, replace2.length()));
                    } else {
                        sb2.append(replace2);
                        while (length > 0) {
                            sb2.append("0");
                            length--;
                        }
                    }
                    return sb2.toString();
                }
            } else if (!d.endsWith(".0")) {
                return d;
            } else {
                String substring = d.substring(0, d.length() - 2);
                if (substring.equals("-0")) {
                    return "0";
                }
                return substring;
            }
        } else {
            if (rcVar instanceof C5604wc) {
                C5491p5 p5Var = (C5491p5) ((C5604wc) rcVar).mo33142a();
                if (p5Var instanceof C5476o5) {
                    return ((C5476o5) p5Var).mo33426c();
                }
            } else if (rcVar instanceof C5632yc) {
                ArrayList arrayList = new ArrayList();
                for (C5528rc rcVar2 : (List) ((C5632yc) rcVar).mo33142a()) {
                    if (rcVar2 == C5618xc.f6731g || rcVar2 == C5618xc.f6732h) {
                        arrayList.add("");
                    } else {
                        arrayList.add(m8420g(rcVar2));
                    }
                }
                return TextUtils.join(",", arrayList);
            } else if (rcVar instanceof C5285bd) {
                return "[object Object]";
            } else {
                if (rcVar instanceof C5315dd) {
                    return (String) ((C5315dd) rcVar).mo33142a();
                }
            }
            if (m8423j(rcVar)) {
                String rcVar3 = rcVar.toString();
                StringBuilder sb3 = new StringBuilder(String.valueOf(rcVar3).length() + 41);
                sb3.append("Illegal type given to stringEquivalent: ");
                sb3.append(rcVar3);
                sb3.append(".");
                str = sb3.toString();
            } else {
                str = "Unknown type in stringEquivalent.";
            }
            throw new IllegalArgumentException(str);
        }
    }

    /* renamed from: h */
    public static boolean m8421h(C5528rc<?> rcVar, C5528rc<?> rcVar2) {
        boolean z;
        boolean z2;
        if (rcVar != null) {
            z = true;
        } else {
            z = false;
        }
        C9713p.m20266a(z);
        if (rcVar2 != null) {
            z2 = true;
        } else {
            z2 = false;
        }
        C9713p.m20266a(z2);
        if (m8423j(rcVar)) {
            String rcVar3 = rcVar.toString();
            StringBuilder sb = new StringBuilder(String.valueOf(rcVar3).length() + 46);
            sb.append("Illegal type given to strictEqualityCompare: ");
            sb.append(rcVar3);
            sb.append(".");
            throw new IllegalArgumentException(sb.toString());
        } else if (!m8423j(rcVar2)) {
            String i = m8422i(rcVar);
            if (!i.equals(m8422i(rcVar2))) {
                return false;
            }
            char c = 65535;
            switch (i.hashCode()) {
                case -1950496919:
                    if (i.equals("Number")) {
                        c = 0;
                        break;
                    }
                    break;
                case -1808118735:
                    if (i.equals("String")) {
                        c = 1;
                        break;
                    }
                    break;
                case 2439591:
                    if (i.equals("Null")) {
                        c = 2;
                        break;
                    }
                    break;
                case 965837104:
                    if (i.equals("Undefined")) {
                        c = 3;
                        break;
                    }
                    break;
                case 1729365000:
                    if (i.equals("Boolean")) {
                        c = 4;
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                    double doubleValue = ((Double) ((C5589vc) rcVar).mo33142a()).doubleValue();
                    double doubleValue2 = ((Double) ((C5589vc) rcVar2).mo33142a()).doubleValue();
                    if (Double.isNaN(doubleValue) || Double.isNaN(doubleValue2) || doubleValue != doubleValue2) {
                        return false;
                    }
                    return true;
                case 1:
                    if (((String) ((C5315dd) rcVar).mo33142a()).equals((String) ((C5315dd) rcVar2).mo33142a())) {
                        return true;
                    }
                    return false;
                case 2:
                case 3:
                    return true;
                case 4:
                    if (((Boolean) ((C5574uc) rcVar).mo33142a()) == ((Boolean) ((C5574uc) rcVar2).mo33142a())) {
                        return true;
                    }
                    return false;
                default:
                    if (rcVar == rcVar2) {
                        return true;
                    }
                    return false;
            }
        } else {
            String rcVar4 = rcVar2.toString();
            StringBuilder sb2 = new StringBuilder(String.valueOf(rcVar4).length() + 46);
            sb2.append("Illegal type given to strictEqualityCompare: ");
            sb2.append(rcVar4);
            sb2.append(".");
            throw new IllegalArgumentException(sb2.toString());
        }
    }

    /* renamed from: i */
    private static String m8422i(C5528rc<?> rcVar) {
        if (rcVar == C5618xc.f6732h) {
            return "Undefined";
        }
        if (rcVar == C5618xc.f6731g) {
            return "Null";
        }
        if (rcVar instanceof C5574uc) {
            return "Boolean";
        }
        if (rcVar instanceof C5589vc) {
            return "Number";
        }
        if (rcVar instanceof C5315dd) {
            return "String";
        }
        return "Object";
    }

    /* renamed from: j */
    private static boolean m8423j(C5528rc<?> rcVar) {
        if (rcVar instanceof C5300cd) {
            return true;
        }
        if (!(rcVar instanceof C5618xc) || rcVar == C5618xc.f6732h || rcVar == C5618xc.f6731g) {
            return false;
        }
        return true;
    }
}
