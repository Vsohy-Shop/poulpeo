package p364io.grpc.internal;

import java.util.ArrayList;

/* renamed from: io.grpc.internal.x0 */
/* compiled from: InsightBuilder */
public final class C12460x0 {

    /* renamed from: a */
    private final ArrayList<String> f19882a = new ArrayList<>();

    /* renamed from: a */
    public C12460x0 mo50127a(Object obj) {
        this.f19882a.add(String.valueOf(obj));
        return this;
    }

    /* renamed from: b */
    public C12460x0 mo50128b(String str, Object obj) {
        ArrayList<String> arrayList = this.f19882a;
        arrayList.add(str + "=" + obj);
        return this;
    }

    public String toString() {
        return this.f19882a.toString();
    }
}
