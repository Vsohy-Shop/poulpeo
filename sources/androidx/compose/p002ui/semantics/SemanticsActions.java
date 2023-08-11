package androidx.compose.p002ui.semantics;

import androidx.compose.p002ui.text.AnnotatedString;
import androidx.compose.p002ui.text.TextLayoutResult;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import p404of.C13074a;
import p404of.C13088o;
import p404of.C13089p;

@StabilityInferred(parameters = 0)
@SourceDebugExtension({"SMAP\nSemanticsProperties.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SemanticsProperties.kt\nandroidx/compose/ui/semantics/SemanticsActions\n+ 2 SemanticsProperties.kt\nandroidx/compose/ui/semantics/SemanticsPropertiesKt\n*L\n1#1,1195:1\n432#2,3:1196\n432#2,3:1199\n432#2,3:1202\n432#2,3:1205\n432#2,3:1208\n432#2,3:1211\n432#2,3:1214\n432#2,3:1217\n432#2,3:1220\n432#2,3:1223\n432#2,3:1226\n432#2,3:1229\n432#2,3:1232\n432#2,3:1235\n432#2,3:1238\n432#2,3:1241\n432#2,3:1244\n432#2,3:1247\n432#2,3:1250\n*S KotlinDebug\n*F\n+ 1 SemanticsProperties.kt\nandroidx/compose/ui/semantics/SemanticsActions\n*L\n238#1:1196,3\n243#1:1199,3\n248#1:1202,3\n253#1:1205,3\n258#1:1208,3\n263#1:1211,3\n268#1:1214,3\n273#1:1217,3\n278#1:1220,3\n283#1:1223,3\n288#1:1226,3\n293#1:1229,3\n298#1:1232,3\n303#1:1235,3\n308#1:1238,3\n319#1:1241,3\n324#1:1244,3\n329#1:1247,3\n334#1:1250,3\n*E\n"})
/* renamed from: androidx.compose.ui.semantics.SemanticsActions */
/* compiled from: SemanticsProperties.kt */
public final class SemanticsActions {
    public static final int $stable = 0;
    private static final SemanticsPropertyKey<AccessibilityAction<C13074a<Boolean>>> Collapse;
    private static final SemanticsPropertyKey<AccessibilityAction<C13074a<Boolean>>> CopyText;
    private static final SemanticsPropertyKey<List<CustomAccessibilityAction>> CustomActions = new SemanticsPropertyKey<>("CustomActions", (C13088o) null, 2, (DefaultConstructorMarker) null);
    private static final SemanticsPropertyKey<AccessibilityAction<C13074a<Boolean>>> CutText;
    private static final SemanticsPropertyKey<AccessibilityAction<C13074a<Boolean>>> Dismiss;
    private static final SemanticsPropertyKey<AccessibilityAction<C13074a<Boolean>>> Expand;
    private static final SemanticsPropertyKey<AccessibilityAction<Function1<List<TextLayoutResult>, Boolean>>> GetTextLayoutResult;
    public static final SemanticsActions INSTANCE = new SemanticsActions();
    private static final SemanticsPropertyKey<AccessibilityAction<C13074a<Boolean>>> OnClick;
    private static final SemanticsPropertyKey<AccessibilityAction<C13074a<Boolean>>> OnLongClick;
    private static final SemanticsPropertyKey<AccessibilityAction<C13074a<Boolean>>> PageDown;
    private static final SemanticsPropertyKey<AccessibilityAction<C13074a<Boolean>>> PageLeft;
    private static final SemanticsPropertyKey<AccessibilityAction<C13074a<Boolean>>> PageRight;
    private static final SemanticsPropertyKey<AccessibilityAction<C13074a<Boolean>>> PageUp;
    private static final SemanticsPropertyKey<AccessibilityAction<C13074a<Boolean>>> PasteText;
    private static final SemanticsPropertyKey<AccessibilityAction<C13074a<Boolean>>> RequestFocus;
    private static final SemanticsPropertyKey<AccessibilityAction<C13088o<Float, Float, Boolean>>> ScrollBy;
    private static final SemanticsPropertyKey<AccessibilityAction<Function1<Integer, Boolean>>> ScrollToIndex;
    private static final SemanticsPropertyKey<AccessibilityAction<Function1<Float, Boolean>>> SetProgress;
    private static final SemanticsPropertyKey<AccessibilityAction<C13089p<Integer, Integer, Boolean, Boolean>>> SetSelection;
    private static final SemanticsPropertyKey<AccessibilityAction<Function1<AnnotatedString, Boolean>>> SetText;

