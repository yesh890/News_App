package com.example.news.ui.window_bengali;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.news.R;
import com.example.news.WebViewController;

public class WindowBengaliFragment extends Fragment {

    private WindowBengaliViewModel windowBengaliViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        windowBengaliViewModel = new ViewModelProvider(this).get(WindowBengaliViewModel.class);
        View root = inflater.inflate(R.layout.fragment_window_bengali, container, false);
        WebView webView = root.findViewById(R.id.web_view_ABPAnada);
        webView.loadUrl("https://bengali.abplive.com/");
        webView.setWebViewClient(new WebViewController());
        return root;
    }
}
