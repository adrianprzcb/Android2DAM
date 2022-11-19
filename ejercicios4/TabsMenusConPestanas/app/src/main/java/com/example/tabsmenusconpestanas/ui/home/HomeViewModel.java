package com.example.tabsmenusconpestanas.ui.home;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class HomeViewModel extends ViewModel {

    private final MutableLiveData<String> mText;

    public HomeViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("bienvendido a la casa de las pizzas");
    }

    public LiveData<String> getText() {
        return mText;
    }
}