package com.google.android.gms.internal.gtm;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import p231t4.C9713p;

/* renamed from: com.google.android.gms.internal.gtm.j1 */
final class C5394j1 {

    /* renamed from: a */
    private int f6056a;

    /* renamed from: b */
    private ByteArrayOutputStream f6057b = new ByteArrayOutputStream();

    /* renamed from: c */
    private final /* synthetic */ C5379i1 f6058c;

    public C5394j1(C5379i1 i1Var) {
        this.f6058c = i1Var;
    }

    /* renamed from: a */
    public final byte[] mo33290a() {
        return this.f6057b.toByteArray();
    }

    /* renamed from: b */
    public final boolean mo33291b(C5273b1 b1Var) {
        C9713p.m20275j(b1Var);
        if (this.f6056a + 1 > C5468o0.m8261g()) {
            return false;
        }
        String T0 = this.f6058c.mo33250T0(b1Var, false);
        if (T0 == null) {
            this.f6058c.mo33280p0().mo33214R0(b1Var, "Error formatting hit");
            return true;
        }
        byte[] bytes = T0.getBytes();
        int length = bytes.length;
        if (length > C5468o0.m8257c()) {
            this.f6058c.mo33280p0().mo33214R0(b1Var, "Hit size exceeds the maximum size limit");
            return true;
        }
        if (this.f6057b.size() > 0) {
            length++;
        }
        if (this.f6057b.size() + length > C5592w0.f6400A.mo33605a().intValue()) {
            return false;
        }
        try {
            if (this.f6057b.size() > 0) {
                this.f6057b.write(C5379i1.f6046f);
            }
            this.f6057b.write(bytes);
            this.f6056a++;
            return true;
        } catch (IOException e) {
            this.f6058c.mo33265H0("Failed to write payload when batching hits", e);
            return true;
        }
    }

    /* renamed from: c */
    public final int mo33292c() {
        return this.f6056a;
    }
}
