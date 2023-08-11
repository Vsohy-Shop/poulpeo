package p367jc;

import com.rmn.apiclient.impl.jsonapi.serializer.JSONAPIResourceIdSerializer;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: jc.a */
/* compiled from: HtmlTag.kt */
public final class C12612a {

    /* renamed from: a */
    private final C12614b f20243a;

    /* renamed from: b */
    private String f20244b;

    /* renamed from: c */
    private final List<C12612a> f20245c;

    /* renamed from: d */
    private final List<C12613a> f20246d;

    /* renamed from: jc.a$a */
    /* compiled from: HtmlTag.kt */
    public static final class C12613a {

        /* renamed from: a */
        private final String f20247a;

        /* renamed from: b */
        private final String f20248b;

        public C12613a(String str, String str2) {
            C12775o.m28639i(str, "key");
            C12775o.m28639i(str2, "value");
            this.f20247a = str;
            this.f20248b = str2;
        }

        /* renamed from: a */
        public final String mo50347a() {
            return this.f20247a;
        }

        /* renamed from: b */
        public final String mo50348b() {
            return this.f20248b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C12613a)) {
                return false;
            }
            C12613a aVar = (C12613a) obj;
            if (C12775o.m28634d(this.f20247a, aVar.f20247a) && C12775o.m28634d(this.f20248b, aVar.f20248b)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return (this.f20247a.hashCode() * 31) + this.f20248b.hashCode();
        }

        public String toString() {
            return "TagAttribute(key=" + this.f20247a + ", value=" + this.f20248b + ')';
        }
    }

    public C12612a(C12614b bVar, String str, List<C12612a> list, List<C12613a> list2) {
        C12775o.m28639i(bVar, JSONAPIResourceIdSerializer.FIELD_TYPE);
        C12775o.m28639i(str, "value");
        C12775o.m28639i(list, "internalTags");
        C12775o.m28639i(list2, "attributes");
        this.f20243a = bVar;
        this.f20244b = str;
        this.f20245c = list;
        this.f20246d = list2;
    }

    /* renamed from: a */
    public final List<C12613a> mo50339a() {
        return this.f20246d;
    }

    /* renamed from: b */
    public final List<C12612a> mo50340b() {
        return this.f20245c;
    }

    /* renamed from: c */
    public final C12614b mo50341c() {
        return this.f20243a;
    }

    /* renamed from: d */
    public final String mo50342d() {
        return this.f20244b;
    }

    /* renamed from: e */
    public final void mo50343e(String str) {
        C12775o.m28639i(str, "<set-?>");
        this.f20244b = str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C12612a)) {
            return false;
        }
        C12612a aVar = (C12612a) obj;
        if (this.f20243a == aVar.f20243a && C12775o.m28634d(this.f20244b, aVar.f20244b) && C12775o.m28634d(this.f20245c, aVar.f20245c) && C12775o.m28634d(this.f20246d, aVar.f20246d)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (((((this.f20243a.hashCode() * 31) + this.f20244b.hashCode()) * 31) + this.f20245c.hashCode()) * 31) + this.f20246d.hashCode();
    }

    public String toString() {
        return "HtmlTag(type=" + this.f20243a + ", value=" + this.f20244b + ", internalTags=" + this.f20245c + ", attributes=" + this.f20246d + ')';
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C12612a(C12614b bVar, String str, List list, List list2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(bVar, str, (i & 4) != 0 ? new ArrayList() : list, (i & 8) != 0 ? C12726w.m28524k() : list2);
    }
}
