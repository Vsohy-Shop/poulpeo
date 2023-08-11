package p470zd;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.net.Socket;
import java.security.PrivilegedExceptionAction;
import java.security.Provider;
import java.security.Security;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.ssl.SSLEngine;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSocket;
import okio.C13121c;

/* renamed from: zd.f */
/* compiled from: Platform */
public class C14093f {

    /* renamed from: b */
    public static final Logger f23134b = Logger.getLogger(C14093f.class.getName());

    /* renamed from: c */
    private static final String[] f23135c = {"com.google.android.gms.org.conscrypt.OpenSSLProvider", "org.conscrypt.OpenSSLProvider", "com.android.org.conscrypt.OpenSSLProvider", "org.apache.harmony.xnet.provider.jsse.OpenSSLProvider", "com.google.android.libraries.stitch.sslguard.SslGuardProvider"};

    /* renamed from: d */
    private static final C14093f f23136d = m32714d();

    /* renamed from: a */
    private final Provider f23137a;

    /* renamed from: zd.f$a */
    /* compiled from: Platform */
    class C14094a implements PrivilegedExceptionAction<Method> {
        C14094a() {
        }

        /* renamed from: a */
        public Method run() {
            return SSLEngine.class.getMethod("getApplicationProtocol", new Class[0]);
        }
    }

    /* renamed from: zd.f$b */
    /* compiled from: Platform */
    class C14095b implements PrivilegedExceptionAction<Method> {
        C14095b() {
        }

        /* renamed from: a */
        public Method run() {
            return SSLParameters.class.getMethod("setApplicationProtocols", new Class[]{String[].class});
        }
    }

    /* renamed from: zd.f$c */
    /* compiled from: Platform */
    class C14096c implements PrivilegedExceptionAction<Method> {
        C14096c() {
        }

        /* renamed from: a */
        public Method run() {
            return SSLSocket.class.getMethod("getApplicationProtocol", new Class[0]);
        }
    }

    /* renamed from: zd.f$d */
    /* compiled from: Platform */
    private static class C14097d extends C14093f {

        /* renamed from: e */
        private final C14092e<Socket> f23138e;

        /* renamed from: f */
        private final C14092e<Socket> f23139f;

        /* renamed from: g */
        private final Method f23140g;

        /* renamed from: h */
        private final Method f23141h;

        /* renamed from: i */
        private final C14092e<Socket> f23142i;

        /* renamed from: j */
        private final C14092e<Socket> f23143j;

        /* renamed from: k */
        private final C14101h f23144k;

        public C14097d(C14092e<Socket> eVar, C14092e<Socket> eVar2, Method method, Method method2, C14092e<Socket> eVar3, C14092e<Socket> eVar4, Provider provider, C14101h hVar) {
            super(provider);
            this.f23138e = eVar;
            this.f23139f = eVar2;
            this.f23140g = method;
            this.f23141h = method2;
            this.f23142i = eVar3;
            this.f23143j = eVar4;
            this.f23144k = hVar;
        }

        /* renamed from: c */
        public void mo53867c(SSLSocket sSLSocket, String str, List<C14102g> list) {
            if (str != null) {
                this.f23138e.mo53863e(sSLSocket, Boolean.TRUE);
                this.f23139f.mo53863e(sSLSocket, str);
            }
            if (this.f23143j.mo53865g(sSLSocket)) {
                this.f23143j.mo53864f(sSLSocket, C14093f.m32713b(list));
            }
        }

        /* renamed from: h */
        public String mo53869h(SSLSocket sSLSocket) {
            byte[] bArr;
            if (this.f23142i.mo53865g(sSLSocket) && (bArr = (byte[]) this.f23142i.mo53864f(sSLSocket, new Object[0])) != null) {
                return new String(bArr, C14104i.f23173c);
            }
            return null;
        }

        /* renamed from: i */
        public C14101h mo53870i() {
            return this.f23144k;
        }
    }

