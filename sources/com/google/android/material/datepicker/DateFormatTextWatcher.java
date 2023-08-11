package com.google.android.material.datepicker;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.material.C6372R;
import com.google.android.material.internal.TextWatcherAdapter;
import com.google.android.material.textfield.TextInputLayout;
import java.text.DateFormat;
import java.text.ParseException;
import java.util.Date;

abstract class DateFormatTextWatcher extends TextWatcherAdapter {
    private static final int VALIDATION_DELAY = 1000;
    private final CalendarConstraints constraints;
    private final DateFormat dateFormat;
    private final String outOfRange;
    private final Runnable setErrorCallback;
    private Runnable setRangeErrorCallback;
    @NonNull
    private final TextInputLayout textInputLayout;

    DateFormatTextWatcher(String str, DateFormat dateFormat2, @NonNull TextInputLayout textInputLayout2, CalendarConstraints calendarConstraints) {
        this.dateFormat = dateFormat2;
        this.textInputLayout = textInputLayout2;
        this.constraints = calendarConstraints;
        this.outOfRange = textInputLayout2.getContext().getString(C6372R.string.mtrl_picker_out_of_range);
        this.setErrorCallback = new C6482a(this, str);
    }

    private Runnable createRangeErrorCallback(long j) {
        return new C6483b(this, j);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void lambda$createRangeErrorCallback$1(long j) {
        String dateString = DateStrings.getDateString(j);
        this.textInputLayout.setError(String.format(this.outOfRange, new Object[]{sanitizeDateString(dateString)}));
        onInvalidDate();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void lambda$new$0(String str) {
        TextInputLayout textInputLayout2 = this.textInputLayout;
        DateFormat dateFormat2 = this.dateFormat;
        Context context = textInputLayout2.getContext();
        String string = context.getString(C6372R.string.mtrl_picker_invalid_format);
        String format = String.format(context.getString(C6372R.string.mtrl_picker_invalid_format_use), new Object[]{sanitizeDateString(str)});
        String format2 = String.format(context.getString(C6372R.string.mtrl_picker_invalid_format_example), new Object[]{sanitizeDateString(dateFormat2.format(new Date(UtcDates.getTodayCalendar().getTimeInMillis())))});
        textInputLayout2.setError(string + "\n" + format + "\n" + format2);
        onInvalidDate();
    }

    private String sanitizeDateString(String str) {
        return str.replace(' ', 160);
    }

    public void onTextChanged(@NonNull CharSequence charSequence, int i, int i2, int i3) {
        this.textInputLayout.removeCallbacks(this.setErrorCallback);
        this.textInputLayout.removeCallbacks(this.setRangeErrorCallback);
        this.textInputLayout.setError((CharSequence) null);
        onValidDate((Long) null);
        if (!TextUtils.isEmpty(charSequence)) {
            try {
                Date parse = this.dateFormat.parse(charSequence.toString());
                this.textInputLayout.setError((CharSequence) null);
                long time = parse.getTime();
                if (!this.constraints.getDateValidator().isValid(time) || !this.constraints.isWithinBounds(time)) {
                    Runnable createRangeErrorCallback = createRangeErrorCallback(time);
                    this.setRangeErrorCallback = createRangeErrorCallback;
                    runValidation(this.textInputLayout, createRangeErrorCallback);
                    return;
                }
                onValidDate(Long.valueOf(parse.getTime()));
            } catch (ParseException unused) {
                runValidation(this.textInputLayout, this.setErrorCallback);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public abstract void onValidDate(@Nullable Long l);

    public void runValidation(View view, Runnable runnable) {
        view.postDelayed(runnable, 1000);
    }

    /* access modifiers changed from: package-private */
    public void onInvalidDate() {
    }
}
