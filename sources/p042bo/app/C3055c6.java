package p042bo.app;

import android.content.Context;
import android.content.SharedPreferences;
import android.net.Uri;
import java.io.File;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Ref$ObjectRef;
import p126j0.C8233a;
import p126j0.C8266c;
import p126j0.C8275f;
import p126j0.C8316l;
import p336ef.C11906l;
import p404of.C13074a;

/* renamed from: bo.app.c6 */
public final class C3055c6 implements C3727u2 {

    /* renamed from: e */
    public static final C3056a f1562e = new C3056a((DefaultConstructorMarker) null);

    /* renamed from: a */
    private final SharedPreferences f1563a;

    /* renamed from: b */
    private final Map<String, String> f1564b;

    /* renamed from: c */
    private final Map<String, String> f1565c = new LinkedHashMap();

    /* renamed from: d */
    private final File f1566d;

    /* renamed from: bo.app.c6$a */
    public static final class C3056a {

        /* renamed from: bo.app.c6$a$a */
        static final class C3057a extends C12777p implements C13074a<String> {

            /* renamed from: b */
            final /* synthetic */ File[] f1567b;

            /* renamed from: bo.app.c6$a$a$a */
            static final class C3058a extends C12777p implements Function1<File, CharSequence> {

                /* renamed from: b */
                public static final C3058a f1568b = new C3058a();

                C3058a() {
                    super(1);
                }

                /* renamed from: a */
                public final CharSequence invoke(File file) {
                    String name = file.getName();
                    C12775o.m28638h(name, "it.name");
                    return name;
                }
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C3057a(File[] fileArr) {
                super(0);
                this.f1567b = fileArr;
            }

            /* renamed from: a */
            public final String invoke() {
                return C12775o.m28647q("Local triggered asset directory contains files: ", C12710p.m28392T(this.f1567b, " , ", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, C3058a.f1568b, 30, (Object) null));
            }
        }

        /* renamed from: bo.app.c6$a$b */
        static final class C3059b extends C12777p implements C13074a<String> {

            /* renamed from: b */
            final /* synthetic */ File f1569b;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C3059b(File file) {
                super(0);
                this.f1569b = file;
            }

            /* renamed from: a */
            public final String invoke() {
                return "Deleting obsolete asset '" + this.f1569b.getPath() + "' from filesystem.";
            }
        }

        /* renamed from: bo.app.c6$a$c */
        static final class C3060c extends C12777p implements C13074a<String> {

            /* renamed from: b */
            public static final C3060c f1570b = new C3060c();

            C3060c() {
                super(0);
            }

            /* renamed from: a */
            public final String invoke() {
                return "Exception while deleting obsolete assets from filesystem.";
            }
        }

        /* renamed from: bo.app.c6$a$d */
        static final class C3061d extends C12777p implements C13074a<String> {

            /* renamed from: b */
            final /* synthetic */ String f1571b;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C3061d(String str) {
                super(0);
                this.f1571b = str;
            }

            /* renamed from: a */
            public final String invoke() {
                return "Not removing local path for remote path " + this.f1571b + " from cache because it is being preserved until the end of the app run.";
            }
        }

        /* renamed from: bo.app.c6$a$e */
        static final class C3062e extends C12777p implements C13074a<String> {

            /* renamed from: b */
            final /* synthetic */ String f1572b;

            /* renamed from: c */
            final /* synthetic */ String f1573c;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C3062e(String str, String str2) {
                super(0);
                this.f1572b = str;
                this.f1573c = str2;
            }

            /* renamed from: a */
            public final String invoke() {
                return "Removing obsolete local path " + this.f1572b + " for obsolete remote path " + this.f1573c + " from cache.";
            }
        }

        /* renamed from: bo.app.c6$a$f */
        static final class C3063f extends C12777p implements C13074a<String> {

            /* renamed from: b */
            final /* synthetic */ File f1574b;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C3063f(File file) {
                super(0);
                this.f1574b = file;
            }

