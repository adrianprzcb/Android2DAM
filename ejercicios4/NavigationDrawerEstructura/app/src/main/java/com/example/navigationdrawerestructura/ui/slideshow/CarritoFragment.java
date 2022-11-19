package com.example.navigationdrawerestructura.ui.slideshow;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.navigationdrawerestructura.databinding.FragmentCarritoBinding;

public class CarritoFragment extends Fragment {

    private FragmentCarritoBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        CarritoViewModel slideshowViewModel =
                new ViewModelProvider(this).get(CarritoViewModel.class);

        binding = FragmentCarritoBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        final TextView textView = binding.textCarrito;
        slideshowViewModel.getText().observe(getViewLifecycleOwner(), textView::setText);
        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}