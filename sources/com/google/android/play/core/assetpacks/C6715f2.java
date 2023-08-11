package com.google.android.play.core.assetpacks;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.zip.GZIPInputStream;
import p024a6.C2209b;
import p037b6.C2893a0;
import p037b6.C2895b0;
import p037b6.C2900e;
import p037b6.C2924q;

/* renamed from: com.google.android.play.core.assetpacks.f2 */
final class C6715f2 {

    /* renamed from: d */
    private static final C2900e f8634d = new C2900e("PatchSliceTaskHandler");

    /* renamed from: a */
    private final C6792z f8635a;

    /* renamed from: b */
    private final C2895b0<C6697b3> f8636b;

    /* renamed from: c */
    private final C2209b f8637c;

    C6715f2(C6792z zVar, C2895b0<C6697b3> b0Var, C2209b bVar) {
        this.f8635a = zVar;
        this.f8636b = b0Var;
        this.f8637c = bVar;
    }

    /* renamed from: a */
    public final void mo39286a(C6711e2 e2Var) {
        InputStream inputStream;
        Throwable th;
        C6711e2 e2Var2 = e2Var;
        File b = this.f8635a.mo39381b(e2Var2.f8700b, e2Var2.f8614c, e2Var2.f8615d);
        C6792z zVar = this.f8635a;
        String str = e2Var2.f8700b;
        int i = e2Var2.f8614c;
        long j = e2Var2.f8615d;
        File file = new File(zVar.mo39387j(str, i, j), e2Var2.f8619h);
        try {
            inputStream = e2Var2.f8621j;
            if (e2Var2.f8618g == 2) {
                inputStream = new GZIPInputStream(inputStream, 8192);
            }
            C6699c0 c0Var = new C6699c0(b, file);
            if (this.f8637c.mo23535b()) {
                File c = this.f8635a.mo39382c(e2Var2.f8700b, e2Var2.f8616e, e2Var2.f8617f, e2Var2.f8619h);
                if (!c.exists()) {
                    c.mkdirs();
                }
                C6727i2 i2Var = new C6727i2(this.f8635a, e2Var2.f8700b, e2Var2.f8616e, e2Var2.f8617f, e2Var2.f8619h);
                C2924q.m2387b(c0Var, inputStream, new C6773u0(c, i2Var), e2Var2.f8620i);
                i2Var.mo39311j(0);
            } else {
                File file2 = new File(this.f8635a.mo39401y(e2Var2.f8700b, e2Var2.f8616e, e2Var2.f8617f, e2Var2.f8619h), "slice.zip.tmp");
                if (file2.getParentFile() != null && !file2.getParentFile().exists()) {
                    file2.getParentFile().mkdirs();
                }
                C2924q.m2387b(c0Var, inputStream, new FileOutputStream(file2), e2Var2.f8620i);
                if (!file2.renameTo(this.f8635a.mo39399w(e2Var2.f8700b, e2Var2.f8616e, e2Var2.f8617f, e2Var2.f8619h))) {
                    throw new C6761r0(String.format("Error moving patch for slice %s of pack %s.", new Object[]{e2Var2.f8619h, e2Var2.f8700b}), e2Var2.f8699a);
                }
            }
            inputStream.close();
            if (this.f8637c.mo23535b()) {
                f8634d.mo28424f("Patching and extraction finished for slice %s of pack %s.", e2Var2.f8619h, e2Var2.f8700b);
            } else {
                f8634d.mo28424f("Patching finished for slice %s of pack %s.", e2Var2.f8619h, e2Var2.f8700b);
            }
            this.f8636b.mo28418a().mo39273c(e2Var2.f8699a, e2Var2.f8700b, e2Var2.f8619h, 0);
            try {
                e2Var2.f8621j.close();
                return;
            } catch (IOException unused) {
                f8634d.mo28425g("Could not close file for slice %s of pack %s.", e2Var2.f8619h, e2Var2.f8700b);
                return;
            }
        } catch (IOException e) {
            f8634d.mo28423e("IOException during patching %s.", e.getMessage());
            throw new C6761r0(String.format("Error patching slice %s of pack %s.", new Object[]{e2Var2.f8619h, e2Var2.f8700b}), e, e2Var2.f8699a);
        } catch (Throwable th2) {
            C2893a0.m2299a(th, th2);
        }
        throw th;
    }
}
