package p464yd;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSocket;
import p111h6.C8012n;
import p364io.grpc.internal.C12404r0;
import p470zd.C14092e;
import p470zd.C14093f;
import p470zd.C14102g;
import p470zd.C14104i;

/* renamed from: yd.j */
/* compiled from: OkHttpProtocolNegotiator */
class C13907j {
    /* access modifiers changed from: private */

    /* renamed from: b */
    public static final Logger f22790b;

    /* renamed from: c */
    private static final C14093f f22791c = C14093f.m32715e();

    /* renamed from: d */
    private static C13907j f22792d;

    /* renamed from: a */
    protected final C14093f f22793a;

    /* renamed from: yd.j$a */
    /* compiled from: OkHttpProtocolNegotiator */
    static final class C13908a extends C13907j {

        /* renamed from: e */
        private static final C14092e<Socket> f22794e;

        /* renamed from: f */
        private static final C14092e<Socket> f22795f;

        /* renamed from: g */
        private static final C14092e<Socket> f22796g;

        /* renamed from: h */
        private static final C14092e<Socket> f22797h;

        /* renamed from: i */
        private static final C14092e<Socket> f22798i;

        /* renamed from: j */
        private static final C14092e<Socket> f22799j;

        /* renamed from: k */
        private static final Method f22800k;

        /* renamed from: l */
        private static final Method f22801l;

        /* renamed from: m */
        private static final Method f22802m;

        /* renamed from: n */
        private static final Method f22803n;

        /* renamed from: o */
        private static final Method f22804o;

        /* renamed from: p */
        private static final Method f22805p;

        /* renamed from: q */
        private static final Constructor<?> f22806q;

