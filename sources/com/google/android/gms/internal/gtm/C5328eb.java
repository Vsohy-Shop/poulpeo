package com.google.android.gms.internal.gtm;

import android.content.Context;
import androidx.annotation.Nullable;
import com.google.android.gms.common.api.Status;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p286y4.C10671e;
import p286y4.C10674h;

/* renamed from: com.google.android.gms.internal.gtm.eb */
public final class C5328eb {

    /* renamed from: a */
    private final Context f5973a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final C5497pb f5974b;

    /* renamed from: c */
    private final C10671e f5975c;

    /* renamed from: d */
    private String f5976d;

    /* renamed from: e */
    private final Map<String, C5374hb<C5299cc>> f5977e;

    /* renamed from: f */
    private final Map<String, C5284bc> f5978f;

    public C5328eb(Context context) {
        this(context, new HashMap(), new C5497pb(context), C10674h.m22680c());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo33191b(Status status, C5482ob obVar) {
        String a = obVar.mo33430b().mo33134a();
        C5299cc c = obVar.mo33431c();
        if (this.f5977e.containsKey(a)) {
            C5374hb hbVar = this.f5977e.get(a);
            hbVar.mo33238c(this.f5975c.mo33547a());
            if (status == Status.f4889g) {
                hbVar.mo33236a(status);
                hbVar.mo33239d(c);
                return;
            }
            return;
        }
        this.f5977e.put(a, new C5374hb(status, c, this.f5975c.mo33547a()));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final void mo33192c(C5449mb mbVar, List<Integer> list, int i, C5343fb fbVar, @Nullable C5488p2 p2Var) {
        String str;
        long j;
        List<Integer> list2 = list;
        int i2 = i;
        while (true) {
            if (i2 == 0) {
                C5426l3.m8133c("Starting to fetch a new resource");
            }
            boolean z = true;
            if (i2 >= list.size()) {
                String valueOf = String.valueOf(mbVar.mo33360c().mo33134a());
                if (valueOf.length() != 0) {
                    str = "There is no valid resource for the container: ".concat(valueOf);
                } else {
                    str = new String("There is no valid resource for the container: ");
                }
                C5426l3.m8133c(str);
                fbVar.mo33211a(new C5464nb(new Status(16, str), list2.get(i2 - 1).intValue()));
                return;
            }
            C5343fb fbVar2 = fbVar;
            int intValue = list2.get(i2).intValue();
            if (intValue == 0) {
                C5283bb c = mbVar.mo33360c();
                C5374hb hbVar = this.f5977e.get(c.mo33134a());
                if (!mbVar.mo33360c().mo33138e()) {
                    if (hbVar != null) {
                        j = hbVar.mo33237b();
                    } else {
                        j = this.f5974b.mo33459h(c.mo33134a());
                    }
                    if (j + 900000 >= this.f5975c.mo33547a()) {
                        z = false;
                    }
                }
                if (z) {
                    C5284bc bcVar = this.f5978f.get(mbVar.mo33358a());
                    if (bcVar == null) {
                        bcVar = new C5284bc();
                        this.f5978f.put(mbVar.mo33358a(), bcVar);
                    }
                    String a = c.mo33134a();
                    StringBuilder sb = new StringBuilder(String.valueOf(a).length() + 43);
                    sb.append("Attempting to fetch container ");
                    sb.append(a);
                    sb.append(" from network");
                    C5426l3.m8133c(sb.toString());
                    C5449mb mbVar2 = mbVar;
                    bcVar.mo33141a(this.f5973a, mbVar2, 0, new C5358gb(this, 0, mbVar, C5404jb.f6067a, list, i2, fbVar, p2Var));
                    return;
                }
                i2++;
            } else if (intValue == 1) {
                C5283bb c2 = mbVar.mo33360c();
                String a2 = c2.mo33134a();
                StringBuilder sb2 = new StringBuilder(String.valueOf(a2).length() + 52);
                sb2.append("Attempting to fetch container ");
                sb2.append(a2);
                sb2.append(" from a saved resource");
                C5426l3.m8133c(sb2.toString());
                this.f5974b.mo33453a(c2.mo33137d(), new C5358gb(this, 1, mbVar, C5404jb.f6067a, list, i2, fbVar, (C5488p2) null));
                return;
            } else if (intValue == 2) {
                C5283bb c3 = mbVar.mo33360c();
                String a3 = c3.mo33134a();
                StringBuilder sb3 = new StringBuilder(String.valueOf(a3).length() + 56);
                sb3.append("Attempting to fetch container ");
                sb3.append(a3);
                sb3.append(" from the default resource");
                C5426l3.m8133c(sb3.toString());
                this.f5974b.mo33454b(c3.mo33137d(), c3.mo33135b(), new C5358gb(this, 2, mbVar, C5404jb.f6067a, list, i2, fbVar, (C5488p2) null));
                return;
            } else {
                StringBuilder sb4 = new StringBuilder(36);
                sb4.append("Unknown fetching source: ");
                sb4.append(i2);
                throw new UnsupportedOperationException(sb4.toString());
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0024, code lost:
        if (r16.equals(r2.mo33531a()) != false) goto L_0x002a;
     */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo33193d(java.lang.String r16, @androidx.annotation.Nullable java.lang.String r17, @androidx.annotation.Nullable java.lang.String r18, java.util.List<java.lang.Integer> r19, com.google.android.gms.internal.gtm.C5343fb r20, com.google.android.gms.internal.gtm.C5488p2 r21) {
        /*
            r15 = this;
            boolean r0 = r19.isEmpty()
            r1 = 1
            r0 = r0 ^ r1
            p231t4.C9713p.m20266a(r0)
            com.google.android.gms.internal.gtm.mb r0 = new com.google.android.gms.internal.gtm.mb
            r0.<init>()
            com.google.android.gms.internal.gtm.bb r8 = new com.google.android.gms.internal.gtm.bb
            com.google.android.gms.internal.gtm.t3 r2 = com.google.android.gms.internal.gtm.C5549t3.m8514e()
            boolean r3 = r2.mo33532b()
            if (r3 == 0) goto L_0x0027
            java.lang.String r2 = r2.mo33531a()
            r3 = r16
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L_0x0029
            goto L_0x002a
        L_0x0027:
            r3 = r16
        L_0x0029:
            r1 = 0
        L_0x002a:
            r6 = r1
            com.google.android.gms.internal.gtm.t3 r1 = com.google.android.gms.internal.gtm.C5549t3.m8514e()
            java.lang.String r7 = r1.mo33535f()
            r2 = r8
            r3 = r16
            r4 = r17
            r5 = r18
            r2.<init>(r3, r4, r5, r6, r7)
            com.google.android.gms.internal.gtm.mb r10 = r0.mo33359b(r8)
            java.util.List r11 = java.util.Collections.unmodifiableList(r19)
            r12 = 0
            r9 = r15
            r13 = r20
            r14 = r21
            r9.mo33192c(r10, r11, r12, r13, r14)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.gtm.C5328eb.mo33193d(java.lang.String, java.lang.String, java.lang.String, java.util.List, com.google.android.gms.internal.gtm.fb, com.google.android.gms.internal.gtm.p2):void");
    }

    private C5328eb(Context context, Map<String, C5284bc> map, C5497pb pbVar, C10671e eVar) {
        this.f5976d = null;
        this.f5977e = new HashMap();
        this.f5973a = context.getApplicationContext();
        this.f5975c = eVar;
        this.f5974b = pbVar;
        this.f5978f = map;
    }
}
