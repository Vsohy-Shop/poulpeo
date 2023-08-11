package p364io.grpc.internal;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Hashtable;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Pattern;
import javax.naming.NamingEnumeration;
import javax.naming.NamingException;
import javax.naming.directory.Attribute;
import javax.naming.directory.DirContext;
import javax.naming.directory.InitialDirContext;
import p364io.grpc.internal.C12214c0;

/* renamed from: io.grpc.internal.z0 */
/* compiled from: JndiResourceResolverFactory */
final class C12502z0 implements C12214c0.C12222g {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public static final Throwable f19995a = m27630d();

    /* renamed from: io.grpc.internal.z0$a */
    /* compiled from: JndiResourceResolverFactory */
    static final class C12503a implements C12505c {
        C12503a() {
        }

        /* renamed from: b */
        private static void m27633b() {
            if (C12502z0.f19995a != null) {
                throw new UnsupportedOperationException("JNDI is not currently available", C12502z0.f19995a);
            }
        }

        /* renamed from: c */
        private static void m27634c(NamingEnumeration<?> namingEnumeration, NamingException namingException) {
            try {
                namingEnumeration.close();
            } catch (NamingException unused) {
            }
            throw namingException;
        }

        /* renamed from: d */
        private static void m27635d(DirContext dirContext, NamingException namingException) {
            try {
                dirContext.close();
            } catch (NamingException unused) {
            }
            throw namingException;
        }

        /* renamed from: a */
        public List<String> mo50171a(String str, String str2) {
            m27633b();
            String[] strArr = {str};
            ArrayList arrayList = new ArrayList();
            Hashtable hashtable = new Hashtable();
            hashtable.put("com.sun.jndi.ldap.connect.timeout", "5000");
            hashtable.put("com.sun.jndi.ldap.read.timeout", "5000");
            InitialDirContext initialDirContext = new InitialDirContext(hashtable);
            try {
                NamingEnumeration all = initialDirContext.getAttributes(str2, strArr).getAll();
                while (all.hasMore()) {
                    try {
                        NamingEnumeration all2 = ((Attribute) all.next()).getAll();
                        while (all2.hasMore()) {
                            try {
                                arrayList.add(String.valueOf(all2.next()));
                            } catch (NamingException e) {
                                m27634c(all2, e);
                            }
                        }
                        all2.close();
                    } catch (NamingException e2) {
                        m27634c(all, e2);
                    }
                }
                all.close();
            } catch (NamingException e3) {
                m27635d(initialDirContext, e3);
            }
            initialDirContext.close();
            return arrayList;
        }
    }

    /* renamed from: io.grpc.internal.z0$b */
    /* compiled from: JndiResourceResolverFactory */
    static final class C12504b implements C12214c0.C12221f {

        /* renamed from: b */
        private static final Logger f19996b = Logger.getLogger(C12504b.class.getName());

        /* renamed from: c */
        private static final Pattern f19997c = Pattern.compile("\\s+");

        /* renamed from: a */
        private final C12505c f19998a;

        public C12504b(C12505c cVar) {
            this.f19998a = cVar;
        }

        /* renamed from: b */
        static String m27637b(String str) {
            StringBuilder sb = new StringBuilder(str.length());
            int i = 0;
            boolean z = false;
            while (i < str.length()) {
                char charAt = str.charAt(i);
                if (!z) {
                    if (charAt != ' ') {
                        if (charAt == '\"') {
                            z = true;
                        }
                    }
                    i++;
                } else if (charAt == '\"') {
                    z = false;
                    i++;
                } else if (charAt == '\\') {
                    i++;
                    charAt = str.charAt(i);
                }
                sb.append(charAt);
                i++;
            }
            return sb.toString();
        }

        /* renamed from: a */
        public List<String> mo49762a(String str) {
            Logger logger = f19996b;
            Level level = Level.FINER;
            if (logger.isLoggable(level)) {
                logger.log(level, "About to query TXT records for {0}", new Object[]{str});
            }
            C12505c cVar = this.f19998a;
            List<String> a = cVar.mo50171a("TXT", "dns:///" + str);
            if (logger.isLoggable(level)) {
                logger.log(level, "Found {0} TXT records", new Object[]{Integer.valueOf(a.size())});
            }
            ArrayList arrayList = new ArrayList(a.size());
            for (String b : a) {
                arrayList.add(m27637b(b));
            }
            return Collections.unmodifiableList(arrayList);
        }
    }

    /* renamed from: io.grpc.internal.z0$c */
    /* compiled from: JndiResourceResolverFactory */
    interface C12505c {
        /* renamed from: a */
        List<String> mo50171a(String str, String str2);
    }

    /* renamed from: d */
    private static Throwable m27630d() {
        try {
            Class.forName("javax.naming.directory.InitialDirContext");
            Class.forName("com.sun.jndi.dns.DnsContextFactory");
            return null;
        } catch (ClassNotFoundException e) {
            return e;
        } catch (RuntimeException e2) {
            return e2;
        } catch (Error e3) {
            return e3;
        }
    }

    /* renamed from: a */
    public C12214c0.C12221f mo49763a() {
        if (mo49764b() != null) {
            return null;
        }
        return new C12504b(new C12503a());
    }

    /* renamed from: b */
    public Throwable mo49764b() {
        return f19995a;
    }
}
