package p025a7;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.app.NotificationCompat;
import com.adjust.sdk.Constants;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.concurrent.atomic.AtomicInteger;
import p050c7.C3894e;
import p222s6.C9511f;
import p255v6.C10010p;
import p266w6.C10128g;
import p277x6.C10450a0;
import p277x6.C10494b0;
import p288y6.C10699g;

/* renamed from: a7.e */
/* compiled from: CrashlyticsReportPersistence */
public class C2216e {

    /* renamed from: d */
    private static final Charset f993d = Charset.forName(Constants.ENCODING);

    /* renamed from: e */
    private static final int f994e = 15;

    /* renamed from: f */
    private static final C10699g f995f = new C10699g();

    /* renamed from: g */
    private static final Comparator<? super File> f996g = new C2214c();

    /* renamed from: h */
    private static final FilenameFilter f997h = new C2215d();

    /* renamed from: a */
    private final AtomicInteger f998a = new AtomicInteger(0);

    /* renamed from: b */
    private final C2217f f999b;
    @NonNull

    /* renamed from: c */
    private final C3894e f1000c;

    public C2216e(C2217f fVar, C3894e eVar) {
        this.f999b = fVar;
        this.f1000c = eVar;
    }

    @NonNull
    /* renamed from: A */
    private static String m1815A(@NonNull File file) {
        byte[] bArr = new byte[8192];
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        FileInputStream fileInputStream = new FileInputStream(file);
        while (true) {
            try {
                int read = fileInputStream.read(bArr);
                if (read > 0) {
                    byteArrayOutputStream.write(bArr, 0, read);
                } else {
                    String str = new String(byteArrayOutputStream.toByteArray(), f993d);
                    fileInputStream.close();
                    return str;
                }
            } catch (Throwable th) {
                th.addSuppressed(th);
            }
        }
        throw th;
    }

    /* renamed from: B */
    private void m1816B(@NonNull File file, @NonNull C10450a0.C10456d dVar, @NonNull String str) {
        try {
            C10699g gVar = f995f;
            m1820F(this.f999b.mo23555f(str), gVar.mo45620E(gVar.mo45619D(m1815A(file)).mo45146m(dVar)));
        } catch (IOException e) {
            C9511f f = C9511f.m19696f();
            f.mo43974l("Could not synthesize final native report file for " + file, e);
        }
    }

    /* renamed from: C */
    private void m1817C(String str, long j) {
        boolean z;
        List<File> o = this.f999b.mo23563o(str, f997h);
        if (o.isEmpty()) {
            C9511f.m19696f().mo43971i("Session " + str + " has no events.");
            return;
        }
        Collections.sort(o);
        ArrayList arrayList = new ArrayList();
        Iterator<File> it = o.iterator();
        loop0:
        while (true) {
            z = false;
            while (true) {
                if (!it.hasNext()) {
                    break loop0;
                }
                File next = it.next();
                try {
                    arrayList.add(f995f.mo45621g(m1815A(next)));
                    if (z || m1834s(next.getName())) {
                        z = true;
                    }
                } catch (IOException e) {
                    C9511f.m19696f().mo43974l("Could not add event to report for " + next, e);
                }
            }
        }
        if (arrayList.isEmpty()) {
            C9511f.m19696f().mo43973k("Could not parse event files for session " + str);
            return;
        }
        m1818D(this.f999b.mo23562n(str, "report"), arrayList, j, z, C10128g.m21313d(str, this.f999b));
    }

    /* renamed from: D */
    private void m1818D(@NonNull File file, @NonNull List<C10450a0.C10460e.C10467d> list, long j, boolean z, @Nullable String str) {
        File file2;
        try {
            C10699g gVar = f995f;
            C10450a0 l = gVar.mo45619D(m1815A(file)).mo45147n(j, z, str).mo45145l(C10494b0.m22173b(list));
            C10450a0.C10460e j2 = l.mo45143j();
            if (j2 != null) {
                if (z) {
                    file2 = this.f999b.mo23558i(j2.mo45195h());
                } else {
                    file2 = this.f999b.mo23560k(j2.mo45195h());
                }
                m1820F(file2, gVar.mo45620E(l));
            }
        } catch (IOException e) {
            C9511f f = C9511f.m19696f();
            f.mo43974l("Could not synthesize final report file for " + file, e);
        }
    }

    /* renamed from: E */
    private int m1819E(String str, int i) {
        List<File> o = this.f999b.mo23563o(str, new C2212a());
        Collections.sort(o, new C2213b());
        return m1827f(o, i);
    }

    /* renamed from: F */
    private static void m1820F(File file, String str) {
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(new FileOutputStream(file), f993d);
        try {
            outputStreamWriter.write(str);
            outputStreamWriter.close();
            return;
        } catch (Throwable th) {
            th.addSuppressed(th);
        }
        throw th;
    }

    /* renamed from: G */
    private static void m1821G(File file, String str, long j) {
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(new FileOutputStream(file), f993d);
        try {
            outputStreamWriter.write(str);
            file.setLastModified(m1829h(j));
            outputStreamWriter.close();
            return;
        } catch (Throwable th) {
            th.addSuppressed(th);
        }
        throw th;
    }

    /* renamed from: e */
    private SortedSet<String> m1826e(@Nullable String str) {
        this.f999b.mo23550a();
        SortedSet<String> p = mo23544p();
        if (str != null) {
            p.remove(str);
        }
        if (p.size() <= 8) {
            return p;
        }
        while (p.size() > 8) {
            String last = p.last();
            C9511f f = C9511f.m19696f();
            f.mo43965b("Removing session over cap: " + last);
            this.f999b.mo23551b(last);
            p.remove(last);
        }
        return p;
    }

