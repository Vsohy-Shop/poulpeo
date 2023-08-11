package com.squareup.okhttp.internal;

import android.util.Log;
import com.squareup.okhttp.Protocol;
import com.squareup.okhttp.internal.tls.AndroidTrustRootIndex;
import com.squareup.okhttp.internal.tls.RealTrustRootIndex;
import com.squareup.okhttp.internal.tls.TrustRootIndex;
import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
import okio.C13121c;

public class Platform {
    private static final Platform PLATFORM = findPlatform();

    private static class Android extends Platform {
        private static final int MAX_LOG_LENGTH = 4000;
        private final OptionalMethod<Socket> getAlpnSelectedProtocol;
        private final OptionalMethod<Socket> setAlpnProtocols;
        private final OptionalMethod<Socket> setHostname;
        private final OptionalMethod<Socket> setUseSessionTickets;
        private final Class<?> sslParametersClass;
        private final Method trafficStatsTagSocket;
        private final Method trafficStatsUntagSocket;

        public Android(Class<?> cls, OptionalMethod<Socket> optionalMethod, OptionalMethod<Socket> optionalMethod2, Method method, Method method2, OptionalMethod<Socket> optionalMethod3, OptionalMethod<Socket> optionalMethod4) {
            this.sslParametersClass = cls;
            this.setUseSessionTickets = optionalMethod;
            this.setHostname = optionalMethod2;
            this.trafficStatsTagSocket = method;
            this.trafficStatsUntagSocket = method2;
            this.getAlpnSelectedProtocol = optionalMethod3;
            this.setAlpnProtocols = optionalMethod4;
        }

        public void configureTlsExtensions(SSLSocket sSLSocket, String str, List<Protocol> list) {
            if (str != null) {
                this.setUseSessionTickets.invokeOptionalWithoutCheckedException(sSLSocket, Boolean.TRUE);
                this.setHostname.invokeOptionalWithoutCheckedException(sSLSocket, str);
            }
            OptionalMethod<Socket> optionalMethod = this.setAlpnProtocols;
            if (optionalMethod != null && optionalMethod.isSupported(sSLSocket)) {
                this.setAlpnProtocols.invokeWithoutCheckedException(sSLSocket, Platform.concatLengthPrefixed(list));
            }
        }

        public void connectSocket(Socket socket, InetSocketAddress inetSocketAddress, int i) {
            try {
                socket.connect(inetSocketAddress, i);
            } catch (AssertionError e) {
                if (Util.isAndroidGetsocknameError(e)) {
                    throw new IOException(e);
                }
                throw e;
            } catch (SecurityException e2) {
                IOException iOException = new IOException("Exception in connect");
                iOException.initCause(e2);
                throw iOException;
            }
        }

        public String getSelectedProtocol(SSLSocket sSLSocket) {
            byte[] bArr;
            OptionalMethod<Socket> optionalMethod = this.getAlpnSelectedProtocol;
            if (optionalMethod == null || !optionalMethod.isSupported(sSLSocket) || (bArr = (byte[]) this.getAlpnSelectedProtocol.invokeWithoutCheckedException(sSLSocket, new Object[0])) == null) {
                return null;
            }
            return new String(bArr, Util.UTF_8);
        }

        public void log(String str) {
            int min;
            int length = str.length();
            int i = 0;
            while (i < length) {
                int indexOf = str.indexOf(10, i);
                if (indexOf == -1) {
                    indexOf = length;
                }
                while (true) {
                    min = Math.min(indexOf, i + MAX_LOG_LENGTH);
                    Log.d("OkHttp", str.substring(i, min));
                    if (min >= indexOf) {
                        break;
                    }
                    i = min;
                }
                i = min + 1;
            }
        }

        public void tagSocket(Socket socket) {
            Method method = this.trafficStatsTagSocket;
            if (method != null) {
                try {
                    method.invoke((Object) null, new Object[]{socket});
                } catch (IllegalAccessException e) {
                    throw new RuntimeException(e);
                } catch (InvocationTargetException e2) {
                    throw new RuntimeException(e2.getCause());
                }
            }
        }

