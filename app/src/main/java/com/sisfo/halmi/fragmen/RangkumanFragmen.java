package com.sisfo.halmi.fragmen;

import android.app.ProgressDialog;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebSettings;
import android.webkit.WebView;

import com.sisfo.halmi.R;
import com.sisfo.halmi.adapter.AlbumsAdapter;
import com.sisfo.halmi.model.Album;

import java.util.ArrayList;
import java.util.List;


public class RangkumanFragmen extends Fragment {

    View view;

    public RangkumanFragmen() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.fragmen_rangkuman, container, false);
        WebView mWebView;
        mWebView = (WebView) view.findViewById(R.id.webview);

        WebSettings webSettings = mWebView.getSettings();
        webSettings.setJavaScriptEnabled(true);

        mWebView.loadUrl("file:///android_asset/rk.html");

        return view;
    }


}