        static {
            Method method;
            Method method2;
            Method method3;
            Method method4;
            Method method5;
            Method method6;
            Method method7;
            Method method8;
            Class<?> cls;
            Class<SSLParameters> cls2 = SSLParameters.class;
            Class<SSLSocket> cls3 = SSLSocket.class;
            Class cls4 = Boolean.TYPE;
            Constructor<?> constructor = null;
            f22794e = new C14092e<>((Class<?>) null, "setUseSessionTickets", cls4);
            Class<String> cls5 = String.class;
            f22795f = new C14092e<>((Class<?>) null, "setHostname", cls5);
            Class<byte[]> cls6 = byte[].class;
            f22796g = new C14092e<>(cls6, "getAlpnSelectedProtocol", new Class[0]);
            f22797h = new C14092e<>((Class<?>) null, "setAlpnProtocols", cls6);
            f22798i = new C14092e<>(cls6, "getNpnSelectedProtocol", new Class[0]);
            f22799j = new C14092e<>((Class<?>) null, "setNpnProtocols", cls6);
            try {
                method4 = cls2.getMethod("setApplicationProtocols", new Class[]{String[].class});
                try {
                    method3 = cls2.getMethod("getApplicationProtocols", new Class[0]);
                } catch (ClassNotFoundException e) {
                    e = e;
                    method8 = null;
                    method7 = method3;
                    method = method2;
                    C13907j.f22790b.log(Level.FINER, "Failed to find Android 10.0+ APIs", e);
                    method5 = null;
                    f22802m = method4;
                    f22803n = method3;
                    f22804o = method2;
                    f22800k = method;
                    f22801l = method5;
                    method6 = cls2.getMethod("setServerNames", new Class[]{List.class});
                    try {
                        constructor = Class.forName("javax.net.ssl.SNIHostName").getConstructor(new Class[]{cls5});
                    } catch (ClassNotFoundException e2) {
                        e = e2;
                        C13907j.f22790b.log(Level.FINER, "Failed to find Android 7.0+ APIs", e);
                        f22805p = method6;
                        f22806q = constructor;
                    } catch (NoSuchMethodException e3) {
                        e = e3;
                        C13907j.f22790b.log(Level.FINER, "Failed to find Android 7.0+ APIs", e);
                        f22805p = method6;
                        f22806q = constructor;
                    }
                    f22805p = method6;
                    f22806q = constructor;
                } catch (NoSuchMethodException e4) {
                    e = e4;
                    method3 = null;
                    method2 = method3;
                    method = method2;
                    C13907j.f22790b.log(Level.FINER, "Failed to find Android 10.0+ APIs", e);
                    method5 = null;
                    f22802m = method4;
                    f22803n = method3;
                    f22804o = method2;
                    f22800k = method;
                    f22801l = method5;
                    method6 = cls2.getMethod("setServerNames", new Class[]{List.class});
                    constructor = Class.forName("javax.net.ssl.SNIHostName").getConstructor(new Class[]{cls5});
                    f22805p = method6;
                    f22806q = constructor;
                }
                try {
                    method2 = cls3.getMethod("getApplicationProtocol", new Class[0]);
                    try {
                        cls = Class.forName("android.net.ssl.SSLSockets");
                        method = cls.getMethod("isSupportedSocket", new Class[]{cls3});
                    } catch (ClassNotFoundException e5) {
                        e = e5;
                        method = null;
                        C13907j.f22790b.log(Level.FINER, "Failed to find Android 10.0+ APIs", e);
                        method5 = null;
                        f22802m = method4;
                        f22803n = method3;
                        f22804o = method2;
                        f22800k = method;
                        f22801l = method5;
                        method6 = cls2.getMethod("setServerNames", new Class[]{List.class});
                        constructor = Class.forName("javax.net.ssl.SNIHostName").getConstructor(new Class[]{cls5});
                        f22805p = method6;
                        f22806q = constructor;
                    } catch (NoSuchMethodException e6) {
                        e = e6;
                        method = null;
                        C13907j.f22790b.log(Level.FINER, "Failed to find Android 10.0+ APIs", e);
                        method5 = null;
                        f22802m = method4;
                        f22803n = method3;
                        f22804o = method2;
                        f22800k = method;
                        f22801l = method5;
                        method6 = cls2.getMethod("setServerNames", new Class[]{List.class});
                        constructor = Class.forName("javax.net.ssl.SNIHostName").getConstructor(new Class[]{cls5});
                        f22805p = method6;
                        f22806q = constructor;
                    }
                    try {
                        method5 = cls.getMethod("setUseSessionTickets", new Class[]{cls3, cls4});
                    } catch (ClassNotFoundException e7) {
                        e = e7;
                        C13907j.f22790b.log(Level.FINER, "Failed to find Android 10.0+ APIs", e);
                        method5 = null;
                        f22802m = method4;
                        f22803n = method3;
                        f22804o = method2;
                        f22800k = method;
                        f22801l = method5;
                        method6 = cls2.getMethod("setServerNames", new Class[]{List.class});
                        constructor = Class.forName("javax.net.ssl.SNIHostName").getConstructor(new Class[]{cls5});
                        f22805p = method6;
                        f22806q = constructor;
                    } catch (NoSuchMethodException e8) {
                        e = e8;
                        C13907j.f22790b.log(Level.FINER, "Failed to find Android 10.0+ APIs", e);
                        method5 = null;
                        f22802m = method4;
                        f22803n = method3;
                        f22804o = method2;
                        f22800k = method;
                        f22801l = method5;
                        method6 = cls2.getMethod("setServerNames", new Class[]{List.class});
                        constructor = Class.forName("javax.net.ssl.SNIHostName").getConstructor(new Class[]{cls5});
                        f22805p = method6;
                        f22806q = constructor;
                    }
                } catch (ClassNotFoundException e9) {
                    e = e9;
                    method7 = null;
                    method = method2;
                    C13907j.f22790b.log(Level.FINER, "Failed to find Android 10.0+ APIs", e);
                    method5 = null;
                    f22802m = method4;
                    f22803n = method3;
                    f22804o = method2;
                    f22800k = method;
                    f22801l = method5;
                    method6 = cls2.getMethod("setServerNames", new Class[]{List.class});
                    constructor = Class.forName("javax.net.ssl.SNIHostName").getConstructor(new Class[]{cls5});
                    f22805p = method6;
                    f22806q = constructor;
                } catch (NoSuchMethodException e10) {
                    e = e10;
                    method2 = null;
                    method = method2;
                    C13907j.f22790b.log(Level.FINER, "Failed to find Android 10.0+ APIs", e);
                    method5 = null;
                    f22802m = method4;
                    f22803n = method3;
                    f22804o = method2;
                    f22800k = method;
                    f22801l = method5;
                    method6 = cls2.getMethod("setServerNames", new Class[]{List.class});
                    constructor = Class.forName("javax.net.ssl.SNIHostName").getConstructor(new Class[]{cls5});
                    f22805p = method6;
                    f22806q = constructor;
                }
            } catch (ClassNotFoundException e11) {
                e = e11;
                method4 = null;
                method8 = null;
                method7 = method3;
                method = method2;
                C13907j.f22790b.log(Level.FINER, "Failed to find Android 10.0+ APIs", e);
                method5 = null;
                f22802m = method4;
                f22803n = method3;
                f22804o = method2;
                f22800k = method;
                f22801l = method5;
                method6 = cls2.getMethod("setServerNames", new Class[]{List.class});
                constructor = Class.forName("javax.net.ssl.SNIHostName").getConstructor(new Class[]{cls5});
                f22805p = method6;
                f22806q = constructor;
            } catch (NoSuchMethodException e12) {
                e = e12;
                method4 = null;
                method3 = null;
                method2 = method3;
                method = method2;
                C13907j.f22790b.log(Level.FINER, "Failed to find Android 10.0+ APIs", e);
                method5 = null;
                f22802m = method4;
                f22803n = method3;
                f22804o = method2;
                f22800k = method;
                f22801l = method5;
                method6 = cls2.getMethod("setServerNames", new Class[]{List.class});
                constructor = Class.forName("javax.net.ssl.SNIHostName").getConstructor(new Class[]{cls5});
                f22805p = method6;
                f22806q = constructor;
            }
            f22802m = method4;
            f22803n = method3;
            f22804o = method2;
            f22800k = method;
            f22801l = method5;
            try {
                method6 = cls2.getMethod("setServerNames", new Class[]{List.class});
                constructor = Class.forName("javax.net.ssl.SNIHostName").getConstructor(new Class[]{cls5});
            } catch (ClassNotFoundException e13) {
                e = e13;
                method6 = null;
                C13907j.f22790b.log(Level.FINER, "Failed to find Android 7.0+ APIs", e);
                f22805p = method6;
                f22806q = constructor;
            } catch (NoSuchMethodException e14) {
                e = e14;
                method6 = null;
                C13907j.f22790b.log(Level.FINER, "Failed to find Android 7.0+ APIs", e);
                f22805p = method6;
                f22806q = constructor;
            }
            f22805p = method6;
            f22806q = constructor;
        }

