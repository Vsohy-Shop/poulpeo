package com.adjust.sdk;

import android.content.Context;
import java.util.concurrent.atomic.AtomicBoolean;

public class InstallReferrerHuawei {
    private static final String REFERRER_PROVIDER_AUTHORITY = "com.huawei.appmarket.commondata";
    private static final String REFERRER_PROVIDER_URI = "content://com.huawei.appmarket.commondata/item/5";
    private Context context;
    private ILogger logger = AdjustFactory.getLogger();
    private final InstallReferrerReadListener referrerCallback;
    private final AtomicBoolean shouldTryToRead;

    public InstallReferrerHuawei(Context context2, InstallReferrerReadListener installReferrerReadListener) {
        this.context = context2;
        this.referrerCallback = installReferrerReadListener;
        this.shouldTryToRead = new AtomicBoolean(true);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0090, code lost:
        if (r10 != null) goto L_0x00a7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x00a5, code lost:
        if (r10 == null) goto L_0x00aa;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x00a7, code lost:
        r10.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x00aa, code lost:
        r1.shouldTryToRead.set(false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x00af, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void readReferrer() {
        /*
            r17 = this;
            r1 = r17
            java.util.concurrent.atomic.AtomicBoolean r0 = r1.shouldTryToRead
            boolean r0 = r0.get()
            r2 = 0
            if (r0 != 0) goto L_0x0015
            com.adjust.sdk.ILogger r0 = r1.logger
            java.lang.String r3 = "Should not try to read Install referrer Huawei"
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r0.debug(r3, r2)
            return
        L_0x0015:
            android.content.Context r0 = r1.context
            java.lang.String r3 = "com.huawei.appmarket.commondata"
            boolean r0 = com.adjust.sdk.Util.resolveContentProvider(r0, r3)
            if (r0 != 0) goto L_0x0020
            return
        L_0x0020:
            java.lang.String r0 = "content://com.huawei.appmarket.commondata/item/5"
            android.net.Uri r0 = android.net.Uri.parse(r0)
            android.content.Context r3 = r1.context
            android.content.ContentResolver r3 = r3.getContentResolver()
            r9 = 1
            java.lang.String[] r7 = new java.lang.String[r9]
            android.content.Context r4 = r1.context
            java.lang.String r4 = r4.getPackageName()
            r7[r2] = r4
            r5 = 0
            r6 = 0
            r8 = 0
            r10 = 0
            r4 = r0
            android.database.Cursor r10 = r3.query(r4, r5, r6, r7, r8)     // Catch:{ Exception -> 0x0095 }
            r3 = 2
            if (r10 == 0) goto L_0x0079
            boolean r4 = r10.moveToFirst()     // Catch:{ Exception -> 0x0095 }
            if (r4 == 0) goto L_0x0079
            java.lang.String r12 = r10.getString(r2)     // Catch:{ Exception -> 0x0095 }
            java.lang.String r0 = r10.getString(r9)     // Catch:{ Exception -> 0x0095 }
            java.lang.String r4 = r10.getString(r3)     // Catch:{ Exception -> 0x0095 }
            com.adjust.sdk.ILogger r5 = r1.logger     // Catch:{ Exception -> 0x0095 }
            java.lang.String r6 = "InstallReferrerHuawei reads referrer[%s] clickTime[%s] installTime[%s]"
            r7 = 3
            java.lang.Object[] r7 = new java.lang.Object[r7]     // Catch:{ Exception -> 0x0095 }
            r7[r2] = r12     // Catch:{ Exception -> 0x0095 }
            r7[r9] = r0     // Catch:{ Exception -> 0x0095 }
            r7[r3] = r4     // Catch:{ Exception -> 0x0095 }
            r5.debug(r6, r7)     // Catch:{ Exception -> 0x0095 }
            long r13 = java.lang.Long.parseLong(r0)     // Catch:{ Exception -> 0x0095 }
            long r15 = java.lang.Long.parseLong(r4)     // Catch:{ Exception -> 0x0095 }
            com.adjust.sdk.ReferrerDetails r0 = new com.adjust.sdk.ReferrerDetails     // Catch:{ Exception -> 0x0095 }
            r11 = r0
            r11.<init>(r12, r13, r15)     // Catch:{ Exception -> 0x0095 }
            com.adjust.sdk.InstallReferrerReadListener r3 = r1.referrerCallback     // Catch:{ Exception -> 0x0095 }
            r3.onInstallReferrerRead(r0)     // Catch:{ Exception -> 0x0095 }
            goto L_0x0090
        L_0x0079:
            com.adjust.sdk.ILogger r4 = r1.logger     // Catch:{ Exception -> 0x0095 }
            java.lang.String r5 = "InstallReferrerHuawei fail to read referrer for package [%s] and content uri [%s]"
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch:{ Exception -> 0x0095 }
            android.content.Context r6 = r1.context     // Catch:{ Exception -> 0x0095 }
            java.lang.String r6 = r6.getPackageName()     // Catch:{ Exception -> 0x0095 }
            r3[r2] = r6     // Catch:{ Exception -> 0x0095 }
            java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x0095 }
            r3[r9] = r0     // Catch:{ Exception -> 0x0095 }
            r4.debug(r5, r3)     // Catch:{ Exception -> 0x0095 }
        L_0x0090:
            if (r10 == 0) goto L_0x00aa
            goto L_0x00a7
        L_0x0093:
            r0 = move-exception
            goto L_0x00b0
        L_0x0095:
            r0 = move-exception
            com.adjust.sdk.ILogger r3 = r1.logger     // Catch:{ all -> 0x0093 }
            java.lang.String r4 = "InstallReferrerHuawei error [%s]"
            java.lang.Object[] r5 = new java.lang.Object[r9]     // Catch:{ all -> 0x0093 }
            java.lang.String r0 = r0.getMessage()     // Catch:{ all -> 0x0093 }
            r5[r2] = r0     // Catch:{ all -> 0x0093 }
            r3.debug(r4, r5)     // Catch:{ all -> 0x0093 }
            if (r10 == 0) goto L_0x00aa
        L_0x00a7:
            r10.close()
        L_0x00aa:
            java.util.concurrent.atomic.AtomicBoolean r0 = r1.shouldTryToRead
            r0.set(r2)
            return
        L_0x00b0:
            if (r10 == 0) goto L_0x00b5
            r10.close()
        L_0x00b5:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.adjust.sdk.InstallReferrerHuawei.readReferrer():void");
    }
}
