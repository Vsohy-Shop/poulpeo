package com.google.android.material.textfield;

import android.widget.EditText;
import androidx.annotation.NonNull;

class EditTextUtils {
    private EditTextUtils() {
    }

    static boolean isEditable(@NonNull EditText editText) {
        if (editText.getInputType() != 0) {
            return true;
        }
        return false;
    }
}
