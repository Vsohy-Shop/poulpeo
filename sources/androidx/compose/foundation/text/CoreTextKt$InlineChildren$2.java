package androidx.compose.foundation.text;

import androidx.compose.p002ui.text.AnnotatedString;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import java.util.List;
import kotlin.jvm.internal.C12777p;
import p336ef.C11921v;
import p404of.C13088o;
import p404of.C13089p;

/* compiled from: CoreText.kt */
final class CoreTextKt$InlineChildren$2 extends C12777p implements C13088o<Composer, Integer, C11921v> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ List<AnnotatedString.Range<C13089p<String, Composer, Integer, C11921v>>> $inlineContents;
    final /* synthetic */ AnnotatedString $text;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    CoreTextKt$InlineChildren$2(AnnotatedString annotatedString, List<AnnotatedString.Range<C13089p<String, Composer, Integer, C11921v>>> list, int i) {
        super(2);
        this.$text = annotatedString;
        this.$inlineContents = list;
        this.$$changed = i;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((Composer) obj, ((Number) obj2).intValue());
        return C11921v.f18618a;
    }

    public final void invoke(Composer composer, int i) {
        CoreTextKt.InlineChildren(this.$text, this.$inlineContents, composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 1));
    }
}
