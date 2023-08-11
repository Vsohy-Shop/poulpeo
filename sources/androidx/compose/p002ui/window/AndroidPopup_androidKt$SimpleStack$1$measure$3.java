package androidx.compose.p002ui.window;

import androidx.compose.p002ui.layout.Placeable;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import kotlin.jvm.internal.SourceDebugExtension;
import p336ef.C11921v;

@SourceDebugExtension({"SMAP\nAndroidPopup.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidPopup.android.kt\nandroidx/compose/ui/window/AndroidPopup_androidKt$SimpleStack$1$measure$3\n*L\n1#1,824:1\n*E\n"})
/* renamed from: androidx.compose.ui.window.AndroidPopup_androidKt$SimpleStack$1$measure$3 */
/* compiled from: AndroidPopup.android.kt */
public final class AndroidPopup_androidKt$SimpleStack$1$measure$3 extends C12777p implements Function1<Placeable.PlacementScope, C11921v> {
    final /* synthetic */ List<Placeable> $placeables;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AndroidPopup_androidKt$SimpleStack$1$measure$3(List<? extends Placeable> list) {
        super(1);
        this.$placeables = list;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Placeable.PlacementScope) obj);
        return C11921v.f18618a;
    }

    public final void invoke(Placeable.PlacementScope placementScope) {
        C12775o.m28639i(placementScope, "$this$layout");
        int m = C12726w.m28526m(this.$placeables);
        if (m >= 0) {
            int i = 0;
            while (true) {
                Placeable.PlacementScope.placeRelative$default(placementScope, this.$placeables.get(i), 0, 0, 0.0f, 4, (Object) null);
                if (i != m) {
                    i++;
                } else {
                    return;
                }
            }
        }
    }
}
