package p364io.grpc.internal;

import java.io.Closeable;
import java.net.SocketAddress;
import java.util.concurrent.ScheduledExecutorService;
import p111h6.C8007k;
import p111h6.C8012n;
import p364io.grpc.C12155a;
import p458xd.C13781d;
import p458xd.C13829u;

/* renamed from: io.grpc.internal.t */
/* compiled from: ClientTransportFactory */
public interface C12429t extends Closeable {

    /* renamed from: io.grpc.internal.t$a */
    /* compiled from: ClientTransportFactory */
    public static final class C12430a {

        /* renamed from: a */
        private String f19828a = "unknown-authority";

        /* renamed from: b */
        private C12155a f19829b = C12155a.f19047b;

        /* renamed from: c */
        private String f19830c;

        /* renamed from: d */
        private C13829u f19831d;

        /* renamed from: a */
        public String mo50072a() {
            return this.f19828a;
        }

        /* renamed from: b */
        public C12155a mo50073b() {
            return this.f19829b;
        }

        /* renamed from: c */
        public C13829u mo50074c() {
            return this.f19831d;
        }

        /* renamed from: d */
        public String mo50075d() {
            return this.f19830c;
        }

        /* renamed from: e */
        public C12430a mo50076e(String str) {
            this.f19828a = (String) C8012n.m15756o(str, "authority");
            return this;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof C12430a)) {
                return false;
            }
            C12430a aVar = (C12430a) obj;
            if (!this.f19828a.equals(aVar.f19828a) || !this.f19829b.equals(aVar.f19829b) || !C8007k.m15735a(this.f19830c, aVar.f19830c) || !C8007k.m15735a(this.f19831d, aVar.f19831d)) {
                return false;
            }
            return true;
        }

        /* renamed from: f */
        public C12430a mo50078f(C12155a aVar) {
            C8012n.m15756o(aVar, "eagAttributes");
            this.f19829b = aVar;
            return this;
        }

        /* renamed from: g */
        public C12430a mo50079g(C13829u uVar) {
            this.f19831d = uVar;
            return this;
        }

        /* renamed from: h */
        public C12430a mo50080h(String str) {
            this.f19830c = str;
            return this;
        }

        public int hashCode() {
            return C8007k.m15736b(this.f19828a, this.f19829b, this.f19830c, this.f19831d);
        }
    }

    void close();

    /* renamed from: i0 */
    ScheduledExecutorService mo49981i0();

    /* renamed from: r */
    C12447v mo49982r(SocketAddress socketAddress, C12430a aVar, C13781d dVar);
}
