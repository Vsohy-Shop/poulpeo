package com.google.android.play.core.assetpacks;

import android.content.Context;
import androidx.annotation.Nullable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import p037b6.C2893a0;
import p037b6.C2900e;

/* renamed from: com.google.android.play.core.assetpacks.z */
final class C6792z {

    /* renamed from: c */
    private static final C2900e f8910c = new C2900e("AssetPackStorage");

    /* renamed from: d */
    private static final long f8911d;

    /* renamed from: e */
    private static final long f8912e;

    /* renamed from: a */
    private final Context f8913a;

    /* renamed from: b */
    private final C6701c2 f8914b;

    static {
        TimeUnit timeUnit = TimeUnit.DAYS;
        f8911d = timeUnit.toMillis(14);
        f8912e = timeUnit.toMillis(28);
    }

    C6792z(Context context, C6701c2 c2Var) {
        this.f8913a = context;
        this.f8914b = c2Var;
    }

    /* renamed from: B */
    private final File m11569B(String str) {
        return new File(m11574G(), str);
    }

    /* renamed from: C */
    private final File m11570C(String str, int i, long j) {
        return new File(mo39390m(str, i, j), "merge.tmp");
    }

    /* renamed from: D */
    private final List<File> m11571D() {
        ArrayList arrayList = new ArrayList();
        try {
            if (m11574G().exists()) {
                if (m11574G().listFiles() != null) {
                    for (File file : m11574G().listFiles()) {
                        if (!file.getCanonicalPath().equals(m11572E().getCanonicalPath())) {
                            arrayList.add(file);
                        }
                    }
                    return arrayList;
                }
            }
            return arrayList;
        } catch (IOException e) {
            f8910c.mo28423e("Could not process directory while scanning installed packs. %s", e);
        }
    }

    /* renamed from: E */
    private final File m11572E() {
        return new File(m11574G(), "_tmp");
    }

    /* renamed from: F */
    private final File m11573F(String str, int i, long j) {
        return new File(new File(new File(m11572E(), str), String.valueOf(i)), String.valueOf(j));
    }

    /* renamed from: G */
    private final File m11574G() {
        return new File(this.f8913a.getFilesDir(), "assetpacks");
    }

    /* renamed from: a */
    private final File m11575a(String str, int i) {
        return new File(m11569B(str), String.valueOf(i));
    }

    /* renamed from: e */
    private static void m11576e(File file) {
        if (file.listFiles() != null && file.listFiles().length > 1) {
            long h = m11577h(file);
            for (File file2 : file.listFiles()) {
                if (!file2.getName().equals(String.valueOf(h)) && !file2.getName().equals("stale.tmp")) {
                    m11578q(file2);
                }
            }
        }
    }

    /* renamed from: h */
    private static long m11577h(File file) {
        if (!file.exists()) {
            return -1;
        }
        ArrayList arrayList = new ArrayList();
        try {
            for (File file2 : file.listFiles()) {
                if (!file2.getName().equals("stale.tmp")) {
                    arrayList.add(Long.valueOf(file2.getName()));
                }
            }
        } catch (NumberFormatException e) {
            f8910c.mo28422d(e, "Corrupt asset pack directories.", new Object[0]);
        }
        if (arrayList.isEmpty()) {
            return -1;
        }
        Collections.sort(arrayList);
        return ((Long) arrayList.get(arrayList.size() - 1)).longValue();
    }

