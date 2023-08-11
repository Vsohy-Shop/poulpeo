package com.google.android.play.core.assetpacks;

import android.content.Context;
import android.util.Base64;
import java.io.File;
import java.io.FileInputStream;
import java.security.MessageDigest;
import java.util.List;
import p037b6.C2893a0;
import p075e6.C7479a;
import p287y5.C10687a;

/* renamed from: com.google.android.play.core.assetpacks.t1 */
public final class C6770t1 {

    /* renamed from: a */
    private static C10687a f8850a;

    /* renamed from: a */
    static String m11531a(List<File> list) {
        int read;
        MessageDigest instance = MessageDigest.getInstance("SHA256");
        byte[] bArr = new byte[8192];
        for (File fileInputStream : list) {
            FileInputStream fileInputStream2 = new FileInputStream(fileInputStream);
            do {
                try {
                    read = fileInputStream2.read(bArr);
                    if (read > 0) {
                        instance.update(bArr, 0, read);
                    }
                } catch (Throwable th) {
                    C2893a0.m2299a(th, th);
                }
            } while (read != -1);
            fileInputStream2.close();
        }
        return Base64.encodeToString(instance.digest(), 11);
        throw th;
    }

    /* renamed from: b */
    static synchronized C10687a m11532b(Context context) {
        C10687a aVar;
        synchronized (C6770t1.class) {
            if (f8850a == null) {
                C6741m0 m0Var = new C6741m0((byte[]) null);
                m0Var.mo39332b(new C6775u2(C7479a.m14655a(context)));
                f8850a = m0Var.mo39331a();
            }
            aVar = f8850a;
        }
        return aVar;
    }

    /* renamed from: c */
    public static boolean m11533c(int i) {
        if (i == 1 || i == 7 || i == 2 || i == 3) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    static boolean m11534d(int i, int i2) {
        if (i == 5) {
            if (i2 != 5) {
                return true;
            }
            i = 5;
        }
        if (i == 6 && i2 != 6 && i2 != 5) {
            return true;
        }
        if (i == 4 && i2 != 4) {
            return true;
        }
        if (i == 3 && (i2 == 2 || i2 == 7 || i2 == 1 || i2 == 8)) {
            return true;
        }
        if (i != 2) {
            return false;
        }
        if (i2 == 1 || i2 == 8) {
            return true;
        }
        return false;
    }

    /* renamed from: e */
    static long m11535e(byte[] bArr, int i) {
        return ((long) ((m11537g(bArr, i + 2) << 16) | m11537g(bArr, i))) & 4294967295L;
    }

    /* renamed from: f */
    public static boolean m11536f(int i) {
        if (i == 5 || i == 6 || i == 4) {
            return true;
        }
        return false;
    }

    /* renamed from: g */
    static int m11537g(byte[] bArr, int i) {
        return ((bArr[i + 1] & 255) << 8) | (bArr[i] & 255);
    }

    /* renamed from: h */
    public static boolean m11538h(int i) {
        if (i == 2 || i == 7 || i == 3) {
            return true;
        }
        return false;
    }
}
