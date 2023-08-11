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

@SourceDebugExtension({"SMAP\nEmail.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Email.kt\nandroidx/compose/material/icons/twotone/EmailKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,71:1\n122#2:72\n116#2,3:73\n119#2,3:77\n132#2,18:80\n152#2:117\n132#2,18:118\n152#2:155\n175#3:76\n694#4,2:98\n706#4,2:100\n708#4,11:106\n694#4,2:136\n706#4,2:138\n708#4,11:144\n53#5,4:102\n53#5,4:140\n*S KotlinDebug\n*F\n+ 1 Email.kt\nandroidx/compose/material/icons/twotone/EmailKt\n*L\n29#1:72\n29#1:73,3\n29#1:77,3\n30#1:80,18\n30#1:117\n42#1:118,18\n42#1:155\n29#1:76\n30#1:98,2\n30#1:100,2\n30#1:106,11\n42#1:136,2\n42#1:138,2\n42#1:144,11\n30#1:102,4\n42#1:140,4\n*E\n"})
/* compiled from: Email.kt */
public final class EmailKt {
    private static ImageVector _email;

    public static final ImageVector getEmail(Icons.TwoTone twoTone) {
        C12775o.m28639i(twoTone, "<this>");
        ImageVector imageVector = _email;
        if (imageVector != null) {
            C12775o.m28636f(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = r1;
        ImageVector.Builder builder2 = r1;
        ImageVector.Builder builder3 = new ImageVector.Builder("TwoTone.Email", C1232Dp.m38468constructorimpl(24.0f), C1232Dp.m38468constructorimpl(24.0f), 24.0f, 24.0f, 0, 0, false, OAuthErrorCodes.ERR_OAUTH_INVALID_CONSUMER, (DefaultConstructorMarker) null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = r0;
        Color.Companion companion = Color.Companion;
        SolidColor solidColor2 = new SolidColor(companion.m35697getBlack0d7_KjU(), (DefaultConstructorMarker) null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int r22 = companion2.m36054getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int r23 = companion3.m36064getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(20.0f, 8.0f);
        pathBuilder.lineToRelative(-8.0f, 5.0f);
        pathBuilder.lineToRelative(-8.0f, -5.0f);
        pathBuilder.verticalLineToRelative(10.0f);
        pathBuilder.horizontalLineToRelative(16.0f);
        pathBuilder.close();
        pathBuilder.moveTo(20.0f, 6.0f);
        pathBuilder.lineTo(4.0f, 6.0f);
        pathBuilder.lineToRelative(8.0f, 4.99f);
        pathBuilder.close();
        ImageVector.Builder.m36375addPathoIyEayM$default(builder2, pathBuilder.getNodes(), defaultFillType, "", solidColor, 0.3f, (Brush) null, 0.3f, 1.0f, r22, r23, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor3 = r3;
        SolidColor solidColor4 = new SolidColor(companion.m35697getBlack0d7_KjU(), (DefaultConstructorMarker) null);
        int r39 = companion2.m36054getButtKaPHkGw();
        int r40 = companion3.m36064getBevelLxFBmk8();
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder2.moveTo(4.0f, 20.0f);
        pathBuilder2.horizontalLineToRelative(16.0f);
        PathBuilder pathBuilder3 = pathBuilder2;
        pathBuilder3.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        pathBuilder2.verticalLineTo(6.0f);
        pathBuilder3.curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
        pathBuilder2.horizontalLineTo(4.0f);
        pathBuilder3.curveToRelative(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f);
        pathBuilder2.verticalLineToRelative(12.0f);
        pathBuilder3.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(20.0f, 6.0f);
        pathBuilder2.lineToRelative(-8.0f, 4.99f);
        pathBuilder2.lineTo(4.0f, 6.0f);
        pathBuilder2.horizontalLineToRelative(16.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(4.0f, 8.0f);
        pathBuilder2.lineToRelative(8.0f, 5.0f);
        pathBuilder2.lineToRelative(8.0f, -5.0f);
        pathBuilder2.verticalLineToRelative(10.0f);
        pathBuilder2.horizontalLineTo(4.0f);
        pathBuilder2.verticalLineTo(8.0f);
        pathBuilder2.close();
        ImageVector build = ImageVector.Builder.m36375addPathoIyEayM$default(builder, pathBuilder2.getNodes(), defaultFillType2, "", solidColor3, 1.0f, (Brush) null, 1.0f, 1.0f, r39, r40, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null).build();
        _email = build;
        C12775o.m28636f(build);
        return build;
    }
}
