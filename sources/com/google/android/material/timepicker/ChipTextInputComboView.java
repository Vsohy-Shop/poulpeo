package com.google.android.material.timepicker;

import android.content.Context;
import android.content.res.Configuration;
import android.text.Editable;
import android.text.InputFilter;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Checkable;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.compose.p002ui.platform.AndroidComposeViewAccessibilityDelegateCompat;
import androidx.core.view.AccessibilityDelegateCompat;
import androidx.core.view.ViewCompat;
import com.google.android.material.C6372R;
import com.google.android.material.chip.Chip;
import com.google.android.material.internal.TextWatcherAdapter;
import com.google.android.material.internal.ViewUtils;
import com.google.android.material.textfield.TextInputLayout;
import java.util.Arrays;

class ChipTextInputComboView extends FrameLayout implements Checkable {
    /* access modifiers changed from: private */
    public final Chip chip;
    private final EditText editText;
    private TextView label;
    private final TextInputLayout textInputLayout;
    private TextWatcher watcher;

    private class TextFormatter extends TextWatcherAdapter {
        private static final String DEFAULT_TEXT = "00";

        private TextFormatter() {
        }

        public void afterTextChanged(Editable editable) {
            if (TextUtils.isEmpty(editable)) {
                ChipTextInputComboView.this.chip.setText(ChipTextInputComboView.this.formatText(DEFAULT_TEXT));
            } else {
                ChipTextInputComboView.this.chip.setText(ChipTextInputComboView.this.formatText(editable));
            }
        }
    }

    public ChipTextInputComboView(@NonNull Context context) {
        this(context, (AttributeSet) null);
    }

    /* access modifiers changed from: private */
    public String formatText(CharSequence charSequence) {
        return TimeModel.formatText(getResources(), charSequence);
    }

    private void updateHintLocales() {
        this.editText.setImeHintLocales(getContext().getResources().getConfiguration().getLocales());
    }

    public void addInputFilter(InputFilter inputFilter) {
        InputFilter[] filters = this.editText.getFilters();
        InputFilter[] inputFilterArr = (InputFilter[]) Arrays.copyOf(filters, filters.length + 1);
        inputFilterArr[filters.length] = inputFilter;
        this.editText.setFilters(inputFilterArr);
    }

    public TextInputLayout getTextInput() {
        return this.textInputLayout;
    }

    public boolean isChecked() {
        return this.chip.isChecked();
    }

    /* access modifiers changed from: protected */
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        updateHintLocales();
    }

    public void setChecked(boolean z) {
        int i;
        this.chip.setChecked(z);
        EditText editText2 = this.editText;
        int i2 = 0;
        if (z) {
            i = 0;
        } else {
            i = 4;
        }
        editText2.setVisibility(i);
        Chip chip2 = this.chip;
        if (z) {
            i2 = 8;
        }
        chip2.setVisibility(i2);
        if (isChecked()) {
            ViewUtils.requestFocusAndShowKeyboard(this.editText);
            if (!TextUtils.isEmpty(this.editText.getText())) {
                EditText editText3 = this.editText;
                editText3.setSelection(editText3.getText().length());
            }
        }
    }

    public void setChipDelegate(AccessibilityDelegateCompat accessibilityDelegateCompat) {
        ViewCompat.setAccessibilityDelegate(this.chip, accessibilityDelegateCompat);
    }

    public void setCursorVisible(boolean z) {
        this.editText.setCursorVisible(z);
    }

    public void setHelperText(CharSequence charSequence) {
        this.label.setText(charSequence);
    }

    public void setOnClickListener(@Nullable View.OnClickListener onClickListener) {
        this.chip.setOnClickListener(onClickListener);
    }

    public void setTag(int i, Object obj) {
        this.chip.setTag(i, obj);
    }

    public void setText(CharSequence charSequence) {
        this.chip.setText(formatText(charSequence));
        if (!TextUtils.isEmpty(this.editText.getText())) {
            this.editText.removeTextChangedListener(this.watcher);
            this.editText.setText((CharSequence) null);
            this.editText.addTextChangedListener(this.watcher);
        }
    }

    public void toggle() {
        this.chip.toggle();
    }

    public ChipTextInputComboView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ChipTextInputComboView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        LayoutInflater from = LayoutInflater.from(context);
        Chip chip2 = (Chip) from.inflate(C6372R.C6377layout.material_time_chip, this, false);
        this.chip = chip2;
        chip2.setAccessibilityClassName(AndroidComposeViewAccessibilityDelegateCompat.ClassName);
        TextInputLayout textInputLayout2 = (TextInputLayout) from.inflate(C6372R.C6377layout.material_time_input, this, false);
        this.textInputLayout = textInputLayout2;
        EditText editText2 = textInputLayout2.getEditText();
        this.editText = editText2;
        editText2.setVisibility(4);
        TextFormatter textFormatter = new TextFormatter();
        this.watcher = textFormatter;
        editText2.addTextChangedListener(textFormatter);
        updateHintLocales();
        addView(chip2);
        addView(textInputLayout2);
        this.label = (TextView) findViewById(C6372R.C6375id.material_label);
        editText2.setId(ViewCompat.generateViewId());
        ViewCompat.setLabelFor(this.label, editText2.getId());
        editText2.setSaveEnabled(false);
        editText2.setLongClickable(false);
    }
}