    /* renamed from: zd.f$e */
    /* compiled from: Platform */
    private static class C14098e extends C14093f {

        /* renamed from: e */
        private final Method f23145e;

        /* renamed from: f */
        private final Method f23146f;

        /* synthetic */ C14098e(Provider provider, Method method, Method method2, C14094a aVar) {
            this(provider, method, method2);
        }

        /* renamed from: c */
        public void mo53867c(SSLSocket sSLSocket, String str, List<C14102g> list) {
            SSLParameters sSLParameters = sSLSocket.getSSLParameters();
            ArrayList arrayList = new ArrayList(list.size());
            for (C14102g next : list) {
                if (next != C14102g.HTTP_1_0) {
                    arrayList.add(next.toString());
                }
            }
            try {
                this.f23145e.invoke(sSLParameters, new Object[]{arrayList.toArray(new String[arrayList.size()])});
                sSLSocket.setSSLParameters(sSLParameters);
            } catch (IllegalAccessException e) {
                throw new RuntimeException(e);
            } catch (InvocationTargetException e2) {
                throw new RuntimeException(e2);
            }
        }

        /* renamed from: h */
        public String mo53869h(SSLSocket sSLSocket) {
            try {
                return (String) this.f23146f.invoke(sSLSocket, new Object[0]);
            } catch (IllegalAccessException e) {
                throw new RuntimeException(e);
            } catch (InvocationTargetException e2) {
                throw new RuntimeException(e2);
            }
        }

        /* renamed from: i */
        public C14101h mo53870i() {
            return C14101h.ALPN_AND_NPN;
        }

        private C14098e(Provider provider, Method method, Method method2) {
            super(provider);
            this.f23145e = method;
            this.f23146f = method2;
        }
    }

    /* renamed from: zd.f$f */
    /* compiled from: Platform */
    private static class C14099f extends C14093f {

        /* renamed from: e */
        private final Method f23147e;

        /* renamed from: f */
        private final Method f23148f;

        /* renamed from: g */
        private final Method f23149g;

        /* renamed from: h */
        private final Class<?> f23150h;

        /* renamed from: i */
        private final Class<?> f23151i;

        public C14099f(Method method, Method method2, Method method3, Class<?> cls, Class<?> cls2, Provider provider) {
            super(provider);
            this.f23147e = method;
            this.f23148f = method2;
            this.f23149g = method3;
            this.f23150h = cls;
            this.f23151i = cls2;
        }

        /* renamed from: a */
        public void mo53866a(SSLSocket sSLSocket) {
            try {
                this.f23149g.invoke((Object) null, new Object[]{sSLSocket});
            } catch (IllegalAccessException unused) {
                throw new AssertionError();
            } catch (InvocationTargetException e) {
                C14093f.f23134b.log(Level.FINE, "Failed to remove SSLSocket from Jetty ALPN", e);
            }
        }

        /* renamed from: c */
        public void mo53867c(SSLSocket sSLSocket, String str, List<C14102g> list) {
            ArrayList arrayList = new ArrayList(list.size());
            int size = list.size();
            for (int i = 0; i < size; i++) {
                C14102g gVar = list.get(i);
                if (gVar != C14102g.HTTP_1_0) {
                    arrayList.add(gVar.toString());
                }
            }
            try {
                this.f23147e.invoke((Object) null, new Object[]{sSLSocket, Proxy.newProxyInstance(C14093f.class.getClassLoader(), new Class[]{this.f23150h, this.f23151i}, new C14100g(arrayList))});
            } catch (InvocationTargetException e) {
                throw new AssertionError(e);
            } catch (IllegalAccessException e2) {
                throw new AssertionError(e2);
            }
        }

