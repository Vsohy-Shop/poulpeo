package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.C5838l3;
import com.google.android.gms.internal.measurement.C5950s3;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;
import p231t4.C9713p;

/* renamed from: com.google.android.gms.measurement.internal.y9 */
/* compiled from: com.google.android.gms:play-services-measurement@@20.0.0 */
abstract class C6355y9 {

    /* renamed from: a */
    final String f8415a;

    /* renamed from: b */
    final int f8416b;

    /* renamed from: c */
    Boolean f8417c;

    /* renamed from: d */
    Boolean f8418d;

    /* renamed from: e */
    Long f8419e;

    /* renamed from: f */
    Long f8420f;

    C6355y9(String str, int i) {
        this.f8415a = str;
        this.f8416b = i;
    }

    /* renamed from: d */
    private static Boolean m11225d(String str, int i, boolean z, String str2, List<String> list, String str3, C6206l3 l3Var) {
        int i2;
        if (i == 7) {
            if (list == null || list.size() == 0) {
                return null;
            }
        } else if (str2 == null) {
            return null;
        }
        if (!z && i != 2) {
            str = str.toUpperCase(Locale.ENGLISH);
        }
        switch (i - 1) {
            case 1:
                if (str3 == null) {
                    return null;
                }
                if (true != z) {
                    i2 = 66;
                } else {
                    i2 = 0;
                }
                try {
                    return Boolean.valueOf(Pattern.compile(str3, i2).matcher(str).matches());
                } catch (PatternSyntaxException unused) {
                    if (l3Var != null) {
                        l3Var.mo35080w().mo35038b("Invalid regular expression in REGEXP audience filter. expression", str3);
                    }
                    return null;
                }
            case 2:
                return Boolean.valueOf(str.startsWith(str2));
            case 3:
                return Boolean.valueOf(str.endsWith(str2));
            case 4:
                return Boolean.valueOf(str.contains(str2));
            case 5:
                return Boolean.valueOf(str.equals(str2));
            case 6:
                if (list == null) {
                    return null;
                }
                return Boolean.valueOf(list.contains(str));
            default:
                return null;
        }
    }

    /* renamed from: e */
    static Boolean m11226e(BigDecimal bigDecimal, C5838l3 l3Var, double d) {
        BigDecimal bigDecimal2;
        BigDecimal bigDecimal3;
        BigDecimal bigDecimal4;
        C9713p.m20275j(l3Var);
        if (l3Var.mo34152D()) {
            boolean z = true;
            if (l3Var.mo34157J() != 1) {
                if (l3Var.mo34157J() == 5) {
                    if (!l3Var.mo34156I() || !l3Var.mo34155H()) {
                        return null;
                    }
                } else if (!l3Var.mo34153E()) {
                    return null;
                }
                int J = l3Var.mo34157J();
                if (l3Var.mo34157J() == 5) {
                    if (C6179i9.m10733P(l3Var.mo34150B()) && C6179i9.m10733P(l3Var.mo34159z())) {
                        try {
                            BigDecimal bigDecimal5 = new BigDecimal(l3Var.mo34150B());
                            bigDecimal3 = new BigDecimal(l3Var.mo34159z());
                            bigDecimal2 = bigDecimal5;
                            bigDecimal4 = null;
                        } catch (NumberFormatException unused) {
                        }
                    }
                    return null;
                } else if (!C6179i9.m10733P(l3Var.mo34158y())) {
                    return null;
                } else {
                    try {
                        bigDecimal4 = new BigDecimal(l3Var.mo34158y());
                        bigDecimal2 = null;
                        bigDecimal3 = null;
                    } catch (NumberFormatException unused2) {
                    }
                }
                if (J == 5) {
                    if (bigDecimal2 == null) {
                        return null;
                    }
                } else if (bigDecimal4 == null) {
                    return null;
                }
                int i = J - 1;
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3) {
                            if (i != 4 || bigDecimal2 == null) {
                                return null;
                            }
                            if (bigDecimal.compareTo(bigDecimal2) < 0 || bigDecimal.compareTo(bigDecimal3) > 0) {
                                z = false;
                            }
                            return Boolean.valueOf(z);
                        } else if (bigDecimal4 == null) {
                            return null;
                        } else {
                            if (d != 0.0d) {
                                if (bigDecimal.compareTo(bigDecimal4.subtract(new BigDecimal(d).multiply(new BigDecimal(2)))) <= 0 || bigDecimal.compareTo(bigDecimal4.add(new BigDecimal(d).multiply(new BigDecimal(2)))) >= 0) {
                                    z = false;
                                }
                                return Boolean.valueOf(z);
                            }
                            if (bigDecimal.compareTo(bigDecimal4) != 0) {
                                z = false;
                            }
                            return Boolean.valueOf(z);
                        }
                    } else if (bigDecimal4 == null) {
                        return null;
                    } else {
                        if (bigDecimal.compareTo(bigDecimal4) <= 0) {
                            z = false;
                        }
                        return Boolean.valueOf(z);
                    }
                } else if (bigDecimal4 == null) {
                    return null;
                } else {
                    if (bigDecimal.compareTo(bigDecimal4) >= 0) {
                        z = false;
                    }
                    return Boolean.valueOf(z);
                }
            }
        }
        return null;
    }

    /* renamed from: f */
    static Boolean m11227f(String str, C5950s3 s3Var, C6206l3 l3Var) {
        String str2;
        List<String> list;
        String str3;
        C9713p.m20275j(s3Var);
        if (str == null || !s3Var.mo34343F() || s3Var.mo34344H() == 1) {
            return null;
        }
        if (s3Var.mo34344H() == 7) {
            if (s3Var.mo34345w() == 0) {
                return null;
            }
        } else if (!s3Var.mo34342E()) {
            return null;
        }
        int H = s3Var.mo34344H();
        boolean C = s3Var.mo34340C();
        if (C || H == 2 || H == 7) {
            str2 = s3Var.mo34346z();
        } else {
            str2 = s3Var.mo34346z().toUpperCase(Locale.ENGLISH);
        }
        String str4 = str2;
        if (s3Var.mo34345w() == 0) {
            list = null;
        } else {
            List<String> B = s3Var.mo34339B();
            if (!C) {
                ArrayList arrayList = new ArrayList(B.size());
                for (String upperCase : B) {
                    arrayList.add(upperCase.toUpperCase(Locale.ENGLISH));
                }
                B = Collections.unmodifiableList(arrayList);
            }
            list = B;
        }
        if (H == 2) {
            str3 = str4;
        } else {
            str3 = null;
        }
        return m11225d(str, H, C, str4, list, str3, l3Var);
    }

    /* renamed from: g */
    static Boolean m11228g(double d, C5838l3 l3Var) {
        try {
            return m11226e(new BigDecimal(d), l3Var, Math.ulp(d));
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    /* renamed from: h */
    static Boolean m11229h(long j, C5838l3 l3Var) {
        try {
            return m11226e(new BigDecimal(j), l3Var, 0.0d);
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    /* renamed from: i */
    static Boolean m11230i(String str, C5838l3 l3Var) {
        if (!C6179i9.m10733P(str)) {
            return null;
        }
        try {
            return m11226e(new BigDecimal(str), l3Var, 0.0d);
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    /* renamed from: j */
    static Boolean m11231j(Boolean bool, boolean z) {
        boolean z2;
        if (bool == null) {
            return null;
        }
        if (bool.booleanValue() != z) {
            z2 = true;
        } else {
            z2 = false;
        }
        return Boolean.valueOf(z2);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public abstract int mo35409a();

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public abstract boolean mo35410b();

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public abstract boolean mo35411c();
}
