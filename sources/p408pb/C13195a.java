package p408pb;

import androidx.compose.p002ui.text.AnnotatedString;
import java.util.List;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p367jc.C12612a;
import p367jc.C12614b;
import p414qb.C13234a;

/* renamed from: pb.a */
/* compiled from: HtmlTagExtensions.kt */
public final class C13195a {
    /* renamed from: a */
    public static final List<C12612a> m29946a(C12612a aVar) {
        C12775o.m28639i(aVar, "<this>");
        if (C13754v.m31532t(aVar.mo50342d())) {
            return aVar.mo50340b();
        }
        List<C12612a> D0 = C12686e0.m28207D0(aVar.mo50340b());
        D0.add(0, new C12612a(C12614b.PlainText, C13755w.m31563O0(aVar.mo50342d()).toString(), (List) null, (List) null, 12, (DefaultConstructorMarker) null));
        return D0;
    }

    /* renamed from: b */
    public static final AnnotatedString m29947b(List<C12612a> list) {
        C12775o.m28639i(list, "<this>");
        AnnotatedString.Builder builder = new AnnotatedString.Builder(0, 1, (DefaultConstructorMarker) null);
        for (C12612a a : list) {
            builder.append(C13234a.m30065a(a));
        }
        return builder.toAnnotatedString();
    }
}
