package com.google.android.gms.internal.gtm;

import java.util.Arrays;
import java.util.List;

/* renamed from: com.google.android.gms.internal.gtm.o5 */
public final class C5476o5 extends C5521r5 {

    /* renamed from: a */
    private C5276b4 f6212a = null;

    /* renamed from: b */
    private final String f6213b;

    /* renamed from: c */
    private final List<String> f6214c;

    /* renamed from: d */
    private final List<C5300cd> f6215d;

    public C5476o5(C5276b4 b4Var, String str, List<String> list, List<C5300cd> list2) {
        this.f6213b = str;
        this.f6214c = list;
        this.f6215d = list2;
    }

    /* renamed from: b */
    public final C5528rc<?> mo33099b(C5276b4 b4Var, C5528rc<?>... rcVarArr) {
        try {
            C5276b4 f = this.f6212a.mo33126f();
            for (int i = 0; i < this.f6214c.size(); i++) {
                if (rcVarArr.length > i) {
                    f.mo33123c(this.f6214c.get(i), rcVarArr[i]);
                } else {
                    f.mo33123c(this.f6214c.get(i), C5618xc.f6732h);
                }
            }
            f.mo33123c("arguments", new C5632yc(Arrays.asList(rcVarArr)));
            for (C5300cd b : this.f6215d) {
                C5528rc b2 = C5345fd.m7938b(f, b);
                if ((b2 instanceof C5618xc) && ((C5618xc) b2).mo33621i()) {
                    return (C5528rc) ((C5618xc) b2).mo33142a();
                }
            }
        } catch (RuntimeException e) {
            String str = this.f6213b;
            String message = e.getMessage();
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 33 + String.valueOf(message).length());
            sb.append("Internal error - Function call: ");
            sb.append(str);
            sb.append("\n");
            sb.append(message);
            C5426l3.m8135e(sb.toString());
        }
        return C5618xc.f6732h;
    }

    /* renamed from: c */
    public final String mo33426c() {
        return this.f6213b;
    }

    /* renamed from: d */
    public final void mo33427d(C5276b4 b4Var) {
        this.f6212a = b4Var;
    }

    public final String toString() {
        String str = this.f6213b;
        String obj = this.f6214c.toString();
        String obj2 = this.f6215d.toString();
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 26 + String.valueOf(obj).length() + String.valueOf(obj2).length());
        sb.append(str);
        sb.append("\n\tparams: ");
        sb.append(obj);
        sb.append("\n\t: statements: ");
        sb.append(obj2);
        return sb.toString();
    }
}
