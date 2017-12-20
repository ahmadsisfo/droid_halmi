package com.sisfo.halmi;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.VideoView;

import com.bumptech.glide.Glide;

/**
 * Created by delaroy on 3/31/17.
 */
public class DetailActivity extends AppCompatActivity {
    ImageView imageView;
    WebChromeClient webChromeClient = new WebChromeClient();
    WebViewClient webViewClient = new WebViewClient();


    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        final Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        getSupportActionBar().setHomeButtonEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        imageView    = (ImageView) findViewById(R.id.backdrop);

        String name = getIntent().getExtras().getString("name");
        String numofsongs = getIntent().getExtras().getString("numOfSongs");

        String file = getIntent().getExtras().getString("file");

        int thumbnail = getIntent().getExtras().getInt("thumbnail", R.drawable.saraf);

        //NumberOfSong.setText(numofsongs);
        Glide.with(this)
                .load(thumbnail)
                .placeholder(R.drawable.load)
                .into(imageView);

        getSupportActionBar().setTitle(getIntent().getExtras().getString("name"));

        WebView webPage;

        webPage = (WebView) findViewById(R.id.webview);
        //webPage.setWebChromeClient(webChromeClient);
        //webPage.setWebViewClient(new MyWebViewClient());
        webPage.getSettings().setJavaScriptEnabled(true);
        //webPage.getSettings().setPluginsEnabled(true);
        webPage.getSettings().setPluginState(WebSettings.PluginState.ON);
        //webPage.getSettings().setLoadWithOverviewMode(true);
        //webPage.getSettings().setUseWideViewPort(true);


        webPage.setWebViewClient(new WebViewClient()
        {
            // Override URL
            @SuppressWarnings("deprecation")
            public boolean shouldOverrideUrlLoading(WebView view, String url)
            {
                String vidUrl = url.replace("file:///android_asset/","");
                Intent intent=new Intent(getApplicationContext(), VideoActivity.class);
                intent.putExtra("video", vidUrl);
                startActivity(intent);
                return true;
            }
        });

        webPage.loadUrl(file);


       /* mWebView.getSettings().setAllowContentAccess(true);
        WebSettings webSettings = mWebView.getSettings();
        webSettings.setJavaScriptEnabled(true);
        webSettings.setPluginState(WebSettings.PluginState.ON);
        //webSettings.setUseWideViewPort(true);
        //webSettings.setLoadWithOverviewMode(true);
        mWebView.canGoBack();
        mWebView.setWebChromeClient(new WebChromeClient() {});
        mWebView.loadUrl(file);*/
    }

    @Override
    public Intent getSupportParentActivityIntent() {
        this.finish();
        return null;
    }

    public class MyWebChromeClient extends WebChromeClient {

        @Override
        public void onShowCustomView(View view, CustomViewCallback callback) {
            // TODO Auto-generated method stub
            super.onShowCustomView(view, callback);
            if (view instanceof FrameLayout) {
                FrameLayout frame = (FrameLayout) view;
                if (frame.getFocusedChild() instanceof VideoView) {
                    VideoView video = (VideoView) frame.getFocusedChild();
                    frame.removeView(video);
                    video.start();
                }
            }

        }
    }

    public class MyWebViewClient extends WebViewClient {

        @Override
        public boolean shouldOverrideUrlLoading(WebView view, String url) {
            view.loadUrl(url);
            return true;
        }
    }
}
