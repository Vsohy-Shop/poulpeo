package p290y8;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C12775o;

/* renamed from: y8.a */
/* compiled from: AggregateTranslator.kt */
public final class C10712a extends C10716e {

    /* renamed from: a */
    private final List<C10716e> f16326a;

    public C10712a() {
        this.f16326a = new ArrayList();
    }

    /* renamed from: a */
    public int mo45638a(String str, int i, StringBuilder sb) {
        C12775o.m28639i(str, "input");
        C12775o.m28639i(sb, "stringBuilder");
        for (C10716e a : this.f16326a) {
            int a2 = a.mo45638a(str, i, sb);
            if (a2 != 0) {
                return a2;
            }
        }
        return 0;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C10712a(C10716e... eVarArr) {
        this();
        C12775o.m28639i(eVarArr, "translators");
        boolean unused = C12669b0.m28180D(this.f16326a, eVarArr);
    }
}
