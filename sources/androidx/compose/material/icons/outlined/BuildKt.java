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

@SourceDebugExtension({"SMAP\nBuild.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Build.kt\nandroidx/compose/material/icons/outlined/BuildKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,65:1\n122#2:66\n116#2,3:67\n119#2,3:71\n132#2,18:74\n152#2:111\n175#3:70\n694#4,2:92\n706#4,2:94\n708#4,11:100\n53#5,4:96\n*S KotlinDebug\n*F\n+ 1 Build.kt\nandroidx/compose/material/icons/outlined/BuildKt\n*L\n29#1:66\n29#1:67,3\n29#1:71,3\n30#1:74,18\n30#1:111\n29#1:70\n30#1:92,2\n30#1:94,2\n30#1:100,11\n30#1:96,4\n*E\n"})
/* compiled from: Build.kt */
public final class BuildKt {
    private static ImageVector _build;

    public static final ImageVector getBuild(Icons.Outlined outlined) {
        C12775o.m28639i(outlined, "<this>");
        ImageVector imageVector = _build;
        if (imageVector != null) {
            C12775o.m28636f(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = r1;
        ImageVector.Builder builder2 = new ImageVector.Builder("Outlined.Build", C1232Dp.m38468constructorimpl(24.0f), C1232Dp.m38468constructorimpl(24.0f), 24.0f, 24.0f, 0, 0, false, OAuthErrorCodes.ERR_OAUTH_INVALID_CONSUMER, (DefaultConstructorMarker) null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = r0;
        SolidColor solidColor2 = new SolidColor(Color.Companion.m35697getBlack0d7_KjU(), (DefaultConstructorMarker) null);
        int r22 = StrokeCap.Companion.m36054getButtKaPHkGw();
        int r23 = StrokeJoin.Companion.m36064getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(22.61f, 18.99f);
        pathBuilder.lineToRelative(-9.08f, -9.08f);
        PathBuilder pathBuilder2 = pathBuilder;
        pathBuilder2.curveToRelative(0.93f, -2.34f, 0.45f, -5.1f, -1.44f, -7.0f);
        pathBuilder2.curveTo(9.79f, 0.61f, 6.21f, 0.4f, 3.66f, 2.26f);
        pathBuilder.lineTo(7.5f, 6.11f);
        pathBuilder.lineTo(6.08f, 7.52f);
        pathBuilder.lineTo(2.25f, 3.69f);
        PathBuilder pathBuilder3 = pathBuilder;
        pathBuilder3.curveTo(0.39f, 6.23f, 0.6f, 9.82f, 2.9f, 12.11f);
        pathBuilder3.curveToRelative(1.86f, 1.86f, 4.57f, 2.35f, 6.89f, 1.48f);
        pathBuilder.lineToRelative(9.11f, 9.11f);
        pathBuilder.curveToRelative(0.39f, 0.39f, 1.02f, 0.39f, 1.41f, 0.0f);
        pathBuilder.lineToRelative(2.3f, -2.3f);
        pathBuilder.curveToRelative(0.4f, -0.38f, 0.4f, -1.01f, 0.0f, -1.41f);
        pathBuilder.close();
        pathBuilder.moveTo(19.61f, 20.59f);
        pathBuilder.lineToRelative(-9.46f, -9.46f);
        PathBuilder pathBuilder4 = pathBuilder;
        pathBuilder4.curveToRelative(-0.61f, 0.45f, -1.29f, 0.72f, -2.0f, 0.82f);
        pathBuilder4.curveToRelative(-1.36f, 0.2f, -2.79f, -0.21f, -3.83f, -1.25f);
        pathBuilder4.curveTo(3.37f, 9.76f, 2.93f, 8.5f, 3.0f, 7.26f);
        pathBuilder.lineToRelative(3.09f, 3.09f);
        pathBuilder.lineToRelative(4.24f, -4.24f);
        pathBuilder.lineToRelative(-3.09f, -3.09f);
        PathBuilder pathBuilder5 = pathBuilder;
        pathBuilder5.curveToRelative(1.24f, -0.07f, 2.49f, 0.37f, 3.44f, 1.31f);
        pathBuilder5.curveToRelative(1.08f, 1.08f, 1.49f, 2.57f, 1.24f, 3.96f);
        pathBuilder5.curveToRelative(-0.12f, 0.71f, -0.42f, 1.37f, -0.88f, 1.96f);
        pathBuilder.lineToRelative(9.45f, 9.45f);
        pathBuilder.lineToRelative(-0.88f, 0.89f);
        pathBuilder.close();
        ImageVector build = ImageVector.Builder.m36375addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, (Brush) null, 1.0f, 1.0f, r22, r23, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null).build();
        _build = build;
        C12775o.m28636f(build);
        return build;
    }
}
