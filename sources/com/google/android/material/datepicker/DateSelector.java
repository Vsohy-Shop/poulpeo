package com.google.android.material.datepicker;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.annotation.StringRes;
import androidx.annotation.StyleRes;
import androidx.core.util.Pair;
import com.google.android.material.internal.ViewUtils;
import java.util.Collection;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public interface DateSelector<S> extends Parcelable {
    /* access modifiers changed from: private */
    static /* synthetic */ void lambda$showKeyboardWithAutoHideBehavior$0(EditText[] editTextArr, View view, boolean z) {
        int length = editTextArr.length;
        int i = 0;
        while (i < length) {
            if (!editTextArr[i].hasFocus()) {
                i++;
            } else {
                return;
            }
        }
        ViewUtils.hideKeyboard(view);
    }

    static void showKeyboardWithAutoHideBehavior(@NonNull EditText... editTextArr) {
        if (editTextArr.length != 0) {
            C6484c cVar = new C6484c(editTextArr);
            for (EditText onFocusChangeListener : editTextArr) {
                onFocusChangeListener.setOnFocusChangeListener(cVar);
            }
            ViewUtils.requestFocusAndShowKeyboard(editTextArr[0]);
        }
    }

    @StyleRes
    int getDefaultThemeResId(Context context);

    @StringRes
    int getDefaultTitleResId();

    @NonNull
    Collection<Long> getSelectedDays();

    @NonNull
    Collection<Pair<Long, Long>> getSelectedRanges();

    @Nullable
    S getSelection();

    @NonNull
    String getSelectionDisplayString(Context context);

    boolean isSelectionComplete();

    @NonNull
    View onCreateTextInputView(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle, @NonNull CalendarConstraints calendarConstraints, @NonNull OnSelectionChangedListener<S> onSelectionChangedListener);

    void select(long j);

    void setSelection(@NonNull S s);
}
