package com.facebook;

import android.os.Handler;
import java.io.OutputStream;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.C12775o;

/* renamed from: com.facebook.v */
/* compiled from: ProgressNoopOutputStream.kt */
public final class C4594v extends OutputStream implements C4597x {

    /* renamed from: b */
    private final Map<C4555l, C4598y> f4357b = new HashMap();

    /* renamed from: c */
    private C4555l f4358c;

    /* renamed from: d */
    private C4598y f4359d;

    /* renamed from: e */
    private int f4360e;

    /* renamed from: f */
    private final Handler f4361f;

    public C4594v(Handler handler) {
        this.f4361f = handler;
    }

    /* renamed from: a */
    public void mo31791a(C4555l lVar) {
        C4598y yVar;
        this.f4358c = lVar;
        if (lVar != null) {
            yVar = this.f4357b.get(lVar);
        } else {
            yVar = null;
        }
        this.f4359d = yVar;
    }

    /* renamed from: b */
    public final void mo31792b(long j) {
        C4555l lVar = this.f4358c;
        if (lVar != null) {
            if (this.f4359d == null) {
                C4598y yVar = new C4598y(this.f4361f, lVar);
                this.f4359d = yVar;
                this.f4357b.put(lVar, yVar);
            }
            C4598y yVar2 = this.f4359d;
            if (yVar2 != null) {
                yVar2.mo31806b(j);
            }
            this.f4360e += (int) j;
        }
    }

    /* renamed from: c */
    public final int mo31793c() {
        return this.f4360e;
    }

    /* renamed from: k */
    public final Map<C4555l, C4598y> mo31794k() {
        return this.f4357b;
    }

    public void write(byte[] bArr) {
        C12775o.m28639i(bArr, "buffer");
        mo31792b((long) bArr.length);
    }

    public void write(byte[] bArr, int i, int i2) {
        C12775o.m28639i(bArr, "buffer");
        mo31792b((long) i2);
    }

    public void write(int i) {
        mo31792b(1);
    }
}
