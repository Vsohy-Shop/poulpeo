package androidx.compose.p002ui.focus;

/* renamed from: androidx.compose.ui.focus.FocusRequesterKt */
/* compiled from: FocusRequester.kt */
public final class FocusRequesterKt {
    private static final String FocusRequesterNotInitialized = "\n   FocusRequester is not initialized. Here are some possible fixes:\n\n   1. Remember the FocusRequester: val focusRequester = remember { FocusRequester() }\n   2. Did you forget to add a Modifier.focusRequester() ?\n   3. Are you attempting to request focus during composition? Focus requests should be made in\n   response to some event. Eg Modifier.clickable { focusRequester.requestFocus() }\n";
    private static final String InvalidFocusRequesterInvocation = "\n    Please check whether the focusRequester is FocusRequester.Cancel or FocusRequester.Default\n    before invoking any functions on the focusRequester.\n";
}
