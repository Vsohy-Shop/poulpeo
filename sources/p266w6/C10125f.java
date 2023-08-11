package p266w6;

import com.adjust.sdk.Constants;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.util.Locale;
import p222s6.C9511f;
import p255v6.C9972g;
import p266w6.C10120e;

/* renamed from: w6.f */
/* compiled from: QueueFileLogStore */
class C10125f implements C10114a {

    /* renamed from: d */
    private static final Charset f15305d = Charset.forName(Constants.ENCODING);

    /* renamed from: a */
    private final File f15306a;

    /* renamed from: b */
    private final int f15307b;

    /* renamed from: c */
    private C10120e f15308c;

    /* renamed from: w6.f$a */
    /* compiled from: QueueFileLogStore */
    class C10126a implements C10120e.C10124d {

        /* renamed from: a */
        final /* synthetic */ byte[] f15309a;

        /* renamed from: b */
        final /* synthetic */ int[] f15310b;

        C10126a(byte[] bArr, int[] iArr) {
            this.f15309a = bArr;
            this.f15310b = iArr;
        }

        /* renamed from: a */
        public void mo44721a(InputStream inputStream, int i) {
            try {
                inputStream.read(this.f15309a, this.f15310b[0], i);
                int[] iArr = this.f15310b;
                iArr[0] = iArr[0] + i;
            } finally {
                inputStream.close();
            }
        }
    }

    /* renamed from: w6.f$b */
    /* compiled from: QueueFileLogStore */
    private static class C10127b {

        /* renamed from: a */
        public final byte[] f15312a;

        /* renamed from: b */
        public final int f15313b;

        C10127b(byte[] bArr, int i) {
            this.f15312a = bArr;
            this.f15313b = i;
        }
    }

    C10125f(File file, int i) {
        this.f15306a = file;
        this.f15307b = i;
    }

    /* renamed from: f */
    private void m21303f(long j, String str) {
        if (this.f15308c != null) {
            if (str == null) {
                str = "null";
            }
            try {
                int i = this.f15307b / 4;
                if (str.length() > i) {
                    str = "..." + str.substring(str.length() - i);
                }
                this.f15308c.mo44712A(String.format(Locale.US, "%d %s%n", new Object[]{Long.valueOf(j), str.replaceAll("\r", " ").replaceAll("\n", " ")}).getBytes(f15305d));
                while (!this.f15308c.mo44716X() && this.f15308c.mo44720x0() > this.f15307b) {
                    this.f15308c.mo44718t0();
                }
            } catch (IOException e) {
                C9511f.m19696f().mo43968e("There was a problem writing to the Crashlytics log.", e);
            }
        }
    }

    /* renamed from: g */
    private C10127b m21304g() {
        if (!this.f15306a.exists()) {
            return null;
        }
        m21305h();
        C10120e eVar = this.f15308c;
        if (eVar == null) {
            return null;
        }
        int[] iArr = {0};
        byte[] bArr = new byte[eVar.mo44720x0()];
        try {
            this.f15308c.mo44715R(new C10126a(bArr, iArr));
        } catch (IOException e) {
            C9511f.m19696f().mo43968e("A problem occurred while reading the Crashlytics log file.", e);
        }
        return new C10127b(bArr, iArr[0]);
    }

    /* renamed from: h */
    private void m21305h() {
        if (this.f15308c == null) {
            try {
                this.f15308c = new C10120e(this.f15306a);
            } catch (IOException e) {
                C9511f f = C9511f.m19696f();
                f.mo43968e("Could not open log file: " + this.f15306a, e);
            }
        }
    }

    /* renamed from: a */
    public void mo44694a() {
        C9972g.m20815e(this.f15308c, "There was a problem closing the Crashlytics log file.");
        this.f15308c = null;
    }

    /* renamed from: b */
    public String mo44695b() {
        byte[] c = mo44696c();
        if (c != null) {
            return new String(c, f15305d);
        }
        return null;
    }

    /* renamed from: c */
    public byte[] mo44696c() {
        C10127b g = m21304g();
        if (g == null) {
            return null;
        }
        int i = g.f15313b;
        byte[] bArr = new byte[i];
        System.arraycopy(g.f15312a, 0, bArr, 0, i);
        return bArr;
    }

    /* renamed from: d */
    public void mo44697d() {
        mo44694a();
        this.f15306a.delete();
    }

    /* renamed from: e */
    public void mo44698e(long j, String str) {
        m21305h();
        m21303f(j, str);
    }
}