    /* renamed from: q */
    private static boolean m11578q(File file) {
        boolean z;
        File[] listFiles = file.listFiles();
        if (listFiles != null) {
            z = true;
            for (File q : listFiles) {
                z &= m11578q(q);
            }
        } else {
            z = true;
        }
        if (file.delete() && true == z) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: A */
    public final void mo39380A(String str, int i, long j) {
        if (m11573F(str, i, j).exists()) {
            m11578q(m11573F(str, i, j));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final File mo39381b(String str, int i, long j) {
        return new File(m11575a(str, i), String.valueOf(j));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final File mo39382c(String str, int i, long j, String str2) {
        return new File(new File(new File(m11573F(str, i, j), "_slices"), "_unverified"), str2);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final Map<String, C6688a> mo39383d() {
        HashMap hashMap = new HashMap();
        try {
            for (File next : m11571D()) {
                C6688a i = mo39386i(next.getName());
                if (i != null) {
                    hashMap.put(next.getName(), i);
                }
            }
        } catch (IOException e) {
            f8910c.mo28423e("Could not process directory while scanning installed packs: %s", e);
        }
        return hashMap;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public final void mo39384f(String str, int i, long j, int i2) {
        File C = m11570C(str, i, j);
        Properties properties = new Properties();
        properties.put("numberOfMerges", String.valueOf(i2));
        C.getParentFile().mkdirs();
        C.createNewFile();
        FileOutputStream fileOutputStream = new FileOutputStream(C);
        properties.store(fileOutputStream, (String) null);
        fileOutputStream.close();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public final void mo39385g(List<String> list) {
        int a = this.f8914b.mo39276a();
        List<File> D = m11571D();
        int size = D.size();
        for (int i = 0; i < size; i++) {
            File file = D.get(i);
            if (!list.contains(file.getName()) && m11577h(file) != ((long) a)) {
                m11578q(file);
            }
        }
    }

    /* access modifiers changed from: package-private */
    @Nullable
    /* renamed from: i */
    public final C6688a mo39386i(String str) {
        String o = mo39392o(str);
        if (o == null) {
            return null;
        }
        File file = new File(o, "assets");
        if (file.isDirectory()) {
            return C6688a.m11330a(o, file.getCanonicalPath());
        }
        f8910c.mo28423e("Failed to find assets directory: %s", file);
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public final File mo39387j(String str, int i, long j) {
        return new File(mo39381b(str, i, j), "_metadata");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public final File mo39388k(String str, int i, long j, String str2) {
        return new File(new File(new File(m11573F(str, i, j), "_slices"), "_verified"), str2);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public final Map<String, Long> mo39389l() {
        HashMap hashMap = new HashMap();
        for (String next : mo39383d().keySet()) {
            hashMap.put(next, Long.valueOf(mo39400x(next)));
        }
        return hashMap;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public final File mo39390m(String str, int i, long j) {
        return new File(m11573F(str, i, j), "_packs");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public final File mo39391n(String str, int i, long j, String str2) {
        return new File(mo39401y(str, i, j, str2), "checkpoint.dat");
    }

    /* access modifiers changed from: package-private */
    @Nullable
    /* renamed from: o */
    public final String mo39392o(String str) {
        int length;
        File file = new File(m11574G(), str);
        if (!file.exists()) {
            f8910c.mo28421c("Pack not found with pack name: %s", str);
            return null;
        }
        File file2 = new File(file, String.valueOf(this.f8914b.mo39276a()));
        if (!file2.exists()) {
            f8910c.mo28421c("Pack not found with pack name: %s app version: %s", str, Integer.valueOf(this.f8914b.mo39276a()));
            return null;
        }
        File[] listFiles = file2.listFiles();
        if (listFiles == null || (length = listFiles.length) == 0) {
            f8910c.mo28421c("No pack version found for pack name: %s app version: %s", str, Integer.valueOf(this.f8914b.mo39276a()));
            return null;
        } else if (length <= 1) {
            return listFiles[0].getCanonicalPath();
        } else {
            f8910c.mo28423e("Multiple pack versions found for pack name: %s app version: %s", str, Integer.valueOf(this.f8914b.mo39276a()));
            return null;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p */
    public final void mo39393p() {
        List<File> D = m11571D();
        int size = D.size();
        for (int i = 0; i < size; i++) {
            File file = D.get(i);
            if (file.listFiles() != null) {
                m11576e(file);
                long h = m11577h(file);
                if (((long) this.f8914b.mo39276a()) != h) {
                    try {
                        new File(new File(file, String.valueOf(h)), "stale.tmp").createNewFile();
                    } catch (IOException unused) {
                        f8910c.mo28423e("Could not write staleness marker.", new Object[0]);
                    }
                }
                for (File e : file.listFiles()) {
                    m11576e(e);
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: r */
    public final int mo39394r(String str, int i, long j) {
        File C = m11570C(str, i, j);
        if (!C.exists()) {
            return 0;
        }
        Properties properties = new Properties();
        FileInputStream fileInputStream = new FileInputStream(C);
        try {
            properties.load(fileInputStream);
            fileInputStream.close();
            if (properties.getProperty("numberOfMerges") != null) {
                try {
                    return Integer.parseInt(properties.getProperty("numberOfMerges"));
                } catch (NumberFormatException e) {
                    throw new C6761r0("Merge checkpoint file corrupt.", (Exception) e);
                }
            } else {
                throw new C6761r0("Merge checkpoint file corrupt.");
            }
        } catch (Throwable th) {
            C2893a0.m2299a(th, th);
        }
        throw th;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: s */
    public final File mo39395s(String str, int i, long j, String str2) {
        return new File(mo39401y(str, i, j, str2), "checkpoint_ext.dat");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: t */
    public final boolean mo39396t(String str) {
        if (!m11569B(str).exists()) {
            return true;
        }
        return m11578q(m11569B(str));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: u */
    public final int mo39397u(String str) {
        return (int) m11577h(m11569B(str));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: v */
    public final File mo39398v(String str, int i, long j) {
        return new File(new File(m11573F(str, i, j), "_slices"), "_metadata");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: w */
    public final File mo39399w(String str, int i, long j, String str2) {
        return new File(mo39401y(str, i, j, str2), "slice.zip");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: x */
    public final long mo39400x(String str) {
        return m11577h(m11575a(str, mo39397u(str)));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: y */
    public final File mo39401y(String str, int i, long j, String str2) {
        return new File(mo39398v(str, i, j), str2);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: z */
    public final void mo39402z() {
        m11578q(m11574G());
    }
}
