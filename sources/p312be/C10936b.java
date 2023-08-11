package p312be;

import com.google.protobuf.C7111i;
import com.google.protobuf.C7139o;
import com.google.protobuf.C7149p0;
import com.google.protobuf.C7193x0;
import com.google.protobuf.InvalidProtocolBufferException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.ref.Reference;
import p111h6.C8012n;
import p458xd.C13783d0;

/* renamed from: be.b */
/* compiled from: ProtoLiteUtils */
public final class C10936b {

    /* renamed from: a */
    static volatile C7139o f16873a = C7139o.m13502b();

    /* renamed from: be.b$a */
    /* compiled from: ProtoLiteUtils */
    private static final class C10937a<T extends C7149p0> implements C13783d0.C13786c {

        /* renamed from: c */
        private static final ThreadLocal<Reference<byte[]>> f16874c = new ThreadLocal<>();

        /* renamed from: a */
        private final C7193x0<T> f16875a;

        /* renamed from: b */
        private final T f16876b;

        C10937a(T t) {
            this.f16876b = t;
            this.f16875a = t.mo40629i();
        }

        /* renamed from: d */
        private T m23560d(C7111i iVar) {
            T t = (C7149p0) this.f16875a.mo40166c(iVar, C10936b.f16873a);
            try {
                iVar.mo40404a(0);
                return t;
            } catch (InvalidProtocolBufferException e) {
                e.mo40147k(t);
                throw e;
            }
        }

