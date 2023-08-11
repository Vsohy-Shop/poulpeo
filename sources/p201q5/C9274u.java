package p201q5;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import p231t4.C9713p;

/* renamed from: q5.u */
/* compiled from: com.google.android.gms:play-services-measurement-base@@20.0.0 */
public final class C9274u {
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0038 A[Catch:{ IOException | ClassNotFoundException -> 0x0041 }] */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x003d A[Catch:{ IOException | ClassNotFoundException -> 0x0041 }] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.Object m19048a(java.lang.Object r4) {
        /*
            r0 = 0
            if (r4 == 0) goto L_0x0041
            java.io.ByteArrayOutputStream r1 = new java.io.ByteArrayOutputStream     // Catch:{ all -> 0x0032 }
            r1.<init>()     // Catch:{ all -> 0x0032 }
            java.io.ObjectOutputStream r2 = new java.io.ObjectOutputStream     // Catch:{ all -> 0x0032 }
            r2.<init>(r1)     // Catch:{ all -> 0x0032 }
            r2.writeObject(r4)     // Catch:{ all -> 0x002e }
            r2.flush()     // Catch:{ all -> 0x002e }
            java.io.ObjectInputStream r4 = new java.io.ObjectInputStream     // Catch:{ all -> 0x002e }
            java.io.ByteArrayInputStream r3 = new java.io.ByteArrayInputStream     // Catch:{ all -> 0x002e }
            byte[] r1 = r1.toByteArray()     // Catch:{ all -> 0x002e }
            r3.<init>(r1)     // Catch:{ all -> 0x002e }
            r4.<init>(r3)     // Catch:{ all -> 0x002e }
            java.lang.Object r1 = r4.readObject()     // Catch:{ all -> 0x002c }
            r2.close()     // Catch:{ IOException | ClassNotFoundException -> 0x0041 }
            r4.close()     // Catch:{ IOException | ClassNotFoundException -> 0x0041 }
            return r1
        L_0x002c:
            r1 = move-exception
            goto L_0x0036
        L_0x002e:
            r4 = move-exception
            r1 = r4
            r4 = r0
            goto L_0x0036
        L_0x0032:
            r4 = move-exception
            r1 = r4
            r4 = r0
            r2 = r4
        L_0x0036:
            if (r2 == 0) goto L_0x003b
            r2.close()     // Catch:{ IOException | ClassNotFoundException -> 0x0041 }
        L_0x003b:
            if (r4 == 0) goto L_0x0040
            r4.close()     // Catch:{ IOException | ClassNotFoundException -> 0x0041 }
        L_0x0040:
            throw r1     // Catch:{ IOException | ClassNotFoundException -> 0x0041 }
        L_0x0041:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p201q5.C9274u.m19048a(java.lang.Object):java.lang.Object");
    }

    /* renamed from: b */
    public static String m19049b(String str, String[] strArr, String[] strArr2) {
        C9713p.m20275j(strArr);
        C9713p.m20275j(strArr2);
        int min = Math.min(strArr.length, strArr2.length);
        for (int i = 0; i < min; i++) {
            String str2 = strArr[i];
            if ((str == null && str2 == null) || (str != null && str.equals(str2))) {
                return strArr2[i];
            }
        }
        return null;
    }

    /* renamed from: c */
    public static String m19050c(Context context, String str, String str2) {
        C9713p.m20275j(context);
        Resources resources = context.getResources();
        if (TextUtils.isEmpty(str2)) {
            str2 = C9264k.m19025a(context);
        }
        return C9264k.m19026b("google_app_id", resources, str2);
    }
}
