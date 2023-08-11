package androidx.compose.p002ui.graphics.vector.compat;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.util.TypedValue;
import androidx.compose.p002ui.graphics.BlendMode;
import androidx.compose.p002ui.graphics.Brush;
import androidx.compose.p002ui.graphics.BrushKt;
import androidx.compose.p002ui.graphics.Color;
import androidx.compose.p002ui.graphics.ColorKt;
import androidx.compose.p002ui.graphics.PathFillType;
import androidx.compose.p002ui.graphics.SolidColor;
import androidx.compose.p002ui.graphics.StrokeCap;
import androidx.compose.p002ui.graphics.StrokeJoin;
import androidx.compose.p002ui.graphics.vector.ImageVector;
import androidx.compose.p002ui.graphics.vector.PathNode;
import androidx.compose.p002ui.graphics.vector.VectorKt;
import androidx.compose.p002ui.unit.C1232Dp;
import androidx.constraintlayout.motion.widget.Key;
import androidx.core.content.res.ComplexColorCompat;
import androidx.core.content.res.TypedArrayUtils;
import java.util.List;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

@SourceDebugExtension({"SMAP\nXmlVectorParser.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 XmlVectorParser.android.kt\nandroidx/compose/ui/graphics/vector/compat/XmlVectorParser_androidKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,726:1\n174#2:727\n174#2:728\n*S KotlinDebug\n*F\n+ 1 XmlVectorParser.android.kt\nandroidx/compose/ui/graphics/vector/compat/XmlVectorParser_androidKt\n*L\n239#1:727\n240#1:728\n*E\n"})
/* renamed from: androidx.compose.ui.graphics.vector.compat.XmlVectorParser_androidKt */
/* compiled from: XmlVectorParser.android.kt */
public final class XmlVectorParser_androidKt {
    private static final int FILL_TYPE_WINDING = 0;
    private static final int LINECAP_BUTT = 0;
    private static final int LINECAP_ROUND = 1;
    private static final int LINECAP_SQUARE = 2;
    private static final int LINEJOIN_BEVEL = 2;
    private static final int LINEJOIN_MITER = 0;
    private static final int LINEJOIN_ROUND = 1;
    private static final String SHAPE_CLIP_PATH = "clip-path";
    private static final String SHAPE_GROUP = "group";
    private static final String SHAPE_PATH = "path";

