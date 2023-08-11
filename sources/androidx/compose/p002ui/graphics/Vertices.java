package androidx.compose.p002ui.graphics;

import androidx.compose.p002ui.geometry.Offset;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;

@SourceDebugExtension({"SMAP\nVertices.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Vertices.kt\nandroidx/compose/ui/graphics/Vertices\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,75:1\n101#2,2:76\n33#2,6:78\n103#2:84\n*S KotlinDebug\n*F\n+ 1 Vertices.kt\nandroidx/compose/ui/graphics/Vertices\n*L\n42#1:76,2\n42#1:78,6\n42#1:84\n*E\n"})
/* renamed from: androidx.compose.ui.graphics.Vertices */
/* compiled from: Vertices.kt */
public final class Vertices {
    private final int[] colors;
    private final short[] indices;
    private final float[] positions;
    private final float[] textureCoordinates;
    private final int vertexMode;

    public /* synthetic */ Vertices(int i, List list, List list2, List list3, List list4, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, list, list2, list3, list4);
    }

    private final int[] encodeColorList(List<Color> list) {
        int size = list.size();
        int[] iArr = new int[size];
        for (int i = 0; i < size; i++) {
            iArr[i] = ColorKt.m35725toArgb8_81llA(list.get(i).m35681unboximpl());
        }
        return iArr;
    }

    private final float[] encodePointList(List<Offset> list) {
        float f;
        int size = list.size() * 2;
        float[] fArr = new float[size];
        for (int i = 0; i < size; i++) {
            long r3 = list.get(i / 2).m35432unboximpl();
            if (i % 2 == 0) {
                f = Offset.m35422getXimpl(r3);
            } else {
                f = Offset.m35423getYimpl(r3);
            }
            fArr[i] = f;
        }
        return fArr;
    }

    public final int[] getColors() {
        return this.colors;
    }

    public final short[] getIndices() {
        return this.indices;
    }

    public final float[] getPositions() {
        return this.positions;
    }

    public final float[] getTextureCoordinates() {
        return this.textureCoordinates;
    }

    /* renamed from: getVertexMode-c2xauaI  reason: not valid java name */
    public final int m36104getVertexModec2xauaI() {
        return this.vertexMode;
    }

    private Vertices(int i, List<Offset> list, List<Offset> list2, List<Color> list3, List<Integer> list4) {
        boolean z;
        this.vertexMode = i;
        Vertices$outOfBounds$1 vertices$outOfBounds$1 = new Vertices$outOfBounds$1(list);
        if (list2.size() != list.size()) {
            throw new IllegalArgumentException("positions and textureCoordinates lengths must match.");
        } else if (list3.size() == list.size()) {
            int size = list4.size();
            int i2 = 0;
            while (true) {
                if (i2 >= size) {
                    z = false;
                    break;
                } else if (((Boolean) vertices$outOfBounds$1.invoke(list4.get(i2))).booleanValue()) {
                    z = true;
                    break;
                } else {
                    i2++;
                }
            }
            if (!z) {
                this.positions = encodePointList(list);
                this.textureCoordinates = encodePointList(list2);
                this.colors = encodeColorList(list3);
                int size2 = list4.size();
                short[] sArr = new short[size2];
                for (int i3 = 0; i3 < size2; i3++) {
                    sArr[i3] = (short) list4.get(i3).intValue();
                }
                this.indices = sArr;
                return;
            }
            throw new IllegalArgumentException("indices values must be valid indices in the positions list.");
        } else {
            throw new IllegalArgumentException("positions and colors lengths must match.");
        }
    }
}
