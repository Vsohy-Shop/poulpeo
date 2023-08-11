package androidx.compose.material.icons.sharp;

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

@SourceDebugExtension({"SMAP\nSettings.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Settings.kt\nandroidx/compose/material/icons/sharp/SettingsKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,86:1\n122#2:87\n116#2,3:88\n119#2,3:92\n132#2,18:95\n152#2:132\n175#3:91\n694#4,2:113\n706#4,2:115\n708#4,11:121\n53#5,4:117\n*S KotlinDebug\n*F\n+ 1 Settings.kt\nandroidx/compose/material/icons/sharp/SettingsKt\n*L\n29#1:87\n29#1:88,3\n29#1:92,3\n30#1:95,18\n30#1:132\n29#1:91\n30#1:113,2\n30#1:115,2\n30#1:121,11\n30#1:117,4\n*E\n"})
/* compiled from: Settings.kt */
public final class SettingsKt {
    private static ImageVector _settings;

    public static final ImageVector getSettings(Icons.Sharp sharp) {
        C12775o.m28639i(sharp, "<this>");
        ImageVector imageVector = _settings;
        if (imageVector != null) {
            C12775o.m28636f(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = r1;
        ImageVector.Builder builder2 = new ImageVector.Builder("Sharp.Settings", C1232Dp.m38468constructorimpl(24.0f), C1232Dp.m38468constructorimpl(24.0f), 24.0f, 24.0f, 0, 0, false, OAuthErrorCodes.ERR_OAUTH_INVALID_CONSUMER, (DefaultConstructorMarker) null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = r0;
        SolidColor solidColor2 = new SolidColor(Color.Companion.m35697getBlack0d7_KjU(), (DefaultConstructorMarker) null);
        int r22 = StrokeCap.Companion.m36054getButtKaPHkGw();
        int r23 = StrokeJoin.Companion.m36064getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(19.44f, 12.99f);
        pathBuilder.lineToRelative(-0.01f, 0.02f);
        PathBuilder pathBuilder2 = pathBuilder;
        pathBuilder2.curveToRelative(0.04f, -0.33f, 0.08f, -0.67f, 0.08f, -1.01f);
        pathBuilder2.curveToRelative(0.0f, -0.34f, -0.03f, -0.66f, -0.07f, -0.99f);
        pathBuilder.lineToRelative(0.01f, 0.02f);
        pathBuilder.lineToRelative(2.44f, -1.92f);
        pathBuilder.lineToRelative(-2.43f, -4.22f);
        pathBuilder.lineToRelative(-2.87f, 1.16f);
        pathBuilder.lineToRelative(0.01f, 0.01f);
        pathBuilder.curveToRelative(-0.52f, -0.4f, -1.09f, -0.74f, -1.71f, -1.0f);
        pathBuilder.horizontalLineToRelative(0.01f);
        pathBuilder.lineTo(14.44f, 2.0f);
        pathBuilder.horizontalLineTo(9.57f);
        pathBuilder.lineToRelative(-0.44f, 3.07f);
        pathBuilder.horizontalLineToRelative(0.01f);
        pathBuilder.curveToRelative(-0.62f, 0.26f, -1.19f, 0.6f, -1.71f, 1.0f);
        pathBuilder.lineToRelative(0.01f, -0.01f);
        pathBuilder.lineToRelative(-2.88f, -1.17f);
        pathBuilder.lineToRelative(-2.44f, 4.22f);
        pathBuilder.lineToRelative(2.44f, 1.92f);
        pathBuilder.lineToRelative(0.01f, -0.02f);
        PathBuilder pathBuilder3 = pathBuilder;
        pathBuilder3.curveToRelative(-0.04f, 0.33f, -0.07f, 0.65f, -0.07f, 0.99f);
        pathBuilder3.curveToRelative(0.0f, 0.34f, 0.03f, 0.68f, 0.08f, 1.01f);
        pathBuilder.lineToRelative(-0.01f, -0.02f);
        pathBuilder.lineToRelative(-2.1f, 1.65f);
        pathBuilder.lineToRelative(-0.33f, 0.26f);
        pathBuilder.lineToRelative(2.43f, 4.2f);
        pathBuilder.lineToRelative(2.88f, -1.15f);
        pathBuilder.lineToRelative(-0.02f, -0.04f);
        pathBuilder.curveToRelative(0.53f, 0.41f, 1.1f, 0.75f, 1.73f, 1.01f);
        pathBuilder.horizontalLineToRelative(-0.03f);
        pathBuilder.lineTo(9.58f, 22.0f);
        pathBuilder.horizontalLineToRelative(4.85f);
        pathBuilder.reflectiveCurveToRelative(0.03f, -0.18f, 0.06f, -0.42f);
        pathBuilder.lineToRelative(0.38f, -2.65f);
        pathBuilder.horizontalLineToRelative(-0.01f);
        pathBuilder.curveToRelative(0.62f, -0.26f, 1.2f, -0.6f, 1.73f, -1.01f);
        pathBuilder.lineToRelative(-0.02f, 0.04f);
        pathBuilder.lineToRelative(2.88f, 1.15f);
        pathBuilder.lineToRelative(2.43f, -4.2f);
        pathBuilder.reflectiveCurveToRelative(-0.14f, -0.12f, -0.33f, -0.26f);
        pathBuilder.lineToRelative(-2.11f, -1.66f);
        pathBuilder.close();
        pathBuilder.moveTo(12.0f, 15.5f);
        pathBuilder.curveToRelative(-1.93f, 0.0f, -3.5f, -1.57f, -3.5f, -3.5f);
        pathBuilder.reflectiveCurveToRelative(1.57f, -3.5f, 3.5f, -3.5f);
        pathBuilder.reflectiveCurveToRelative(3.5f, 1.57f, 3.5f, 3.5f);
        pathBuilder.reflectiveCurveToRelative(-1.57f, 3.5f, -3.5f, 3.5f);
        pathBuilder.close();
        ImageVector build = ImageVector.Builder.m36375addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, (Brush) null, 1.0f, 1.0f, r22, r23, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null).build();
        _settings = build;
        C12775o.m28636f(build);
        return build;
    }
}
