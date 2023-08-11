package okhttp3.internal.platform;

import androidx.core.p004os.EnvironmentCompat;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLSocket;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import okhttp3.Protocol;

/* compiled from: Jdk8WithJettyBootPlatform.kt */
public final class Jdk8WithJettyBootPlatform extends Platform {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    private final Class<?> clientProviderClass;
    private final Method getMethod;
    private final Method putMethod;
    private final Method removeMethod;
    private final Class<?> serverProviderClass;

    /* compiled from: Jdk8WithJettyBootPlatform.kt */
    private static final class AlpnProvider implements InvocationHandler {
        private final List<String> protocols;
        private String selected;
        private boolean unsupported;

        public AlpnProvider(List<String> list) {
            C12775o.m28639i(list, "protocols");
            this.protocols = list;
        }

        public final String getSelected() {
            return this.selected;
        }

        public final boolean getUnsupported() {
            return this.unsupported;
        }

        public Object invoke(Object obj, Method method, Object[] objArr) {
            boolean z;
            C12775o.m28639i(obj, "proxy");
            C12775o.m28639i(method, "method");
            if (objArr == null) {
                objArr = new Object[0];
            }
            String name = method.getName();
            Class<?> returnType = method.getReturnType();
            if (C12775o.m28634d(name, "supports") && C12775o.m28634d(Boolean.TYPE, returnType)) {
                return Boolean.TRUE;
            }
            if (!C12775o.m28634d(name, "unsupported") || !C12775o.m28634d(Void.TYPE, returnType)) {
                if (C12775o.m28634d(name, "protocols")) {
                    if (objArr.length == 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z) {
                        return this.protocols;
                    }
                }
                if ((C12775o.m28634d(name, "selectProtocol") || C12775o.m28634d(name, "select")) && C12775o.m28634d(String.class, returnType) && objArr.length == 1) {
                    Object obj2 = objArr[0];
                    if (obj2 instanceof List) {
                        if (obj2 != null) {
                            List list = (List) obj2;
                            int size = list.size();
                            if (size >= 0) {
                                int i = 0;
                                while (true) {
                                    int i2 = i + 1;
                                    Object obj3 = list.get(i);
                                    if (obj3 != null) {
                                        String str = (String) obj3;
                                        if (this.protocols.contains(str)) {
                                            this.selected = str;
                                            return str;
                                        } else if (i == size) {
                                            break;
                                        } else {
                                            i = i2;
                                        }
                                    } else {
                                        throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                                    }
                                }
                            }
                            String str2 = this.protocols.get(0);
                            this.selected = str2;
                            return str2;
                        }
                        throw new NullPointerException("null cannot be cast to non-null type kotlin.collections.List<*>");
                    }
                }
                if ((!C12775o.m28634d(name, "protocolSelected") && !C12775o.m28634d(name, "selected")) || objArr.length != 1) {
                    return method.invoke(this, Arrays.copyOf(objArr, objArr.length));
                }
                Object obj4 = objArr[0];
                if (obj4 != null) {
                    this.selected = (String) obj4;
                    return null;
                }
                throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
            }
            this.unsupported = true;
            return null;
        }

        public final void setSelected(String str) {
            this.selected = str;
        }

        public final void setUnsupported(boolean z) {
            this.unsupported = z;
        }
    }

