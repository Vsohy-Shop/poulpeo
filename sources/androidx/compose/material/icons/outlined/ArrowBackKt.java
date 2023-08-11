package androidx.compose.material.icons.outlined;

import androidx.compose.material.icons.Icons;
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
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;

@SourceDebugExtension({"SMAP\nArrowBack.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ArrowBack.kt\nandroidx/compose/material/icons/outlined/ArrowBackKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,48:1\n122#2:49\n116#2,3:50\n119#2,3:54\n132#2,18:57\n152#2:94\n175#3:53\n694#4,2:75\n706#4,2:77\n708#4,11:83\n53#5,4:79\n*S KotlinDebug\n*F\n+ 1 ArrowBack.kt\nandroidx/compose/material/icons/outlined/ArrowBackKt\n*L\n29#1:49\n29#1:50,3\n29#1:54,3\n30#1:57,18\n30#1:94\n29#1:53\n30#1:75,2\n30#1:77,2\n30#1:83,11\n30#1:79,4\n*E\n"})
/* compiled from: ArrowBack.kt */
public final class ArrowBackKt {
    private static ImageVector _arrowBack;

    public static final ImageVector getArrowBack(Icons.Outlined outlined) {
        C12775o.m28639i(outlined, "<this>");
        ImageVector imageVector = _arrowBack;
        if (imageVector != null) {
            C12775o.m28636f(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = r1;
        ImageVector.Builder builder2 = new ImageVector.Builder("Outlined.ArrowBack", C1232Dp.m38468constructorimpl(24.0f), C1232Dp.m38468constructorimpl(24.0f), 24.0f, 24.0f, 0, 0, false, OAuthErrorCodes.ERR_OAUTH_INVALID_CONSUMER, (DefaultConstructorMarker) null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = r0;
        SolidColor solidColor2 = new SolidColor(Color.Companion.m35697getBlack0d7_KjU(), (DefaultConstructorMarker) null);
        int r22 = StrokeCap.Companion.m36054getButtKaPHkGw();
        int r23 = StrokeJoin.Companion.m36064getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(20.0f, 11.0f);
        pathBuilder.horizontalLineTo(7.83f);
        pathBuilder.lineToRelative(5.59f, -5.59f);
        pathBuilder.lineTo(12.0f, 4.0f);
        pathBuilder.lineToRelative(-8.0f, 8.0f);
        pathBuilder.lineToRelative(8.0f, 8.0f);
        pathBuilder.lineToRelative(1.41f, -1.41f);
        pathBuilder.lineTo(7.83f, 13.0f);
        pathBuilder.horizontalLineTo(20.0f);
        pathBuilder.verticalLineToRelative(-2.0f);
        pathBuilder.close();
        ImageVector build = ImageVector.Builder.m36375addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, (Brush) null, 1.0f, 1.0f, r22, r23, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null).build();
        _arrowBack = build;
        C12775o.m28636f(build);
        return build;
    }
}