    public static final ImageVector.Builder createVectorImageBuilder(AndroidVectorParser androidVectorParser, Resources resources, Resources.Theme theme, AttributeSet attributeSet) {
        long j;
        int i;
        AndroidVectorParser androidVectorParser2 = androidVectorParser;
        Resources resources2 = resources;
        Resources.Theme theme2 = theme;
        AttributeSet attributeSet2 = attributeSet;
        C12775o.m28639i(androidVectorParser2, "<this>");
        C12775o.m28639i(resources2, "res");
        C12775o.m28639i(attributeSet2, "attrs");
        AndroidVectorResources androidVectorResources = AndroidVectorResources.INSTANCE;
        TypedArray obtainAttributes = androidVectorParser2.obtainAttributes(resources2, theme2, attributeSet2, androidVectorResources.getSTYLEABLE_VECTOR_DRAWABLE_TYPE_ARRAY());
        boolean namedBoolean = androidVectorParser2.getNamedBoolean(obtainAttributes, "autoMirrored", androidVectorResources.getSTYLEABLE_VECTOR_DRAWABLE_AUTO_MIRRORED(), false);
        float namedFloat = androidVectorParser2.getNamedFloat(obtainAttributes, "viewportWidth", androidVectorResources.getSTYLEABLE_VECTOR_DRAWABLE_VIEWPORT_WIDTH(), 0.0f);
        float namedFloat2 = androidVectorParser2.getNamedFloat(obtainAttributes, "viewportHeight", androidVectorResources.getSTYLEABLE_VECTOR_DRAWABLE_VIEWPORT_HEIGHT(), 0.0f);
        if (namedFloat <= 0.0f) {
            throw new XmlPullParserException(obtainAttributes.getPositionDescription() + "<VectorGraphic> tag requires viewportWidth > 0");
        } else if (namedFloat2 > 0.0f) {
            float dimension = androidVectorParser2.getDimension(obtainAttributes, androidVectorResources.getSTYLEABLE_VECTOR_DRAWABLE_WIDTH(), 0.0f);
            float dimension2 = androidVectorParser2.getDimension(obtainAttributes, androidVectorResources.getSTYLEABLE_VECTOR_DRAWABLE_HEIGHT(), 0.0f);
            if (obtainAttributes.hasValue(androidVectorResources.getSTYLEABLE_VECTOR_DRAWABLE_TINT())) {
                TypedValue typedValue = new TypedValue();
                obtainAttributes.getValue(androidVectorResources.getSTYLEABLE_VECTOR_DRAWABLE_TINT(), typedValue);
                if (typedValue.type == 2) {
                    j = Color.Companion.m35707getUnspecified0d7_KjU();
                } else {
                    ColorStateList namedColorStateList = androidVectorParser2.getNamedColorStateList(obtainAttributes, theme2, "tint", androidVectorResources.getSTYLEABLE_VECTOR_DRAWABLE_TINT());
                    if (namedColorStateList != null) {
                        j = ColorKt.Color(namedColorStateList.getDefaultColor());
                    } else {
                        j = Color.Companion.m35707getUnspecified0d7_KjU();
                    }
                }
            } else {
                j = Color.Companion.m35707getUnspecified0d7_KjU();
            }
            long j2 = j;
            int i2 = androidVectorParser2.getInt(obtainAttributes, androidVectorResources.getSTYLEABLE_VECTOR_DRAWABLE_TINT_MODE(), -1);
            if (i2 == -1) {
                i = BlendMode.Companion.m35602getSrcIn0nO6VwU();
            } else if (i2 == 3) {
                i = BlendMode.Companion.m35604getSrcOver0nO6VwU();
            } else if (i2 == 5) {
                i = BlendMode.Companion.m35602getSrcIn0nO6VwU();
            } else if (i2 != 9) {
                switch (i2) {
                    case 14:
                        i = BlendMode.Companion.m35593getModulate0nO6VwU();
                        break;
                    case 15:
                        i = BlendMode.Companion.m35598getScreen0nO6VwU();
                        break;
                    case 16:
                        i = BlendMode.Companion.m35596getPlus0nO6VwU();
                        break;
                    default:
                        i = BlendMode.Companion.m35602getSrcIn0nO6VwU();
                        break;
                }
            } else {
                i = BlendMode.Companion.m35601getSrcAtop0nO6VwU();
            }
            int i3 = i;
            float r10 = C1232Dp.m38468constructorimpl(dimension / resources.getDisplayMetrics().density);
            float r11 = C1232Dp.m38468constructorimpl(dimension2 / resources.getDisplayMetrics().density);
            obtainAttributes.recycle();
            return new ImageVector.Builder((String) null, r10, r11, namedFloat, namedFloat2, j2, i3, namedBoolean, 1, (DefaultConstructorMarker) null);
        } else {
            throw new XmlPullParserException(obtainAttributes.getPositionDescription() + "<VectorGraphic> tag requires viewportHeight > 0");
        }
    }

    /* renamed from: getStrokeLineCap-CSYIeUk  reason: not valid java name */
    private static final int m36397getStrokeLineCapCSYIeUk(int i, int i2) {
        if (i == 0) {
            return StrokeCap.Companion.m36054getButtKaPHkGw();
        }
        if (i == 1) {
            return StrokeCap.Companion.m36055getRoundKaPHkGw();
        }
        if (i != 2) {
            return i2;
        }
        return StrokeCap.Companion.m36056getSquareKaPHkGw();
    }

