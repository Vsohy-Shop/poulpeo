package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import p058d1.C7216c;
import p058d1.C7219f;
import p058d1.C7222g;
import p058d1.C7225j;
import p106h1.C7883b;

/* renamed from: com.bumptech.glide.load.resource.bitmap.c */
/* compiled from: BitmapEncoder */
public class C4450c implements C7225j<Bitmap> {

    /* renamed from: b */
    public static final C7219f<Integer> f4006b = C7219f.m13988f("com.bumptech.glide.load.resource.bitmap.BitmapEncoder.CompressionQuality", 90);

    /* renamed from: c */
    public static final C7219f<Bitmap.CompressFormat> f4007c = C7219f.m13987e("com.bumptech.glide.load.resource.bitmap.BitmapEncoder.CompressionFormat");
    @Nullable

    /* renamed from: a */
    private final C7883b f4008a;

    public C4450c(@NonNull C7883b bVar) {
        this.f4008a = bVar;
    }

    /* renamed from: d */
    private Bitmap.CompressFormat m5364d(Bitmap bitmap, C7222g gVar) {
        Bitmap.CompressFormat compressFormat = (Bitmap.CompressFormat) gVar.mo40779c(f4007c);
        if (compressFormat != null) {
            return compressFormat;
        }
        if (bitmap.hasAlpha()) {
            return Bitmap.CompressFormat.PNG;
        }
        return Bitmap.CompressFormat.JPEG;
    }

