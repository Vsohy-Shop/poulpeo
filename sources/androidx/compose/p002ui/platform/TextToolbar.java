package androidx.compose.p002ui.platform;

import androidx.compose.p002ui.geometry.Rect;
import p336ef.C11921v;
import p404of.C13074a;

/* renamed from: androidx.compose.ui.platform.TextToolbar */
/* compiled from: TextToolbar.kt */
public interface TextToolbar {

    /* renamed from: androidx.compose.ui.platform.TextToolbar$DefaultImpls */
    /* compiled from: TextToolbar.kt */
    public static final class DefaultImpls {
    }

    static /* synthetic */ void showMenu$default(TextToolbar textToolbar, Rect rect, C13074a aVar, C13074a aVar2, C13074a aVar3, C13074a aVar4, int i, Object obj) {
        C13074a aVar5;
        C13074a aVar6;
        C13074a aVar7;
        C13074a aVar8;
        if (obj == null) {
            if ((i & 2) != 0) {
                aVar5 = null;
            } else {
                aVar5 = aVar;
            }
            if ((i & 4) != 0) {
                aVar6 = null;
            } else {
                aVar6 = aVar2;
            }
            if ((i & 8) != 0) {
                aVar7 = null;
            } else {
                aVar7 = aVar3;
            }
            if ((i & 16) != 0) {
                aVar8 = null;
            } else {
                aVar8 = aVar4;
            }
            textToolbar.showMenu(rect, aVar5, aVar6, aVar7, aVar8);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: showMenu");
    }

    TextToolbarStatus getStatus();

    void hide();

    void showMenu(Rect rect, C13074a<C11921v> aVar, C13074a<C11921v> aVar2, C13074a<C11921v> aVar3, C13074a<C11921v> aVar4);
}