        C13908a(C14093f fVar) {
            super(fVar);
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v5, resolved type: java.lang.Object[]} */
        /* access modifiers changed from: protected */
        /* JADX WARNING: Code restructure failed: missing block: B:45:0x00dc, code lost:
            r9 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:47:0x00e2, code lost:
            throw new java.lang.RuntimeException(r9);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:51:0x00ea, code lost:
            r9 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:53:0x00f0, code lost:
            throw new java.lang.RuntimeException(r9);
         */
        /* JADX WARNING: Multi-variable type inference failed */
        /* JADX WARNING: Removed duplicated region for block: B:15:0x0049 A[Catch:{ InvocationTargetException -> 0x007a, IllegalAccessException -> 0x00ea, InstantiationException -> 0x00dc, IllegalAccessException -> 0x00ea, InvocationTargetException -> 0x00e3, InstantiationException -> 0x00dc }] */
        /* JADX WARNING: Removed duplicated region for block: B:16:0x005d A[Catch:{ InvocationTargetException -> 0x007a, IllegalAccessException -> 0x00ea, InstantiationException -> 0x00dc, IllegalAccessException -> 0x00ea, InvocationTargetException -> 0x00e3, InstantiationException -> 0x00dc }] */
        /* JADX WARNING: Removed duplicated region for block: B:35:0x00ac A[RETURN] */
        /* JADX WARNING: Removed duplicated region for block: B:36:0x00ad  */
        /* JADX WARNING: Removed duplicated region for block: B:45:0x00dc A[ExcHandler: InstantiationException (r9v3 'e' java.lang.InstantiationException A[CUSTOM_DECLARE]), Splitter:B:2:0x000c] */
        /* JADX WARNING: Removed duplicated region for block: B:51:0x00ea A[ExcHandler: IllegalAccessException (r9v1 'e' java.lang.IllegalAccessException A[CUSTOM_DECLARE]), Splitter:B:2:0x000c] */
        /* renamed from: c */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo53634c(javax.net.ssl.SSLSocket r9, java.lang.String r10, java.util.List<p470zd.C14102g> r11) {
            /*
                r8 = this;
                java.lang.String[] r0 = p464yd.C13907j.m32119i(r11)
                javax.net.ssl.SSLParameters r1 = r9.getSSLParameters()
                r2 = 1
                r3 = 0
                if (r10 == 0) goto L_0x0066
                boolean r4 = p464yd.C13907j.m32118g(r10)     // Catch:{ IllegalAccessException -> 0x00ea, InvocationTargetException -> 0x00e3, InstantiationException -> 0x00dc }
                if (r4 == 0) goto L_0x0066
                java.lang.reflect.Method r4 = f22800k     // Catch:{ IllegalAccessException -> 0x00ea, InvocationTargetException -> 0x00e3, InstantiationException -> 0x00dc }
                if (r4 == 0) goto L_0x0036
                java.lang.Object[] r5 = new java.lang.Object[r2]     // Catch:{ IllegalAccessException -> 0x00ea, InvocationTargetException -> 0x00e3, InstantiationException -> 0x00dc }
                r5[r3] = r9     // Catch:{ IllegalAccessException -> 0x00ea, InvocationTargetException -> 0x00e3, InstantiationException -> 0x00dc }
                r6 = 0
                java.lang.Object r4 = r4.invoke(r6, r5)     // Catch:{ IllegalAccessException -> 0x00ea, InvocationTargetException -> 0x00e3, InstantiationException -> 0x00dc }
                java.lang.Boolean r4 = (java.lang.Boolean) r4     // Catch:{ IllegalAccessException -> 0x00ea, InvocationTargetException -> 0x00e3, InstantiationException -> 0x00dc }
                boolean r4 = r4.booleanValue()     // Catch:{ IllegalAccessException -> 0x00ea, InvocationTargetException -> 0x00e3, InstantiationException -> 0x00dc }
                if (r4 == 0) goto L_0x0036
                java.lang.reflect.Method r4 = f22801l     // Catch:{ IllegalAccessException -> 0x00ea, InvocationTargetException -> 0x00e3, InstantiationException -> 0x00dc }
                r5 = 2
                java.lang.Object[] r5 = new java.lang.Object[r5]     // Catch:{ IllegalAccessException -> 0x00ea, InvocationTargetException -> 0x00e3, InstantiationException -> 0x00dc }
                r5[r3] = r9     // Catch:{ IllegalAccessException -> 0x00ea, InvocationTargetException -> 0x00e3, InstantiationException -> 0x00dc }
                java.lang.Boolean r7 = java.lang.Boolean.TRUE     // Catch:{ IllegalAccessException -> 0x00ea, InvocationTargetException -> 0x00e3, InstantiationException -> 0x00dc }
                r5[r2] = r7     // Catch:{ IllegalAccessException -> 0x00ea, InvocationTargetException -> 0x00e3, InstantiationException -> 0x00dc }
                r4.invoke(r6, r5)     // Catch:{ IllegalAccessException -> 0x00ea, InvocationTargetException -> 0x00e3, InstantiationException -> 0x00dc }
                goto L_0x0041
            L_0x0036:
                zd.e<java.net.Socket> r4 = f22794e     // Catch:{ IllegalAccessException -> 0x00ea, InvocationTargetException -> 0x00e3, InstantiationException -> 0x00dc }
                java.lang.Object[] r5 = new java.lang.Object[r2]     // Catch:{ IllegalAccessException -> 0x00ea, InvocationTargetException -> 0x00e3, InstantiationException -> 0x00dc }
                java.lang.Boolean r6 = java.lang.Boolean.TRUE     // Catch:{ IllegalAccessException -> 0x00ea, InvocationTargetException -> 0x00e3, InstantiationException -> 0x00dc }
                r5[r3] = r6     // Catch:{ IllegalAccessException -> 0x00ea, InvocationTargetException -> 0x00e3, InstantiationException -> 0x00dc }
                r4.mo53863e(r9, r5)     // Catch:{ IllegalAccessException -> 0x00ea, InvocationTargetException -> 0x00e3, InstantiationException -> 0x00dc }
            L_0x0041:
                java.lang.reflect.Method r4 = f22805p     // Catch:{ IllegalAccessException -> 0x00ea, InvocationTargetException -> 0x00e3, InstantiationException -> 0x00dc }
                if (r4 == 0) goto L_0x005d
                java.lang.reflect.Constructor<?> r5 = f22806q     // Catch:{ IllegalAccessException -> 0x00ea, InvocationTargetException -> 0x00e3, InstantiationException -> 0x00dc }
                if (r5 == 0) goto L_0x005d
                java.lang.Object[] r6 = new java.lang.Object[r2]     // Catch:{ IllegalAccessException -> 0x00ea, InvocationTargetException -> 0x00e3, InstantiationException -> 0x00dc }
                java.lang.Object[] r7 = new java.lang.Object[r2]     // Catch:{ IllegalAccessException -> 0x00ea, InvocationTargetException -> 0x00e3, InstantiationException -> 0x00dc }
                r7[r3] = r10     // Catch:{ IllegalAccessException -> 0x00ea, InvocationTargetException -> 0x00e3, InstantiationException -> 0x00dc }
                java.lang.Object r10 = r5.newInstance(r7)     // Catch:{ IllegalAccessException -> 0x00ea, InvocationTargetException -> 0x00e3, InstantiationException -> 0x00dc }
                java.util.List r10 = java.util.Collections.singletonList(r10)     // Catch:{ IllegalAccessException -> 0x00ea, InvocationTargetException -> 0x00e3, InstantiationException -> 0x00dc }
                r6[r3] = r10     // Catch:{ IllegalAccessException -> 0x00ea, InvocationTargetException -> 0x00e3, InstantiationException -> 0x00dc }
                r4.invoke(r1, r6)     // Catch:{ IllegalAccessException -> 0x00ea, InvocationTargetException -> 0x00e3, InstantiationException -> 0x00dc }
                goto L_0x0066
            L_0x005d:
                zd.e<java.net.Socket> r4 = f22795f     // Catch:{ IllegalAccessException -> 0x00ea, InvocationTargetException -> 0x00e3, InstantiationException -> 0x00dc }
                java.lang.Object[] r5 = new java.lang.Object[r2]     // Catch:{ IllegalAccessException -> 0x00ea, InvocationTargetException -> 0x00e3, InstantiationException -> 0x00dc }
                r5[r3] = r10     // Catch:{ IllegalAccessException -> 0x00ea, InvocationTargetException -> 0x00e3, InstantiationException -> 0x00dc }
                r4.mo53863e(r9, r5)     // Catch:{ IllegalAccessException -> 0x00ea, InvocationTargetException -> 0x00e3, InstantiationException -> 0x00dc }
            L_0x0066:
                java.lang.reflect.Method r10 = f22804o     // Catch:{ IllegalAccessException -> 0x00ea, InvocationTargetException -> 0x00e3, InstantiationException -> 0x00dc }
                if (r10 == 0) goto L_0x0090
                java.lang.Object[] r4 = new java.lang.Object[r3]     // Catch:{ InvocationTargetException -> 0x007a, IllegalAccessException -> 0x00ea, InstantiationException -> 0x00dc }
                r10.invoke(r9, r4)     // Catch:{ InvocationTargetException -> 0x007a, IllegalAccessException -> 0x00ea, InstantiationException -> 0x00dc }
                java.lang.reflect.Method r10 = f22802m     // Catch:{ InvocationTargetException -> 0x007a, IllegalAccessException -> 0x00ea, InstantiationException -> 0x00dc }
                java.lang.Object[] r4 = new java.lang.Object[r2]     // Catch:{ InvocationTargetException -> 0x007a, IllegalAccessException -> 0x00ea, InstantiationException -> 0x00dc }
                r4[r3] = r0     // Catch:{ InvocationTargetException -> 0x007a, IllegalAccessException -> 0x00ea, InstantiationException -> 0x00dc }
                r10.invoke(r1, r4)     // Catch:{ InvocationTargetException -> 0x007a, IllegalAccessException -> 0x00ea, InstantiationException -> 0x00dc }
                r10 = r2
                goto L_0x0091
            L_0x007a:
                r10 = move-exception
                java.lang.Throwable r4 = r10.getTargetException()     // Catch:{ IllegalAccessException -> 0x00ea, InvocationTargetException -> 0x00e3, InstantiationException -> 0x00dc }
                boolean r4 = r4 instanceof java.lang.UnsupportedOperationException     // Catch:{ IllegalAccessException -> 0x00ea, InvocationTargetException -> 0x00e3, InstantiationException -> 0x00dc }
                if (r4 == 0) goto L_0x008f
                java.util.logging.Logger r10 = p464yd.C13907j.f22790b     // Catch:{ IllegalAccessException -> 0x00ea, InvocationTargetException -> 0x00e3, InstantiationException -> 0x00dc }
                java.util.logging.Level r4 = java.util.logging.Level.FINER     // Catch:{ IllegalAccessException -> 0x00ea, InvocationTargetException -> 0x00e3, InstantiationException -> 0x00dc }
                java.lang.String r5 = "setApplicationProtocol unsupported, will try old methods"
                r10.log(r4, r5)     // Catch:{ IllegalAccessException -> 0x00ea, InvocationTargetException -> 0x00e3, InstantiationException -> 0x00dc }
                goto L_0x0090
            L_0x008f:
                throw r10     // Catch:{ IllegalAccessException -> 0x00ea, InvocationTargetException -> 0x00e3, InstantiationException -> 0x00dc }
            L_0x0090:
                r10 = r3
            L_0x0091:
                r9.setSSLParameters(r1)     // Catch:{ IllegalAccessException -> 0x00ea, InvocationTargetException -> 0x00e3, InstantiationException -> 0x00dc }
                if (r10 == 0) goto L_0x00ad
                java.lang.reflect.Method r10 = f22803n     // Catch:{ IllegalAccessException -> 0x00ea, InvocationTargetException -> 0x00e3, InstantiationException -> 0x00dc }
                if (r10 == 0) goto L_0x00ad
                javax.net.ssl.SSLParameters r1 = r9.getSSLParameters()     // Catch:{ IllegalAccessException -> 0x00ea, InvocationTargetException -> 0x00e3, InstantiationException -> 0x00dc }
                java.lang.Object[] r4 = new java.lang.Object[r3]     // Catch:{ IllegalAccessException -> 0x00ea, InvocationTargetException -> 0x00e3, InstantiationException -> 0x00dc }
                java.lang.Object r10 = r10.invoke(r1, r4)     // Catch:{ IllegalAccessException -> 0x00ea, InvocationTargetException -> 0x00e3, InstantiationException -> 0x00dc }
                java.lang.String[] r10 = (java.lang.String[]) r10     // Catch:{ IllegalAccessException -> 0x00ea, InvocationTargetException -> 0x00e3, InstantiationException -> 0x00dc }
                boolean r10 = java.util.Arrays.equals(r0, r10)     // Catch:{ IllegalAccessException -> 0x00ea, InvocationTargetException -> 0x00e3, InstantiationException -> 0x00dc }
                if (r10 == 0) goto L_0x00ad
                return
            L_0x00ad:
                java.lang.Object[] r10 = new java.lang.Object[r2]
                byte[] r11 = p470zd.C14093f.m32713b(r11)
                r10[r3] = r11
                zd.f r11 = r8.f22793a
                zd.f$h r11 = r11.mo53870i()
                zd.f$h r0 = p470zd.C14093f.C14101h.ALPN_AND_NPN
                if (r11 != r0) goto L_0x00c4
                zd.e<java.net.Socket> r11 = f22797h
                r11.mo53864f(r9, r10)
            L_0x00c4:
                zd.f r11 = r8.f22793a
                zd.f$h r11 = r11.mo53870i()
                zd.f$h r0 = p470zd.C14093f.C14101h.NONE
                if (r11 == r0) goto L_0x00d4
                zd.e<java.net.Socket> r11 = f22799j
                r11.mo53864f(r9, r10)
                return
            L_0x00d4:
                java.lang.RuntimeException r9 = new java.lang.RuntimeException
                java.lang.String r10 = "We can not do TLS handshake on this Android version, please install the Google Play Services Dynamic Security Provider to use TLS"
                r9.<init>(r10)
                throw r9
            L_0x00dc:
                r9 = move-exception
                java.lang.RuntimeException r10 = new java.lang.RuntimeException
                r10.<init>(r9)
                throw r10
            L_0x00e3:
                r9 = move-exception
                java.lang.RuntimeException r10 = new java.lang.RuntimeException
                r10.<init>(r9)
                throw r10
            L_0x00ea:
                r9 = move-exception
                java.lang.RuntimeException r10 = new java.lang.RuntimeException
                r10.<init>(r9)
                throw r10
            */
            throw new UnsupportedOperationException("Method not decompiled: p464yd.C13907j.C13908a.mo53634c(javax.net.ssl.SSLSocket, java.lang.String, java.util.List):void");
        }