    /* renamed from: getStrokeLineCap-CSYIeUk$default  reason: not valid java name */
    static /* synthetic */ int m36398getStrokeLineCapCSYIeUk$default(int i, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i2 = StrokeCap.Companion.m36054getButtKaPHkGw();
        }
        return m36397getStrokeLineCapCSYIeUk(i, i2);
    }

    /* renamed from: getStrokeLineJoin-kLtJ_vA  reason: not valid java name */
    private static final int m36399getStrokeLineJoinkLtJ_vA(int i, int i2) {
        if (i == 0) {
            return StrokeJoin.Companion.m36065getMiterLxFBmk8();
        }
        if (i == 1) {
            return StrokeJoin.Companion.m36066getRoundLxFBmk8();
        }
        if (i != 2) {
            return i2;
        }
        return StrokeJoin.Companion.m36064getBevelLxFBmk8();
    }

    /* renamed from: getStrokeLineJoin-kLtJ_vA$default  reason: not valid java name */
    static /* synthetic */ int m36400getStrokeLineJoinkLtJ_vA$default(int i, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i2 = StrokeJoin.Companion.m36065getMiterLxFBmk8();
        }
        return m36399getStrokeLineJoinkLtJ_vA(i, i2);
    }

    public static final boolean isAtEnd(XmlPullParser xmlPullParser) {
        C12775o.m28639i(xmlPullParser, "<this>");
        if (xmlPullParser.getEventType() == 1) {
            return true;
        }
        if (xmlPullParser.getDepth() >= 1 || xmlPullParser.getEventType() != 3) {
            return false;
        }
        return true;
    }

    private static final Brush obtainBrushFromComplexColor(ComplexColorCompat complexColorCompat) {
        if (!complexColorCompat.willDraw()) {
            return null;
        }
        Shader shader = complexColorCompat.getShader();
        if (shader != null) {
            return BrushKt.ShaderBrush(shader);
        }
        return new SolidColor(ColorKt.Color(complexColorCompat.getColor()), (DefaultConstructorMarker) null);
    }

    public static final void parseClipPath(AndroidVectorParser androidVectorParser, Resources resources, Resources.Theme theme, AttributeSet attributeSet, ImageVector.Builder builder) {
        AndroidVectorParser androidVectorParser2 = androidVectorParser;
        Resources resources2 = resources;
        AttributeSet attributeSet2 = attributeSet;
        C12775o.m28639i(androidVectorParser2, "<this>");
        C12775o.m28639i(resources2, "res");
        C12775o.m28639i(attributeSet2, "attrs");
        C12775o.m28639i(builder, "builder");
        AndroidVectorResources androidVectorResources = AndroidVectorResources.INSTANCE;
        TypedArray obtainAttributes = androidVectorParser2.obtainAttributes(resources2, theme, attributeSet2, androidVectorResources.getSTYLEABLE_VECTOR_DRAWABLE_CLIP_PATH());
        String string = androidVectorParser2.getString(obtainAttributes, androidVectorResources.getSTYLEABLE_VECTOR_DRAWABLE_CLIP_PATH_NAME());
        if (string == null) {
            string = "";
        }
        List<PathNode> addPathNodes = VectorKt.addPathNodes(androidVectorParser2.getString(obtainAttributes, androidVectorResources.getSTYLEABLE_VECTOR_DRAWABLE_CLIP_PATH_PATH_DATA()));
        obtainAttributes.recycle();
        ImageVector.Builder.addGroup$default(builder, string, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, addPathNodes, 254, (Object) null);
    }

    public static final int parseCurrentVectorNode(AndroidVectorParser androidVectorParser, Resources resources, AttributeSet attributeSet, Resources.Theme theme, ImageVector.Builder builder, int i) {
        C12775o.m28639i(androidVectorParser, "<this>");
        C12775o.m28639i(resources, "res");
        C12775o.m28639i(attributeSet, "attrs");
        C12775o.m28639i(builder, "builder");
        int eventType = androidVectorParser.getXmlParser().getEventType();
        if (eventType == 2) {
            String name = androidVectorParser.getXmlParser().getName();
            if (name == null) {
                return i;
            }
            int hashCode = name.hashCode();
            if (hashCode != -1649314686) {
                if (hashCode != 3433509) {
                    if (hashCode != 98629247 || !name.equals(SHAPE_GROUP)) {
                        return i;
                    }
                    parseGroup(androidVectorParser, resources, theme, attributeSet, builder);
                    return i;
                } else if (!name.equals(SHAPE_PATH)) {
                    return i;
                } else {
                    parsePath(androidVectorParser, resources, theme, attributeSet, builder);
                    return i;
                }
            } else if (!name.equals(SHAPE_CLIP_PATH)) {
                return i;
            } else {
                parseClipPath(androidVectorParser, resources, theme, attributeSet, builder);
                return i + 1;
            }
        } else if (eventType != 3 || !C12775o.m28634d(SHAPE_GROUP, androidVectorParser.getXmlParser().getName())) {
            return i;
        } else {
            int i2 = i + 1;
            for (int i3 = 0; i3 < i2; i3++) {
                builder.clearGroup();
            }
            return 0;
        }
    }

    public static /* synthetic */ int parseCurrentVectorNode$default(AndroidVectorParser androidVectorParser, Resources resources, AttributeSet attributeSet, Resources.Theme theme, ImageVector.Builder builder, int i, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            theme = null;
        }
        return parseCurrentVectorNode(androidVectorParser, resources, attributeSet, theme, builder, i);
    }

    public static final void parseGroup(AndroidVectorParser androidVectorParser, Resources resources, Resources.Theme theme, AttributeSet attributeSet, ImageVector.Builder builder) {
        AndroidVectorParser androidVectorParser2 = androidVectorParser;
        Resources resources2 = resources;
        AttributeSet attributeSet2 = attributeSet;
        C12775o.m28639i(androidVectorParser, "<this>");
        C12775o.m28639i(resources, "res");
        C12775o.m28639i(attributeSet2, "attrs");
        C12775o.m28639i(builder, "builder");
        AndroidVectorResources androidVectorResources = AndroidVectorResources.INSTANCE;
        TypedArray obtainAttributes = androidVectorParser.obtainAttributes(resources, theme, attributeSet2, androidVectorResources.getSTYLEABLE_VECTOR_DRAWABLE_GROUP());
        float namedFloat = androidVectorParser.getNamedFloat(obtainAttributes, Key.ROTATION, androidVectorResources.getSTYLEABLE_VECTOR_DRAWABLE_GROUP_ROTATION(), 0.0f);
        float f = androidVectorParser.getFloat(obtainAttributes, androidVectorResources.getSTYLEABLE_VECTOR_DRAWABLE_GROUP_PIVOT_X(), 0.0f);
        float f2 = androidVectorParser.getFloat(obtainAttributes, androidVectorResources.getSTYLEABLE_VECTOR_DRAWABLE_GROUP_PIVOT_Y(), 0.0f);
        float namedFloat2 = androidVectorParser.getNamedFloat(obtainAttributes, "scaleX", androidVectorResources.getSTYLEABLE_VECTOR_DRAWABLE_GROUP_SCALE_X(), 1.0f);
        float namedFloat3 = androidVectorParser.getNamedFloat(obtainAttributes, "scaleY", androidVectorResources.getSTYLEABLE_VECTOR_DRAWABLE_GROUP_SCALE_Y(), 1.0f);
        float namedFloat4 = androidVectorParser.getNamedFloat(obtainAttributes, "translateX", androidVectorResources.getSTYLEABLE_VECTOR_DRAWABLE_GROUP_TRANSLATE_X(), 0.0f);
        float namedFloat5 = androidVectorParser.getNamedFloat(obtainAttributes, "translateY", androidVectorResources.getSTYLEABLE_VECTOR_DRAWABLE_GROUP_TRANSLATE_Y(), 0.0f);
        String string = androidVectorParser.getString(obtainAttributes, androidVectorResources.getSTYLEABLE_VECTOR_DRAWABLE_GROUP_NAME());
        if (string == null) {
            string = "";
        }
        obtainAttributes.recycle();
        builder.addGroup(string, namedFloat, f, f2, namedFloat2, namedFloat3, namedFloat4, namedFloat5, VectorKt.getEmptyPath());
    }

    public static final void parsePath(AndroidVectorParser androidVectorParser, Resources resources, Resources.Theme theme, AttributeSet attributeSet, ImageVector.Builder builder) {
        int i;
        AndroidVectorParser androidVectorParser2 = androidVectorParser;
        Resources resources2 = resources;
        AttributeSet attributeSet2 = attributeSet;
        C12775o.m28639i(androidVectorParser2, "<this>");
        C12775o.m28639i(resources2, "res");
        C12775o.m28639i(attributeSet2, "attrs");
        C12775o.m28639i(builder, "builder");
        AndroidVectorResources androidVectorResources = AndroidVectorResources.INSTANCE;
        TypedArray obtainAttributes = androidVectorParser2.obtainAttributes(resources2, theme, attributeSet2, androidVectorResources.getSTYLEABLE_VECTOR_DRAWABLE_PATH());
        if (TypedArrayUtils.hasAttribute(androidVectorParser.getXmlParser(), "pathData")) {
            String string = androidVectorParser2.getString(obtainAttributes, androidVectorResources.getSTYLEABLE_VECTOR_DRAWABLE_PATH_NAME());
            if (string == null) {
                string = "";
            }
            String str = string;
            List<PathNode> addPathNodes = VectorKt.addPathNodes(androidVectorParser2.getString(obtainAttributes, androidVectorResources.getSTYLEABLE_VECTOR_DRAWABLE_PATH_PATH_DATA()));
            ComplexColorCompat namedComplexColor = androidVectorParser.getNamedComplexColor(obtainAttributes, theme, "fillColor", androidVectorResources.getSTYLEABLE_VECTOR_DRAWABLE_PATH_FILL_COLOR(), 0);
            float namedFloat = androidVectorParser2.getNamedFloat(obtainAttributes, "fillAlpha", androidVectorResources.getSTYLEABLE_VECTOR_DRAWABLE_PATH_FILL_ALPHA(), 1.0f);
            int r16 = m36397getStrokeLineCapCSYIeUk(androidVectorParser2.getNamedInt(obtainAttributes, "strokeLineCap", androidVectorResources.getSTYLEABLE_VECTOR_DRAWABLE_PATH_STROKE_LINE_CAP(), -1), StrokeCap.Companion.m36054getButtKaPHkGw());
            int r17 = m36399getStrokeLineJoinkLtJ_vA(androidVectorParser2.getNamedInt(obtainAttributes, "strokeLineJoin", androidVectorResources.getSTYLEABLE_VECTOR_DRAWABLE_PATH_STROKE_LINE_JOIN(), -1), StrokeJoin.Companion.m36064getBevelLxFBmk8());
            float namedFloat2 = androidVectorParser2.getNamedFloat(obtainAttributes, "strokeMiterLimit", androidVectorResources.getSTYLEABLE_VECTOR_DRAWABLE_PATH_STROKE_MITER_LIMIT(), 1.0f);
            ComplexColorCompat namedComplexColor2 = androidVectorParser.getNamedComplexColor(obtainAttributes, theme, "strokeColor", androidVectorResources.getSTYLEABLE_VECTOR_DRAWABLE_PATH_STROKE_COLOR(), 0);
            float namedFloat3 = androidVectorParser2.getNamedFloat(obtainAttributes, "strokeAlpha", androidVectorResources.getSTYLEABLE_VECTOR_DRAWABLE_PATH_STROKE_ALPHA(), 1.0f);
            float namedFloat4 = androidVectorParser2.getNamedFloat(obtainAttributes, "strokeWidth", androidVectorResources.getSTYLEABLE_VECTOR_DRAWABLE_PATH_STROKE_WIDTH(), 1.0f);
            float namedFloat5 = androidVectorParser2.getNamedFloat(obtainAttributes, "trimPathEnd", androidVectorResources.getSTYLEABLE_VECTOR_DRAWABLE_PATH_TRIM_PATH_END(), 1.0f);
            float namedFloat6 = androidVectorParser2.getNamedFloat(obtainAttributes, "trimPathOffset", androidVectorResources.getSTYLEABLE_VECTOR_DRAWABLE_PATH_TRIM_PATH_OFFSET(), 0.0f);
            float namedFloat7 = androidVectorParser2.getNamedFloat(obtainAttributes, "trimPathStart", androidVectorResources.getSTYLEABLE_VECTOR_DRAWABLE_PATH_TRIM_PATH_START(), 0.0f);
            int namedInt = androidVectorParser2.getNamedInt(obtainAttributes, "fillType", androidVectorResources.getSTYLEABLE_VECTOR_DRAWABLE_PATH_TRIM_PATH_FILLTYPE(), FILL_TYPE_WINDING);
            obtainAttributes.recycle();
            Brush obtainBrushFromComplexColor = obtainBrushFromComplexColor(namedComplexColor);
            Brush obtainBrushFromComplexColor2 = obtainBrushFromComplexColor(namedComplexColor2);
            PathFillType.Companion companion = PathFillType.Companion;
            if (namedInt == 0) {
                i = companion.m35965getNonZeroRgk1Os();
            } else {
                i = companion.m35964getEvenOddRgk1Os();
            }
            builder.m36376addPathoIyEayM(addPathNodes, i, str, obtainBrushFromComplexColor, namedFloat, obtainBrushFromComplexColor2, namedFloat3, namedFloat4, r16, r17, namedFloat2, namedFloat7, namedFloat5, namedFloat6);
            return;
        }
        throw new IllegalArgumentException("No path data available");
    }

    public static final XmlPullParser seekToStartTag(XmlPullParser xmlPullParser) {
        C12775o.m28639i(xmlPullParser, "<this>");
        int next = xmlPullParser.next();
        while (next != 2 && next != 1) {
            next = xmlPullParser.next();
        }
        if (next == 2) {
            return xmlPullParser;
        }
        throw new XmlPullParserException("No start tag found");
    }
}