        public X509TrustManager trustManager(SSLSocketFactory sSLSocketFactory) {
            Object readFieldOrNull = Platform.readFieldOrNull(sSLSocketFactory, this.sslParametersClass, "sslParameters");
            if (readFieldOrNull == null) {
                try {
                    readFieldOrNull = Platform.readFieldOrNull(sSLSocketFactory, Class.forName("com.google.android.gms.org.conscrypt.SSLParametersImpl", false, sSLSocketFactory.getClass().getClassLoader()), "sslParameters");
                } catch (ClassNotFoundException unused) {
                    return null;
                }
            }
            Class cls = X509TrustManager.class;
            X509TrustManager x509TrustManager = (X509TrustManager) Platform.readFieldOrNull(readFieldOrNull, cls, "x509TrustManager");
            if (x509TrustManager != null) {
                return x509TrustManager;
            }
            return (X509TrustManager) Platform.readFieldOrNull(readFieldOrNull, cls, "trustManager");
        }

        public TrustRootIndex trustRootIndex(X509TrustManager x509TrustManager) {
            TrustRootIndex trustRootIndex = AndroidTrustRootIndex.get(x509TrustManager);
            if (trustRootIndex != null) {
                return trustRootIndex;
            }
            return Platform.super.trustRootIndex(x509TrustManager);
        }

        public void untagSocket(Socket socket) {
            Method method = this.trafficStatsUntagSocket;
            if (method != null) {
                try {
                    method.invoke((Object) null, new Object[]{socket});
                } catch (IllegalAccessException e) {
                    throw new RuntimeException(e);
                } catch (InvocationTargetException e2) {
                    throw new RuntimeException(e2.getCause());
                }
            }
        }
    }

    private static class JdkPlatform extends Platform {
        private final Class<?> sslContextClass;

        public JdkPlatform(Class<?> cls) {
            this.sslContextClass = cls;
        }

        public X509TrustManager trustManager(SSLSocketFactory sSLSocketFactory) {
            Object readFieldOrNull = Platform.readFieldOrNull(sSLSocketFactory, this.sslContextClass, "context");
            if (readFieldOrNull == null) {
                return null;
            }
            return (X509TrustManager) Platform.readFieldOrNull(readFieldOrNull, X509TrustManager.class, "trustManager");
        }
    }

    private static class JdkWithJettyBootPlatform extends JdkPlatform {
        private final Class<?> clientProviderClass;
        private final Method getMethod;
        private final Method putMethod;
        private final Method removeMethod;
        private final Class<?> serverProviderClass;

        public JdkWithJettyBootPlatform(Class<?> cls, Method method, Method method2, Method method3, Class<?> cls2, Class<?> cls3) {
            super(cls);
            this.putMethod = method;
            this.getMethod = method2;
            this.removeMethod = method3;
            this.clientProviderClass = cls2;
            this.serverProviderClass = cls3;
        }

        public void afterHandshake(SSLSocket sSLSocket) {
            try {
                this.removeMethod.invoke((Object) null, new Object[]{sSLSocket});
            } catch (IllegalAccessException | InvocationTargetException unused) {
                throw new AssertionError();
            }
        }

        public void configureTlsExtensions(SSLSocket sSLSocket, String str, List<Protocol> list) {
            ArrayList arrayList = new ArrayList(list.size());
            int size = list.size();
            for (int i = 0; i < size; i++) {
                Protocol protocol = list.get(i);
                if (protocol != Protocol.HTTP_1_0) {
                    arrayList.add(protocol.toString());
                }
            }
            try {
                this.putMethod.invoke((Object) null, new Object[]{sSLSocket, Proxy.newProxyInstance(Platform.class.getClassLoader(), new Class[]{this.clientProviderClass, this.serverProviderClass}, new JettyNegoProvider(arrayList))});
            } catch (IllegalAccessException | InvocationTargetException e) {
                throw new AssertionError(e);
            }
        }

