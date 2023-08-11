package androidx.compose.material3;

import androidx.compose.p002ui.Modifier;
import androidx.compose.p002ui.graphics.ImageBitmap;
import androidx.compose.runtime.Composer;
import kotlin.jvm.internal.C12777p;
import p336ef.C11921v;
import p404of.C13088o;

/* compiled from: Icon.kt */
final class IconKt$Icon$2 extends C12777p implements C13088o<Composer, Integer, C11921v> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$default;
    final /* synthetic */ ImageBitmap $bitmap;
    final /* synthetic */ String $contentDescription;
    final /* synthetic */ Modifier $modifier;
    final /* synthetic */ long $tint;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    IconKt$Icon$2(ImageBitmap imageBitmap, String str, Modifier modifier, long j, int i, int i2) {
        super(2);
        this.$bitmap = imageBitmap;
        this.$contentDescription = str;
        this.$modifier = modifier;
        this.$tint = j;
        this.$$changed = i;
        this.$$default = i2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((Composer) obj, ((Number) obj2).intValue());
        return C11921v.f18618a;
    }

    public final void invoke(Composer composer, int i) {
        IconKt.m34464Iconww6aTOc(this.$bitmap, this.$contentDescription, this.$modifier, this.$tint, composer, this.$$changed | 1, this.$$default);
    }
}
