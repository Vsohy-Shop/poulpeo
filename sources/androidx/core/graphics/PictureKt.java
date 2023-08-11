package androidx.core.graphics;

import android.graphics.Canvas;
import android.graphics.Picture;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12773m;
import kotlin.jvm.internal.C12775o;
import p336ef.C11921v;

/* compiled from: Picture.kt */
public final class PictureKt {
    public static final Picture record(Picture picture, int i, int i2, Function1<? super Canvas, C11921v> function1) {
        C12775o.m28639i(picture, "<this>");
        C12775o.m28639i(function1, "block");
        Canvas beginRecording = picture.beginRecording(i, i2);
        C12775o.m28638h(beginRecording, "beginRecording(width, height)");
        try {
            function1.invoke(beginRecording);
            return picture;
        } finally {
            C12773m.m28629b(1);
            picture.endRecording();
            C12773m.m28628a(1);
        }
    }
}