    /* renamed from: f */
    private static int m1827f(List<File> list, int i) {
        int size = list.size();
        for (File next : list) {
            if (size <= i) {
                return size;
            }
            C2217f.m1851r(next);
            size--;
        }
        return size;
    }

    /* renamed from: g */
    private void m1828g() {
        int i = this.f1000c.mo29937b().mo40843b().f10022b;
        List<File> n = m1832n();
        int size = n.size();
        if (size > i) {
            for (File delete : n.subList(i, size)) {
                delete.delete();
            }
        }
    }

    /* renamed from: h */
    private static long m1829h(long j) {
        return j * 1000;
    }

    /* renamed from: j */
    private void m1830j(List<File> list) {
        for (File delete : list) {
            delete.delete();
        }
    }

    @NonNull
    /* renamed from: m */
    private static String m1831m(int i, boolean z) {
        String str;
        String format = String.format(Locale.US, "%010d", new Object[]{Integer.valueOf(i)});
        if (z) {
            str = "_";
        } else {
            str = "";
        }
        return NotificationCompat.CATEGORY_EVENT + format + str;
    }

    /* renamed from: n */
    private List<File> m1832n() {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(this.f999b.mo23559j());
        arrayList.addAll(this.f999b.mo23556g());
        Comparator<? super File> comparator = f996g;
        Collections.sort(arrayList, comparator);
        List<File> l = this.f999b.mo23561l();
        Collections.sort(l, comparator);
        arrayList.addAll(l);
        return arrayList;
    }

    @NonNull
    /* renamed from: o */
    private static String m1833o(@NonNull String str) {
        return str.substring(0, f994e);
    }

    /* renamed from: s */
    private static boolean m1834s(@NonNull String str) {
        if (!str.startsWith(NotificationCompat.CATEGORY_EVENT) || !str.endsWith("_")) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: private */
    /* renamed from: t */
    public static boolean m1835t(@NonNull File file, @NonNull String str) {
        if (!str.startsWith(NotificationCompat.CATEGORY_EVENT) || str.endsWith("_")) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: private */
    /* renamed from: x */
    public static int m1838x(@NonNull File file, @NonNull File file2) {
        return m1833o(file.getName()).compareTo(m1833o(file2.getName()));
    }

    /* renamed from: i */
    public void mo23541i() {
        m1830j(this.f999b.mo23561l());
        m1830j(this.f999b.mo23559j());
        m1830j(this.f999b.mo23556g());
    }

    /* renamed from: k */
    public void mo23542k(@Nullable String str, long j) {
        for (String next : m1826e(str)) {
            C9511f f = C9511f.m19696f();
            f.mo43971i("Finalizing report for session " + next);
            m1817C(next, j);
            this.f999b.mo23551b(next);
        }
        m1828g();
    }

    /* renamed from: l */
    public void mo23543l(String str, C10450a0.C10456d dVar) {
        File n = this.f999b.mo23562n(str, "report");
        C9511f f = C9511f.m19696f();
        f.mo43965b("Writing native session report for " + str + " to file: " + n);
        m1816B(n, dVar, str);
    }

    /* renamed from: p */
    public SortedSet<String> mo23544p() {
        return new TreeSet(this.f999b.mo23552c()).descendingSet();
    }

    /* renamed from: q */
    public long mo23545q(String str) {
        return this.f999b.mo23562n(str, "start-time").lastModified();
    }

    /* renamed from: r */
    public boolean mo23546r() {
        if (!this.f999b.mo23561l().isEmpty() || !this.f999b.mo23559j().isEmpty() || !this.f999b.mo23556g().isEmpty()) {
            return true;
        }
        return false;
    }

    @NonNull
    /* renamed from: w */
    public List<C10010p> mo23547w() {
        List<File> n = m1832n();
        ArrayList arrayList = new ArrayList();
        for (File next : n) {
            try {
                arrayList.add(C10010p.m20986a(f995f.mo45619D(m1815A(next)), next.getName(), next));
            } catch (IOException e) {
                C9511f f = C9511f.m19696f();
                f.mo43974l("Could not load report file " + next + "; deleting", e);
                next.delete();
            }
        }
        return arrayList;
    }

    /* renamed from: y */
    public void mo23548y(@NonNull C10450a0.C10460e.C10467d dVar, @NonNull String str, boolean z) {
        int i = this.f1000c.mo29937b().mo40843b().f10021a;
        try {
            m1820F(this.f999b.mo23562n(str, m1831m(this.f998a.getAndIncrement(), z)), f995f.mo45622h(dVar));
        } catch (IOException e) {
            C9511f f = C9511f.m19696f();
            f.mo43974l("Could not persist event for session " + str, e);
        }
        m1819E(str, i);
    }

    /* renamed from: z */
    public void mo23549z(@NonNull C10450a0 a0Var) {
        C10450a0.C10460e j = a0Var.mo45143j();
        if (j == null) {
            C9511f.m19696f().mo43965b("Could not get session for report");
            return;
        }
        String h = j.mo45195h();
        try {
            m1820F(this.f999b.mo23562n(h, "report"), f995f.mo45620E(a0Var));
            m1821G(this.f999b.mo23562n(h, "start-time"), "", j.mo45198k());
        } catch (IOException e) {
            C9511f f = C9511f.m19696f();
            f.mo43966c("Could not persist report for session " + h, e);
        }
    }
}
