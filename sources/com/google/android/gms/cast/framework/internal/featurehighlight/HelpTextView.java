package com.google.android.gms.cast.framework.internal.featurehighlight;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import p120i4.C8146k;

@Keep
/* compiled from: com.google.android.gms:play-services-cast-framework@@21.2.0 */
public class HelpTextView extends LinearLayout {
    @VisibleForTesting
    TextView bodyTextView;
    @VisibleForTesting
    TextView headerTextView;

    @Keep
    public HelpTextView(@NonNull Context context, @NonNull AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    private void setTextAndVisibility(TextView textView, @Nullable CharSequence charSequence) {
        int i;
        textView.setText(charSequence);
        if (true != TextUtils.isEmpty(charSequence)) {
            i = 0;
        } else {
            i = 8;
        }
        textView.setVisibility(i);
    }

    /* access modifiers changed from: protected */
    public void onFinishInflate() {
        super.onFinishInflate();
        TextView textView = (TextView) findViewById(C8146k.cast_featurehighlight_help_text_header_view);
        textView.getClass();
        this.headerTextView = textView;
        TextView textView2 = (TextView) findViewById(C8146k.cast_featurehighlight_help_text_body_view);
        textView2.getClass();
        this.bodyTextView = textView2;
    }

    @Keep
    public void setText(@Nullable CharSequence charSequence, @Nullable CharSequence charSequence2) {
        setTextAndVisibility(this.headerTextView, charSequence);
        setTextAndVisibility(this.bodyTextView, charSequence2);
    }

    @NonNull
    @Keep
    public View asView() {
        return this;
    }
}
