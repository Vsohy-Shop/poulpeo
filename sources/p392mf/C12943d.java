package p392mf;

import java.io.File;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Iterator;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C12667b;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.p379io.AccessDeniedException;
import p336ef.C11921v;
import p404of.C13088o;
import p448vf.C13650g;

/* renamed from: mf.d */
/* compiled from: FileTreeWalk.kt */
public final class C12943d implements C13650g<File> {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final File f20721a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final C12951e f20722b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final Function1<File, Boolean> f20723c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final Function1<File, C11921v> f20724d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final C13088o<File, IOException, C11921v> f20725e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final int f20726f;

    /* renamed from: mf.d$a */
    /* compiled from: FileTreeWalk.kt */
    private static abstract class C12944a extends C12950c {
        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C12944a(File file) {
            super(file);
            C12775o.m28639i(file, "rootDir");
        }
    }

    /* renamed from: mf.d$b */
    /* compiled from: FileTreeWalk.kt */
    private final class C12945b extends C12667b<File> {

        /* renamed from: d */
        private final ArrayDeque<C12950c> f20727d;

        /* renamed from: mf.d$b$a */
        /* compiled from: FileTreeWalk.kt */
        private final class C12946a extends C12944a {

            /* renamed from: b */
            private boolean f20729b;

            /* renamed from: c */
            private File[] f20730c;

            /* renamed from: d */
            private int f20731d;

            /* renamed from: e */
            private boolean f20732e;

            /* renamed from: f */
            final /* synthetic */ C12945b f20733f;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C12946a(C12945b bVar, File file) {
                super(file);
                C12775o.m28639i(file, "rootDir");
                this.f20733f = bVar;
            }

            /* renamed from: b */
            public File mo50869b() {
                if (!this.f20732e && this.f20730c == null) {
                    Function1 e = C12943d.this.f20723c;
                    boolean z = false;
                    if (e != null && !((Boolean) e.invoke(mo50870a())).booleanValue()) {
                        z = true;
                    }
                    if (z) {
                        return null;
                    }
                    File[] listFiles = mo50870a().listFiles();
                    this.f20730c = listFiles;
                    if (listFiles == null) {
                        C13088o f = C12943d.this.f20725e;
                        if (f != null) {
                            f.invoke(mo50870a(), new AccessDeniedException(mo50870a(), (File) null, "Cannot list files in a directory", 2, (DefaultConstructorMarker) null));
                        }
                        this.f20732e = true;
                    }
                }
                File[] fileArr = this.f20730c;
                if (fileArr != null) {
                    int i = this.f20731d;
                    C12775o.m28636f(fileArr);
                    if (i < fileArr.length) {
                        File[] fileArr2 = this.f20730c;
                        C12775o.m28636f(fileArr2);
                        int i2 = this.f20731d;
                        this.f20731d = i2 + 1;
                        return fileArr2[i2];
                    }
                }
                if (!this.f20729b) {
                    this.f20729b = true;
                    return mo50870a();
                }
                Function1 g = C12943d.this.f20724d;
                if (g != null) {
                    g.invoke(mo50870a());
                }
                return null;
            }
        }

        /* renamed from: mf.d$b$b */
        /* compiled from: FileTreeWalk.kt */
        private final class C12947b extends C12950c {

            /* renamed from: b */
            private boolean f20734b;

            /* renamed from: c */
            final /* synthetic */ C12945b f20735c;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C12947b(C12945b bVar, File file) {
                super(file);
                C12775o.m28639i(file, "rootFile");
                this.f20735c = bVar;
            }

            /* renamed from: b */
            public File mo50869b() {
                if (this.f20734b) {
                    return null;
                }
                this.f20734b = true;
                return mo50870a();
            }
        }

        /* renamed from: mf.d$b$c */
        /* compiled from: FileTreeWalk.kt */
        private final class C12948c extends C12944a {

            /* renamed from: b */
            private boolean f20736b;

            /* renamed from: c */
            private File[] f20737c;

            /* renamed from: d */
            private int f20738d;

