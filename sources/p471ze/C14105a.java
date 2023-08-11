package p471ze;

import p384le.C12856g;

/* renamed from: ze.a */
/* compiled from: AppendOnlyLinkedArrayList */
public class C14105a<T> {

    /* renamed from: a */
    final int f23174a;

    /* renamed from: b */
    final Object[] f23175b;

    /* renamed from: c */
    Object[] f23176c;

    /* renamed from: d */
    int f23177d;

    /* renamed from: ze.a$a */
    /* compiled from: AppendOnlyLinkedArrayList */
    public interface C14106a<T> extends C12856g<T> {
        boolean test(T t);
    }

    public C14105a(int i) {
        this.f23174a = i;
        Object[] objArr = new Object[(i + 1)];
        this.f23175b = objArr;
        this.f23176c = objArr;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v0, resolved type: java.lang.Object[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo53879a(T r4) {
        /*
            r3 = this;
            int r0 = r3.f23174a
            int r1 = r3.f23177d
            if (r1 != r0) goto L_0x0011
            int r1 = r0 + 1
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.Object[] r2 = r3.f23176c
            r2[r0] = r1
            r3.f23176c = r1
            r1 = 0
        L_0x0011:
            java.lang.Object[] r0 = r3.f23176c
            r0[r1] = r4
            int r1 = r1 + 1
            r3.f23177d = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p471ze.C14105a.mo53879a(java.lang.Object):void");
    }

    /* renamed from: b */
    public void mo53880b(C14106a<? super T> aVar) {
        int i = this.f23174a;
        for (Object[] objArr = this.f23175b; objArr != null; objArr = objArr[i]) {
            int i2 = 0;
            while (i2 < i) {
                Object[] objArr2 = objArr[i2];
                if (objArr2 == null) {
                    continue;
                    break;
                } else if (!aVar.test(objArr2)) {
                    i2++;
                } else {
                    return;
                }
            }
        }
    }
}
