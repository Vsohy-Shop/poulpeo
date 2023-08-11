package androidx.compose.p002ui.semantics;

import androidx.compose.p002ui.ExperimentalComposeUiApi;
import androidx.compose.p002ui.state.ToggleableState;
import androidx.compose.p002ui.text.AnnotatedString;
import androidx.compose.p002ui.text.TextRange;
import androidx.compose.p002ui.text.input.ImeAction;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p336ef.C11921v;
import p404of.C13088o;

@StabilityInferred(parameters = 0)
/* renamed from: androidx.compose.ui.semantics.SemanticsProperties */
/* compiled from: SemanticsProperties.kt */
public final class SemanticsProperties {
    public static final int $stable = 0;
    private static final SemanticsPropertyKey<CollectionInfo> CollectionInfo = new SemanticsPropertyKey<>("CollectionInfo", (C13088o) null, 2, (DefaultConstructorMarker) null);
    private static final SemanticsPropertyKey<CollectionItemInfo> CollectionItemInfo = new SemanticsPropertyKey<>("CollectionItemInfo", (C13088o) null, 2, (DefaultConstructorMarker) null);
    private static final SemanticsPropertyKey<List<String>> ContentDescription = new SemanticsPropertyKey<>("ContentDescription", SemanticsProperties$ContentDescription$1.INSTANCE);
    private static final SemanticsPropertyKey<C11921v> Disabled = new SemanticsPropertyKey<>("Disabled", (C13088o) null, 2, (DefaultConstructorMarker) null);
    private static final SemanticsPropertyKey<AnnotatedString> EditableText = new SemanticsPropertyKey<>("EditableText", (C13088o) null, 2, (DefaultConstructorMarker) null);
    private static final SemanticsPropertyKey<String> Error = new SemanticsPropertyKey<>("Error", (C13088o) null, 2, (DefaultConstructorMarker) null);
    private static final SemanticsPropertyKey<Boolean> Focused = new SemanticsPropertyKey<>("Focused", (C13088o) null, 2, (DefaultConstructorMarker) null);
    private static final SemanticsPropertyKey<C11921v> Heading = new SemanticsPropertyKey<>("Heading", (C13088o) null, 2, (DefaultConstructorMarker) null);
    private static final SemanticsPropertyKey<ScrollAxisRange> HorizontalScrollAxisRange = new SemanticsPropertyKey<>("HorizontalScrollAxisRange", (C13088o) null, 2, (DefaultConstructorMarker) null);
    public static final SemanticsProperties INSTANCE = new SemanticsProperties();
    private static final SemanticsPropertyKey<ImeAction> ImeAction = new SemanticsPropertyKey<>("ImeAction", (C13088o) null, 2, (DefaultConstructorMarker) null);
    private static final SemanticsPropertyKey<Function1<Object, Integer>> IndexForKey = new SemanticsPropertyKey<>("IndexForKey", (C13088o) null, 2, (DefaultConstructorMarker) null);
    private static final SemanticsPropertyKey<C11921v> InvisibleToUser = new SemanticsPropertyKey<>("InvisibleToUser", SemanticsProperties$InvisibleToUser$1.INSTANCE);
    private static final SemanticsPropertyKey<Boolean> IsContainer = new SemanticsPropertyKey<>("IsContainer", (C13088o) null, 2, (DefaultConstructorMarker) null);
    private static final SemanticsPropertyKey<C11921v> IsDialog = new SemanticsPropertyKey<>("IsDialog", SemanticsProperties$IsDialog$1.INSTANCE);
    private static final SemanticsPropertyKey<C11921v> IsPopup = new SemanticsPropertyKey<>("IsPopup", SemanticsProperties$IsPopup$1.INSTANCE);
    private static final SemanticsPropertyKey<LiveRegionMode> LiveRegion = new SemanticsPropertyKey<>("LiveRegion", (C13088o) null, 2, (DefaultConstructorMarker) null);
    private static final SemanticsPropertyKey<String> PaneTitle = new SemanticsPropertyKey<>("PaneTitle", SemanticsProperties$PaneTitle$1.INSTANCE);
    private static final SemanticsPropertyKey<C11921v> Password = new SemanticsPropertyKey<>("Password", (C13088o) null, 2, (DefaultConstructorMarker) null);
    private static final SemanticsPropertyKey<ProgressBarRangeInfo> ProgressBarRangeInfo = new SemanticsPropertyKey<>("ProgressBarRangeInfo", (C13088o) null, 2, (DefaultConstructorMarker) null);
    private static final SemanticsPropertyKey<Role> Role = new SemanticsPropertyKey<>("Role", SemanticsProperties$Role$1.INSTANCE);
    private static final SemanticsPropertyKey<C11921v> SelectableGroup = new SemanticsPropertyKey<>("SelectableGroup", (C13088o) null, 2, (DefaultConstructorMarker) null);
    private static final SemanticsPropertyKey<Boolean> Selected = new SemanticsPropertyKey<>("Selected", (C13088o) null, 2, (DefaultConstructorMarker) null);
    private static final SemanticsPropertyKey<String> StateDescription = new SemanticsPropertyKey<>("StateDescription", (C13088o) null, 2, (DefaultConstructorMarker) null);
    private static final SemanticsPropertyKey<String> TestTag = new SemanticsPropertyKey<>("TestTag", SemanticsProperties$TestTag$1.INSTANCE);
    private static final SemanticsPropertyKey<List<AnnotatedString>> Text = new SemanticsPropertyKey<>("Text", SemanticsProperties$Text$1.INSTANCE);
    private static final SemanticsPropertyKey<TextRange> TextSelectionRange = new SemanticsPropertyKey<>("TextSelectionRange", (C13088o) null, 2, (DefaultConstructorMarker) null);
    private static final SemanticsPropertyKey<ToggleableState> ToggleableState = new SemanticsPropertyKey<>("ToggleableState", (C13088o) null, 2, (DefaultConstructorMarker) null);
    private static final SemanticsPropertyKey<ScrollAxisRange> VerticalScrollAxisRange = new SemanticsPropertyKey<>("VerticalScrollAxisRange", (C13088o) null, 2, (DefaultConstructorMarker) null);

