package com.google.android.gms.internal.gtm;

import androidx.annotation.Nullable;
import com.google.android.gms.common.api.Status;
import java.util.List;

/* renamed from: com.google.android.gms.internal.gtm.gb */
final class C5358gb extends C5313db {

    /* renamed from: f */
    private final C5343fb f6012f;

    /* renamed from: g */
    private final List<Integer> f6013g;

    /* renamed from: h */
    private final int f6014h;

    /* renamed from: i */
    private final /* synthetic */ C5328eb f6015i;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C5358gb(C5328eb ebVar, int i, C5449mb mbVar, C5389ib ibVar, List<Integer> list, int i2, @Nullable C5343fb fbVar, C5488p2 p2Var) {
        super(i, mbVar, ibVar, p2Var);
        this.f6015i = ebVar;
        this.f6012f = fbVar;
        this.f6013g = list;
        this.f6014h = i2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo33172a(C5464nb nbVar) {
        String str;
        String str2;
        String str3;
        boolean z = false;
        if (nbVar.getStatus() == Status.f4889g) {
            String valueOf = String.valueOf(nbVar.mo33387f());
            if (valueOf.length() != 0) {
                str3 = "Container resource successfully loaded from ".concat(valueOf);
            } else {
                str3 = new String("Container resource successfully loaded from ");
            }
            C5426l3.m8133c(str3);
            if (nbVar.mo33384a() == 0) {
                C5482ob c = nbVar.mo33385c();
                if (!c.mo33430b().mo33138e()) {
                    this.f6015i.mo33191b(nbVar.getStatus(), c);
                    if (c.mo33429a() != null && c.mo33429a().length > 0) {
                        this.f6015i.f5974b.mo33455c(c.mo33430b().mo33137d(), c.mo33429a());
                    }
                }
            }
            z = true;
        }
        if (z) {
            this.f6012f.mo33211a(nbVar);
            return;
        }
        String f = nbVar.mo33387f();
        if (nbVar.getStatus().mo32381I()) {
            str = "SUCCESS";
        } else {
            str = "FAILURE";
        }
        StringBuilder sb = new StringBuilder(String.valueOf(f).length() + 54 + str.length());
        sb.append("Cannot fetch a valid resource from ");
        sb.append(f);
        sb.append(". Response status: ");
        sb.append(str);
        C5426l3.m8133c(sb.toString());
        if (nbVar.getStatus().mo32381I()) {
            String valueOf2 = String.valueOf(nbVar.mo33387f());
            if (valueOf2.length() != 0) {
                str2 = "Response source: ".concat(valueOf2);
            } else {
                str2 = new String("Response source: ");
            }
            C5426l3.m8133c(str2);
            int length = nbVar.mo33385c().mo33429a().length;
            StringBuilder sb2 = new StringBuilder(26);
            sb2.append("Response size: ");
            sb2.append(length);
            C5426l3.m8133c(sb2.toString());
        }
        this.f6015i.mo33192c(this.f5925b, this.f6013g, this.f6014h + 1, this.f6012f, this.f5928e);
    }
}
