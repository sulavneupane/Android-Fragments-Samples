package com.nepalicoders.fragmenttypes;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.webkit.WebView;
import android.webkit.WebViewFragment;

/**
 * Created by Sulav on 8/19/17.
 */

public class MyWebFragment extends WebViewFragment {

    final String _html = "<html><body>" +
            "<h2>This is a Title</h2>" +
            "<p><strong>Hello</strong> <em>World</em></p>" +
            "</body></html>";

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        WebView webView = getWebView();
        webView.loadData(_html, "text/html", null);
    }

}
