package p458xd;

import com.rmn.apiclient.impl.jsonapi.serializer.JSONAPIResourceIdSerializer;
import java.io.InputStream;
import java.util.concurrent.atomic.AtomicReferenceArray;
import p111h6.C8003j;
import p111h6.C8012n;

/* renamed from: xd.d0 */
/* compiled from: MethodDescriptor */
public final class C13783d0<ReqT, RespT> {

    /* renamed from: a */
    private final C13787d f22213a;

    /* renamed from: b */
    private final String f22214b;

    /* renamed from: c */
    private final String f22215c;

    /* renamed from: d */
    private final C13786c<ReqT> f22216d;

    /* renamed from: e */
    private final C13786c<RespT> f22217e;

    /* renamed from: f */
    private final Object f22218f;

    /* renamed from: g */
    private final boolean f22219g;

    /* renamed from: h */
    private final boolean f22220h;

    /* renamed from: i */
    private final boolean f22221i;

    /* renamed from: j */
    private final AtomicReferenceArray<Object> f22222j;

    /* renamed from: xd.d0$b */
    /* compiled from: MethodDescriptor */
    public static final class C13785b<ReqT, RespT> {

        /* renamed from: a */
        private C13786c<ReqT> f22223a;

        /* renamed from: b */
        private C13786c<RespT> f22224b;

        /* renamed from: c */
        private C13787d f22225c;

        /* renamed from: d */
        private String f22226d;

        /* renamed from: e */
        private boolean f22227e;

        /* renamed from: f */
        private boolean f22228f;

        /* renamed from: g */
        private Object f22229g;

        /* renamed from: h */
        private boolean f22230h;

        private C13785b() {
        }

        /* renamed from: a */
        public C13783d0<ReqT, RespT> mo53444a() {
            return new C13783d0(this.f22225c, this.f22226d, this.f22223a, this.f22224b, this.f22229g, this.f22227e, this.f22228f, this.f22230h);
        }

        /* renamed from: b */
        public C13785b<ReqT, RespT> mo53445b(String str) {
            this.f22226d = str;
            return this;
        }

        /* renamed from: c */
        public C13785b<ReqT, RespT> mo53446c(C13786c<ReqT> cVar) {
            this.f22223a = cVar;
            return this;
        }

        /* renamed from: d */
        public C13785b<ReqT, RespT> mo53447d(C13786c<RespT> cVar) {
            this.f22224b = cVar;
            return this;
        }

        /* renamed from: e */
        public C13785b<ReqT, RespT> mo53448e(boolean z) {
            this.f22230h = z;
            return this;
        }

        /* renamed from: f */
        public C13785b<ReqT, RespT> mo53449f(C13787d dVar) {
            this.f22225c = dVar;
            return this;
        }
    }

    /* renamed from: xd.d0$c */
    /* compiled from: MethodDescriptor */
    public interface C13786c<T> {
        /* renamed from: a */
        T mo46004a(InputStream inputStream);

        /* renamed from: b */
        InputStream mo46005b(T t);
    }

    /* renamed from: xd.d0$d */
    /* compiled from: MethodDescriptor */
    public enum C13787d {
        UNARY,
        CLIENT_STREAMING,
        SERVER_STREAMING,
        BIDI_STREAMING,
        UNKNOWN;

        /* renamed from: a */
        public final boolean mo53450a() {
            if (this == UNARY || this == SERVER_STREAMING) {
                return true;
            }
            return false;
        }
    }

    /* renamed from: a */
    public static String m31648a(String str) {
        int lastIndexOf = ((String) C8012n.m15756o(str, "fullMethodName")).lastIndexOf(47);
        if (lastIndexOf == -1) {
            return null;
        }
        return str.substring(0, lastIndexOf);
    }

    /* renamed from: b */
    public static String m31649b(String str, String str2) {
        return ((String) C8012n.m15756o(str, "fullServiceName")) + "/" + ((String) C8012n.m15756o(str2, "methodName"));
    }

    /* renamed from: g */
    public static <ReqT, RespT> C13785b<ReqT, RespT> m31650g() {
        return m31651h((C13786c) null, (C13786c) null);
    }

    /* renamed from: h */
    public static <ReqT, RespT> C13785b<ReqT, RespT> m31651h(C13786c<ReqT> cVar, C13786c<RespT> cVar2) {
        return new C13785b().mo53446c(cVar).mo53447d(cVar2);
    }

    /* renamed from: c */
    public String mo53437c() {
        return this.f22214b;
    }

    /* renamed from: d */
    public String mo53438d() {
        return this.f22215c;
    }

    /* renamed from: e */
    public C13787d mo53439e() {
        return this.f22213a;
    }

    /* renamed from: f */
    public boolean mo53440f() {
        return this.f22220h;
    }

    /* renamed from: i */
    public RespT mo53441i(InputStream inputStream) {
        return this.f22217e.mo46004a(inputStream);
    }

    /* renamed from: j */
    public InputStream mo53442j(ReqT reqt) {
        return this.f22216d.mo46005b(reqt);
    }

    public String toString() {
        return C8003j.m15723c(this).mo41840d("fullMethodName", this.f22214b).mo41840d(JSONAPIResourceIdSerializer.FIELD_TYPE, this.f22213a).mo41841e("idempotent", this.f22219g).mo41841e("safe", this.f22220h).mo41841e("sampledToLocalTracing", this.f22221i).mo41840d("requestMarshaller", this.f22216d).mo41840d("responseMarshaller", this.f22217e).mo41840d("schemaDescriptor", this.f22218f).mo41843k().toString();
    }

    private C13783d0(C13787d dVar, String str, C13786c<ReqT> cVar, C13786c<RespT> cVar2, Object obj, boolean z, boolean z2, boolean z3) {
        this.f22222j = new AtomicReferenceArray<>(2);
        this.f22213a = (C13787d) C8012n.m15756o(dVar, JSONAPIResourceIdSerializer.FIELD_TYPE);
        this.f22214b = (String) C8012n.m15756o(str, "fullMethodName");
        this.f22215c = m31648a(str);
        this.f22216d = (C13786c) C8012n.m15756o(cVar, "requestMarshaller");
        this.f22217e = (C13786c) C8012n.m15756o(cVar2, "responseMarshaller");
        this.f22218f = obj;
        this.f22219g = z;
        this.f22220h = z2;
        this.f22221i = z3;
    }
}
