package androidx.compose.material.icons;

import androidx.autofill.HintConstants;
import androidx.compose.p002ui.graphics.Brush;
import androidx.compose.p002ui.graphics.Color;
import androidx.compose.p002ui.graphics.SolidColor;
import androidx.compose.p002ui.graphics.StrokeCap;
import androidx.compose.p002ui.graphics.StrokeJoin;
import androidx.compose.p002ui.graphics.vector.ImageVector;
import androidx.compose.p002ui.graphics.vector.PathBuilder;
import androidx.compose.p002ui.graphics.vector.VectorKt;
import androidx.compose.p002ui.unit.C1232Dp;
import com.rmn.api.p322v2.main.oauth.OAuthErrorCodes;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import p336ef.C11921v;

@SourceDebugExtension({"SMAP\nIcons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 4 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,157:1\n175#2:158\n175#2:159\n694#3,2:160\n706#3,2:162\n708#3,11:168\n706#3,13:179\n53#4,4:164\n*S KotlinDebug\n*F\n+ 1 Icons.kt\nandroidx/compose/material/icons/IconsKt\n*L\n118#1:158\n119#1:159\n141#1:160,2\n141#1:162,2\n141#1:168,11\n141#1:179,13\n141#1:164,4\n*E\n"})
/* compiled from: Icons.kt */
public final class IconsKt {
    public static final float MaterialIconDimension = 24.0f;

    public static final ImageVector materialIcon(String str, Function1<? super ImageVector.Builder, ImageVector.Builder> function1) {
        C12775o.m28639i(str, HintConstants.AUTOFILL_HINT_NAME);
        C12775o.m28639i(function1, "block");
        return function1.invoke(new ImageVector.Builder(str, C1232Dp.m38468constructorimpl(24.0f), C1232Dp.m38468constructorimpl(24.0f), 24.0f, 24.0f, 0, 0, false, OAuthErrorCodes.ERR_OAUTH_INVALID_CONSUMER, (DefaultConstructorMarker) null)).build();
    }

    /* renamed from: materialPath-YwgOQQI  reason: not valid java name */
    public static final ImageVector.Builder m34204materialPathYwgOQQI(ImageVector.Builder builder, float f, float f2, int i, Function1<? super PathBuilder, C11921v> function1) {
        Function1<? super PathBuilder, C11921v> function12 = function1;
        int i2 = i;
        C12775o.m28639i(builder, "$this$materialPath");
        C12775o.m28639i(function12, "pathBuilder");
        SolidColor solidColor = r2;
        SolidColor solidColor2 = new SolidColor(Color.Companion.m35697getBlack0d7_KjU(), (DefaultConstructorMarker) null);
        int r10 = StrokeCap.Companion.m36054getButtKaPHkGw();
        int r11 = StrokeJoin.Companion.m36064getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        function12.invoke(pathBuilder);
        return ImageVector.Builder.m36375addPathoIyEayM$default(builder, pathBuilder.getNodes(), i2, "", solidColor, f, (Brush) null, f2, 1.0f, r10, r11, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null);
    }

    /* renamed from: materialPath-YwgOQQI$default  reason: not valid java name */
    public static /* synthetic */ ImageVector.Builder m34205materialPathYwgOQQI$default(ImageVector.Builder builder, float f, float f2, int i, Function1 function1, int i2, Object obj) {
        float f3;
        float f4;
        int i3;
        Function1 function12 = function1;
        if ((i2 & 1) != 0) {
            f3 = 1.0f;
        } else {
            f3 = f;
        }
        if ((i2 & 2) != 0) {
            f4 = 1.0f;
        } else {
            f4 = f2;
        }
        if ((i2 & 4) != 0) {
            i3 = VectorKt.getDefaultFillType();
        } else {
            i3 = i;
        }
        C12775o.m28639i(builder, "$this$materialPath");
        C12775o.m28639i(function12, "pathBuilder");
        SolidColor solidColor = r1;
        SolidColor solidColor2 = new SolidColor(Color.Companion.m35697getBlack0d7_KjU(), (DefaultConstructorMarker) null);
        int r12 = StrokeCap.Companion.m36054getButtKaPHkGw();
        int r13 = StrokeJoin.Companion.m36064getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        function12.invoke(pathBuilder);
        return ImageVector.Builder.m36375addPathoIyEayM$default(builder, pathBuilder.getNodes(), i3, "", solidColor, f3, (Brush) null, f4, 1.0f, r12, r13, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null);
    }

    public static /* synthetic */ void getMaterialIconDimension$annotations() {
    }
}
