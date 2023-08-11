package androidx.compose.p002ui.text;

import androidx.compose.p002ui.graphics.Color;
import androidx.compose.runtime.saveable.SaverScope;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import p336ef.C11916s;
import p404of.C13088o;

/* renamed from: androidx.compose.ui.text.SaversKt$ColorSaver$1 */
/* compiled from: Savers.kt */
final class SaversKt$ColorSaver$1 extends C12777p implements C13088o<SaverScope, Color, Object> {
    public static final SaversKt$ColorSaver$1 INSTANCE = new SaversKt$ColorSaver$1();

    SaversKt$ColorSaver$1() {
        super(2);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return m37917invoke4WTKRHQ((SaverScope) obj, ((Color) obj2).m35681unboximpl());
    }

    /* renamed from: invoke-4WTKRHQ  reason: not valid java name */
    public final Object m37917invoke4WTKRHQ(SaverScope saverScope, long j) {
        C12775o.m28639i(saverScope, "$this$Saver");
        return C11916s.m25708a(j);
    }
}
