package p359ic;

import com.rmn.api.p322v2.main.debug.AbstractDebugRequestMapper;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p290y8.C10714c;
import p367jc.C12612a;
import p367jc.C12614b;
import p374kc.C12651a;
import p454wf.C13731h;
import p454wf.C13735j;

/* renamed from: ic.a */
/* compiled from: HtmlParser.kt */
public final class C12130a {

    /* renamed from: ic.a$a */
    /* compiled from: HtmlParser.kt */
    static final class C12131a extends C12777p implements Function1<C13731h, String> {

        /* renamed from: g */
        public static final C12131a f19013g = new C12131a();

        C12131a() {
            super(1);
        }

        /* renamed from: a */
        public final String invoke(C13731h hVar) {
            C12775o.m28639i(hVar, "it");
            return hVar.getValue();
        }
    }

    /* renamed from: ic.a$b */
    /* compiled from: HtmlParser.kt */
    static final class C12132b extends C12777p implements Function1<String, C12612a.C12613a> {

        /* renamed from: g */
        public static final C12132b f19014g = new C12132b();

        C12132b() {
            super(1);
        }

        /* renamed from: b */
        public final C12612a.C12613a invoke(String str) {
            C12775o.m28639i(str, "it");
            List t0 = C13755w.m31594t0(str, new String[]{"="}, false, 0, 6, (Object) null);
            String str2 = (String) C12686e0.m28224c0(t0, 0);
            String str3 = "";
            if (str2 == null) {
                str2 = str3;
            }
            String str4 = (String) C12686e0.m28224c0(t0, 1);
            if (str4 != null) {
                str3 = str4;
            }
            return new C12612a.C12613a(str2, C13755w.m31587m0(str3, AbstractDebugRequestMapper.QUOTE));
        }
    }

    /* renamed from: a */
    public final List<C12612a> mo49576a(String str) {
        String str2;
        C12612a aVar;
        List<C12612a> b;
        String value;
        String k0;
        String l0;
        String str3 = str;
        C12775o.m28639i(str3, "text");
        String f = new C13735j("<br.*/>").mo53413f(C13754v.m31521A(new C13735j("\\n(\\s+)").mo53413f(new C13735j(">\\n(\\s+)").mo53413f(C10714c.f16334a.mo45645a(str3), ">"), " "), "&nbsp;", " ", false, 4, (Object) null), "\n");
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int i = 0;
        for (C13731h hVar : C13735j.m31439d(new C13735j("<(?:\"[^\"]*\"['\"]*|'[^']*'['\"]*|[^'\">])+>"), f, 0, 2, (Object) null)) {
            C13731h b2 = C13735j.m31438b(new C13735j("((<\\w+?)(>|\\s))"), hVar.getValue(), 0, 2, (Object) null);
            if (b2 == null || (value = b2.getValue()) == null || (k0 = C13755w.m31585k0(value, "<")) == null || (l0 = C13755w.m31586l0(k0, ">")) == null) {
                str2 = null;
            } else {
                str2 = C13755w.m31561N0(l0).toString();
            }
            if (str2 == null) {
                str2 = "";
            }
            String l02 = C13755w.m31586l0(C13755w.m31585k0(hVar.getValue(), "</"), ">");
            if (!C13754v.m31532t(str2)) {
                C12614b b3 = C12651a.m28143b(str2);
                C12612a aVar2 = new C12612a(b3, "", (List) null, C13662o.m31293z(C13662o.m31287t(C13662o.m31287t(C13735j.m31439d(new C13735j("(\\w+)=[\"']?((?:.(?![\"']?\\s+\\S+=|\\s*/?[>\"']))+.)[\"']?"), hVar.getValue(), 0, 2, (Object) null), C12131a.f19013g), C12132b.f19014g)), 4, (DefaultConstructorMarker) null);
                if (!arrayList.isEmpty()) {
                    String substring = f.substring(i, hVar.mo53404a().mo53147j());
                    C12775o.m28638h(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                    C12612a aVar3 = (C12612a) C12686e0.m28232k0(arrayList);
                    if (aVar3 != null) {
                        C12651a.m28142a(aVar3, substring);
                    }
                    C12612a aVar4 = (C12612a) C12686e0.m28232k0(arrayList);
                    if (!(aVar4 == null || (b = aVar4.mo50340b()) == null)) {
                        b.add(aVar2);
                    }
                } else {
                    arrayList2.add(aVar2);
                }
                if (b3 != C12614b.Image) {
                    arrayList.add(aVar2);
                }
            } else if (!C13754v.m31532t(l02)) {
                String substring2 = f.substring(i, hVar.mo53404a().mo53147j());
                C12775o.m28638h(substring2, "this as java.lang.String…ing(startIndex, endIndex)");
                if ((!C13754v.m31532t(substring2)) && (aVar = (C12612a) C12686e0.m28232k0(arrayList)) != null) {
                    C12651a.m28142a(aVar, substring2);
                }
                if (!arrayList.isEmpty()) {
                    Object unused = C12669b0.m28190N(arrayList);
                }
            } else {
                throw new RuntimeException("Unexpected behaviour");
            }
            i = hVar.mo53404a().mo53148k() + 1;
        }
        return arrayList2;
    }
}
