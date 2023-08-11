package com.google.android.play.core.assetpacks;

import java.io.File;
import java.io.IOException;
import java.security.NoSuchAlgorithmException;
import p037b6.C2900e;

/* renamed from: com.google.android.play.core.assetpacks.m2 */
final class C6743m2 {

    /* renamed from: b */
    private static final C2900e f8711b = new C2900e("VerifySliceTaskHandler");

    /* renamed from: a */
    private final C6792z f8712a;

    C6743m2(C6792z zVar) {
        this.f8712a = zVar;
    }

    /* renamed from: b */
    private final void m11458b(C6739l2 l2Var, File file) {
        try {
            File y = this.f8712a.mo39401y(l2Var.f8700b, l2Var.f8701c, l2Var.f8702d, l2Var.f8703e);
            if (y.exists()) {
                try {
                    if (C6770t1.m11531a(C6735k2.m11447a(file, y)).equals(l2Var.f8704f)) {
                        f8711b.mo28424f("Verification of slice %s of pack %s successful.", l2Var.f8703e, l2Var.f8700b);
                        return;
                    }
                    throw new C6761r0(String.format("Verification failed for slice %s.", new Object[]{l2Var.f8703e}), l2Var.f8699a);
                } catch (NoSuchAlgorithmException e) {
                    throw new C6761r0("SHA256 algorithm not supported.", e, l2Var.f8699a);
                } catch (IOException e2) {
                    throw new C6761r0(String.format("Could not digest file during verification for slice %s.", new Object[]{l2Var.f8703e}), e2, l2Var.f8699a);
                }
            } else {
                throw new C6761r0(String.format("Cannot find metadata files for slice %s.", new Object[]{l2Var.f8703e}), l2Var.f8699a);
            }
        } catch (IOException e3) {
            throw new C6761r0(String.format("Could not reconstruct slice archive during verification for slice %s.", new Object[]{l2Var.f8703e}), e3, l2Var.f8699a);
        }
    }

    /* renamed from: a */
    public final void mo39334a(C6739l2 l2Var) {
        File c = this.f8712a.mo39382c(l2Var.f8700b, l2Var.f8701c, l2Var.f8702d, l2Var.f8703e);
        if (c.exists()) {
            m11458b(l2Var, c);
            File k = this.f8712a.mo39388k(l2Var.f8700b, l2Var.f8701c, l2Var.f8702d, l2Var.f8703e);
            if (!k.exists()) {
                k.mkdirs();
            }
            if (!c.renameTo(k)) {
                throw new C6761r0(String.format("Failed to move slice %s after verification.", new Object[]{l2Var.f8703e}), l2Var.f8699a);
            }
            return;
        }
        throw new C6761r0(String.format("Cannot find unverified files for slice %s.", new Object[]{l2Var.f8703e}), l2Var.f8699a);
    }
}
