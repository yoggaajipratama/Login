package com.future.login;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class Web extends AppCompatActivity {

    WebView web;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web);

        web = (WebView) findViewById(R.id.web);
        web.loadUrl("https://id.wikipedia.org/wiki/Kementerian_Dalam_Negeri_Republik_Indonesia");

        WebSettings webSettings = web.getSettings();
        webSettings.setJavaScriptEnabled(true);

        web.setWebViewClient(new WebViewClient());
    }
}
