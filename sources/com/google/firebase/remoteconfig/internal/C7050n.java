package com.google.firebase.remoteconfig.internal;

import android.content.Context;
import androidx.annotation.AnyThread;
import androidx.annotation.GuardedBy;
import com.adjust.sdk.Constants;
import java.io.FileOutputStream;
import java.util.HashMap;
import java.util.Map;

@AnyThread
/* renamed from: com.google.firebase.remoteconfig.internal.n */
/* compiled from: ConfigStorageClient */
public class C7050n {
    @GuardedBy("ConfigStorageClient.class")

    /* renamed from: c */
    private static final Map<String, C7050n> f9483c = new HashMap();

    /* renamed from: a */
    private final Context f9484a;

    /* renamed from: b */
    private final String f9485b;

    private C7050n(Context context, String str) {
        this.f9484a = context;
        this.f9485b = str;
    }

    /* renamed from: c */
    public static synchronized C7050n m12577c(Context context, String str) {
        C7050n nVar;
        synchronized (C7050n.class) {
            Map<String, C7050n> map = f9483c;
            if (!map.containsKey(str)) {
                map.put(str, new C7050n(context, str));
            }
            nVar = map.get(str);
        }
        return nVar;
    }

    /* renamed from: a */
    public synchronized Void mo40074a() {
        this.f9484a.deleteFile(this.f9485b);
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public String mo40075b() {
        return this.f9485b;
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0031 A[SYNTHETIC, Splitter:B:14:0x0031] */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0038 A[Catch:{ FileNotFoundException | JSONException -> 0x0035, all -> 0x002b }] */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized com.google.firebase.remoteconfig.internal.C7037e mo40076d() {
        /*
            r6 = this;
            monitor-enter(r6)
            r0 = 0
            android.content.Context r1 = r6.f9484a     // Catch:{ FileNotFoundException | JSONException -> 0x0035, all -> 0x002b }
            java.lang.String r2 = r6.f9485b     // Catch:{ FileNotFoundException | JSONException -> 0x0035, all -> 0x002b }
            java.io.FileInputStream r1 = r1.openFileInput(r2)     // Catch:{ FileNotFoundException | JSONException -> 0x0035, all -> 0x002b }
            int r2 = r1.available()     // Catch:{ FileNotFoundException | JSONException -> 0x0036, all -> 0x0029 }
            byte[] r3 = new byte[r2]     // Catch:{ FileNotFoundException | JSONException -> 0x0036, all -> 0x0029 }
            r4 = 0
            r1.read(r3, r4, r2)     // Catch:{ FileNotFoundException | JSONException -> 0x0036, all -> 0x0029 }
            java.lang.String r2 = new java.lang.String     // Catch:{ FileNotFoundException | JSONException -> 0x0036, all -> 0x0029 }
            java.lang.String r4 = "UTF-8"
            r2.<init>(r3, r4)     // Catch:{ FileNotFoundException | JSONException -> 0x0036, all -> 0x0029 }
            org.json.JSONObject r3 = new org.json.JSONObject     // Catch:{ FileNotFoundException | JSONException -> 0x0036, all -> 0x0029 }
            r3.<init>(r2)     // Catch:{ FileNotFoundException | JSONException -> 0x0036, all -> 0x0029 }
            com.google.firebase.remoteconfig.internal.e r0 = com.google.firebase.remoteconfig.internal.C7037e.m12513b(r3)     // Catch:{ FileNotFoundException | JSONException -> 0x0036, all -> 0x0029 }
            r1.close()     // Catch:{ all -> 0x003c }
            monitor-exit(r6)
            return r0
        L_0x0029:
            r0 = move-exception
            goto L_0x002f
        L_0x002b:
            r1 = move-exception
            r5 = r1
            r1 = r0
            r0 = r5
        L_0x002f:
            if (r1 == 0) goto L_0x0034
            r1.close()     // Catch:{ all -> 0x003c }
        L_0x0034:
            throw r0     // Catch:{ all -> 0x003c }
        L_0x0035:
            r1 = r0
        L_0x0036:
            if (r1 == 0) goto L_0x003f
            r1.close()     // Catch:{ all -> 0x003c }
            goto L_0x003f
        L_0x003c:
            r0 = move-exception
            monitor-exit(r6)
            throw r0
        L_0x003f:
            monitor-exit(r6)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.remoteconfig.internal.C7050n.mo40076d():com.google.firebase.remoteconfig.internal.e");
    }

    /* renamed from: e */
    public synchronized Void mo40077e(C7037e eVar) {
        FileOutputStream openFileOutput = this.f9484a.openFileOutput(this.f9485b, 0);
        try {
            openFileOutput.write(eVar.toString().getBytes(Constants.ENCODING));
        } finally {
            openFileOutput.close();
        }
        return null;
    }
}
