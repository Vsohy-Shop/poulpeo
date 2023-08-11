package com.google.android.gms.internal.gtm;

import androidx.annotation.Nullable;
import com.google.android.gms.common.api.Status;
import p231t4.C9713p;
import p286y4.C10671e;
import p286y4.C10674h;

/* renamed from: com.google.android.gms.internal.gtm.db */
public abstract class C5313db {

    /* renamed from: a */
    private int f5924a;

    /* renamed from: b */
    protected final C5449mb f5925b;

    /* renamed from: c */
    private final C5389ib f5926c;

    /* renamed from: d */
    private final C10671e f5927d;
    @Nullable

    /* renamed from: e */
    protected final C5488p2 f5928e;

    public C5313db(int i, C5449mb mbVar, C5389ib ibVar, @Nullable C5488p2 p2Var) {
        this(i, mbVar, ibVar, p2Var, C10674h.m22680c());
    }

    /* renamed from: d */
    private final C5464nb m7852d(byte[] bArr) {
        C5464nb nbVar;
        try {
            nbVar = this.f5926c.mo33255a(bArr);
            if (nbVar == null) {
                try {
                    C5426l3.m8136f("Parsed resource from is null");
                } catch (zzml unused) {
                }
            }
        } catch (zzml unused2) {
            nbVar = null;
            C5426l3.m8136f("Resource data is corrupted");
            return nbVar;
        }
        return nbVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo33172a(C5464nb nbVar);

    /* renamed from: b */
    public final void mo33173b(int i, int i2) {
        String str;
        C5488p2 p2Var = this.f5928e;
        if (p2Var != null && i2 == 0 && i == 3) {
            p2Var.mo33447d();
        }
        String a = this.f5925b.mo33360c().mo33134a();
        if (i == 0) {
            str = "Resource not available";
        } else if (i == 1) {
            str = "IOError";
        } else if (i != 2) {
            str = "Unknown reason";
        } else {
            str = "Server error";
        }
        StringBuilder sb = new StringBuilder(String.valueOf(a).length() + 61 + str.length());
        sb.append("Failed to fetch the container resource for the container \"");
        sb.append(a);
        sb.append("\": ");
        sb.append(str);
        C5426l3.m8133c(sb.toString());
        mo33172a(new C5464nb(Status.f4891i, i2));
    }

    /* renamed from: c */
    public final void mo33174c(byte[] bArr) {
        C5464nb nbVar;
        Status status;
        C5464nb d = m7852d(bArr);
        C5488p2 p2Var = this.f5928e;
        if (p2Var != null && this.f5924a == 0) {
            p2Var.mo33448e();
        }
        if (d == null || d.getStatus() != (status = Status.f4889g)) {
            nbVar = new C5464nb(Status.f4891i, this.f5924a);
        } else {
            byte[] bArr2 = bArr;
            nbVar = new C5464nb(status, this.f5924a, new C5482ob(this.f5925b.mo33360c(), bArr2, d.mo33385c().mo33431c(), this.f5927d.mo33547a()), d.mo33386e());
        }
        mo33172a(nbVar);
    }

    private C5313db(int i, C5449mb mbVar, C5389ib ibVar, @Nullable C5488p2 p2Var, C10671e eVar) {
        this.f5925b = (C5449mb) C9713p.m20275j(mbVar);
        C9713p.m20275j(mbVar.mo33360c());
        this.f5924a = i;
        this.f5926c = (C5389ib) C9713p.m20275j(ibVar);
        this.f5927d = (C10671e) C9713p.m20275j(eVar);
        this.f5928e = p2Var;
    }
}
