package androidx.compose.animation;

import androidx.compose.p002ui.layout.Placeable;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import p336ef.C11921v;

/* compiled from: AnimatedContent.kt */
final class AnimatedContentScope$SizeModifier$measure$1 extends C12777p implements Function1<Placeable.PlacementScope, C11921v> {
    final /* synthetic */ long $offset;
    final /* synthetic */ Placeable $placeable;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    AnimatedContentScope$SizeModifier$measure$1(Placeable placeable, long j) {
        super(1);
        this.$placeable = placeable;
        this.$offset = j;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Placeable.PlacementScope) obj);
        return C11921v.f18618a;
    }

    public final void invoke(Placeable.PlacementScope placementScope) {
        C12775o.m28639i(placementScope, "$this$layout");
        Placeable.PlacementScope.m37405place70tqf50$default(placementScope, this.$placeable, this.$offset, 0.0f, 2, (Object) null);
    }
}