            /* renamed from: e */
            final /* synthetic */ C12945b f20739e;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C12948c(C12945b bVar, File file) {
                super(file);
                C12775o.m28639i(file, "rootDir");
                this.f20739e = bVar;
            }

            /* JADX WARNING: Code restructure failed: missing block: B:29:0x0083, code lost:
                if (r0.length == 0) goto L_0x0085;
             */
            /* renamed from: b */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public java.io.File mo50869b() {
                /*
                    r10 = this;
                    boolean r0 = r10.f20736b
                    r1 = 0
                    if (r0 != 0) goto L_0x002c
                    mf.d$b r0 = r10.f20739e
                    mf.d r0 = p392mf.C12943d.this
                    kotlin.jvm.functions.Function1 r0 = r0.f20723c
                    r2 = 0
                    r3 = 1
                    if (r0 == 0) goto L_0x0022
                    java.io.File r4 = r10.mo50870a()
                    java.lang.Object r0 = r0.invoke(r4)
                    java.lang.Boolean r0 = (java.lang.Boolean) r0
                    boolean r0 = r0.booleanValue()
                    if (r0 != 0) goto L_0x0022
                    r2 = r3
                L_0x0022:
                    if (r2 == 0) goto L_0x0025
                    return r1
                L_0x0025:
                    r10.f20736b = r3
                    java.io.File r0 = r10.mo50870a()
                    return r0
                L_0x002c:
                    java.io.File[] r0 = r10.f20737c
                    if (r0 == 0) goto L_0x004b
                    int r2 = r10.f20738d
                    kotlin.jvm.internal.C12775o.m28636f(r0)
                    int r0 = r0.length
                    if (r2 >= r0) goto L_0x0039
                    goto L_0x004b
                L_0x0039:
                    mf.d$b r0 = r10.f20739e
                    mf.d r0 = p392mf.C12943d.this
                    kotlin.jvm.functions.Function1 r0 = r0.f20724d
                    if (r0 == 0) goto L_0x004a
                    java.io.File r2 = r10.mo50870a()
                    r0.invoke(r2)
                L_0x004a:
                    return r1
                L_0x004b:
                    java.io.File[] r0 = r10.f20737c
                    if (r0 != 0) goto L_0x0097
                    java.io.File r0 = r10.mo50870a()
                    java.io.File[] r0 = r0.listFiles()
                    r10.f20737c = r0
                    if (r0 != 0) goto L_0x007b
                    mf.d$b r0 = r10.f20739e
                    mf.d r0 = p392mf.C12943d.this
                    of.o r0 = r0.f20725e
                    if (r0 == 0) goto L_0x007b
                    java.io.File r2 = r10.mo50870a()
                    kotlin.io.AccessDeniedException r9 = new kotlin.io.AccessDeniedException
                    java.io.File r4 = r10.mo50870a()
                    r5 = 0
                    java.lang.String r6 = "Cannot list files in a directory"
                    r7 = 2
                    r8 = 0
                    r3 = r9
                    r3.<init>(r4, r5, r6, r7, r8)
                    r0.invoke(r2, r9)
                L_0x007b:
                    java.io.File[] r0 = r10.f20737c
                    if (r0 == 0) goto L_0x0085
                    kotlin.jvm.internal.C12775o.m28636f(r0)
                    int r0 = r0.length
                    if (r0 != 0) goto L_0x0097
                L_0x0085:
                    mf.d$b r0 = r10.f20739e
                    mf.d r0 = p392mf.C12943d.this
                    kotlin.jvm.functions.Function1 r0 = r0.f20724d
                    if (r0 == 0) goto L_0x0096
                    java.io.File r2 = r10.mo50870a()
                    r0.invoke(r2)
                L_0x0096:
                    return r1
                L_0x0097:
                    java.io.File[] r0 = r10.f20737c
                    kotlin.jvm.internal.C12775o.m28636f(r0)
                    int r1 = r10.f20738d
                    int r2 = r1 + 1
                    r10.f20738d = r2
                    r0 = r0[r1]
                    return r0
                */
                throw new UnsupportedOperationException("Method not decompiled: p392mf.C12943d.C12945b.C12948c.mo50869b():java.io.File");
            }
        }

