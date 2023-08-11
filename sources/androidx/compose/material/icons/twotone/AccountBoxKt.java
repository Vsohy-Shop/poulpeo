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

@SourceDebugExtension({"SMAP\nAccountBox.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AccountBox.kt\nandroidx/compose/material/icons/twotone/AccountBoxKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,90:1\n122#2:91\n116#2,3:92\n119#2,3:96\n132#2,18:99\n152#2:136\n132#2,18:137\n152#2:174\n132#2,18:175\n152#2:212\n175#3:95\n694#4,2:117\n706#4,2:119\n708#4,11:125\n694#4,2:155\n706#4,2:157\n708#4,11:163\n694#4,2:193\n706#4,2:195\n708#4,11:201\n53#5,4:121\n53#5,4:159\n53#5,4:197\n*S KotlinDebug\n*F\n+ 1 AccountBox.kt\nandroidx/compose/material/icons/twotone/AccountBoxKt\n*L\n29#1:91\n29#1:92,3\n29#1:96,3\n30#1:99,18\n30#1:136\n45#1:137,18\n45#1:174\n71#1:175,18\n71#1:212\n29#1:95\n30#1:117,2\n30#1:119,2\n30#1:125,11\n45#1:155,2\n45#1:157,2\n45#1:163,11\n71#1:193,2\n71#1:195,2\n71#1:201,11\n30#1:121,4\n45#1:159,4\n71#1:197,4\n*E\n"})
/* compiled from: AccountBox.kt */
public final class AccountBoxKt {
    private static ImageVector _accountBox;

