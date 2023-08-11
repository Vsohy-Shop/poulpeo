package androidx.compose.p002ui.autofill;

import androidx.compose.p002ui.ExperimentalComposeUiApi;
import androidx.compose.p002ui.geometry.Rect;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import p336ef.C11921v;

@StabilityInferred(parameters = 0)
@ExperimentalComposeUiApi
/* renamed from: androidx.compose.ui.autofill.AutofillNode */
/* compiled from: Autofill.kt */
public final class AutofillNode {
    public static final int $stable = 8;
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */
    public static int previousId;
    private final List<AutofillType> autofillTypes;
    private Rect boundingBox;

    /* renamed from: id */
    private final int f259id;
    private final Function1<String, C11921v> onFill;

    @SourceDebugExtension({"SMAP\nAutofill.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Autofill.kt\nandroidx/compose/ui/autofill/AutofillNode$Companion\n+ 2 JvmActuals.jvm.kt\nandroidx/compose/ui/platform/JvmActuals_jvmKt\n*L\n1#1,104:1\n34#2:105\n*S KotlinDebug\n*F\n+ 1 Autofill.kt\nandroidx/compose/ui/autofill/AutofillNode$Companion\n*L\n82#1:105\n*E\n"})
    /* renamed from: androidx.compose.ui.autofill.AutofillNode$Companion */
    /* compiled from: Autofill.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* access modifiers changed from: private */
        public final int generateId() {
            int access$getPreviousId$cp;
            synchronized (this) {
                AutofillNode.previousId = AutofillNode.previousId + 1;
                access$getPreviousId$cp = AutofillNode.previousId;
            }
            return access$getPreviousId$cp;
        }
    }

    public AutofillNode(List<? extends AutofillType> list, Rect rect, Function1<? super String, C11921v> function1) {
        C12775o.m28639i(list, "autofillTypes");
        this.autofillTypes = list;
        this.boundingBox = rect;
        this.onFill = function1;
        this.f259id = Companion.generateId();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AutofillNode)) {
            return false;
        }
        AutofillNode autofillNode = (AutofillNode) obj;
        if (C12775o.m28634d(this.autofillTypes, autofillNode.autofillTypes) && C12775o.m28634d(this.boundingBox, autofillNode.boundingBox) && C12775o.m28634d(this.onFill, autofillNode.onFill)) {
            return true;
        }
        return false;
    }

    public final List<AutofillType> getAutofillTypes() {
        return this.autofillTypes;
    }

    public final Rect getBoundingBox() {
        return this.boundingBox;
    }

    public final int getId() {
        return this.f259id;
    }

    public final Function1<String, C11921v> getOnFill() {
        return this.onFill;
    }

    public int hashCode() {
        int i;
        int hashCode = this.autofillTypes.hashCode() * 31;
        Rect rect = this.boundingBox;
        int i2 = 0;
        if (rect != null) {
            i = rect.hashCode();
        } else {
            i = 0;
        }
        int i3 = (hashCode + i) * 31;
        Function1<String, C11921v> function1 = this.onFill;
        if (function1 != null) {
            i2 = function1.hashCode();
        }
        return i3 + i2;
    }

    public final void setBoundingBox(Rect rect) {
        this.boundingBox = rect;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ AutofillNode(List list, Rect rect, Function1 function1, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? C12726w.m28524k() : list, (i & 2) != 0 ? null : rect, function1);
    }
}