        /* renamed from: f */
        public String mo53635f(SSLSocket sSLSocket) {
            Method method = f22804o;
            if (method != null) {
                try {
                    return (String) method.invoke(sSLSocket, new Object[0]);
                } catch (IllegalAccessException e) {
                    throw new RuntimeException(e);
                } catch (InvocationTargetException e2) {
                    if (e2.getTargetException() instanceof UnsupportedOperationException) {
                        C13907j.f22790b.log(Level.FINER, "Socket unsupported for getApplicationProtocol, will try old methods");
                    } else {
                        throw new RuntimeException(e2);
                    }
                }
            }
            if (this.f22793a.mo53870i() == C14093f.C14101h.ALPN_AND_NPN) {
                try {
                    byte[] bArr = (byte[]) f22796g.mo53864f(sSLSocket, new Object[0]);
                    if (bArr != null) {
                        return new String(bArr, C14104i.f23173c);
                    }
                } catch (Exception e3) {
                    C13907j.f22790b.log(Level.FINE, "Failed calling getAlpnSelectedProtocol()", e3);
                }
            }
            if (this.f22793a.mo53870i() == C14093f.C14101h.NONE) {
                return null;
            }
            try {
                byte[] bArr2 = (byte[]) f22798i.mo53864f(sSLSocket, new Object[0]);
                if (bArr2 != null) {
                    return new String(bArr2, C14104i.f23173c);
                }
                return null;
            } catch (Exception e4) {
                C13907j.f22790b.log(Level.FINE, "Failed calling getNpnSelectedProtocol()", e4);
                return null;
            }
        }