        public String getSelectedProtocol(SSLSocket sSLSocket) {
            try {
                JettyNegoProvider jettyNegoProvider = (JettyNegoProvider) Proxy.getInvocationHandler(this.getMethod.invoke((Object) null, new Object[]{sSLSocket}));
                if (!jettyNegoProvider.unsupported && jettyNegoProvider.selected == null) {
                    Internal.logger.log(Level.INFO, "ALPN callback dropped: SPDY and HTTP/2 are disabled. Is alpn-boot on the boot class path?");
                    return null;
                } else if (jettyNegoProvider.unsupported) {
                    return null;
                } else {
                    return jettyNegoProvider.selected;
                }
            } catch (IllegalAccessException | InvocationTargetException unused) {
                throw new AssertionError();
            }
        }
    }

    private static class JettyNegoProvider implements InvocationHandler {
        private final List<String> protocols;
        /* access modifiers changed from: private */
        public String selected;
        /* access modifiers changed from: private */
        public boolean unsupported;

        public JettyNegoProvider(List<String> list) {
            this.protocols = list;
        }

        public Object invoke(Object obj, Method method, Object[] objArr) {
            String name = method.getName();
            Class<?> returnType = method.getReturnType();
            if (objArr == null) {
                objArr = Util.EMPTY_STRING_ARRAY;
            }
            if (name.equals("supports") && Boolean.TYPE == returnType) {
                return Boolean.TRUE;
            }
            if (name.equals("unsupported") && Void.TYPE == returnType) {
                this.unsupported = true;
                return null;
            } else if (name.equals("protocols") && objArr.length == 0) {
                return this.protocols;
            } else {
                if ((name.equals("selectProtocol") || name.equals("select")) && String.class == returnType && objArr.length == 1) {
                    Object obj2 = objArr[0];
                    if (obj2 instanceof List) {
                        List list = (List) obj2;
                        int size = list.size();
                        for (int i = 0; i < size; i++) {
                            if (this.protocols.contains(list.get(i))) {
                                String str = (String) list.get(i);
                                this.selected = str;
                                return str;
                            }
                        }
                        String str2 = this.protocols.get(0);
                        this.selected = str2;
                        return str2;
                    }
                }
                if ((!name.equals("protocolSelected") && !name.equals("selected")) || objArr.length != 1) {
                    return method.invoke(this, objArr);
                }
                this.selected = (String) objArr[0];
                return null;
            }
        }
    }

