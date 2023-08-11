package com.google.android.material.datepicker;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.core.util.Pair;
import com.google.android.material.C6372R;
import com.google.android.material.internal.ManufacturerUtils;
import com.google.android.material.resources.MaterialAttributes;
import com.google.android.material.textfield.TextInputLayout;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public class SingleDateSelector implements DateSelector<Long> {
    public static final Parcelable.Creator<SingleDateSelector> CREATOR = new Parcelable.Creator<SingleDateSelector>() {
        @NonNull
        public SingleDateSelector createFromParcel(@NonNull Parcel parcel) {
            SingleDateSelector singleDateSelector = new SingleDateSelector();
            Long unused = singleDateSelector.selectedItem = (Long) parcel.readValue(Long.class.getClassLoader());
            return singleDateSelector;
        }

        @NonNull
        public SingleDateSelector[] newArray(int i) {
            return new SingleDateSelector[i];
        }
    };
    /* access modifiers changed from: private */
    @Nullable
    public Long selectedItem;

    /* access modifiers changed from: private */
    public void clearSelection() {
        this.selectedItem = null;
    }

    public int describeContents() {
        return 0;
    }

    public int getDefaultThemeResId(Context context) {
        return MaterialAttributes.resolveOrThrow(context, C6372R.attr.materialCalendarTheme, MaterialDatePicker.class.getCanonicalName());
    }

    public int getDefaultTitleResId() {
        return C6372R.string.mtrl_picker_date_header_title;
    }

    @NonNull
    public Collection<Long> getSelectedDays() {
        ArrayList arrayList = new ArrayList();
        Long l = this.selectedItem;
        if (l != null) {
            arrayList.add(l);
        }
        return arrayList;
    }

    @NonNull
    public Collection<Pair<Long, Long>> getSelectedRanges() {
        return new ArrayList();
    }

    @NonNull
    public String getSelectionDisplayString(@NonNull Context context) {
        Resources resources = context.getResources();
        Long l = this.selectedItem;
        if (l == null) {
            return resources.getString(C6372R.string.mtrl_picker_date_header_unselected);
        }
        String yearMonthDay = DateStrings.getYearMonthDay(l.longValue());
        return resources.getString(C6372R.string.mtrl_picker_date_header_selected, new Object[]{yearMonthDay});
    }

    public boolean isSelectionComplete() {
        if (this.selectedItem != null) {
            return true;
        }
        return false;
    }

    public View onCreateTextInputView(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle, CalendarConstraints calendarConstraints, @NonNull OnSelectionChangedListener<Long> onSelectionChangedListener) {
        View inflate = layoutInflater.inflate(C6372R.C6377layout.mtrl_picker_text_input_date, viewGroup, false);
        TextInputLayout textInputLayout = (TextInputLayout) inflate.findViewById(C6372R.C6375id.mtrl_picker_text_input_date);
        EditText editText = textInputLayout.getEditText();
        if (ManufacturerUtils.isDateInputKeyboardMissingSeparatorCharacters()) {
            editText.setInputType(17);
        }
        SimpleDateFormat textInputFormat = UtcDates.getTextInputFormat();
        String textInputHint = UtcDates.getTextInputHint(inflate.getResources(), textInputFormat);
        textInputLayout.setPlaceholderText(textInputHint);
        Long l = this.selectedItem;
        if (l != null) {
            editText.setText(textInputFormat.format(l));
        }
        final OnSelectionChangedListener<Long> onSelectionChangedListener2 = onSelectionChangedListener;
        editText.addTextChangedListener(new DateFormatTextWatcher(textInputHint, textInputFormat, textInputLayout, calendarConstraints) {
            /* access modifiers changed from: package-private */
            public void onInvalidDate() {
                onSelectionChangedListener2.onIncompleteSelectionChanged();
            }

            /* access modifiers changed from: package-private */
            public void onValidDate(@Nullable Long l) {
                if (l == null) {
                    SingleDateSelector.this.clearSelection();
                } else {
                    SingleDateSelector.this.select(l.longValue());
                }
                onSelectionChangedListener2.onSelectionChanged(SingleDateSelector.this.getSelection());
            }
        });
        DateSelector.showKeyboardWithAutoHideBehavior(editText);
        return inflate;
    }

    public void select(long j) {
        this.selectedItem = Long.valueOf(j);
    }

    public void writeToParcel(@NonNull Parcel parcel, int i) {
        parcel.writeValue(this.selectedItem);
    }

    @Nullable
    public Long getSelection() {
        return this.selectedItem;
    }

    public void setSelection(@Nullable Long l) {
        this.selectedItem = l == null ? null : Long.valueOf(UtcDates.canonicalYearMonthDay(l.longValue()));
    }
}
