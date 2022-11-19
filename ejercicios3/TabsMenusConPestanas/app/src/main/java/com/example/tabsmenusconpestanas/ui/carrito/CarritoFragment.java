package com.example.tabsmenusconpestanas.ui.carrito;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.tabsmenusconpestanas.databinding.FragmentCarritoBinding;

public class CarritoFragment extends Fragment {

    private FragmentCarritoBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        CarritoViewModel notificationsViewModel =
                new ViewModelProvider(this).get(CarritoViewModel.class);

        binding = FragmentCarritoBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        final TextView textView = binding.textCarrito;
        notificationsViewModel.getText().observe(getViewLifecycleOwner(), textView::setText);
        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}