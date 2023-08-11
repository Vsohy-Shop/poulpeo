package androidx.compose.p002ui.graphics.vector;

import androidx.autofill.HintConstants;
import androidx.compose.p002ui.graphics.Brush;
import androidx.compose.p002ui.graphics.vector.ImageVector;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.SourceDebugExtension;
import p336ef.C11921v;

@SourceDebugExtension({"SMAP\nImageVector.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 2 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,768:1\n53#2,4:769\n*S KotlinDebug\n*F\n+ 1 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n*L\n707#1:769,4\n*E\n"})
/* renamed from: androidx.compose.ui.graphics.vector.ImageVectorKt */
/* compiled from: ImageVector.kt */
public final class ImageVectorKt {
    public static final ImageVector.Builder group(ImageVector.Builder builder, String str, float f, float f2, float f3, float f4, float f5, float f6, float f7, List<? extends PathNode> list, Function1<? super ImageVector.Builder, C11921v> function1) {
        C12775o.m28639i(builder, "<this>");
        C12775o.m28639i(str, HintConstants.AUTOFILL_HINT_NAME);
        C12775o.m28639i(list, "clipPathData");
        C12775o.m28639i(function1, "block");
        builder.addGroup(str, f, f2, f3, f4, f5, f6, f7, list);
        function1.invoke(builder);
        builder.clearGroup();
        return builder;
    }

    public static /* synthetic */ ImageVector.Builder group$default(ImageVector.Builder builder, String str, float f, float f2, float f3, float f4, float f5, float f6, float f7, List list, Function1 function1, int i, Object obj) {
        String str2;
        float f8;
        float f9;
        float f10;
        float f11;
        float f12;
        float f13;
        List<PathNode> list2;
        ImageVector.Builder builder2 = builder;
        Function1 function12 = function1;
        int i2 = i;
        if ((i2 & 1) != 0) {
            str2 = "";
        } else {
            str2 = str;
        }
        if ((i2 & 2) != 0) {
            f8 = 0.0f;
        } else {
            f8 = f;
        }
        if ((i2 & 4) != 0) {
            f9 = 0.0f;
        } else {
            f9 = f2;
        }
        if ((i2 & 8) != 0) {
            f10 = 0.0f;
        } else {
            f10 = f3;
        }
        float f14 = 1.0f;
        if ((i2 & 16) != 0) {
            f11 = 1.0f;
        } else {
            f11 = f4;
        }
        if ((i2 & 32) == 0) {
            f14 = f5;
        }
        if ((i2 & 64) != 0) {
            f12 = 0.0f;
        } else {
            f12 = f6;
        }
        if ((i2 & 128) != 0) {
            f13 = 0.0f;
        } else {
            f13 = f7;
        }
        if ((i2 & 256) != 0) {
            list2 = VectorKt.getEmptyPath();
        } else {
            list2 = list;
        }
        C12775o.m28639i(builder, "<this>");
        C12775o.m28639i(str2, HintConstants.AUTOFILL_HINT_NAME);
        C12775o.m28639i(list2, "clipPathData");
        C12775o.m28639i(function12, "block");
        builder.addGroup(str2, f8, f9, f10, f11, f14, f12, f13, list2);
        function12.invoke(builder);
        builder.clearGroup();
        return builder2;
    }

    /* renamed from: path-R_LF-3I  reason: not valid java name */
    public static final ImageVector.Builder m36377pathR_LF3I(ImageVector.Builder builder, String str, Brush brush, float f, Brush brush2, float f2, float f3, int i, int i2, float f4, int i3, Function1<? super PathBuilder, C11921v> function1) {
        Function1<? super PathBuilder, C11921v> function12 = function1;
        int i4 = i3;
        C12775o.m28639i(builder, "$this$path");
        C12775o.m28639i(str, HintConstants.AUTOFILL_HINT_NAME);
        C12775o.m28639i(function12, "pathBuilder");
        PathBuilder pathBuilder = new PathBuilder();
        function12.invoke(pathBuilder);
        return ImageVector.Builder.m36375addPathoIyEayM$default(builder, pathBuilder.getNodes(), i4, str, brush, f, brush2, f2, f3, i, i2, f4, 0.0f, 0.0f, 0.0f, 14336, (Object) null);
    }

    /* renamed from: path-R_LF-3I$default  reason: not valid java name */
    public static /* synthetic */ ImageVector.Builder m36378pathR_LF3I$default(ImageVector.Builder builder, String str, Brush brush, float f, Brush brush2, float f2, float f3, int i, int i2, float f4, int i3, Function1 function1, int i4, Object obj) {
        String str2;
        Brush brush3;
        float f5;
        Brush brush4;
        float f6;
        float f7;
        int i5;
        int i6;
        float f8;
        int i7;
        Function1 function12 = function1;
        int i8 = i4;
        if ((i8 & 1) != 0) {
            str2 = "";
        } else {
            str2 = str;
        }
        if ((i8 & 2) != 0) {
            brush3 = null;
        } else {
            brush3 = brush;
        }
        if ((i8 & 4) != 0) {
            f5 = 1.0f;
        } else {
            f5 = f;
        }
        if ((i8 & 8) != 0) {
            brush4 = null;
        } else {
            brush4 = brush2;
        }
        if ((i8 & 16) != 0) {
            f6 = 1.0f;
        } else {
            f6 = f2;
        }
        if ((i8 & 32) != 0) {
            f7 = 0.0f;
        } else {
            f7 = f3;
        }
        if ((i8 & 64) != 0) {
            i5 = VectorKt.getDefaultStrokeLineCap();
        } else {
            i5 = i;
        }
        if ((i8 & 128) != 0) {
            i6 = VectorKt.getDefaultStrokeLineJoin();
        } else {
            i6 = i2;
        }
        if ((i8 & 256) != 0) {
            f8 = 4.0f;
        } else {
            f8 = f4;
        }
        if ((i8 & 512) != 0) {
            i7 = VectorKt.getDefaultFillType();
        } else {
            i7 = i3;
        }
        C12775o.m28639i(builder, "$this$path");
        C12775o.m28639i(str2, HintConstants.AUTOFILL_HINT_NAME);
        C12775o.m28639i(function12, "pathBuilder");
        PathBuilder pathBuilder = new PathBuilder();
        function12.invoke(pathBuilder);
        return ImageVector.Builder.m36375addPathoIyEayM$default(builder, pathBuilder.getNodes(), i7, str2, brush3, f5, brush4, f6, f7, i5, i6, f8, 0.0f, 0.0f, 0.0f, 14336, (Object) null);
    }

    /* access modifiers changed from: private */
    public static final <T> T peek(ArrayList<T> arrayList) {
        return arrayList.get(arrayList.size() - 1);
    }

    /* access modifiers changed from: private */
    public static final <T> T pop(ArrayList<T> arrayList) {
        return arrayList.remove(arrayList.size() - 1);
    }

    /* access modifiers changed from: private */
    public static final <T> boolean push(ArrayList<T> arrayList, T t) {
        return arrayList.add(t);
    }
}
