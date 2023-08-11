package com.google.android.material.textfield;

import android.view.View;
import androidx.annotation.NonNull;

class CustomEndIconDelegate extends EndIconDelegate {
    CustomEndIconDelegate(@NonNull EndCompoundLayout endCompoundLayout) {
        super(endCompoundLayout);
    }

    /* access modifiers changed from: package-private */
    public void setUp() {
        this.endLayout.setEndIconOnLongClickListener((View.OnLongClickListener) null);
    }
}