        /* renamed from: h */
        public String mo53869h(SSLSocket sSLSocket) {
            try {
                C14100g gVar = (C14100g) Proxy.getInvocationHandler(this.f23148f.invoke((Object) null, new Object[]{sSLSocket}));
                if (!gVar.f23153b && gVar.f23154c == null) {
                    C14093f.f23134b.log(Level.INFO, "ALPN callback dropped: SPDY and HTTP/2 are disabled. Is alpn-boot on the boot class path?");
                    return null;
                } else if (gVar.f23153b) {
                    return null;
                } else {
                    return gVar.f23154c;
                }
            } catch (InvocationTargetException unused) {
                throw new AssertionError();
            } catch (IllegalAccessException unused2) {
                throw new AssertionError();
            }
        }

        /* renamed from: i */
        public C14101h mo53870i() {
            return C14101h.ALPN_AND_NPN;
        }
    }

    /* renamed from: zd.f$g */
    /* compiled from: Platform */
    private static class C14100g implements InvocationHandler {

        /* renamed from: a */
        private final List<String> f23152a;
        /* access modifiers changed from: private */

        /* renamed from: b */
        public boolean f23153b;
        /* access modifiers changed from: private */

        /* renamed from: c */
        public String f23154c;

        public C14100g(List<String> list) {
            this.f23152a = list;
        }

        public Object invoke(Object obj, Method method, Object[] objArr) {
            String name = method.getName();
            Class<?> returnType = method.getReturnType();
            if (objArr == null) {
                objArr = C14104i.f23172b;
            }
            if (name.equals("supports") && Boolean.TYPE == returnType) {
                return Boolean.TRUE;
            }
            if (name.equals("unsupported") && Void.TYPE == returnType) {
                this.f23153b = true;
                return null;
            } else if (name.equals("protocols") && objArr.length == 0) {
                return this.f23152a;
            } else {
                if ((name.equals("selectProtocol") || name.equals("select")) && String.class == returnType && objArr.length == 1) {
                    Object obj2 = objArr[0];
                    if (obj2 instanceof List) {
                        List list = (List) obj2;
                        int size = list.size();
                        for (int i = 0; i < size; i++) {
                            if (this.f23152a.contains(list.get(i))) {
                                String str = (String) list.get(i);
                                this.f23154c = str;
                                return str;
                            }
                        }
                        String str2 = this.f23152a.get(0);
                        this.f23154c = str2;
                        return str2;
                    }
                }
                if ((!name.equals("protocolSelected") && !name.equals("selected")) || objArr.length != 1) {
                    return method.invoke(this, objArr);
                }
                this.f23154c = (String) objArr[0];
                return null;
            }
        }
    }

    /* renamed from: zd.f$h */
    /* compiled from: Platform */
    public enum C14101h {
        ALPN_AND_NPN,
        NPN,
        NONE
    }

    public C14093f(Provider provider) {
        this.f23137a = provider;
    }