            /* renamed from: a */
            public final String invoke() {
                return C12775o.m28647q("Deleting triggers directory at: ", this.f1574b.getAbsolutePath());
            }
        }

        /* renamed from: bo.app.c6$a$g */
        static final class C3064g extends C12777p implements C13074a<String> {

            /* renamed from: b */
            final /* synthetic */ Ref$ObjectRef<String> f1575b;

            /* renamed from: c */
            final /* synthetic */ String f1576c;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C3064g(Ref$ObjectRef<String> ref$ObjectRef, String str) {
                super(0);
                this.f1575b = ref$ObjectRef;
                this.f1576c = str;
            }

            /* renamed from: a */
            public final String invoke() {
                return "Using file extension " + ((String) this.f1575b.f20403b) + " for remote asset url: " + this.f1576c;
            }
        }

        /* renamed from: bo.app.c6$a$h */
        static final class C3065h extends C12777p implements C13074a<String> {

            /* renamed from: b */
            final /* synthetic */ String f1577b;

            /* renamed from: c */
            final /* synthetic */ String f1578c;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C3065h(String str, String str2) {
                super(0);
                this.f1577b = str;
                this.f1578c = str2;
            }

            /* renamed from: a */
            public final String invoke() {
                return "Retrieving trigger local asset path '" + this.f1577b + "' from local storage for remote path '" + this.f1578c + '\'';
            }
        }

        /* renamed from: bo.app.c6$a$i */
        static final class C3066i extends C12777p implements C13074a<String> {

            /* renamed from: b */
            final /* synthetic */ String f1579b;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C3066i(String str) {
                super(0);
                this.f1579b = str;
            }

            /* renamed from: a */
            public final String invoke() {
                return "Encountered unexpected exception while parsing stored triggered action local assets on remote asset '" + this.f1579b + '\'';
            }
        }

        /* renamed from: bo.app.c6$a$j */
        static final class C3067j extends C12777p implements C13074a<String> {

            /* renamed from: b */
            final /* synthetic */ C3024b3 f1580b;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C3067j(C3024b3 b3Var) {
                super(0);
                this.f1580b = b3Var;
            }

            /* renamed from: a */
            public final String invoke() {
                return "Pre-fetch off for triggered action " + this.f1580b.getId() + ". Not pre-fetching assets.";
            }
        }

        /* renamed from: bo.app.c6$a$k */
        static final class C3068k extends C12777p implements C13074a<String> {

            /* renamed from: b */
            final /* synthetic */ C3024b3 f1581b;

            /* renamed from: c */
            final /* synthetic */ String f1582c;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C3068k(C3024b3 b3Var, String str) {
                super(0);
                this.f1581b = b3Var;
                this.f1582c = str;
            }

            /* renamed from: a */
            public final String invoke() {
                return "Received new remote path for triggered action " + this.f1581b.getId() + " at " + this.f1582c + '.';
            }
        }

        public /* synthetic */ C3056a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final void mo28765a(Context context) {
            C12775o.m28639i(context, "context");
            File file = new File(context.getCacheDir(), "ab_triggers");
            C8266c.m16396e(C8266c.f11641a, this, C8266c.C8267a.f11650f, (Throwable) null, false, new C3063f(file), 6, (Object) null);
            C8233a.m16339a(file);
        }

