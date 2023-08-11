package androidx.compose.p002ui.node;

import androidx.compose.p002ui.Modifier;
import androidx.compose.p002ui.layout.MeasurePolicy;
import androidx.compose.p002ui.platform.ViewConfiguration;
import androidx.compose.p002ui.unit.Density;
import androidx.compose.p002ui.unit.LayoutDirection;
import p336ef.C11921v;
import p404of.C13074a;
import p404of.C13088o;

/* renamed from: androidx.compose.ui.node.ComposeUiNode */
/* compiled from: ComposeUiNode.kt */
public interface ComposeUiNode {
    public static final Companion Companion = Companion.$$INSTANCE;

    /* renamed from: androidx.compose.ui.node.ComposeUiNode$Companion */
    /* compiled from: ComposeUiNode.kt */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        private static final C13074a<ComposeUiNode> Constructor = LayoutNode.Companion.getConstructor$ui_release();
        private static final C13088o<ComposeUiNode, Density, C11921v> SetDensity = ComposeUiNode$Companion$SetDensity$1.INSTANCE;
        private static final C13088o<ComposeUiNode, LayoutDirection, C11921v> SetLayoutDirection = ComposeUiNode$Companion$SetLayoutDirection$1.INSTANCE;
        private static final C13088o<ComposeUiNode, MeasurePolicy, C11921v> SetMeasurePolicy = ComposeUiNode$Companion$SetMeasurePolicy$1.INSTANCE;
        private static final C13088o<ComposeUiNode, Modifier, C11921v> SetModifier = ComposeUiNode$Companion$SetModifier$1.INSTANCE;
        private static final C13088o<ComposeUiNode, ViewConfiguration, C11921v> SetViewConfiguration = ComposeUiNode$Companion$SetViewConfiguration$1.INSTANCE;
        private static final C13074a<ComposeUiNode> VirtualConstructor = ComposeUiNode$Companion$VirtualConstructor$1.INSTANCE;

        private Companion() {
        }

        public final C13074a<ComposeUiNode> getConstructor() {
            return Constructor;
        }

        public final C13088o<ComposeUiNode, Density, C11921v> getSetDensity() {
            return SetDensity;
        }

        public final C13088o<ComposeUiNode, LayoutDirection, C11921v> getSetLayoutDirection() {
            return SetLayoutDirection;
        }

        public final C13088o<ComposeUiNode, MeasurePolicy, C11921v> getSetMeasurePolicy() {
            return SetMeasurePolicy;
        }

        public final C13088o<ComposeUiNode, Modifier, C11921v> getSetModifier() {
            return SetModifier;
        }

        public final C13088o<ComposeUiNode, ViewConfiguration, C11921v> getSetViewConfiguration() {
            return SetViewConfiguration;
        }

        public final C13074a<ComposeUiNode> getVirtualConstructor() {
            return VirtualConstructor;
        }
    }

    Density getDensity();

    LayoutDirection getLayoutDirection();

    MeasurePolicy getMeasurePolicy();

    Modifier getModifier();

    ViewConfiguration getViewConfiguration();

    void setDensity(Density density);

    void setLayoutDirection(LayoutDirection layoutDirection);

    void setMeasurePolicy(MeasurePolicy measurePolicy);

    void setModifier(Modifier modifier);

    void setViewConfiguration(ViewConfiguration viewConfiguration);
}
