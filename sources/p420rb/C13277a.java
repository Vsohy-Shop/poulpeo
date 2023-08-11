package p420rb;

import com.rmn.apiclient.impl.api.call.APIIncludes;
import com.rmn.apiclient.impl.api.descriptors.APIResourceDescriptors;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.C12775o;
import p367jc.C12612a;
import p367jc.C12614b;

/* renamed from: rb.a */
/* compiled from: TextTagHelpers.kt */
public final class C13277a {
    /* renamed from: a */
    public static final boolean m30152a(List<C12612a> list) {
        C12775o.m28639i(list, APIIncludes.TAGS);
        Iterable<C12612a> iterable = list;
        if ((iterable instanceof Collection) && ((Collection) iterable).isEmpty()) {
            return true;
        }
        for (C12612a b : iterable) {
            if (!m30153b(b)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: b */
    public static final boolean m30153b(C12612a aVar) {
        C12775o.m28639i(aVar, APIResourceDescriptors.RESOURCE_TYPE_TAG);
        return C12726w.m28527n(C12614b.H1, C12614b.H2, C12614b.H3, C12614b.H4, C12614b.H5, C12614b.H6, C12614b.Bold, C12614b.Span, C12614b.EmphasizedText, C12614b.PlainText).contains(aVar.mo50341c());
    }
}