        /* renamed from: b */
        public final String mo28769b(String str) {
            boolean z;
            int a0;
            C12775o.m28639i(str, "remoteAssetUrl");
            Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
            ref$ObjectRef.f20403b = "";
            Uri parse = Uri.parse(str);
            if (parse != null) {
                String lastPathSegment = parse.getLastPathSegment();
                if (lastPathSegment == null || lastPathSegment.length() == 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (!z && (a0 = C13755w.m31575a0(lastPathSegment, '.', 0, false, 6, (Object) null)) > -1) {
                    T substring = lastPathSegment.substring(a0);
                    C12775o.m28638h(substring, "this as java.lang.String).substring(startIndex)");
                    ref$ObjectRef.f20403b = substring;
                    C8266c.m16396e(C8266c.f11641a, C3055c6.f1562e, C8266c.C8267a.f11650f, (Throwable) null, false, new C3064g(ref$ObjectRef, str), 6, (Object) null);
                }
            }
            return C8275f.m16444e() + ((String) ref$ObjectRef.f20403b);
        }

        private C3056a() {
        }

        /* renamed from: a */
        public final void mo28767a(File file, Map<String, String> map, Map<String, String> map2) {
            C12775o.m28639i(file, "triggeredAssetDirectory");
            C12775o.m28639i(map, "remoteToLocalAssetsMap");
            C12775o.m28639i(map2, "preservedLocalAssetMap");
            File[] listFiles = file.listFiles();
            if (listFiles != null) {
                C8266c.m16396e(C8266c.f11641a, this, C8266c.C8267a.f11650f, (Throwable) null, false, new C3057a(listFiles), 6, (Object) null);
                try {
                    ArrayList arrayList = new ArrayList();
                    int length = listFiles.length;
                    int i = 0;
                    while (i < length) {
                        File file2 = listFiles[i];
                        i++;
                        if (!map.containsValue(file2.getPath())) {
                            arrayList.add(file2);
                        }
                    }
                    ArrayList<File> arrayList2 = new ArrayList<>();
                    for (Object next : arrayList) {
                        if (!map2.containsValue(((File) next).getPath())) {
                            arrayList2.add(next);
                        }
                    }
                    for (File file3 : arrayList2) {
                        C8266c.m16396e(C8266c.f11641a, C3055c6.f1562e, (C8266c.C8267a) null, (Throwable) null, false, new C3059b(file3), 7, (Object) null);
                        C12775o.m28638h(file3, "obsoleteFile");
                        C8233a.m16339a(file3);
                    }
                } catch (Exception e) {
                    C8266c.m16396e(C8266c.f11641a, this, C8266c.C8267a.f11649e, e, false, C3060c.f1570b, 4, (Object) null);
                }
            }
        }

        /* JADX WARNING: Removed duplicated region for block: B:21:0x0049 A[Catch:{ Exception -> 0x0063 }] */
        /* JADX WARNING: Removed duplicated region for block: B:27:0x0029 A[SYNTHETIC] */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.util.Map<java.lang.String, java.lang.String> mo28764a(android.content.SharedPreferences r17) {
            /*
                r16 = this;
                r1 = r17
                java.lang.String r0 = "storagePrefs"
                kotlin.jvm.internal.C12775o.m28639i(r1, r0)
                java.util.concurrent.ConcurrentHashMap r2 = new java.util.concurrent.ConcurrentHashMap
                r2.<init>()
                java.util.Map r0 = r17.getAll()
                r3 = 0
                r4 = 1
                if (r0 == 0) goto L_0x001d
                boolean r5 = r0.isEmpty()
                if (r5 == 0) goto L_0x001b
                goto L_0x001d
            L_0x001b:
                r5 = r3
                goto L_0x001e
            L_0x001d:
                r5 = r4
            L_0x001e:
                if (r5 == 0) goto L_0x0021
                return r2
            L_0x0021:
                java.util.Set r0 = r0.keySet()
                java.util.Iterator r5 = r0.iterator()
            L_0x0029:
                boolean r0 = r5.hasNext()
                if (r0 == 0) goto L_0x0077
                java.lang.Object r0 = r5.next()
                r6 = r0
                java.lang.String r6 = (java.lang.String) r6
                r0 = 0
                java.lang.String r0 = r1.getString(r6, r0)     // Catch:{ Exception -> 0x0063 }
                if (r0 == 0) goto L_0x0046
                boolean r7 = p454wf.C13754v.m31532t(r0)     // Catch:{ Exception -> 0x0063 }
                if (r7 == 0) goto L_0x0044
                goto L_0x0046
            L_0x0044:
                r7 = r3
                goto L_0x0047
            L_0x0046:
                r7 = r4
            L_0x0047:
                if (r7 != 0) goto L_0x0029
                j0.c r8 = p126j0.C8266c.f11641a     // Catch:{ Exception -> 0x0063 }
                r10 = 0
                r11 = 0
                r12 = 0
                bo.app.c6$a$h r13 = new bo.app.c6$a$h     // Catch:{ Exception -> 0x0063 }
                r13.<init>(r0, r6)     // Catch:{ Exception -> 0x0063 }
                r14 = 7
                r15 = 0
                r9 = r16
                p126j0.C8266c.m16396e(r8, r9, r10, r11, r12, r13, r14, r15)     // Catch:{ Exception -> 0x0063 }
                java.lang.String r7 = "remoteAssetKey"
                kotlin.jvm.internal.C12775o.m28638h(r6, r7)     // Catch:{ Exception -> 0x0063 }
                r2.put(r6, r0)     // Catch:{ Exception -> 0x0063 }
                goto L_0x0029
            L_0x0063:
                r0 = move-exception
                r11 = r0
                j0.c r8 = p126j0.C8266c.f11641a
                j0.c$a r10 = p126j0.C8266c.C8267a.f11649e
                bo.app.c6$a$i r13 = new bo.app.c6$a$i
                r13.<init>(r6)
                r12 = 0
                r14 = 4
                r15 = 0
                r9 = r16
                p126j0.C8266c.m16396e(r8, r9, r10, r11, r12, r13, r14, r15)
                goto L_0x0029
            L_0x0077:
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: p042bo.app.C3055c6.C3056a.mo28764a(android.content.SharedPreferences):java.util.Map");
        }

        /* renamed from: a */
        public final void mo28766a(SharedPreferences.Editor editor, Map<String, String> map, Set<String> set, Map<String, String> map2) {
            SharedPreferences.Editor editor2 = editor;
            Map<String, String> map3 = map;
            Set<String> set2 = set;
            Map<String, String> map4 = map2;
            C12775o.m28639i(editor2, "editor");
            C12775o.m28639i(map3, "localAssetPaths");
            C12775o.m28639i(set2, "newRemotePathStrings");
            C12775o.m28639i(map4, "preservedLocalAssetPathMap");
            Iterator it = new HashSet(map.keySet()).iterator();
            while (it.hasNext()) {
                String str = (String) it.next();
                if (map4.containsKey(str)) {
                    C8266c.m16396e(C8266c.f11641a, this, (C8266c.C8267a) null, (Throwable) null, false, new C3061d(str), 7, (Object) null);
                } else if (!set2.contains(str)) {
                    map3.remove(str);
                    editor2.remove(str);
                    String str2 = map3.get(str);
                    if (!(str2 == null || C13754v.m31532t(str2))) {
                        C8266c.m16396e(C8266c.f11641a, this, (C8266c.C8267a) null, (Throwable) null, false, new C3062e(str2, str), 7, (Object) null);
                        C8233a.m16339a(new File(str2));
                    }
                }
            }
        }

        /* renamed from: a */
        public final boolean mo28768a(String str) {
            C12775o.m28639i(str, "path");
            return new File(str).exists();
        }

        /* renamed from: a */
        public final C11906l<Set<C3505o4>, Set<String>> mo28763a(List<? extends C3024b3> list) {
            C12775o.m28639i(list, "triggeredActions");
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            LinkedHashSet linkedHashSet2 = new LinkedHashSet();
            for (C3024b3 b3Var : list) {
                if (!b3Var.mo28660m()) {
                    C8266c.m16396e(C8266c.f11641a, this, (C8266c.C8267a) null, (Throwable) null, false, new C3067j(b3Var), 7, (Object) null);
                } else {
                    for (C3505o4 next : b3Var.mo28655b()) {
                        String b = next.mo29448b();
                        if (!C13754v.m31532t(b)) {
                            C8266c.m16396e(C8266c.f11641a, this, (C8266c.C8267a) null, (Throwable) null, false, new C3068k(b3Var, b), 7, (Object) null);
                            linkedHashSet.add(next);
                            linkedHashSet2.add(b);
                        }
                    }
                }
            }
            return new C11906l<>(linkedHashSet, linkedHashSet2);
        }
    }

    /* renamed from: bo.app.c6$b */
    public /* synthetic */ class C3069b {

        /* renamed from: a */
        public static final /* synthetic */ int[] f1583a;

        static {
            int[] iArr = new int[C3557p4.values().length];
            iArr[C3557p4.ZIP.ordinal()] = 1;
            iArr[C3557p4.IMAGE.ordinal()] = 2;
            iArr[C3557p4.FILE.ordinal()] = 3;
            f1583a = iArr;
        }
    }

    /* renamed from: bo.app.c6$c */
    static final class C3070c extends C12777p implements C13074a<String> {

        /* renamed from: b */
        final /* synthetic */ String f1584b;

        /* renamed from: c */
        final /* synthetic */ String f1585c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C3070c(String str, String str2) {
            super(0);
            this.f1584b = str;
            this.f1585c = str2;
        }

        /* renamed from: a */
        public final String invoke() {
            return "Storing local triggered action html zip asset at local path " + this.f1584b + " for remote path " + this.f1585c;
        }
    }

    /* renamed from: bo.app.c6$d */
    static final class C3071d extends C12777p implements C13074a<String> {

        /* renamed from: b */
        final /* synthetic */ String f1586b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C3071d(String str) {
            super(0);
            this.f1586b = str;
        }

        /* renamed from: a */
        public final String invoke() {
            return "Failed to store html zip asset for remote path " + this.f1586b + ". Not storing local asset";
        }
    }

    /* renamed from: bo.app.c6$e */
    static final class C3072e extends C12777p implements C13074a<String> {

        /* renamed from: b */
        final /* synthetic */ String f1587b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C3072e(String str) {
            super(0);
            this.f1587b = str;
        }

        /* renamed from: a */
        public final String invoke() {
            return C12775o.m28647q("Could not download ", this.f1587b);
        }
    }

    /* renamed from: bo.app.c6$f */
    static final class C3073f extends C12777p implements C13074a<String> {

        /* renamed from: b */
        final /* synthetic */ String f1588b;

        /* renamed from: c */
        final /* synthetic */ Map<String, String> f1589c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C3073f(String str, Map<String, String> map) {
            super(0);
            this.f1588b = str;
            this.f1589c = map;
        }

        /* renamed from: a */
        public final String invoke() {
            return "Not caching " + this.f1588b + " due to headers " + this.f1589c;
        }
    }

    /* renamed from: bo.app.c6$g */
    static final class C3074g extends C12777p implements C13074a<String> {

        /* renamed from: b */
        final /* synthetic */ Uri f1590b;

        /* renamed from: c */
        final /* synthetic */ String f1591c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C3074g(Uri uri, String str) {
            super(0);
            this.f1590b = uri;
            this.f1591c = str;
        }

        /* renamed from: a */
        public final String invoke() {
            return "Storing local triggered action asset at local path " + this.f1590b.getPath() + " for remote path " + this.f1591c;
        }
    }

    /* renamed from: bo.app.c6$h */
    static final class C3075h extends C12777p implements C13074a<String> {

        /* renamed from: b */
        final /* synthetic */ String f1592b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C3075h(String str) {
            super(0);
            this.f1592b = str;
        }

        /* renamed from: a */
        public final String invoke() {
            return "Failed to store asset for remote path " + this.f1592b + ". Not storing local asset";
        }
    }

    /* renamed from: bo.app.c6$i */
    static final class C3076i extends C12777p implements C13074a<String> {

        /* renamed from: b */
        final /* synthetic */ C3024b3 f1593b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C3076i(C3024b3 b3Var) {
            super(0);
            this.f1593b = b3Var;
        }

        /* renamed from: a */
        public final String invoke() {
            return C12775o.m28647q("Prefetch is turned off for this triggered action. Not retrieving local asset paths. Action id: ", this.f1593b.getId());
        }
    }

    /* renamed from: bo.app.c6$j */
    static final class C3077j extends C12777p implements C13074a<String> {

        /* renamed from: b */
        final /* synthetic */ String f1594b;

        /* renamed from: c */
        final /* synthetic */ String f1595c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C3077j(String str, String str2) {
            super(0);
            this.f1594b = str;
            this.f1595c = str2;
        }

        /* renamed from: a */
        public final String invoke() {
            return "Found local asset at path " + this.f1594b + " for remote asset at path: " + this.f1595c;
        }
    }

    /* renamed from: bo.app.c6$k */
    static final class C3078k extends C12777p implements C13074a<String> {

        /* renamed from: b */
        final /* synthetic */ String f1596b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C3078k(String str) {
            super(0);
            this.f1596b = str;
        }

        /* renamed from: a */
        public final String invoke() {
            return C12775o.m28647q("Could not find local asset for remote path ", this.f1596b);
        }
    }

    /* renamed from: bo.app.c6$l */
    static final class C3079l extends C12777p implements C13074a<String> {

        /* renamed from: b */
        final /* synthetic */ C3024b3 f1597b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C3079l(C3024b3 b3Var) {
            super(0);
            this.f1597b = b3Var;
        }

        /* renamed from: a */
        public final String invoke() {
            return C12775o.m28647q("No local assets found for action id: ", this.f1597b.getId());
        }
    }

    /* renamed from: bo.app.c6$m */
    static final class C3080m extends C12777p implements C13074a<String> {

        /* renamed from: b */
        final /* synthetic */ String f1598b;

        /* renamed from: c */
        final /* synthetic */ String f1599c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C3080m(String str, String str2) {
            super(0);
            this.f1598b = str;
            this.f1599c = str2;
        }

        /* renamed from: a */
        public final String invoke() {
            return "Adding new local path '" + this.f1598b + "' for remote path '" + this.f1599c + "' to cache.";
        }
    }

    /* renamed from: bo.app.c6$n */
    static final class C3081n extends C12777p implements C13074a<String> {

        /* renamed from: b */
        final /* synthetic */ String f1600b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C3081n(String str) {
            super(0);
            this.f1600b = str;
        }

        /* renamed from: a */
        public final String invoke() {
            return C12775o.m28647q("Failed to add new local path for remote path ", this.f1600b);
        }
    }

    public C3055c6(Context context, String str) {
        C12775o.m28639i(context, "context");
        C12775o.m28639i(str, "apiKey");
        SharedPreferences sharedPreferences = context.getSharedPreferences(C12775o.m28647q("com.appboy.storage.triggers.local_assets.", str), 0);
        C12775o.m28638h(sharedPreferences, "context.getSharedPrefere…ey, Context.MODE_PRIVATE)");
        this.f1563a = sharedPreferences;
        this.f1564b = f1562e.mo28764a(sharedPreferences);
        this.f1566d = new File(C12775o.m28647q(context.getCacheDir().getPath(), "/ab_triggers"));
    }

    /* renamed from: a */
    public final Map<String, String> mo28760a() {
        return this.f1564b;
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x0080 A[Catch:{ Exception -> 0x009b }] */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x005e A[SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo28762a(java.util.List<? extends p042bo.app.C3024b3> r13) {
        /*
            r12 = this;
            java.lang.String r0 = "triggeredActions"
            kotlin.jvm.internal.C12775o.m28639i(r13, r0)
            bo.app.c6$a r0 = f1562e
            ef.l r13 = r0.mo28763a((java.util.List<? extends p042bo.app.C3024b3>) r13)
            java.lang.Object r1 = r13.mo49109a()
            java.util.Set r1 = (java.util.Set) r1
            java.lang.Object r13 = r13.mo49110b()
            java.util.Set r13 = (java.util.Set) r13
            android.content.SharedPreferences r2 = r12.f1563a
            android.content.SharedPreferences$Editor r2 = r2.edit()
            java.lang.String r3 = "localAssetEditor"
            kotlin.jvm.internal.C12775o.m28638h(r2, r3)
            java.util.Map<java.lang.String, java.lang.String> r3 = r12.f1564b
            java.util.Map<java.lang.String, java.lang.String> r4 = r12.f1565c
            r0.mo28766a(r2, r3, r13, r4)
            java.io.File r13 = r12.f1566d
            java.util.Map<java.lang.String, java.lang.String> r3 = r12.f1564b
            java.util.Map<java.lang.String, java.lang.String> r4 = r12.f1565c
            r0.mo28767a(r13, r3, r4)
            java.util.ArrayList r13 = new java.util.ArrayList
            r13.<init>()
            java.util.Iterator r0 = r1.iterator()
        L_0x003b:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x005a
            java.lang.Object r1 = r0.next()
            r3 = r1
            bo.app.o4 r3 = (p042bo.app.C3505o4) r3
            java.util.Map r4 = r12.mo28760a()
            java.lang.String r3 = r3.mo29448b()
            boolean r3 = r4.containsKey(r3)
            if (r3 != 0) goto L_0x003b
            r13.add(r1)
            goto L_0x003b
        L_0x005a:
            java.util.Iterator r13 = r13.iterator()
        L_0x005e:
            boolean r0 = r13.hasNext()
            if (r0 == 0) goto L_0x00ae
            java.lang.Object r0 = r13.next()
            bo.app.o4 r0 = (p042bo.app.C3505o4) r0
            java.lang.String r1 = r0.mo29448b()
            java.lang.String r0 = r12.mo28759a((p042bo.app.C3505o4) r0)     // Catch:{ Exception -> 0x009b }
            if (r0 == 0) goto L_0x007d
            boolean r3 = p454wf.C13754v.m31532t(r0)     // Catch:{ Exception -> 0x009b }
            if (r3 == 0) goto L_0x007b
            goto L_0x007d
        L_0x007b:
            r3 = 0
            goto L_0x007e
        L_0x007d:
            r3 = 1
        L_0x007e:
            if (r3 != 0) goto L_0x005e
            j0.c r4 = p126j0.C8266c.f11641a     // Catch:{ Exception -> 0x009b }
            r6 = 0
            r7 = 0
            r8 = 0
            bo.app.c6$m r9 = new bo.app.c6$m     // Catch:{ Exception -> 0x009b }
            r9.<init>(r0, r1)     // Catch:{ Exception -> 0x009b }
            r10 = 7
            r11 = 0
            r5 = r12
            p126j0.C8266c.m16396e(r4, r5, r6, r7, r8, r9, r10, r11)     // Catch:{ Exception -> 0x009b }
            java.util.Map r3 = r12.mo28760a()     // Catch:{ Exception -> 0x009b }
            r3.put(r1, r0)     // Catch:{ Exception -> 0x009b }
            r2.putString(r1, r0)     // Catch:{ Exception -> 0x009b }
            goto L_0x005e
        L_0x009b:
            r0 = move-exception
            r6 = r0
            j0.c r3 = p126j0.C8266c.f11641a
            j0.c$a r5 = p126j0.C8266c.C8267a.f11649e
            bo.app.c6$n r8 = new bo.app.c6$n
            r8.<init>(r1)
            r7 = 0
            r9 = 4
            r10 = 0
            r4 = r12
            p126j0.C8266c.m16396e(r3, r4, r5, r6, r7, r8, r9, r10)
            goto L_0x005e
        L_0x00ae:
            r2.apply()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p042bo.app.C3055c6.mo28762a(java.util.List):void");
    }

    /* renamed from: a */
    public Map<String, String> mo28761a(C3024b3 b3Var) {
        C12775o.m28639i(b3Var, "triggeredAction");
        if (!b3Var.mo28660m()) {
            C8266c.m16396e(C8266c.f11641a, this, (C8266c.C8267a) null, (Throwable) null, false, new C3076i(b3Var), 7, (Object) null);
            return C12716r0.m28416g();
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (C3505o4 b : b3Var.mo28655b()) {
            String b2 = b.mo29448b();
            String str = this.f1564b.get(b2);
            if (str == null || !f1562e.mo28768a(str)) {
                C8266c.m16396e(C8266c.f11641a, this, C8266c.C8267a.f11651g, (Throwable) null, false, new C3078k(b2), 6, (Object) null);
            } else {
                C8266c.m16396e(C8266c.f11641a, this, (C8266c.C8267a) null, (Throwable) null, false, new C3077j(str, b2), 7, (Object) null);
                this.f1565c.put(b2, str);
                linkedHashMap.put(b2, str);
            }
        }
        if (linkedHashMap.isEmpty()) {
            C8266c.m16396e(C8266c.f11641a, this, C8266c.C8267a.f11651g, (Throwable) null, false, new C3079l(b3Var), 6, (Object) null);
        }
        return linkedHashMap;
    }

    /* renamed from: a */
    public final String mo28759a(C3505o4 o4Var) {
        Long a;
        C12775o.m28639i(o4Var, "remotePath");
        String b = o4Var.mo29448b();
        int i = C3069b.f1583a[o4Var.mo29447a().ordinal()];
        boolean z = true;
        if (i == 1) {
            String b2 = C8316l.m16518b(this.f1566d, b);
            if (b2 != null && !C13754v.m31532t(b2)) {
                z = false;
            }
            if (!z) {
                C8266c.m16396e(C8266c.f11641a, this, C8266c.C8267a.I, (Throwable) null, false, new C3070c(b2, b), 6, (Object) null);
                return b2;
            }
            C8266c.m16396e(C8266c.f11641a, this, (C8266c.C8267a) null, (Throwable) null, false, new C3071d(b), 7, (Object) null);
            return null;
        } else if (i == 2 || i == 3) {
            String b3 = f1562e.mo28769b(b);
            try {
                String file = this.f1566d.toString();
                C12775o.m28638h(file, "triggeredAssetDirectory.toString()");
                C11906l c = C8233a.m16341c(file, b, b3, (String) null, 8, (Object) null);
                File file2 = (File) c.mo49109a();
                Map map = (Map) c.mo49110b();
                String str = (String) map.get("expires");
                if (str == null || (a = C3745v1.m4012a(str)) == null || a.longValue() > 0) {
                    Uri fromFile = Uri.fromFile(file2);
                    if (fromFile != null) {
                        C8266c.m16396e(C8266c.f11641a, this, C8266c.C8267a.I, (Throwable) null, false, new C3074g(fromFile, b), 6, (Object) null);
                        return fromFile.getPath();
                    }
                    C8266c.m16396e(C8266c.f11641a, this, (C8266c.C8267a) null, (Throwable) null, false, new C3075h(b), 7, (Object) null);
                    return null;
                }
                C8266c.m16396e(C8266c.f11641a, this, (C8266c.C8267a) null, (Throwable) null, false, new C3073f(b, map), 7, (Object) null);
                return null;
            } catch (Exception e) {
                C8266c.m16396e(C8266c.f11641a, this, C8266c.C8267a.f11649e, e, false, new C3072e(b), 4, (Object) null);
                return null;
            }
        } else {
            throw new NoWhenBranchMatchedException();
        }
    }
}
