package androidx.compose.foundation.text.selection;

import androidx.compose.p002ui.geometry.Offset;
import androidx.compose.p002ui.layout.LayoutCoordinates;
import com.appboy.Constants;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import p404of.C13088o;

/* compiled from: SelectionRegistrarImpl.kt */
final class SelectionRegistrarImpl$sort$1 extends C12777p implements C13088o<Selectable, Selectable, Integer> {
    final /* synthetic */ LayoutCoordinates $containerLayoutCoordinates;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    SelectionRegistrarImpl$sort$1(LayoutCoordinates layoutCoordinates) {
        super(2);
        this.$containerLayoutCoordinates = layoutCoordinates;
    }

    public final Integer invoke(Selectable selectable, Selectable selectable2) {
        long j;
        long j2;
        int i;
        C12775o.m28639i(selectable, Constants.APPBOY_PUSH_CONTENT_KEY);
        C12775o.m28639i(selectable2, "b");
        LayoutCoordinates layoutCoordinates = selectable.getLayoutCoordinates();
        LayoutCoordinates layoutCoordinates2 = selectable2.getLayoutCoordinates();
        if (layoutCoordinates != null) {
            j = this.$containerLayoutCoordinates.m37342localPositionOfR5De75A(layoutCoordinates, Offset.Companion.m35438getZeroF1C5BW0());
        } else {
            j = Offset.Companion.m35438getZeroF1C5BW0();
        }
        if (layoutCoordinates2 != null) {
            j2 = this.$containerLayoutCoordinates.m37342localPositionOfR5De75A(layoutCoordinates2, Offset.Companion.m35438getZeroF1C5BW0());
        } else {
            j2 = Offset.Companion.m35438getZeroF1C5BW0();
        }
        if (Offset.m35423getYimpl(j) == Offset.m35423getYimpl(j2)) {
            i = C12019b.m26106c(Float.valueOf(Offset.m35422getXimpl(j)), Float.valueOf(Offset.m35422getXimpl(j2)));
        } else {
            i = C12019b.m26106c(Float.valueOf(Offset.m35423getYimpl(j)), Float.valueOf(Offset.m35423getYimpl(j2)));
        }
        return Integer.valueOf(i);
    }
}
