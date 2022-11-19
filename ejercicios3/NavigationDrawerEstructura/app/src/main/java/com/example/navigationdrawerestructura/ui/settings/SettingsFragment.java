package com.example.navigationdrawerestructura.ui.settings;

import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.navigationdrawerestructura.R;
import com.example.navigationdrawerestructura.databinding.FragmentSettingsBinding;
import com.example.navigationdrawerestructura.ui.slideshow.CarritoViewModel;

public class SettingsFragment extends Fragment {

    private @NonNull FragmentSettingsBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        SettingsViewModel slideshowViewModel =
                new ViewModelProvider(this).get(SettingsViewModel.class);

        binding = com.example.navigationdrawerestructura.databinding.FragmentSettingsBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        final TextView textView = binding.textSettings;
        slideshowViewModel.getText().observe(getViewLifecycleOwner(), textView::setText);
        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }

}