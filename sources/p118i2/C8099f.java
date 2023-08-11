package p118i2;

import android.os.AsyncTask;
import java.io.File;
import kotlin.jvm.internal.C12775o;
import p251v2.C9925a;

/* renamed from: i2.f */
/* compiled from: FileDownloadTask.kt */
public final class C8099f extends AsyncTask<String, Void, Boolean> {

    /* renamed from: a */
    private final String f11388a;

    /* renamed from: b */
    private final File f11389b;

    /* renamed from: c */
    private final C8100a f11390c;

    /* renamed from: i2.f$a */
    /* compiled from: FileDownloadTask.kt */
    public interface C8100a {
        /* renamed from: a */
        void mo41936a(File file);
    }

    public C8099f(String str, File file, C8100a aVar) {
        C12775o.m28639i(str, "uriStr");
        C12775o.m28639i(file, "destFile");
        C12775o.m28639i(aVar, "onSuccess");
        this.f11388a = str;
        this.f11389b = file;
        this.f11390c = aVar;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(3:13|14|15) */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0053, code lost:
        return java.lang.Boolean.FALSE;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0051 */
    @androidx.annotation.VisibleForTesting(otherwise = 4)
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Boolean mo41932a(java.lang.String... r5) {
        /*
            r4 = this;
            boolean r0 = p251v2.C9925a.m20734d(r4)
            r1 = 0
            if (r0 == 0) goto L_0x0008
            return r1
        L_0x0008:
            boolean r0 = p251v2.C9925a.m20734d(r4)     // Catch:{ all -> 0x0059 }
            if (r0 == 0) goto L_0x000f
            return r1
        L_0x000f:
            java.lang.String r0 = "args"
            kotlin.jvm.internal.C12775o.m28639i(r5, r0)     // Catch:{ all -> 0x0054 }
            java.net.URL r5 = new java.net.URL     // Catch:{ Exception -> 0x0051 }
            java.lang.String r0 = r4.f11388a     // Catch:{ Exception -> 0x0051 }
            r5.<init>(r0)     // Catch:{ Exception -> 0x0051 }
            java.net.URLConnection r0 = r5.openConnection()     // Catch:{ Exception -> 0x0051 }
            java.lang.String r2 = "conn"
            kotlin.jvm.internal.C12775o.m28638h(r0, r2)     // Catch:{ Exception -> 0x0051 }
            int r0 = r0.getContentLength()     // Catch:{ Exception -> 0x0051 }
            java.io.DataInputStream r2 = new java.io.DataInputStream     // Catch:{ Exception -> 0x0051 }
            java.io.InputStream r5 = r5.openStream()     // Catch:{ Exception -> 0x0051 }
            r2.<init>(r5)     // Catch:{ Exception -> 0x0051 }
            byte[] r5 = new byte[r0]     // Catch:{ Exception -> 0x0051 }
            r2.readFully(r5)     // Catch:{ Exception -> 0x0051 }
            r2.close()     // Catch:{ Exception -> 0x0051 }
            java.io.DataOutputStream r0 = new java.io.DataOutputStream     // Catch:{ Exception -> 0x0051 }
            java.io.FileOutputStream r2 = new java.io.FileOutputStream     // Catch:{ Exception -> 0x0051 }
            java.io.File r3 = r4.f11389b     // Catch:{ Exception -> 0x0051 }
            r2.<init>(r3)     // Catch:{ Exception -> 0x0051 }
            r0.<init>(r2)     // Catch:{ Exception -> 0x0051 }
            r0.write(r5)     // Catch:{ Exception -> 0x0051 }
            r0.flush()     // Catch:{ Exception -> 0x0051 }
            r0.close()     // Catch:{ Exception -> 0x0051 }
            java.lang.Boolean r5 = java.lang.Boolean.TRUE     // Catch:{ Exception -> 0x0051 }
            return r5
        L_0x0051:
            java.lang.Boolean r5 = java.lang.Boolean.FALSE     // Catch:{ all -> 0x0054 }
            return r5
        L_0x0054:
            r5 = move-exception
            p251v2.C9925a.m20732b(r5, r4)     // Catch:{ all -> 0x0059 }
            return r1
        L_0x0059:
            r5 = move-exception
            p251v2.C9925a.m20732b(r5, r4)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p118i2.C8099f.mo41932a(java.lang.String[]):java.lang.Boolean");
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo41933b(boolean z) {
        if (!C9925a.m20734d(this)) {
            try {
                if (!C9925a.m20734d(this) && z) {
                    this.f11390c.mo41936a(this.f11389b);
                }
            } catch (Throwable th) {
                C9925a.m20732b(th, this);
            }
        }
    }

    public /* bridge */ /* synthetic */ Object doInBackground(Object[] objArr) {
        if (C9925a.m20734d(this)) {
            return null;
        }
        try {
            if (C9925a.m20734d(this)) {
                return null;
            }
            return mo41932a((String[]) objArr);
        } catch (Throwable th) {
            C9925a.m20732b(th, this);
            return null;
        }
    }

    public /* bridge */ /* synthetic */ void onPostExecute(Object obj) {
        if (!C9925a.m20734d(this)) {
            try {
                if (!C9925a.m20734d(this)) {
                    mo41933b(((Boolean) obj).booleanValue());
                }
            } catch (Throwable th) {
                C9925a.m20732b(th, this);
            }
        }
    }
}