    /* renamed from: b */
    public static byte[] m32713b(List<C14102g> list) {
        C13121c cVar = new C13121c();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            C14102g gVar = list.get(i);
            if (gVar != C14102g.HTTP_1_0) {
                cVar.writeByte(gVar.toString().length());
                cVar.mo52486F(gVar.toString());
            }
        }
        return cVar.mo52548s();
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x0080  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0095  */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static p470zd.C14093f m32714d() {
        /*
            java.lang.Class<java.net.Socket> r0 = java.net.Socket.class
            java.lang.Class<javax.net.ssl.SSLSocket> r1 = javax.net.ssl.SSLSocket.class
            java.security.Provider r9 = m32716f()
            r2 = 1
            r3 = 0
            r4 = 0
            if (r9 == 0) goto L_0x00a2
            zd.e r1 = new zd.e
            java.lang.Class[] r5 = new java.lang.Class[r2]
            java.lang.Class r6 = java.lang.Boolean.TYPE
            r5[r4] = r6
            java.lang.String r6 = "setUseSessionTickets"
            r1.<init>(r3, r6, r5)
            zd.e r5 = new zd.e
            java.lang.Class[] r6 = new java.lang.Class[r2]
            java.lang.Class<java.lang.String> r7 = java.lang.String.class
            r6[r4] = r7
            java.lang.String r7 = "setHostname"
            r5.<init>(r3, r7, r6)
            zd.e r7 = new zd.e
            java.lang.String r6 = "getAlpnSelectedProtocol"
            java.lang.Class[] r8 = new java.lang.Class[r4]
            java.lang.Class<byte[]> r10 = byte[].class
            r7.<init>(r10, r6, r8)
            zd.e r8 = new zd.e
            java.lang.Class[] r6 = new java.lang.Class[r2]
            r6[r4] = r10
            java.lang.String r10 = "setAlpnProtocols"
            r8.<init>(r3, r10, r6)
            java.lang.String r6 = "android.net.TrafficStats"
            java.lang.Class r6 = java.lang.Class.forName(r6)     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x0059 }
            java.lang.String r10 = "tagSocket"
            java.lang.Class[] r11 = new java.lang.Class[r2]     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x0059 }
            r11[r4] = r0     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x0059 }
            java.lang.reflect.Method r10 = r6.getMethod(r10, r11)     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x0059 }
            java.lang.String r11 = "untagSocket"
            java.lang.Class[] r2 = new java.lang.Class[r2]     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x005a }
            r2[r4] = r0     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x005a }
            java.lang.reflect.Method r0 = r6.getMethod(r11, r2)     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x005a }
            r6 = r0
            goto L_0x005b
        L_0x0059:
            r10 = r3
        L_0x005a:
            r6 = r3
        L_0x005b:
            java.lang.String r0 = r9.getName()
            java.lang.String r2 = "GmsCore_OpenSSL"
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L_0x0095
            java.lang.String r0 = r9.getName()
            java.lang.String r2 = "Conscrypt"
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L_0x0095
            java.lang.String r0 = r9.getName()
            java.lang.String r2 = "Ssl_Guard"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x0080
            goto L_0x0095
        L_0x0080:
            boolean r0 = m32718k()
            if (r0 == 0) goto L_0x0089
            zd.f$h r0 = p470zd.C14093f.C14101h.ALPN_AND_NPN
            goto L_0x0097
        L_0x0089:
            boolean r0 = m32717j()
            if (r0 == 0) goto L_0x0092
            zd.f$h r0 = p470zd.C14093f.C14101h.NPN
            goto L_0x0097
        L_0x0092:
            zd.f$h r0 = p470zd.C14093f.C14101h.NONE
            goto L_0x0097
        L_0x0095:
            zd.f$h r0 = p470zd.C14093f.C14101h.ALPN_AND_NPN
        L_0x0097:
            zd.f$d r11 = new zd.f$d
            r2 = r11
            r3 = r1
            r4 = r5
            r5 = r10
            r10 = r0
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10)
            return r11
        L_0x00a2:
            javax.net.ssl.SSLContext r0 = javax.net.ssl.SSLContext.getDefault()     // Catch:{ NoSuchAlgorithmException -> 0x0159 }
            java.security.Provider r0 = r0.getProvider()     // Catch:{ NoSuchAlgorithmException -> 0x0159 }
            java.lang.String r5 = "TLS"
            javax.net.ssl.SSLContext r5 = javax.net.ssl.SSLContext.getInstance(r5, r0)     // Catch:{ IllegalAccessException | InvocationTargetException | KeyManagementException | NoSuchAlgorithmException | PrivilegedActionException -> 0x00e3 }
            r5.init(r3, r3, r3)     // Catch:{ IllegalAccessException | InvocationTargetException | KeyManagementException | NoSuchAlgorithmException | PrivilegedActionException -> 0x00e3 }
            javax.net.ssl.SSLEngine r5 = r5.createSSLEngine()     // Catch:{ IllegalAccessException | InvocationTargetException | KeyManagementException | NoSuchAlgorithmException | PrivilegedActionException -> 0x00e3 }
            zd.f$a r6 = new zd.f$a     // Catch:{ IllegalAccessException | InvocationTargetException | KeyManagementException | NoSuchAlgorithmException | PrivilegedActionException -> 0x00e3 }
            r6.<init>()     // Catch:{ IllegalAccessException | InvocationTargetException | KeyManagementException | NoSuchAlgorithmException | PrivilegedActionException -> 0x00e3 }
            java.lang.Object r6 = java.security.AccessController.doPrivileged(r6)     // Catch:{ IllegalAccessException | InvocationTargetException | KeyManagementException | NoSuchAlgorithmException | PrivilegedActionException -> 0x00e3 }
            java.lang.reflect.Method r6 = (java.lang.reflect.Method) r6     // Catch:{ IllegalAccessException | InvocationTargetException | KeyManagementException | NoSuchAlgorithmException | PrivilegedActionException -> 0x00e3 }
            java.lang.Object[] r7 = new java.lang.Object[r4]     // Catch:{ IllegalAccessException | InvocationTargetException | KeyManagementException | NoSuchAlgorithmException | PrivilegedActionException -> 0x00e3 }
            r6.invoke(r5, r7)     // Catch:{ IllegalAccessException | InvocationTargetException | KeyManagementException | NoSuchAlgorithmException | PrivilegedActionException -> 0x00e3 }
            zd.f$b r5 = new zd.f$b     // Catch:{ IllegalAccessException | InvocationTargetException | KeyManagementException | NoSuchAlgorithmException | PrivilegedActionException -> 0x00e3 }
            r5.<init>()     // Catch:{ IllegalAccessException | InvocationTargetException | KeyManagementException | NoSuchAlgorithmException | PrivilegedActionException -> 0x00e3 }
            java.lang.Object r5 = java.security.AccessController.doPrivileged(r5)     // Catch:{ IllegalAccessException | InvocationTargetException | KeyManagementException | NoSuchAlgorithmException | PrivilegedActionException -> 0x00e3 }
            java.lang.reflect.Method r5 = (java.lang.reflect.Method) r5     // Catch:{ IllegalAccessException | InvocationTargetException | KeyManagementException | NoSuchAlgorithmException | PrivilegedActionException -> 0x00e3 }
            zd.f$c r6 = new zd.f$c     // Catch:{ IllegalAccessException | InvocationTargetException | KeyManagementException | NoSuchAlgorithmException | PrivilegedActionException -> 0x00e3 }
            r6.<init>()     // Catch:{ IllegalAccessException | InvocationTargetException | KeyManagementException | NoSuchAlgorithmException | PrivilegedActionException -> 0x00e3 }
            java.lang.Object r6 = java.security.AccessController.doPrivileged(r6)     // Catch:{ IllegalAccessException | InvocationTargetException | KeyManagementException | NoSuchAlgorithmException | PrivilegedActionException -> 0x00e3 }
            java.lang.reflect.Method r6 = (java.lang.reflect.Method) r6     // Catch:{ IllegalAccessException | InvocationTargetException | KeyManagementException | NoSuchAlgorithmException | PrivilegedActionException -> 0x00e3 }
            zd.f$e r7 = new zd.f$e     // Catch:{ IllegalAccessException | InvocationTargetException | KeyManagementException | NoSuchAlgorithmException | PrivilegedActionException -> 0x00e3 }
            r7.<init>(r0, r5, r6, r3)     // Catch:{ IllegalAccessException | InvocationTargetException | KeyManagementException | NoSuchAlgorithmException | PrivilegedActionException -> 0x00e3 }
            return r7
        L_0x00e3:
            java.lang.String r3 = "org.eclipse.jetty.alpn.ALPN"
            java.lang.String r5 = "org.eclipse.jetty.alpn.ALPN"
            java.lang.Class r5 = java.lang.Class.forName(r5)     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x0153 }
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x0153 }
            r6.<init>()     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x0153 }
            r6.append(r3)     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x0153 }
            java.lang.String r7 = "$Provider"
            r6.append(r7)     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x0153 }
            java.lang.String r6 = r6.toString()     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x0153 }
            java.lang.Class r6 = java.lang.Class.forName(r6)     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x0153 }
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x0153 }
            r7.<init>()     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x0153 }
            r7.append(r3)     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x0153 }
            java.lang.String r8 = "$ClientProvider"
            r7.append(r8)     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x0153 }
            java.lang.String r7 = r7.toString()     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x0153 }
            java.lang.Class r9 = java.lang.Class.forName(r7)     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x0153 }
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x0153 }
            r7.<init>()     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x0153 }
            r7.append(r3)     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x0153 }
            java.lang.String r3 = "$ServerProvider"
            r7.append(r3)     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x0153 }
            java.lang.String r3 = r7.toString()     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x0153 }
            java.lang.Class r10 = java.lang.Class.forName(r3)     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x0153 }
            java.lang.String r3 = "put"
            r7 = 2
            java.lang.Class[] r7 = new java.lang.Class[r7]     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x0153 }
            r7[r4] = r1     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x0153 }
            r7[r2] = r6     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x0153 }
            java.lang.reflect.Method r6 = r5.getMethod(r3, r7)     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x0153 }
            java.lang.String r3 = "get"
            java.lang.Class[] r7 = new java.lang.Class[r2]     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x0153 }
            r7[r4] = r1     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x0153 }
            java.lang.reflect.Method r7 = r5.getMethod(r3, r7)     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x0153 }
            java.lang.String r3 = "remove"
            java.lang.Class[] r2 = new java.lang.Class[r2]     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x0153 }
            r2[r4] = r1     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x0153 }
            java.lang.reflect.Method r8 = r5.getMethod(r3, r2)     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x0153 }
            zd.f$f r1 = new zd.f$f     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x0153 }
            r5 = r1
            r11 = r0
            r5.<init>(r6, r7, r8, r9, r10, r11)     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x0153 }
            return r1
        L_0x0153:
            zd.f r1 = new zd.f
            r1.<init>(r0)
            return r1
        L_0x0159:
            r0 = move-exception
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p470zd.C14093f.m32714d():zd.f");
    }

    /* renamed from: e */
    public static C14093f m32715e() {
        return f23136d;
    }

    /* renamed from: f */
    private static Provider m32716f() {
        for (Provider provider : Security.getProviders()) {
            for (String str : f23135c) {
                if (str.equals(provider.getClass().getName())) {
                    f23134b.log(Level.FINE, "Found registered provider {0}", str);
                    return provider;
                }
            }
        }
        f23134b.log(Level.WARNING, "Unable to find Conscrypt");
        return null;
    }

    /* renamed from: j */
    private static boolean m32717j() {
        try {
            C14093f.class.getClassLoader().loadClass("android.app.ActivityOptions");
            return true;
        } catch (ClassNotFoundException e) {
            f23134b.log(Level.FINE, "Can't find class", e);
            return false;
        }
    }

    /* renamed from: k */
    private static boolean m32718k() {
        try {
            C14093f.class.getClassLoader().loadClass("android.net.Network");
            return true;
        } catch (ClassNotFoundException e) {
            f23134b.log(Level.FINE, "Can't find class", e);
            return false;
        }
    }

    /* renamed from: g */
    public Provider mo53868g() {
        return this.f23137a;
    }

    /* renamed from: h */
    public String mo53869h(SSLSocket sSLSocket) {
        return null;
    }

    /* renamed from: i */
    public C14101h mo53870i() {
        return C14101h.NONE;
    }

    /* renamed from: a */
    public void mo53866a(SSLSocket sSLSocket) {
    }

    /* renamed from: c */
    public void mo53867c(SSLSocket sSLSocket, String str, List<C14102g> list) {
    }
}
