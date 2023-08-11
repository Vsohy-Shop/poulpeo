package androidx.compose.foundation.shape;

import androidx.compose.p002ui.geometry.Size;
import androidx.compose.p002ui.graphics.AndroidPath_androidKt;
import androidx.compose.p002ui.graphics.Outline;
import androidx.compose.p002ui.graphics.Path;
import androidx.compose.p002ui.graphics.Shape;
import androidx.compose.p002ui.unit.Density;
import androidx.compose.p002ui.unit.LayoutDirection;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.C12775o;
import p336ef.C11921v;
import p404of.C13089p;

@StabilityInferred(parameters = 0)
/* compiled from: GenericShape.kt */
public final class GenericShape implements Shape {
    public static final int $stable = 0;
    private final C13089p<Path, Size, LayoutDirection, C11921v> builder;

    public GenericShape(C13089p<? super Path, ? super Size, ? super LayoutDirection, C11921v> pVar) {
        C12775o.m28639i(pVar, "builder");
        this.builder = pVar;
    }

    /* renamed from: createOutline-Pq9zytI  reason: not valid java name */
    public Outline m33622createOutlinePq9zytI(long j, LayoutDirection layoutDirection, Density density) {
        C12775o.m28639i(layoutDirection, "layoutDirection");
        C12775o.m28639i(density, "density");
        Path Path = AndroidPath_androidKt.Path();
        this.builder.invoke(Path, Size.m35479boximpl(j), layoutDirection);
        Path.close();
        return new Outline.Generic(Path);
    }

    public boolean equals(Object obj) {
        GenericShape genericShape;
        if (this == obj) {
            return true;
        }
        C13089p<Path, Size, LayoutDirection, C11921v> pVar = null;
        if (obj instanceof GenericShape) {
            genericShape = (GenericShape) obj;
        } else {
            genericShape = null;
        }
        if (genericShape != null) {
            pVar = genericShape.builder;
        }
        return C12775o.m28634d(pVar, this.builder);
    }

    public int hashCode() {
        return this.builder.hashCode();
    }
}
