package p364io.grpc;

import java.net.SocketAddress;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p111h6.C8012n;
import p364io.grpc.C12155a;

/* renamed from: io.grpc.e */
/* compiled from: EquivalentAddressGroup */
public final class C12167e {

    /* renamed from: d */
    public static final C12155a.C12158c<String> f19073d = C12155a.C12158c.m26520a("io.grpc.EquivalentAddressGroup.authorityOverride");

    /* renamed from: a */
    private final List<SocketAddress> f19074a;

    /* renamed from: b */
    private final C12155a f19075b;

    /* renamed from: c */
    private final int f19076c;

    public C12167e(List<SocketAddress> list) {
        this(list, C12155a.f19047b);
    }

    /* renamed from: a */
    public List<SocketAddress> mo49649a() {
        return this.f19074a;
    }

    /* renamed from: b */
    public C12155a mo49650b() {
        return this.f19075b;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C12167e)) {
            return false;
        }
        C12167e eVar = (C12167e) obj;
        if (this.f19074a.size() != eVar.f19074a.size()) {
            return false;
        }
        for (int i = 0; i < this.f19074a.size(); i++) {
            if (!this.f19074a.get(i).equals(eVar.f19074a.get(i))) {
                return false;
            }
        }
        if (!this.f19075b.equals(eVar.f19075b)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return this.f19076c;
    }

    public String toString() {
        return "[" + this.f19074a + "/" + this.f19075b + "]";
    }

    public C12167e(List<SocketAddress> list, C12155a aVar) {
        C8012n.m15746e(!list.isEmpty(), "addrs is empty");
        List<SocketAddress> unmodifiableList = Collections.unmodifiableList(new ArrayList(list));
        this.f19074a = unmodifiableList;
        this.f19075b = (C12155a) C8012n.m15756o(aVar, "attrs");
        this.f19076c = unmodifiableList.hashCode();
    }

    public C12167e(SocketAddress socketAddress) {
        this(socketAddress, C12155a.f19047b);
    }

    public C12167e(SocketAddress socketAddress, C12155a aVar) {
        this((List<SocketAddress>) Collections.singletonList(socketAddress), aVar);
    }
}
