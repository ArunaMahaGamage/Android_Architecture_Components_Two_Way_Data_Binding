package com.example.twowaydatabinding;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class UserViewModel extends ViewModel {
    public final MutableLiveData<User> userLiveData = new MutableLiveData<>();

    public final MutableLiveData<String> text = new MutableLiveData<>();
}
