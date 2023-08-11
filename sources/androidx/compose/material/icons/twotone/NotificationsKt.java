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

@SourceDebugExtension({"SMAP\nNotifications.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Notifications.kt\nandroidx/compose/material/icons/twotone/NotificationsKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,73:1\n122#2:74\n116#2,3:75\n119#2,3:79\n132#2,18:82\n152#2:119\n132#2,18:120\n152#2:157\n175#3:78\n694#4,2:100\n706#4,2:102\n708#4,11:108\n694#4,2:138\n706#4,2:140\n708#4,11:146\n53#5,4:104\n53#5,4:142\n*S KotlinDebug\n*F\n+ 1 Notifications.kt\nandroidx/compose/material/icons/twotone/NotificationsKt\n*L\n29#1:74\n29#1:75,3\n29#1:79,3\n30#1:82,18\n30#1:119\n39#1:120,18\n39#1:157\n29#1:78\n30#1:100,2\n30#1:102,2\n30#1:108,11\n39#1:138,2\n39#1:140,2\n39#1:146,11\n30#1:104,4\n39#1:142,4\n*E\n"})
/* compiled from: Notifications.kt */
public final class NotificationsKt {
    private static ImageVector _notifications;

    public static final ImageVector getNotifications(Icons.TwoTone twoTone) {
        C12775o.m28639i(twoTone, "<this>");
        ImageVector imageVector = _notifications;
        if (imageVector != null) {
            C12775o.m28636f(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = r1;
        ImageVector.Builder builder2 = r1;
        ImageVector.Builder builder3 = new ImageVector.Builder("TwoTone.Notifications", C1232Dp.m38468constructorimpl(24.0f), C1232Dp.m38468constructorimpl(24.0f), 24.0f, 24.0f, 0, 0, false, OAuthErrorCodes.ERR_OAUTH_INVALID_CONSUMER, (DefaultConstructorMarker) null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = r0;
        Color.Companion companion = Color.Companion;
        SolidColor solidColor2 = new SolidColor(companion.m35697getBlack0d7_KjU(), (DefaultConstructorMarker) null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int r22 = companion2.m36054getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int r23 = companion3.m36064getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(12.0f, 6.5f);
        PathBuilder pathBuilder2 = pathBuilder;
        pathBuilder2.curveToRelative(-2.49f, 0.0f, -4.0f, 2.02f, -4.0f, 4.5f);
        pathBuilder.verticalLineToRelative(6.0f);
        pathBuilder.horizontalLineToRelative(8.0f);
        pathBuilder.verticalLineToRelative(-6.0f);
        pathBuilder2.curveToRelative(0.0f, -2.48f, -1.51f, -4.5f, -4.0f, -4.5f);
        pathBuilder.close();
        ImageVector.Builder.m36375addPathoIyEayM$default(builder2, pathBuilder.getNodes(), defaultFillType, "", solidColor, 0.3f, (Brush) null, 0.3f, 1.0f, r22, r23, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor3 = r3;
        SolidColor solidColor4 = new SolidColor(companion.m35697getBlack0d7_KjU(), (DefaultConstructorMarker) null);
        int r39 = companion2.m36054getButtKaPHkGw();
        int r40 = companion3.m36064getBevelLxFBmk8();
        PathBuilder pathBuilder3 = new PathBuilder();
        pathBuilder3.moveTo(12.0f, 22.0f);
        PathBuilder pathBuilder4 = pathBuilder3;
        pathBuilder4.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        pathBuilder3.horizontalLineToRelative(-4.0f);
        pathBuilder4.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        pathBuilder3.close();
        pathBuilder3.moveTo(18.0f, 16.0f);
        pathBuilder3.verticalLineToRelative(-5.0f);
        pathBuilder4.curveToRelative(0.0f, -3.07f, -1.63f, -5.64f, -4.5f, -6.32f);
        pathBuilder3.lineTo(13.5f, 4.0f);
        pathBuilder4.curveToRelative(0.0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f);
        pathBuilder3.reflectiveCurveToRelative(-1.5f, 0.67f, -1.5f, 1.5f);
        pathBuilder3.verticalLineToRelative(0.68f);
        pathBuilder4.curveTo(7.64f, 5.36f, 6.0f, 7.92f, 6.0f, 11.0f);
        pathBuilder3.verticalLineToRelative(5.0f);
        pathBuilder3.lineToRelative(-2.0f, 2.0f);
        pathBuilder3.verticalLineToRelative(1.0f);
        pathBuilder3.horizontalLineToRelative(16.0f);
        pathBuilder3.verticalLineToRelative(-1.0f);
        pathBuilder3.lineToRelative(-2.0f, -2.0f);
        pathBuilder3.close();
        pathBuilder3.moveTo(16.0f, 17.0f);
        pathBuilder3.lineTo(8.0f, 17.0f);
        pathBuilder3.verticalLineToRelative(-6.0f);
        pathBuilder4.curveToRelative(0.0f, -2.48f, 1.51f, -4.5f, 4.0f, -4.5f);
        pathBuilder3.reflectiveCurveToRelative(4.0f, 2.02f, 4.0f, 4.5f);
        pathBuilder3.verticalLineToRelative(6.0f);
        pathBuilder3.close();
        ImageVector build = ImageVector.Builder.m36375addPathoIyEayM$default(builder, pathBuilder3.getNodes(), defaultFillType2, "", solidColor3, 1.0f, (Brush) null, 1.0f, 1.0f, r39, r40, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null).build();
        _notifications = build;
        C12775o.m28636f(build);
        return build;
    }
}