        /* renamed from: h */
        public String mo53636h(SSLSocket sSLSocket, String str, List<C14102g> list) {
            String f = mo53635f(sSLSocket);
            if (f == null) {
                return C13907j.super.mo53636h(sSLSocket, str, list);
            }
            return f;
        }
    }

    static {
        Class<C13907j> cls = C13907j.class;
        f22790b = Logger.getLogger(cls.getName());
        f22792d = m32116d(cls.getClassLoader());
    }

    C13907j(C14093f fVar) {
        this.f22793a = (C14093f) C8012n.m15756o(fVar, "platform");
    }

    /* renamed from: d */
    static C13907j m32116d(ClassLoader classLoader) {
        boolean z;
        try {
            classLoader.loadClass("com.android.org.conscrypt.OpenSSLSocketImpl");
        } catch (ClassNotFoundException e) {
            f22790b.log(Level.FINE, "Unable to find Conscrypt. Skipping", e);
            try {
                classLoader.loadClass("org.apache.harmony.xnet.provider.jsse.OpenSSLSocketImpl");
            } catch (ClassNotFoundException e2) {
                f22790b.log(Level.FINE, "Unable to find any OpenSSLSocketImpl. Skipping", e2);
                z = false;
            }
        }
        z = true;
        if (z) {
            return new C13908a(f22791c);
        }
        return new C13907j(f22791c);
    }

