package com.google.android.material.bottomsheet;

import android.view.View;
import androidx.core.view.accessibility.AccessibilityViewCommand;

/* renamed from: com.google.android.material.bottomsheet.a */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C6425a implements AccessibilityViewCommand {

    /* renamed from: a */
    public final /* synthetic */ BottomSheetDragHandleView f8501a;

    public /* synthetic */ C6425a(BottomSheetDragHandleView bottomSheetDragHandleView) {
        this.f8501a = bottomSheetDragHandleView;
    }

    public final boolean perform(View view, AccessibilityViewCommand.CommandArguments commandArguments) {
        return this.f8501a.lambda$onBottomSheetStateChanged$0(view, commandArguments);
    }
}