    /* compiled from: Jdk8WithJettyBootPlatform.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Platform buildIfSupported() {
            Class<SSLSocket> cls = SSLSocket.class;
            String property = System.getProperty("java.specification.version", EnvironmentCompat.MEDIA_UNKNOWN);
            try {
                C12775o.m28638h(property, "jvmVersion");
                if (Integer.parseInt(property) >= 9) {
                    return null;
                }
            } catch (NumberFormatException unused) {
            }
            try {
                Class<?> cls2 = Class.forName("org.eclipse.jetty.alpn.ALPN", true, (ClassLoader) null);
                Class<?> cls3 = Class.forName(C12775o.m28647q("org.eclipse.jetty.alpn.ALPN", "$Provider"), true, (ClassLoader) null);
                Class<?> cls4 = Class.forName(C12775o.m28647q("org.eclipse.jetty.alpn.ALPN", "$ClientProvider"), true, (ClassLoader) null);
                Class<?> cls5 = Class.forName(C12775o.m28647q("org.eclipse.jetty.alpn.ALPN", "$ServerProvider"), true, (ClassLoader) null);
                Method method = cls2.getMethod("put", new Class[]{cls, cls3});
                Method method2 = cls2.getMethod("get", new Class[]{cls});
                Method method3 = cls2.getMethod("remove", new Class[]{cls});
                C12775o.m28638h(method, "putMethod");
                C12775o.m28638h(method2, "getMethod");
                C12775o.m28638h(method3, "removeMethod");
                C12775o.m28638h(cls4, "clientProviderClass");
                C12775o.m28638h(cls5, "serverProviderClass");
                return new Jdk8WithJettyBootPlatform(method, method2, method3, cls4, cls5);
            } catch (ClassNotFoundException | NoSuchMethodException unused2) {
                return null;
            }
        }
    }

    public Jdk8WithJettyBootPlatform(Method method, Method method2, Method method3, Class<?> cls, Class<?> cls2) {
        C12775o.m28639i(method, "putMethod");
        C12775o.m28639i(method2, "getMethod");
        C12775o.m28639i(method3, "removeMethod");
        C12775o.m28639i(cls, "clientProviderClass");
        C12775o.m28639i(cls2, "serverProviderClass");
        this.putMethod = method;
        this.getMethod = method2;
        this.removeMethod = method3;
        this.clientProviderClass = cls;
        this.serverProviderClass = cls2;
    }

    public void afterHandshake(SSLSocket sSLSocket) {
        C12775o.m28639i(sSLSocket, "sslSocket");
        try {
            this.removeMethod.invoke((Object) null, new Object[]{sSLSocket});
        } catch (IllegalAccessException e) {
            throw new AssertionError("failed to remove ALPN", e);
        } catch (InvocationTargetException e2) {
            throw new AssertionError("failed to remove ALPN", e2);
        }
    }

    public void configureTlsExtensions(SSLSocket sSLSocket, String str, List<? extends Protocol> list) {
        C12775o.m28639i(sSLSocket, "sslSocket");
        C12775o.m28639i(list, "protocols");
        List<String> alpnProtocolNames = Platform.Companion.alpnProtocolNames(list);
        try {
            Object newProxyInstance = Proxy.newProxyInstance(Platform.class.getClassLoader(), new Class[]{this.clientProviderClass, this.serverProviderClass}, new AlpnProvider(alpnProtocolNames));
            this.putMethod.invoke((Object) null, new Object[]{sSLSocket, newProxyInstance});
        } catch (InvocationTargetException e) {
            throw new AssertionError("failed to set ALPN", e);
        } catch (IllegalAccessException e2) {
            throw new AssertionError("failed to set ALPN", e2);
        }
    }

    public String getSelectedProtocol(SSLSocket sSLSocket) {
        C12775o.m28639i(sSLSocket, "sslSocket");
        try {
            InvocationHandler invocationHandler = Proxy.getInvocationHandler(this.getMethod.invoke((Object) null, new Object[]{sSLSocket}));
            if (invocationHandler != null) {
                AlpnProvider alpnProvider = (AlpnProvider) invocationHandler;
                if (!alpnProvider.getUnsupported() && alpnProvider.getSelected() == null) {
                    Platform.log$default(this, "ALPN callback dropped: HTTP/2 is disabled. Is alpn-boot on the boot class path?", 0, (Throwable) null, 6, (Object) null);
                    return null;
                } else if (alpnProvider.getUnsupported()) {
                    return null;
                } else {
                    return alpnProvider.getSelected();
                }
            } else {
                throw new NullPointerException("null cannot be cast to non-null type okhttp3.internal.platform.Jdk8WithJettyBootPlatform.AlpnProvider");
            }
        } catch (InvocationTargetException e) {
            throw new AssertionError("failed to get ALPN selected protocol", e);
        } catch (IllegalAccessException e2) {
            throw new AssertionError("failed to get ALPN selected protocol", e2);
        }
    }
}
