package p360id;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.widget.Toast;
import java.io.File;
import kotlin.jvm.internal.C12775o;
import p446vd.C13633n;

/* renamed from: id.d */
/* compiled from: KContextExtensions.kt */
public final class C12136d {
    /* renamed from: b */
    private static final void m26460b(Context context, String str) {
        String[] list;
        File file = new File(str);
        if (file.exists()) {
            if (file.isDirectory() && (list = file.list()) != null) {
                for (String str2 : list) {
                    m26460b(context, str + "/" + str2);
                }
            }
            file.delete();
        }
    }

    /* renamed from: c */
    public static final void m26461c(Context context) {
        C12775o.m28639i(context, "<this>");
        String str = null;
        File externalFilesDir = context.getExternalFilesDir((String) null);
        if (externalFilesDir != null) {
            str = externalFilesDir.getPath();
        }
        if (str != null) {
            m26460b(context, str);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0034, code lost:
        r4 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0035, code lost:
        p392mf.C12941b.m29245a(r2, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0038, code lost:
        throw r4;
     */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.io.File m26462d(android.content.Context r2, java.lang.String r3, java.lang.String r4) {
        /*
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.C12775o.m28639i(r2, r0)
            java.lang.String r0 = "fileName"
            kotlin.jvm.internal.C12775o.m28639i(r3, r0)
            java.lang.String r0 = "base64String"
            kotlin.jvm.internal.C12775o.m28639i(r4, r0)
            java.lang.String r2 = m26465g(r2, r3)
            r3 = 0
            if (r2 != 0) goto L_0x0017
            return r3
        L_0x0017:
            r0 = 0
            byte[] r4 = android.util.Base64.decode(r4, r0)
            java.io.File r1 = new java.io.File
            r1.<init>(r2)
            java.io.FileOutputStream r2 = new java.io.FileOutputStream
            r2.<init>(r1, r0)
            r2.write(r4)     // Catch:{ all -> 0x0032 }
            r2.flush()     // Catch:{ all -> 0x0032 }
            ef.v r4 = p336ef.C11921v.f18618a     // Catch:{ all -> 0x0032 }
            p392mf.C12941b.m29245a(r2, r3)
            return r1
        L_0x0032:
            r3 = move-exception
            throw r3     // Catch:{ all -> 0x0034 }
        L_0x0034:
            r4 = move-exception
            p392mf.C12941b.m29245a(r2, r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: p360id.C12136d.m26462d(android.content.Context, java.lang.String, java.lang.String):java.io.File");
    }

    /* renamed from: e */
    public static final int m26463e(Context context, int i) {
        C12775o.m28639i(context, "<this>");
        return (int) (((double) (((float) i) * context.getResources().getDisplayMetrics().density)) + 0.5d);
    }

    /* renamed from: f */
    public static final File m26464f(Context context, String str) {
        C12775o.m28639i(context, "<this>");
        C12775o.m28639i(str, "fileName");
        String g = m26465g(context, str);
        if (g == null) {
            return null;
        }
        return new File(g);
    }

    /* renamed from: g */
    private static final String m26465g(Context context, String str) {
        String str2;
        File externalFilesDir = context.getExternalFilesDir((String) null);
        if (externalFilesDir != null) {
            str2 = externalFilesDir.getPath();
        } else {
            str2 = null;
        }
        if (str2 == null) {
            return null;
        }
        File file = new File(str2 + "/tmp");
        if (!file.exists()) {
            file.mkdir();
        }
        return file.getPath() + "/" + str;
    }

    /* renamed from: h */
    public static final int m26466h(Context context, int i) {
        C12775o.m28639i(context, "<this>");
        return (int) (((double) (((float) i) / context.getResources().getDisplayMetrics().density)) + 0.5d);
    }

    /* renamed from: i */
    public static final void m26467i(Context context, int i) {
        C12775o.m28639i(context, "<this>");
        m26468j(context, context.getString(i));
    }

    /* renamed from: j */
    public static final void m26468j(Context context, String str) {
        boolean z;
        C12775o.m28639i(context, "<this>");
        int i = 0;
        if (str == null || str.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            C13633n.m31163s(Context.class, "Text is null for toast in " + context.getClass().getSimpleName());
            return;
        }
        if (str.length() > 50) {
            i = 1;
        }
        new Handler(Looper.getMainLooper()).post(new C12135c(context, str, i));
    }

    /* access modifiers changed from: private */
    /* renamed from: k */
    public static final void m26469k(Context context, String str, int i) {
        C12775o.m28639i(context, "$this_toast");
        Toast.makeText(context, str, i).show();
    }
}