    public static final ImageVector getAccountBox(Icons.TwoTone twoTone) {
        C12775o.m28639i(twoTone, "<this>");
        ImageVector imageVector = _accountBox;
        if (imageVector != null) {
            C12775o.m28636f(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = r1;
        ImageVector.Builder builder2 = r1;
        ImageVector.Builder builder3 = r1;
        ImageVector.Builder builder4 = new ImageVector.Builder("TwoTone.AccountBox", C1232Dp.m38468constructorimpl(24.0f), C1232Dp.m38468constructorimpl(24.0f), 24.0f, 24.0f, 0, 0, false, OAuthErrorCodes.ERR_OAUTH_INVALID_CONSUMER, (DefaultConstructorMarker) null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = r0;
        Color.Companion companion = Color.Companion;
        SolidColor solidColor2 = new SolidColor(companion.m35697getBlack0d7_KjU(), (DefaultConstructorMarker) null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int r22 = companion2.m36054getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int r23 = companion3.m36064getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(5.0f, 17.86f);
        pathBuilder.curveTo(6.8f, 16.09f, 9.27f, 15.0f, 12.0f, 15.0f);
        pathBuilder.reflectiveCurveToRelative(5.2f, 1.09f, 7.0f, 2.86f);
        pathBuilder.verticalLineTo(5.0f);
        pathBuilder.horizontalLineTo(5.0f);
        pathBuilder.verticalLineTo(17.86f);
        pathBuilder.close();
        pathBuilder.moveTo(12.0f, 6.0f);
        PathBuilder pathBuilder2 = pathBuilder;
        pathBuilder2.curveToRelative(1.93f, 0.0f, 3.5f, 1.57f, 3.5f, 3.5f);
        pathBuilder.reflectiveCurveTo(13.93f, 13.0f, 12.0f, 13.0f);
        pathBuilder2.curveToRelative(-1.93f, 0.0f, -3.5f, -1.57f, -3.5f, -3.5f);
        pathBuilder.reflectiveCurveTo(10.07f, 6.0f, 12.0f, 6.0f);
        pathBuilder.close();
        ImageVector.Builder.m36375addPathoIyEayM$default(builder3, pathBuilder.getNodes(), defaultFillType, "", solidColor, 0.3f, (Brush) null, 0.3f, 1.0f, r22, r23, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor3 = r3;
        SolidColor solidColor4 = new SolidColor(companion.m35697getBlack0d7_KjU(), (DefaultConstructorMarker) null);
        int r39 = companion2.m36054getButtKaPHkGw();
        int r40 = companion3.m36064getBevelLxFBmk8();
        PathBuilder pathBuilder3 = new PathBuilder();
        pathBuilder3.moveTo(19.0f, 3.0f);
        pathBuilder3.horizontalLineTo(5.0f);
        PathBuilder pathBuilder4 = pathBuilder3;
        pathBuilder4.curveTo(3.9f, 3.0f, 3.0f, 3.9f, 3.0f, 5.0f);
        pathBuilder3.verticalLineToRelative(14.0f);
        pathBuilder4.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        pathBuilder3.horizontalLineToRelative(14.0f);
        pathBuilder4.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        pathBuilder3.verticalLineTo(5.0f);
        pathBuilder4.curveTo(21.0f, 3.9f, 20.1f, 3.0f, 19.0f, 3.0f);
        pathBuilder3.close();
        pathBuilder3.moveTo(17.0f, 19.0f);
        pathBuilder3.horizontalLineTo(7.0f);
        pathBuilder3.verticalLineToRelative(-0.24f);
        pathBuilder4.curveTo(8.42f, 17.62f, 10.16f, 17.0f, 12.0f, 17.0f);
        pathBuilder3.reflectiveCurveToRelative(3.58f, 0.62f, 5.0f, 1.76f);
        pathBuilder3.verticalLineTo(19.0f);
        pathBuilder3.close();
        pathBuilder3.moveTo(19.0f, 17.86f);
        pathBuilder3.curveTo(17.2f, 16.09f, 14.73f, 15.0f, 12.0f, 15.0f);
        pathBuilder3.reflectiveCurveToRelative(-5.2f, 1.09f, -7.0f, 2.86f);
        pathBuilder3.verticalLineTo(5.0f);
        pathBuilder3.horizontalLineToRelative(14.0f);
        pathBuilder3.verticalLineTo(17.86f);
        pathBuilder3.close();
        ImageVector.Builder.m36375addPathoIyEayM$default(builder2, pathBuilder3.getNodes(), defaultFillType2, "", solidColor3, 1.0f, (Brush) null, 1.0f, 1.0f, r39, r40, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null);
        int defaultFillType3 = VectorKt.getDefaultFillType();
        SolidColor solidColor5 = r3;
        SolidColor solidColor6 = new SolidColor(companion.m35697getBlack0d7_KjU(), (DefaultConstructorMarker) null);
        int r56 = companion2.m36054getButtKaPHkGw();
        int r57 = companion3.m36064getBevelLxFBmk8();
        PathBuilder pathBuilder5 = new PathBuilder();
        pathBuilder5.moveTo(12.0f, 13.0f);
        PathBuilder pathBuilder6 = pathBuilder5;
        pathBuilder6.curveToRelative(1.93f, 0.0f, 3.5f, -1.57f, 3.5f, -3.5f);
        pathBuilder5.reflectiveCurveTo(13.93f, 6.0f, 12.0f, 6.0f);
        pathBuilder6.curveToRelative(-1.93f, 0.0f, -3.5f, 1.57f, -3.5f, 3.5f);
        pathBuilder5.reflectiveCurveTo(10.07f, 13.0f, 12.0f, 13.0f);
        pathBuilder5.close();
        pathBuilder5.moveTo(12.0f, 8.0f);
        pathBuilder6.curveToRelative(0.83f, 0.0f, 1.5f, 0.67f, 1.5f, 1.5f);
        pathBuilder5.reflectiveCurveTo(12.83f, 11.0f, 12.0f, 11.0f);
        pathBuilder5.reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f);
        pathBuilder5.reflectiveCurveTo(11.17f, 8.0f, 12.0f, 8.0f);
        pathBuilder5.close();
        ImageVector build = ImageVector.Builder.m36375addPathoIyEayM$default(builder, pathBuilder5.getNodes(), defaultFillType3, "", solidColor5, 1.0f, (Brush) null, 1.0f, 1.0f, r56, r57, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null).build();
        _accountBox = build;
        C12775o.m28636f(build);
        return build;
    }
}
