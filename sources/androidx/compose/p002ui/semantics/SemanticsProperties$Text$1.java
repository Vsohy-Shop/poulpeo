package androidx.compose.p002ui.semantics;

import androidx.compose.p002ui.text.AnnotatedString;
import java.util.List;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import kotlin.jvm.internal.SourceDebugExtension;
import p404of.C13088o;

@SourceDebugExtension({"SMAP\nSemanticsProperties.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SemanticsProperties.kt\nandroidx/compose/ui/semantics/SemanticsProperties$Text$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1195:1\n1#2:1196\n*E\n"})
/* renamed from: androidx.compose.ui.semantics.SemanticsProperties$Text$1 */
/* compiled from: SemanticsProperties.kt */
final class SemanticsProperties$Text$1 extends C12777p implements C13088o<List<? extends AnnotatedString>, List<? extends AnnotatedString>, List<? extends AnnotatedString>> {
    public static final SemanticsProperties$Text$1 INSTANCE = new SemanticsProperties$Text$1();

    SemanticsProperties$Text$1() {
        super(2);
    }

    public final List<AnnotatedString> invoke(List<AnnotatedString> list, List<AnnotatedString> list2) {
        List<AnnotatedString> D0;
        C12775o.m28639i(list2, "childValue");
        if (list == null || (D0 = C12686e0.m28207D0(list)) == null) {
            return list2;
        }
        D0.addAll(list2);
        return D0;
    }
}