        /* JADX WARNING: Can't wrap try/catch for region: R(9:0|(4:4|5|6|7)|8|9|(2:11|(1:(2:33|34))(5:15|(1:21)|22|(1:(1:48)(2:24|(2:49|26)(1:27)))|(6:29|(1:37)|38|39|40|41)(2:30|31)))|35|(0)|38|(3:39|40|41)) */
        /* JADX WARNING: Code restructure failed: missing block: B:45:0x00a5, code lost:
            r6 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:47:0x00ab, code lost:
            throw new java.lang.RuntimeException(r6);
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:8:0x0017 */
        /* JADX WARNING: Removed duplicated region for block: B:11:0x001b A[Catch:{ IOException -> 0x00a5 }] */
        /* JADX WARNING: Removed duplicated region for block: B:37:0x0084  */
        /* renamed from: c */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public T mo46004a(java.io.InputStream r6) {
            /*
                r5 = this;
                boolean r0 = r6 instanceof p312be.C10935a
                if (r0 == 0) goto L_0x0017
                r0 = r6
                be.a r0 = (p312be.C10935a) r0
                com.google.protobuf.x0 r0 = r0.mo46001c()
                com.google.protobuf.x0<T> r1 = r5.f16875a
                if (r0 != r1) goto L_0x0017
                r0 = r6
                be.a r0 = (p312be.C10935a) r0     // Catch:{ IllegalStateException -> 0x0017 }
                com.google.protobuf.p0 r6 = r0.mo46000b()     // Catch:{ IllegalStateException -> 0x0017 }
                return r6
            L_0x0017:
                boolean r0 = r6 instanceof p458xd.C13778b0     // Catch:{ IOException -> 0x00a5 }
                if (r0 == 0) goto L_0x0081
                int r0 = r6.available()     // Catch:{ IOException -> 0x00a5 }
                if (r0 <= 0) goto L_0x007c
                r1 = 4194304(0x400000, float:5.877472E-39)
                if (r0 > r1) goto L_0x007c
                java.lang.ThreadLocal<java.lang.ref.Reference<byte[]>> r1 = f16874c     // Catch:{ IOException -> 0x00a5 }
                java.lang.Object r2 = r1.get()     // Catch:{ IOException -> 0x00a5 }
                java.lang.ref.Reference r2 = (java.lang.ref.Reference) r2     // Catch:{ IOException -> 0x00a5 }
                if (r2 == 0) goto L_0x003a
                java.lang.Object r2 = r2.get()     // Catch:{ IOException -> 0x00a5 }
                byte[] r2 = (byte[]) r2     // Catch:{ IOException -> 0x00a5 }
                if (r2 == 0) goto L_0x003a
                int r3 = r2.length     // Catch:{ IOException -> 0x00a5 }
                if (r3 >= r0) goto L_0x0044
            L_0x003a:
                byte[] r2 = new byte[r0]     // Catch:{ IOException -> 0x00a5 }
                java.lang.ref.WeakReference r3 = new java.lang.ref.WeakReference     // Catch:{ IOException -> 0x00a5 }
                r3.<init>(r2)     // Catch:{ IOException -> 0x00a5 }
                r1.set(r3)     // Catch:{ IOException -> 0x00a5 }
            L_0x0044:
                r1 = r0
            L_0x0045:
                if (r1 <= 0) goto L_0x0053
                int r3 = r0 - r1
                int r3 = r6.read(r2, r3, r1)     // Catch:{ IOException -> 0x00a5 }
                r4 = -1
                if (r3 != r4) goto L_0x0051
                goto L_0x0053
            L_0x0051:
                int r1 = r1 - r3
                goto L_0x0045
            L_0x0053:
                if (r1 != 0) goto L_0x005b
                r1 = 0
                com.google.protobuf.i r0 = com.google.protobuf.C7111i.m13146i(r2, r1, r0)     // Catch:{ IOException -> 0x00a5 }
                goto L_0x0082
            L_0x005b:
                int r6 = r0 - r1
                java.lang.RuntimeException r1 = new java.lang.RuntimeException     // Catch:{ IOException -> 0x00a5 }
                java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x00a5 }
                r2.<init>()     // Catch:{ IOException -> 0x00a5 }
                java.lang.String r3 = "size inaccurate: "
                r2.append(r3)     // Catch:{ IOException -> 0x00a5 }
                r2.append(r0)     // Catch:{ IOException -> 0x00a5 }
                java.lang.String r0 = " != "
                r2.append(r0)     // Catch:{ IOException -> 0x00a5 }
                r2.append(r6)     // Catch:{ IOException -> 0x00a5 }
                java.lang.String r6 = r2.toString()     // Catch:{ IOException -> 0x00a5 }
                r1.<init>(r6)     // Catch:{ IOException -> 0x00a5 }
                throw r1     // Catch:{ IOException -> 0x00a5 }
            L_0x007c:
                if (r0 != 0) goto L_0x0081
                T r6 = r5.f16876b     // Catch:{ IOException -> 0x00a5 }
                return r6
            L_0x0081:
                r0 = 0
            L_0x0082:
                if (r0 != 0) goto L_0x0088
                com.google.protobuf.i r0 = com.google.protobuf.C7111i.m13143f(r6)
            L_0x0088:
                r6 = 2147483647(0x7fffffff, float:NaN)
                r0.mo40402E(r6)
                com.google.protobuf.p0 r6 = r5.m23560d(r0)     // Catch:{ InvalidProtocolBufferException -> 0x0093 }
                return r6
            L_0x0093:
                r6 = move-exception
                io.grpc.t r0 = p364io.grpc.C12594t.f20197t
                java.lang.String r1 = "Invalid protobuf byte sequence"
                io.grpc.t r0 = r0.mo50310r(r1)
                io.grpc.t r6 = r0.mo50309q(r6)
                io.grpc.StatusRuntimeException r6 = r6.mo50300d()
                throw r6
            L_0x00a5:
                r6 = move-exception
                java.lang.RuntimeException r0 = new java.lang.RuntimeException
                r0.<init>(r6)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: p312be.C10936b.C10937a.mo46004a(java.io.InputStream):com.google.protobuf.p0");
        }

        /* renamed from: e */
        public InputStream mo46005b(T t) {
            return new C10935a(t, this.f16875a);
        }
    }

    /* renamed from: a */
    static long m23558a(InputStream inputStream, OutputStream outputStream) {
        C8012n.m15756o(inputStream, "inputStream cannot be null!");
        C8012n.m15756o(outputStream, "outputStream cannot be null!");
        byte[] bArr = new byte[8192];
        long j = 0;
        while (true) {
            int read = inputStream.read(bArr);
            if (read == -1) {
                return j;
            }
            outputStream.write(bArr, 0, read);
            j += (long) read;
        }
    }

    /* renamed from: b */
    public static <T extends C7149p0> C13783d0.C13786c<T> m23559b(T t) {
        return new C10937a(t);
    }
}
