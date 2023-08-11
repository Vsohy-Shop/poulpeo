package p458xd;

import androidx.autofill.HintConstants;
import java.net.InetSocketAddress;
import java.net.SocketAddress;
import p111h6.C8003j;
import p111h6.C8007k;
import p111h6.C8012n;

/* renamed from: xd.u */
/* compiled from: HttpConnectProxiedSocketAddress */
public final class C13829u extends C13792f0 {
    private static final long serialVersionUID = 0;

    /* renamed from: b */
    private final SocketAddress f22297b;

    /* renamed from: c */
    private final InetSocketAddress f22298c;

    /* renamed from: d */
    private final String f22299d;

    /* renamed from: e */
    private final String f22300e;

    /* renamed from: xd.u$b */
    /* compiled from: HttpConnectProxiedSocketAddress */
    public static final class C13831b {

        /* renamed from: a */
        private SocketAddress f22301a;

        /* renamed from: b */
        private InetSocketAddress f22302b;

        /* renamed from: c */
        private String f22303c;

        /* renamed from: d */
        private String f22304d;

        /* renamed from: a */
        public C13829u mo53503a() {
            return new C13829u(this.f22301a, this.f22302b, this.f22303c, this.f22304d);
        }

        /* renamed from: b */
        public C13831b mo53504b(String str) {
            this.f22304d = str;
            return this;
        }

        /* renamed from: c */
        public C13831b mo53505c(SocketAddress socketAddress) {
            this.f22301a = (SocketAddress) C8012n.m15756o(socketAddress, "proxyAddress");
            return this;
        }

        /* renamed from: d */
        public C13831b mo53506d(InetSocketAddress inetSocketAddress) {
            this.f22302b = (InetSocketAddress) C8012n.m15756o(inetSocketAddress, "targetAddress");
            return this;
        }

        /* renamed from: e */
        public C13831b mo53507e(String str) {
            this.f22303c = str;
            return this;
        }

        private C13831b() {
        }
    }

    /* renamed from: e */
    public static C13831b m31770e() {
        return new C13831b();
    }

    /* renamed from: a */
    public String mo53496a() {
        return this.f22300e;
    }

    /* renamed from: b */
    public SocketAddress mo53497b() {
        return this.f22297b;
    }

    /* renamed from: c */
    public InetSocketAddress mo53498c() {
        return this.f22298c;
    }

    /* renamed from: d */
    public String mo53499d() {
        return this.f22299d;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C13829u)) {
            return false;
        }
        C13829u uVar = (C13829u) obj;
        if (!C8007k.m15735a(this.f22297b, uVar.f22297b) || !C8007k.m15735a(this.f22298c, uVar.f22298c) || !C8007k.m15735a(this.f22299d, uVar.f22299d) || !C8007k.m15735a(this.f22300e, uVar.f22300e)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C8007k.m15736b(this.f22297b, this.f22298c, this.f22299d, this.f22300e);
    }

    public String toString() {
        boolean z;
        C8003j.C8005b d = C8003j.m15723c(this).mo41840d("proxyAddr", this.f22297b).mo41840d("targetAddr", this.f22298c).mo41840d(HintConstants.AUTOFILL_HINT_USERNAME, this.f22299d);
        if (this.f22300e != null) {
            z = true;
        } else {
            z = false;
        }
        return d.mo41841e("hasPassword", z).toString();
    }

    private C13829u(SocketAddress socketAddress, InetSocketAddress inetSocketAddress, String str, String str2) {
        C8012n.m15756o(socketAddress, "proxyAddress");
        C8012n.m15756o(inetSocketAddress, "targetAddress");
        if (socketAddress instanceof InetSocketAddress) {
            C8012n.m15764w(!((InetSocketAddress) socketAddress).isUnresolved(), "The proxy address %s is not resolved", socketAddress);
        }
        this.f22297b = socketAddress;
        this.f22298c = inetSocketAddress;
        this.f22299d = str;
        this.f22300e = str2;
    }
}
