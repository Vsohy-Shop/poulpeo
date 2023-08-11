package androidx.compose.p002ui.layout;

import androidx.compose.p002ui.platform.ViewConfiguration;
import androidx.compose.p002ui.unit.Density;
import androidx.compose.p002ui.unit.LayoutDirection;
import java.util.List;

/* renamed from: androidx.compose.ui.layout.LayoutInfo */
/* compiled from: LayoutInfo.kt */
public interface LayoutInfo {
    LayoutCoordinates getCoordinates();

    Density getDensity();

    int getHeight();

    LayoutDirection getLayoutDirection();

    List<ModifierInfo> getModifierInfo();

    LayoutInfo getParentInfo();

    int getSemanticsId();

    ViewConfiguration getViewConfiguration();

    int getWidth();

    boolean isAttached();

    boolean isPlaced();
}
