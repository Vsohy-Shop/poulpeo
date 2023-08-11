package androidx.compose.p002ui.node;

import androidx.compose.p002ui.ExperimentalComposeUiApi;

@ExperimentalComposeUiApi
/* renamed from: androidx.compose.ui.node.ObserverNode */
/* compiled from: ObserverNode.kt */
public interface ObserverNode extends DelegatableNode {
    void onObservedReadsChanged();
}