    static byte[] concatLengthPrefixed(List<Protocol> list) {
        C13121c cVar = new C13121c();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            Protocol protocol = list.get(i);
            if (protocol != Protocol.HTTP_1_0) {
                cVar.writeByte(protocol.toString().length());
                cVar.mo52486F(protocol.toString());
            }
        }
        return cVar.mo52548s();
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(3:40|41|42) */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00f5, code lost:
        return new com.squareup.okhttp.internal.Platform.JdkPlatform(r0);
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:40:0x00f0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static com.squareup.okhttp.internal.Platform findPlatform() {
        /*
            java.lang.Class<byte[]> r0 = byte[].class
            java.lang.Class<java.net.Socket> r1 = java.net.Socket.class
            java.lang.Class<javax.net.ssl.SSLSocket> r2 = javax.net.ssl.SSLSocket.class
            r3 = 1
            r4 = 0
            java.lang.String r5 = "com.android.org.conscrypt.SSLParametersImpl"
            java.lang.Class r5 = java.lang.Class.forName(r5)     // Catch:{ ClassNotFoundException -> 0x0010 }
        L_0x000e:
            r7 = r5
            goto L_0x0017
        L_0x0010:
            java.lang.String r5 = "org.apache.harmony.xnet.provider.jsse.SSLParametersImpl"
            java.lang.Class r5 = java.lang.Class.forName(r5)     // Catch:{ ClassNotFoundException -> 0x007a }
            goto L_0x000e
        L_0x0017:
            com.squareup.okhttp.internal.OptionalMethod r8 = new com.squareup.okhttp.internal.OptionalMethod     // Catch:{ ClassNotFoundException -> 0x007a }
            java.lang.String r5 = "setUseSessionTickets"
            java.lang.Class[] r6 = new java.lang.Class[r3]     // Catch:{ ClassNotFoundException -> 0x007a }
            java.lang.Class r9 = java.lang.Boolean.TYPE     // Catch:{ ClassNotFoundException -> 0x007a }
            r6[r4] = r9     // Catch:{ ClassNotFoundException -> 0x007a }
            r9 = 0
            r8.<init>(r9, r5, r6)     // Catch:{ ClassNotFoundException -> 0x007a }
            com.squareup.okhttp.internal.OptionalMethod r5 = new com.squareup.okhttp.internal.OptionalMethod     // Catch:{ ClassNotFoundException -> 0x007a }
            java.lang.String r6 = "setHostname"
            java.lang.Class[] r10 = new java.lang.Class[r3]     // Catch:{ ClassNotFoundException -> 0x007a }
            java.lang.Class<java.lang.String> r11 = java.lang.String.class
            r10[r4] = r11     // Catch:{ ClassNotFoundException -> 0x007a }
            r5.<init>(r9, r6, r10)     // Catch:{ ClassNotFoundException -> 0x007a }
            java.lang.String r6 = "android.net.TrafficStats"
            java.lang.Class r6 = java.lang.Class.forName(r6)     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x006c }
            java.lang.String r10 = "tagSocket"
            java.lang.Class[] r11 = new java.lang.Class[r3]     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x006c }
            r11[r4] = r1     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x006c }
            java.lang.reflect.Method r10 = r6.getMethod(r10, r11)     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x006c }
            java.lang.String r11 = "untagSocket"
            java.lang.Class[] r12 = new java.lang.Class[r3]     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x0069 }
            r12[r4] = r1     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x0069 }
            java.lang.reflect.Method r1 = r6.getMethod(r11, r12)     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x0069 }
            java.lang.String r6 = "android.net.Network"
            java.lang.Class.forName(r6)     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x0067 }
            com.squareup.okhttp.internal.OptionalMethod r6 = new com.squareup.okhttp.internal.OptionalMethod     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x0067 }
            java.lang.String r11 = "getAlpnSelectedProtocol"
            java.lang.Class[] r12 = new java.lang.Class[r4]     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x0067 }
            r6.<init>(r0, r11, r12)     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x0067 }
            com.squareup.okhttp.internal.OptionalMethod r11 = new com.squareup.okhttp.internal.OptionalMethod     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x006f }
            java.lang.String r12 = "setAlpnProtocols"
            java.lang.Class[] r13 = new java.lang.Class[r3]     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x006f }
            r13[r4] = r0     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x006f }
            r11.<init>(r9, r12, r13)     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x006f }
            r9 = r11
            goto L_0x006f
        L_0x0067:
            r6 = r9
            goto L_0x006f
        L_0x0069:
            r1 = r9
            r6 = r1
            goto L_0x006f
        L_0x006c:
            r1 = r9
            r6 = r1
            r10 = r6
        L_0x006f:
            r11 = r1
            r12 = r6
            r13 = r9
            com.squareup.okhttp.internal.Platform$Android r0 = new com.squareup.okhttp.internal.Platform$Android     // Catch:{ ClassNotFoundException -> 0x007a }
            r6 = r0
            r9 = r5
            r6.<init>(r7, r8, r9, r10, r11, r12, r13)     // Catch:{ ClassNotFoundException -> 0x007a }
            return r0
        L_0x007a:
            java.lang.String r0 = "sun.security.ssl.SSLContextImpl"
            java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch:{ ClassNotFoundException -> 0x00f6 }
            java.lang.String r1 = "org.eclipse.jetty.alpn.ALPN"
            java.lang.String r5 = "org.eclipse.jetty.alpn.ALPN"
            java.lang.Class r5 = java.lang.Class.forName(r5)     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x00f0 }
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x00f0 }
            r6.<init>()     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x00f0 }
            r6.append(r1)     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x00f0 }
            java.lang.String r7 = "$Provider"
            r6.append(r7)     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x00f0 }
            java.lang.String r6 = r6.toString()     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x00f0 }
            java.lang.Class r6 = java.lang.Class.forName(r6)     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x00f0 }
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x00f0 }
            r7.<init>()     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x00f0 }
            r7.append(r1)     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x00f0 }
            java.lang.String r8 = "$ClientProvider"
            r7.append(r8)     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x00f0 }
            java.lang.String r7 = r7.toString()     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x00f0 }
            java.lang.Class r10 = java.lang.Class.forName(r7)     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x00f0 }
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x00f0 }
            r7.<init>()     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x00f0 }
            r7.append(r1)     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x00f0 }
            java.lang.String r1 = "$ServerProvider"
            r7.append(r1)     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x00f0 }
            java.lang.String r1 = r7.toString()     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x00f0 }
            java.lang.Class r11 = java.lang.Class.forName(r1)     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x00f0 }
            java.lang.String r1 = "put"
            r7 = 2
            java.lang.Class[] r7 = new java.lang.Class[r7]     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x00f0 }
            r7[r4] = r2     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x00f0 }
            r7[r3] = r6     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x00f0 }
            java.lang.reflect.Method r7 = r5.getMethod(r1, r7)     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x00f0 }
            java.lang.String r1 = "get"
            java.lang.Class[] r6 = new java.lang.Class[r3]     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x00f0 }
            r6[r4] = r2     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x00f0 }
            java.lang.reflect.Method r8 = r5.getMethod(r1, r6)     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x00f0 }
            java.lang.String r1 = "remove"
            java.lang.Class[] r3 = new java.lang.Class[r3]     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x00f0 }
            r3[r4] = r2     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x00f0 }
            java.lang.reflect.Method r9 = r5.getMethod(r1, r3)     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x00f0 }
            com.squareup.okhttp.internal.Platform$JdkWithJettyBootPlatform r1 = new com.squareup.okhttp.internal.Platform$JdkWithJettyBootPlatform     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x00f0 }
            r5 = r1
            r6 = r0
            r5.<init>(r6, r7, r8, r9, r10, r11)     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x00f0 }
            return r1
        L_0x00f0:
            com.squareup.okhttp.internal.Platform$JdkPlatform r1 = new com.squareup.okhttp.internal.Platform$JdkPlatform     // Catch:{ ClassNotFoundException -> 0x00f6 }
            r1.<init>(r0)     // Catch:{ ClassNotFoundException -> 0x00f6 }
            return r1
        L_0x00f6:
            com.squareup.okhttp.internal.Platform r0 = new com.squareup.okhttp.internal.Platform
            r0.<init>()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.squareup.okhttp.internal.Platform.findPlatform():com.squareup.okhttp.internal.Platform");
    }

    public static Platform get() {
        return PLATFORM;
    }

    static <T> T readFieldOrNull(Object obj, Class<T> cls, String str) {
        Object readFieldOrNull;
        Class cls2 = obj.getClass();
        while (true) {
            Class<Object> cls3 = Object.class;
            if (cls2 != cls3) {
                try {
                    Field declaredField = cls2.getDeclaredField(str);
                    declaredField.setAccessible(true);
                    Object obj2 = declaredField.get(obj);
                    if (obj2 != null) {
                        if (cls.isInstance(obj2)) {
                            return cls.cast(obj2);
                        }
                    }
                    return null;
                } catch (NoSuchFieldException unused) {
                    cls2 = cls2.getSuperclass();
                } catch (IllegalAccessException unused2) {
                    throw new AssertionError();
                }
            } else if (str.equals("delegate") || (readFieldOrNull = readFieldOrNull(obj, cls3, "delegate")) == null) {
                return null;
            } else {
                return readFieldOrNull(readFieldOrNull, cls, str);
            }
        }
    }

    public void connectSocket(Socket socket, InetSocketAddress inetSocketAddress, int i) {
        socket.connect(inetSocketAddress, i);
    }

    public String getPrefix() {
        return "OkHttp";
    }

    public String getSelectedProtocol(SSLSocket sSLSocket) {
        return null;
    }

    public void log(String str) {
        System.out.println(str);
    }

    public void logW(String str) {
        System.out.println(str);
    }

    public X509TrustManager trustManager(SSLSocketFactory sSLSocketFactory) {
        return null;
    }

    public TrustRootIndex trustRootIndex(X509TrustManager x509TrustManager) {
        return new RealTrustRootIndex(x509TrustManager.getAcceptedIssuers());
    }

    public void afterHandshake(SSLSocket sSLSocket) {
    }

    public void tagSocket(Socket socket) {
    }

    public void untagSocket(Socket socket) {
    }

    public void configureTlsExtensions(SSLSocket sSLSocket, String str, List<Protocol> list) {
    }
}