    @NonNull
    /* renamed from: b */
    public C7216c mo31398b(@NonNull C7222g gVar) {
        return C7216c.TRANSFORMED;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(4:22|(2:42|43)|44|45) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:44:0x00c1 */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0060 A[Catch:{ all -> 0x0056 }] */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0067 A[SYNTHETIC, Splitter:B:30:0x0067] */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0072 A[Catch:{ all -> 0x00c2 }] */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00be A[SYNTHETIC, Splitter:B:42:0x00be] */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo31397a(@androidx.annotation.NonNull p094g1.C7744c<android.graphics.Bitmap> r8, @androidx.annotation.NonNull java.io.File r9, @androidx.annotation.NonNull p058d1.C7222g r10) {
        /*
            r7 = this;
            java.lang.String r0 = "BitmapEncoder"
            java.lang.Object r8 = r8.get()
            android.graphics.Bitmap r8 = (android.graphics.Bitmap) r8
            android.graphics.Bitmap$CompressFormat r1 = r7.m5364d(r8, r10)
            int r2 = r8.getWidth()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            int r3 = r8.getHeight()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            java.lang.String r4 = "encode: [%dx%d] %s"
            p020a2.C2133b.m1491c(r4, r2, r3, r1)
            long r2 = p294z1.C10787f.m22932b()     // Catch:{ all -> 0x00c2 }
            d1.f<java.lang.Integer> r4 = f4006b     // Catch:{ all -> 0x00c2 }
            java.lang.Object r4 = r10.mo40779c(r4)     // Catch:{ all -> 0x00c2 }
            java.lang.Integer r4 = (java.lang.Integer) r4     // Catch:{ all -> 0x00c2 }
            int r4 = r4.intValue()     // Catch:{ all -> 0x00c2 }
            r5 = 0
            java.io.FileOutputStream r6 = new java.io.FileOutputStream     // Catch:{ IOException -> 0x0058 }
            r6.<init>(r9)     // Catch:{ IOException -> 0x0058 }
            h1.b r9 = r7.f4008a     // Catch:{ IOException -> 0x0053, all -> 0x0050 }
            if (r9 == 0) goto L_0x0044
            e1.c r9 = new e1.c     // Catch:{ IOException -> 0x0053, all -> 0x0050 }
            h1.b r5 = r7.f4008a     // Catch:{ IOException -> 0x0053, all -> 0x0050 }
            r9.<init>(r6, r5)     // Catch:{ IOException -> 0x0053, all -> 0x0050 }
            r5 = r9
            goto L_0x0045
        L_0x0044:
            r5 = r6
        L_0x0045:
            r8.compress(r1, r4, r5)     // Catch:{ IOException -> 0x0058 }
            r5.close()     // Catch:{ IOException -> 0x0058 }
            r5.close()     // Catch:{ IOException -> 0x004e }
        L_0x004e:
            r9 = 1
            goto L_0x006b
        L_0x0050:
            r8 = move-exception
            r5 = r6
            goto L_0x00bc
        L_0x0053:
            r9 = move-exception
            r5 = r6
            goto L_0x0059
        L_0x0056:
            r8 = move-exception
            goto L_0x00bc
        L_0x0058:
            r9 = move-exception
        L_0x0059:
            r4 = 3
            boolean r4 = android.util.Log.isLoggable(r0, r4)     // Catch:{ all -> 0x0056 }
            if (r4 == 0) goto L_0x0065
            java.lang.String r4 = "Failed to encode Bitmap"
            android.util.Log.d(r0, r4, r9)     // Catch:{ all -> 0x0056 }
        L_0x0065:
            if (r5 == 0) goto L_0x006a
            r5.close()     // Catch:{ IOException -> 0x006a }
        L_0x006a:
            r9 = 0
        L_0x006b:
            r4 = 2
            boolean r4 = android.util.Log.isLoggable(r0, r4)     // Catch:{ all -> 0x00c2 }
            if (r4 == 0) goto L_0x00b8
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x00c2 }
            r4.<init>()     // Catch:{ all -> 0x00c2 }
            java.lang.String r5 = "Compressed with type: "
            r4.append(r5)     // Catch:{ all -> 0x00c2 }
            r4.append(r1)     // Catch:{ all -> 0x00c2 }
            java.lang.String r1 = " of size "
            r4.append(r1)     // Catch:{ all -> 0x00c2 }
            int r1 = p294z1.C10792k.m22956g(r8)     // Catch:{ all -> 0x00c2 }
            r4.append(r1)     // Catch:{ all -> 0x00c2 }
            java.lang.String r1 = " in "
            r4.append(r1)     // Catch:{ all -> 0x00c2 }
            double r1 = p294z1.C10787f.m22931a(r2)     // Catch:{ all -> 0x00c2 }
            r4.append(r1)     // Catch:{ all -> 0x00c2 }
            java.lang.String r1 = ", options format: "
            r4.append(r1)     // Catch:{ all -> 0x00c2 }
            d1.f<android.graphics.Bitmap$CompressFormat> r1 = f4007c     // Catch:{ all -> 0x00c2 }
            java.lang.Object r10 = r10.mo40779c(r1)     // Catch:{ all -> 0x00c2 }
            r4.append(r10)     // Catch:{ all -> 0x00c2 }
            java.lang.String r10 = ", hasAlpha: "
            r4.append(r10)     // Catch:{ all -> 0x00c2 }
            boolean r8 = r8.hasAlpha()     // Catch:{ all -> 0x00c2 }
            r4.append(r8)     // Catch:{ all -> 0x00c2 }
            java.lang.String r8 = r4.toString()     // Catch:{ all -> 0x00c2 }
            android.util.Log.v(r0, r8)     // Catch:{ all -> 0x00c2 }
        L_0x00b8:
            p020a2.C2133b.m1492d()
            return r9
        L_0x00bc:
            if (r5 == 0) goto L_0x00c1
            r5.close()     // Catch:{ IOException -> 0x00c1 }
        L_0x00c1:
            throw r8     // Catch:{ all -> 0x00c2 }
        L_0x00c2:
            r8 = move-exception
            p020a2.C2133b.m1492d()
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.load.resource.bitmap.C4450c.mo31397a(g1.c, java.io.File, d1.g):boolean");
    }
}
