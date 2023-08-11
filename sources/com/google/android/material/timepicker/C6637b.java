package com.google.android.material.timepicker;

import com.google.android.material.button.MaterialButtonToggleGroup;

/* renamed from: com.google.android.material.timepicker.b */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C6637b implements MaterialButtonToggleGroup.OnButtonCheckedListener {

    /* renamed from: a */
    public final /* synthetic */ TimePickerTextInputPresenter f8540a;

    public /* synthetic */ C6637b(TimePickerTextInputPresenter timePickerTextInputPresenter) {
        this.f8540a = timePickerTextInputPresenter;
    }

    public final void onButtonChecked(MaterialButtonToggleGroup materialButtonToggleGroup, int i, boolean z) {
        this.f8540a.lambda$setupPeriodToggle$0(materialButtonToggleGroup, i, z);
    }
}
