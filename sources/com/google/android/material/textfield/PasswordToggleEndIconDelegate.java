package com.google.android.material.textfield;

import android.text.method.PasswordTransformationMethod;
import android.text.method.TransformationMethod;
import android.view.View;
import android.widget.EditText;
import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.StringRes;
import com.google.android.material.C6372R;

class PasswordToggleEndIconDelegate extends EndIconDelegate {
    @Nullable
    private EditText editText;
    private int iconResId = C6372R.C6374drawable.design_password_eye;
    private final View.OnClickListener onIconClickListener = new C6613m(this);

    PasswordToggleEndIconDelegate(@NonNull EndCompoundLayout endCompoundLayout, @DrawableRes int i) {
        super(endCompoundLayout);
        if (i != 0) {
            this.iconResId = i;
        }
    }

    private boolean hasPasswordTransformation() {
        EditText editText2 = this.editText;
        if (editText2 == null || !(editText2.getTransformationMethod() instanceof PasswordTransformationMethod)) {
            return false;
        }
        return true;
    }

    private static boolean isInputTypePassword(EditText editText2) {
        if (editText2 == null || (editText2.getInputType() != 16 && editText2.getInputType() != 128 && editText2.getInputType() != 144 && editText2.getInputType() != 224)) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void lambda$new$0(View view) {
        EditText editText2 = this.editText;
        if (editText2 != null) {
            int selectionEnd = editText2.getSelectionEnd();
            if (hasPasswordTransformation()) {
                this.editText.setTransformationMethod((TransformationMethod) null);
            } else {
                this.editText.setTransformationMethod(PasswordTransformationMethod.getInstance());
            }
            if (selectionEnd >= 0) {
                this.editText.setSelection(selectionEnd);
            }
            refreshIconState();
        }
    }

    /* access modifiers changed from: package-private */
    public void beforeEditTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        refreshIconState();
    }

    /* access modifiers changed from: package-private */
    @StringRes
    public int getIconContentDescriptionResId() {
        return C6372R.string.password_toggle_content_description;
    }

    /* access modifiers changed from: package-private */
    @DrawableRes
    public int getIconDrawableResId() {
        return this.iconResId;
    }

    /* access modifiers changed from: package-private */
    public View.OnClickListener getOnIconClickListener() {
        return this.onIconClickListener;
    }

    /* access modifiers changed from: package-private */
    public boolean isIconCheckable() {
        return true;
    }

    /* access modifiers changed from: package-private */
    public boolean isIconChecked() {
        return !hasPasswordTransformation();
    }

    /* access modifiers changed from: package-private */
    public void onEditTextAttached(@Nullable EditText editText2) {
        this.editText = editText2;
        refreshIconState();
    }

    /* access modifiers changed from: package-private */
    public void setUp() {
        if (isInputTypePassword(this.editText)) {
            this.editText.setTransformationMethod(PasswordTransformationMethod.getInstance());
        }
    }

    /* access modifiers changed from: package-private */
    public void tearDown() {
        EditText editText2 = this.editText;
        if (editText2 != null) {
            editText2.setTransformationMethod(PasswordTransformationMethod.getInstance());
        }
    }
}
