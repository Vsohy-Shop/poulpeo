package p025a7;

import android.content.Context;
import androidx.annotation.Nullable;
import java.io.File;
import java.io.FilenameFilter;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import p222s6.C9511f;

/* renamed from: a7.f */
/* compiled from: FileStore */
public class C2217f {

    /* renamed from: a */
    private final File f1001a;

    /* renamed from: b */
    private final File f1002b;

    /* renamed from: c */
    private final File f1003c;

    /* renamed from: d */
    private final File f1004d;

    /* renamed from: e */
    private final File f1005e;

    public C2217f(Context context) {
        File p = m1849p(new File(context.getFilesDir(), ".com.google.firebase.crashlytics.files.v1"));
        this.f1001a = p;
        this.f1002b = m1849p(new File(p, "open-sessions"));
        this.f1003c = m1849p(new File(p, "reports"));
        this.f1004d = m1849p(new File(p, "priority-reports"));
        this.f1005e = m1849p(new File(p, "native-reports"));
    }

    /* renamed from: m */
    private File m1848m(String str) {
        return m1850q(new File(this.f1002b, str));
    }

    /* renamed from: p */
    private static synchronized File m1849p(File file) {
        synchronized (C2217f.class) {
            if (file.exists()) {
                if (file.isDirectory()) {
                    return file;
                }
                C9511f f = C9511f.m19696f();
                f.mo43965b("Unexpected non-directory file: " + file + "; deleting file and creating new directory.");
                file.delete();
            }
            if (file.mkdirs()) {
                return file;
            }
            throw new IllegalStateException("Could not create Crashlytics-specific directory: " + file);
        }
    }

    /* renamed from: q */
    private static File m1850q(File file) {
        file.mkdirs();
        return file;
    }

    /* renamed from: r */
    static boolean m1851r(File file) {
        File[] listFiles = file.listFiles();
        if (listFiles != null) {
            for (File r : listFiles) {
                m1851r(r);
            }
        }
        return file.delete();
    }

    /* renamed from: s */
    private static <T> List<T> m1852s(@Nullable T[] tArr) {
        if (tArr == null) {
            return Collections.emptyList();
        }
        return Arrays.asList(tArr);
    }

    /* renamed from: a */
    public void mo23550a() {
        File[] fileArr = {new File(this.f1001a.getParent(), ".com.google.firebase.crashlytics"), new File(this.f1001a.getParent(), ".com.google.firebase.crashlytics-ndk")};
        for (int i = 0; i < 2; i++) {
            File file = fileArr[i];
            if (file.exists() && m1851r(file)) {
                C9511f f = C9511f.m19696f();
                f.mo43965b("Deleted legacy Crashlytics files from " + file.getPath());
            }
        }
    }

    /* renamed from: b */
    public boolean mo23551b(String str) {
        return m1851r(new File(this.f1002b, str));
    }

    /* renamed from: c */
    public List<String> mo23552c() {
        return m1852s(this.f1002b.list());
    }

    /* renamed from: d */
    public File mo23553d(String str) {
        return new File(this.f1001a, str);
    }

    /* renamed from: e */
    public List<File> mo23554e(FilenameFilter filenameFilter) {
        return m1852s(this.f1001a.listFiles(filenameFilter));
    }

    /* renamed from: f */
    public File mo23555f(String str) {
        return new File(this.f1005e, str);
    }

    /* renamed from: g */
    public List<File> mo23556g() {
        return m1852s(this.f1005e.listFiles());
    }

    /* renamed from: h */
    public File mo23557h(String str) {
        return m1850q(new File(m1848m(str), "native"));
    }

    /* renamed from: i */
    public File mo23558i(String str) {
        return new File(this.f1004d, str);
    }

    /* renamed from: j */
    public List<File> mo23559j() {
        return m1852s(this.f1004d.listFiles());
    }

    /* renamed from: k */
    public File mo23560k(String str) {
        return new File(this.f1003c, str);
    }

    /* renamed from: l */
    public List<File> mo23561l() {
        return m1852s(this.f1003c.listFiles());
    }

    /* renamed from: n */
    public File mo23562n(String str, String str2) {
        return new File(m1848m(str), str2);
    }

    /* renamed from: o */
    public List<File> mo23563o(String str, FilenameFilter filenameFilter) {
        return m1852s(m1848m(str).listFiles(filenameFilter));
    }
}
