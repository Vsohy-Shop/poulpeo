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

@SourceDebugExtension({"SMAP\nDateRange.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DateRange.kt\nandroidx/compose/material/icons/sharp/DateRangeKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,75:1\n122#2:76\n116#2,3:77\n119#2,3:81\n132#2,18:84\n152#2:121\n175#3:80\n694#4,2:102\n706#4,2:104\n708#4,11:110\n53#5,4:106\n*S KotlinDebug\n*F\n+ 1 DateRange.kt\nandroidx/compose/material/icons/sharp/DateRangeKt\n*L\n29#1:76\n29#1:77,3\n29#1:81,3\n30#1:84,18\n30#1:121\n29#1:80\n30#1:102,2\n30#1:104,2\n30#1:110,11\n30#1:106,4\n*E\n"})
/* compiled from: DateRange.kt */
public final class DateRangeKt {
    private static ImageVector _dateRange;

    public static final ImageVector getDateRange(Icons.Sharp sharp) {
        C12775o.m28639i(sharp, "<this>");
        ImageVector imageVector = _dateRange;
        if (imageVector != null) {
            C12775o.m28636f(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = r1;
        ImageVector.Builder builder2 = new ImageVector.Builder("Sharp.DateRange", C1232Dp.m38468constructorimpl(24.0f), C1232Dp.m38468constructorimpl(24.0f), 24.0f, 24.0f, 0, 0, false, OAuthErrorCodes.ERR_OAUTH_INVALID_CONSUMER, (DefaultConstructorMarker) null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = r0;
        SolidColor solidColor2 = new SolidColor(Color.Companion.m35697getBlack0d7_KjU(), (DefaultConstructorMarker) null);
        int r22 = StrokeCap.Companion.m36054getButtKaPHkGw();
        int r23 = StrokeJoin.Companion.m36064getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(9.0f, 11.0f);
        pathBuilder.lineTo(7.0f, 11.0f);
        pathBuilder.verticalLineToRelative(2.0f);
        pathBuilder.horizontalLineToRelative(2.0f);
        pathBuilder.verticalLineToRelative(-2.0f);
        pathBuilder.close();
        pathBuilder.moveTo(13.0f, 11.0f);
        pathBuilder.horizontalLineToRelative(-2.0f);
        pathBuilder.verticalLineToRelative(2.0f);
        pathBuilder.horizontalLineToRelative(2.0f);
        pathBuilder.verticalLineToRelative(-2.0f);
        pathBuilder.close();
        pathBuilder.moveTo(17.0f, 11.0f);
        pathBuilder.horizontalLineToRelative(-2.0f);
        pathBuilder.verticalLineToRelative(2.0f);
        pathBuilder.horizontalLineToRelative(2.0f);
        pathBuilder.verticalLineToRelative(-2.0f);
        pathBuilder.close();
        pathBuilder.moveTo(21.0f, 4.0f);
        pathBuilder.horizontalLineToRelative(-3.0f);
        pathBuilder.lineTo(18.0f, 2.0f);
        pathBuilder.horizontalLineToRelative(-2.0f);
        pathBuilder.verticalLineToRelative(2.0f);
        pathBuilder.lineTo(8.0f, 4.0f);
        pathBuilder.lineTo(8.0f, 2.0f);
        pathBuilder.lineTo(6.0f, 2.0f);
        pathBuilder.verticalLineToRelative(2.0f);
        pathBuilder.lineTo(3.0f, 4.0f);
        pathBuilder.verticalLineToRelative(18.0f);
        pathBuilder.horizontalLineToRelative(18.0f);
        pathBuilder.lineTo(21.0f, 4.0f);
        pathBuilder.close();
        pathBuilder.moveTo(19.0f, 20.0f);
        pathBuilder.lineTo(5.0f, 20.0f);
        pathBuilder.lineTo(5.0f, 9.0f);
        pathBuilder.horizontalLineToRelative(14.0f);
        pathBuilder.verticalLineToRelative(11.0f);
        pathBuilder.close();
        ImageVector build = ImageVector.Builder.m36375addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, (Brush) null, 1.0f, 1.0f, r22, r23, 1.0f, 0.0f, 0.0f, 0.0f, 14336, (Object) null).build();
        _dateRange = build;
        C12775o.m28636f(build);
        return build;
    }
}
