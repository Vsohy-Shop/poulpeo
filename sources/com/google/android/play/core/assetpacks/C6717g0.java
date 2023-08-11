package com.google.android.play.core.assetpacks;

import android.os.ParcelFileDescriptor;
import java.io.InputStream;
import java.util.concurrent.ExecutionException;
import p037b6.C2895b0;
import p099g6.C7783e;

/* renamed from: com.google.android.play.core.assetpacks.g0 */
final class C6717g0 {

    /* renamed from: a */
    private final C2895b0<C6697b3> f8641a;

    C6717g0(C2895b0<C6697b3> b0Var) {
        this.f8641a = b0Var;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final InputStream mo39287a(int i, String str, String str2, int i2) {
        try {
            ParcelFileDescriptor parcelFileDescriptor = (ParcelFileDescriptor) C7783e.m15178e(this.f8641a.mo28418a().mo39272b(i, str, str2, i2));
            if (parcelFileDescriptor != null && parcelFileDescriptor.getFileDescriptor() != null) {
                return new ParcelFileDescriptor.AutoCloseInputStream(parcelFileDescriptor);
            }
            throw new C6761r0(String.format("Corrupted ParcelFileDescriptor, session %s packName %s sliceId %s, chunkNumber %s", new Object[]{Integer.valueOf(i), str, str2, Integer.valueOf(i2)}), i);
        } catch (ExecutionException e) {
            throw new C6761r0(String.format("Error opening chunk file, session %s packName %s sliceId %s, chunkNumber %s", new Object[]{Integer.valueOf(i), str, str2, Integer.valueOf(i2)}), e, i);
        } catch (InterruptedException e2) {
            throw new C6761r0("Extractor was interrupted while waiting for chunk file.", e2, i);
        }
    }
}
