package androidx.compose.foundation.text;

import androidx.compose.p002ui.layout.Placeable;
import androidx.compose.p002ui.unit.IntOffset;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import kotlin.jvm.internal.SourceDebugExtension;
import p336ef.C11906l;
import p336ef.C11921v;

@SourceDebugExtension({"SMAP\nCoreText.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CoreText.kt\nandroidx/compose/foundation/text/TextController$measurePolicy$1$measure$2\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,702:1\n33#2,6:703\n*S KotlinDebug\n*F\n+ 1 CoreText.kt\nandroidx/compose/foundation/text/TextController$measurePolicy$1$measure$2\n*L\n378#1:703,6\n*E\n"})
/* compiled from: CoreText.kt */
final class TextController$measurePolicy$1$measure$2 extends C12777p implements Function1<Placeable.PlacementScope, C11921v> {
    final /* synthetic */ List<C11906l<Placeable, IntOffset>> $placeables;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    TextController$measurePolicy$1$measure$2(List<? extends C11906l<? extends Placeable, IntOffset>> list) {
        super(1);
        this.$placeables = list;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Placeable.PlacementScope) obj);
        return C11921v.f18618a;
    }

    public final void invoke(Placeable.PlacementScope placementScope) {
        C12775o.m28639i(placementScope, "$this$layout");
        List<C11906l<Placeable, IntOffset>> list = this.$placeables;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            C11906l lVar = list.get(i);
            Placeable.PlacementScope.m37405place70tqf50$default(placementScope, (Placeable) lVar.mo49109a(), ((IntOffset) lVar.mo49110b()).m38595unboximpl(), 0.0f, 2, (Object) null);
        }
    }
}
