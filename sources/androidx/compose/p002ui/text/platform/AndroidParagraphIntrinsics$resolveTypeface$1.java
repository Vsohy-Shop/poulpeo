package androidx.compose.p002ui.text.platform;

import android.graphics.Typeface;
import androidx.compose.p002ui.text.font.FontFamily;
import androidx.compose.p002ui.text.font.FontStyle;
import androidx.compose.p002ui.text.font.FontSynthesis;
import androidx.compose.p002ui.text.font.FontWeight;
import androidx.compose.p002ui.text.font.TypefaceResult;
import androidx.compose.runtime.State;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import p404of.C13090q;

/* renamed from: androidx.compose.ui.text.platform.AndroidParagraphIntrinsics$resolveTypeface$1 */
/* compiled from: AndroidParagraphIntrinsics.android.kt */
final class AndroidParagraphIntrinsics$resolveTypeface$1 extends C12777p implements C13090q<FontFamily, FontWeight, FontStyle, FontSynthesis, Typeface> {
    final /* synthetic */ AndroidParagraphIntrinsics this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    AndroidParagraphIntrinsics$resolveTypeface$1(AndroidParagraphIntrinsics androidParagraphIntrinsics) {
        super(4);
        this.this$0 = androidParagraphIntrinsics;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        return m38205invokeDPcqOEQ((FontFamily) obj, (FontWeight) obj2, ((FontStyle) obj3).m38066unboximpl(), ((FontSynthesis) obj4).m38077unboximpl());
    }

    /* renamed from: invoke-DPcqOEQ  reason: not valid java name */
    public final Typeface m38205invokeDPcqOEQ(FontFamily fontFamily, FontWeight fontWeight, int i, int i2) {
        C12775o.m28639i(fontWeight, "fontWeight");
        State<Object> r2 = this.this$0.getFontFamilyResolver().m38037resolveDPcqOEQ(fontFamily, fontWeight, i, i2);
        if (!(r2 instanceof TypefaceResult.Immutable)) {
            TypefaceDirtyTrackerLinkedList typefaceDirtyTrackerLinkedList = new TypefaceDirtyTrackerLinkedList(r2, this.this$0.resolvedTypefaces);
            this.this$0.resolvedTypefaces = typefaceDirtyTrackerLinkedList;
            return typefaceDirtyTrackerLinkedList.getTypeface();
        }
        Object value = r2.getValue();
        C12775o.m28637g(value, "null cannot be cast to non-null type android.graphics.Typeface");
        return (Typeface) value;
    }
}
