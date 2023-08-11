package p358ib;

import android.app.DatePickerDialog;
import android.widget.DatePicker;
import com.poulpeo.p321ui.screens.review_merchant.ReviewMerchantAddActivity;
import java.util.Calendar;

/* renamed from: ib.d */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C12116d implements DatePickerDialog.OnDateSetListener {

    /* renamed from: a */
    public final /* synthetic */ Calendar f18970a;

    /* renamed from: b */
    public final /* synthetic */ ReviewMerchantAddActivity f18971b;

    public /* synthetic */ C12116d(Calendar calendar, ReviewMerchantAddActivity reviewMerchantAddActivity) {
        this.f18970a = calendar;
        this.f18971b = reviewMerchantAddActivity;
    }

    public final void onDateSet(DatePicker datePicker, int i, int i2, int i3) {
        ReviewMerchantAddActivity.m24742Y2(this.f18970a, this.f18971b, datePicker, i, i2, i3);
    }
}
