package com.google.android.material.timepicker;

import android.text.Editable;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import com.google.android.material.textfield.TextInputLayout;

class TimePickerTextInputKeyController implements TextView.OnEditorActionListener, View.OnKeyListener {
    private final ChipTextInputComboView hourLayoutComboView;
    private boolean keyListenerRunning = false;
    private final ChipTextInputComboView minuteLayoutComboView;
    private final TimeModel time;

    TimePickerTextInputKeyController(ChipTextInputComboView chipTextInputComboView, ChipTextInputComboView chipTextInputComboView2, TimeModel timeModel) {
        this.hourLayoutComboView = chipTextInputComboView;
        this.minuteLayoutComboView = chipTextInputComboView2;
        this.time = timeModel;
    }

    private void moveSelection(int i) {
        boolean z;
        ChipTextInputComboView chipTextInputComboView = this.minuteLayoutComboView;
        boolean z2 = true;
        if (i == 12) {
            z = true;
        } else {
            z = false;
        }
        chipTextInputComboView.setChecked(z);
        ChipTextInputComboView chipTextInputComboView2 = this.hourLayoutComboView;
        if (i != 10) {
            z2 = false;
        }
        chipTextInputComboView2.setChecked(z2);
        this.time.selection = i;
    }

    private boolean onHourKeyPress(int i, KeyEvent keyEvent, EditText editText) {
        boolean z;
        Editable text = editText.getText();
        if (text == null) {
            return false;
        }
        if (i >= 7 && i <= 16 && keyEvent.getAction() == 1 && editText.getSelectionStart() == 2 && text.length() == 2) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            return false;
        }
        moveSelection(12);
        return true;
    }

    private boolean onMinuteKeyPress(int i, KeyEvent keyEvent, EditText editText) {
        boolean z;
        if (i == 67 && keyEvent.getAction() == 0 && TextUtils.isEmpty(editText.getText())) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            return false;
        }
        moveSelection(10);
        return true;
    }

    public void bind() {
        TextInputLayout textInput = this.hourLayoutComboView.getTextInput();
        TextInputLayout textInput2 = this.minuteLayoutComboView.getTextInput();
        EditText editText = textInput.getEditText();
        EditText editText2 = textInput2.getEditText();
        editText.setImeOptions(268435461);
        editText2.setImeOptions(268435462);
        editText.setOnEditorActionListener(this);
        editText.setOnKeyListener(this);
        editText2.setOnKeyListener(this);
    }

    public boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        boolean z;
        if (i == 5) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            moveSelection(12);
        }
        return z;
    }

    public boolean onKey(View view, int i, KeyEvent keyEvent) {
        boolean z;
        if (this.keyListenerRunning) {
            return false;
        }
        this.keyListenerRunning = true;
        EditText editText = (EditText) view;
        if (this.time.selection == 12) {
            z = onMinuteKeyPress(i, keyEvent, editText);
        } else {
            z = onHourKeyPress(i, keyEvent, editText);
        }
        this.keyListenerRunning = false;
        return z;
    }
}
