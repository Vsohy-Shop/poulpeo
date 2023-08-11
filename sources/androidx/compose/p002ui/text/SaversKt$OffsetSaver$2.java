package androidx.compose.p002ui.text;

import androidx.compose.p002ui.geometry.Offset;
import androidx.compose.p002ui.geometry.OffsetKt;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import kotlin.jvm.internal.SourceDebugExtension;

@SourceDebugExtension({"SMAP\nSavers.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Savers.kt\nandroidx/compose/ui/text/SaversKt$OffsetSaver$2\n+ 2 Savers.kt\nandroidx/compose/ui/text/SaversKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,421:1\n70#2:422\n1#3:423\n*S KotlinDebug\n*F\n+ 1 Savers.kt\nandroidx/compose/ui/text/SaversKt$OffsetSaver$2\n*L\n394#1:422\n394#1:423\n*E\n"})
/* renamed from: androidx.compose.ui.text.SaversKt$OffsetSaver$2 */
/* compiled from: Savers.kt */
final class SaversKt$OffsetSaver$2 extends C12777p implements Function1<Object, Offset> {
    public static final SaversKt$OffsetSaver$2 INSTANCE = new SaversKt$OffsetSaver$2();

    SaversKt$OffsetSaver$2() {
        super(1);
    }

    /* renamed from: invoke-x-9fifI  reason: not valid java name */
    public final Offset invoke(Object obj) {
        Float f;
        C12775o.m28639i(obj, "it");
        if (C12775o.m28634d(obj, Boolean.FALSE)) {
            return Offset.m35411boximpl(Offset.Companion.m35437getUnspecifiedF1C5BW0());
        }
        List list = (List) obj;
        Object obj2 = list.get(0);
        Float f2 = null;
        if (obj2 != null) {
            f = (Float) obj2;
        } else {
            f = null;
        }
        C12775o.m28636f(f);
        float floatValue = f.floatValue();
        Object obj3 = list.get(1);
        if (obj3 != null) {
            f2 = (Float) obj3;
        }
        C12775o.m28636f(f2);
        return Offset.m35411boximpl(OffsetKt.Offset(floatValue, f2.floatValue()));
    }
}