    /* renamed from: e */
    public static C13907j m32117e() {
        return f22792d;
    }

    /* renamed from: g */
    static boolean m32118g(String str) {
        if (str.contains("_")) {
            return false;
        }
        try {
            C12404r0.m27324c(str);
            return true;
        } catch (IllegalArgumentException unused) {
            return false;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: i */
    public static String[] m32119i(List<C14102g> list) {
        ArrayList arrayList = new ArrayList();
        for (C14102g gVar : list) {
            arrayList.add(gVar.toString());
        }
        return (String[]) arrayList.toArray(new String[0]);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo53634c(SSLSocket sSLSocket, String str, List<C14102g> list) {
        this.f22793a.mo53867c(sSLSocket, str, list);
    }

    /* renamed from: f */
    public String mo53635f(SSLSocket sSLSocket) {
        return this.f22793a.mo53869h(sSLSocket);
    }

    /* renamed from: h */
    public String mo53636h(SSLSocket sSLSocket, String str, List<C14102g> list) {
        if (list != null) {
            mo53634c(sSLSocket, str, list);
        }
        try {
            sSLSocket.startHandshake();
            String f = mo53635f(sSLSocket);
            if (f != null) {
                return f;
            }
            throw new RuntimeException("TLS ALPN negotiation failed with protocols: " + list);
        } finally {
            this.f22793a.mo53866a(sSLSocket);
        }
    }
}