        /* renamed from: mf.d$b$d */
        /* compiled from: FileTreeWalk.kt */
        public /* synthetic */ class C12949d {

            /* renamed from: a */
            public static final /* synthetic */ int[] f20740a;

            /* JADX WARNING: Failed to process nested try/catch */
            /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
            static {
                /*
                    mf.e[] r0 = p392mf.C12951e.values()
                    int r0 = r0.length
                    int[] r0 = new int[r0]
                    mf.e r1 = p392mf.C12951e.TOP_DOWN     // Catch:{ NoSuchFieldError -> 0x0010 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                    r2 = 1
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
                L_0x0010:
                    mf.e r1 = p392mf.C12951e.BOTTOM_UP     // Catch:{ NoSuchFieldError -> 0x0019 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                    r2 = 2
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
                L_0x0019:
                    f20740a = r0
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: p392mf.C12943d.C12945b.C12949d.<clinit>():void");
            }
        }

        public C12945b() {
            ArrayDeque<C12950c> arrayDeque = new ArrayDeque<>();
            this.f20727d = arrayDeque;
            if (C12943d.this.f20721a.isDirectory()) {
                arrayDeque.push(m29254g(C12943d.this.f20721a));
            } else if (C12943d.this.f20721a.isFile()) {
                arrayDeque.push(new C12947b(this, C12943d.this.f20721a));
            } else {
                mo50414c();
            }
        }

        /* renamed from: g */
        private final C12944a m29254g(File file) {
            int i = C12949d.f20740a[C12943d.this.f20722b.ordinal()];
            if (i == 1) {
                return new C12948c(this, file);
            }
            if (i == 2) {
                return new C12946a(this, file);
            }
            throw new NoWhenBranchMatchedException();
        }

        /* renamed from: h */
        private final File m29255h() {
            File b;
            while (true) {
                C12950c peek = this.f20727d.peek();
                if (peek == null) {
                    return null;
                }
                b = peek.mo50869b();
                if (b == null) {
                    this.f20727d.pop();
                } else if (C12775o.m28634d(b, peek.mo50870a()) || !b.isDirectory() || this.f20727d.size() >= C12943d.this.f20726f) {
                    return b;
                } else {
                    this.f20727d.push(m29254g(b));
                }
            }
            return b;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo50413a() {
            File h = m29255h();
            if (h != null) {
                mo50415e(h);
            } else {
                mo50414c();
            }
        }
    }

    /* renamed from: mf.d$c */
    /* compiled from: FileTreeWalk.kt */
    private static abstract class C12950c {

        /* renamed from: a */
        private final File f20741a;

        public C12950c(File file) {
            C12775o.m28639i(file, "root");
            this.f20741a = file;
        }

        /* renamed from: a */
        public final File mo50870a() {
            return this.f20741a;
        }

        /* renamed from: b */
        public abstract File mo50869b();
    }

    private C12943d(File file, C12951e eVar, Function1<? super File, Boolean> function1, Function1<? super File, C11921v> function12, C13088o<? super File, ? super IOException, C11921v> oVar, int i) {
        this.f20721a = file;
        this.f20722b = eVar;
        this.f20723c = function1;
        this.f20724d = function12;
        this.f20725e = oVar;
        this.f20726f = i;
    }

    public Iterator<File> iterator() {
        return new C12945b();
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    /* synthetic */ C12943d(File file, C12951e eVar, Function1 function1, Function1 function12, C13088o oVar, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(file, (i2 & 2) != 0 ? C12951e.TOP_DOWN : eVar, function1, function12, oVar, (i2 & 32) != 0 ? Integer.MAX_VALUE : i);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C12943d(File file, C12951e eVar) {
        this(file, eVar, (Function1) null, (Function1) null, (C13088o) null, 0, 32, (DefaultConstructorMarker) null);
        C12775o.m28639i(file, "start");
        C12775o.m28639i(eVar, "direction");
    }
}
