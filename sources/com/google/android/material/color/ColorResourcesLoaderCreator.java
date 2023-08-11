package com.google.android.material.color;

import androidx.annotation.RequiresApi;

@RequiresApi(30)
final class ColorResourcesLoaderCreator {
    private static final String TAG = "ColorResourcesLoaderCreator";

    private ColorResourcesLoaderCreator() {
    }

    /* JADX WARNING: Removed duplicated region for block: B:42:0x0069 A[SYNTHETIC, Splitter:B:42:0x0069] */
    @androidx.annotation.Nullable
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static android.content.res.loader.ResourcesLoader create(@androidx.annotation.NonNull android.content.Context r4, @androidx.annotation.NonNull java.util.Map<java.lang.Integer, java.lang.Integer> r5) {
        /*
            r0 = 0
            byte[] r4 = com.google.android.material.color.ColorResourcesTableCreator.create(r4, r5)     // Catch:{ Exception -> 0x006d }
            java.lang.String r5 = TAG     // Catch:{ Exception -> 0x006d }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x006d }
            r1.<init>()     // Catch:{ Exception -> 0x006d }
            java.lang.String r2 = "Table created, length: "
            r1.append(r2)     // Catch:{ Exception -> 0x006d }
            int r2 = r4.length     // Catch:{ Exception -> 0x006d }
            r1.append(r2)     // Catch:{ Exception -> 0x006d }
            java.lang.String r1 = r1.toString()     // Catch:{ Exception -> 0x006d }
            android.util.Log.i(r5, r1)     // Catch:{ Exception -> 0x006d }
            int r5 = r4.length     // Catch:{ Exception -> 0x006d }
            if (r5 != 0) goto L_0x0020
            return r0
        L_0x0020:
            java.lang.String r5 = "temp.arsc"
            r1 = 0
            java.io.FileDescriptor r5 = android.system.Os.memfd_create(r5, r1)     // Catch:{ all -> 0x0065 }
            java.io.FileOutputStream r1 = new java.io.FileOutputStream     // Catch:{ all -> 0x0063 }
            r1.<init>(r5)     // Catch:{ all -> 0x0063 }
            r1.write(r4)     // Catch:{ all -> 0x0059 }
            android.os.ParcelFileDescriptor r4 = android.os.ParcelFileDescriptor.dup(r5)     // Catch:{ all -> 0x0059 }
            android.content.res.loader.ResourcesLoader r2 = new android.content.res.loader.ResourcesLoader     // Catch:{ all -> 0x004d }
            r2.<init>()     // Catch:{ all -> 0x004d }
            android.content.res.loader.ResourcesProvider r3 = android.content.res.loader.ResourcesProvider.loadFromTable(r4, r0)     // Catch:{ all -> 0x004d }
            r2.addProvider(r3)     // Catch:{ all -> 0x004d }
            if (r4 == 0) goto L_0x0044
            r4.close()     // Catch:{ all -> 0x0059 }
        L_0x0044:
            r1.close()     // Catch:{ all -> 0x0063 }
            if (r5 == 0) goto L_0x004c
            android.system.Os.close(r5)     // Catch:{ Exception -> 0x006d }
        L_0x004c:
            return r2
        L_0x004d:
            r2 = move-exception
            if (r4 == 0) goto L_0x0058
            r4.close()     // Catch:{ all -> 0x0054 }
            goto L_0x0058
        L_0x0054:
            r4 = move-exception
            r2.addSuppressed(r4)     // Catch:{ all -> 0x0059 }
        L_0x0058:
            throw r2     // Catch:{ all -> 0x0059 }
        L_0x0059:
            r4 = move-exception
            r1.close()     // Catch:{ all -> 0x005e }
            goto L_0x0062
        L_0x005e:
            r1 = move-exception
            r4.addSuppressed(r1)     // Catch:{ all -> 0x0063 }
        L_0x0062:
            throw r4     // Catch:{ all -> 0x0063 }
        L_0x0063:
            r4 = move-exception
            goto L_0x0067
        L_0x0065:
            r4 = move-exception
            r5 = r0
        L_0x0067:
            if (r5 == 0) goto L_0x006c
            android.system.Os.close(r5)     // Catch:{ Exception -> 0x006d }
        L_0x006c:
            throw r4     // Catch:{ Exception -> 0x006d }
        L_0x006d:
            r4 = move-exception
            java.lang.String r5 = TAG
            java.lang.String r1 = "Failed to create the ColorResourcesTableCreator."
            android.util.Log.e(r5, r1, r4)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.color.ColorResourcesLoaderCreator.create(android.content.Context, java.util.Map):android.content.res.loader.ResourcesLoader");
    }
}