    private SemanticsProperties() {
    }

    public final SemanticsPropertyKey<CollectionInfo> getCollectionInfo() {
        return CollectionInfo;
    }

    public final SemanticsPropertyKey<CollectionItemInfo> getCollectionItemInfo() {
        return CollectionItemInfo;
    }

    public final SemanticsPropertyKey<List<String>> getContentDescription() {
        return ContentDescription;
    }

    public final SemanticsPropertyKey<C11921v> getDisabled() {
        return Disabled;
    }

    public final SemanticsPropertyKey<AnnotatedString> getEditableText() {
        return EditableText;
    }

    public final SemanticsPropertyKey<String> getError() {
        return Error;
    }

    public final SemanticsPropertyKey<Boolean> getFocused() {
        return Focused;
    }

    public final SemanticsPropertyKey<C11921v> getHeading() {
        return Heading;
    }

    public final SemanticsPropertyKey<ScrollAxisRange> getHorizontalScrollAxisRange() {
        return HorizontalScrollAxisRange;
    }

    public final SemanticsPropertyKey<ImeAction> getImeAction() {
        return ImeAction;
    }

    public final SemanticsPropertyKey<Function1<Object, Integer>> getIndexForKey() {
        return IndexForKey;
    }

    public final SemanticsPropertyKey<C11921v> getInvisibleToUser() {
        return InvisibleToUser;
    }

    public final SemanticsPropertyKey<Boolean> getIsContainer() {
        return IsContainer;
    }

    public final SemanticsPropertyKey<C11921v> getIsDialog() {
        return IsDialog;
    }

    public final SemanticsPropertyKey<C11921v> getIsPopup() {
        return IsPopup;
    }

    public final SemanticsPropertyKey<LiveRegionMode> getLiveRegion() {
        return LiveRegion;
    }

    public final SemanticsPropertyKey<String> getPaneTitle() {
        return PaneTitle;
    }

    public final SemanticsPropertyKey<C11921v> getPassword() {
        return Password;
    }

    public final SemanticsPropertyKey<ProgressBarRangeInfo> getProgressBarRangeInfo() {
        return ProgressBarRangeInfo;
    }

    public final SemanticsPropertyKey<Role> getRole() {
        return Role;
    }

    public final SemanticsPropertyKey<C11921v> getSelectableGroup() {
        return SelectableGroup;
    }

    public final SemanticsPropertyKey<Boolean> getSelected() {
        return Selected;
    }

    public final SemanticsPropertyKey<String> getStateDescription() {
        return StateDescription;
    }

    public final SemanticsPropertyKey<String> getTestTag() {
        return TestTag;
    }

    public final SemanticsPropertyKey<List<AnnotatedString>> getText() {
        return Text;
    }

    public final SemanticsPropertyKey<TextRange> getTextSelectionRange() {
        return TextSelectionRange;
    }

    public final SemanticsPropertyKey<ToggleableState> getToggleableState() {
        return ToggleableState;
    }

    public final SemanticsPropertyKey<ScrollAxisRange> getVerticalScrollAxisRange() {
        return VerticalScrollAxisRange;
    }

    @ExperimentalComposeUiApi
    public static /* synthetic */ void getInvisibleToUser$annotations() {
    }
}
