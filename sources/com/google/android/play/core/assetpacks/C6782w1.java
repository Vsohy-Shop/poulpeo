package com.google.android.play.core.assetpacks;

import java.io.File;
import java.io.IOException;
import p037b6.C2900e;

/* renamed from: com.google.android.play.core.assetpacks.w1 */
final class C6782w1 {

    /* renamed from: b */
    private static final C2900e f8892b = new C2900e("MergeSliceTaskHandler");

    /* renamed from: a */
    private final C6792z f8893a;

    C6782w1(C6792z zVar) {
        this.f8893a = zVar;
    }

    /* renamed from: b */
    private static void m11555b(File file, File file2) {
        if (file.isDirectory()) {
            file2.mkdirs();
            for (File file3 : file.listFiles()) {
                m11555b(file3, new File(file2, file3.getName()));
            }
            if (!file.delete()) {
                String valueOf = String.valueOf(file);
                StringBuilder sb = new StringBuilder(valueOf.length() + 28);
                sb.append("Unable to delete directory: ");
                sb.append(valueOf);
                throw new C6761r0(sb.toString());
            }
        } else if (file2.exists()) {
            String valueOf2 = String.valueOf(file2);
            StringBuilder sb2 = new StringBuilder(valueOf2.length() + 51);
            sb2.append("File clashing with existing file from other slice: ");
            sb2.append(valueOf2);
            throw new C6761r0(sb2.toString());
        } else if (!file.renameTo(file2)) {
            String valueOf3 = String.valueOf(file);
            StringBuilder sb3 = new StringBuilder(valueOf3.length() + 21);
            sb3.append("Unable to move file: ");
            sb3.append(valueOf3);
            throw new C6761r0(sb3.toString());
        }
    }

    /* renamed from: a */
    public final void mo39378a(C6778v1 v1Var) {
        File k = this.f8893a.mo39388k(v1Var.f8700b, v1Var.f8887c, v1Var.f8888d, v1Var.f8889e);
        if (k.exists()) {
            File m = this.f8893a.mo39390m(v1Var.f8700b, v1Var.f8887c, v1Var.f8888d);
            if (!m.exists()) {
                m.mkdirs();
            }
            m11555b(k, m);
            try {
                this.f8893a.mo39384f(v1Var.f8700b, v1Var.f8887c, v1Var.f8888d, this.f8893a.mo39394r(v1Var.f8700b, v1Var.f8887c, v1Var.f8888d) + 1);
            } catch (IOException e) {
                f8892b.mo28423e("Writing merge checkpoint failed with %s.", e.getMessage());
                throw new C6761r0("Writing merge checkpoint failed.", e, v1Var.f8699a);
            }
        } else {
            throw new C6761r0(String.format("Cannot find verified files for slice %s.", new Object[]{v1Var.f8889e}), v1Var.f8699a);
        }
    }
}
