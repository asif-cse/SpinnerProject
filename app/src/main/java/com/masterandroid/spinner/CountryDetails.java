package com.masterandroid.spinner;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;

public class CountryDetails extends AppCompatActivity {

    private WebView webView;
    private Bundle extra;
    private Context mContext;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_country_details);

        mContext = CountryDetails.this;

        webView = findViewById(R.id.simpleWebViewId);
        extra = getIntent().getExtras();


        if(!extra.equals(null)){
            String data = extra.getString("titles");
            String url = "file:///android_asset/"+data+".html";
            webView.loadUrl(url);

            WebSettings webSettings = webView.getSettings();
            webSettings.setBuiltInZoomControls(false);
            webSettings.setDisplayZoomControls(false);
            webSettings.setJavaScriptEnabled(true);
        }
    }
}
