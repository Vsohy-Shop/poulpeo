package androidx.compose.p002ui.text;

import androidx.compose.p002ui.geometry.Offset;
import androidx.compose.p002ui.graphics.Color;
import androidx.compose.p002ui.graphics.Shadow;
import androidx.compose.runtime.saveable.Saver;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;

@SourceDebugExtension({"SMAP\nSavers.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Savers.kt\nandroidx/compose/ui/text/SaversKt$ShadowSaver$2\n+ 2 Savers.kt\nandroidx/compose/ui/text/SaversKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,421:1\n55#2,2:422\n55#2,2:425\n70#2:428\n1#3:424\n1#3:427\n1#3:429\n*S KotlinDebug\n*F\n+ 1 Savers.kt\nandroidx/compose/ui/text/SaversKt$ShadowSaver$2\n*L\n348#1:422,2\n349#1:425,2\n350#1:428\n348#1:424\n349#1:427\n350#1:429\n*E\n"})
/* renamed from: androidx.compose.ui.text.SaversKt$ShadowSaver$2 */
/* compiled from: Savers.kt */
final class SaversKt$ShadowSaver$2 extends C12777p implements Function1<Object, Shadow> {
    public static final SaversKt$ShadowSaver$2 INSTANCE = new SaversKt$ShadowSaver$2();

    SaversKt$ShadowSaver$2() {
        super(1);
    }

    public final Shadow invoke(Object obj) {
        Color color;
        Offset offset;
        C12775o.m28639i(obj, "it");
        List list = (List) obj;
        Object obj2 = list.get(0);
        Saver<Color, Object> saver = SaversKt.getSaver(Color.Companion);
        Boolean bool = Boolean.FALSE;
        Float f = null;
        if (!C12775o.m28634d(obj2, bool) && obj2 != null) {
            color = saver.restore(obj2);
        } else {
            color = null;
        }
        C12775o.m28636f(color);
        long r5 = color.m35681unboximpl();
        Object obj3 = list.get(1);
        Saver<Offset, Object> saver2 = SaversKt.getSaver(Offset.Companion);
        if (!C12775o.m28634d(obj3, bool) && obj3 != null) {
            offset = saver2.restore(obj3);
        } else {
            offset = null;
        }
        C12775o.m28636f(offset);
        long r8 = offset.m35432unboximpl();
        Object obj4 = list.get(2);
        if (obj4 != null) {
            f = (Float) obj4;
        }
        C12775o.m28636f(f);
        return new Shadow(r5, r8, f.floatValue(), (DefaultConstructorMarker) null);
    }
}