    static {
        SemanticsPropertiesKt$ActionPropertyKey$1 semanticsPropertiesKt$ActionPropertyKey$1 = SemanticsPropertiesKt$ActionPropertyKey$1.INSTANCE;
        GetTextLayoutResult = new SemanticsPropertyKey<>("GetTextLayoutResult", semanticsPropertiesKt$ActionPropertyKey$1);
        OnClick = new SemanticsPropertyKey<>("OnClick", semanticsPropertiesKt$ActionPropertyKey$1);
        OnLongClick = new SemanticsPropertyKey<>("OnLongClick", semanticsPropertiesKt$ActionPropertyKey$1);
        ScrollBy = new SemanticsPropertyKey<>("ScrollBy", semanticsPropertiesKt$ActionPropertyKey$1);
        ScrollToIndex = new SemanticsPropertyKey<>("ScrollToIndex", semanticsPropertiesKt$ActionPropertyKey$1);
        SetProgress = new SemanticsPropertyKey<>("SetProgress", semanticsPropertiesKt$ActionPropertyKey$1);
        SetSelection = new SemanticsPropertyKey<>("SetSelection", semanticsPropertiesKt$ActionPropertyKey$1);
        SetText = new SemanticsPropertyKey<>("SetText", semanticsPropertiesKt$ActionPropertyKey$1);
        CopyText = new SemanticsPropertyKey<>("CopyText", semanticsPropertiesKt$ActionPropertyKey$1);
        CutText = new SemanticsPropertyKey<>("CutText", semanticsPropertiesKt$ActionPropertyKey$1);
        PasteText = new SemanticsPropertyKey<>("PasteText", semanticsPropertiesKt$ActionPropertyKey$1);
        Expand = new SemanticsPropertyKey<>("Expand", semanticsPropertiesKt$ActionPropertyKey$1);
        Collapse = new SemanticsPropertyKey<>("Collapse", semanticsPropertiesKt$ActionPropertyKey$1);
        Dismiss = new SemanticsPropertyKey<>("Dismiss", semanticsPropertiesKt$ActionPropertyKey$1);
        RequestFocus = new SemanticsPropertyKey<>("RequestFocus", semanticsPropertiesKt$ActionPropertyKey$1);
        PageUp = new SemanticsPropertyKey<>("PageUp", semanticsPropertiesKt$ActionPropertyKey$1);
        PageLeft = new SemanticsPropertyKey<>("PageLeft", semanticsPropertiesKt$ActionPropertyKey$1);
        PageDown = new SemanticsPropertyKey<>("PageDown", semanticsPropertiesKt$ActionPropertyKey$1);
        PageRight = new SemanticsPropertyKey<>("PageRight", semanticsPropertiesKt$ActionPropertyKey$1);
    }

    private SemanticsActions() {
    }

    public final SemanticsPropertyKey<AccessibilityAction<C13074a<Boolean>>> getCollapse() {
        return Collapse;
    }

    public final SemanticsPropertyKey<AccessibilityAction<C13074a<Boolean>>> getCopyText() {
        return CopyText;
    }

    public final SemanticsPropertyKey<List<CustomAccessibilityAction>> getCustomActions() {
        return CustomActions;
    }

    public final SemanticsPropertyKey<AccessibilityAction<C13074a<Boolean>>> getCutText() {
        return CutText;
    }

    public final SemanticsPropertyKey<AccessibilityAction<C13074a<Boolean>>> getDismiss() {
        return Dismiss;
    }

    public final SemanticsPropertyKey<AccessibilityAction<C13074a<Boolean>>> getExpand() {
        return Expand;
    }

    public final SemanticsPropertyKey<AccessibilityAction<Function1<List<TextLayoutResult>, Boolean>>> getGetTextLayoutResult() {
        return GetTextLayoutResult;
    }

    public final SemanticsPropertyKey<AccessibilityAction<C13074a<Boolean>>> getOnClick() {
        return OnClick;
    }

    public final SemanticsPropertyKey<AccessibilityAction<C13074a<Boolean>>> getOnLongClick() {
        return OnLongClick;
    }

    public final SemanticsPropertyKey<AccessibilityAction<C13074a<Boolean>>> getPageDown() {
        return PageDown;
    }

    public final SemanticsPropertyKey<AccessibilityAction<C13074a<Boolean>>> getPageLeft() {
        return PageLeft;
    }

    public final SemanticsPropertyKey<AccessibilityAction<C13074a<Boolean>>> getPageRight() {
        return PageRight;
    }

    public final SemanticsPropertyKey<AccessibilityAction<C13074a<Boolean>>> getPageUp() {
        return PageUp;
    }

    public final SemanticsPropertyKey<AccessibilityAction<C13074a<Boolean>>> getPasteText() {
        return PasteText;
    }

    public final SemanticsPropertyKey<AccessibilityAction<C13074a<Boolean>>> getRequestFocus() {
        return RequestFocus;
    }

    public final SemanticsPropertyKey<AccessibilityAction<C13088o<Float, Float, Boolean>>> getScrollBy() {
        return ScrollBy;
    }

    public final SemanticsPropertyKey<AccessibilityAction<Function1<Integer, Boolean>>> getScrollToIndex() {
        return ScrollToIndex;
    }

    public final SemanticsPropertyKey<AccessibilityAction<Function1<Float, Boolean>>> getSetProgress() {
        return SetProgress;
    }

    public final SemanticsPropertyKey<AccessibilityAction<C13089p<Integer, Integer, Boolean, Boolean>>> getSetSelection() {
        return SetSelection;
    }

    public final SemanticsPropertyKey<AccessibilityAction<Function1<AnnotatedString, Boolean>>> getSetText() {
        return SetText;
    }
}
