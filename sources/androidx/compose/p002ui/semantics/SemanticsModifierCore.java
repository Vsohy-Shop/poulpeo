package androidx.compose.p002ui.semantics;

import androidx.compose.p002ui.platform.InspectableValueKt;
import androidx.compose.p002ui.platform.InspectorInfo;
import androidx.compose.p002ui.platform.InspectorValueInfo;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p336ef.C11921v;

/* renamed from: androidx.compose.ui.semantics.SemanticsModifierCore */
/* compiled from: SemanticsModifier.kt */
public final class SemanticsModifierCore extends InspectorValueInfo implements SemanticsModifier {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */
    public static AtomicInteger lastIdentifier = new AtomicInteger(0);
    private final SemanticsConfiguration semanticsConfiguration;

    /* renamed from: androidx.compose.ui.semantics.SemanticsModifierCore$Companion */
    /* compiled from: SemanticsModifier.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int generateSemanticsId() {
            return SemanticsModifierCore.lastIdentifier.addAndGet(1);
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ SemanticsModifierCore(boolean z, boolean z2, Function1 function1, Function1<InspectorInfo, C11921v> function12, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(z, z2, function1, (i & 8) != 0 ? InspectableValueKt.getNoInspectorInfo() : function12);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof SemanticsModifierCore) && C12775o.m28634d(getSemanticsConfiguration(), ((SemanticsModifierCore) obj).getSemanticsConfiguration())) {
            return true;
        }
        return false;
    }

    public SemanticsConfiguration getSemanticsConfiguration() {
        return this.semanticsConfiguration;
    }

    public int hashCode() {
        return getSemanticsConfiguration().hashCode();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SemanticsModifierCore(boolean z, boolean z2, Function1<? super SemanticsPropertyReceiver, C11921v> function1, Function1<? super InspectorInfo, C11921v> function12) {
        super(function12);
        C12775o.m28639i(function1, "properties");
        C12775o.m28639i(function12, "inspectorInfo");
        SemanticsConfiguration semanticsConfiguration2 = new SemanticsConfiguration();
        semanticsConfiguration2.setMergingSemanticsOfDescendants(z);
        semanticsConfiguration2.setClearingSemantics(z2);
        function1.invoke(semanticsConfiguration2);
        this.semanticsConfiguration = semanticsConfiguration2;
    }
}
