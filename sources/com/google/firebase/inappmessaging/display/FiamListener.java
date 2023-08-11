package com.google.firebase.inappmessaging.display;

import androidx.annotation.Keep;

@Keep
public interface FiamListener {
    void onFiamClick();

    void onFiamDismiss();

    void onFiamTrigger();
}
