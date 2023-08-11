package com.google.firebase.inappmessaging.model;

import androidx.annotation.Keep;

@Keep
public enum MessageType {
    UNSUPPORTED,
    MODAL,
    IMAGE_ONLY,
    BANNER,
    CARD
}
