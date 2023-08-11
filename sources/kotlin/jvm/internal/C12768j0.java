package kotlin.jvm.internal;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

/* renamed from: kotlin.jvm.internal.j0 */
/* compiled from: SpreadBuilder */
public class C12768j0 {

    /* renamed from: a */
    private final ArrayList<Object> f20422a;

    public C12768j0(int i) {
        this.f20422a = new ArrayList<>(i);
    }

    /* renamed from: a */
    public void mo50668a(Object obj) {
        this.f20422a.add(obj);
    }

    /* renamed from: b */
    public void mo50669b(Object obj) {
        if (obj != null) {
            if (obj instanceof Object[]) {
                Object[] objArr = (Object[]) obj;
                if (objArr.length > 0) {
                    ArrayList<Object> arrayList = this.f20422a;
                    arrayList.ensureCapacity(arrayList.size() + objArr.length);
                    Collections.addAll(this.f20422a, objArr);
                }
            } else if (obj instanceof Collection) {
                this.f20422a.addAll((Collection) obj);
            } else if (obj instanceof Iterable) {
                for (Object add : (Iterable) obj) {
                    this.f20422a.add(add);
                }
            } else if (obj instanceof Iterator) {
                Iterator it = (Iterator) obj;
                while (it.hasNext()) {
                    this.f20422a.add(it.next());
                }
            } else {
                throw new UnsupportedOperationException("Don't know how to spread " + obj.getClass());
            }
        }
    }

    /* renamed from: c */
    public int mo50670c() {
        return this.f20422a.size();
    }

    /* renamed from: d */
    public Object[] mo50671d(Object[] objArr) {
        return this.f20422a.toArray(objArr);
    }
}
