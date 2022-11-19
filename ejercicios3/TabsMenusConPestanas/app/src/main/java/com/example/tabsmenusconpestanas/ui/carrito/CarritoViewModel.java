package com.example.tabsmenusconpestanas.ui.carrito;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class CarritoViewModel extends ViewModel {

    private final MutableLiveData<String> mText;

    public CarritoViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("Aquí se muestran los productos que se han añadido al carrito");
    }

    public LiveData<String> getText() {
        return mText;
    }
}