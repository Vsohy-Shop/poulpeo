package com.google.firebase.installations;

import android.util.Log;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;

/* renamed from: com.google.firebase.installations.b */
/* compiled from: CrossProcessLock */
class C6943b {

    /* renamed from: a */
    private final FileChannel f9201a;

    /* renamed from: b */
    private final FileLock f9202b;

    private C6943b(FileChannel fileChannel, FileLock fileLock) {
        this.f9201a = fileChannel;
        this.f9202b = fileLock;
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x003c A[SYNTHETIC, Splitter:B:15:0x003c] */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0041 A[SYNTHETIC, Splitter:B:19:0x0041] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static com.google.firebase.installations.C6943b m12124a(android.content.Context r4, java.lang.String r5) {
        /*
            r0 = 0
            java.io.File r1 = new java.io.File     // Catch:{ IOException -> 0x0030, Error -> 0x002e, OverlappingFileLockException -> 0x002c }
            java.io.File r4 = r4.getFilesDir()     // Catch:{ IOException -> 0x0030, Error -> 0x002e, OverlappingFileLockException -> 0x002c }
            r1.<init>(r4, r5)     // Catch:{ IOException -> 0x0030, Error -> 0x002e, OverlappingFileLockException -> 0x002c }
            java.io.RandomAccessFile r4 = new java.io.RandomAccessFile     // Catch:{ IOException -> 0x0030, Error -> 0x002e, OverlappingFileLockException -> 0x002c }
            java.lang.String r5 = "rw"
            r4.<init>(r1, r5)     // Catch:{ IOException -> 0x0030, Error -> 0x002e, OverlappingFileLockException -> 0x002c }
            java.nio.channels.FileChannel r4 = r4.getChannel()     // Catch:{ IOException -> 0x0030, Error -> 0x002e, OverlappingFileLockException -> 0x002c }
            java.nio.channels.FileLock r5 = r4.lock()     // Catch:{ IOException -> 0x0029, Error -> 0x0027, OverlappingFileLockException -> 0x0025 }
            com.google.firebase.installations.b r1 = new com.google.firebase.installations.b     // Catch:{ IOException -> 0x0023, Error -> 0x0021, OverlappingFileLockException -> 0x001f }
            r1.<init>(r4, r5)     // Catch:{ IOException -> 0x0023, Error -> 0x0021, OverlappingFileLockException -> 0x001f }
            return r1
        L_0x001f:
            r1 = move-exception
            goto L_0x0033
        L_0x0021:
            r1 = move-exception
            goto L_0x0033
        L_0x0023:
            r1 = move-exception
            goto L_0x0033
        L_0x0025:
            r1 = move-exception
            goto L_0x002a
        L_0x0027:
            r1 = move-exception
            goto L_0x002a
        L_0x0029:
            r1 = move-exception
        L_0x002a:
            r5 = r0
            goto L_0x0033
        L_0x002c:
            r1 = move-exception
            goto L_0x0031
        L_0x002e:
            r1 = move-exception
            goto L_0x0031
        L_0x0030:
            r1 = move-exception
        L_0x0031:
            r4 = r0
            r5 = r4
        L_0x0033:
            java.lang.String r2 = "CrossProcessLock"
            java.lang.String r3 = "encountered error while creating and acquiring the lock, ignoring"
            android.util.Log.e(r2, r3, r1)
            if (r5 == 0) goto L_0x003f
            r5.release()     // Catch:{ IOException -> 0x003f }
        L_0x003f:
            if (r4 == 0) goto L_0x0044
            r4.close()     // Catch:{ IOException -> 0x0044 }
        L_0x0044:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.installations.C6943b.m12124a(android.content.Context, java.lang.String):com.google.firebase.installations.b");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo39831b() {
        try {
            this.f9202b.release();
            this.f9201a.close();
        } catch (IOException e) {
            Log.e("CrossProcessLock", "encountered error while releasing, ignoring", e);
        }
    }
}
