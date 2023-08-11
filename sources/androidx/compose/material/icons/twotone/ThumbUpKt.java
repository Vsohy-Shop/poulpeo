package androidx.compose.material.icons.twotone;

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

@SourceDebugExtension({"SMAP\nThumbUp.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ThumbUp.kt\nandroidx/compose/material/icons/twotone/ThumbUpKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,78:1\n122#2:79\n116#2,3:80\n119#2,3:84\n132#2,18:87\n152#2:124\n132#2,18:125\n152#2:162\n175#3:83\n694#4,2:105\n706#4,2:107\n708#4,11:113\n694#4,2:143\n706#4,2:145\n708#4,11:151\n53#5,4:109\n53#5,4:147\n*S KotlinDebug\n*F\n+ 1 ThumbUp.kt\nandroidx/compose/material/icons/twotone/ThumbUpKt\n*L\n29#1:79\n29#1:80,3\n29#1:84,3\n30#1:87,18\n30#1:124\n40#1:125,18\n40#1:162\n29#1:83\n30#1:105,2\n30#1:107,2\n30#1:113,11\n40#1:143,2\n40#1:145,2\n40#1:151,11\n30#1:109,4\n40#1:147,4\n*E\n"})
/* compiled from: ThumbUp.kt */
public final class ThumbUpKt {
    private static ImageVector _thumbUp;

    public static final ImageVector getThumbUp(Icons.TwoTone twoTone) {
        C12775o.m28639i(twoTone, "<this>");
        ImageVector imageVector = _thumbUp;
        if (imageVector != null) {
            C12775o.m28636f(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = r1;
        ImageVector.Builder builder2 = r1;
        ImageVector.Builder builder3 = new ImageVector.Builder("TwoTone.ThumbUp", C1232Dp.m38468constructorimpl(24.0f), C1232Dp.m38468constructorimpl(24.0f), 24.0f, 24.0f, 0, 0, false, OAuthErrorCodes.ERR_OAUTH_INVALID_CONSUMER, (DefaultConstructorMarker) null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = r0;
        Color.Companion companion = Color.Companion;
        SolidColor solidColor2 = new SolidColor(companion.m35697getBlack0d7_KjU(), (DefaultConstructorMarker) null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int r22 = companion2.m36054getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int r23 = companion3.m36064getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(21.0f, 12.0f);
        pathBuilder.verticalLineToRelative(-2.0f);
        pathBuilder.horizontalLineToRelative(-9.0f);
        pathBuilder.lineToRelative(1.34f, -5.34f);
        pathBuilder.lineTo(9.0f, 9.0f);
        pathBuilder.verticalLineToRelative(10.0f);
        pathBuilder.horizontalLineToRelative(9.0f);
        pathBuilder.close();
        ImageVector.Builder.m36375addPathoIyEayM$default(builder2, pathBuilder.getNodes(), defaultFillType, "", solidColor, 0.3f, (Brush) null, 0.3f, 1.0f, r22, r23, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor3 = r3;
        SolidColor solidColor4 = new SolidColor(companion.m35697getBlack0d7_KjU(), (DefaultConstructorMarker) null);
        int r39 = companion2.m36054getButtKaPHkGw();
        int r40 = companion3.m36064getBevelLxFBmk8();
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder2.moveTo(9.0f, 21.0f);
        pathBuilder2.horizontalLineToRelative(9.0f);
        PathBuilder pathBuilder3 = pathBuilder2;
        pathBuilder3.curveToRelative(0.83f, 0.0f, 1.54f, -0.5f, 1.84f, -1.22f);
        pathBuilder2.lineToRelative(3.02f, -7.05f);
        pathBuilder3.curveToRelative(0.09f, -0.23f, 0.14f, -0.47f, 0.14f, -0.73f);
        pathBuilder2.verticalLineToRelative(-2.0f);
        pathBuilder3.curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
        pathBuilder2.horizontalLineToRelative(-6.31f);
        pathBuilder2.lineToRelative(0.95f, -4.57f);
        pathBuilder2.lineToRelative(0.03f, -0.32f);
        pathBuilder3.curveToRelative(0.0f, -0.41f, -0.17f, -0.79f, -0.44f, -1.06f);
        pathBuilder2.lineTo(14.17f, 1.0f);
        pathBuilder2.lineTo(7.58f, 7.59f);
        pathBuilder3.curveTo(7.22f, 7.95f, 7.0f, 8.45f, 7.0f, 9.0f);
        pathBuilder2.verticalLineToRelative(10.0f);
        pathBuilder3.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(9.0f, 9.0f);
        pathBuilder2.lineToRelative(4.34f, -4.34f);
        pathBuilder2.lineTo(12.0f, 10.0f);
        pathBuilder2.horizontalLineToRelative(9.0f);
        pathBuilder2.verticalLineToRelative(2.0f);
        pathBuilder2.lineToRelative(-3.0f, 7.0f);
        pathBuilder2.horizontalLineTo(9.0f);
        pathBuilder2.verticalLineTo(9.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(1.0f, 9.0f);
        pathBuilder2.horizontalLineToRelative(4.0f);
        pathBuilder2.verticalLineToRelative(12.0f);
        pathBuilder2.horizontalLineTo(1.0f);
        pathBuilder2.close();
        ImageVector build = ImageVector.Builder.m36375addPathoIyEayM$default(builder, pathBuilder2.getNodes(), defaultFillType2, "", solidColor3, 1.0f, (Brush) null, 1.0f, 1.0f, r39, r40, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null).build();
        _thumbUp = build;
        C12775o.m28636f(build);
        return build;
    }
}
