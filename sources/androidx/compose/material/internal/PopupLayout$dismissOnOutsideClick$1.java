package androidx.compose.material.internal;

import androidx.compose.p002ui.geometry.Offset;
import androidx.compose.p002ui.unit.IntRect;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import p404of.C13088o;

/* compiled from: ExposedDropdownMenuPopup.kt */
final class PopupLayout$dismissOnOutsideClick$1 extends C12777p implements C13088o<Offset, IntRect, Boolean> {
    public static final PopupLayout$dismissOnOutsideClick$1 INSTANCE = new PopupLayout$dismissOnOutsideClick$1();

    PopupLayout$dismissOnOutsideClick$1() {
        super(2);
    }

    /* renamed from: invoke-KMgbckE  reason: not valid java name */
    public final Boolean invoke(Offset offset, IntRect intRect) {
        C12775o.m28639i(intRect, "bounds");
        boolean z = false;
        if (offset != null && (Offset.m35422getXimpl(offset.m35432unboximpl()) < ((float) intRect.getLeft()) || Offset.m35422getXimpl(offset.m35432unboximpl()) > ((float) intRect.getRight()) || Offset.m35423getYimpl(offset.m35432unboximpl()) < ((float) intRect.getTop()) || Offset.m35423getYimpl(offset.m35432unboximpl()) > ((float) intRect.getBottom()))) {
            z = true;
        }
        return Boolean.valueOf(z);
    }
}
