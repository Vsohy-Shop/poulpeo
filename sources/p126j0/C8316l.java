package p126j0;

import android.content.Context;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Locale;
import java.util.Map;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import kotlin.jvm.internal.Ref$ObjectRef;
import p126j0.C8266c;
import p336ef.C11921v;
import p392mf.C12940a;
import p392mf.C12941b;
import p404of.C13074a;

/* renamed from: j0.l */
public final class C8316l {

    /* renamed from: a */
    public static final C8316l f11707a = new C8316l();

    /* renamed from: j0.l$a */
    static final class C8317a extends C12777p implements C13074a<String> {

        /* renamed from: g */
        public static final C8317a f11708g = new C8317a();

        C8317a() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "Remote zip url is empty. No local URL will be created.";
        }
    }

    /* renamed from: j0.l$b */
    static final class C8318b extends C12777p implements C13074a<String> {

        /* renamed from: g */
        final /* synthetic */ String f11709g;

        /* renamed from: h */
        final /* synthetic */ String f11710h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C8318b(String str, String str2) {
            super(0);
            this.f11709g = str;
            this.f11710h = str2;
        }

        /* renamed from: a */
        public final String invoke() {
            return "Starting download of url: " + this.f11709g + " to " + this.f11710h;
        }
    }

    /* renamed from: j0.l$c */
    static final class C8319c extends C12777p implements C13074a<String> {

        /* renamed from: g */
        final /* synthetic */ String f11711g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C8319c(String str) {
            super(0);
            this.f11711g = str;
        }

        /* renamed from: a */
        public final String invoke() {
            return C12775o.m28647q("Could not download zip file to local storage. ", this.f11711g);
        }
    }

    /* renamed from: j0.l$d */
    static final class C8320d extends C12777p implements C13074a<String> {

        /* renamed from: g */
        final /* synthetic */ String f11712g;

        /* renamed from: h */
        final /* synthetic */ String f11713h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C8320d(String str, String str2) {
            super(0);
            this.f11712g = str;
            this.f11713h = str2;
        }

        /* renamed from: a */
        public final String invoke() {
            return "Html content zip downloaded. " + this.f11712g + " to " + this.f11713h;
        }
    }

    /* renamed from: j0.l$e */
    static final class C8321e extends C12777p implements C13074a<String> {

        /* renamed from: g */
        public static final C8321e f11714g = new C8321e();

        C8321e() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "Error during the zip unpack.";
        }
    }

    /* renamed from: j0.l$f */
    static final class C8322f extends C12777p implements C13074a<String> {

        /* renamed from: g */
        final /* synthetic */ String f11715g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C8322f(String str) {
            super(0);
            this.f11715g = str;
        }

        /* renamed from: a */
        public final String invoke() {
            return "Html content zip unpacked to to " + this.f11715g + '.';
        }
    }

    /* renamed from: j0.l$g */
    static final class C8323g extends C12777p implements C13074a<String> {

        /* renamed from: g */
        final /* synthetic */ Ref$ObjectRef<String> f11716g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C8323g(Ref$ObjectRef<String> ref$ObjectRef) {
            super(0);
            this.f11716g = ref$ObjectRef;
        }

        /* renamed from: a */
        public final String invoke() {
            return C12775o.m28647q("Cannot find local asset file at path: ", this.f11716g.f20403b);
        }
    }

    /* renamed from: j0.l$h */
    static final class C8324h extends C12777p implements C13074a<String> {

        /* renamed from: g */
        final /* synthetic */ String f11717g;

        /* renamed from: h */
        final /* synthetic */ Ref$ObjectRef<String> f11718h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C8324h(String str, Ref$ObjectRef<String> ref$ObjectRef) {
            super(0);
            this.f11717g = str;
            this.f11718h = ref$ObjectRef;
        }

        /* renamed from: a */
        public final String invoke() {
            return "Replacing remote url \"" + this.f11717g + "\" with local uri \"" + ((String) this.f11718h.f20403b) + '\"';
        }
    }

    /* renamed from: j0.l$i */
    static final class C8325i extends C12777p implements C13074a<String> {

        /* renamed from: g */
        public static final C8325i f11719g = new C8325i();

        C8325i() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "Unpack directory is blank. Zip file not unpacked.";
        }
    }

    /* renamed from: j0.l$j */
    static final class C8326j extends C12777p implements C13074a<String> {

        /* renamed from: g */
        final /* synthetic */ Ref$ObjectRef<String> f11720g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C8326j(Ref$ObjectRef<String> ref$ObjectRef) {
            super(0);
            this.f11720g = ref$ObjectRef;
        }

        /* renamed from: a */
        public final String invoke() {
            return C12775o.m28647q("Error creating parent directory ", this.f11720g.f20403b);
        }
    }

    /* renamed from: j0.l$k */
    static final class C8327k extends C12777p implements C13074a<String> {

        /* renamed from: g */
        final /* synthetic */ Ref$ObjectRef<String> f11721g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C8327k(Ref$ObjectRef<String> ref$ObjectRef) {
            super(0);
            this.f11721g = ref$ObjectRef;
        }

        /* renamed from: a */
        public final String invoke() {
            return C12775o.m28647q("Error unpacking zipEntry ", this.f11721g.f20403b);
        }
    }

    /* renamed from: j0.l$l */
    static final class C8328l extends C12777p implements C13074a<String> {

        /* renamed from: g */
        final /* synthetic */ File f11722g;

        /* renamed from: h */
        final /* synthetic */ String f11723h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C8328l(File file, String str) {
            super(0);
            this.f11722g = file;
            this.f11723h = str;
        }

        /* renamed from: a */
        public final String invoke() {
            return "Error during unpack of zip file " + this.f11722g.getAbsolutePath() + " to " + this.f11723h + '.';
        }
    }

    private C8316l() {
    }

    /* renamed from: a */
    public static final File m16517a(Context context) {
        C12775o.m28639i(context, "context");
        return new File(context.getCacheDir().getPath() + '/' + "appboy-html-inapp-messages");
    }

    /* renamed from: b */
    public static final String m16518b(File file, String str) {
        C12775o.m28639i(file, "localDirectory");
        C12775o.m28639i(str, "remoteZipUrl");
        if (C13754v.m31532t(str)) {
            C8266c.m16396e(C8266c.f11641a, f11707a, C8266c.C8267a.f11651g, (Throwable) null, false, C8317a.f11708g, 6, (Object) null);
            return null;
        }
        String absolutePath = file.getAbsolutePath();
        String valueOf = String.valueOf(C8275f.m16444e());
        String str2 = absolutePath + '/' + valueOf;
        C8266c cVar = C8266c.f11641a;
        C8316l lVar = f11707a;
        C8266c.m16396e(cVar, lVar, (C8266c.C8267a) null, (Throwable) null, false, new C8318b(str, str2), 7, (Object) null);
        try {
            C8266c.m16396e(cVar, lVar, (C8266c.C8267a) null, (Throwable) null, false, new C8320d(str, str2), 7, (Object) null);
            if (!m16520d(str2, C8233a.m16340b(str2, str, valueOf, ".zip").mo49109a())) {
                C8266c.m16396e(cVar, lVar, C8266c.C8267a.f11651g, (Throwable) null, false, C8321e.f11714g, 6, (Object) null);
                C8233a.m16339a(new File(str2));
                return null;
            }
            C8266c.m16396e(cVar, lVar, (C8266c.C8267a) null, (Throwable) null, false, new C8322f(str2), 7, (Object) null);
            return str2;
        } catch (Exception e) {
            C8266c.m16396e(C8266c.f11641a, f11707a, C8266c.C8267a.f11649e, e, false, new C8319c(str), 4, (Object) null);
            C8233a.m16339a(new File(str2));
            return null;
        }
    }

    /* renamed from: c */
    public static final String m16519c(String str, Map<String, String> map) {
        T t;
        C12775o.m28639i(str, "originalString");
        C12775o.m28639i(map, "remoteToLocalAssetMap");
        String str2 = str;
        for (Map.Entry next : map.entrySet()) {
            Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
            ref$ObjectRef.f20403b = next.getValue();
            if (!new File((String) ref$ObjectRef.f20403b).exists()) {
                C8266c.m16396e(C8266c.f11641a, f11707a, C8266c.C8267a.f11651g, (Throwable) null, false, new C8323g(ref$ObjectRef), 6, (Object) null);
            } else {
                C8316l lVar = f11707a;
                if (C13754v.m31525E((String) ref$ObjectRef.f20403b, "file://", false, 2, (Object) null)) {
                    t = (String) ref$ObjectRef.f20403b;
                } else {
                    t = C12775o.m28647q("file://", ref$ObjectRef.f20403b);
                }
                ref$ObjectRef.f20403b = t;
                String str3 = (String) next.getKey();
                if (C13755w.m31552J(str2, str3, false, 2, (Object) null)) {
                    C8266c.m16396e(C8266c.f11641a, lVar, (C8266c.C8267a) null, (Throwable) null, false, new C8324h(str3, ref$ObjectRef), 7, (Object) null);
                    str2 = C13754v.m31521A(str2, str3, (String) ref$ObjectRef.f20403b, false, 4, (Object) null);
                }
            }
        }
        return str2;
    }

    /* renamed from: d */
    public static final boolean m16520d(String str, File file) {
        Throwable th;
        String str2 = str;
        File file2 = file;
        C12775o.m28639i(str2, "unpackDirectory");
        C12775o.m28639i(file2, "zipFile");
        if (C13754v.m31532t(str)) {
            C8266c.m16396e(C8266c.f11641a, f11707a, C8266c.C8267a.I, (Throwable) null, false, C8325i.f11719g, 6, (Object) null);
            return false;
        }
        new File(str2).mkdirs();
        try {
            Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
            ZipInputStream zipInputStream = new ZipInputStream(new FileInputStream(file2));
            try {
                for (ZipEntry nextEntry = zipInputStream.getNextEntry(); nextEntry != null; nextEntry = zipInputStream.getNextEntry()) {
                    T name = nextEntry.getName();
                    C12775o.m28638h(name, "zipEntry.name");
                    ref$ObjectRef.f20403b = name;
                    Locale locale = Locale.US;
                    C12775o.m28638h(locale, "US");
                    String lowerCase = name.toLowerCase(locale);
                    C12775o.m28638h(lowerCase, "this as java.lang.String).toLowerCase(locale)");
                    if (!C13754v.m31525E(lowerCase, "__macosx", false, 2, (Object) null)) {
                        try {
                            String e = m16521e(str2, str2 + '/' + ((String) ref$ObjectRef.f20403b));
                            if (nextEntry.isDirectory()) {
                                new File(e).mkdirs();
                            } else {
                                try {
                                    File parentFile = new File(e).getParentFile();
                                    if (parentFile != null) {
                                        parentFile.mkdirs();
                                    }
                                } catch (Exception e2) {
                                    C8266c.m16396e(C8266c.f11641a, f11707a, C8266c.C8267a.f11649e, e2, false, new C8326j(ref$ObjectRef), 4, (Object) null);
                                }
                                BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(e));
                                try {
                                    C12940a.m29243b(zipInputStream, bufferedOutputStream, 0, 2, (Object) null);
                                    C12941b.m29245a(bufferedOutputStream, (Throwable) null);
                                } catch (Throwable th2) {
                                    Throwable th3 = th2;
                                    C12941b.m29245a(bufferedOutputStream, th);
                                    throw th3;
                                }
                            }
                        } catch (Exception e3) {
                            C8266c.m16396e(C8266c.f11641a, f11707a, C8266c.C8267a.f11649e, e3, false, new C8327k(ref$ObjectRef), 4, (Object) null);
                        }
                    }
                    zipInputStream.closeEntry();
                }
                C11921v vVar = C11921v.f18618a;
                C12941b.m29245a(zipInputStream, (Throwable) null);
                return true;
            } finally {
                Exception exc = e3;
                try {
                } catch (Throwable th4) {
                    Throwable th5 = th4;
                    C12941b.m29245a(zipInputStream, exc);
                    throw th5;
                }
            }
        } catch (Throwable th6) {
            C8266c.m16396e(C8266c.f11641a, f11707a, C8266c.C8267a.f11649e, th6, false, new C8328l(file2, str2), 4, (Object) null);
            return false;
        }
    }

    /* renamed from: e */
    public static final String m16521e(String str, String str2) {
        C12775o.m28639i(str, "intendedParentDirectory");
        C12775o.m28639i(str2, "childFilePath");
        String canonicalPath = new File(str).getCanonicalPath();
        String canonicalPath2 = new File(str2).getCanonicalPath();
        C12775o.m28638h(canonicalPath2, "childFileCanonicalPath");
        C12775o.m28638h(canonicalPath, "parentCanonicalPath");
        if (C13754v.m31525E(canonicalPath2, canonicalPath, false, 2, (Object) null)) {
            return canonicalPath2;
        }
        throw new IllegalStateException("Invalid file with original path: " + str2 + " with canonical path: " + canonicalPath2 + " does not exist under intended parent with  path: " + str + " and canonical path: " + canonicalPath);
    }
}
