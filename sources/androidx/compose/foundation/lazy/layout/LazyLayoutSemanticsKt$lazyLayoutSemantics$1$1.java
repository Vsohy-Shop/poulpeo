package androidx.compose.foundation.lazy.layout;

import androidx.compose.p002ui.semantics.CollectionInfo;
import androidx.compose.p002ui.semantics.ScrollAxisRange;
import androidx.compose.p002ui.semantics.SemanticsPropertiesKt;
import androidx.compose.p002ui.semantics.SemanticsPropertyReceiver;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import p336ef.C11921v;
import p404of.C13088o;

/* compiled from: LazyLayoutSemantics.kt */
final class LazyLayoutSemanticsKt$lazyLayoutSemantics$1$1 extends C12777p implements Function1<SemanticsPropertyReceiver, C11921v> {
    final /* synthetic */ ScrollAxisRange $accessibilityScrollState;
    final /* synthetic */ CollectionInfo $collectionInfo;
    final /* synthetic */ Function1<Object, Integer> $indexForKeyMapping;
    final /* synthetic */ boolean $isVertical;
    final /* synthetic */ C13088o<Float, Float, Boolean> $scrollByAction;
    final /* synthetic */ Function1<Integer, Boolean> $scrollToIndexAction;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    LazyLayoutSemanticsKt$lazyLayoutSemantics$1$1(Function1<Object, Integer> function1, boolean z, ScrollAxisRange scrollAxisRange, C13088o<? super Float, ? super Float, Boolean> oVar, Function1<? super Integer, Boolean> function12, CollectionInfo collectionInfo) {
        super(1);
        this.$indexForKeyMapping = function1;
        this.$isVertical = z;
        this.$accessibilityScrollState = scrollAxisRange;
        this.$scrollByAction = oVar;
        this.$scrollToIndexAction = function12;
        this.$collectionInfo = collectionInfo;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((SemanticsPropertyReceiver) obj);
        return C11921v.f18618a;
    }

    public final void invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
        C12775o.m28639i(semanticsPropertyReceiver, "$this$semantics");
        SemanticsPropertiesKt.indexForKey(semanticsPropertyReceiver, this.$indexForKeyMapping);
        if (this.$isVertical) {
            SemanticsPropertiesKt.setVerticalScrollAxisRange(semanticsPropertyReceiver, this.$accessibilityScrollState);
        } else {
            SemanticsPropertiesKt.setHorizontalScrollAxisRange(semanticsPropertyReceiver, this.$accessibilityScrollState);
        }
        C13088o<Float, Float, Boolean> oVar = this.$scrollByAction;
        if (oVar != null) {
            SemanticsPropertiesKt.scrollBy$default(semanticsPropertyReceiver, (String) null, oVar, 1, (Object) null);
        }
        Function1<Integer, Boolean> function1 = this.$scrollToIndexAction;
        if (function1 != null) {
            SemanticsPropertiesKt.scrollToIndex$default(semanticsPropertyReceiver, (String) null, function1, 1, (Object) null);
        }
        SemanticsPropertiesKt.setCollectionInfo(semanticsPropertyReceiver, this.$collectionInfo);
    }
}
